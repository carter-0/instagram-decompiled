package X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.TRz  reason: case insensitive filesystem */
public final class C13259TRz extends AbstractList implements Serializable, RandomAccess {
    public final C13647TeE A00;
    public final List A01;

    public final void clear() {
        this.A01.clear();
    }

    public final Object get(int i) {
        return this.A00.FP2(this.A01.get(i));
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public final ListIterator listIterator(int i) {
        return new C8544Qwi(this, this.A01.listIterator(i));
    }

    public final Object remove(int i) {
        return this.A00.FP2(this.A01.remove(i));
    }

    public final int size() {
        return this.A01.size();
    }

    public C13259TRz(C13647TeE teE, List list) {
        list.getClass();
        this.A01 = list;
        this.A00 = teE;
    }

    public final Iterator iterator() {
        return listIterator();
    }
}
