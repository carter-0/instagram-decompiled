package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.3tl  reason: invalid class name and case insensitive filesystem */
public abstract class C255213tl {
    public static C255223tm parseFromJson(16F r9) {
        String A01;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (true) {
                16L A1J = r9.A1J();
                16L r7 = 16L.A09;
                A01 = Dbh.A01(10, 8, 29);
                if (A1J == r7) {
                    break;
                }
                String A0q = r9.A0q();
                r9.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if (A01.equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "LinkedEntityUserImpl");
            } else if (str2 != null || !(r9 instanceof 0c9)) {
                return new C255223tm(str, str2);
            } else {
                ((0c9) r9).A03.A00(A01, "LinkedEntityUserImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
