package X;

import java.util.Iterator;

/* renamed from: X.TMe  reason: case insensitive filesystem */
public final class C13120TMe implements Iterator {
    public Object A00;
    public final int A01 = 0;
    public final Object A02;

    public C13120TMe(C13249TRp tRp) {
        this.A02 = tRp;
        this.A00 = tRp.A00.iterator();
    }

    public final boolean hasNext() {
        return ((Iterator) this.A00).hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return ((Iterator) this.A00).next();
    }

    public final void remove() {
        int i = this.A01;
        throw C66580MXl.A11();
    }

    public C13120TMe(C13254TRu tRu) {
        this.A02 = tRu;
        this.A00 = tRu.A00.iterator();
    }

    public C13120TMe(C13256TRw tRw) {
        this.A02 = tRw;
        this.A00 = tRw.A00.iterator();
    }

    public C13120TMe(C13258TRy tRy) {
        this.A02 = tRy;
        this.A00 = tRy.A00.iterator();
    }
}
