package X;

import androidx.compose.ui.Modifier;

public abstract class HYN {
    public static final void A00(C286575Wy r13, Modifier modifier, 0sL r15, 0sL r16, 0sL r17, float f, int i, int i2) {
        int i3;
        float f2 = f;
        Modifier modifier2 = modifier;
        r13.ExV(71081774);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r13, modifier) | i;
        } else {
            i3 = i6;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A00(r13, f2);
        }
        0sL r7 = r15;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 896) == 0) {
            i3 |= G9t.A0G(r13, r15);
        }
        0sL r8 = r16;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i3 |= G9t.A0H(r13, r8);
        }
        0sL r9 = r17;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= G9t.A0I(r13, r9);
        }
        if ((46811 & i3) != 9362 || !r13.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                f2 = 0.38f;
            }
            if (0fL.A02()) {
                0fL.A01(721374698, "com.instagram.creation.genai.magicmod.common.ui.SpacedThreeItemRow (SpacedThreeItemRow.kt:29)");
            }
            boolean A1O = C51973G9u.A1O(r13, 680560991, i3);
            Object ECw = r13.ECw();
            if (A1O || ECw == AnonymousClass5XT.A00) {
                ECw = new IGJ(f2);
                r13.FLL(ECw);
            }
            C286565Wx A0G = C51965G9l.A0G(r13);
            int A00 = C287425a7.A00(r13);
            AnonymousClass5RM A04 = C286565Wx.A04(A0G);
            Modifier A01 = C287435a8.A01(r13, modifier2);
            C51973G9u.A0y(r13, A0G);
            C51971G9r.A12(r13, ECw, A04);
            0sL r2 = C287485aD.A02;
            if (A0G.A0K || !C51972G9s.A1Q(r13, A00)) {
                C51971G9r.A13(r13, r2, A00);
            }
            C51965G9l.A18(r13, A01);
            C51967G9n.A1P(r13, r15, (i3 >> 6) & 14);
            C51967G9n.A1P(r13, r8, (i3 >> 9) & 14);
            C51972G9s.A11(r13, r9, i3 >> 12);
            if (0fL.A02()) {
                0fL.A00(-1732575673);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59162J8s(modifier2, r7, r8, r9, f2, i6, i4);
        }
    }
}
