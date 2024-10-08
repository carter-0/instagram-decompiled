package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Emc  reason: case insensitive filesystem */
public abstract class C48938Emc {
    public static C49481EwM parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C49481EwM ewM = new C49481EwM();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(2551).equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    ewM.A00 = AnonymousClass7TG.A0l(r3);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    ewM.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return ewM;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
