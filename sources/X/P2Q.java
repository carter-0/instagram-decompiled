package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class P2Q implements C74394PuA {
    public final UserSession A00;
    public final C70718OHn A01;
    public final N4P A02;

    public P2Q(UserSession userSession, C70718OHn oHn, N4P n4p) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = n4p;
        this.A01 = oHn;
    }

    public final boolean isEnabled() {
        C70718OHn oHn = this.A01;
        int i = this.A02.A09;
        if (i == 28 || i == 61) {
            if (!182.A06(0Tu.A05, oHn.A05, 36320309334450397L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final List getItems() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Set set = this.A01.A07;
        if (C66580MXl.A1b(set)) {
            C46448DfA.A02(A1C, 2131959983);
            FGF.A01(A1C, 2131959984);
            A1C.addAll(set);
        }
        return A1C;
    }
}
