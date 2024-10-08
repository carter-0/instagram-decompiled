package X;

import java.util.Iterator;

public final class Y6A<K, V> extends 0Yx<K> implements YCQ<K> {
    public final AnonymousClass6G8 A00;

    public final int A08() {
        return this.A00.size();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final Iterator iterator() {
        AnonymousClass6G9 r4 = this.A00.A00;
        0qQ.A0B(r4, 1);
        C22430Y3m[] y3mArr = new C22430Y3m[8];
        int i = 0;
        do {
            y3mArr[i] = new C22430Y3m();
            i++;
        } while (i < 8);
        return new C22437Y3t(r4, y3mArr);
    }

    public Y6A(AnonymousClass6G8 r1) {
        this.A00 = r1;
    }
}
