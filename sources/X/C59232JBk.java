package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.JBk  reason: case insensitive filesystem */
public final class C59232JBk extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59232JBk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A09 = obj;
        this.A07 = obj2;
        this.A0A = z;
        this.A05 = obj3;
        this.A02 = i2;
        this.A06 = obj4;
        this.A03 = obj5;
        this.A08 = obj6;
        this.A04 = obj7;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        switch (this.A00) {
            case 0:
                C286575Wy r11 = (C286575Wy) obj3;
                if ((C51968G9o.A0C(obj4) ^ 2) == 0 && r11.Bwn()) {
                    r11.Evl();
                    break;
                } else {
                    C55961HqS hqS = (C55961HqS) this.A09;
                    hqS.A02.clear();
                    hqS.A00 = 0;
                    r11.ExS(2115886522);
                    C55430Hha hha = hqS.A01;
                    if (hha == null) {
                        hha = new C55430Hha(hqS);
                        hqS.A01 = hha;
                    }
                    C55961HqS hqS2 = hha.A00;
                    C55859Hog A002 = hqS2.A00();
                    C55859Hog A003 = hqS2.A00();
                    C55859Hog A004 = hqS2.A00();
                    C55859Hog A005 = hqS2.A00();
                    C55859Hog A006 = hqS2.A00();
                    C55859Hog A007 = hqS2.A00();
                    C285245Qk r8 = Modifier.A00;
                    boolean A1Y = C51967G9n.A1Y(r11, A003, 1315187157);
                    Object ECw = r11.ECw();
                    if (A1Y || ECw == AnonymousClass5XT.A00) {
                        ECw = C51969G9p.A0z(r11, A003, 17);
                    }
                    0sP r3 = (0sP) ECw;
                    C286565Wx A0H = C51965G9l.A0H(r11, false);
                    DbY.A1S(r8, r3);
                    Modifier Ezh = r8.Ezh(new C52944Gfv(A002, r3));
                    Alignment alignment = C287215Zl.A0E;
                    AnonymousClass5RD A008 = C287675aa.A00(alignment, false);
                    int A009 = C287425a7.A00(r11);
                    AnonymousClass5RM A042 = C286565Wx.A04(A0H);
                    Modifier A012 = C287435a8.A01(r11, Ezh);
                    C62320sa r12 = C287485aD.A00;
                    C51973G9u.A0z(r11, A0H, r12);
                    0sL r6 = C287485aD.A03;
                    0sL A0w = C51969G9p.A0w(r11, A008, A042, r6);
                    0sL r5 = C287485aD.A02;
                    if (A0H.A0K || !C51972G9s.A1Q(r11, A009)) {
                        C51971G9r.A13(r11, r5, A009);
                    }
                    0sL A1K = C51966G9m.A1K(r11, A012);
                    int i = this.A02;
                    C51972G9s.A11(r11, (0sL) this.A05, i >> 6);
                    boolean A1Y2 = C51967G9n.A1Y(r11, A002, 1315199647);
                    boolean z = this.A0A;
                    C55859Hog hog = A004;
                    boolean A1U = C51968G9o.A1U(r11, hog, A1Y2, r11.AGv(z));
                    Object ECw2 = r11.ECw();
                    if (A1U || ECw2 == AnonymousClass5XT.A00) {
                        ECw2 = new GN2(7, A002, hog, z);
                        r11.FLL(ECw2);
                    }
                    0sP A0z = C51965G9l.A0z(A0H, ECw2);
                    DbY.A1S(r8, A0z);
                    Modifier A0010 = C54739HQw.A00(r8.Ezh(new C52944Gfv(A003, A0z)), 0.5625f, false);
                    AnonymousClass5RD A0011 = C287675aa.A00(alignment, false);
                    int A0012 = C287425a7.A00(r11);
                    AnonymousClass5RM A043 = C286565Wx.A04(A0H);
                    Modifier A013 = C287435a8.A01(r11, A0010);
                    C51973G9u.A0z(r11, A0H, r12);
                    C287595aO.A00(r11, A0011, r6);
                    if (C51965G9l.A1Y(r11, A0H, A043, A0w) || !C51972G9s.A1Q(r11, A0012)) {
                        C51971G9r.A13(r11, r5, A0012);
                    }
                    C287595aO.A00(r11, A013, A1K);
                    C51972G9s.A11(r11, (0sL) this.A06, i >> 9);
                    boolean A1Z = G9t.A1Z(r11, A003, A005, 1315217036);
                    Object ECw3 = r11.ECw();
                    if (A1Z || ECw3 == AnonymousClass5XT.A00) {
                        ECw3 = C59102J6k.A00(r11, A003, A005, 6);
                    }
                    0sP A0z2 = C51965G9l.A0z(A0H, ECw3);
                    DbY.A1S(r8, A0z2);
                    Modifier Ezh2 = r8.Ezh(new C52944Gfv(A007, A0z2));
                    AnonymousClass5RD A0013 = C287675aa.A00(alignment, false);
                    int A0014 = C287425a7.A00(r11);
                    AnonymousClass5RM A044 = C286565Wx.A04(A0H);
                    Modifier A014 = C287435a8.A01(r11, Ezh2);
                    C51973G9u.A0z(r11, A0H, r12);
                    C287595aO.A00(r11, A0013, r6);
                    if (C51965G9l.A1Y(r11, A0H, A044, A0w) || !C51972G9s.A1Q(r11, A0014)) {
                        C51971G9r.A13(r11, r5, A0014);
                    }
                    C287595aO.A00(r11, A014, A1K);
                    HY1.A00(r11, C289515dj.A00.CmS(r8), HLA.BOTTOM_UP, 6, 0);
                    r11.ASN();
                    boolean A1U2 = C51968G9o.A1U(r11, A004, C51967G9n.A1Y(r11, A003, 1315238458), r11.AGv(z));
                    Object ECw4 = r11.ECw();
                    if (A1U2 || ECw4 == AnonymousClass5XT.A00) {
                        ECw4 = new GN2(8, A003, A004, z);
                        r11.FLL(ECw4);
                    }
                    0sP A0z3 = C51965G9l.A0z(A0H, ECw4);
                    DbY.A1S(r8, A0z3);
                    Modifier Ezh3 = r8.Ezh(new C52944Gfv(A005, A0z3));
                    AnonymousClass5RD A0015 = C287675aa.A00(alignment, false);
                    int A0016 = C287425a7.A00(r11);
                    AnonymousClass5RM A045 = C286565Wx.A04(A0H);
                    Modifier A015 = C287435a8.A01(r11, Ezh3);
                    C51973G9u.A0z(r11, A0H, r12);
                    C287595aO.A00(r11, A0015, r6);
                    if (C51965G9l.A1Y(r11, A0H, A045, A0w) || !C51972G9s.A1Q(r11, A0016)) {
                        C51971G9r.A13(r11, r5, A0016);
                    }
                    C287595aO.A00(r11, A015, A1K);
                    C51972G9s.A11(r11, (0sL) this.A03, i >> 15);
                    boolean A1Y3 = C51967G9n.A1Y(r11, A003, 1315253112);
                    Object ECw5 = r11.ECw();
                    if (A1Y3 || ECw5 == AnonymousClass5XT.A00) {
                        ECw5 = C51969G9p.A0z(r11, A003, 18);
                    }
                    0sP A0z4 = C51965G9l.A0z(A0H, ECw5);
                    DbY.A1S(r8, A0z4);
                    Modifier Ezh4 = r8.Ezh(new C52944Gfv(A006, A0z4));
                    AnonymousClass5RD A0017 = C287675aa.A00(alignment, false);
                    int A0018 = C287425a7.A00(r11);
                    AnonymousClass5RM A046 = C286565Wx.A04(A0H);
                    Modifier A016 = C287435a8.A01(r11, Ezh4);
                    C51973G9u.A0z(r11, A0H, r12);
                    C287595aO.A00(r11, A0017, r6);
                    0sL r15 = A0w;
                    if (C51965G9l.A1Y(r11, A0H, A046, r15) || !C51972G9s.A1Q(r11, A0018)) {
                        C51971G9r.A13(r11, r5, A0018);
                    }
                    C287595aO.A00(r11, A016, A1K);
                    C51972G9s.A11(r11, (0sL) this.A08, i >> 18);
                    Modifier A0F = C51967G9n.A0F(r8, 10.0f);
                    boolean A1W = G9t.A1W(r11, A003, 1315262456, z);
                    Object ECw6 = r11.ECw();
                    if (A1W || ECw6 == AnonymousClass5XT.A00) {
                        ECw6 = new C58736Iwj(11, A003, z);
                        r11.FLL(ECw6);
                    }
                    0sP A0z5 = C51965G9l.A0z(A0H, ECw6);
                    DbY.A1S(A0F, A0z5);
                    Modifier Ezh5 = A0F.Ezh(new C52944Gfv(A004, A0z5));
                    AnonymousClass5RD A0019 = C287675aa.A00(C287215Zl.A0C, false);
                    int A0020 = C287425a7.A00(r11);
                    AnonymousClass5RM A047 = C286565Wx.A04(A0H);
                    Modifier A017 = C287435a8.A01(r11, Ezh5);
                    C51973G9u.A0z(r11, A0H, r12);
                    C287595aO.A00(r11, A0019, r6);
                    if (C51965G9l.A1Y(r11, A0H, A047, r15) || !C51972G9s.A1Q(r11, A0020)) {
                        C51971G9r.A13(r11, r5, A0020);
                    }
                    C287595aO.A00(r11, A017, A1K);
                    C51972G9s.A11(r11, (0sL) this.A04, i >> 12);
                    C286565Wx.A0L(A0H, false);
                    break;
                }
                break;
            case 1:
                boolean z2 = this.A0A;
                C362088hK r52 = (C362088hK) this.A03;
                C56619I4u.A00(C51966G9m.A0R(obj3, obj4), (HLB) this.A09, (I12) this.A08, r52, (C62320sa) this.A06, (C62320sa) this.A04, (C62320sa) this.A05, (C62320sa) this.A07, C51966G9m.A01(this.A01), this.A02, z2);
                break;
            case 2:
                C62320sa r62 = (C62320sa) this.A05;
                C62320sa r7 = (C62320sa) this.A03;
                C56576I2g.A01(C51966G9m.A0R(obj3, obj4), (C61084JwM) this.A08, (HLB) this.A09, (C62320sa) this.A04, r62, r7, (C62320sa) this.A07, (0sP) this.A06, C51966G9m.A01(this.A01), this.A02, this.A0A);
                break;
            case 3:
                C287185Zi.A02(C51966G9m.A0R(obj3, obj4), (C376459Ib) this.A04, (AnonymousClass9J5) this.A07, (AnonymousClass9J5) this.A05, (AnonymousClass9J5) this.A09, (AnonymousClass9J5) this.A08, (C61084JwM) this.A06, (C248733iV) this.A03, C51966G9m.A01(this.A01), this.A02, this.A0A);
                break;
            default:
                C286575Wy A0R = C51966G9m.A0R(obj3, obj4);
                boolean z3 = this.A0A;
                I7V.A05(A0R, (Modifier) this.A03, (C53397GnU) this.A09, (C62320sa) this.A05, (C62320sa) this.A07, (0sP) this.A08, (0sP) this.A06, (0sP) this.A04, C51966G9m.A01(this.A01), this.A02, z3);
                break;
        }
        return C60340gF.A00;
    }
}
