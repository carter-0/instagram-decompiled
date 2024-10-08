package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ek5  reason: case insensitive filesystem */
public abstract class C48782Ek5 {
    public static final boolean A00(UserSession userSession, 1Xj r5) {
        User A2A = r5.A2A(userSession);
        if (A2A == null) {
            return false;
        }
        if (2R8.A04(userSession, A2A)) {
            return true;
        }
        if (A2A.A0N() == AnonymousClass05K.A0C || A2A.A27()) {
            return false;
        }
        return true;
    }
}
