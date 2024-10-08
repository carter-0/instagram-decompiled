package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CUs  reason: case insensitive filesystem */
public abstract class C44075CUs {
    public static C61082JwK parseFromJson(16F r7) {
        String A00;
        0qQ.A0B(r7, 0);
        try {
            Boolean bool = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            User user = null;
            while (true) {
                16L A1J = r7.A1J();
                16L r1 = 16L.A09;
                A00 = C273654mx.A00(2908);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r7);
                if (A00.equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else {
                    user = C41846B3n.A0a(r7, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                r7.A0z();
            }
            if (bool == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r7, "BirthdayConnectionInfo");
            } else if (user != null || !(r7 instanceof 0c9)) {
                return new C61082JwK(bool.booleanValue(), user, 6);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r7, "BirthdayConnectionInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
