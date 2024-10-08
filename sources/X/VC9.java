package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

public abstract class VC9 {
    public static final 1OC A00(UserSession userSession, String str, String str2) {
        1NY A0M = DbZ.A0M(userSession);
        A0M.A0A("survey/get/");
        C13989Tnp.A1N(A0M, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A0M.A0G("extra_data_token", str2);
        return DbU.A0S(A0M, C15257UXr.class, DDj.class);
    }
}
