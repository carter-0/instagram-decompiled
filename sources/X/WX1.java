package X;

import java.util.List;

public final class WX1 implements X4A {
    public final /* synthetic */ C15465UdG A00;

    public final V2M Bs0(1Xj r4) {
        C61915KRk kRk;
        List list;
        int indexOf;
        0qQ.A0B(r4, 0);
        Object value = this.A00.A03.A0A.getValue();
        if (!(value instanceof C61915KRk) || (kRk = (C61915KRk) value) == null || (list = kRk.A00) == null || (indexOf = list.indexOf(r4.A2n())) == -1) {
            return C15973Ulp.A00;
        }
        return new C15971Uln(indexOf + 1);
    }

    public WX1(C15465UdG udG) {
        this.A00 = udG;
    }
}
