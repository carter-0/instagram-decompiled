package X;

import java.util.Iterator;
import java.util.Map;

public final class Y69<K, V> extends 0Yx<Map.Entry<? extends K, ? extends V>> implements YCQ<Map.Entry<? extends K, ? extends V>> {
    public final AnonymousClass6G8 A00;

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

    public Y69(AnonymousClass6G8 r1) {
        this.A00 = r1;
    }
}
