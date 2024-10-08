package X;

import java.util.Map;
import java.util.Map.Entry;

public abstract class Y63<E extends Map.Entry<? extends K, ? extends V>, K, V> extends 047<E> {
    public final /* bridge */ boolean contains(Object obj) {
        Map map;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        0qQ.A0B(entry, 0);
        if (this instanceof C22503Y6w) {
            map = ((C22503Y6w) this).A00;
        } else {
            map = ((C22502Y6v) this).A00;
        }
        return C21523Xdp.A00(entry, map);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        0qQ.A0B(entry, 0);
        if (this instanceof C22503Y6w) {
            return ((C22503Y6w) this).A00.remove(entry.getKey(), entry.getValue());
        }
        return ((C22502Y6v) this).A00.remove(entry.getKey(), entry.getValue());
    }
}
