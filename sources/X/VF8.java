package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

public abstract class VF8 {
    public static final void A00(AnonymousClass0iw r3, 0wc r4, UserSession userSession, Long l, String str, String str2, String str3, String str4) {
        AnonymousClass7TF.A1E(str, 1, r4);
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(r4, C273654mx.A00(762)), 296);
        if (DbT.A1Y(r2)) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            r2.A0k(str3);
            r2.A0R("container_module", r3.getModuleName());
            r2.A0Q("ig_userid", C263944Ny.A00(userSession.A06).A00);
            r2.A0R("netego_id", str2);
            r2.A0Q(C273654mx.A00(3055), l);
            r2.A0R("tracking_token", str4);
            r2.Cgf();
        }
    }
}
