package X;

import com.instagram.api.schemas.IGBuyWithPrimeExperienceTypes;
import java.io.IOException;

/* renamed from: X.3tW  reason: invalid class name and case insensitive filesystem */
public abstract class C255063tW {
    public static BF4 parseFromJson(16F r11) {
        String str;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str2 = null;
            Integer num = null;
            Integer num2 = null;
            String str3 = null;
            String str4 = null;
            IGBuyWithPrimeExperienceTypes iGBuyWithPrimeExperienceTypes = null;
            String str5 = null;
            String str6 = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("accessToken".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("accessTokenCreationTime".equals(A0q)) {
                    num = Integer.valueOf(r11.A1D());
                } else if ("accessTokenTTL".equals(A0q)) {
                    num2 = Integer.valueOf(r11.A1D());
                } else if ("apiKey".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("bauProductUrl".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if ("buyWithPrimeExperienceType".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    iGBuyWithPrimeExperienceTypes = (IGBuyWithPrimeExperienceTypes) IGBuyWithPrimeExperienceTypes.A01.get(str);
                    if (iGBuyWithPrimeExperienceTypes == null) {
                        iGBuyWithPrimeExperienceTypes = IGBuyWithPrimeExperienceTypes.UNRECOGNIZED;
                    }
                } else if ("clientID".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r11.A1P();
                    }
                } else if ("pageName".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            return new BF4(iGBuyWithPrimeExperienceTypes, num, num2, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
