package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.UserMonetizationProductType;
import java.io.IOException;

/* renamed from: X.Cav  reason: case insensitive filesystem */
public abstract class C44234Cav {
    public static C47209Dsw parseFromJson(16F r7) {
        String str;
        String str2;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            UserMonetizationProductType userMonetizationProductType = null;
            IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("account_level_monetization_toggle".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                    iGTVAccountLevelMonetizationToggleSetting = C41848B3p.A17(str2);
                } else if ("product_type".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    userMonetizationProductType = C272504kq.A00(str);
                }
                r7.A0z();
            }
            if (userMonetizationProductType != null || !(r7 instanceof 0c9)) {
                return new C47209Dsw(iGTVAccountLevelMonetizationToggleSetting, userMonetizationProductType);
            }
            AnonymousClass7TF.A1L("product_type", r7, "NonRevshareConfig");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
