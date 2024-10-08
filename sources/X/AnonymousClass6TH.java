package X;

import android.view.View;

/* renamed from: X.6TH  reason: invalid class name */
public final class AnonymousClass6TH {
    public final C244943c0 A00;
    public final AnonymousClass2TS A01;
    public final boolean A02;
    public final AnonymousClass6T2 A03;

    public static int A00(float f, float f2) {
        int round;
        int i;
        if (f == f2) {
            round = Math.round(f);
            i = SN3.MAX_SIGNED_POWER_OF_TWO;
        } else if (Float.isNaN(f2)) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            round = Math.round(f2);
            i = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        return View.MeasureSpec.makeMeasureSpec(round, i);
    }

    public AnonymousClass6TH(AnonymousClass6T2 r1, C244943c0 r2, AnonymousClass2TS r3, boolean z) {
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r1;
        this.A02 = z;
    }
}
