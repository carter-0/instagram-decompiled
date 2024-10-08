package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.OIp  reason: case insensitive filesystem */
public final class C70732OIp {
    public final boolean A00(UserSession userSession, N4P n4p, boolean z) {
        boolean A05;
        0Tu r2;
        if (!n4p.A0v || A05 || n4p.A0n || n4p.A09 == 1012 || (n4p.A08() instanceof MsysThreadId) || N4P.A00(n4p) != 1 || N4P.A01(n4p).A2R()) {
            return false;
        }
        if (C66640Ma9.A06(JTO.A15(n4p.A0c), n4p.A0C(), (A05 = N4P.A05(n4p)))) {
            return false;
        }
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        if (DbY.A1Z(r2, userSession, 36321735263397540L)) {
            return true;
        }
        return false;
    }
}
