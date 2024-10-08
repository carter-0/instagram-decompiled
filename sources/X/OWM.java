package X;

import com.instagram.common.session.UserSession;

public final class OWM {
    public static final OWM A00 = new Object();

    public final void A00(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 0);
        0Aj A0B = C66584MXp.A0B(userSession);
        if (A0B.isSampled()) {
            C66584MXp.A0x(A0B, "attempt_unlock", str, str2);
        }
    }

    public final void A01(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 0);
        0Aj A0B = C66584MXp.A0B(userSession);
        if (A0B.isSampled()) {
            C66584MXp.A0x(A0B, "failure_unlock", str, str2);
        }
    }

    public final void A02(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 0);
        0Aj A0B = C66584MXp.A0B(userSession);
        if (A0B.isSampled()) {
            C66584MXp.A0x(A0B, "success_unlock", str, str2);
        }
    }
}
