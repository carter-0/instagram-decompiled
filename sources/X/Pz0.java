package X;

import java.util.Iterator;

public final class Pz0 implements Iterable {
    public final int A00;

    public Pz0(int i) {
        this.A00 = i;
    }

    public final Iterator iterator() {
        switch (this.A00) {
            case 0:
                return C7188Pyb.A01;
            case 1:
                return C10098Rma.A01;
            default:
                return C10104Rmg.A01;
        }
    }
}
