package X;

import com.instagram.common.session.UserSession;

public final class W07 {
    public final boolean A02(UserSession userSession, 1Xj r6) {
        if (VKF.A00.A04(r6).size() > 1) {
            return false;
        }
        if ((!r6.CcK() && !C51968G9o.A1W(userSession, r6)) || !A00(userSession, r6)) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36316529763094995L) || !182.A06(r2, userSession, 36316529763291604L)) {
            return false;
        }
        return true;
    }

    public final boolean A03(UserSession userSession, 1Xj r6) {
        if (VKF.A00.A04(r6).size() > 1) {
            return false;
        }
        if ((r6.CcK() || C51968G9o.A1W(userSession, r6)) && A01(userSession, r6) && 182.A06(0Tu.A05, userSession, 36316529763488213L)) {
            return true;
        }
        return false;
    }

    public final boolean A04(UserSession userSession, 1Xj r5) {
        0qQ.A0B(userSession, 0);
        if (r5 == null) {
            return true;
        }
        if (VKF.A00.A04(r5).size() > 1) {
            return false;
        }
        if ((r5.CcK() || C51968G9o.A1W(userSession, r5)) && !A01(userSession, r5) && !A00(userSession, r5)) {
            return false;
        }
        return true;
    }

    public static final boolean A00(UserSession userSession, 1Xj r5) {
        C250513lZ injected = r5.A0C.getInjected();
        if (injected == null || !AnonymousClass7TF.A1Y(injected.CPM(), true) || !182.A06(0Tu.A05, userSession, 36316529763094995L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, 1Xj r5) {
        C250513lZ injected = r5.A0C.getInjected();
        if (injected == null || !AnonymousClass7TF.A1Y(injected.Cc3(), true) || !182.A06(0Tu.A05, userSession, 36316529763029458L)) {
            return false;
        }
        return true;
    }
}
