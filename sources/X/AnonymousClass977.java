package X;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.977  reason: invalid class name */
public abstract class AnonymousClass977<E> extends AbstractList<E> implements AnonymousClass978<E> {
    public boolean A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (!get(i).equals(list.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void A01() {
        if (!this.A00) {
            throw new UnsupportedOperationException();
        }
    }

    public AnonymousClass977(boolean z) {
        this.A00 = z;
    }

    public boolean add(Object obj) {
        A01();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        A01();
        return super.addAll(i, collection);
    }

    public void clear() {
        A01();
        super.clear();
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final boolean remove(Object obj) {
        A01();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        A01();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        A01();
        return super.retainAll(collection);
    }

    public AnonymousClass977() {
        this(true);
    }

    public boolean addAll(Collection collection) {
        A01();
        return super.addAll(collection);
    }
}
