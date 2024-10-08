package X;

import android.view.WindowInsets;

/* renamed from: X.0ku  reason: invalid class name and case insensitive filesystem */
public abstract class C61060ku extends 0uN {
    public 02M A00;

    public final 02M A01() {
        02M r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        WindowInsets windowInsets = this.A04;
        02M A002 = 02M.A00(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.A00 = A002;
        return A002;
    }

    public final 04k A09() {
        WindowInsets consumeStableInsets = this.A04.consumeStableInsets();
        04k r0 = 04k.A01;
        consumeStableInsets.getClass();
        return new 04k(consumeStableInsets);
    }

    public final 04k A0A() {
        WindowInsets consumeSystemWindowInsets = this.A04.consumeSystemWindowInsets();
        04k r0 = 04k.A01;
        consumeSystemWindowInsets.getClass();
        return new 04k(consumeSystemWindowInsets);
    }

    public void A0D(02M r1) {
        this.A00 = r1;
    }

    public final boolean A0G() {
        return this.A04.isConsumed();
    }
}
