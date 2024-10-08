package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.HuU  reason: case insensitive filesystem */
public abstract class C56201HuU {
    public static final void A01(C286575Wy r33, C61073JwB jwB, int i) {
        int i2;
        C61073JwB jwB2 = jwB;
        0qQ.A0B(jwB2, 0);
        C286575Wy r0 = r33;
        r0.ExV(489306567);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r0, jwB2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(76631682, "com.instagram.aistudio.editor.AiPreparationScreen (AiPreparationScreen.kt:48)");
            }
            List A1P = 0sr.A1P(new String[]{C288035bG.A00(r0, 2131952686), C288035bG.A00(r0, 2131952688), C288035bG.A00(r0, 2131952687), C288035bG.A00(r0, 2131952685)});
            Object A0m = C51967G9n.A0m(r0, 2108263504);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = new AnonymousClass5b4(C287765aj.A05, 0, (Object) null);
                r0.FLL(A0m);
            }
            AnonymousClass5b4 r8 = (AnonymousClass5b4) A0m;
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            String A0n = DbU.A0n(C51968G9o.A0h(r0), AnonymousClass0t1.A01);
            C60340gF r4 = C60340gF.A00;
            boolean A1X = G9t.A1X(r0, r8, A1P, 2108269246);
            Object ECw = r0.ECw();
            if (A1X || ECw == obj) {
                ECw = new MHD((Object) r8, (Object) A1P, (AnonymousClass4D7) null, 15);
                r0.FLL(ECw);
            }
            C51968G9o.A1E(r0, A0H, ECw, r4);
            C285245Qk r3 = Modifier.A00;
            Modifier Ezh = r3.Ezh(C287205Zk.A00);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r0, 0);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r0, Ezh);
            C62320sa r6 = C287485aD.A00;
            C51973G9u.A0z(r0, A0H, r6);
            0sL r5 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0Z, A04, r5);
            0sL r42 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r42, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            C304676Et r19 = C304676Et.A00;
            A00(r0, 0);
            FillElement fillElement = C287205Zk.A02;
            Modifier A0B = C287195Zj.A0B(r3.Ezh(fillElement), 46.0f, 32.0f, 46.0f, 0.0f);
            C304756Fc A03 = C287275Zs.A03(C287215Zl.A05, 20.0f);
            C287265Zr r18 = C287215Zl.A00;
            AnonymousClass5RD A012 = C291495hO.A01(A03, r0, r18);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r0, A0B);
            C51973G9u.A0z(r0, A0H, r6);
            C287595aO.A00(r0, A012, r5);
            if (C51965G9l.A1Y(r0, A0H, A042, A0w) || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r42, A002);
            }
            C287595aO.A00(r0, A013, A1K);
            String str = jwB2.A02;
            C286575Wy r24 = r0;
            C54792HSz.A00(r24, (ImageUrl) jwB2.A00, str, (String) null, C288035bG.A00(r0, 2131952689), A0n, (C62320sa) null, 0.6f, 1597824, 160, false, false);
            r0.ASN();
            Modifier Ezh2 = r19.A00(r3, true).Ezh(fillElement);
            AnonymousClass5RD A0Z2 = C51966G9m.A0Z(false);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A043 = C286565Wx.A04(A0H);
            Modifier A014 = C287435a8.A01(r0, Ezh2);
            C51973G9u.A0z(r0, A0H, r6);
            C287595aO.A00(r0, A0Z2, r5);
            if (C51965G9l.A1Y(r0, A0H, A043, A0w) || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r42, A003);
            }
            C287595aO.A00(r0, A014, A1K);
            I27.A02(r24, (Alignment) null, C287195Zj.A0B(r3, 32.0f, 0.0f, 32.0f, 0.0f), A1P.get(AnonymousClass7TE.A0M(r8.A04.getValue())), "animated_content", C58932Izv.A00, (0sP) null, C55307Hfa.A00, 1597872, 40);
            r0.ASN();
            C286575Wy r1 = r0;
            AnonymousClass5ZZ.A0X(r1, r19.AB0(r18, C287195Zj.A0B(r3, 32.0f, 0.0f, 32.0f, 12.0f)), C51966G9m.A0c(r0), C288035bG.A00(r0, 2131952684), C51966G9m.A0M(r0));
            if (C51967G9n.A1R(r0)) {
                0fL.A00(2045019129);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, jwB2, i3, 11);
        }
    }

    public static final void A00(C286575Wy r18, int i) {
        C286575Wy r12 = r18;
        r12.ExV(-1467207857);
        int i2 = i;
        if (i != 0 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(252072375, "com.instagram.aistudio.editor.GradientProgressBar (AiPreparationScreen.kt:112)");
            }
            long j = AnonymousClass5aQ.A00(r12).A0Q;
            long j2 = AnonymousClass5aQ.A00(r12).A0J;
            Object A0m = C51967G9n.A0m(r12, -1651225443);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r12, Float.valueOf(0.1f));
            }
            C284945Oz r8 = (C284945Oz) A0m;
            C286565Wx A0H = C51965G9l.A0H(r12, false);
            C270284gU A02 = I69.A02(GRM.A00(C58933Izw.A00), r12, (0sP) null, C51971G9r.A02(r8), 3120, 20);
            C60340gF r11 = C60340gF.A00;
            Object A0m2 = C51967G9n.A0m(r12, -1651208085);
            if (A0m2 == obj) {
                A0m2 = new C59712JUv(r8, (AnonymousClass4D7) null, 42);
                r12.FLL(A0m2);
            }
            C51968G9o.A1E(r12, A0H, A0m2, r11);
            Modifier A0V = C51966G9m.A0V(C287205Zk.A08(Modifier.A00, 3.0f));
            r12.ExS(-1651204403);
            boolean A1U = C51968G9o.A1U(r12, A02, r12.AGt(j), r12.AGt(j2));
            Object ECw = r12.ECw();
            if (A1U || ECw == obj) {
                ECw = new C58745Iws(A02, j, 0, j2);
                r12.FLL(ECw);
            }
            C289585dr.A00(r12, C51975G9x.A0H(A0H, A0V, ECw));
            if (0fL.A02()) {
                0fL.A00(278766173);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i2, 5);
        }
    }
}
