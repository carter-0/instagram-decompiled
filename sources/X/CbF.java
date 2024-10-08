package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.OriginalitySourceMediaInfoImpl;
import com.instagram.user.model.User;
import java.io.IOException;

public abstract class CbF {
    public static OriginalitySourceMediaInfoImpl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            User user = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (!"pk".equals(A17)) {
                    user = C41846B3n.A0a(r5, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                } else if (r5.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r5.A1P();
                }
                r5.A0z();
            }
            return new OriginalitySourceMediaInfoImpl(user, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
