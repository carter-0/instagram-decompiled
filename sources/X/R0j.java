package X;

import java.util.Map;

public final class R0j<K, V> extends R0v<K, V> {
    public final 1UV A00;

    public final boolean containsKey(Object obj) {
        if (!this.A01.containsKey(obj) || !this.A00.apply(obj)) {
            return false;
        }
        return true;
    }

    public R0j(1UV r1, 1UV r2, Map map) {
        super(r2, map);
        this.A00 = r1;
    }
}
