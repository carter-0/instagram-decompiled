package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class ORH {
    public static final boolean A00(UserSession userSession, User user) {
        AnonymousClass7TG.A1N(user, userSession);
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        if (A01(userSession, user) || C66582MXn.A1T(A0Q, user)) {
            return true;
        }
        if (user.A03.Ak2() == null) {
            return false;
        }
        Boolean Ak2 = user.A03.Ak2();
        if (Ak2 == null || !Ak2.booleanValue()) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, User user) {
        Boolean Cd0;
        AnonymousClass7TG.A1N(user, userSession);
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        if (user.A03.Cd0() != null && (Cd0 = user.A03.Cd0()) != null && !Cd0.booleanValue() && !C66582MXn.A1T(A0Q, user)) {
            return true;
        }
        if (A0Q.A0N() != AnonymousClass05K.A0C || user.A2A() || C66582MXn.A1T(A0Q, user)) {
            return false;
        }
        return true;
    }
}
