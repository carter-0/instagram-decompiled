package X;

import androidx.compose.ui.Modifier;
import com.instagram.compose.core.ui.IgClickableTextKt;

public abstract class HYX {
    public static final void A00(C286575Wy r18, HM3 hm3, C62320sa r20, int i, boolean z) {
        int i2;
        HM3 hm32 = hm3;
        C62320sa r2 = r20;
        AnonymousClass7TG.A1O(hm32, r2);
        C286575Wy r4 = r18;
        r4.ExV(309405553);
        int i3 = i;
        boolean z2 = z;
        if ((i & 14) == 0) {
            i2 = G9t.A0Y(r4, z2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r4, hm32);
        }
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0G(r4, r2);
        }
        if ((i2 & 731) != 146 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(407636749, "com.instagram.creation.genai.themes.ui.AiTermsDisclaimer (AiTermsDisclaimer.kt:23)");
            }
            if (!z && hm32 == HM3.Initial) {
                String A00 = C288035bG.A00(r4, 2131952857);
                String A002 = C288035bG.A00(r4, 2131952856);
                int A08 = 00l.A08(A002, A00, 0, false);
                int A05 = DbX.A05(A00) + A08;
                AnonymousClass5ZB r10 = new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, C51966G9m.A0D(r4), 0, 0);
                C303876Bd A0L = C51972G9s.A0L(A002);
                A0L.A06(r10, A08, A05);
                C286025Tq A0K = C51967G9n.A0K(A0L, "link", "ai_terms_link", A08, A05);
                long A0M = C51966G9m.A0M(r4);
                Modifier A0B = C287195Zj.A0B(C287195Zj.A09(Modifier.A00, 16.0f, 0.0f), 0.0f, 8.0f, 0.0f, 16.0f);
                AnonymousClass5Z4 A0b = C51966G9m.A0b(r4);
                boolean A1Y = C51967G9n.A1Y(r4, A0K, 121990437) | C51972G9s.A1N(i2);
                Object ECw = r4.ECw();
                if (A1Y || ECw == AnonymousClass5XT.A00) {
                    ECw = C59102J6k.A00(r4, r2, A0K, 25);
                }
                C51965G9l.A1X(r4, false);
                IgClickableTextKt.A07(r4, A0B, A0K, A0b, (0sP) ECw, A0M);
            }
            if (0fL.A02()) {
                0fL.A00(531162913);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG4(i3, 10, r2, hm32, z2);
        }
    }
}
