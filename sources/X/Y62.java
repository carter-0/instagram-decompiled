package X;

import java.util.Collection;
import java.util.Iterator;

public final class Y62<K, V> extends 09v<V> implements Collection<V>, AnonymousClass0Yd {
    public final C21085XDy A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDy] */
    public final int A00() {
        return this.A00.size();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDy] */
    public final void clear() {
        this.A00.clear();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDy] */
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public final Iterator iterator() {
        return new C22442Y3y(this.A00);
    }

    public Y62(C21085XDy xDy) {
        this.A00 = xDy;
    }

    public final boolean add(Object obj) {
        throw C66580MXl.A11();
    }
}
