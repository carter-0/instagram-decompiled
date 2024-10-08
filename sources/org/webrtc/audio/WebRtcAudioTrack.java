package org.webrtc.audio;

import X.002;
import X.AnonymousClass7TF;
import X.C21055XCg;
import X.DbW;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

public class WebRtcAudioTrack {
    public static final int AUDIO_TRACK_START = 0;
    public static final int AUDIO_TRACK_STOP = 1;
    public static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    public static final int BITS_PER_SAMPLE = 16;
    public static final int BUFFERS_PER_SECOND = 100;
    public static final int CALLBACK_BUFFER_SIZE_MS = 10;
    public static final int DEFAULT_USAGE = 2;
    public static final String TAG = "WebRtcAudioTrackExternal";
    public final AudioAttributes audioAttributes;
    public final AudioManager audioManager;
    public AudioTrackThread audioThread;
    public AudioTrack audioTrack;
    public ByteBuffer byteBuffer;
    public final Context context;
    public byte[] emptyBytes;
    public final JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    public int initialBufferSizeInFrames;
    public long nativeAudioTrack;
    public volatile boolean speakerMute;
    public final JavaAudioDeviceModule.AudioTrackStateCallback stateCallback;
    public final ThreadUtils.ThreadChecker threadChecker;
    public boolean useLowLatency;
    public final VolumeLogger volumeLogger;

    public class AudioTrackThread extends Thread {
        public LowLatencyAudioBufferManager bufferManager = new LowLatencyAudioBufferManager();
        public volatile boolean keepAlive = true;

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            return audioTrack.write(byteBuffer, i, 0);
        }

        public AudioTrackThread(String str) {
            super(str);
        }

        public void run() {
            Process.setThreadPriority(-19);
            WebRtcAudioUtils.getThreadInfo();
            boolean z = Logging.loggingEnabled;
            WebRtcAudioTrack.assertTrue(AnonymousClass7TF.A1S(WebRtcAudioTrack.this.audioTrack.getPlayState(), 3));
            WebRtcAudioTrack.this.doAudioTrackStateCallback(0);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack.nativeGetPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, capacity);
                boolean z2 = false;
                if (capacity <= WebRtcAudioTrack.this.byteBuffer.remaining()) {
                    z2 = true;
                }
                WebRtcAudioTrack.assertTrue(z2);
                if (WebRtcAudioTrack.this.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                    webRtcAudioTrack.byteBuffer.put(webRtcAudioTrack.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                int write = webRtcAudioTrack2.audioTrack.write(webRtcAudioTrack2.byteBuffer, capacity, 0);
                if (write != capacity && write < 0) {
                    this.keepAlive = false;
                    WebRtcAudioTrack.this.reportWebRtcAudioTrackError(002.A0O("AudioTrack.write failed: ", write));
                }
                WebRtcAudioTrack webRtcAudioTrack3 = WebRtcAudioTrack.this;
                if (webRtcAudioTrack3.useLowLatency) {
                    this.bufferManager.maybeAdjustBufferSize(webRtcAudioTrack3.audioTrack);
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
        }

        public void stopThread() {
            boolean z = Logging.loggingEnabled;
            this.keepAlive = false;
        }
    }

    public WebRtcAudioTrack(Context context2, AudioManager audioManager2) {
        this(context2, audioManager2, (AudioAttributes) null, (JavaAudioDeviceModule.AudioTrackErrorCallback) null, (JavaAudioDeviceModule.AudioTrackStateCallback) null, false);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    public static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    public static void logNativeOutputSampleRate(int i) {
        AudioTrack.getNativeOutputSampleRate(0);
        boolean z = Logging.loggingEnabled;
    }

    public static native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer2);

    public static native void nativeGetPlayoutData(long j, int i);

    private int GetPlayoutUnderrunCount() {
        AudioTrack audioTrack2 = this.audioTrack;
        if (audioTrack2 != null) {
            return audioTrack2.getUnderrunCount();
        }
        return -1;
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3, AudioAttributes audioAttributes2) {
        boolean z = Logging.loggingEnabled;
        logNativeOutputSampleRate(i);
        return new AudioTrack(getAudioAttributes(audioAttributes2), C21055XCg.A02(i, i2), i3, 1, 0);
    }

    public static AudioTrack createAudioTrackOnOreoOrHigher(int i, int i2, int i3, AudioAttributes audioAttributes2) {
        boolean z = Logging.loggingEnabled;
        logNativeOutputSampleRate(i);
        return new AudioTrack.Builder().setAudioAttributes(getAudioAttributes(audioAttributes2)).setAudioFormat(C21055XCg.A02(i, i2)).setBufferSizeInBytes(i3).setPerformanceMode(1).setTransferMode(1).setSessionId(0).build();
    }

    /* access modifiers changed from: private */
    public void doAudioTrackStateCallback(int i) {
        boolean z = Logging.loggingEnabled;
        JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = this.stateCallback;
        if (audioTrackStateCallback == null) {
            return;
        }
        if (i == 0) {
            audioTrackStateCallback.onWebRtcAudioTrackStart();
        } else if (i == 1) {
            audioTrackStateCallback.onWebRtcAudioTrackStop();
        }
    }

    public static AudioAttributes getAudioAttributes(AudioAttributes audioAttributes2) {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(DEFAULT_USAGE).setContentType(1);
        if (audioAttributes2 != null) {
            if (audioAttributes2.getUsage() != 0) {
                contentType.setUsage(audioAttributes2.getUsage());
            }
            if (audioAttributes2.getContentType() != 0) {
                contentType.setContentType(audioAttributes2.getContentType());
            }
            contentType.setFlags(audioAttributes2.getFlags());
            if (Build.VERSION.SDK_INT >= 29) {
                contentType = applyAttributesOnQOrHigher(contentType, audioAttributes2);
            }
        }
        return contentType.build();
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        return this.audioManager.getStreamVolume(0);
    }

    private int initPlayout(int i, int i2, double d) {
        AudioTrack audioTrack2;
        String str;
        this.threadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
        this.byteBuffer = allocateDirect;
        this.emptyBytes = new byte[allocateDirect.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int i3 = 12;
        if (i2 == 1) {
            i3 = 4;
        }
        int minBufferSize = (int) (((double) AudioTrack.getMinBufferSize(i, i3, 2)) * d);
        if (minBufferSize < this.byteBuffer.capacity()) {
            str = "AudioTrack.getMinBufferSize returns an invalid value.";
        } else {
            if (d > 1.0d) {
                this.useLowLatency = false;
            }
            if (this.audioTrack != null) {
                str = "Conflict with existing AudioTrack.";
            } else {
                try {
                    if (this.useLowLatency) {
                        audioTrack2 = createAudioTrackOnOreoOrHigher(i, i3, minBufferSize, this.audioAttributes);
                        this.audioTrack = audioTrack2;
                    } else {
                        audioTrack2 = createAudioTrackOnLollipopOrHigher(i, i3, minBufferSize, this.audioAttributes);
                        this.audioTrack = audioTrack2;
                    }
                    if (audioTrack2 == null || audioTrack2.getState() != 1) {
                        reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                        releaseAudioResources();
                        return -1;
                    }
                    this.initialBufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
                    logMainParameters();
                    logMainParametersExtended();
                    return minBufferSize;
                } catch (IllegalArgumentException e) {
                    reportWebRtcAudioTrackInitError(e.getMessage());
                    releaseAudioResources();
                    return -1;
                }
            }
        }
        reportWebRtcAudioTrackInitError(str);
        return -1;
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        this.audioTrack.getBufferCapacityInFrames();
        boolean z = Logging.loggingEnabled;
    }

    private void logBufferSizeInFrames() {
        this.audioTrack.getBufferSizeInFrames();
        boolean z = Logging.loggingEnabled;
    }

    private void logMainParameters() {
        this.audioTrack.getAudioSessionId();
        this.audioTrack.getChannelCount();
        this.audioTrack.getSampleRate();
        AudioTrack.getMaxVolume();
        boolean z = Logging.loggingEnabled;
    }

    private void logUnderrunCount() {
        this.audioTrack.getUnderrunCount();
        boolean z = Logging.loggingEnabled;
    }

    private void releaseAudioResources() {
        boolean z = Logging.loggingEnabled;
        AudioTrack audioTrack2 = this.audioTrack;
        if (audioTrack2 != null) {
            audioTrack2.release();
            this.audioTrack = null;
        }
    }

    /* access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        if (this.audioManager.isVolumeFixed()) {
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.start();
        boolean z = Logging.loggingEnabled;
        assertTrue(AnonymousClass7TF.A1V(this.audioTrack));
        assertTrue(DbW.A1a(this.audioThread));
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, 002.A0O("AudioTrack.play failed - incorrect state :", this.audioTrack.getPlayState()));
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, AnonymousClass7TF.A0m("AudioTrack.play failed: ", e));
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.stop();
        boolean z = Logging.loggingEnabled;
        assertTrue(AnonymousClass7TF.A1V(this.audioThread));
        logUnderrunCount();
        this.audioThread.stopThread();
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000)) {
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        this.audioThread = null;
        AudioTrack audioTrack2 = this.audioTrack;
        if (audioTrack2 != null) {
            try {
                audioTrack2.stop();
                doAudioTrackStateCallback(1);
            } catch (IllegalStateException e) {
                e.getMessage();
            }
        }
        releaseAudioResources();
        return true;
    }

    public void setSpeakerMute(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        this.speakerMute = z;
    }

    public static AudioAttributes.Builder applyAttributesOnQOrHigher(AudioAttributes.Builder builder, AudioAttributes audioAttributes2) {
        return builder.setAllowedCapturePolicy(audioAttributes2.getAllowedCapturePolicy());
    }

    public static int getDefaultUsageAttribute() {
        return 2;
    }

    private int getInitialBufferSizeInFrames() {
        return this.initialBufferSizeInFrames;
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    public void setNativeAudioTrack(long j) {
        this.nativeAudioTrack = j;
    }

    public WebRtcAudioTrack(Context context2, AudioManager audioManager2, AudioAttributes audioAttributes2, JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, boolean z) {
        ThreadUtils.ThreadChecker threadChecker2 = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker2;
        threadChecker2.detachThread();
        this.context = context2;
        this.audioManager = audioManager2;
        this.audioAttributes = audioAttributes2;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        this.volumeLogger = new VolumeLogger(audioManager2);
        this.useLowLatency = z;
        WebRtcAudioUtils.getThreadInfo();
        boolean z2 = Logging.loggingEnabled;
    }
}
