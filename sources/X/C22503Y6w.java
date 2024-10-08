package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Y6w  reason: case insensitive filesystem */
public final class C22503Y6w<K, V> extends Y63<Map.Entry<K, V>, K, V> {
    public final C21085XDy A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDy] */
    public final int A00() {
        return this.A00.size();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDy] */
    public final void clear() {
        this.A00.clear();
    }

    public final Iterator iterator() {
        return new C22440Y3w(this.A00);
    }

    public C22503Y6w(C21085XDy xDy) {
        this.A00 = xDy;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C66580MXl.A11();
    }
}
