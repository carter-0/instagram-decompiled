package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.NwD  reason: case insensitive filesystem */
public abstract class C70035NwD {
    public static final void A00(C69481NmP nmP, C69477NmL nmL, UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "direct_thread_null_state_action");
        if (A0e.isSampled()) {
            C66580MXl.A1J(A0e, str);
            DbS.A1N(A0e, "null_state");
            C51965G9l.A19(nmP, A0e);
            A0e.A8M(nmL, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            A0e.Cgf();
        }
    }
}
