package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public abstract class GWD {
    public static C61073JwB parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    String A1Q = r11.A1Q();
                    Integer[] A00 = AnonymousClass05K.A00(8);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            num = AnonymousClass05K.A15;
                            break;
                        }
                        num = A00[i];
                        if (00p.A0j(VF9.A00(num), A1Q, true)) {
                            break;
                        }
                        i++;
                    }
                } else if ("display_title".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("display_body".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("landing_url".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (num == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r11, "AdsManagerInfoError");
            } else if (str == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("display_title", r11, "AdsManagerInfoError");
            } else if (str2 != null || !(r11 instanceof 0c9)) {
                return new C61073JwB(num, str, str2, str3, 13);
            } else {
                AnonymousClass7TF.A1L("display_body", r11, "AdsManagerInfoError");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
