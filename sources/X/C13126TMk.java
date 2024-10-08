package X;

import java.util.ListIterator;

/* renamed from: X.TMk  reason: case insensitive filesystem */
public final class C13126TMk implements ListIterator {
    public final ListIterator A00;
    public final /* synthetic */ C13253TRt A01;

    public C13126TMk(C13253TRt tRt, int i) {
        this.A01 = tRt;
        this.A00 = tRt.A00.listIterator(i);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final int nextIndex() {
        return this.A00.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.A00.previous();
    }

    public final int previousIndex() {
        return this.A00.previousIndex();
    }

    public final /* synthetic */ void add(Object obj) {
        throw C66580MXl.A11();
    }

    public final void remove() {
        throw C66580MXl.A11();
    }

    public final /* synthetic */ void set(Object obj) {
        throw C66580MXl.A11();
    }
}
