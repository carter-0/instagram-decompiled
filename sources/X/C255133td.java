package X;

import com.instagram.api.schemas.SponsoredAdsDisclaimerType;
import java.io.IOException;

/* renamed from: X.3td  reason: invalid class name and case insensitive filesystem */
public abstract class C255133td {
    public static C257953yE parseFromJson(16F r11) {
        String str;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Boolean bool = null;
            String str2 = null;
            SponsoredAdsDisclaimerType sponsoredAdsDisclaimerType = null;
            String str3 = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("bold_style_text".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("has_bold_style_text".equals(A0q)) {
                    bool = Boolean.valueOf(r11.A0d());
                } else if ("label".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("label_type".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    sponsoredAdsDisclaimerType = (SponsoredAdsDisclaimerType) SponsoredAdsDisclaimerType.A01.get(str);
                    if (sponsoredAdsDisclaimerType == null) {
                        sponsoredAdsDisclaimerType = SponsoredAdsDisclaimerType.UNRECOGNIZED;
                    }
                }
                r11.A0z();
            }
            if (bool == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("has_bold_style_text", "SponsoredAdsDisclaimer");
            } else if (str2 == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("label", "SponsoredAdsDisclaimer");
            } else if (sponsoredAdsDisclaimerType != null || !(r11 instanceof 0c9)) {
                return new C257953yE(sponsoredAdsDisclaimerType, str3, str2, bool.booleanValue());
            } else {
                ((0c9) r11).A03.A00("label_type", "SponsoredAdsDisclaimer");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
