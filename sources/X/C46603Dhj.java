package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.Dhj  reason: case insensitive filesystem */
public abstract class C46603Dhj {
    public static final Object A00(AnonymousClass6Tm r7) {
        int A04 = DbW.A04(r7.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A042 = DbW.A04(r7.A02(), "null cannot be cast to non-null type kotlin.Number");
        Map map = (Map) DbT.A0p(r7, 2);
        if (map != null) {
            Set<Map.Entry> entrySet = C308206Td.A0H(map).entrySet();
            0qQ.A07(entrySet);
            for (Map.Entry entry : entrySet) {
                02m.A0p.markerAnnotate(A04, A042, (String) entry.getKey(), (String) entry.getValue());
            }
        }
        return null;
    }
}
