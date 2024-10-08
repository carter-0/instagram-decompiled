package org.webrtc.audio;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import java.util.UUID;
import org.webrtc.Logging;

public class WebRtcAudioEffects {
    public static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    public static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    public static final boolean DEBUG = false;
    public static final String TAG = "WebRtcAudioEffectsExternal";
    public static AudioEffect.Descriptor[] cachedEffects;
    public AcousticEchoCanceler aec;
    public NoiseSuppressor ns;
    public boolean shouldEnableAec;
    public boolean shouldEnableNs;

    private boolean effectTypeIsVoIP(UUID uuid) {
        return (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported());
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (isAcousticEchoCancelerSupported() == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void enable(int r4) {
        /*
            r3 = this;
            boolean r0 = org.webrtc.Logging.loggingEnabled
            android.media.audiofx.AcousticEchoCanceler r0 = r3.aec
            r2 = 1
            boolean r0 = X.DbW.A1a(r0)
            assertTrue(r0)
            android.media.audiofx.NoiseSuppressor r0 = r3.ns
            boolean r0 = X.DbW.A1a(r0)
            assertTrue(r0)
            boolean r0 = isAcousticEchoCancelerSupported()
            if (r0 == 0) goto L_0x003c
            android.media.audiofx.AcousticEchoCanceler r0 = android.media.audiofx.AcousticEchoCanceler.create(r4)
            r3.aec = r0
            if (r0 == 0) goto L_0x003c
            r0.getEnabled()
            boolean r0 = r3.shouldEnableAec
            if (r0 == 0) goto L_0x0031
            boolean r0 = isAcousticEchoCancelerSupported()
            r1 = 1
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            android.media.audiofx.AcousticEchoCanceler r0 = r3.aec
            r0.setEnabled(r1)
            android.media.audiofx.AcousticEchoCanceler r0 = r3.aec
            r0.getEnabled()
        L_0x003c:
            boolean r0 = isNoiseSuppressorSupported()
            if (r0 == 0) goto L_0x0061
            android.media.audiofx.NoiseSuppressor r0 = android.media.audiofx.NoiseSuppressor.create(r4)
            r3.ns = r0
            if (r0 == 0) goto L_0x0061
            r0.getEnabled()
            boolean r0 = r3.shouldEnableNs
            if (r0 == 0) goto L_0x0062
            boolean r0 = isNoiseSuppressorSupported()
            if (r0 == 0) goto L_0x0062
        L_0x0057:
            android.media.audiofx.NoiseSuppressor r0 = r3.ns
            r0.setEnabled(r2)
            android.media.audiofx.NoiseSuppressor r0 = r3.ns
            r0.getEnabled()
        L_0x0061:
            return
        L_0x0062:
            r2 = 0
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.audio.WebRtcAudioEffects.enable(int):void");
    }

    public void release() {
        boolean z = Logging.loggingEnabled;
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
    }

    public boolean setAEC(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        if (!isAcousticEchoCancelerSupported()) {
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec != null && z != this.shouldEnableAec) {
            return false;
        } else {
            this.shouldEnableAec = z;
            return true;
        }
    }

    public boolean setNS(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        if (!isNoiseSuppressorSupported()) {
            this.shouldEnableNs = false;
            return false;
        } else if (this.ns != null && z != this.shouldEnableNs) {
            return false;
        } else {
            this.shouldEnableNs = z;
            return true;
        }
    }

    public WebRtcAudioEffects() {
        WebRtcAudioUtils.getThreadInfo();
        boolean z = Logging.loggingEnabled;
    }

    public static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return !descriptor.uuid.equals(uuid2);
            }
        }
        return false;
    }
}
