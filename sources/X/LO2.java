package X;

import android.app.Activity;
import android.os.Build;

public final class LO2 {
    public boolean A00;
    public final Activity A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new MJ0(this, 7));
    public final boolean A03;

    public LO2(Activity activity, boolean z) {
        0qQ.A0B(activity, 1);
        this.A01 = activity;
        this.A03 = z;
    }

    public static final boolean A00(LO2 lo2) {
        if (!lo2.A03 || Build.VERSION.SDK_INT >= 35) {
            return false;
        }
        return true;
    }

    public final void A01(float f) {
        if (A00(this)) {
            AnonymousClass0eM r1 = this.A02;
            if (r1.getValue() != null) {
                C338017hH r2 = C338017hH.A00;
                0qQ.A07(r2);
                Number number = (Number) r2.evaluate(f, r1.getValue(), C51967G9n.A0j());
                if (number != null) {
                    C71106Ock.A00(this.A01, number.intValue());
                }
                if (((double) f) > 0.5d && !this.A00) {
                    2db.A06(this.A01, true);
                    this.A00 = true;
                }
            }
        }
    }
}
