package X;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: X.Y5c  reason: case insensitive filesystem */
public final class C22468Y5c extends AbstractSet<K> {
    public final /* synthetic */ Y44 A00;

    public C22468Y5c(Y44 y44) {
        this.A00 = y44;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return new XIP(this.A00);
    }

    public final int size() {
        return this.A00.size();
    }

    public final boolean remove(Object obj) {
        int size = size();
        this.A00.remove(obj);
        return JTQ.A1O(size(), size);
    }
}
