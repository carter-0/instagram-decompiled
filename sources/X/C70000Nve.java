package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Nve  reason: case insensitive filesystem */
public abstract class C70000Nve {
    public static C376659Iv parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C376659Iv r0 = new C376659Iv();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A19(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    r0.A02 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    Integer A01 = OPZ.A01(r4.A1D());
                    0qQ.A0B(A01, 0);
                    r0.A01 = A01;
                } else if ("modified_at".equals(A17)) {
                    r0.A00 = r4.A0y();
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
