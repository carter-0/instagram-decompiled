package X;

import java.util.ListIterator;

/* renamed from: X.5GC  reason: invalid class name */
public abstract class AnonymousClass5GC extends AnonymousClass5GD implements ListIterator {
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

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

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
