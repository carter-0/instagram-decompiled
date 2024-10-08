package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.ImmutableEntry;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class R0x extends TS2<K, Collection<V>> {
    public final transient Map A00;
    public final /* synthetic */ AbstractMapBasedMultimap A01;

    public R0x(AbstractMapBasedMultimap abstractMapBasedMultimap, Map map) {
        this.A01 = abstractMapBasedMultimap;
        this.A00 = map;
    }

    public final void clear() {
        Map map = this.A00;
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A01;
        if (map == abstractMapBasedMultimap.A01) {
            abstractMapBasedMultimap.clear();
            return;
        }
        TMF tmf = new TMF(this);
        while (tmf.hasNext()) {
            tmf.next();
            tmf.remove();
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.A00;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj || this.A00.equals(obj)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Object obj2;
        Map map = this.A00;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.A01.A09(obj, collection);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public Set keySet() {
        return this.A01.keySet();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.A00.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A01;
        Collection A08 = abstractMapBasedMultimap.A08();
        A08.addAll(collection);
        abstractMapBasedMultimap.A00 -= collection.size();
        collection.clear();
        return A08;
    }

    public final int size() {
        return this.A00.size();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public final ImmutableEntry A00(Map.Entry entry) {
        Object key = entry.getKey();
        return new ImmutableEntry(key, this.A01.A09(key, Pxe.A18(entry)));
    }
}
