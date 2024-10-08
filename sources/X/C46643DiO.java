package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.DiO  reason: case insensitive filesystem */
public abstract class C46643DiO {
    public static final Object A00(AnonymousClass6Tm r9) {
        Object obj;
        Object obj2;
        int A05 = DbZ.A05(r9);
        Object A02 = r9.A02();
        String A0p = DbS.A0p(A02);
        String str = (String) A02;
        String A0j = DbW.A0j(r9, A0p);
        Map map = (Map) DbT.A0p(r9, 3);
        if (map != null) {
            obj = map.get("points");
        } else {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            Iterator A0u = AnonymousClass7TF.A0u(map2);
            while (A0u.hasNext()) {
                Map.Entry entry = (Map.Entry) A0u.next();
                C46591DhX.A03((Long) entry.getValue(), str, 002.A0T(A0j, (String) entry.getKey(), '_'), 0Yt.A0E(), A05);
            }
        }
        if (map != null) {
            obj2 = map.get("annotations");
        } else {
            obj2 = null;
        }
        Map map3 = (Map) obj2;
        if (map3 != null) {
            LinkedHashMap A0x = DbS.A0x(0se.A0L(map3.size()));
            Iterator A0u2 = AnonymousClass7TF.A0u(map3);
            while (A0u2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) A0u2.next();
                A0x.put(002.A0T(A0j, (String) entry2.getKey(), '_'), entry2.getValue());
            }
            G8K A00 = C46591DhX.A00(str, A05);
            if (A00 != null) {
                C46591DhX.A02(A00, A0x);
            }
        }
        return null;
    }
}
