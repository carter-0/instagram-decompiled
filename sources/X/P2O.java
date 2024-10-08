package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class P2O implements C74394PuA {
    public final UserSession A00;
    public final N4P A01;

    public P2O(UserSession userSession, N4P n4p) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = n4p;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.PR9] */
    public final List getItems() {
        boolean A002 = C66682Map.A00(this.A00, this.A01.A0B);
        C71469OlD olD = new C71469OlD(this, 24);
        ? obj = new Object();
        obj.A04 = 2131959038;
        obj.A01 = 2131959037;
        obj.A0D = A002;
        obj.A08 = olD;
        return AnonymousClass7TE.A1I(obj);
    }

    public final boolean isEnabled() {
        N4P n4p = this.A01;
        UserSession userSession = this.A00;
        if (!n4p.A0v || C66640Ma9.A03(n4p) || n4p.A0B() || JTO.A15(n4p.A0c).isEmpty() || AnonymousClass48O.A04(n4p.A09)) {
            return false;
        }
        C254793t3 r0 = n4p.A0L;
        0qQ.A0B(r0, 0);
        if (!(r0 instanceof C254763t0) || !DbY.A1Z(0Tu.A05, userSession, 36324453977698399L)) {
            return false;
        }
        return true;
    }
}
