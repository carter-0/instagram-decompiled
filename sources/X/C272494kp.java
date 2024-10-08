package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;
import java.io.IOException;

/* renamed from: X.4kp  reason: invalid class name and case insensitive filesystem */
public abstract class C272494kp {
    public static C272524kt parseFromJson(16F r19) {
        String str;
        String str2;
        String str3;
        String str4;
        16F r2 = r19;
        0qQ.A0B(r2, 0);
        try {
            Boolean bool = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision = null;
            IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision2 = null;
            UserMonetizationProductType userMonetizationProductType = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("can_use_product".equals(A0q)) {
                    bool = Boolean.valueOf(r2.A0d());
                } else if ("eligibility_decision".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                    monetizationEligibilityDecision = C272514kr.A00(str4);
                } else if ("has_onboarded".equals(A0q)) {
                    bool2 = Boolean.valueOf(r2.A0d());
                } else if ("igtv_monetization_account_level_toggle".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                    iGTVAccountLevelMonetizationToggleSetting = (IGTVAccountLevelMonetizationToggleSetting) IGTVAccountLevelMonetizationToggleSetting.A01.get(str3);
                    if (iGTVAccountLevelMonetizationToggleSetting == null) {
                        iGTVAccountLevelMonetizationToggleSetting = IGTVAccountLevelMonetizationToggleSetting.UNRECOGNIZED;
                    }
                } else if ("mes_status_for_product".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                    monetizationEligibilityDecision2 = C272514kr.A00(str2);
                } else if ("product_type".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    userMonetizationProductType = C272504kq.A00(str);
                } else if ("show_in_settings".equals(A0q)) {
                    bool3 = Boolean.valueOf(r2.A0d());
                }
                r2.A0z();
            }
            if (bool == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("can_use_product", "MonetizationEligibilityProductDecision");
            } else if (monetizationEligibilityDecision == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("eligibility_decision", "MonetizationEligibilityProductDecision");
            } else if (bool2 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("has_onboarded", "MonetizationEligibilityProductDecision");
            } else if (monetizationEligibilityDecision2 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("mes_status_for_product", "MonetizationEligibilityProductDecision");
            } else if (userMonetizationProductType == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("product_type", "MonetizationEligibilityProductDecision");
            } else if (bool3 != null || !(r2 instanceof 0c9)) {
                return new C272524kt(iGTVAccountLevelMonetizationToggleSetting, monetizationEligibilityDecision, monetizationEligibilityDecision2, userMonetizationProductType, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            } else {
                ((0c9) r2).A03.A00("show_in_settings", "MonetizationEligibilityProductDecision");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
