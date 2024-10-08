package X;

import java.util.Iterator;

public final class TMT implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ AnonymousClass5L9 A02;

    public TMT(AnonymousClass5L9 r2) {
        this.A02 = r2;
        this.A00 = 0;
        this.A01 = r2.A03();
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            return Byte.valueOf(this.A02.A02(i));
        }
        throw Pxe.A1C();
    }

    public final void remove() {
        throw C66580MXl.A11();
    }

    public TMT() {
    }
}
