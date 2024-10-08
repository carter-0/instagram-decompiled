package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public abstract class Ri3 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.S2C, java.lang.Object] */
    public static S2C parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("module_hash".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("download_uri".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
