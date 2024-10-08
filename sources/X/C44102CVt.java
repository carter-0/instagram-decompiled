package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CVt  reason: case insensitive filesystem */
public abstract class C44102CVt {
    public static BEK parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Integer num = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            User user = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("audience".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else {
                    user = C41846B3n.A0a(r7, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                r7.A0z();
            }
            if (num == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("audience", r7, "CollabNoteCollaborator");
            } else if (user != null || !(r7 instanceof 0c9)) {
                return new BEK(user, num.intValue());
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r7, "CollabNoteCollaborator");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
