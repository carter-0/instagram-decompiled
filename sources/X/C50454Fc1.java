package X;

import android.os.Bundle;

/* renamed from: X.Fc1  reason: case insensitive filesystem */
public final class C50454Fc1 implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "ShoppingExternalUrlHandler$2";
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C51017Fn9 A01;

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public C50454Fc1(Bundle bundle, C51017Fn9 fn9) {
        this.A01 = fn9;
        this.A00 = bundle;
    }

    public final String getModuleName() {
        Bundle bundle = this.A00;
        if (bundle.getString("prior_module") != null) {
            return bundle.getString("prior_module");
        }
        return "deep_link";
    }
}
