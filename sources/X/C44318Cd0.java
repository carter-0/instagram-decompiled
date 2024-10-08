package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import java.io.IOException;

/* renamed from: X.Cd0  reason: case insensitive filesystem */
public abstract class C44318Cd0 {
    public static C61074JwC parseFromJson(16F r8) {
        String str;
        String str2;
        String str3;
        String str4;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision = null;
            IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting2 = null;
            IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting3 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("igtv_monetization_account_level_toggle".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                    iGTVAccountLevelMonetizationToggleSetting = C41848B3p.A17(str4);
                } else if (AnonymousClass000.A00(1593).equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                    monetizationEligibilityDecision = C272514kr.A00(str3);
                } else if ("profile_ads_toggle".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                    iGTVAccountLevelMonetizationToggleSetting2 = C41848B3p.A17(str2);
                } else if ("reels_overlay_ads_toggle".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    iGTVAccountLevelMonetizationToggleSetting3 = C41848B3p.A17(str);
                }
                r8.A0z();
            }
            return new C61074JwC(3, iGTVAccountLevelMonetizationToggleSetting, monetizationEligibilityDecision, iGTVAccountLevelMonetizationToggleSetting2, iGTVAccountLevelMonetizationToggleSetting3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
