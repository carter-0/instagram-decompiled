package X;

import java.util.Iterator;

public final class TMA implements Iterator {
    public final Iterator A00;
    public final /* synthetic */ C13253TRt A01;

    public TMA(C13253TRt tRt) {
        this.A01 = tRt;
        this.A00 = tRt.A00.iterator();
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final void remove() {
        throw C66580MXl.A11();
    }
}
