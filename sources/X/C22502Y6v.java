package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Y6v  reason: case insensitive filesystem */
public final class C22502Y6v<K, V> extends Y63<Map.Entry<K, V>, K, V> {
    public final C21084XDx A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDx] */
    public final int A00() {
        return this.A00.size();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDx] */
    public final void clear() {
        this.A00.clear();
    }

    public final Iterator iterator() {
        return new C22439Y3v(this.A00);
    }

    public C22502Y6v(C21084XDx xDx) {
        this.A00 = xDx;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C66580MXl.A11();
    }
}
