package X;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: X.TMg  reason: case insensitive filesystem */
public final class C13122TMg implements Iterator, ListIterator {
    public Object A00;
    public final int A01 = 0;
    public final Object A02;

    public C13122TMg(C13249TRp tRp, int i) {
        this.A02 = tRp;
        this.A00 = tRp.A00.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        int i = this.A01;
        throw C66580MXl.A11();
    }

    public final boolean hasNext() {
        return ((ListIterator) this.A00).hasNext();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.A00).hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return ((ListIterator) this.A00).next();
    }

    public final int nextIndex() {
        return ((ListIterator) this.A00).nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return ((ListIterator) this.A00).previous();
    }

    public final int previousIndex() {
        return ((ListIterator) this.A00).previousIndex();
    }

    public final void remove() {
        int i = this.A01;
        throw C66580MXl.A11();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        int i = this.A01;
        throw C66580MXl.A11();
    }

    public C13122TMg(C13254TRu tRu, int i) {
        this.A02 = tRu;
        this.A00 = tRu.A00.listIterator(i);
    }

    public C13122TMg(C13256TRw tRw, int i) {
        this.A02 = tRw;
        this.A00 = tRw.A00.listIterator(i);
    }

    public C13122TMg(C13258TRy tRy, int i) {
        this.A02 = tRy;
        this.A00 = tRy.A00.listIterator(i);
    }
}
