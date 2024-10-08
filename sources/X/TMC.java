package X;

import java.util.Iterator;

public final class TMC implements Iterator {
    public boolean A00 = true;
    public final /* synthetic */ Iterator A01;

    public TMC(Iterator it) {
        this.A01 = it;
    }

    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    public final Object next() {
        Object next = this.A01.next();
        this.A00 = false;
        return next;
    }

    public final void remove() {
        Pxh.A1T(!this.A00);
        this.A01.remove();
    }
}
