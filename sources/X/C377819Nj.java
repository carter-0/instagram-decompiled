package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Nj  reason: invalid class name and case insensitive filesystem */
public abstract class C377819Nj {
    public static final boolean A05(UserSession userSession, List list) {
        0qQ.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer Bjj = ((AnonymousClass173) it.next()).Bjj();
            if (Bjj != null && Bjj.intValue() == 1) {
                return 182.A06(0Tu.A05, userSession, 36312007162463080L);
            }
        }
        return false;
    }

    public static final boolean A00(UserSession userSession, 2Er r4) {
        if (!r4.CUG()) {
            Iterator it = r4.BRZ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer Bjj = ((AnonymousClass173) it.next()).Bjj();
                if (Bjj != null && Bjj.intValue() == 3) {
                    if (!182.A06(0Tu.A05, userSession, 36312007162528617L)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, 2Er r4) {
        if (!r4.CUG()) {
            Iterator it = r4.BRZ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer Bjj = ((AnonymousClass173) it.next()).Bjj();
                if (Bjj != null && Bjj.intValue() == 4) {
                    if (!182.A06(0Tu.A05, userSession, 36312007162528617L)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, 2Er r2) {
        if (r2.CUG() || r2.CVr() || !A05(userSession, r2.BRZ())) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession, 2Er r2) {
        if (r2.CUG() || !r2.CVr() || !A05(userSession, r2.BRZ())) {
            return false;
        }
        return true;
    }

    public static final boolean A04(UserSession userSession, 2Er r2) {
        if (A02(userSession, r2) || A03(userSession, r2) || A01(userSession, r2) || A00(userSession, r2)) {
            return true;
        }
        return false;
    }
}
