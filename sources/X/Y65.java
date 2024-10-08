package X;

import java.util.Iterator;
import java.util.Set;

public final class Y65<K, V> extends 047<K> implements Set<K>, AnonymousClass07m {
    public final C286845Ya A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.5Ya] */
    public final int A00() {
        return this.A00.size();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.5Ya] */
    public final void clear() {
        this.A00.clear();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.5Ya] */
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final Iterator iterator() {
        C286845Ya r4 = this.A00;
        C294305mE[] r2 = new C294305mE[8];
        int i = 0;
        do {
            r2[i] = new C294305mE();
            i++;
        } while (i < 8);
        return new XGE(r4, r2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractMap, X.5Ya] */
    public final boolean remove(Object obj) {
        ? r1 = this.A00;
        if (!r1.containsKey(obj)) {
            return false;
        }
        r1.remove(obj);
        return true;
    }

    public Y65(C286845Ya r1) {
        this.A00 = r1;
    }

    public final boolean add(Object obj) {
        throw C66580MXl.A11();
    }
}
