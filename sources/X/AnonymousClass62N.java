package X;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.62N  reason: invalid class name */
public abstract class AnonymousClass62N<E> extends 0Yz<E> implements AnonymousClass62O<E> {
    public final C20582WvA Eyg(int i, int i2) {
        return new C20582WvA(this, 0, i2);
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return new C20582WvA(this, i, i2);
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
