package X;

import com.instagram.api.schemas.BuyWithIntegrationPostClickExperienceTypes;
import com.instagram.api.schemas.PartnerTypes;
import java.io.IOException;

/* renamed from: X.3tV  reason: invalid class name and case insensitive filesystem */
public abstract class C255053tV {
    public static QPf parseFromJson(16F r11) {
        String str;
        String str2;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str3 = null;
            Integer num = null;
            String str4 = null;
            String str5 = null;
            BuyWithIntegrationPostClickExperienceTypes buyWithIntegrationPostClickExperienceTypes = null;
            Long l = null;
            String str6 = null;
            PartnerTypes partnerTypes = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("accessToken".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("accessTokenTTL".equals(A0q)) {
                    num = Integer.valueOf(r11.A1D());
                } else if ("apiKey".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if ("bauProductUrl".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r11.A1P();
                    }
                } else if ("buyWithIntegrationPostClickExperienceType".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                    buyWithIntegrationPostClickExperienceTypes = (BuyWithIntegrationPostClickExperienceTypes) BuyWithIntegrationPostClickExperienceTypes.A01.get(str2);
                    if (buyWithIntegrationPostClickExperienceTypes == null) {
                        buyWithIntegrationPostClickExperienceTypes = BuyWithIntegrationPostClickExperienceTypes.UNRECOGNIZED;
                    }
                } else if ("oauthIntegrationId".equals(A0q)) {
                    l = Long.valueOf(r11.A0y());
                } else if ("pageName".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r11.A1P();
                    }
                } else if ("partnerType".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    partnerTypes = (PartnerTypes) PartnerTypes.A01.get(str);
                    if (partnerTypes == null) {
                        partnerTypes = PartnerTypes.UNRECOGNIZED;
                    }
                }
                r11.A0z();
            }
            return new QPf(buyWithIntegrationPostClickExperienceTypes, partnerTypes, num, l, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
