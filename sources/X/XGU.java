package X;

import java.util.List;

public final class XGU extends C270324gY {
    public final void A08() {
        this.A06 = null;
        this.A04.A01();
    }

    public final boolean A0B() {
        return false;
    }

    public final void A06() {
        List list;
        C270324gY r0;
        AnonymousClass3ME r6 = this.A02;
        if (r6 instanceof AnonymousClass3ME) {
            C22054Xuf xuf = this.A04;
            xuf.A09 = true;
            AnonymousClass3ME r62 = r6;
            int i = r62.A00;
            boolean z = r62.A02;
            int i2 = 0;
            if (i == 0) {
                xuf.A06 = AnonymousClass05K.A0N;
                while (i2 < r62.A00) {
                    2d3 r1 = r62.A01[i2];
                    if (z || r1.A0R != 8) {
                        C22054Xuf xuf2 = r1.A0k.A04;
                        C22054Xuf.A00(xuf, xuf2, xuf2.A07);
                    }
                    i2++;
                }
            } else if (i != 1) {
                if (i == 2) {
                    xuf.A06 = AnonymousClass05K.A0j;
                    while (i2 < r62.A00) {
                        2d3 r12 = r62.A01[i2];
                        if (z || r12.A0R != 8) {
                            C22054Xuf xuf3 = r12.A0l.A04;
                            C22054Xuf.A00(xuf, xuf3, xuf3.A07);
                        }
                        i2++;
                    }
                } else if (i == 3) {
                    xuf.A06 = AnonymousClass05K.A0u;
                    while (i2 < r62.A00) {
                        2d3 r13 = r62.A01[i2];
                        if (z || r13.A0R != 8) {
                            C22054Xuf xuf4 = r13.A0l.A03;
                            C22054Xuf.A00(xuf, xuf4, xuf4.A07);
                        }
                        i2++;
                    }
                } else {
                    return;
                }
                C22054Xuf xuf5 = this.A02.A0l.A04;
                list = xuf.A07;
                C22054Xuf.A00(xuf5, xuf, list);
                r0 = this.A02.A0l;
                C22054Xuf.A00(r0.A03, xuf, list);
            } else {
                xuf.A06 = AnonymousClass05K.A0Y;
                while (i2 < r62.A00) {
                    2d3 r14 = r62.A01[i2];
                    if (z || r14.A0R != 8) {
                        C22054Xuf xuf6 = r14.A0k.A03;
                        C22054Xuf.A00(xuf, xuf6, xuf6.A07);
                    }
                    i2++;
                }
            }
            C22054Xuf xuf7 = this.A02.A0k.A04;
            list = xuf.A07;
            C22054Xuf.A00(xuf7, xuf, list);
            r0 = this.A02.A0k;
            C22054Xuf.A00(r0.A03, xuf, list);
        }
    }

    public final void A07() {
        AnonymousClass3ME r2 = this.A02;
        if (r2 instanceof AnonymousClass3ME) {
            int i = r2.A00;
            if (i == 0 || i == 1) {
                r2.A0V = this.A04.A02;
            } else {
                r2.A0W = this.A04.A02;
            }
        }
    }

    public final void FJM(C270334gZ r9) {
        int i;
        AnonymousClass3ME r7 = this.A02;
        int i2 = r7.A00;
        C22054Xuf xuf = this.A04;
        int i3 = 0;
        int i4 = -1;
        for (C22054Xuf xuf2 : xuf.A08) {
            int i5 = xuf2.A02;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            i = i4 + r7.A01;
        } else {
            i = i3 + r7.A01;
        }
        xuf.A02(i);
    }
}
