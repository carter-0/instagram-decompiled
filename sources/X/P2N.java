package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class P2N implements C74394PuA {
    public final UserSession A00;
    public final N4P A01;

    public P2N(UserSession userSession, N4P n4p) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = n4p;
    }

    public final boolean isEnabled() {
        List list;
        N4P n4p = this.A01;
        if (n4p.A09 != 29) {
            return false;
        }
        String str = this.A00.A06;
        if (n4p.A0S.contains(str)) {
            return true;
        }
        C242243Te r0 = n4p.A0E;
        if (r0 == null || (list = r0.A0E) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public final List getItems() {
        return AnonymousClass7TE.A1I(new FGF(2131958934));
    }
}
