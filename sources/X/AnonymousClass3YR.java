package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3YR  reason: invalid class name */
public abstract class AnonymousClass3YR {
    public static final boolean A01(UserSession userSession) {
        return 0eE.A00(userSession).A00().A0N() == AnonymousClass05K.A01 && !0eE.A00(userSession).A00().A2L();
    }

    public static final boolean A04(UserSession userSession, 1Xj r5) {
        User A2A;
        if (r5.A0C.AaD() != null || r5.A5M() || r5.A1t() == AnonymousClass3QO.OPAL) {
            return false;
        }
        if ((!0qQ.A0K(AnonymousClass0t1.A01.A01(userSession), r5.A2A(userSession)) || (A2A = r5.A2A(userSession)) == null || !A2A.A1M()) && !A03(userSession, r5)) {
            return false;
        }
        return true;
    }

    public static final boolean A06(UserSession userSession, 1Xj r5, Integer num, boolean z) {
        0Tu r2;
        0Tu r22;
        long j;
        0Tu r23;
        0Tu r24;
        User A2A;
        0qQ.A0B(userSession, 0);
        if ((!0qQ.A0K(0eE.A00(userSession).A00(), r5.A2A(userSession)) || (A2A = r5.A2A(userSession)) == null || !A2A.A1P()) && !r5.A4N() && !0qQ.A0K(r5.A0C.AoT(), true) && !A03(userSession, r5)) {
            if (!A01(userSession) || !0qQ.A0K(0eE.A00(userSession).A00(), r5.A2A(userSession))) {
                return false;
            }
            if (num != AnonymousClass05K.A0C && num != AnonymousClass05K.A01 && num != AnonymousClass05K.A0Y && (!A01(userSession) || !182.A06(0Tu.A06, userSession, 36321803983333149L))) {
                return false;
            }
            if (r5.A67()) {
                if (z) {
                    r22 = 0Tu.A05;
                } else {
                    r22 = 0Tu.A06;
                }
                j = 36321803983071002L;
            } else if (r5.A5Y()) {
                if (z) {
                    r24 = 0Tu.A05;
                } else {
                    r24 = 0Tu.A06;
                }
                j = 36321803982874391L;
            } else if (r5.A5G()) {
                if (z) {
                    r23 = 0Tu.A05;
                } else {
                    r23 = 0Tu.A06;
                }
                j = 36321803983005465L;
            } else if (!r5.A5V() && !r5.A5p() && !r5.A56()) {
                return false;
            } else {
                if (z) {
                    r2 = 0Tu.A05;
                } else {
                    r2 = 0Tu.A06;
                }
                j = 36321803982939928L;
            }
            if (182.A06(r22, userSession, j)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A00(C267324bN r4) {
        AnonymousClass1i4 r1;
        String str;
        String str2;
        boolean z;
        1Xj r0 = r4.A02;
        String str3 = null;
        if (r0 != null) {
            r1 = r0.A0c;
            str = r1.A07;
            str2 = r1.A01;
            str3 = r1.A06;
        } else {
            r1 = null;
            str = null;
            str2 = null;
        }
        if (r1 != null) {
            z = r1.A09;
        } else {
            z = false;
        }
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || 0qQ.A0K(str3, "EXPIRED") || !z) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36330329493029437L) || 182.A06(r2, userSession, 36320781780656989L)) {
            return true;
        }
        if (!A01(userSession) || !182.A06(r2, userSession, 36321803983333149L) || !182.A06(0Tu.A05, userSession, 36321803983136539L)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession, 1Xj r4) {
        0eE r2 = AnonymousClass0t1.A01;
        if (!0qQ.A0K(r2.A01(userSession), r4.A2A(userSession)) || r4.A29() == null || r4.A5v() || r2.A01(userSession).A2K()) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession, 1Xj r3, 1sy r4, Integer num, boolean z) {
        if (r4 == 1sy.A0O || ((!A04(userSession, r3) && !A06(userSession, r3, num, z)) || ((r3.CcK() && !r3.A5B()) || r3.A0C.Aqj() != null || r3.A0C.BAG() != null))) {
            return false;
        }
        return true;
    }
}
