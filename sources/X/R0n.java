package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class R0n extends R1G<K, Collection<V>> {
    public final /* synthetic */ R0x A00;

    public R0n(R0x r0x) {
        this.A00 = r0x;
    }

    public final boolean contains(Object obj) {
        Set entrySet = this.A00.A00.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Iterator iterator() {
        return new TMF(this.A00);
    }

    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00.A01;
        Object key = entry.getKey();
        Map map = abstractMapBasedMultimap.A01;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        abstractMapBasedMultimap.A00 -= size;
        return true;
    }
}
