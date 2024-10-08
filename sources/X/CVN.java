package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public abstract class CVN {
    public static BE1 parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("background_url".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if ("text".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("text", r9, "CardsCreateModeCardImpl");
            } else if (str2 != null || !(r9 instanceof 0c9)) {
                return new BE1(str3, str, str2);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r9, "CardsCreateModeCardImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
