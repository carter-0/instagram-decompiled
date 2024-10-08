package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HeV  reason: case insensitive filesystem */
public abstract class C55240HeV {
    public static final boolean A00(UserSession userSession, HN0 hn0) {
        0qQ.A0B(userSession, 0);
        int ordinal = hn0.ordinal();
        0xa A03 = 1Al.A01(userSession).A03(1An.A0I);
        switch (ordinal) {
            case 0:
            case 5:
                boolean A1R = AnonymousClass7TF.A1R(((System.currentTimeMillis() - DbW.A06(A03, hn0.A01)) > 86400000 ? 1 : ((System.currentTimeMillis() - DbW.A06(A03, hn0.A01)) == 86400000 ? 0 : -1)));
                boolean A1T = AnonymousClass7TF.A1T(A03.getInt(hn0.A02, 0), hn0.A00);
                if (!A1R || !A1T) {
                    return false;
                }
                return true;
            default:
                if (A03.getInt(hn0.A02, 0) < hn0.A00) {
                    return true;
                }
                return false;
        }
    }
}
