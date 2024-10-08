package X;

import androidx.compose.ui.Modifier;

public abstract class HVT {
    public static final void A00(C286575Wy r11, Modifier modifier, C62320sa r13, int i) {
        int i2;
        AnonymousClass7TF.A1H(modifier, r13);
        C286575Wy r6 = r11;
        r11.ExV(-305191923);
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r11, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r11, r13);
        }
        if ((i2 & 91) != 18 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1480055972, "com.instagram.barcelona.permalink.ui.component.AppReviewPrompt (AppReviewPrompt.kt:20)");
            }
            C287265Zr r4 = C287215Zl.A00;
            Modifier A02 = C288235ba.A02(r11, C287195Zj.A0B(modifier, 0.0f, 32.0f, 0.0f, 20.0f), C51965G9l.A0R(0), r13);
            AnonymousClass5RD A0Z = C51970G9q.A0Z(r11, r4);
            int A00 = C287425a7.A00(r11);
            C286565Wx r42 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r42);
            Modifier A01 = C287435a8.A01(r11, A02);
            C51973G9u.A0y(r11, r42);
            C51971G9r.A12(r11, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (r42.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r1, A00);
            }
            C51965G9l.A18(r11, A01);
            String A002 = C288035bG.A00(r11, 2131953617);
            AnonymousClass5Z4 A0c = C51966G9m.A0c(r11);
            long j = C291445hJ.A0N;
            AnonymousClass5ZZ.A0W(r6, C287195Zj.A0B(Modifier.A00, 0.0f, 0.0f, 0.0f, 4.0f), A0c, A002, j);
            if (C51975G9x.A1V(r6, C288035bG.A00(r6, 2131953616), j)) {
                0fL.A00(979994606);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, r13, modifier, i, 21);
        }
    }
}
