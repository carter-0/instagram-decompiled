package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.431  reason: invalid class name */
public abstract class AnonymousClass431 {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return A02(userSession, 0eE.A00(userSession).A00());
    }

    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        User A00 = 0eE.A00(userSession).A00();
        if (A00.CPm() || (A00.A0J() == 16V.A05 && 182.A06(0Tu.A05, userSession, 36319729513733709L))) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, User user) {
        return user.CPm() || (user.A0J() == 16V.A05 && 182.A06(0Tu.A05, userSession, 36319729513668172L));
    }
}
