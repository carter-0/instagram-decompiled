package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

public abstract class CYD {
    public static C47198Dsk parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            User user = null;
            String str = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (!"reel_pk".equals(A17)) {
                    user = C41846B3n.A0a(r7, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                } else if (r7.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r7.A1P();
                }
                r7.A0z();
            }
            if (user != null || !(r7 instanceof 0c9)) {
                return new C47198Dsk(user, str);
            }
            AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r7, "GroupMentionStickerMentionedUser");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
