package X;

import java.util.Iterator;

public final class TMV implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ TAO A02;

    public TMV() {
    }

    public TMV(TAO tao) {
        this.A02 = tao;
        this.A00 = 0;
        this.A01 = tao.A02();
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A01);
    }

    public final /* synthetic */ Object next() {
        byte b;
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            C8467QvC qvC = (C8467QvC) this.A02;
            if (qvC instanceof C8466QvB) {
                C8466QvB qvB = (C8466QvB) qvC;
                b = qvB.A00[qvB.A00 + i];
            } else {
                b = qvC.A00[i];
            }
            return Byte.valueOf(b);
        }
        throw Pxe.A1C();
    }

    public final void remove() {
        throw C66580MXl.A11();
    }
}
