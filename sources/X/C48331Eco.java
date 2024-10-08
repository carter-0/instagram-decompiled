package X;

import com.instagram.api.schemas.IGBWPExperienceTypes;
import com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Eco  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48331Eco {
    public static Map A00(IGBWPIABPostClickDataExtensionDict iGBWPIABPostClickDataExtensionDict) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (iGBWPIABPostClickDataExtensionDict.getAccessToken() != null) {
            A1H.put("accessToken", iGBWPIABPostClickDataExtensionDict.getAccessToken());
        }
        if (iGBWPIABPostClickDataExtensionDict.AXk() != null) {
            A1H.put("accessTokenCreationTime", iGBWPIABPostClickDataExtensionDict.AXk());
        }
        if (iGBWPIABPostClickDataExtensionDict.AXl() != null) {
            A1H.put("accessTokenTTL", iGBWPIABPostClickDataExtensionDict.AXl());
        }
        if (iGBWPIABPostClickDataExtensionDict.Ac0() != null) {
            A1H.put("apiKey", iGBWPIABPostClickDataExtensionDict.Ac0());
        }
        if (iGBWPIABPostClickDataExtensionDict.AfY() != null) {
            A1H.put("bauProductUrl", iGBWPIABPostClickDataExtensionDict.AfY());
        }
        if (iGBWPIABPostClickDataExtensionDict.Aj4() != null) {
            IGBWPExperienceTypes Aj4 = iGBWPIABPostClickDataExtensionDict.Aj4();
            if (Aj4 != null) {
                str = Aj4.A00;
            } else {
                str = null;
            }
            A1H.put("buyWithPrimeExperienceType", str);
        }
        if (iGBWPIABPostClickDataExtensionDict.Anc() != null) {
            A1H.put("clientID", iGBWPIABPostClickDataExtensionDict.Anc());
        }
        if (iGBWPIABPostClickDataExtensionDict.BaI() != null) {
            A1H.put("pageName", iGBWPIABPostClickDataExtensionDict.BaI());
        }
        return 0Yt.A0B(A1H);
    }
}
