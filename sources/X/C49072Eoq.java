package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Eoq  reason: case insensitive filesystem */
public abstract class C49072Eoq {
    public static final boolean A00(UserSession userSession, boolean z) {
        0Tu r2;
        0qQ.A0B(userSession, 0);
        Boolean CS6 = DbX.A0m(userSession).CS6();
        if (CS6 != null && CS6.booleanValue()) {
            if (z) {
                r2 = 0Tu.A06;
            } else {
                r2 = 0Tu.A05;
            }
            if (!182.A06(r2, userSession, 36322821890517458L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
