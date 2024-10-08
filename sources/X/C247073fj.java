package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3fj  reason: invalid class name and case insensitive filesystem */
public abstract class C247073fj {
    public static final boolean A00(UserSession userSession, 1Xj r4) {
        DUW B5U;
        List BGH;
        0qQ.A0B(r4, 0);
        if (!r4.A1e(userSession).CcK() || r4.A1G() == null || (r4.A5S() && ((B5U = r4.A0C.B5U()) == null || (BGH = B5U.BGH()) == null || BGH.isEmpty()))) {
            return false;
        }
        return 182.A06(0Tu.A05, userSession, 36318642886941018L);
    }

    public static final boolean A01(GQ0 gq0, double d, double d2, double d3, double d4) {
        float f = gq0.A04;
        float f2 = gq0.A05;
        double d5 = (double) f;
        if (d5 >= d) {
            double d6 = (double) f2;
            if (d6 < d2 || d5 > d3 || d6 > d4) {
                return false;
            }
            return true;
        }
        return false;
    }
}
