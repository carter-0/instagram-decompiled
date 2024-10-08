package X;

import java.io.IOException;
import java.util.Map;

public abstract class Q4P {
    public static final Object A00(C307896Rx r3, AnonymousClass6Tm r4) {
        Object obj;
        Object A0e = DbW.A0e(r4);
        0qQ.A0C(A0e, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) A0e;
        1KZ.A01("InflateSync");
        try {
            Q4O q4o = new Q4O(C64361Kj.A00().A04, r3, AnonymousClass7TF.A0u(map));
            q4o.Crg();
            obj = C276524tT.A01((C276484tP) null, q4o);
        } catch (IOException e) {
            1Kn.A03("inflate_sync_error", e);
            obj = null;
        } catch (Throwable th) {
            1KZ.A00();
            throw th;
        }
        1KZ.A00();
        return obj;
    }
}
