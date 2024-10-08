package X;

import java.util.Iterator;

public final class TMU implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ TAN A02;

    public TMU() {
    }

    public TMU(TAN tan) {
        this.A02 = tan;
        this.A00 = 0;
        this.A01 = tan.A01();
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A01);
    }

    public final /* synthetic */ Object next() {
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            return Byte.valueOf(((C8426QuH) this.A02).A00[i]);
        }
        throw Pxe.A1C();
    }

    public final void remove() {
        throw C66580MXl.A11();
    }
}
