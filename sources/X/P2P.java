package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class P2P implements C74394PuA {
    public final UserSession A00;
    public final N4P A01;
    public final C67350MmR A02;

    public P2P(UserSession userSession, N4P n4p, C67350MmR mmR) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = n4p;
        this.A02 = mmR;
    }

    public final boolean isEnabled() {
        return true;
    }

    public final List getItems() {
        C329997La r0 = C329997La.A00;
        UserSession userSession = this.A00;
        N4P n4p = this.A01;
        return C330397Mp.A04(userSession, n4p, this.A02, !r0.A08(userSession, n4p));
    }
}
