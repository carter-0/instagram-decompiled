package org.webrtc.voiceengine;

import android.media.audiofx.LoudnessEnhancer;
import org.webrtc.Logging;

public class MetaAudioLoudnessEnhancerEffect {
    public static final String TAG = "MetaAudioLoudnessEnhancerEffect";
    public LoudnessEnhancer le;

    public class LoudnessEnhancerEffectConfig {
        public int targetGainDb;
    }

    public MetaAudioLoudnessEnhancerEffect(int i, LoudnessEnhancerEffectConfig loudnessEnhancerEffectConfig) {
        if (WebRtcAudioEffects.canUseLoudnessEnhancer()) {
            try {
                this.le = new LoudnessEnhancer(i);
            } catch (NoClassDefFoundError e) {
                Logging.e(TAG, "MetaAudioLoudnessEnhancerEffect creation encountered NoClassDefFoundError", e);
            } catch (Exception e2) {
                Logging.e(TAG, "MetaAudioLoudnessEnhancerEffect failed to create LoudnessEnhancer object", e2);
                this.le = null;
            }
            LoudnessEnhancer loudnessEnhancer = this.le;
            if (loudnessEnhancer != null) {
                loudnessEnhancer.getTargetGain();
                boolean z = Logging.loggingEnabled;
                if (loudnessEnhancerEffectConfig != null) {
                    this.le.setTargetGain(loudnessEnhancerEffectConfig.targetGainDb * 100);
                    this.le.getTargetGain();
                    return;
                }
            }
            boolean z2 = Logging.loggingEnabled;
        }
    }

    public void enable(boolean z) {
        LoudnessEnhancer loudnessEnhancer = this.le;
        if (loudnessEnhancer != null) {
            loudnessEnhancer.getEnabled();
            if (this.le.setEnabled(z) != 0) {
                boolean z2 = Logging.loggingEnabled;
            }
            this.le.getEnabled();
            boolean z3 = Logging.loggingEnabled;
        }
    }

    public void release() {
        LoudnessEnhancer loudnessEnhancer = this.le;
        if (loudnessEnhancer != null) {
            loudnessEnhancer.release();
            this.le = null;
        }
    }
}
