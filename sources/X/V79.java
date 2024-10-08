package X;

import com.instagram.api.schemas.DEPProgramLevelContentResponse;
import java.io.IOException;

public abstract class V79 {
    public static DEPProgramLevelContentResponse parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("agent_title".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if ("banner_image_uri".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("cta_text".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("headshot_image_uri".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if ("is_advertiser_eligible".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r15);
                } else if ("long_description".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r15.A1P();
                    }
                } else if ("long_title".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r15.A1P();
                    }
                } else if ("program_name".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r15.A1P();
                    }
                } else if (AnonymousClass000.A00(1812).equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r15.A1P();
                    }
                } else if ("short_title".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r15.A1P();
                    }
                }
                r15.A0z();
            }
            if (bool != null || !(r15 instanceof 0c9)) {
                return new DEPProgramLevelContentResponse(str, str2, str3, str4, str5, str6, str7, str8, str9, bool.booleanValue());
            }
            AnonymousClass7TF.A1L("is_advertiser_eligible", r15, "DEPProgramLevelContentResponse");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
