package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class DcS {
    public static final boolean A00(UserSession userSession, boolean z) {
        0Tu r3;
        0Tu r2;
        0qQ.A0B(userSession, 0);
        if (z) {
            r3 = 0Tu.A05;
        } else {
            r3 = 0Tu.A06;
        }
        if (!DbY.A1Z(r3, userSession, 36325261431550762L)) {
            return false;
        }
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        if (A0Q.A1x()) {
            return true;
        }
        if (!A0Q.A20()) {
            return false;
        }
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        return DbY.A1Z(r2, userSession, 36325261431616299L);
    }

    public static final boolean A01(UserSession userSession, boolean z) {
        0Tu r2;
        0qQ.A0B(userSession, 0);
        if (!A00(userSession, z)) {
            return false;
        }
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        return DbY.A1Z(r2, userSession, 36325261431681836L);
    }
}
