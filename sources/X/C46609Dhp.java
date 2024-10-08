package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Dhp  reason: case insensitive filesystem */
public abstract class C46609Dhp {
    public static final ArrayList A00(C307896Rx r9, AnonymousClass6Tm r10) {
        Object A0p = DbT.A0p(r10, 0);
        0qQ.A0C(A0p, "null cannot be cast to non-null type java.util.List<kotlin.Any>");
        List list = (List) A0p;
        C277014uI A0N = DbW.A0N(r10);
        ArrayList A1C = AnonymousClass7TE.A1C();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Object obj = list.get(i);
            C308276Tl r0 = new C308276Tl();
            r0.A03(obj, 0);
            Object A00 = C299275ur.A00(r9, r0.A00(), A0N);
            if ((A00 instanceof Number) || (A00 instanceof Boolean)) {
                if (Q0A.A01(A00)) {
                    A1C.add(obj);
                }
                i++;
            } else {
                1Kn.A02("bk.action.array.Filter", "Got non-boolean result while evaluating filter predicate");
                return null;
            }
        }
        return A1C;
    }
}
