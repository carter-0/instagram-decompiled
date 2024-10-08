package X;

import java.util.Iterator;

public final class TMG implements Iterator {
    public Object A00;
    public boolean A01;
    public final Iterator A02;

    public final boolean hasNext() {
        if (this.A01 || this.A02.hasNext()) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (!this.A01) {
            return this.A02.next();
        }
        Object obj = this.A00;
        this.A01 = false;
        this.A00 = null;
        return obj;
    }

    public final void remove() {
        17k.A0H(!this.A01, "Can't remove after you've peeked at next");
        this.A02.remove();
    }

    public TMG(Iterator it) {
        it.getClass();
        this.A02 = it;
    }
}
