package X;

import java.util.Iterator;
import java.util.Map;

public abstract class R0v<K, V> extends TS2<K, V> {
    public final 1UV A00;
    public final Map A01;

    public boolean containsKey(Object obj) {
        Map map = this.A01;
        if (map.containsKey(obj)) {
            if (!Pxi.A1V(this.A00, obj, map.get(obj))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Object get(Object obj) {
        Object obj2 = this.A01.get(obj);
        if (obj2 == null || !Pxi.A1V(this.A00, obj, obj2)) {
            return null;
        }
        return obj2;
    }

    public final Object put(Object obj, Object obj2) {
        17k.A0E(Pxi.A1V(this.A00, obj, obj2));
        return this.A01.put(obj, obj2);
    }

    public R0v(1UV r1, Map map) {
        this.A01 = map;
        this.A00 = r1;
    }

    public final boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public final void putAll(Map map) {
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            17k.A0E(Pxi.A1V(this.A00, A1J.getKey(), A1J.getValue()));
        }
        this.A01.putAll(map);
    }

    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            return this.A01.remove(obj);
        }
        return null;
    }
}
