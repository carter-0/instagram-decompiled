package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5o9  reason: invalid class name and case insensitive filesystem */
public abstract class C295435o9 {
    public static final boolean A01(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        return 182.A06(r2, userSession, 36326236389127821L) && 182.A06(r2, userSession, 36326236389455503L);
    }

    public static final boolean A00(C250183l2 r2, UserSession userSession, boolean z) {
        0Tu r22;
        if (!(r2 == null || r2.C0O() == null)) {
            if (z) {
                r22 = 0Tu.A05;
            } else {
                r22 = 0Tu.A06;
            }
            boolean A06 = 182.A06(r22, userSession, 36323745308159428L);
            0qQ.A0A(Boolean.valueOf(A06));
            if (!A06) {
                return false;
            }
            return true;
        }
        return false;
    }
}
