package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.6nB  reason: invalid class name and case insensitive filesystem */
public final class C317386nB {
    public static AnonymousClass6L1 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass6L1 r0 = new AnonymousClass6L1();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if ("__typename".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        r4.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A01 = str;
                } else if ("document".equals(A0q)) {
                    r0.A00 = VCI.parseFromJson(r4);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
