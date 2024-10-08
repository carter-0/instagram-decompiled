package X;

import com.facebook.msys.mci.AccountSession;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;

/* renamed from: X.45R  reason: invalid class name */
public abstract class AnonymousClass45R {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        MsysActiveUserSession A00 = 1y0.A00(userSession);
        if (09i.A0A.A09(userSession) || A00.A05(AccountSession.class)) {
            return true;
        }
        return false;
    }
}
