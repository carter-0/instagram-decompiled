package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.TMz  reason: case insensitive filesystem */
public final class C13141TMz<K, V> implements Map<K, V>, AnonymousClass0s2 {
    public final Map A00;

    public final void clear() {
        this.A00.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.A00.containsValue(obj);
    }

    public final Object get(Object obj) {
        return this.A00.get(obj);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final void putAll(Map map) {
        0qQ.A0B(map, 0);
        this.A00.putAll(map);
    }

    public final Object remove(Object obj) {
        return this.A00.remove(obj);
    }

    public final /* bridge */ Set entrySet() {
        return this.A00.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return this.A00.keySet();
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public final /* bridge */ Collection values() {
        return this.A00.values();
    }

    public C13141TMz(Map map) {
        this.A00 = map;
    }

    public final Object put(Object obj, Object obj2) {
        while (size() >= 500) {
            remove(00k.A09(keySet()));
        }
        return this.A00.put(obj, obj2);
    }
}
