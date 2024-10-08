package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

public abstract class I2T {
    public static final C54643HMa A00(UserSession userSession) {
        Object obj;
        String A04 = 182.A04(C51968G9o.A0b(userSession), userSession, 36882189844218296L);
        Iterator it = C54643HMa.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((C54643HMa) obj).A00, A04)) {
                break;
            }
        }
        C54643HMa hMa = (C54643HMa) obj;
        if (hMa == null) {
            return C54643HMa.A04;
        }
        return hMa;
    }

    public static final C54644HMb A01(UserSession userSession) {
        Object obj;
        String A04 = 182.A04(C51968G9o.A0b(userSession), userSession, 36882189842579892L);
        Iterator it = C54644HMb.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((C54644HMb) obj).A00, A04)) {
                break;
            }
        }
        C54644HMb hMb = (C54644HMb) obj;
        if (hMb == null) {
            return C54644HMb.ABOVE_GRID;
        }
        return hMb;
    }

    public static final boolean A02(UserSession userSession) {
        return 182.A06(C51968G9o.A0b(userSession), userSession, 36319239890410557L);
    }
}
