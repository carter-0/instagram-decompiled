package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;
import java.io.IOException;

/* renamed from: X.4l7  reason: invalid class name and case insensitive filesystem */
public abstract class C272644l7 {
    public static C272654l8 parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("has_selected_creator_interests".equals(A0q)) {
                    bool = Boolean.valueOf(r8.A0d());
                } else if ("has_user_onboarded_for_payouts".equals(A0q)) {
                    bool2 = Boolean.valueOf(r8.A0d());
                } else if ("is_new_brand_available_in_wishlist".equals(A0q)) {
                    bool3 = Boolean.valueOf(r8.A0d());
                } else if ("is_partnership_messaging_eligible".equals(A0q)) {
                    bool4 = Boolean.valueOf(r8.A0d());
                } else if ("mes_status_for_product".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    monetizationEligibilityDecision = C272514kr.A00(str);
                }
                r8.A0z();
            }
            return new C272654l8(monetizationEligibilityDecision, bool, bool2, bool3, bool4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
