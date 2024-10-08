package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

public abstract class D2J {
    public static C42139BIu parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            Integer num = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            User user = null;
            Float f = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("ts".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if (C41845B3m.A1B(A17)) {
                    user = C41845B3m.A0a(r6, false);
                } else if ("vote".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r6);
                }
                r6.A0z();
            }
            return new C42139BIu(user, f, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C42139BIu bIu) {
        r2.A0c();
        Integer num = bIu.A02;
        if (num != null) {
            r2.A0P("ts", num.intValue());
        }
        User user = bIu.A00;
        if (user != null) {
            C41845B3m.A0w(r2, user, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        }
        Float f = bIu.A01;
        if (f != null) {
            r2.A0O("vote", f.floatValue());
        }
        r2.A0Z();
    }
}
