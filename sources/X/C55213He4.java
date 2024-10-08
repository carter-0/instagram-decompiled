package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.He4  reason: case insensitive filesystem */
public abstract class C55213He4 {
    public static final Float A00(Object obj, Map map) {
        Object obj2;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (true) {
            if (!A0u.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = A0u.next();
            if (0qQ.A0K(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }
}
