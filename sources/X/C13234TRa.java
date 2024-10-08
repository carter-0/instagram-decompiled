package X;

import java.util.AbstractCollection;
import java.util.Map;

/* renamed from: X.TRa  reason: case insensitive filesystem */
public abstract class C13234TRa<K, V> extends AbstractCollection<Map.Entry<K, V>> {
    public final void clear() {
        ((R0y) this).A00.clear();
    }

    public final int size() {
        return ((R0y) this).A00.size();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ((R0y) this).A00.AJa(entry.getKey(), entry.getValue());
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ((R0y) this).A00.remove(entry.getKey(), entry.getValue());
    }
}
