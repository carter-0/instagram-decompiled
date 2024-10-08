package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;

public final class F1K {
    public final boolean A00(UserSession userSession, 2FW r15, boolean z) {
        0Tu r2;
        0Tu r22;
        1Av A00 = 1Au.A00(userSession);
        boolean A1a = AnonymousClass7TG.A1a(A00, A00.A3F, 1Av.A8a, 377);
        if (0sr.A1P(new 2FW[]{2FW.A1T, 2FW.A1y, 2FW.A0W, 2FW.A1p, 2FW.A1e, 2FW.A20, 2FW.A1D, 2FW.A1v, 2FW.A1O, 2FW.A1w}).contains(r15) && !A1a) {
            HashMap A02 = 1Av.A02(A00, "external_sharing_share_option_timestamp_map");
            double A01 = DbS.A01();
            if (!A02.isEmpty()) {
                Iterator A0s = AnonymousClass7TF.A0s(A02);
                while (true) {
                    if (A0s.hasNext()) {
                        if (A01 - ((Number) AnonymousClass7TE.A1J(A0s).getValue()).doubleValue() < 7.776E9d) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                r2 = 0Tu.A05;
            } else {
                r2 = 0Tu.A06;
            }
            boolean A1Z = DbY.A1Z(r2, userSession, 36328826254540401L);
            if (z) {
                r22 = 0Tu.A05;
            } else {
                r22 = 0Tu.A06;
            }
            boolean A1Z2 = DbY.A1Z(r22, userSession, 36328826254474864L);
            if (A1Z || A1Z2) {
                return true;
            }
        }
        return false;
    }
}
