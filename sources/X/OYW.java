package X;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class OYW {
    public static final C73540PeW A00 = new C73540PeW("CALL_ENDED_NO_OP_STORE", C70908ORd.A00(N4A.A02, (0sP) null, C74196Pqc.A00));
    public static final OYW A01 = new Object();
    public static final Map A02 = new ConcurrentHashMap();
    public static final Set A03 = DbS.A0y();

    public static final C73540PeW A00(String str) {
        C73540PeW peW;
        int i;
        0qQ.A0B(str, 0);
        0fh.A01("RpStores.getStoreForLocalCallId", -524061286);
        try {
            Set set = A03;
            if (set.contains(str)) {
                peW = A00;
            } else {
                peW = (C73540PeW) A02.get(str);
            }
            if (peW == null) {
                synchronized (A01) {
                    if (set.contains(str)) {
                        peW = A00;
                        i = 1226204948;
                    } else {
                        Map map = A02;
                        peW = (C73540PeW) map.get(str);
                        if (peW != null) {
                            i = 270771411;
                        } else {
                            C71004OWb.A00.A00("RpStores", 002.A0R("Creating store for ", str));
                            JGB jgb = new JGB(new 0sL[]{C73608Pgj.A00, C73609Pgk.A00}, 47);
                            N4A n4a = new N4A((C69662Npk) null, 0Yt.A0E());
                            ArrayList A0v = DbS.A0v(1);
                            A0v.add(C70365O3r.A00);
                            C59628JQw A002 = C70908ORd.A00(n4a, new C73943PmN(str, A0v, 6), jgb);
                            0qQ.A0C(A002, "null cannot be cast to non-null type com.facebook.rp.platform.statemanagement.RpStore");
                            peW = (C73540PeW) A002;
                            map.put(str, peW);
                        }
                    }
                }
                0fh.A00(i);
                return peW;
            } else if (peW.equals(A00)) {
                C71004OWb.A00.A04("RpStores", 002.A0R("Accessing an RpStore after the Call has ended & UI is finished. localCallId=", str), (Throwable) null);
            }
            i = 894498819;
            0fh.A00(i);
            return peW;
        } catch (Throwable th) {
            0fh.A00(-1402391769);
            throw th;
        }
    }
}
