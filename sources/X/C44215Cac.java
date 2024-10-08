package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Cac  reason: case insensitive filesystem */
public abstract class C44215Cac {
    public static C61074JwC parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            XET xet = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            1Xj r4 = null;
            C42053BFg bFg = null;
            Integer num = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("ad_media".equals(A17)) {
                    xet = C41915B6n.parseFromJson(r7);
                } else if (C41845B3m.A1D(A17)) {
                    r4 = 1Xj.A00(r7);
                } else if ("netego_media".equals(A17)) {
                    bFg = C44231Cas.parseFromJson(r7);
                } else {
                    num = C41847B3o.A13(r7, num, A17, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                }
                r7.A0z();
            }
            return new C61074JwC(0, xet, r4, bFg, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
