package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Ceo  reason: case insensitive filesystem */
public abstract class C44430Ceo {
    public static BHC parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            Integer num = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Integer num2 = null;
            User user = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("answer".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else if ("ts".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r5);
                } else {
                    user = C41846B3n.A0a(r5, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                r5.A0z();
            }
            return new BHC(user, num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
