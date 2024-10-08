package X;

import android.media.AudioManager;
import java.util.Arrays;

public abstract class PUJ implements Runnable {
    public static void A00(NDz nDz, int i, boolean z) {
        Integer num;
        try {
            OUV ouv = nDz.A05;
            Integer valueOf = Integer.valueOf(i);
            ouv.A00("safeSetMode to %d", valueOf);
            AudioManager audioManager = nDz.A02;
            int mode = audioManager.getMode();
            if (!(i == mode && (num = nDz.A01) != null && i == num.intValue())) {
                audioManager.setMode(i);
                nDz.A01 = valueOf;
                nDz.audioManagerQplLogger.CmO("set_audio_mode", String.valueOf(i));
                if (nDz.aomSavedAudioMode == -2) {
                    nDz.aomSavedAudioMode = mode;
                }
            }
        } catch (Exception e) {
            0KC.A0L("RtcAudioOutputManager", "Failed to set audio mode", e, Arrays.copyOf(new Object[0], 0));
        }
        if (z) {
            nDz.aomSavedAudioMode = -2;
        }
    }
}
