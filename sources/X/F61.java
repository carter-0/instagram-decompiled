package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public final class F61 {
    public static C47704EDn parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C47704EDn eDn = new C47704EDn();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    eDn.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("profile_picture".equals(A17)) {
                    eDn.A00 = C48940Eme.parseFromJson(r3);
                }
                r3.A0z();
            }
            return eDn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
