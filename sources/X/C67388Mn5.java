package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Mn5  reason: case insensitive filesystem */
public final class C67388Mn5 {
    public static C67389Mn6 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C67389Mn6 mn6 = new C67389Mn6();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                String str = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    0qQ.A0B(str, 0);
                    mn6.A00 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    0qQ.A0B(str, 0);
                    mn6.A01 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    0qQ.A0B(str, 0);
                    mn6.A02 = str;
                }
                r5.A0z();
            }
            return mn6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
