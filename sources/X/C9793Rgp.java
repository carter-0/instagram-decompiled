package X;

import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: X.Rgp  reason: case insensitive filesystem */
public abstract class C9793Rgp {
    public static Object A00(C307896Rx r3, AnonymousClass6Tm r4) {
        long j;
        int i;
        String str = (String) r4.A01();
        Vibrator vibrator = (Vibrator) C308206Td.A09(r3).A00.getSystemService("vibrator");
        if (vibrator == null || !vibrator.hasVibrator()) {
            return null;
        }
        if (str.equals("strong")) {
            j = 80;
            i = 255;
        } else if (!str.equals("weak")) {
            j = 40;
            i = 143;
        } else {
            j = 10;
            i = 47;
        }
        vibrator.vibrate(VibrationEffect.createOneShot(j, i));
        return null;
    }
}
