package X;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.RSg  reason: case insensitive filesystem */
public abstract class C9180RSg {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        List list = r8.A00;
        Object obj = list.get(0);
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) obj;
        C277014uI A0R = DbV.A0R(list, 1);
        C277014uI A0R2 = DbV.A0R(list, 2);
        1KZ.A01("Inflate");
        try {
            Q4O q4o = new Q4O(C64361Kj.A00().A04, r7, AnonymousClass7TF.A0u(map));
            q4o.Crg();
            C276544tV r0 = (C276544tV) C276524tT.A01((C276484tP) null, q4o);
            if (A0R != null) {
                AnonymousClass6Tm A0Q = DbY.A0Q(r0);
                0qQ.A0B(A0Q, 2);
                try {
                    AnonymousClass6Tn.A00(r7, A0Q, A0R);
                } catch (AnonymousClass6QV e) {
                    1Kn.A00((C307786Rm) null, "BKBloksActionBloksInflateImpl", 002.A0R("Exception while executing ", "SuccessCallback"), e);
                }
            }
        } catch (IOException unused) {
            if (A0R2 != null) {
                AnonymousClass6Tm r02 = AnonymousClass6Tm.A01;
                0qQ.A08(r02);
                try {
                    AnonymousClass6Tn.A00(r7, r02, A0R2);
                } catch (AnonymousClass6QV e2) {
                    1Kn.A00((C307786Rm) null, "BKBloksActionBloksInflateImpl", 002.A0R("Exception while executing ", "FailureCallback"), e2);
                }
            }
        } catch (Throwable th) {
            1KZ.A00();
            throw th;
        }
        1KZ.A00();
        return null;
    }
}
