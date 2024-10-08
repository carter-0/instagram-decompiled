package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public abstract class VII {
    public static C19324WUg parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C19324WUg wUg = new C19324WUg();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("bounds_padding_for_underline".equals(A17)) {
                    wUg.A00 = r4.A1D();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    wUg.A01 = C41845B3m.A0a(r4, false);
                }
                r4.A0z();
            }
            return wUg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
