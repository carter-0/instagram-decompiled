package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

public abstract class R1G<K, V> extends TSD<Map.Entry<K, V>> {
    public final Map A00() {
        if (this instanceof R0m) {
            return ((R0m) this).A00;
        }
        if (this instanceof R0o) {
            return ((R0o) this).A00;
        }
        return ((R0n) this).A00;
    }

    public boolean contains(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map A00 = A00();
        try {
            obj2 = A00.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (!2PP.A00(obj2, entry.getValue())) {
            return false;
        }
        if (obj2 != null || A00.containsKey(key)) {
            return true;
        }
        return false;
    }

    public final void clear() {
        A00().clear();
    }

    public final boolean isEmpty() {
        return A00().isEmpty();
    }

    public boolean remove(Object obj) {
        if (!contains(obj) || !(obj instanceof Map.Entry)) {
            return false;
        }
        return A00().keySet().remove(((Map.Entry) obj).getKey());
    }

    public boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            boolean z = false;
            for (Object remove : collection) {
                z |= remove(remove);
            }
            return z;
        }
    }

    public boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet A01 = C281945Ae.A01(collection.size());
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    A01.add(((Map.Entry) next).getKey());
                }
            }
            return A00().keySet().retainAll(A01);
        }
    }

    public int size() {
        return A00().size();
    }
}
