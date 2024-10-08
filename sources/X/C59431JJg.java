package X;

import java.util.List;

/* renamed from: X.JJg  reason: case insensitive filesystem */
public final class C59431JJg extends 0Yg implements 0sJ {
    public final /* synthetic */ EGP A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ 0sP A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59431JJg(EGP egp, List list, 0sP r4, 0sP r5, boolean z, boolean z2) {
        super(4);
        this.A01 = list;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = egp;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C286565Wx r3;
        boolean z;
        int A0M = AnonymousClass7TE.A0M(obj2);
        C286575Wy r6 = (C286575Wy) obj3;
        int A0M2 = AnonymousClass7TE.A0M(obj4);
        if ((A0M2 & 6) == 0) {
            i = G9t.A0O(r6, obj) | A0M2;
        } else {
            i = A0M2;
        }
        if ((A0M2 & 48) == 0) {
            i |= G9t.A06(r6, A0M);
        }
        if ((i & 147) != 146 || !r6.Bwn()) {
            if (0fL.A02()) {
                C51965G9l.A17(-1361054492);
            }
            int i2 = i & 14;
            C319156q8 r8 = (C319156q8) this.A01.get(A0M);
            r6.ExS(1792692749);
            if (this.A04) {
                r6.ExS(1792716370);
                if (this.A05) {
                    r6.ExS(1792740705);
                    r6.ExS(-219261210);
                    0sP r1 = this.A02;
                    boolean A1T = C51971G9r.A1T(r6, r1, r8);
                    Object ECw = r6.ECw();
                    if (A1T || ECw == AnonymousClass5XT.A00) {
                        ECw = new MJ4(43, r1, r8);
                        r6.FLL(ECw);
                    }
                    C62320sa r4 = (C62320sa) ECw;
                    r3 = (C286565Wx) r6;
                    z = false;
                    C286565Wx.A0I(r3);
                    r6.ExS(-219259382);
                    0sP r2 = this.A03;
                    boolean A1T2 = C51971G9r.A1T(r6, r2, r8);
                    Object ECw2 = r6.ECw();
                    if (A1T2 || ECw2 == AnonymousClass5XT.A00) {
                        ECw2 = new MJ4(44, r2, r8);
                        r6.FLL(ECw2);
                    }
                    C286565Wx.A0I(r3);
                    C56594I2y.A01(r6, r8, r4, (C62320sa) ECw2, (i2 >> 3) & 14);
                } else {
                    r6.ExS(1792960216);
                    EGP egp = this.A00;
                    r6.ExS(-219252858);
                    0sP r12 = this.A02;
                    boolean A1T3 = C51971G9r.A1T(r6, r12, r8);
                    Object ECw3 = r6.ECw();
                    if (A1T3 || ECw3 == AnonymousClass5XT.A00) {
                        ECw3 = new MJ4(45, r12, r8);
                        r6.FLL(ECw3);
                    }
                    C62320sa r9 = (C62320sa) ECw3;
                    r3 = (C286565Wx) r6;
                    z = false;
                    C286565Wx.A0L(r3, false);
                    r6.ExS(-219251030);
                    0sP r22 = this.A03;
                    boolean A1T4 = C51971G9r.A1T(r6, r22, r8);
                    Object ECw4 = r6.ECw();
                    if (A1T4 || ECw4 == AnonymousClass5XT.A00) {
                        ECw4 = new MJ4(46, r22, r8);
                        r6.FLL(ECw4);
                    }
                    C56594I2y.A00(r6, egp, r8, r9, C51965G9l.A0y(r3, ECw4, false), i2 & 112, 0);
                }
                C286565Wx.A0L(r3, z);
            } else {
                r6.ExS(1793223220);
                C56594I2y.A00(r6, this.A00, r8, (C62320sa) null, (C62320sa) null, i2 & 112, 12);
            }
            if (C51967G9n.A1a(C51965G9l.A0G(r6))) {
                0fL.A00(1274114711);
            }
        } else {
            r6.Evl();
        }
        return C60340gF.A00;
    }
}
