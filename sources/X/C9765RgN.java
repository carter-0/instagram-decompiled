package X;

import com.instagram.api.schemas.IGBuyWithPrimeExperienceTypes;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.RgN  reason: case insensitive filesystem */
public abstract /* synthetic */ class C9765RgN {
    public static Map A00(C269934fv r3) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.getAccessToken() != null) {
            A1H.put("accessToken", r3.getAccessToken());
        }
        if (r3.AXk() != null) {
            A1H.put(AnonymousClass000.A00(4422), r3.AXk());
        }
        if (r3.AXl() != null) {
            A1H.put("accessTokenTTL", r3.AXl());
        }
        if (r3.Ac0() != null) {
            A1H.put("apiKey", r3.Ac0());
        }
        if (r3.AfY() != null) {
            A1H.put("bauProductUrl", r3.AfY());
        }
        if (r3.Aj5() != null) {
            IGBuyWithPrimeExperienceTypes Aj5 = r3.Aj5();
            if (Aj5 != null) {
                str = Aj5.A00;
            } else {
                str = null;
            }
            A1H.put(AnonymousClass000.A00(4544), str);
        }
        if (r3.Anc() != null) {
            A1H.put("clientID", r3.Anc());
        }
        if (r3.BaI() != null) {
            A1H.put("pageName", r3.BaI());
        }
        return 0Yt.A0B(A1H);
    }
}
