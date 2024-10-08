package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.51E  reason: invalid class name */
public abstract class AnonymousClass51E {
    public static AnonymousClass51F parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            C2809655h r5 = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("config".equals(A0q)) {
                    r5 = C2809555g.parseFromJson(r7);
                }
                r7.A0z();
            }
            if (str != null || !(r7 instanceof 0c9)) {
                return new AnonymousClass51F(r5, str);
            }
            ((0c9) r7).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "EffectManifestCapability");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
