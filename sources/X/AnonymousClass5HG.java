package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.5HG  reason: invalid class name */
public abstract class AnonymousClass5HG {
    public static AnonymousClass5HH parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                }
                r6.A0z();
            }
            if (str != null || !(r6 instanceof 0c9)) {
                return new AnonymousClass5HH(str);
            }
            ((0c9) r6).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "MediaAttributionImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
