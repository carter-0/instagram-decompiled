package X;

import com.instagram.api.schemas.IGBWPExperienceTypes;
import com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDictImpl;
import java.io.IOException;

/* renamed from: X.Ecp  reason: case insensitive filesystem */
public abstract class C48332Ecp {
    public static IGBWPIABPostClickDataExtensionDictImpl parseFromJson(16F r11) {
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
            IGBWPExperienceTypes iGBWPExperienceTypes = null;
            String str5 = null;
            String str6 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("accessToken".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("accessTokenCreationTime".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if ("accessTokenTTL".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r11);
                } else if ("apiKey".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("bauProductUrl".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if ("buyWithPrimeExperienceType".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    iGBWPExperienceTypes = (IGBWPExperienceTypes) IGBWPExperienceTypes.A01.get(str);
                    if (iGBWPExperienceTypes == null) {
                        iGBWPExperienceTypes = IGBWPExperienceTypes.UNRECOGNIZED;
                    }
                } else if ("clientID".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r11.A1P();
                    }
                } else if ("pageName".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            return new IGBWPIABPostClickDataExtensionDictImpl(iGBWPExperienceTypes, num, num2, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
