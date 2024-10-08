package X;

import com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles;
import java.io.IOException;

public abstract class CVF {
    public static BE0 parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            ShoppingIGFundedIncentivesShopAdsBannerStyles shoppingIGFundedIncentivesShopAdsBannerStyles = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("button_text".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("description_text".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if (C66579MXk.A00(126).equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    shoppingIGFundedIncentivesShopAdsBannerStyles = (ShoppingIGFundedIncentivesShopAdsBannerStyles) ShoppingIGFundedIncentivesShopAdsBannerStyles.A01.get(str);
                    if (shoppingIGFundedIncentivesShopAdsBannerStyles == null) {
                        shoppingIGFundedIncentivesShopAdsBannerStyles = ShoppingIGFundedIncentivesShopAdsBannerStyles.UNRECOGNIZED;
                    }
                } else if ("incentive_id".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r9.A1P();
                    }
                } else if (AnonymousClass000.A00(1880).equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r9.A1P();
                    }
                } else if (AnonymousClass000.A00(1881).equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            return new BE0(shoppingIGFundedIncentivesShopAdsBannerStyles, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
