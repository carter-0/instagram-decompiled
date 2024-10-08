package X;

import java.util.Iterator;
import java.util.Set;

public final class Y66<K, V> extends 047<K> implements Set<K>, AnonymousClass07m {
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
        return this.A00.containsKey(obj);
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

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractMap, X.XDx] */
    public final boolean remove(Object obj) {
        ? r1 = this.A00;
        if (!r1.containsKey(obj)) {
            return false;
        }
        r1.remove(obj);
        return true;
    }

    public Y66(C21084XDx xDx) {
        this.A00 = xDx;
    }

    public final boolean add(Object obj) {
        throw C66580MXl.A11();
    }
}
