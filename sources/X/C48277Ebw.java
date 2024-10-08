package X;

import java.util.List;

/* renamed from: X.Ebw  reason: case insensitive filesystem */
public abstract class C48277Ebw {
    public static final Integer A00(C307896Rx r6, AnonymousClass6Tm r7) {
        Object A03 = r7.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type java.util.List<kotlin.Any>");
        List list = (List) A03;
        C277014uI A0N = DbW.A0N(r7);
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object A00 = C299275ur.A00(r6, DbY.A0Q(list.get(i)), A0N);
            if ((A00 instanceof Number) || (A00 instanceof Boolean)) {
                if (Q0A.A01(A00)) {
                    break;
                }
                i++;
            } else {
                1Kn.A02(C273654mx.A00(565), "Got non-boolean result while evaluating FindIndex predicate");
                break;
            }
        }
        i = -1;
        return Integer.valueOf(i);
    }
}
