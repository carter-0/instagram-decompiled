package X;

/* renamed from: X.Guz  reason: case insensitive filesystem */
public final class C53832Guz extends C251343mx {
    public final XSY A00;
    public final XSY A01;
    public final C54691HOw A02;
    public final 2WX A03;
    public final Integer A04;
    public final String A05;
    public final C62320sa A06;
    public final boolean A07 = true;

    public C53832Guz(XSY xsy, XSY xsy2, C54691HOw hOw, 2WX r5, Integer num, String str, C62320sa r8) {
        DbZ.A0t(1, xsy, hOw, num);
        this.A00 = xsy;
        this.A02 = hOw;
        this.A04 = num;
        this.A01 = xsy2;
        this.A05 = str;
        this.A06 = r8;
        this.A03 = r5;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r20) {
        AnonymousClass3XV r10;
        AnonymousClass3XV r8;
        int i;
        2WX A002;
        C21255XRa xRa;
        2WX r1 = this.A03;
        long A0E = C51969G9p.A0E();
        if (r1 != null) {
            r10 = 2WX.A02;
            r8 = r10;
            i = 2;
            A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A1F, 2, A0E);
        } else {
            r1 = new 2WX((2WX) null, (AnonymousClass2WY) null);
            r10 = 2WX.A02;
            r8 = r10;
            i = 2;
            A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A1F, 2, A0E);
        }
        2WX A003 = r1.A00(A002);
        boolean z = this.A07;
        2WX A004 = A003.A00(G9t.A10((2WX) null, AnonymousClass05K.A0F, Boolean.valueOf(z)));
        String str = this.A05;
        if (str != null) {
            r10 = C51971G9r.A0Y((2WX) null, AnonymousClass05K.A0N, str, 0);
        }
        2WX A005 = A004.A00(r10);
        Integer num = AnonymousClass05K.A01;
        2WX A006 = A005.A00(C51972G9s.A0U((2WX) null, num, 0));
        float f = 1.0f;
        if (!z) {
            f = 0.3f;
        }
        2WX A007 = new 2WX((2WX) null, (AnonymousClass2WY) null).A00(C52112GFg.A01(r8, f));
        C62320sa r12 = this.A06;
        if (r12 == null || !z) {
            A007 = A006.A00(A007);
        }
        XSY xsy = this.A00;
        C54691HOw hOw = this.A02;
        C54690HOv hOv = C54690HOv.SIZE_24;
        int intValue = this.A04.intValue();
        if (intValue == 0) {
            xRa = C21255XRa.A1o;
        } else if (intValue == 1) {
            xRa = C21255XRa.A2A;
        } else if (intValue == i) {
            xRa = C21255XRa.A1W;
        } else if (intValue == 3) {
            xRa = C21255XRa.A0u;
        } else if (intValue == 4) {
            xRa = C21255XRa.A1p;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        C53794GuN guN = new C53794GuN(xsy, this.A01, hOv, hOw, xRa, A007);
        if (r12 == null || !z) {
            return guN;
        }
        return new C53795GuO(guN, A006, AnonymousClass05K.A00, AnonymousClass05K.A0C, num, r12);
    }
}
