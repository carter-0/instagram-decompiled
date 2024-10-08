package X;

import com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CVE {
    public static Map A00(C257603xf r3) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Air() != null) {
            A1H.put("button_text", r3.Air());
        }
        if (r3.AwU() != null) {
            A1H.put("description_text", r3.AwU());
        }
        if (r3.AyI() != null) {
            ShoppingIGFundedIncentivesShopAdsBannerStyles AyI = r3.AyI();
            if (AyI != null) {
                str = AyI.A00;
            } else {
                str = null;
            }
            A1H.put(C66579MXk.A00(126), str);
        }
        if (r3.BGl() != null) {
            A1H.put("incentive_id", r3.BGl());
        }
        if (r3.C4g() != null) {
            A1H.put(AnonymousClass000.A00(1880), r3.C4g());
        }
        if (r3.C4h() != null) {
            A1H.put(AnonymousClass000.A00(1881), r3.C4h());
        }
        return 0Yt.A0B(A1H);
    }
}
