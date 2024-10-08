package X;

import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* renamed from: X.VAu  reason: case insensitive filesystem */
public abstract class C16917VAu {
    public static final boolean A00(UserSession userSession, Long l) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        0Tu r5 = 0Tu.A06;
        boolean A06 = 182.A06(r5, userSession, 36312187551548363L);
        if (l == null) {
            l = AnonymousClass7TF.A0Y(r5, userSession, 36593662529439181L);
        }
        long longValue = l.longValue();
        if (!A06) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession2, 36312187552269267L)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (new BitSet(0).nextClearBit(0) >= 0) {
                C11844ShW shW = new C11844ShW("com.bloks.www.async.components.CPDPScreenQuery", (String) null, (String) null, 0Yt.A0B(linkedHashMap), 0Yt.A0E(), 719983200, longValue, true);
                WF5 wf5 = new WF5((C17668Vbz) null, (C277014uI) null, (Boolean) null, (Integer) null);
                C307506Qj A00 = C48721Ej6.A00(userSession2, false);
                0qQ.A0B(A00, 2);
                shW.E3a(wf5, A00, (JPG) null, false);
            } else {
                throw new IllegalStateException("Missing required params");
            }
        } else {
            C359638dF.A03(C64361Kj.A00().A00, new C359618dD(userSession2), "com.bloks.www.bloks.cxf.cpdp", (String) null, C359608dC.A01(DbX.A0v()), longValue);
        }
        if (!182.A06(r2, userSession2, 36312187553973227L) || !182.A06(r2, userSession2, 36312187553907690L)) {
            return true;
        }
        C359638dF.A03(C64361Kj.A00().A00, new C359618dD(userSession2), "com.bloks.www.bloks.cxf.cpdp.browseheavy", (String) null, C359608dC.A01(DbX.A0v()), longValue);
        return true;
    }
}
