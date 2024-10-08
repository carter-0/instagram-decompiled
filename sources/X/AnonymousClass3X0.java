package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.3X0  reason: invalid class name */
public final class AnonymousClass3X0 {
    public static final AnonymousClass3X0 A00 = new Object();

    public final Reel A00(UserSession userSession, 1Xj r6, AnonymousClass3W1 r7) {
        User A2A = r6.A2A(userSession);
        if (r6.A4j() || r6.A4b() || C231122qu.A0P(userSession, r6) || A2A == null) {
            return null;
        }
        1sy r2 = r7.A0o;
        if (r2 != 1sy.A0H && r2 != 1sy.A0A && r2 != 1sy.A0U && r2 != 1sy.A0I && r2 != 1sy.A08) {
            return null;
        }
        1OP r0 = 1OP.$redex_init_class;
        return AnonymousClass3PQ.A02(userSession, A2A);
    }
}
