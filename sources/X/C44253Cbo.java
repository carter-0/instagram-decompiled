package X;

import com.instagram.api.schemas.ProductAffiliateInformationDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cbo  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44253Cbo {
    public static Map A00(ProductAffiliateInformationDict productAffiliateInformationDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (productAffiliateInformationDict.AaC() != null) {
            A1H.put("affiliate_campaign_id", productAffiliateInformationDict.AaC());
        }
        if (productAffiliateInformationDict.ApW() != null) {
            A1H.put("commission_rate", productAffiliateInformationDict.ApW());
        }
        return 0Yt.A0B(A1H);
    }
}
