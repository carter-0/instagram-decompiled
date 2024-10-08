package X;

import java.util.ListIterator;

/* renamed from: X.Qwk  reason: case insensitive filesystem */
public abstract class C8546Qwk extends TMS implements ListIterator {
    public final boolean hasPrevious() {
        return ((ListIterator) this.A00).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.A00).nextIndex();
    }

    public final Object previous() {
        return A00(((ListIterator) this.A00).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.A00).previousIndex();
    }

    public final void add(Object obj) {
        throw C66580MXl.A11();
    }

    public final void set(Object obj) {
        throw C66580MXl.A11();
    }
}
