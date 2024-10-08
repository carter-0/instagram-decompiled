package X;

import com.instagram.api.schemas.BuyWithIntegrationPostClickExperienceTypes;
import com.instagram.api.schemas.PartnerTypes;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.RgM  reason: case insensitive filesystem */
public abstract /* synthetic */ class C9764RgM {
    public static Map A00(C269924fu r4) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.getAccessToken() != null) {
            A1H.put("accessToken", r4.getAccessToken());
        }
        if (r4.AXl() != null) {
            A1H.put("accessTokenTTL", r4.AXl());
        }
        if (r4.Ac0() != null) {
            A1H.put("apiKey", r4.Ac0());
        }
        if (r4.AfY() != null) {
            A1H.put("bauProductUrl", r4.AfY());
        }
        String str2 = null;
        if (r4.Aj3() != null) {
            BuyWithIntegrationPostClickExperienceTypes Aj3 = r4.Aj3();
            if (Aj3 != null) {
                str = Aj3.A00;
            } else {
                str = null;
            }
            A1H.put("buyWithIntegrationPostClickExperienceType", str);
        }
        if (r4.BXh() != null) {
            A1H.put("oauthIntegrationId", r4.BXh());
        }
        if (r4.BaI() != null) {
            A1H.put("pageName", r4.BaI());
        }
        if (r4.Baq() != null) {
            PartnerTypes Baq = r4.Baq();
            if (Baq != null) {
                str2 = Baq.A00;
            }
            A1H.put("partnerType", str2);
        }
        return 0Yt.A0B(A1H);
    }
}
