package X;

import java.util.ArrayList;
import java.util.List;

public final class XMG extends C2811456b {
    public AnonymousClass4FJ A00;
    public boolean A01 = false;
    public int A02 = 0;
    public final AnonymousClass4FG A03;
    public final List A04;

    public static void A00(C2811456b r4, XMG xmg) {
        List list = xmg.A04;
        if (r4 == list.get(xmg.A02)) {
            AnonymousClass4FG r2 = xmg.A03;
            r4.A01.remove(r2);
            int i = xmg.A02 + 1;
            xmg.A02 = i;
            if (i >= list.size()) {
                xmg.A03();
                xmg.A01 = false;
                xmg.A00 = null;
                return;
            }
            C2811456b r1 = (C2811456b) list.get(xmg.A02);
            r1.A01.add(r2);
            r1.A09(xmg.A00);
            return;
        }
        throw new RuntimeException("Unexpected Binding completed");
    }

    public final void A08() {
        if (this.A01) {
            this.A01 = false;
            ((C2811456b) this.A04.get(this.A02)).A08();
        }
    }

    public final void A09(AnonymousClass4FJ r6) {
        if (this.A01) {
            throw new RuntimeException(AnonymousClass000.A00(4309));
        } else if (!A06()) {
            A02();
        } else {
            A05();
            List list = this.A04;
            int size = list.size();
            for (int i = 1; i < size; i++) {
                ((C2811456b) list.get(i)).A07();
            }
            this.A01 = true;
            this.A00 = r6;
            C2811456b r2 = (C2811456b) list.get(0);
            r2.A01.add(this.A03);
            r2.A09(this.A00);
        }
    }

    public final void A0A(ArrayList arrayList) {
        List list = this.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C2811456b) list.get(i)).A0A(arrayList);
        }
    }

    public XMG(List list) {
        this.A04 = list;
        if (!list.isEmpty()) {
            this.A03 = new C22227Xxh(this);
            return;
        }
        throw AnonymousClass7TE.A0w("Empty binding sequence");
    }

    public final void A07() {
        A04();
        List list = this.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C2811456b) list.get(i)).A07();
        }
    }

    public final boolean A0B() {
        return this.A01;
    }
}
