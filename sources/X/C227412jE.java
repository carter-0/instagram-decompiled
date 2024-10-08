package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2jE  reason: invalid class name and case insensitive filesystem */
public final class C227412jE {
    public final boolean A00(UserSession userSession) {
        if (!1Au.A00(userSession).A1n() || !A01(userSession, false)) {
            return false;
        }
        return true;
    }

    public final boolean A01(UserSession userSession, boolean z) {
        boolean A06;
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36322508357642468L)) {
            if (z) {
                A06 = 182.A06(0Tu.A05, userSession, 36322508357511394L);
            } else {
                A06 = 182.A06(r2, userSession, 36322508357511394L);
                0qQ.A0A(Boolean.valueOf(A06));
            }
            if (!A06) {
                return false;
            }
            return true;
        }
        return false;
    }
}
