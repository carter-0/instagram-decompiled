package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.5E8  reason: invalid class name */
public final class AnonymousClass5E8 implements Iterator, Iterable {
    public int A00 = 0;
    public final Object[] A01;

    public final Iterator iterator() {
        return this;
    }

    public final boolean hasNext() {
        if (this.A00 < this.A01.length) {
            return true;
        }
        return false;
    }

    public final Object next() {
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i < objArr.length) {
            this.A00 = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass5E8(Object[] objArr) {
        this.A01 = objArr;
    }
}
