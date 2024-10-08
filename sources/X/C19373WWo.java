package X;

import java.util.HashMap;

/* renamed from: X.WWo  reason: case insensitive filesystem */
public final class C19373WWo implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "CommerceMerchantCartPrefetcher$buildBkMerchantCartBundle$insightsHost$1";
    public final /* synthetic */ HashMap A00;

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public C19373WWo(HashMap hashMap) {
        this.A00 = hashMap;
    }

    public final String getModuleName() {
        String str = (String) this.A00.get("prior_module_name");
        if (str == null) {
            return "";
        }
        return str;
    }
}
