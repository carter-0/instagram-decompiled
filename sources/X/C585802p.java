package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.02p  reason: invalid class name and case insensitive filesystem */
public final class C585802p extends AnonymousClass04p {
    public static final 04k A00;

    public final void A0C(View view) {
    }

    static {
        WindowInsets windowInsets = WindowInsets.CONSUMED;
        04k r0 = 04k.A01;
        windowInsets.getClass();
        A00 = new 04k(windowInsets);
    }

    public final 02M A05(int i) {
        return 02M.A01(this.A04.getInsets(AnonymousClass04j.A00(i)));
    }

    public final 02M A06(int i) {
        return 02M.A01(this.A04.getInsetsIgnoringVisibility(AnonymousClass04j.A00(i)));
    }

    public final boolean A0I(int i) {
        return this.A04.isVisible(AnonymousClass04j.A00(i));
    }

    public C585802p(04k r1, WindowInsets windowInsets) {
        super(r1, windowInsets);
    }
}
