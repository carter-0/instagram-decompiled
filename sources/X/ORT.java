package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public final class ORT {
    public static NHE parseFromJson(16F r7) {
        Integer num;
        0qQ.A0B(r7, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    int A1D = r7.A1D();
                    Integer[] A00 = AnonymousClass05K.A00(6);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            num = null;
                            break;
                        }
                        num = A00[i];
                        if (O3P.A00(num) == A1D) {
                            break;
                        }
                        i++;
                    }
                    r0.A01 = num;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE.equals(A17)) {
                    r0.A00 = O3T.parseFromJson(r7);
                } else {
                    1XY.A01(r7, r0, A17);
                }
                r7.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
