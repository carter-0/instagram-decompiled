package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.A0w  reason: case insensitive filesystem */
public abstract class C39580A0w {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Aex, java.lang.Object] */
    public static C40609Aex parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("prompt".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("hint".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("help_text".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE.equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
