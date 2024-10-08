package X;

import java.util.Iterator;

public final class Pz1 implements Iterator {
    public final int A00;

    public Pz1(int i) {
        this.A00 = i;
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        int i = this.A00;
        throw Pxe.A1C();
    }

    public final void remove() {
        int i = this.A00;
        throw C66580MXl.A11();
    }
}
