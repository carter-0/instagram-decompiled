package org.webrtc.audio;

import X.002;
import X.AnonymousClass000;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.DbW;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

public class WebRtcAudioRecord {
    public static final int AUDIO_RECORD_START = 0;
    public static final int AUDIO_RECORD_STOP = 1;
    public static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    public static final int BUFFERS_PER_SECOND = 100;
    public static final int BUFFER_SIZE_FACTOR = 2;
    public static final int CALLBACK_BUFFER_SIZE_MS = 10;
    public static final int CHECK_REC_STATUS_DELAY_MS = 100;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    public static final String TAG = "WebRtcAudioRecordExternal";
    public final int audioFormat;
    public final AudioManager audioManager;
    public AudioRecord audioRecord;
    public final JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    public final int audioSource;
    public boolean audioSourceMatchesRecordingSession;
    public AudioRecordThread audioThread;
    public ByteBuffer byteBuffer;
    public final Context context;
    public final WebRtcAudioEffects effects;
    public byte[] emptyBytes;
    public final JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    public ScheduledExecutorService executor;
    public ScheduledFuture future;
    public final boolean isAcousticEchoCancelerSupported;
    public boolean isAudioConfigVerified;
    public final boolean isNoiseSuppressorSupported;
    public volatile boolean microphoneMute;
    public long nativeAudioRecord;
    public final JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;

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
            WebRtcAudioRecord.this.doAudioRecordStateCallback(0);
            System.nanoTime();
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            while (this.keepAlive) {
                WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                AudioRecord audioRecord = webRtcAudioRecord.audioRecord;
                ByteBuffer byteBuffer = webRtcAudioRecord.byteBuffer;
                int read = audioRecord.read(byteBuffer, byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.this.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord webRtcAudioRecord2 = WebRtcAudioRecord.this;
                        webRtcAudioRecord2.byteBuffer.put(webRtcAudioRecord2.emptyBytes);
                    }
                    if (this.keepAlive) {
                        long j = 0;
                        if (WebRtcAudioRecord.this.audioRecord.getTimestamp(audioTimestamp, 0) == 0) {
                            j = audioTimestamp.nanoTime;
                        }
                        WebRtcAudioRecord webRtcAudioRecord3 = WebRtcAudioRecord.this;
                        webRtcAudioRecord3.nativeDataIsRecorded(webRtcAudioRecord3.nativeAudioRecord, read, j);
                    }
                    WebRtcAudioRecord webRtcAudioRecord4 = WebRtcAudioRecord.this;
                    if (webRtcAudioRecord4.audioSamplesReadyCallback != null) {
                        byte[] copyOfRange = Arrays.copyOfRange(webRtcAudioRecord4.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.capacity() + WebRtcAudioRecord.this.byteBuffer.arrayOffset());
                        WebRtcAudioRecord webRtcAudioRecord5 = WebRtcAudioRecord.this;
                        webRtcAudioRecord5.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(webRtcAudioRecord5.audioRecord.getAudioFormat(), WebRtcAudioRecord.this.audioRecord.getChannelCount(), WebRtcAudioRecord.this.audioRecord.getSampleRate(), copyOfRange));
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
                    WebRtcAudioRecord.this.doAudioRecordStateCallback(1);
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

    public static String audioStateToString(int i) {
        return i != 0 ? i != 1 ? "INVALID" : "STOP" : "START";
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    public static int getBytesPerSample(int i) {
        int i2 = 1;
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    if (i != 13) {
                        throw DbW.A0a(AnonymousClass000.A00(2111), i);
                    }
                }
            }
            return i2;
        }
        return 2;
    }

    private int logRecordingConfigurations(boolean z) {
        int i = 0;
        if (this.audioRecord != null) {
            List<AudioRecordingConfiguration> activeRecordingConfigurations = this.audioManager.getActiveRecordingConfigurations();
            i = activeRecordingConfigurations.size();
            boolean z2 = Logging.loggingEnabled;
            if (i > 0) {
                logActiveRecordingConfigs(this.audioRecord.getAudioSessionId(), activeRecordingConfigurations);
                if (z) {
                    this.audioSourceMatchesRecordingSession = verifyAudioConfig(this.audioRecord.getAudioSource(), this.audioRecord.getAudioSessionId(), this.audioRecord.getFormat(), this.audioRecord.getRoutedDevice(), activeRecordingConfigurations);
                    this.isAudioConfigVerified = true;
                }
            }
        }
        return i;
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer2);

    /* access modifiers changed from: private */
    public native void nativeDataIsRecorded(long j, int i, long j2);

    /* renamed from: lambda$scheduleLogRecordingConfigurationsTask$0$org-webrtc-audio-WebRtcAudioRecord  reason: not valid java name */
    public /* synthetic */ String m63lambda$scheduleLogRecordingConfigurationsTask$0$orgwebrtcaudioWebRtcAudioRecord() {
        logRecordingConfigurations(true);
        return "Scheduled task is done";
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static AudioRecord createAudioRecordOnLowerThanM(int i, int i2, int i3, int i4, int i5) {
        boolean z = Logging.loggingEnabled;
        return new AudioRecord(i, i2, i3, i4, i5);
    }

    public static AudioRecord createAudioRecordOnMOrHigher(int i, int i2, int i3, int i4, int i5) {
        boolean z = Logging.loggingEnabled;
        return new AudioRecord.Builder().setAudioSource(i).setAudioFormat(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i2).setChannelMask(i3).build()).setBufferSizeInBytes(i5).build();
    }

    /* access modifiers changed from: private */
    public void doAudioRecordStateCallback(int i) {
        boolean z = Logging.loggingEnabled;
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback == null) {
            return;
        }
        if (i == 0) {
            audioRecordStateCallback.onWebRtcAudioRecordStart();
        } else if (i == 1) {
            audioRecordStateCallback.onWebRtcAudioRecordStop();
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        return this.effects.setAEC(z);
    }

    private boolean enableBuiltInNS(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        return this.effects.setNS(z);
    }

    private int initRecording(int i, int i2) {
        String A0O;
        String str;
        boolean z = Logging.loggingEnabled;
        if (this.audioRecord != null) {
            A0O = "InitRecording called twice without StopRecording.";
        } else {
            int i3 = i / 100;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(getBytesPerSample(this.audioFormat) * i2 * i3);
            this.byteBuffer = allocateDirect;
            if (!allocateDirect.hasArray()) {
                A0O = "ByteBuffer does not have backing array.";
            } else {
                this.emptyBytes = new byte[this.byteBuffer.capacity()];
                nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
                int i4 = 12;
                if (i2 == 1) {
                    i4 = 16;
                }
                int minBufferSize = AudioRecord.getMinBufferSize(i, i4, this.audioFormat);
                if (minBufferSize == -1 || minBufferSize == -2) {
                    A0O = 002.A0O("AudioRecord.getMinBufferSize failed: ", minBufferSize);
                } else {
                    try {
                        AudioRecord createAudioRecordOnMOrHigher = createAudioRecordOnMOrHigher(this.audioSource, i, i4, this.audioFormat, Math.max(minBufferSize * 2, this.byteBuffer.capacity()));
                        this.audioRecord = createAudioRecordOnMOrHigher;
                        if (createAudioRecordOnMOrHigher == null || createAudioRecordOnMOrHigher.getState() != 1) {
                            str = "Creation or initialization of audio recorder failed.";
                            reportWebRtcAudioRecordInitError(str);
                            releaseAudioResources();
                            return -1;
                        }
                        this.effects.enable(this.audioRecord.getAudioSessionId());
                        logMainParameters();
                        logMainParametersExtended();
                        logRecordingConfigurations(false);
                        return i3;
                    } catch (IllegalArgumentException | UnsupportedOperationException e) {
                        str = AnonymousClass7TF.A0m("AudioRecord build error: ", e);
                    }
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
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private void scheduleLogRecordingConfigurationsTask() {
        boolean z = Logging.loggingEnabled;
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        this.executor = Executors.newSingleThreadScheduledExecutor();
        WebRtcAudioRecord$$ExternalSyntheticLambda0 webRtcAudioRecord$$ExternalSyntheticLambda0 = new WebRtcAudioRecord$$ExternalSyntheticLambda0(this);
        ScheduledFuture scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(webRtcAudioRecord$$ExternalSyntheticLambda0, 100, TimeUnit.MILLISECONDS);
    }

    private boolean startRecording() {
        boolean z = Logging.loggingEnabled;
        assertTrue(AnonymousClass7TF.A1V(this.audioRecord));
        assertTrue(DbW.A1a(this.audioThread));
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, 002.A0O("AudioRecord.startRecording failed - incorrect state: ", this.audioRecord.getRecordingState()));
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            scheduleLogRecordingConfigurationsTask();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, AnonymousClass7TF.A0m("AudioRecord.startRecording failed: ", e));
            return false;
        }
    }

    private boolean stopRecording() {
        boolean z = Logging.loggingEnabled;
        assertTrue(AnonymousClass7TF.A1V(this.audioThread));
        ScheduledFuture scheduledFuture = this.future;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.future.cancel(true);
            }
            this.future = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.executor = null;
        }
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000)) {
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        this.audioThread = null;
        this.effects.release();
        releaseAudioResources();
        return true;
    }

    public boolean isAudioSourceMatchingRecordingSession() {
        if (this.isAudioConfigVerified) {
            return this.audioSourceMatchesRecordingSession;
        }
        boolean z = Logging.loggingEnabled;
        return false;
    }

    public void setMicrophoneMute(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        this.microphoneMute = z;
    }

    public WebRtcAudioRecord(Context context2, AudioManager audioManager2, int i, int i2, JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, boolean z, boolean z2) {
        this.effects = new WebRtcAudioEffects();
        if (z && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw AnonymousClass7TE.A0w("HW AEC not supported");
        } else if (!z2 || WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            this.context = context2;
            this.audioManager = audioManager2;
            this.audioSource = i;
            this.audioFormat = i2;
            this.errorCallback = audioRecordErrorCallback;
            this.stateCallback = audioRecordStateCallback;
            this.audioSamplesReadyCallback = samplesReadyCallback;
            this.isAcousticEchoCancelerSupported = z;
            this.isNoiseSuppressorSupported = z2;
            WebRtcAudioUtils.getThreadInfo();
            boolean z3 = Logging.loggingEnabled;
        } else {
            throw AnonymousClass7TE.A0w("HW NS not supported");
        }
    }

    public static boolean checkDeviceMatch(AudioDeviceInfo audioDeviceInfo, AudioDeviceInfo audioDeviceInfo2) {
        if (audioDeviceInfo.getId() == audioDeviceInfo2.getId() && audioDeviceInfo.getType() == audioDeviceInfo2.getType()) {
            return true;
        }
        return false;
    }

    public static boolean logActiveRecordingConfigs(int i, List list) {
        assertTrue(!list.isEmpty());
        Iterator it = list.iterator();
        while (true) {
            boolean z = Logging.loggingEnabled;
            if (!it.hasNext()) {
                return true;
            }
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            audioRecordingConfiguration.getClientAudioSource();
            audioRecordingConfiguration.getClientAudioSessionId();
            AudioFormat format = audioRecordingConfiguration.getFormat();
            format.getChannelCount();
            format.getChannelIndexMask();
            format.getChannelMask();
            format.getEncoding();
            format.getSampleRate();
            AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
            clientFormat.getChannelCount();
            clientFormat.getChannelIndexMask();
            clientFormat.getChannelMask();
            clientFormat.getEncoding();
            clientFormat.getSampleRate();
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null) {
                assertTrue(audioDevice.isSource());
                audioDevice.getType();
                audioDevice.getId();
            }
        }
    }

    public static boolean verifyAudioConfig(int i, int i2, AudioFormat audioFormat2, AudioDeviceInfo audioDeviceInfo, List list) {
        assertTrue(!list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null && audioRecordingConfiguration.getClientAudioSource() == i && audioRecordingConfiguration.getClientAudioSessionId() == i2 && audioRecordingConfiguration.getClientFormat().getEncoding() == audioFormat2.getEncoding() && audioRecordingConfiguration.getClientFormat().getSampleRate() == audioFormat2.getSampleRate() && audioRecordingConfiguration.getClientFormat().getChannelMask() == audioFormat2.getChannelMask() && audioRecordingConfiguration.getClientFormat().getChannelIndexMask() == audioFormat2.getChannelIndexMask() && audioRecordingConfiguration.getFormat().getEncoding() != 0 && audioRecordingConfiguration.getFormat().getSampleRate() > 0) {
                if (!(audioRecordingConfiguration.getFormat().getChannelMask() == 0 && audioRecordingConfiguration.getFormat().getChannelIndexMask() == 0) && checkDeviceMatch(audioDevice, audioDeviceInfo)) {
                    boolean z = Logging.loggingEnabled;
                    return true;
                }
            }
        }
        boolean z2 = Logging.loggingEnabled;
        return false;
    }

    public boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    public boolean isAudioConfigVerified() {
        return this.isAudioConfigVerified;
    }

    public boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    public void setNativeAudioRecord(long j) {
        this.nativeAudioRecord = j;
    }

    public WebRtcAudioRecord(Context context2, AudioManager audioManager2) {
        this(context2, audioManager2, 7, 2, (JavaAudioDeviceModule.AudioRecordErrorCallback) null, (JavaAudioDeviceModule.AudioRecordStateCallback) null, (JavaAudioDeviceModule.SamplesReadyCallback) null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported());
    }
}
