package X;

import java.util.Iterator;
import java.util.Map;

public class R1F<K, V> extends TSD<K> {
    public final Map A00;

    public void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return new R1L(AnonymousClass7TF.A0u(this.A00), 0);
    }

    public final int size() {
        return this.A00.size();
    }

    public R1F(Map map) {
        map.getClass();
        this.A00 = map;
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.A00.remove(obj);
        return true;
    }
}
