package X;

import java.util.List;

public final class IHU implements AnonymousClass8CQ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IHU(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void D5A(Exception exc, List list) {
        int i = this.A00;
        0qQ.A0B(list, 0);
        boolean A1b = AnonymousClass7TE.A1b(list);
        if (i != 0) {
            if (A1b) {
                ((C55695Hls) this.A02).A00 = ((AnonymousClass8K5) list.get(0)).A01;
            } else {
                return;
            }
        } else if (A1b) {
            ((C55694Hlr) this.A02).A00 = ((AnonymousClass8K5) list.get(0)).A01;
        } else {
            return;
        }
        DbS.A1U(this.A01);
    }
}
