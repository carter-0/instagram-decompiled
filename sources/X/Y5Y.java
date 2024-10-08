package X;

import java.util.AbstractCollection;
import java.util.Iterator;

public final class Y5Y extends AbstractCollection<V> {
    public final /* synthetic */ Y44 A00;

    public Y5Y(Y44 y44) {
        this.A00 = y44;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return new XIQ(this.A00);
    }

    public final int size() {
        return this.A00.size();
    }
}
