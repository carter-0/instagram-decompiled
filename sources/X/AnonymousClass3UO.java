package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3UO  reason: invalid class name */
public enum AnonymousClass3UO {
    SUGGESTED_USER("user_card"),
    FBC_UPSELL("upsell_fbc_card"),
    CI_UPSELL("upsell_ci_card"),
    INVITE_UPSELL("upsell_invite_card"),
    SEE_ALL_SU_UPSELL("upsell_see_all_su_card"),
    COMPLETE_PROFILE_UPSELL("upsell_complete_profile_card"),
    DP_UPSELL("upsell_dp_card"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass3UO[] r0;
        A02 = 0oU.A00(r0);
        A01 = new HashMap();
        for (AnonymousClass3UO r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AnonymousClass3UO(String str) {
        this.A00 = str;
    }
}
