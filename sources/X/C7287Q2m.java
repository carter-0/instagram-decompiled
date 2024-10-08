package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Q2m  reason: case insensitive filesystem */
public abstract class C7287Q2m {
    public static final C7284Q2j A00(C307896Rx r5, AnonymousClass6Tm r6) {
        Object A01 = r6.A01();
        Object A02 = r6.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) A02;
        Object A00 = r6.A00();
        DbS.A1Y(A00);
        String str = (String) A00;
        if (A01 instanceof String) {
            C307456Qe A002 = Q05.A00(r5);
            if (!A002.A05.containsKey(A01) && !A002.A04.containsKey(A01)) {
                throw Pxg.A0c("Template with id ", (String) A01, " not found");
            }
        }
        List list = r5.A0D;
        0qQ.A06(list);
        return new C7284Q2j(A01, str, list, map);
    }
}
