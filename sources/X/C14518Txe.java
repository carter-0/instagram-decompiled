package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Txe  reason: case insensitive filesystem */
public abstract class C14518Txe {
    public static C14519Txf parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C14519Txf txf = new C14519Txf();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    txf.A00 = str;
                } else if ("uri".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    txf.A01 = str;
                }
                r4.A0z();
            }
            return txf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
