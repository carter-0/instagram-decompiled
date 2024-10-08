package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CrK  reason: case insensitive filesystem */
public abstract class C45157CrK {
    /* JADX WARNING: type inference failed for: r0v5, types: [X.CU1, java.lang.Object] */
    public static CU1 parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            User user = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r6, PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
                    user = C41845B3m.A0a(r6, false);
                }
                r6.A0z();
            }
            if (user != null || !(r6 instanceof 0c9)) {
                ? obj = new Object();
                obj.A00 = user;
                return obj;
            }
            AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r6, "HighProfileUsersModel");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
