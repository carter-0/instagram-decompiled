package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

public abstract class VEK {
    public static final 1OC A00(UserSession userSession, Integer num, String str) {
        0qQ.A0B(userSession, 2);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("discover/dismiss_suggestion/");
        A0a.A9m("target_id", str);
        DbX.A1M(A0a, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, VEL.A00(num));
        return A0a.A0M();
    }
}
