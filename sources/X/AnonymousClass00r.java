package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.00r  reason: invalid class name */
public final class AnonymousClass00r extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ 0yf A00;

    public AnonymousClass00r(0yf r1) {
        this.A00 = r1;
    }

    public final Iterator iterator() {
        return new 00t(this.A00);
    }

    public final int size() {
        return this.A00.size();
    }
}
