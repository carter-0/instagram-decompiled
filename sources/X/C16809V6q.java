package X;

import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: X.V6q  reason: case insensitive filesystem */
public abstract class C16809V6q {
    public static final boolean A00(AnonymousClass7NN r6, C39752A7s a7s, Integer num, String str, boolean z, boolean z2) {
        U3Z u3z;
        U3Z u3z2;
        0qQ.A0B(r6, 0);
        AnonymousClass7TF.A1C(a7s, 1, num);
        View view = a7s.A03;
        0qQ.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsReleaseView");
        U3L u3l = (U3L) view;
        if (u3l.getParent() != null) {
            return false;
        }
        ViewGroup viewGroup = a7s.A05;
        if (viewGroup != null) {
            viewGroup.addView(u3l);
            viewGroup.setVisibility(0);
        }
        C17185VLp vLp = new C17185VLp(u3l);
        int intValue = num.intValue();
        if (intValue == 0) {
            C17879VhW vhW = (C17879VhW) r6.A01.get(str);
            if (vhW != null) {
                vhW.A00(vLp);
            } else {
                r6.A00.put(str, vLp);
            }
        } else if (intValue == 1) {
            C17879VhW vhW2 = (C17879VhW) r6.A01.get(str);
            if (vhW2 != null) {
                WeakReference weakReference = vhW2.A02;
                if (!(weakReference == null || (u3z2 = (U3Z) weakReference.get()) == null || !u3z2.getCanReleaseHearts())) {
                    for (C17722Vcr A04 : u3z2.A05) {
                        U3Z.A04(A04, u3z2, vLp);
                    }
                }
                WeakReference weakReference2 = vhW2.A03;
                if (!(weakReference2 == null || (u3z = (U3Z) weakReference2.get()) == null || !u3z.getCanReleaseHearts())) {
                    for (C17722Vcr A042 : u3z.A05) {
                        U3Z.A04(A042, u3z, vLp);
                    }
                }
            }
        } else {
            throw new RuntimeException();
        }
        if (z) {
            Object systemService = AnonymousClass7TE.A0S(u3l).getSystemService("vibrator");
            0qQ.A0C(systemService, C273654mx.A00(347));
            Vibrator vibrator = (Vibrator) systemService;
            long[] jArr = {50, 150, 50, 150, 50, 25, 50, 25, 50, 25, 50};
            if (vibrator.hasAmplitudeControl()) {
                vibrator.vibrate(VibrationEffect.createWaveform(jArr, new int[]{15, 0, 10, 0, 25, 0, 15, 0, 10, 0, 15}, -1));
            } else if (z2) {
                vibrator.vibrate(jArr, -1);
            } else {
                vibrator.vibrate(50);
            }
        }
        u3l.A01 = new C74179PqL(a7s, 37);
        return true;
    }
}
