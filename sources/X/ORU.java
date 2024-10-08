package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public final class ORU {
    public static NHU parseFromJson(16F r8) {
        Integer num;
        0qQ.A0B(r8, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    int A1D = r8.A1D();
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
                    0qQ.A0B(num, 0);
                    r0.A01 = num;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE.equals(A17)) {
                    OM1 parseFromJson = O3U.parseFromJson(r8);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A00 = parseFromJson;
                } else {
                    1XY.A01(r8, r0, A17);
                }
                r8.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
