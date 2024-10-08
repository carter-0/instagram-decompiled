package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.6Qn  reason: invalid class name and case insensitive filesystem */
public final class C307546Qn implements C307556Qo {
    public static final Handler A00 = new Handler(Looper.getMainLooper());
    public static final C307546Qn A01 = new Object();

    public final void AT1(int i, int i2, String str, String str2) {
        0qQ.A0B(str, 2);
        02m r1 = 02m.A0p;
        if (i == 7) {
            i = 36708819;
        }
        r1.markerAnnotate(i, i2, str, str2);
    }

    public final void AT0(int i, int i2, String str, int i3) {
        02m.A0p.markerAnnotate(i, i2, "instance", i3);
    }

    public final void AT3(int i, int i2) {
        02m r1 = 02m.A0p;
        if (i == 7) {
            i = 36708819;
        }
        r1.markerEnd(i, i2, 3);
    }

    public final void AT4(int i, int i2) {
        02m r1 = 02m.A0p;
        if (i == 7) {
            i = 36708819;
        }
        r1.markerEnd(i, i2, 2);
    }

    public final boolean AT5(int i, int i2) {
        02m.A0p.markerStart(i, i2);
        return 02m.A0p.isMarkerOn(i, i2);
    }

    public final long currentMonotonicTimestamp() {
        return 02m.A0p.currentMonotonicTimestamp();
    }
}
