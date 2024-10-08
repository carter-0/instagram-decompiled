package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Dhl  reason: case insensitive filesystem */
public abstract class C46605Dhl {
    public static final Object A00(AnonymousClass6Tm r5) {
        int A05 = DbZ.A05(r5);
        List list = r5.A00;
        String A0t = DbU.A0t(list, 1);
        Object obj = list.get(2);
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) obj;
        0qQ.A0B(map, 2);
        G8K A00 = C46591DhX.A00(A0t, A05);
        if (A00 == null) {
            return null;
        }
        C46591DhX.A02(A00, map);
        return null;
    }
}
