package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public abstract class D2M {
    public static AnonymousClass3ID parseFromJson(16F r9) {
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
                if ("image_url".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if (AnonymousClass000.A00(306).equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("image_url", r9, "RingGlyph");
            } else if (str2 != null || !(r9 instanceof 0c9)) {
                return new AnonymousClass3ID(str, str3, str2);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r9, "RingGlyph");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, AnonymousClass3ID r3, boolean z) {
        if (z) {
            r2.A0c();
        }
        String str = r3.A00;
        if (str != null) {
            r2.A0R("image_url", str);
        }
        String str2 = r3.A01;
        if (str2 != null) {
            r2.A0R(AnonymousClass000.A00(306), str2);
        }
        String str3 = r3.A02;
        if (str3 != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str3);
        }
        if (z) {
            r2.A0Z();
        }
    }
}
