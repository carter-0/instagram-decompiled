package X;

import android.view.WindowInsets;

/* renamed from: X.04p  reason: invalid class name */
public class AnonymousClass04p extends 0SY {
    public 02M A00 = null;
    public 02M A01 = null;
    public 02M A02 = null;

    public final void A0D(02M r1) {
    }

    public final 02M A00() {
        02M r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        02M A012 = 02M.A01(this.A04.getMandatorySystemGestureInsets());
        this.A00 = A012;
        return A012;
    }

    public final 02M A02() {
        02M r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        02M A012 = 02M.A01(this.A04.getSystemGestureInsets());
        this.A01 = A012;
        return A012;
    }

    public final 02M A04() {
        02M r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        02M A012 = 02M.A01(this.A04.getTappableElementInsets());
        this.A02 = A012;
        return A012;
    }

    public final 04k A0B(int i, int i2, int i3, int i4) {
        WindowInsets inset = this.A04.inset(i, i2, i3, i4);
        04k r0 = 04k.A01;
        inset.getClass();
        return new 04k(inset);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0ku, X.04p] */
    public AnonymousClass04p(04k r2, WindowInsets windowInsets) {
        super(r2, windowInsets);
        this.A00 = null;
    }
}
