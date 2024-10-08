package org.webrtc.voiceengine;

import X.AnonymousClass000;
import X.AnonymousClass7TF;
import X.Pxd;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;

public class WebRtcAudioManager {
    public static final int BITS_PER_SAMPLE = 16;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_FRAME_PER_BUFFER = 256;
    public static final String TAG = "WebRtcAudioManager";
    public static final boolean blacklistDeviceForAAudioUsage = true;
    public static boolean blacklistDeviceForOpenSLESUsage;
    public static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    public static boolean useStereoInput;
    public static boolean useStereoOutput;
    public boolean aAudio;
    public final AudioManager audioManager;
    public boolean hardwareAEC;
    public boolean hardwareAGC;
    public boolean hardwareDP;
    public boolean hardwareEQ;
    public boolean hardwareLE;
    public boolean hardwareNS;
    public boolean initialized;
    public int inputBufferSize;
    public int inputChannels;
    public boolean lowLatencyInput;
    public boolean lowLatencyOutput;
    public final long nativeAudioManager;
    public int nativeChannels;
    public int nativeSampleRate;
    public int outputBufferSize;
    public int outputChannels;
    public boolean proAudio;
    public int sampleRate;
    public final VolumeLogger volumeLogger;

    public class VolumeLogger {
        public static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
        public static final int TIMER_PERIOD_IN_SECONDS = 30;
        public final AudioManager audioManager;
        public Timer timer;

        public class LogVolumeTask extends TimerTask {
            public final int maxRingVolume;
            public final int maxVoiceCallVolume;

            public LogVolumeTask(int i, int i2) {
                this.maxRingVolume = i;
                this.maxVoiceCallVolume = i2;
            }

            public void run() {
                AudioManager audioManager;
                int i;
                int mode = VolumeLogger.this.audioManager.getMode();
                if (mode == 1) {
                    audioManager = VolumeLogger.this.audioManager;
                    i = 2;
                } else if (mode == 3) {
                    audioManager = VolumeLogger.this.audioManager;
                    i = 0;
                } else {
                    return;
                }
                audioManager.getStreamVolume(i);
                boolean z = Logging.loggingEnabled;
            }
        }

        /* access modifiers changed from: private */
        public void stop() {
            Timer timer2 = this.timer;
            if (timer2 != null) {
                timer2.cancel();
                this.timer = null;
            }
        }

        public void start() {
            Timer timer2 = new Timer("WebRtcVolumeLevelLoggerThread");
            this.timer = timer2;
            timer2.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0, 30000);
        }

        public VolumeLogger(AudioManager audioManager2) {
            this.audioManager = audioManager2;
        }
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i4, int i5, long j);

    public WebRtcAudioManager(long j) {
        WebRtcAudioUtils.getThreadInfo();
        boolean z = Logging.loggingEnabled;
        long j2 = j;
        this.nativeAudioManager = j2;
        AudioManager audioManager2 = (AudioManager) ContextUtils.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.audioManager = audioManager2;
        this.volumeLogger = new VolumeLogger(audioManager2);
        storeAudioParameters();
        int i = this.sampleRate;
        int i2 = this.outputChannels;
        int i3 = this.inputChannels;
        boolean z2 = this.hardwareAEC;
        boolean z3 = this.hardwareAGC;
        boolean z4 = this.hardwareNS;
        boolean z5 = this.hardwareEQ;
        boolean z6 = this.hardwareLE;
        boolean z7 = this.hardwareDP;
        boolean z8 = this.lowLatencyOutput;
        boolean z9 = this.lowLatencyInput;
        boolean z10 = this.proAudio;
        boolean z11 = z8;
        boolean z12 = z9;
        boolean z13 = z10;
        boolean z14 = z5;
        boolean z15 = z6;
        boolean z16 = z7;
        boolean z17 = z2;
        boolean z18 = z3;
        boolean z19 = z4;
        int i4 = i2;
        int i5 = i3;
        nativeCacheAudioParameters(i, i4, i5, z17, z18, z19, z14, z15, z16, z11, z12, z13, this.aAudio, this.outputBufferSize, this.inputBufferSize, j2);
        WebRtcAudioUtils.logAudioState(TAG);
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void enableCommunicationMode() {
        this.audioManager.setMode(3);
    }

    public static int getMinInputFrameSize(int i, int i2) {
        int i3 = i2 * 2;
        int i4 = 12;
        if (i2 == 1) {
            i4 = 16;
        }
        return AudioRecord.getMinBufferSize(i, i4, 2) / i3;
    }

    public static int getMinOutputFrameSize(int i, int i2) {
        int i3 = i2 * 2;
        int i4 = 12;
        if (i2 == 1) {
            i4 = 4;
        }
        return AudioTrack.getMinBufferSize(i, i4, 2) / i3;
    }

    private int getSampleRateForApiLevel() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        return Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoInput;
        }
        return z;
    }

    public static synchronized boolean getStereoOutput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoOutput;
        }
        return z;
    }

    private boolean hasEarpiece() {
        return ContextUtils.applicationContext.getPackageManager().hasSystemFeature(Pxd.A00(630));
    }

    private boolean isAAudioSupported() {
        boolean z = Logging.loggingEnabled;
        return false;
    }

    private boolean isCommunicationModeEnabled() {
        return AnonymousClass7TF.A1S(this.audioManager.getMode(), 3);
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean deviceIsBlacklistedForOpenSLESUsage;
        if (blacklistDeviceForOpenSLESUsageIsOverridden) {
            deviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsage;
        } else {
            deviceIsBlacklistedForOpenSLESUsage = WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        }
        if (deviceIsBlacklistedForOpenSLESUsage) {
            boolean z = Logging.loggingEnabled;
        }
        return deviceIsBlacklistedForOpenSLESUsage;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.applicationContext.getPackageManager().hasSystemFeature(AnonymousClass000.A00(1085));
    }

    private boolean isProAudioSupported() {
        return AnonymousClass7TF.A1P(ContextUtils.applicationContext.getPackageManager().hasSystemFeature(AnonymousClass000.A00(2599)) ? 1 : 0);
    }

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            blacklistDeviceForOpenSLESUsageIsOverridden = true;
            blacklistDeviceForOpenSLESUsage = z;
        }
    }

    public static synchronized void setStereoInput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            boolean z2 = Logging.loggingEnabled;
            useStereoInput = z;
        }
    }

    public static synchronized void setStereoOutput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            boolean z2 = Logging.loggingEnabled;
            useStereoOutput = z;
        }
    }

    private void dispose() {
        WebRtcAudioUtils.getThreadInfo();
        boolean z = Logging.loggingEnabled;
        if (this.initialized) {
            this.volumeLogger.stop();
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(AnonymousClass7TF.A1P(isLowLatencyOutputSupported() ? 1 : 0));
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property != null) {
            return Integer.parseInt(property);
        }
        return 256;
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            boolean z = Logging.loggingEnabled;
            return CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
        } else if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            WebRtcAudioUtils.getDefaultSampleRateHz();
            boolean z2 = Logging.loggingEnabled;
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        } else {
            int sampleRateForApiLevel = getSampleRateForApiLevel();
            boolean z3 = Logging.loggingEnabled;
            return sampleRateForApiLevel;
        }
    }

    private boolean init() {
        WebRtcAudioUtils.getThreadInfo();
        boolean z = Logging.loggingEnabled;
        if (!this.initialized) {
            this.audioManager.getMode();
            this.initialized = true;
            this.volumeLogger.start();
        }
        return true;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isDynamicsProcessingSupported() {
        WebRtcAudioEffects.canUseDynamicsProcessing();
        boolean z = Logging.loggingEnabled;
        return WebRtcAudioEffects.canUseDynamicsProcessing();
    }

    public static boolean isEqualizerSupported() {
        WebRtcAudioEffects.canUseEqualizer();
        boolean z = Logging.loggingEnabled;
        return WebRtcAudioEffects.canUseEqualizer();
    }

    public static boolean isLoudnessEnhancerSupported() {
        WebRtcAudioEffects.canUseLoudnessEnhancer();
        boolean z = Logging.loggingEnabled;
        return WebRtcAudioEffects.canUseLoudnessEnhancer();
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private void storeAudioParameters() {
        int minOutputFrameSize;
        int minInputFrameSize;
        int i = 2;
        int i2 = 1;
        if (getStereoOutput()) {
            i2 = 2;
        }
        this.outputChannels = i2;
        if (!getStereoInput()) {
            i = 1;
        }
        this.inputChannels = i;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = WebRtcAudioEffects.canUseAcousticEchoCanceler();
        this.hardwareAGC = false;
        this.hardwareNS = WebRtcAudioEffects.canUseNoiseSuppressor();
        this.hardwareEQ = isEqualizerSupported();
        this.hardwareLE = isLoudnessEnhancerSupported();
        this.hardwareDP = isDynamicsProcessingSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = AnonymousClass7TF.A1P(isLowLatencyOutputSupported() ? 1 : 0);
        this.proAudio = isProAudioSupported();
        boolean z = Logging.loggingEnabled;
        this.aAudio = false;
        if (this.lowLatencyOutput) {
            minOutputFrameSize = getLowLatencyOutputFramesPerBuffer();
        } else {
            minOutputFrameSize = getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        }
        this.outputBufferSize = minOutputFrameSize;
        if (this.lowLatencyInput) {
            minInputFrameSize = getLowLatencyInputFramesPerBuffer();
        } else {
            minInputFrameSize = getMinInputFrameSize(this.sampleRate, this.inputChannels);
        }
        this.inputBufferSize = minInputFrameSize;
    }

    public boolean isLowLatencyInputSupported() {
        return AnonymousClass7TF.A1P(isLowLatencyOutputSupported() ? 1 : 0);
    }
}
