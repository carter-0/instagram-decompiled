package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Ccn  reason: case insensitive filesystem */
public abstract class C44305Ccn {
    public static BGA parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C266544Zk r4 = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Boolean bool = null;
            User user = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("recs_from_friend_card".equals(A17)) {
                    r4 = C266534Zj.parseFromJson(r5);
                } else if ("target_following_status".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r5);
                } else {
                    user = C41846B3n.A0a(r5, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                r5.A0z();
            }
            return new BGA(r4, user, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
