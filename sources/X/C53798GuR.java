package X;

import java.util.List;

/* renamed from: X.GuR  reason: case insensitive filesystem */
public final class C53798GuR extends C251343mx {
    public final 0sP A00;
    public final boolean A01;
    public final boolean A02;
    public final 2WX A03;
    public final HI8 A04;
    public final HMY A05;

    public final C251263mp A0X(AnonymousClass3Y5 r22) {
        C54627HLk hLk;
        AnonymousClass3Y5 r6 = r22;
        0qQ.A0B(r6, 0);
        JMS jms = this.A04.A00;
        if (jms instanceof M1B) {
            return new C53666GsJ(this.A03, C58714IwN.A01(this, 11));
        }
        boolean z = this.A02;
        AnonymousClass3B3 r7 = (AnonymousClass3B3) C58714IwN.A00(r6, this, C51968G9o.A1b(z), 12);
        List list = (List) AnonymousClass3Zw.A00(r6, C58688Ivx.A00(jms, this, 7), new Object[]{jms});
        HMY hmy = this.A05;
        if (z) {
            hLk = C54627HLk.VScrollFixedSizeGrid;
        } else {
            hLk = C54627HLk.HScroll;
        }
        return new C53916GwM(r7, this.A03, hLk, hmy, list, C59105J6n.A02(this, 9), C59105J6n.A02(this, 10), (0sP) null, C59105J6n.A02(this, 11), (0sL) null, (0sJ) null, AnonymousClass972.MUTABLE_FLAG_MASK, false, false);
    }

    public C53798GuR(2WX r1, HI8 hi8, HMY hmy, 0sP r4, boolean z, boolean z2) {
        C51974G9v.A1L(hi8, hmy, r4);
        this.A04 = hi8;
        this.A05 = hmy;
        this.A02 = z;
        this.A00 = r4;
        this.A01 = z2;
        this.A03 = r1;
    }
}
