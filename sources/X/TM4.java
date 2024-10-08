package X;

import java.util.Iterator;

public final class TM4 implements Iterator {
    public S7Z A00;

    public final boolean hasNext() {
        return AnonymousClass7TF.A1V(this.A00);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        S7Z s7z = this.A00;
        if (s7z != null) {
            Object obj = s7z.A02;
            this.A00 = s7z.A01;
            return obj;
        }
        throw Pxe.A1C();
    }

    public final void remove() {
        throw C66580MXl.A11();
    }
}
