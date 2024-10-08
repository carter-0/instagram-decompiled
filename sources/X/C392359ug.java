package X;

import java.util.Map;

/* renamed from: X.9ug  reason: invalid class name and case insensitive filesystem */
public abstract class C392359ug {
    public static void A00(Map map, 0sP r2, C62230ry r3) {
        if (!map.containsKey(r3)) {
            map.put(r3, new AnonymousClass8WQ(r2, r3));
            return;
        }
        throw AnonymousClass7TE.A0w(002.A0S("A `initializer` with the same `clazz` has already been added: ", 0q1.A00(((0Yh) r3).A00), '.'));
    }
}
