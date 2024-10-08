package X;

import java.util.Iterator;

public final class TM8 implements Iterator {
    public final Iterator A00;
    public final /* synthetic */ C13251TRr A01;

    public TM8(C13251TRr tRr) {
        this.A01 = tRr;
        this.A00 = tRr.A00.iterator();
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
