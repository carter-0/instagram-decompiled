package X;

import java.util.List;

/* renamed from: X.Q2l  reason: case insensitive filesystem */
public abstract class C7286Q2l {
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        List list = r5.A00;
        Object obj = list.get(0);
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = list.get(1);
        0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.Number");
        int intValue = ((Number) obj2).intValue();
        if (intValue == 0) {
            return Q05.A03(r4, str);
        }
        return C7292Q2r.A00.A02(r4, str, intValue);
    }
}
