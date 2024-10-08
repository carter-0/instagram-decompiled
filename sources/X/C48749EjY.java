package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EjY  reason: case insensitive filesystem */
public abstract class C48749EjY {
    public static final boolean A00(UserSession userSession) {
        User A00;
        Boolean BAx;
        User A002 = AnonymousClass0eD.A00(userSession);
        if (A002 == null || !A002.A2L() || (A00 = AnonymousClass0eD.A00(userSession)) == null || (BAx = A00.A03.BAx()) == null || !BAx.booleanValue()) {
            return false;
        }
        return true;
    }
}
