package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.6HF  reason: invalid class name */
public abstract class AnonymousClass6HF<E> extends 0Yz<E> implements AnonymousClass6HG<E> {
    public final boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return new Wv9(this, i, i2);
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return listIterator();
    }
}
