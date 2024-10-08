package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.HdO  reason: case insensitive filesystem */
public abstract class C55172HdO {
    public static final boolean A00(UserSession userSession, 1Xj r2, boolean z) {
        User A2A;
        if (!2R8.A02(userSession, r2) ? !((((A2A = r2.A2A(userSession)) == null || A2A.A0N() != AnonymousClass05K.A01) && !z) || r2.CcK() || r2.A54() || r2.A1t() == AnonymousClass3QO.CLOSE_FRIENDS || r2.A1t() == AnonymousClass3QO.OPAL || (r2.A5v() && !r2.A4P())) : !(r2.A1t() == AnonymousClass3QO.CLOSE_FRIENDS || r2.A1t() == AnonymousClass3QO.OPAL)) {
            if (r2.A1u() == 1sw.A04) {
                return false;
            }
            return true;
        }
        return false;
    }
}
