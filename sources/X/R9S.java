package X;

import java.util.HashMap;
import java.util.Map;

public final class R9S extends C270864hR {
    public static final SGJ A01 = new Object();
    public Map A00 = 0Yt.A0E();

    public static final R9S A00(16F r6) {
        long currentMonotonicTimestamp = 02m.A0p.currentMonotonicTimestamp();
        R9S r9s = new R9S();
        HashMap A012 = C276514tS.A01(new C276414tI(r6));
        r9s.A00 = A012;
        C12784T6t t6t = new C12784T6t(r6, AnonymousClass7TF.A0s(A012));
        t6t.Crg();
        C246643ew r2 = C276454tM.A00((C276484tP) null, t6t).A00;
        if (r2 != null) {
            long currentMonotonicTimestamp2 = 02m.A0p.currentMonotonicTimestamp();
            r9s.A02 = r2;
            r9s.A01 = currentMonotonicTimestamp;
            r9s.A00 = currentMonotonicTimestamp2;
            return r9s;
        }
        throw JTO.A0u(C273654mx.A00(2339));
    }
}
