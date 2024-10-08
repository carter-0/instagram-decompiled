package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class TSM extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ TS5 A00;

    public TSM(TS5 ts5) {
        this.A00 = ts5;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.A00.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.A00.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 == null || !obj2.equals(value)) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return new TMN(this.A00);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.A00.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.A00.size();
    }
}
