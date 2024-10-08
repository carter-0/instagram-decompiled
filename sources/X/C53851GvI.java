package X;

/* renamed from: X.GvI  reason: case insensitive filesystem */
public final class C53851GvI extends C251343mx {
    public final HMY A00;
    public final 0sP A01;
    public final boolean A02;
    public final 2WX A03;
    public final HQ2 A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final C251263mp A0X(AnonymousClass3Y5 r19) {
        AnonymousClass3Y5 r1 = r19;
        0qQ.A0B(r1, 0);
        C55929Hpr A012 = C56190HuJ.A01(r1, AnonymousClass000.A00(10), (0sP) null);
        HQ2 hq2 = this.A04;
        AnonymousClass4F7.A01(r1, J5L.A00, new Object[]{hq2});
        AnonymousClass4F7.A01(r1, J5M.A00, new Object[]{hq2});
        AnonymousClass4F7.A01(r1, J5N.A00, new Object[]{hq2});
        2WX r6 = this.A03;
        Integer num = AnonymousClass05K.A00;
        AnonymousClass9JQ A0b = C51965G9l.A0b(num, 100.0f, 0);
        if (r6 == 2WX.A02) {
            r6 = null;
        }
        2WX A0X = C51965G9l.A0X(r6, A0b);
        Integer num2 = AnonymousClass05K.A01;
        2WX A0X2 = C51971G9r.A0X(A0X, num2, 100.0f, 0);
        if (hq2 instanceof HI8) {
            HMY hmy = this.A00;
            boolean z = this.A09;
            return new C53798GuR(C51971G9r.A0V(r1.A05, A0X2, C243533Zd.GLOBAL, "suggestions_visibility"), (HI8) hq2, hmy, this.A01, z, this.A05);
        } else if (hq2 instanceof HIC) {
            return new C53637Grq(C51971G9r.A0V(r1.A05, A0X2, C243533Zd.GLOBAL, "suggestions_search_visibility"));
        } else {
            if (hq2 instanceof HID) {
                C56105Hss hss = ((HID) hq2).A00;
                boolean z2 = this.A02;
                boolean z3 = this.A07;
                return new C53836Gv3(A0X2, this.A00, hss, this.A01, JG3.A00(A012, this, r1, 36), z2, z3, this.A08);
            } else if (hq2 instanceof HI9) {
                HI9 hi9 = (HI9) hq2;
                if (hi9.A04) {
                    num = AnonymousClass05K.A0C;
                } else if (this.A08) {
                    num = num2;
                }
                return new C53912GwI(C51971G9r.A0V(r1.A05, A0X2, C243533Zd.GLOBAL, "results_visibility"), hi9, this.A00, num, this.A01, JG3.A00(A012, this, r1, 37), new JK1(13, (Object) this, (Object) A012, (Object) r1), this.A02, this.A07, this.A06);
            } else if (hq2 instanceof HIA) {
                return new C53880Gvl(A0X2);
            } else {
                return new AnonymousClass3XA();
            }
        }
    }

    public C53851GvI(2WX r1, HQ2 hq2, HMY hmy, 0sP r4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C51972G9s.A1B(hq2, hmy);
        this.A04 = hq2;
        this.A02 = z;
        this.A07 = z2;
        this.A00 = hmy;
        this.A09 = z3;
        this.A08 = z4;
        this.A01 = r4;
        this.A03 = r1;
        this.A05 = z5;
        this.A06 = z6;
    }
}
