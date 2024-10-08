package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Cad  reason: case insensitive filesystem */
public abstract class C44216Cad {
    public static BB0 parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1Xj r1 = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("media".equals(A17)) {
                    r1 = 1Xj.A00(r6);
                } else {
                    num = C41847B3o.A13(r6, num, A17, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                }
                r6.A0z();
            }
            if (r1 != null || !(r6 instanceof 0c9)) {
                return new BB0(r1, num);
            }
            AnonymousClass7TF.A1L("media", r6, "MixedMediaItemDict");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
