package X;

import java.util.HashMap;

/* renamed from: X.WWn  reason: case insensitive filesystem */
public final class C19372WWn implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "CommerceGlobalCartPrefetcher$buildBkGlobalCartFragment$insightsHost$1";
    public final /* synthetic */ HashMap A00;

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public C19372WWn(HashMap hashMap) {
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
