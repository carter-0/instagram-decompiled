package X;

import java.util.List;

/* renamed from: X.GwI  reason: case insensitive filesystem */
public final class C53912GwI extends C251343mx {
    public final HI9 A00;
    public final Integer A01;
    public final 0sP A02;
    public final boolean A03;
    public final boolean A04;
    public final 2WX A05;
    public final HMY A06;
    public final 0sL A07;
    public final 0sJ A08;
    public final boolean A09;

    public C53912GwI(2WX r2, HI9 hi9, HMY hmy, Integer num, 0sP r6, 0sL r7, 0sJ r8, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TF.A1G(hmy, 4, r6);
        this.A00 = hi9;
        this.A03 = z;
        this.A04 = z2;
        this.A06 = hmy;
        this.A01 = num;
        this.A09 = z3;
        this.A07 = r7;
        this.A08 = r8;
        this.A02 = r6;
        this.A05 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r20) {
        List list;
        boolean z;
        C54627HLk hLk;
        AnonymousClass3Y5 r4 = r20;
        0qQ.A0B(r4, 0);
        HI9 hi9 = this.A00;
        C56123HtB htB = hi9.A00;
        if (htB != null) {
            list = htB.A02;
            z = htB.A03;
        } else {
            list = 0sn.A00;
            z = false;
        }
        List list2 = (List) AnonymousClass3Zw.A00(r4, C58688Ivx.A00(list, this, 6), C51968G9o.A1a(list, z));
        Boolean valueOf = Boolean.valueOf(this.A04);
        0sP r5 = this.A02;
        0sP r10 = (0sP) C58714IwN.A00(r4, this, new Object[]{valueOf, r5, list}, 7);
        0sJ r15 = (0sJ) C58714IwN.A00(r4, this, new Object[]{valueOf, r5, list}, 9);
        0sP r11 = (0sP) C58714IwN.A00(r4, this, new Object[]{r5, list}, 10);
        0sP r12 = (0sP) C58714IwN.A00(r4, this, new Object[]{r5, list}, 8);
        0sL r14 = (0sL) C58714IwN.A00(r4, this, new Object[]{r5, list}, 6);
        AnonymousClass3B3 r52 = (AnonymousClass3B3) AnonymousClass3Zw.A00(r4, C58557Itq.A00, C51966G9m.A1b());
        boolean z2 = hi9.A04;
        if (z2) {
            hLk = C54627HLk.VScrollDynamicSizeGrid;
        } else {
            hLk = C54627HLk.HScroll;
        }
        int i = Integer.MAX_VALUE;
        if (hLk != C54627HLk.HScroll) {
            r52 = null;
            i = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        return new C53916GwM(r52, this.A05, hLk, this.A06, list2, r10, r11, r12, J5F.A00, r14, r15, i, this.A09, z2);
    }

    public static final void A00(C56556I1k i1k, C53912GwI gwI, C56091Hse hse, Integer num, C62320sa r7) {
        C56146HtY htY;
        if (i1k != null && (htY = i1k.A01) != null) {
            0sP r3 = gwI.A02;
            r3.invoke(HI3.A00);
            int intValue = gwI.A01.intValue();
            if (intValue == 0) {
                r3.invoke(new C54527HHo(htY));
            } else if (intValue == 1) {
                gwI.A07.invoke(htY, hse);
            } else if (intValue == 2) {
                0sJ r1 = gwI.A08;
                if (num != null) {
                    r1.invoke(htY, hse, Integer.valueOf(num.intValue()), r7);
                }
            }
        }
    }
}
