package X;

import androidx.compose.ui.Modifier;

public abstract class HRD {
    public static final void A00(C286575Wy r8, Modifier modifier, 0sL r10, int i, int i2) {
        int i3;
        r8.ExV(-2105228848);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r8, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r8, r10);
        }
        if ((i3 & 19) != 18 || !r8.Bwn()) {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1056767214, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            IGO igo = IGO.A00;
            int A00 = C287425a7.A00(r8);
            C286565Wx r5 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r8, modifier);
            int i5 = ((((((i3 >> 3) & 14) | 384) | ((i3 << 3) & 112)) << 6) & 896) | 6;
            C51973G9u.A0z(r8, r5, C287485aD.A00);
            C51971G9r.A12(r8, igo, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r8, A00)) {
                C51971G9r.A13(r8, r1, A00);
            }
            C51965G9l.A18(r8, A01);
            C51972G9s.A11(r8, r10, i5 >> 6);
            if (0fL.A02()) {
                0fL.A00(-477945995);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(r10, modifier, i2, i, 4);
        }
    }
}
