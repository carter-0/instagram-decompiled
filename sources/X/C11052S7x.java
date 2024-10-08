package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.List;

/* renamed from: X.S7x  reason: case insensitive filesystem */
public abstract class C11052S7x {
    public static C10148RnP A01(AudioManager audioManager, SIH sih) {
        try {
            audioManager.getClass();
            C10146RnN rnN = sih.A00;
            if (rnN == null) {
                rnN = new C10146RnN();
                sih.A00 = rnN;
            }
            List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(rnN.A00);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C10148RnP((AudioDeviceInfo) AnonymousClass7TE.A13(audioDevicesForAttributes));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static SRK A00(AudioManager audioManager, SIH sih) {
        C10146RnN rnN = sih.A00;
        if (rnN == null) {
            rnN = new C10146RnN();
            sih.A00 = rnN;
        }
        return new SRK(SRK.A01(audioManager.getDirectProfilesForAttributes(rnN.A00)));
    }
}
