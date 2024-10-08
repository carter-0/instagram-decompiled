package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class TN0<T> implements Set<T>, AnonymousClass07m {
    public final Set A00;

    public final boolean addAll(Collection collection) {
        0qQ.A0B(collection, 0);
        return this.A00.addAll(collection);
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        0qQ.A0B(collection, 0);
        return this.A00.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return this.A00.iterator();
    }

    public final boolean remove(Object obj) {
        return this.A00.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        0qQ.A0B(collection, 0);
        return this.A00.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        0qQ.A0B(collection, 0);
        return this.A00.retainAll(collection);
    }

    public final Object[] toArray() {
        return 0q3.A00(this);
    }

    public final Object[] toArray(Object[] objArr) {
        0qQ.A0B(objArr, 0);
        return 0q3.A01(this, objArr);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public TN0(Set set) {
        this.A00 = set;
    }

    public final boolean add(Object obj) {
        while (size() >= 500) {
            remove(00k.A09(this));
        }
        return this.A00.add(obj);
    }
}
