package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class TMF implements Iterator {
    public Collection A00;
    public final Iterator A01;
    public final /* synthetic */ R0x A02;

    public TMF(R0x r0x) {
        this.A02 = r0x;
        this.A01 = AnonymousClass7TF.A0u(r0x.A00);
    }

    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry A1J = AnonymousClass7TE.A1J(this.A01);
        this.A00 = Pxe.A18(A1J);
        return this.A02.A00(A1J);
    }

    public final void remove() {
        Pxh.A1T(AnonymousClass7TF.A1V(this.A00));
        this.A01.remove();
        this.A02.A01.A00 -= this.A00.size();
        this.A00.clear();
        this.A00 = null;
    }
}
