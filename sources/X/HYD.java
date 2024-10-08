package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

public abstract class HYD {
    public static final void A00(C286575Wy r16, int i, int i2) {
        int i3;
        C286575Wy r7 = r16;
        r7.ExV(2049351823);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 14) == 0) {
            i3 = G9t.A05(r7, i5) | i2;
        } else {
            i3 = i4;
        }
        if ((i3 & 11) != 2 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(817310420, "com.instagram.creation.genai.magicmod.common.ui.MagicModInstructionFooter (MagicModInstructionFooter.kt:18)");
            }
            Alignment alignment = C287215Zl.A09;
            Modifier A09 = C287195Zj.A09(C51969G9p.A0U(), 12.0f, 4.0f);
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r7);
            C286565Wx r5 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r7, A09);
            C51973G9u.A0y(r7, r5);
            C51971G9r.A12(r7, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r7, A002)) {
                C51971G9r.A13(r7, r1, A002);
            }
            C51965G9l.A18(r7, A01);
            AnonymousClass5ZZ.A0B(r7, (Modifier) null, C51966G9m.A0h(r7), C304346Dc.A00(r7, i5), 3, 2, 2, 0, 390, 11130, G9w.A05(r7));
            if (C51967G9n.A1R(r7)) {
                0fL.A00(1948639625);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            C59347JFz.A00(ASQ, i5, i4, 4);
        }
    }
}
