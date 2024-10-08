package X;

import androidx.compose.ui.Modifier;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class J95 extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ MediaFrameLayout A01;
    public final /* synthetic */ AnonymousClass3WR A02;
    public final /* synthetic */ C55956HqK A03;
    public final /* synthetic */ C55870Hor A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J95(MediaFrameLayout mediaFrameLayout, AnonymousClass3WR r3, C55956HqK hqK, C55870Hor hor, float f, boolean z, boolean z2) {
        super(2);
        this.A03 = hqK;
        this.A01 = mediaFrameLayout;
        this.A00 = f;
        this.A06 = z;
        this.A02 = r3;
        this.A04 = hor;
        this.A05 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Modifier modifier;
        C286575Wy r5 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-519433421, "com.instagram.wonderwall.ui.compose.components.MediaVideoPlayer.<anonymous> (WallVideoAttachment.kt:95)");
            }
            C55956HqK hqK = this.A03;
            MediaFrameLayout mediaFrameLayout = this.A01;
            float f = this.A00;
            boolean z = this.A06;
            AnonymousClass3WR r24 = this.A02;
            C55870Hor hor = this.A04;
            boolean z2 = this.A05;
            C285245Qk r2 = Modifier.A00;
            AnonymousClass5RD A002 = C287675aa.A00(C287215Zl.A0E, false);
            int A003 = C287425a7.A00(r5);
            C286565Wx r6 = (C286565Wx) r5;
            AnonymousClass5RM A042 = C286565Wx.A04(r6);
            Modifier A012 = C287435a8.A01(r5, r2);
            C51973G9u.A0y(r5, r6);
            C51971G9r.A12(r5, A002, A042);
            0sL r1 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r5, A003)) {
                C51971G9r.A13(r5, r1, A003);
            }
            C51965G9l.A18(r5, A012);
            C289515dj r12 = C289515dj.A00;
            Modifier A0U = C51966G9m.A0U(r2);
            r5.ExS(734001997);
            if (!C51971G9r.A1X(hqK.A00)) {
                Object A0m = C51967G9n.A0m(r5, 734006079);
                Object obj3 = AnonymousClass5XT.A00;
                C287605aT r14 = (C287605aT) C51972G9s.A0l(r5, A0m, obj3);
                C286565Wx.A0L(r6, false);
                boolean A1Y = C51967G9n.A1Y(r5, hqK, 734010240);
                Object ECw = r5.ECw();
                if (A1Y || ECw == obj3) {
                    ECw = C58704IwD.A00(r5, hqK, 0);
                }
                modifier = C287635aW.A04(r14, r2, C51965G9l.A0y(r6, ECw, false));
            } else {
                modifier = r2;
            }
            Modifier A0B = C51967G9n.A0B(r6, A0U, modifier);
            boolean A1Z = C51967G9n.A1Z(r5, mediaFrameLayout, 734014310);
            Object ECw2 = r5.ECw();
            if (A1Z || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new MPC(mediaFrameLayout, 49);
                r5.FLL(ECw2);
            }
            0sP A0z = C51965G9l.A0z(r6, ECw2);
            r5.ExS(734015112);
            boolean AGr = r5.AGr(f);
            Object ECw3 = r5.ECw();
            if (AGr || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new C58726IwZ(f, 13);
                r5.FLL(ECw3);
            }
            I63.A02(r5, A0B, A0z, C51965G9l.A0z(r6, ECw3), 0, 0);
            r5.ExS(734017117);
            if (z && AnonymousClass7TF.A1Y(r24.A0B, true)) {
                boolean A1W = C51971G9r.A1W(hor.A00);
                Modifier A0B2 = C287195Zj.A0B(r12.AAz(C287215Zl.A07, r2), 0.0f, 0.0f, 12.0f, 12.0f);
                Object A0m2 = C51967G9n.A0m(r5, 734020052);
                if (A0m2 == AnonymousClass5XT.A00) {
                    A0m2 = C58704IwD.A01(hor, 1);
                    r5.FLL(A0m2);
                }
                I3E.A02(r5, A0B2, C51965G9l.A0y(r6, A0m2, false), 384, A1W);
            }
            Boolean A0f = C51967G9n.A0f(r6, z2);
            boolean A1W2 = G9t.A1W(r5, hqK, 734027545, z2);
            Object ECw4 = r5.ECw();
            if (A1W2 || ECw4 == AnonymousClass5XT.A00) {
                ECw4 = new MG9(hqK, (AnonymousClass4D7) null, 40, z2);
                r5.FLL(ECw4);
            }
            C51968G9o.A1E(r5, r6, ECw4, A0f);
            if (C51967G9n.A1R(r5)) {
                0fL.A00(1339893897);
            }
        } else {
            r5.Evl();
        }
        return C60340gF.A00;
    }
}
