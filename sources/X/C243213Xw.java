package X;

import com.instagram.api.schemas.MomentAdsTypeEnum;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Xw  reason: invalid class name and case insensitive filesystem */
public final class C243213Xw {
    public static final C243213Xw A00 = new Object();

    public static final boolean A00(C267324bN r2, UserSession userSession) {
        1Xj r0;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r2, 1);
        if (!r2.A0G.CcK() || (r0 = r2.A02) == null || !A03(userSession, r0)) {
            return false;
        }
        return true;
    }

    public static final boolean A06(1Xj r3) {
        String BF3;
        C250513lZ injected = r3.A0C.getInjected();
        if (injected == null || (BF3 = injected.BF3()) == null || !(!00l.A0W(BF3))) {
            return false;
        }
        return true;
    }

    public static final boolean A09(1Xj r3) {
        1Xj A1c;
        if ((!r3.A3P().isEmpty()) || (r3.A5D() && (A1c = r3.A1c(0)) != null && (!A1c.A3P().isEmpty()))) {
            return true;
        }
        return false;
    }

    public static final boolean A07(1Xj r1) {
        C250513lZ injected = r1.A0C.getInjected();
        if (injected != null) {
            return 0qQ.A0K(injected.CQb(), true);
        }
        return false;
    }

    public static final boolean A08(1Xj r1) {
        boolean z;
        C250513lZ injected = r1.A0C.getInjected();
        if (injected != null) {
            z = 0qQ.A0K(injected.CUv(), true);
        } else {
            z = false;
        }
        return !z;
    }

    private final boolean A01(UserSession userSession, 1Xj r5) {
        if (!r5.CcK() || !r5.A6T(userSession)) {
            return false;
        }
        if (r5.A0C.BU1() == MomentAdsTypeEnum.IG_OPTIONAL_ONLINE_EVENT_WITH_REMIND_ME_CTA && 182.A06(0Tu.A05, userSession, 36323655114108267L)) {
            return true;
        }
        if (r5.A0C.BU1() != MomentAdsTypeEnum.IG_OPTIONAL_ONLINE_EVENT_WITH_REMIND_ME_CTA_FALLBACK || A09(r5)) {
            return false;
        }
        if (!A07(r5) || A05(userSession, r5)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, 1Xj r4) {
        if (!r4.CcK() || r4.A0C.BU1() == MomentAdsTypeEnum.IG_ONLINE_EVENT || A00.A01(userSession, r4) || r4.A27(userSession) == null) {
            return false;
        }
        if (!A07(r4) || A05(userSession, r4)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, 1Xj r3) {
        if (!r3.CcK() || ((r3.A0C.BU1() != MomentAdsTypeEnum.IG_ONLINE_EVENT && !A00.A01(userSession, r3)) || !r3.A6T(userSession))) {
            return false;
        }
        return true;
    }

    public static final boolean A04(UserSession userSession, 1Xj r2) {
        if (A03(userSession, r2) || A02(userSession, r2)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession, 1Xj r4) {
        long j;
        if (!A07(r4)) {
            return false;
        }
        boolean A08 = A08(r4);
        0Tu r2 = 0Tu.A05;
        if (A08) {
            j = 2342169404516939514L;
        } else {
            j = 2342169404516873977L;
        }
        return 182.A06(r2, userSession, j);
    }
}
