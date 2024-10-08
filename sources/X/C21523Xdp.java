package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Xdp  reason: case insensitive filesystem */
public abstract class C21523Xdp {
    public static final boolean A00(Map.Entry entry, Map map) {
        AnonymousClass7TG.A1N(map, entry);
        Object obj = map.get(entry.getKey());
        Object value = entry.getValue();
        if (obj != null) {
            return obj.equals(value);
        }
        if (value != null || !map.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    public static final boolean A01(Map map, Map map2) {
        if (map.size() != map2.size()) {
            throw AnonymousClass7TE.A0w(AnonymousClass000.A00(26));
        } else if (map2.isEmpty()) {
            return true;
        } else {
            Iterator A0u = AnonymousClass7TF.A0u(map2);
            while (A0u.hasNext()) {
                if (!A00(AnonymousClass7TE.A1J(A0u), map)) {
                    return false;
                }
            }
            return true;
        }
    }
}
