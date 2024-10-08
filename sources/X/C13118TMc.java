package X;

import java.util.Iterator;

/* renamed from: X.TMc  reason: case insensitive filesystem */
public final class C13118TMc implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ TAQ A02;

    public C13118TMc() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13118TMc(TAQ taq) {
        this();
        this.A02 = taq;
        this.A00 = 0;
        this.A01 = taq.A05();
    }

    public final byte A00() {
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            return this.A02.A03(i);
        }
        throw Pxe.A1C();
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A01);
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(A00());
    }

    public final void remove() {
        throw C66580MXl.A11();
    }
}
