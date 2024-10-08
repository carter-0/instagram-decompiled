package org.webrtc.voiceengine;

import android.media.audiofx.Equalizer;
import java.lang.reflect.Array;
import org.webrtc.Logging;

public class MetaAudioEqualizerEffect {
    public static final String TAG = "MetaAudioEqualizerEffect";
    public Equalizer eq;

    public class EqualizerEffectConfig {
        public int preset;
    }

    public MetaAudioEqualizerEffect(int i, EqualizerEffectConfig equalizerEffectConfig) {
        short s;
        if (WebRtcAudioEffects.canUseEqualizer()) {
            try {
                this.eq = new Equalizer(0, i);
            } catch (NoClassDefFoundError e) {
                Logging.e(TAG, "MetaAudioEqualizerEffect creation encountered NoClassDefFoundError", e);
            } catch (Exception e2) {
                Logging.e(TAG, "MetaAudioEqualizerEffect failed to create Equalizer object", e2);
                this.eq = null;
            }
            Equalizer equalizer = this.eq;
            if (equalizer != null) {
                short numberOfPresets = equalizer.getNumberOfPresets();
                boolean z = Logging.loggingEnabled;
                for (int i2 = 0; i2 < numberOfPresets; i2++) {
                    this.eq.getPresetName((short) i2);
                }
                if (equalizerEffectConfig != null && (s = (short) equalizerEffectConfig.preset) >= 0 && s < numberOfPresets) {
                    this.eq.usePreset(s);
                    this.eq.getCurrentPreset();
                }
                int numberOfBands = this.eq.getNumberOfBands();
                int[] iArr = new int[2];
                iArr[1] = 2;
                iArr[0] = numberOfBands;
                Object[] objArr = (Object[]) Array.newInstance(Integer.TYPE, iArr);
                for (int i3 = 0; i3 < numberOfBands; i3++) {
                    short s2 = (short) i3;
                    objArr[i3] = this.eq.getBandFreqRange(s2);
                    this.eq.getBandLevelRange();
                    this.eq.setBandLevel(s2, -1000);
                    this.eq.getBandLevel(s2);
                }
            }
        }
    }

    public void enable(boolean z) {
        Equalizer equalizer = this.eq;
        if (equalizer != null) {
            equalizer.getEnabled();
            if (this.eq.setEnabled(z) != 0) {
                boolean z2 = Logging.loggingEnabled;
            }
            this.eq.getEnabled();
            boolean z3 = Logging.loggingEnabled;
        }
    }

    public void release() {
        Equalizer equalizer = this.eq;
        if (equalizer != null) {
            equalizer.release();
            this.eq = null;
        }
    }
}
