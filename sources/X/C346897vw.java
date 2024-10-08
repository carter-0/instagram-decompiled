package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7vw  reason: invalid class name and case insensitive filesystem */
public abstract class C346897vw {
    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36322100335880139L);
    }

    public static final boolean A02(UserSession userSession, C279284yO r4) {
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36322100335617991L)) {
            return false;
        }
        if ((r4 instanceof AnonymousClass80O) && 182.A06(r2, userSession, 36322100335683528L)) {
            return true;
        }
        if ((r4 instanceof AnonymousClass9QA) && 182.A06(r2, userSession, 36322100335749065L)) {
            return true;
        }
        if (!(r4 instanceof AnonymousClass80M) || !182.A06(r2, userSession, 36322100335814602L)) {
            return false;
        }
        return true;
    }

    public static final double A00(UserSession userSession) {
        return 182.A00(0Tu.A05, userSession, 37166525266067889L);
    }
}
