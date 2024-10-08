package X;

import androidx.compose.ui.Modifier;

public final class J8L extends 0Yg implements 0sL {
    public final /* synthetic */ C284945Oz A00;
    public final /* synthetic */ C55955HqJ A01;
    public final /* synthetic */ C54327H7y A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8L(C284945Oz r2, C55955HqJ hqJ, C54327H7y h7y, 0sP r5, boolean z, boolean z2) {
        super(2);
        this.A02 = h7y;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = hqJ;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r13 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-91877109, "com.instagram.wonderwall.ui.compose.components.MediumVideoPlayer.<anonymous> (WallVideoAttachment.kt:189)");
            }
            C54327H7y h7y = this.A02;
            boolean z = this.A05;
            boolean z2 = this.A04;
            0sP r6 = this.A03;
            C284945Oz r8 = this.A00;
            C55955HqJ hqJ = this.A01;
            C285245Qk r7 = Modifier.A00;
            AnonymousClass5RD A002 = C287675aa.A00(C287215Zl.A0E, false);
            int A003 = C287425a7.A00(r13);
            C286565Wx r2 = (C286565Wx) r13;
            AnonymousClass5RM A042 = C286565Wx.A04(r2);
            Modifier A012 = C287435a8.A01(r13, r7);
            C51973G9u.A0y(r13, r2);
            C51971G9r.A12(r13, A002, A042);
            0sL r1 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r13, A003)) {
                C51971G9r.A13(r13, r1, A003);
            }
            C51965G9l.A18(r13, A012);
            C289515dj r12 = C289515dj.A00;
            Modifier A0U = C51966G9m.A0U(r7);
            boolean A1Z = C51967G9n.A1Z(r13, h7y, -1493136431);
            Object ECw = r13.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = C59098J6g.A01(h7y, 0);
                r13.FLL(ECw);
            }
            I63.A02(r13, A0U, C51965G9l.A0z(r2, ECw), (0sP) null, 48, 4);
            r13.ExS(-1493135159);
            if (z && C51971G9r.A1W(r8)) {
                Modifier A0B = C287195Zj.A0B(r12.AAz(C287215Zl.A07, r7), 0.0f, 0.0f, 12.0f, 12.0f);
                boolean A1V = C51966G9m.A1V(r13, z2, C51967G9n.A1Y(r13, r6, -1493131679));
                Object ECw2 = r13.ECw();
                if (A1V || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new GL3(26, r6, hqJ, z2);
                    r13.FLL(ECw2);
                }
                I3E.A02(r13, A0B, C51965G9l.A0y(r2, ECw2, false), 0, z2);
            }
            if (C51971G9r.A1S(r13, r2, false)) {
                0fL.A00(1097620877);
            }
        } else {
            r13.Evl();
        }
        return C60340gF.A00;
    }
}
