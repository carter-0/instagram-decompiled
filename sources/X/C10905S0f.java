package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.S0f  reason: case insensitive filesystem */
public final class C10905S0f {
    public final Map A00;

    public /* synthetic */ C10905S0f(Map map) {
        this.A00 = map;
    }

    public final HashMap A00(Collection collection) {
        Set unmodifiableSet;
        HashMap A1E = AnonymousClass7TE.A1E();
        Map map = this.A00;
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            Object next = A16.next();
            if (!map.containsKey(next)) {
                unmodifiableSet = Collections.emptySet();
            } else {
                HashSet A1F = AnonymousClass7TE.A1F();
                Iterator A0u = AnonymousClass7TF.A0u((Map) map.get(next));
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    if (collection.contains(A1J.getKey())) {
                        A1F.add(A1J.getValue());
                    }
                }
                unmodifiableSet = Collections.unmodifiableSet(A1F);
            }
            A1E.put(next, unmodifiableSet);
        }
        return A1E;
    }
}
