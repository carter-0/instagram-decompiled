package X;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.TRv  reason: case insensitive filesystem */
public abstract class C13255TRv<E> extends AbstractList<E> implements C13982TnY<E> {
    public boolean A00 = true;

    public boolean equals(Object obj) {
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
                if (!Pxi.A1X(get(i), list, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void A01() {
        if (!this.A00) {
            throw C66580MXl.A11();
        }
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

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = AnonymousClass7TE.A0N(get(i2), i * 31);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        A01();
        return Pxj.A1Z(obj, this);
    }

    public final boolean removeAll(Collection collection) {
        A01();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        A01();
        return super.retainAll(collection);
    }

    public boolean addAll(Collection collection) {
        A01();
        return super.addAll(collection);
    }
}
