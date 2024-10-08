package X;

import java.util.Collection;
import java.util.Iterator;

public final class Y61<K, V> extends 09v<V> implements Collection<V>, AnonymousClass0Yd {
    public final C21084XDx A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDx] */
    public final int A00() {
        return this.A00.size();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDx] */
    public final void clear() {
        this.A00.clear();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDx] */
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public final Iterator iterator() {
        C21084XDx xDx = this.A00;
        0qQ.A0B(xDx, 1);
        C22430Y3m[] y3mArr = new C22430Y3m[8];
        int i = 0;
        do {
            y3mArr[i] = new C22430Y3m();
            i++;
        } while (i < 8);
        return new Y74(xDx, y3mArr);
    }

    public Y61(C21084XDx xDx) {
        this.A00 = xDx;
    }

    public final boolean add(Object obj) {
        throw C66580MXl.A11();
    }
}
