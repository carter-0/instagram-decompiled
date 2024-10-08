package X;

import java.util.Iterator;

/* renamed from: X.3T4  reason: invalid class name */
public final class AnonymousClass3T4 implements Iterator, C62650uo {
    public final Iterator A00;
    public final /* synthetic */ C242193Sz A01;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public AnonymousClass3T4(C242193Sz r2) {
        this.A01 = r2;
        this.A00 = r2.A01.iterator();
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final Object next() {
        return this.A01.A00.invoke(this.A00.next());
    }
}
