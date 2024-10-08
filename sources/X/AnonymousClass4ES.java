package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.4ES  reason: invalid class name */
public abstract class AnonymousClass4ES {
    public static AnonymousClass4ET parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            String str = null;
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            while (r13.A1J() != 16L.A09) {
                String A0q = r13.A0q();
                r13.A1J();
                if ("fb_account_creation_time".equals(A0q)) {
                    num = Integer.valueOf(r13.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("is_valid".equals(A0q)) {
                    bool = Boolean.valueOf(r13.A0d());
                } else if ("link_time".equals(A0q)) {
                    num2 = Integer.valueOf(r13.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("profile_url".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (str == null && (r13 instanceof 0c9)) {
                ((0c9) r13).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "LinkedFBUserImpl");
            } else if (bool == null && (r13 instanceof 0c9)) {
                ((0c9) r13).A03.A00("is_valid", "LinkedFBUserImpl");
            } else if (str2 != null || !(r13 instanceof 0c9)) {
                return new AnonymousClass4ET(num, num2, str, str2, str3, bool.booleanValue());
            } else {
                ((0c9) r13).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "LinkedFBUserImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
