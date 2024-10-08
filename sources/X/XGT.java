package X;

import java.util.List;

public final class XGT extends C270324gY {
    public final boolean A0B() {
        return false;
    }

    public final void A06() {
        List list;
        C270324gY r0;
        AnonymousClass3MQ r6 = this.A02;
        AnonymousClass3MQ r02 = r6;
        int i = r02.A02;
        int i2 = r02.A03;
        int i3 = r02.A01;
        C22054Xuf xuf = this.A04;
        if (i3 == 1) {
            if (i != -1) {
                xuf.A08.add(r6.A0h.A0k.A04);
                this.A02.A0h.A0k.A04.A07.add(xuf);
            } else if (i2 != -1) {
                xuf.A08.add(r6.A0h.A0k.A03);
                this.A02.A0h.A0k.A03.A07.add(xuf);
                i = -i2;
            } else {
                xuf.A09 = true;
                xuf.A08.add(r6.A0h.A0k.A03);
                this.A02.A0h.A0k.A03.A07.add(xuf);
                C22054Xuf xuf2 = this.A02.A0k.A04;
                list = xuf.A07;
                C22054Xuf.A00(xuf2, xuf, list);
                r0 = this.A02.A0k;
            }
            xuf.A00 = i;
            C22054Xuf xuf22 = this.A02.A0k.A04;
            list = xuf.A07;
            C22054Xuf.A00(xuf22, xuf, list);
            r0 = this.A02.A0k;
        } else {
            if (i != -1) {
                xuf.A08.add(r6.A0h.A0l.A04);
                this.A02.A0h.A0l.A04.A07.add(xuf);
            } else if (i2 != -1) {
                xuf.A08.add(r6.A0h.A0l.A03);
                this.A02.A0h.A0l.A03.A07.add(xuf);
                i = -i2;
            } else {
                xuf.A09 = true;
                xuf.A08.add(r6.A0h.A0l.A03);
                this.A02.A0h.A0l.A03.A07.add(xuf);
                C22054Xuf xuf3 = this.A02.A0l.A04;
                list = xuf.A07;
                C22054Xuf.A00(xuf3, xuf, list);
                r0 = this.A02.A0l;
            }
            xuf.A00 = i;
            C22054Xuf xuf32 = this.A02.A0l.A04;
            list = xuf.A07;
            C22054Xuf.A00(xuf32, xuf, list);
            r0 = this.A02.A0l;
        }
        C22054Xuf.A00(r0.A03, xuf, list);
    }

    public final void A07() {
        AnonymousClass3MQ r3 = this.A02;
        int i = r3.A01;
        int i2 = this.A04.A02;
        if (i == 1) {
            r3.A0V = i2;
        } else {
            r3.A0W = i2;
        }
    }

    public final void A08() {
        this.A04.A01();
    }

    public final void FJM(C270334gZ r6) {
        C22054Xuf xuf = this.A04;
        if (xuf.A0A && !xuf.A0B) {
            xuf.A02((int) ((((float) ((C22054Xuf) xuf.A08.get(0)).A02) * this.A02.A00) + 0.5f));
        }
    }
}
