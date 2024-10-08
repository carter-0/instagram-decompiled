package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class SGJ {
    public final void A01(17Z r4, Map map) {
        0qQ.A0B(map, 1);
        r4.A0c();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            Object value = A1J.getValue();
            r4.A0q((String) key);
            A00(r4, value);
        }
        r4.A0Z();
    }

    private final void A00(17Z r3, Object obj) {
        if (obj instanceof String) {
            r3.A0t((String) obj);
        } else if (obj instanceof Map) {
            A01(r3, (Map) obj);
        } else if (obj instanceof List) {
            r3.A0b();
            for (Object A00 : (List) obj) {
                A00(r3, A00);
            }
            r3.A0Y();
        } else if (obj instanceof Boolean) {
            r3.A0x(AnonymousClass7TE.A1a(obj));
        } else if (obj instanceof Double) {
            r3.A0e(JTO.A00(obj));
        } else if (obj instanceof Long) {
            r3.A0h(AnonymousClass7TE.A0R(obj));
        } else if (obj == null) {
            r3.A0a();
        } else {
            throw C66582MXn.A0k(obj, "unknown value type", AnonymousClass7TE.A1A());
        }
    }
}
