package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Qwf  reason: case insensitive filesystem */
public final class C8541Qwf extends TSC {
    public final Map A00;
    public final /* synthetic */ C8528QwS A01;

    public C8541Qwf(C8528QwS qwS, Map map) {
        this.A01 = qwS;
        map.getClass();
        this.A00 = map;
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
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

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return new TME(this, AnonymousClass7TF.A0u(this.A00));
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.A00.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.A01.A00 -= size;
            if (size <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int size() {
        return this.A00.size();
    }

    public final void clear() {
        Iterator it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
