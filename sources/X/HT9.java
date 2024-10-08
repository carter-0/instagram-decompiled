package X;

import androidx.compose.ui.Modifier;

public abstract class HT9 {
    public static final void A00(C286575Wy r16, LRW lrw, String str, C62320sa r19, int i) {
        int i2;
        LRW lrw2 = lrw;
        String str2 = str;
        C62320sa r3 = r19;
        C51973G9u.A1E(str2, lrw2, r3);
        C286575Wy r10 = r16;
        r10.ExV(336922696);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r10, str2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r10, lrw2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r10, r3);
        }
        if ((i2 & 147) != 146 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(73438518, "com.instagram.aistudio.home.view.section.AiHomeSearchBarSection (AiHomeSearchBarSection.kt:27)");
            }
            boolean A06 = 182.A06(0Tu.A05, C51969G9p.A0j(r10), 36325145470775967L);
            C56203HuW.A01(r10, lrw2, "home", C51965G9l.A03(i2));
            Modifier A0V = C51966G9m.A0V(G9t.A0p(r10, Modifier.A00));
            float f = 12.0f;
            if (A06) {
                f = 0.0f;
            }
            Modifier A0B = C287195Zj.A0B(A0V, 0.0f, 12.0f, 0.0f, f);
            boolean A1P = C51973G9u.A1P(r10, 108145475, i2);
            Object ECw = r10.ECw();
            if (A1P || ECw == AnonymousClass5XT.A00) {
                ECw = new MM7(r3, 42);
                r10.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r10, false);
            Modifier A062 = C287635aW.A06(A0B, (C62320sa) ECw);
            r10.ExS(108147094);
            boolean A1Q = C51968G9o.A1Q(i2);
            Object ECw2 = r10.ECw();
            if (A1Q || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new MYK(str2, 11);
                r10.FLL(ECw2);
            }
            I63.A02(r10, A062, C51965G9l.A0z(A0H, ECw2), C58935Izy.A00, 384, 0);
            if (0fL.A02()) {
                0fL.A00(676320013);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            LRW lrw3 = lrw2;
            C62320sa r7 = r3;
            ASQ.A06 = new C59141J7x(r7, lrw3, str2, i3, 0);
        }
    }
}
