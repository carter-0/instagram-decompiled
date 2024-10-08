package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.UserMonetizationProductType;
import java.io.IOException;

/* renamed from: X.CzB  reason: case insensitive filesystem */
public final class C45599CzB {
    public static C43806CDy parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("account_level_monetization_toggle".equals(A17)) {
                    r3.A00 = C41848B3p.A17(AnonymousClass7TG.A0l(r4));
                } else if ("product_type".equals(A17)) {
                    r3.A02 = C272504kq.A00(AnonymousClass7TG.A0l(r4));
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting = r3.A00;
            0qQ.A0A(iGTVAccountLevelMonetizationToggleSetting);
            UserMonetizationProductType userMonetizationProductType = r3.A02;
            0qQ.A0A(userMonetizationProductType);
            r3.A01 = new BB2(iGTVAccountLevelMonetizationToggleSetting, userMonetizationProductType);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
