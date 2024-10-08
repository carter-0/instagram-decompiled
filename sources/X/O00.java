package X;

import com.instagram.common.session.UserSession;

public abstract class O00 {
    public static final boolean A00(UserSession userSession, AnonymousClass7OR r7, String str) {
        0Tu r2;
        long j;
        0qQ.A0B(r7, 0);
        boolean A0Z = 00l.A0Z(str, '/');
        boolean A0Z2 = 00l.A0Z(str, '@');
        int ordinal = r7.ordinal();
        if (ordinal == 1) {
            if (!A0Z) {
                if (!A0Z2) {
                    return false;
                }
                r2 = 0Tu.A05;
                j = 36315795324800558L;
            }
            return true;
        } else if (ordinal == 0) {
            if (!A0Z2) {
                String A12 = DbV.A12(str);
                if ((A12 == null || !A12.equalsIgnoreCase("meta")) && (A12 == null || !A12.equalsIgnoreCase("ai"))) {
                    return false;
                }
                r2 = 0Tu.A05;
                j = 36328366692908317L;
            }
            return true;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        if (182.A06(r2, userSession, j)) {
            return true;
        }
        return false;
    }
}
