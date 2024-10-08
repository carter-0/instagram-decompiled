package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CoE  reason: case insensitive filesystem */
public abstract class C44975CoE {
    public static C42135BIq parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            Long l = null;
            User user = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("amount".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("timestamp".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r6);
                } else {
                    user = C41846B3n.A0a(r6, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                r6.A0z();
            }
            return new C42135BIq(user, l, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
