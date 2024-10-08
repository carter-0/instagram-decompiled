package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3b7  reason: invalid class name and case insensitive filesystem */
public abstract class C244393b7 {
    public static final boolean A00(UserSession userSession, 1Xj r2, String str) {
        String BNG;
        0qQ.A0B(r2, 1);
        User A2A = r2.A2A(userSession);
        if (A2A == null || (BNG = A2A.A03.BNG()) == null || BNG.length() == 0) {
            return false;
        }
        if ("topical_explore".equals(str) || "contextual_feed".equals(str) || "main_feed".equals(str)) {
            return true;
        }
        return false;
    }
}
