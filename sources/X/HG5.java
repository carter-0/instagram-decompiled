package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class HG5 extends C320566sa {
    public final GX4 A00;

    public HG5(GX4 gx4) {
        super(false, false);
        this.A00 = gx4;
    }

    public final List A04() {
        1Xj BPf;
        Collection<C320726sq> values = this.A02.values();
        ArrayList A15 = DbV.A15(values);
        for (C320726sq r1 : values) {
            if ((r1 instanceof C296965qw) && (BPf = ((C296965qw) r1).BPf()) != null) {
                A15.add(BPf);
            }
        }
        return A15;
    }

    public final /* bridge */ /* synthetic */ C320726sq A00(Object obj) {
        1Xj A0m = C51968G9o.A0m(obj);
        Iterator A03 = this.A00.A03();
        0qQ.A07(A03);
        while (A03.hasNext()) {
            Object next = A03.next();
            if ((next instanceof C296965qw) && (next instanceof C320726sq) && C51969G9p.A1Z(A0m, ((C296965qw) next).BPf().getId())) {
                return (C320726sq) next;
            }
        }
        return null;
    }
}
