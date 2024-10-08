package X;

import java.util.Iterator;
import java.util.List;

public final class HAH extends GX4 implements XBt {
    public final C58008Ik1 A00;
    public final AnonymousClass32Q A01;
    public final List A02 = AnonymousClass7TE.A1C();

    public final /* bridge */ /* synthetic */ C296995qz B9n(C232262tL r4) {
        int indexOf = this.A02.indexOf(r4);
        return new C296995qz(indexOf / 3, indexOf % 3);
    }

    public final /* bridge */ /* synthetic */ C296995qz B9o(Object obj) {
        int indexOf = this.A02.indexOf(obj);
        return new C296995qz(indexOf / 3, indexOf % 3);
    }

    public final void Eab(AnonymousClass07Z r3, C66626MZn mZn) {
        this.A00.add(new IRJ(this, mZn));
    }

    public HAH(C58008Ik1 ik1, AnonymousClass32Q r3) {
        this.A01 = r3;
        this.A00 = ik1;
    }

    public final void A05(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C296935qt r5 = (C296935qt) it.next();
            List list2 = this.A02;
            int size = list2.size();
            C296905qq r2 = r5.A02;
            boolean z = true;
            if (r2.A02 != 1 || r2.A04 != 1) {
                z = false;
            }
            17k.A0F(z);
            list2.add(size, r5);
        }
        A04();
    }
}
