package X;

import java.util.Iterator;

/* renamed from: X.5mE  reason: invalid class name and case insensitive filesystem */
public abstract class C294305mE implements Iterator, C62650uo {
    public int A00;
    public int A01;
    public Object[] A02 = C285005Ph.A04.A02;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        if (this.A01 < this.A00) {
            return true;
        }
        return false;
    }
}
