package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public abstract class HVY {
    public static final AnonymousClass62P A00(UserSession userSession, 1Xj r10, boolean z, boolean z2, boolean z3) {
        1Xj r5 = r10;
        UserSession userSession2 = userSession;
        boolean z4 = z;
        if (r10.A5D()) {
            List<1Xj> A1I = C51966G9m.A1I(r10);
            if (A1I == null) {
                return null;
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (1Xj A00 : A1I) {
                C299515vK A002 = C299515vK.A00.A00(userSession2, A00, (Double) null, z4, false, false, false);
                if (A002 != null) {
                    A1C.add(A002);
                }
            }
            return AnonymousClass62Q.A00(A1C);
        }
        C299515vK A003 = C299515vK.A00.A00(userSession2, r5, (Double) null, z4, z2, z3, 182.A06(0Tu.A05, userSession, 36327696678337152L));
        if (A003 != null) {
            return AnonymousClass62Q.A04(A003);
        }
        return null;
    }
}
