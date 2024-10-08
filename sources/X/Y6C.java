package X;

import java.util.Iterator;

public final class Y6C<K, V> extends 0Yx<K> implements YCQ<K> {
    public final AnonymousClass6G6 A00;

    public final int A08() {
        return this.A00.size();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final Iterator iterator() {
        return new C22432Y3o(this.A00);
    }

    public Y6C(AnonymousClass6G6 r1) {
        this.A00 = r1;
    }
}
