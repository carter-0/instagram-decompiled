package X;

import java.util.Iterator;
import java.util.Map;

public final class Y6B<K, V> extends 0Yx<Map.Entry<? extends K, ? extends V>> implements YCQ<Map.Entry<? extends K, ? extends V>> {
    public final AnonymousClass6G6 A00;

    public final int A08() {
        return this.A00.size();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        0qQ.A0B(entry, 0);
        return C21523Xdp.A00(entry, this.A00);
    }

    public final Iterator iterator() {
        return new C22431Y3n(this.A00);
    }

    public Y6B(AnonymousClass6G6 r1) {
        this.A00 = r1;
    }
}
