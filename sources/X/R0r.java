package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class R0r extends R1F<K, Collection<V>> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R0r(AbstractMapBasedMultimap abstractMapBasedMultimap, Map map) {
        super(map);
        this.A00 = abstractMapBasedMultimap;
    }

    public final boolean containsAll(Collection collection) {
        return this.A00.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (this == obj || this.A00.keySet().equals(obj)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new TMY(this, AnonymousClass7TF.A0u(this.A00));
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.A00.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.A00.A00 -= size;
        if (size > 0) {
            return true;
        }
        return false;
    }

    public final void clear() {
        Iterator it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
