package X;

import android.app.Activity;
import android.os.Build;

/* renamed from: X.LFq  reason: case insensitive filesystem */
public final class C63965LFq {
    public boolean A00;
    public final Activity A01;
    public final boolean A02;

    public final void A00() {
        if (this.A02 && Build.VERSION.SDK_INT < 35) {
            Activity activity = this.A01;
            C71106Ock.A00(activity, -16777216);
            if (!this.A00) {
                2db.A06(activity, false);
                this.A00 = true;
            }
        }
    }

    public final void A01() {
        if (this.A02 && Build.VERSION.SDK_INT < 35) {
            C71106Ock.A00(this.A01, -1);
        }
    }

    public final void A02(float f) {
        if (this.A02 && Build.VERSION.SDK_INT < 35) {
            C338017hH r2 = C338017hH.A00;
            0qQ.A07(r2);
            Number number = (Number) r2.evaluate(f, C51967G9n.A0j(), -16777216);
            if (number != null) {
                C71106Ock.A00(this.A01, number.intValue());
            }
            if (((double) f) >= 0.5d && !this.A00) {
                2db.A06(this.A01, false);
                this.A00 = true;
            }
        }
    }

    public C63965LFq(Activity activity, boolean z) {
        this.A01 = activity;
        this.A02 = z;
    }
}
