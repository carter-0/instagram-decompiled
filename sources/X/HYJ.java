package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

public abstract class HYJ {
    public static final void A00(C286575Wy r16, C362088hK r17, C62320sa r18, int i) {
        int i2;
        C362088hK r5 = r17;
        C62320sa r4 = r18;
        boolean A1U = AnonymousClass7TF.A1U(0, r5, r4);
        C286575Wy r14 = r16;
        r14.ExV(972484889);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r14, r5) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r14, r4);
        }
        if ((i2 & 91) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-663135468, "com.instagram.creation.genai.magicmod.common.ui.MagicModToolNuxOverlay (MagicModToolNuxOverlay.kt:23)");
            }
            Alignment alignment = C287215Zl.A09;
            C285245Qk r7 = Modifier.A00;
            Modifier A0U = C51966G9m.A0U(r7);
            boolean A1O = C51973G9u.A1O(r14, -487779634, i2);
            Object ECw = r14.ECw();
            if (A1O || ECw == AnonymousClass5XT.A00) {
                ECw = C58678Ivn.A00(r14, r4, 25);
            }
            C286565Wx A0H = C51965G9l.A0H(r14, false);
            Modifier A05 = C287635aW.A05(A0U, (C287625aV) null, (String) null, (C62320sa) ECw, A1U);
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r14);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r14, A05);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r14, A0H, r12);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r14, A00, A04, r11);
            0sL r9 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r14, A002)) {
                C51971G9r.A13(r14, r9, A002);
            }
            0sL A1K = C51966G9m.A1K(r14, A01);
            C287355a0 r6 = C287275Zs.A02;
            C287265Zr r2 = C287215Zl.A00;
            Modifier A07 = C287205Zk.A07(r7.Ezh(C287205Zk.A00), 0.5f);
            AnonymousClass5RD A012 = C291495hO.A01(r6, r14, r2);
            int A003 = C287425a7.A00(r14);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r14, A07);
            C51973G9u.A0z(r14, A0H, r12);
            C287595aO.A00(r14, A012, r11);
            if (C51965G9l.A1Y(r14, A0H, A042, A0w) || !C51972G9s.A1Q(r14, A003)) {
                C51971G9r.A13(r14, r9, A003);
            }
            C287595aO.A00(r14, A013, A1K);
            AnonymousClass5ZZ.A0S(r14, C51967G9n.A0C(r7, 6.0f), C51966G9m.A0e(r14), C304346Dc.A00(r14, r5.A04), G9w.A05(r14));
            AnonymousClass5ZZ.A0u(r14, C51966G9m.A0g(r14), C304346Dc.A00(r14, r5.A03), G9w.A05(r14));
            if (C51971G9r.A1R(r14)) {
                0fL.A00(926706444);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, r5, r4, i3, 41);
        }
    }
}
