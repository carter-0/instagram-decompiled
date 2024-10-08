package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.6BX  reason: invalid class name */
public abstract class AnonymousClass6BX implements ListIterator, C62650uo {
    public int A00;
    public int A01;

    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object next() {
        AnonymousClass6BW r3 = (AnonymousClass6BW) this;
        if (r3.hasNext()) {
            Object[] objArr = r3.A00;
            int i = r3.A00;
            r3.A00 = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        if (this.A00 < this.A01) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.A00 > 0) {
            return true;
        }
        return false;
    }

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }
}
