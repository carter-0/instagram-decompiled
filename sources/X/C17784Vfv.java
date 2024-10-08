package X;

import com.instagram.shopping.model.productsource.ProductSourceOverrideState;

/* renamed from: X.Vfv  reason: case insensitive filesystem */
public final class C17784Vfv {
    public final /* synthetic */ C15340Uaq A00;

    public C17784Vfv(C15340Uaq uaq) {
        this.A00 = uaq;
    }

    public final boolean A00(C17503VYh vYh) {
        String str;
        ProductSourceOverrideState productSourceOverrideState = this.A00.A06;
        if (productSourceOverrideState == null || (str = productSourceOverrideState.A02) == null || str.length() == 0 || str.equals(vYh.A02)) {
            return true;
        }
        return false;
    }
}
