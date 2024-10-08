package X;

import java.util.Map;

/* renamed from: X.Dhs  reason: case insensitive filesystem */
public abstract class C46612Dhs {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        C277014uI r6;
        C277014uI r7;
        String str;
        String A0g = DbY.A0g(r10);
        Object A02 = r10.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) A02;
        C276544tV A0M = DbW.A0M(r10, 2);
        if (A0M != null) {
            r6 = A0M.A08();
            r7 = A0M.A09();
        } else {
            r6 = null;
            r7 = null;
        }
        C307896Rx r5 = r9;
        Map A0B = C46611Dhr.A0B(r9, A0M, 40);
        0qQ.A0C(A0B, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        if (A0M == null || (str = A0M.A0H()) == null) {
            str = "current-screen";
        }
        C308206Td.A09(r5);
        AnonymousClass4D6 A00 = C46610Dhq.A00(C308206Td.A02(r5), C308206Td.A0C(r5), str, A0g);
        if (A00 == null) {
            return null;
        }
        C360678ey A022 = C359988do.A02((AnonymousClass1O9) null, C308206Td.A0B(r5), A0g, C308206Td.A0H(map));
        A022.A00(new C46613Dht(r5, r6, r7, A0g, A0B));
        A00.schedule(A022);
        return null;
    }
}
