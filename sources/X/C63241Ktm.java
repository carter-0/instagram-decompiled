package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Ktm  reason: case insensitive filesystem */
public abstract class C63241Ktm {
    public static C61055Jvt parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C61055Jvt jvt = new C61055Jvt();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    jvt.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("text".equals(A17)) {
                    jvt.A02 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(3237).equals(A17)) {
                    jvt.A03 = r3.A0d();
                } else if ("timestamp_s".equals(A17)) {
                    jvt.A00 = AnonymousClass7TF.A0Z(r3);
                }
                r3.A0z();
            }
            return jvt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
