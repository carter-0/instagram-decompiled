package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

public abstract class HYB {
    public static final void A00(C62320sa r6, C286575Wy r7, int i) {
        int i2;
        0qQ.A0B(r6, 0);
        r7.ExV(1314180700);
        if ((i & 14) == 0) {
            i2 = C41848B3p.A01(r7, r6) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-482000979, "com.instagram.creation.genai.magicmod.common.ui.MagicModCancelButton (MagicModCancelButton.kt:21)");
            }
            Alignment alignment = C287215Zl.A09;
            Modifier A0F = C51975G9x.A0F(r7, Modifier.A00);
            boolean A1N = C51973G9u.A1N(r7, -67319478, i2);
            Object ECw = r7.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = C58678Ivn.A00(r7, r6, 14);
            }
            C286565Wx r4 = (C286565Wx) r7;
            Modifier A0F2 = G9w.A0F(C51967G9n.A0G(C51969G9p.A0Y(G9w.A0D(r7, r4, A0F, (C62320sa) ECw), "cancel_button"), 24.0f));
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r7);
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A01 = C287435a8.A01(r7, A0F2);
            C51973G9u.A0y(r7, r4);
            C51971G9r.A12(r7, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r7, A002)) {
                C51971G9r.A13(r7, r1, A002);
            }
            C51965G9l.A18(r7, A01);
            AnonymousClass5ZZ.A0t(r7, C51966G9m.A0h(r7), C304346Dc.A00(r7, 2131954722), G9w.A05(r7));
            if (C51967G9n.A1R(r7)) {
                0fL.A00(563065298);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r6, i, 44);
        }
    }
}
