package X;

import java.util.Collection;
import java.util.Set;

public final class R0w<K, V> extends TS2<K, Collection<V>> {
    public final C257513xW A00;

    public final void clear() {
        this.A00.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Set keySet() {
        return this.A00.keySet();
    }

    public final int size() {
        return this.A00.keySet().size();
    }

    public R0w(C257513xW r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (containsKey(obj)) {
            return this.A00.AXL(obj);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (containsKey(obj)) {
            return this.A00.EDC(obj);
        }
        return null;
    }
}
