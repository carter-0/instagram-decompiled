package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Env  reason: case insensitive filesystem */
public abstract class C49019Env {
    public static final boolean A00(UserSession userSession) {
        User A0j = DbT.A0j(userSession);
        if ((2Ek.A00(A0j) || 2Ek.A01(A0j)) && 182.A06(0Tu.A05, userSession, 36317582030542183L)) {
            return true;
        }
        return false;
    }
}
