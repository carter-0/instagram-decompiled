package X;

import androidx.compose.ui.Modifier;

public final class J8V extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8V(int i, Object obj, Object obj2, Object obj3, boolean z, boolean z2) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r10;
        int i;
        AnonymousClass62P r6;
        Object obj3 = obj;
        if (this.A00 != 0) {
            r10 = (C286575Wy) obj3;
            if (C51968G9o.A0B(obj2) != 2 || !r10.Bwn()) {
                if (0fL.A02()) {
                    0fL.A01(642001203, "com.instagram.schools.management.visibility.EditVisibilityComposeView.<anonymous> (EditVisibilityComposeView.kt:33)");
                }
                if (this.A04) {
                    r10.ExS(1226280835);
                    HXV.A00(r10, (String) null, 0, 1);
                } else if (this.A05 || (r6 = (AnonymousClass62P) this.A03) == null) {
                    r10.ExS(-639924230);
                    C60340gF r3 = C60340gF.A00;
                    r10.ExS(1226284225);
                    Object obj4 = this.A01;
                    boolean AGw = r10.AGw(obj4);
                    Object ECw = r10.ECw();
                    if (AGw || ECw == AnonymousClass5XT.A00) {
                        ECw = new C66160MFx(obj4, (AnonymousClass4D7) null, 18);
                        r10.FLL(ECw);
                    }
                    C51972G9s.A0z(r10, ECw, r3);
                } else {
                    r10.ExS(-639728279);
                    0sP r5 = (0sP) this.A02;
                    C285245Qk r2 = Modifier.A00;
                    AnonymousClass5RD A0Z = C51969G9p.A0Z(r10, 0);
                    int A002 = C287425a7.A00(r10);
                    C286565Wx r32 = (C286565Wx) r10;
                    AnonymousClass5RM A042 = C286565Wx.A04(r32);
                    Modifier A012 = C287435a8.A01(r10, r2);
                    C51973G9u.A0y(r10, r32);
                    C51971G9r.A12(r10, A0Z, A042);
                    0sL r1 = C287485aD.A02;
                    if (r32.A0K || !C51972G9s.A1Q(r10, A002)) {
                        C51971G9r.A13(r10, r1, A002);
                    }
                    C51965G9l.A18(r10, A012);
                    C55130Hce.A00(C288035bG.A00(r10, 2131976881), r10, 0);
                    C56347Hwy.A01(r6, r5, r10, 0);
                    r10.ASN();
                }
                if (C51970G9q.A1a(r10, false)) {
                    i = -583056021;
                }
                return C60340gF.A00;
            }
            r10.Evl();
            return C60340gF.A00;
        }
        r10 = (C286575Wy) obj3;
        if (C51968G9o.A0B(obj2) != 2 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-732305874, "com.instagram.barcelona.common.ui.toast.BdsToastMessage.<anonymous>.<anonymous> (BdsToastMessage.kt:74)");
            }
            Modifier modifier = Modifier.A00;
            C55765Hn0 hn0 = (C55765Hn0) this.A01;
            float f = 20.0f;
            if (this.A04) {
                f = 0.0f;
            }
            Modifier A0B = C287195Zj.A0B(modifier, 20.0f, 0.0f, f, 0.0f);
            C287245Zp r12 = C287215Zl.A04;
            boolean z = this.A05;
            AnonymousClass5RD A0Q = C51965G9l.A0Q(r10, r12);
            int A003 = C287425a7.A00(r10);
            C286565Wx r33 = (C286565Wx) r10;
            AnonymousClass5RM A043 = C286565Wx.A04(r33);
            Modifier A013 = C287435a8.A01(r10, A0B);
            C51973G9u.A0y(r10, r33);
            C51971G9r.A12(r10, A0Q, A043);
            0sL r22 = C287485aD.A02;
            if (r33.A0K || !C51972G9s.A1Q(r10, A003)) {
                C51971G9r.A13(r10, r22, A003);
            }
            C51965G9l.A18(r10, A013);
            AnonymousClass6FX r23 = AnonymousClass6FX.A00;
            r10.ExS(-976017016);
            C286565Wx.A0L(r33, false);
            String str = hn0.A01;
            float f2 = 12.0f;
            if (z) {
                f2 = 16.0f;
            }
            Modifier A09 = C287195Zj.A09(modifier, 0.0f, f2);
            if (z) {
                modifier = r23.A00(modifier);
            }
            Modifier Ezh = A09.Ezh(modifier);
            int i2 = 5;
            if (!z) {
                i2 = 3;
            }
            AnonymousClass5ZZ.A0I(r10, Ezh, C51966G9m.A0h(r10), str, i2, 16252, 0);
            r10.ExS(-976002928);
            if (C51971G9r.A1S(r10, r33, false)) {
                i = -79480446;
            }
            return C60340gF.A00;
        }
        r10.Evl();
        return C60340gF.A00;
        0fL.A00(i);
        return C60340gF.A00;
    }
}
