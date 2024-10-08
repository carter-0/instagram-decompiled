package X;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;

public abstract class HRV {
    @Deprecated(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    public static final void A00(C286575Wy r14, Modifier modifier, AnonymousClass5RD r16, 0sL r17, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        r14.ExV(1949933075);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r14, modifier) | i;
        } else {
            i3 = i6;
        }
        0sL r11 = r17;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r14, r11);
        }
        AnonymousClass5RD r13 = r16;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0Q(r14, r13);
        }
        if ((i3 & 147) != 146 || !r14.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-2050324326, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:248)");
            }
            int A00 = C287425a7.A00(r14);
            Modifier A01 = C287435a8.A01(r14, modifier2);
            C286565Wx r6 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            int i7 = ((i3 << 3) & 896) | 6;
            C51973G9u.A0z(r14, r6, AnonymousClass5R6.A0a);
            C51971G9r.A12(r14, r13, A04);
            C58902IzR izR = C58902IzR.A00;
            if (r6.A0K) {
                r14.ABr(C60340gF.A00, new C59344JFw(izR, 12));
            }
            C51965G9l.A18(r14, A01);
            0sL r1 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r1, A00);
            }
            C51972G9s.A11(r14, r11, i7 >> 6);
            if (0fL.A02()) {
                0fL.A00(486858759);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i6, i4, 2, r11, modifier2, r13);
        }
    }
}
