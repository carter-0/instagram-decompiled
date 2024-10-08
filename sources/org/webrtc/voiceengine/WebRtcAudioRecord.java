package org.webrtc.voiceengine;

import X.002;
import X.AnonymousClass7TF;
import X.DbW;
import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;

public class WebRtcAudioRecord {
    public static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    public static final int BITS_PER_SAMPLE = 16;
    public static final int BUFFERS_PER_SECOND = 100;
    public static final int BUFFER_SIZE_FACTOR = 2;
    public static final int CALLBACK_BUFFER_SIZE_MS = 10;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    public static final String TAG = "WebRtcAudioRecord";
    public static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    public static int audioSource = 7;
    public static WebRtcAudioRecordErrorCallback errorCallback;
    public static volatile boolean microphoneMute;
    public AudioRecord audioRecord;
    public AudioRecordThread audioThread;
    public ByteBuffer byteBuffer;
    public WebRtcAudioEffects effects = new WebRtcAudioEffects();
    public byte[] emptyBytes;
    public final long nativeAudioRecord;

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public class AudioRecordThread extends Thread {
        public volatile boolean keepAlive = true;

        public AudioRecordThread(String str) {
            super(str);
        }

        public void run() {
            Process.setThreadPriority(-19);
            WebRtcAudioUtils.getThreadInfo();
            boolean z = Logging.loggingEnabled;
            WebRtcAudioRecord.assertTrue(AnonymousClass7TF.A1S(WebRtcAudioRecord.this.audioRecord.getRecordingState(), 3));
            System.nanoTime();
            while (this.keepAlive) {
                WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                AudioRecord audioRecord = webRtcAudioRecord.audioRecord;
                ByteBuffer byteBuffer = webRtcAudioRecord.byteBuffer;
                int read = audioRecord.read(byteBuffer, byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord webRtcAudioRecord2 = WebRtcAudioRecord.this;
                        webRtcAudioRecord2.byteBuffer.put(webRtcAudioRecord2.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord3 = WebRtcAudioRecord.this;
                        webRtcAudioRecord3.nativeDataIsRecorded(read, webRtcAudioRecord3.nativeAudioRecord);
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    String A0O = 002.A0O("AudioRecord.read failed: ", read);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(A0O);
                    }
                }
            }
            try {
                AudioRecord audioRecord2 = WebRtcAudioRecord.this.audioRecord;
                if (audioRecord2 != null) {
                    audioRecord2.stop();
                }
            } catch (IllegalStateException e) {
                e.getMessage();
            }
        }

        public void stopThread() {
            boolean z = Logging.loggingEnabled;
            this.keepAlive = false;
        }
    }

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    public static int getDefaultAudioSource() {
        return 7;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer2, long j);

    /* access modifiers changed from: private */
    public native void nativeDataIsRecorded(int i, long j);

    private native void nativeReportWebRtcAudioRecordError(String str, long j);

    private native void nativeReportWebRtcAudioRecordInitError(String str, long j);

    private native void nativeReportWebRtcAudioRecordStartError(String str, String str2, long j);

    public class AudioSamples {
        public final int audioFormat;
        public final int channelCount;
        public final byte[] data;
        public final int sampleRate;

        public AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            return false;
        }
        return webRtcAudioEffects.setAEC(z);
    }

    private boolean enableBuiltInNS(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            return false;
        }
        return webRtcAudioEffects.setNS(z);
    }

    private int getAudioSessionId() {
        return this.audioRecord.getAudioSessionId();
    }

    private int initRecording(int i, int i2) {
        String A0O;
        boolean z = Logging.loggingEnabled;
        if (this.audioRecord != null) {
            A0O = "InitRecording called twice without StopRecording.";
        } else {
            int i3 = i;
            int i4 = i / 100;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * 2 * i4);
            this.byteBuffer = allocateDirect;
            this.emptyBytes = new byte[allocateDirect.capacity()];
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
            int i5 = 12;
            if (i2 == 1) {
                i5 = 16;
            }
            int minBufferSize = AudioRecord.getMinBufferSize(i, i5, 2);
            if (minBufferSize == -1 || minBufferSize == -2) {
                A0O = 002.A0O("AudioRecord.getMinBufferSize failed: ", minBufferSize);
            } else {
                try {
                    AudioRecord audioRecord2 = new AudioRecord(audioSource, i3, i5, 2, Math.max(minBufferSize * 2, this.byteBuffer.capacity()));
                    this.audioRecord = audioRecord2;
                    if (audioRecord2.getState() != 1) {
                        reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                        releaseAudioResources();
                        return -1;
                    }
                    WebRtcAudioEffects webRtcAudioEffects = this.effects;
                    if (webRtcAudioEffects != null) {
                        webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId(), true);
                    }
                    logMainParameters();
                    logMainParametersExtended();
                    return i4;
                } catch (IllegalArgumentException e) {
                    reportWebRtcAudioRecordInitError(AnonymousClass7TF.A0m("AudioRecord ctor error: ", e));
                    releaseAudioResources();
                    return -1;
                }
            }
        }
        reportWebRtcAudioRecordInitError(A0O);
        return -1;
    }

    private void logMainParameters() {
        this.audioRecord.getAudioSessionId();
        this.audioRecord.getChannelCount();
        this.audioRecord.getSampleRate();
        boolean z = Logging.loggingEnabled;
    }

    private void logMainParametersExtended() {
        this.audioRecord.getBufferSizeInFrames();
        boolean z = Logging.loggingEnabled;
    }

    private void releaseAudioResources() {
        boolean z = Logging.loggingEnabled;
        AudioRecord audioRecord2 = this.audioRecord;
        if (audioRecord2 != null) {
            audioRecord2.release();
            this.audioRecord = null;
        }
    }

    /* access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioRecordError(002.A0R("Run-time recording error: ", str), this.nativeAudioRecord);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioRecordInitError(002.A0R("Init recording error: ", str), this.nativeAudioRecord);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioRecordStartError(audioRecordStartErrorCode.toString(), 002.A0R("Start recording error: ", str), this.nativeAudioRecord);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public static synchronized void setAudioSource(int i) {
        synchronized (WebRtcAudioRecord.class) {
            boolean z = Logging.loggingEnabled;
            audioSource = i;
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        boolean z = Logging.loggingEnabled;
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        microphoneMute = z;
    }

    private boolean startRecording() {
        boolean z = Logging.loggingEnabled;
        assertTrue(AnonymousClass7TF.A1V(this.audioRecord));
        assertTrue(DbW.A1a(this.audioThread));
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, 002.A0O("AudioRecord.startRecording failed - incorrect state :", this.audioRecord.getRecordingState()));
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, AnonymousClass7TF.A0m("AudioRecord.startRecording failed: ", e));
            return false;
        }
    }

    private boolean stopRecording() {
        boolean z = Logging.loggingEnabled;
        AudioRecordThread audioRecordThread = this.audioThread;
        if (audioRecordThread != null) {
            audioRecordThread.stopThread();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000)) {
                WebRtcAudioUtils.logAudioState(TAG);
            }
            this.audioThread = null;
        }
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }

    public WebRtcAudioRecord(long j) {
        WebRtcAudioUtils.getThreadInfo();
        boolean z = Logging.loggingEnabled;
        this.nativeAudioRecord = j;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }
}
