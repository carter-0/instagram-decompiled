package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mcj  reason: case insensitive filesystem */
public final class C66797Mcj {
    public static final C66797Mcj A00 = new Object();

    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!new AnonymousClass630(userSession).A02.A01(1)) {
            return false;
        }
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36325897086842200L) || 182.A06(r2, userSession, 36325897086776663L)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, boolean z) {
        0Tu r2;
        0Tu r22;
        0qQ.A0B(userSession, 0);
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        if (!182.A06(r2, userSession, 36325897086842200L)) {
            if (z) {
                r22 = 0Tu.A05;
            } else {
                r22 = 0Tu.A06;
            }
            if (182.A06(r22, userSession, 36325897086776663L)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, boolean z) {
        long j;
        0qQ.A0B(userSession, 0);
        if (!new AnonymousClass630(userSession).A02.A01(1)) {
            return false;
        }
        0Tu r2 = 0Tu.A06;
        if (z) {
            j = 36325897086776663L;
        } else {
            j = 36325897086842200L;
        }
        if (182.A06(r2, userSession, j)) {
            return true;
        }
        return false;
    }
}
