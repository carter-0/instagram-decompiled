package X;

import com.instagram.common.session.UserSession;

public abstract class RUP {
    public static final boolean A00(1yd r3, boolean z) {
        0Tu r2;
        0Tu r22;
        0qQ.A0B(r3, 0);
        UserSession userSession = r3.A00;
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        if (!DbY.A1Z(r2, userSession, 36322860550531692L)) {
            if (z) {
                r22 = 0Tu.A05;
            } else {
                r22 = 0Tu.A06;
            }
            if (DbY.A1Z(r22, userSession, 36322860550335081L)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
