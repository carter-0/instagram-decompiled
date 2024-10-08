package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CXa  reason: case insensitive filesystem */
public abstract class C44135CXa {
    public static C61103JxE parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            User user = null;
            Boolean bool = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("formatted_subscription_start_date".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("is_free_trial".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else {
                    user = C41846B3n.A0a(r9, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("formatted_subscription_start_date", r9, "FanClubMemberImpl");
            } else if (user != null || !(r9 instanceof 0c9)) {
                return new C61103JxE(user, bool, str);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r9, "FanClubMemberImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
