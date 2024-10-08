package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Nrb  reason: case insensitive filesystem */
public abstract class C69752Nrb {
    public static N5G parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Long l = null;
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                if (C41846B3n.A1Y(r12, A0q)) {
                    l = AnonymousClass7TF.A0Z(r12);
                } else if ("is_popular".equals(A0q)) {
                    bool = AnonymousClass7TF.A0S(r12);
                } else if ("meta_ai_emoji".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("meta_ai_full_prompt".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("style".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (str3 != null || !(r12 instanceof 0c9)) {
                return new N5G(bool, l, str, str2, str3, str4, str5);
            }
            AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r12, "NullstateKeywordDictImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
