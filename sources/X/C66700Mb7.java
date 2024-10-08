package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mb7  reason: case insensitive filesystem */
public abstract class C66700Mb7 {
    public static final ArrayList A00(UserSession userSession, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C376659Iv r4 = (C376659Iv) it.next();
                Object obj = r4.A01;
                if (((obj == AnonymousClass05K.A0Y || obj == AnonymousClass05K.A1F || obj == AnonymousClass05K.A0j || obj == AnonymousClass05K.A0u || obj == AnonymousClass05K.A15 || obj == AnonymousClass05K.A02 || obj == AnonymousClass05K.A06 || obj == AnonymousClass05K.A05) && A03(userSession)) || ((r4.A01 == AnonymousClass05K.A0N && 182.A06(0Tu.A05, userSession, 36312926285530666L)) || ((r4.A01 == AnonymousClass05K.A1I && 182.A06(0Tu.A05, userSession, 36320455363207649L)) || ((r4.A01 == AnonymousClass05K.A03 && A03(userSession) && 182.A06(0Tu.A05, userSession, 36316830411723430L)) || (r4.A01 == AnonymousClass05K.A04 && A03(userSession) && 182.A06(0Tu.A05, userSession, 36316830411788967L)))))) {
                    arrayList.add(r4);
                }
            }
        }
        return arrayList;
    }

    public static final boolean A02(UserSession userSession) {
        if (!AnonymousClass0t1.A01.A01(userSession).A2L() || 182.A06(0Tu.A05, userSession, 36315340057087118L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        boolean A03 = A03(userSession);
        0Tu r2 = 0Tu.A05;
        if (A03) {
            return DbY.A1Z(r2, userSession, 2342159839625351845L);
        }
        return AnonymousClass7TF.A1Q(182.A06(r2, userSession, 36322418163263662L) ? 1 : 0);
    }

    public static final boolean A03(UserSession userSession) {
        if (AnonymousClass431.A01(userSession)) {
            return true;
        }
        if (!2Ek.A01(DbT.A0j(userSession)) || !182.A06(0Tu.A05, userSession, 36316830411002524L)) {
            return false;
        }
        return true;
    }
}
