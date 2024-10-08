package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;

public final class JBE extends 0Yg implements 0sL {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JBE(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A09 = obj2;
        this.A08 = obj3;
        this.A05 = obj4;
        this.A06 = obj5;
        this.A07 = obj6;
        this.A04 = obj7;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        switch (this.A00) {
            case 0:
                C286575Wy A0R = C51966G9m.A0R(obj3, obj4);
                HXK.A00((C52882GeI) this.A03, (C56838IEj) this.A08, A0R, (C284945Oz) this.A09, (Modifier) this.A06, (HL4) this.A05, (0sP) this.A07, (0sL) this.A04, C51966G9m.A01(this.A01), this.A02);
                break;
            case 1:
                C286575Wy r11 = (C286575Wy) obj3;
                if ((C51968G9o.A0C(obj4) ^ 2) == 0 && r11.Bwn()) {
                    r11.Evl();
                    break;
                } else {
                    C55961HqS hqS = (C55961HqS) this.A08;
                    hqS.A02.clear();
                    hqS.A00 = 0;
                    r11.ExS(-970882442);
                    C55430Hha hha = hqS.A01;
                    if (hha == null) {
                        hha = new C55430Hha(hqS);
                        hqS.A01 = hha;
                    }
                    C55961HqS hqS2 = hha.A00;
                    C55859Hog A002 = hqS2.A00();
                    C55859Hog A003 = hqS2.A00();
                    C55859Hog A004 = hqS2.A00();
                    C53390GnN gnN = (C53390GnN) this.A09;
                    Integer num = gnN.A02;
                    r11.ExS(1631251677);
                    if (num != null) {
                        int intValue = num.intValue();
                        ImmutableList immutableList = (ImmutableList) this.A04;
                        AnonymousClass2DN A0W = C51975G9x.A0W(r11, AnonymousClass7TE.A19(immutableList, intValue));
                        C285245Qk r4 = Modifier.A00;
                        J2O j2o = J2O.A00;
                        DbY.A1S(r4, j2o);
                        Modifier A005 = C54739HQw.A00(r4.Ezh(new C52944Gfv(A002, j2o)), C51971G9r.A02((C284945Oz) this.A03), false);
                        IFU ifu = new IFU(24.0f);
                        C286575Wy r16 = r11;
                        AnonymousClass6G3.A0A(r16, AnonymousClass6FZ.A01(A005, new AnonymousClass5ZR(ifu, ifu, ifu, ifu)), A0W, C288075bK.A02, C288035bG.A00(r11, 2131963045), 24584);
                        r11.ExS(1631267353);
                        if (gnN.A00 <= 0.0f) {
                            boolean A1Y = C51967G9n.A1Y(r11, A002, 1185064929);
                            Object ECw = r11.ECw();
                            if (A1Y || ECw == AnonymousClass5XT.A00) {
                                ECw = C51969G9p.A0z(r11, A002, 32);
                            }
                            0sP r9 = (0sP) ECw;
                            C286565Wx A0H = C51965G9l.A0H(r11, false);
                            DbY.A1S(r4, r9);
                            int i = this.A02;
                            C54922HYe.A00(r11, r4.Ezh(new C52944Gfv(A004, r9)), (C55473HiH) this.A05, i & 112, 0);
                            if (gnN.A03.size() > 1) {
                                boolean A1Y2 = C51967G9n.A1Y(r11, A002, 1185076608);
                                Object ECw2 = r11.ECw();
                                if (A1Y2 || ECw2 == AnonymousClass5XT.A00) {
                                    ECw2 = C51969G9p.A0z(r11, A002, 33);
                                }
                                0sP A0z = C51965G9l.A0z(A0H, ECw2);
                                DbY.A1S(r4, A0z);
                                C56281Hvp.A00(r11, r4.Ezh(new C52944Gfv(A003, A0z)), immutableList, (0sP) this.A07, intValue, (i & 896) | ((i << 9) & 7168), 0);
                            }
                        }
                        C51965G9l.A1X(r11, false);
                    }
                    C286565Wx.A0L(C51965G9l.A0H(r11, false), false);
                    break;
                }
                break;
            case 2:
                C56284Hvs.A01(C51966G9m.A0R(obj3, obj4), (C52369GPq) this.A03, (C53357Gmh) this.A09, (C62320sa) this.A06, (C62320sa) this.A08, (C62320sa) this.A05, (C62320sa) this.A07, (0sP) this.A04, C51966G9m.A01(this.A01), this.A02);
                break;
            default:
                HMD hmd = (HMD) this.A09;
                I58.A03(C51966G9m.A0R(obj3, obj4), (ImmutableList) this.A08, hmd, (C62320sa) this.A04, (C62320sa) this.A05, (C62320sa) this.A06, (C62320sa) this.A03, (0sK) this.A07, C51966G9m.A01(this.A01), this.A02);
                break;
        }
        return C60340gF.A00;
    }
}
