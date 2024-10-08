package X;

import java.util.Iterator;
import java.util.Set;

public final class Y67<K, V> extends 047<K> implements Set<K>, AnonymousClass07m {
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
        return this.A00.containsKey(obj);
    }

    public final Iterator iterator() {
        return new C22441Y3x(this.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractMap, X.XDy] */
    public final boolean remove(Object obj) {
        ? r1 = this.A00;
        if (!r1.containsKey(obj)) {
            return false;
        }
        r1.remove(obj);
        return true;
    }

    public Y67(C21085XDy xDy) {
        this.A00 = xDy;
    }

    public final boolean add(Object obj) {
        throw C66580MXl.A11();
    }
}
