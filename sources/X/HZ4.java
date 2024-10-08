package X;

import androidx.compose.ui.Modifier;

public abstract class HZ4 {
    public static final void A00(C286575Wy r15, Modifier modifier, Float f, int i, int i2) {
        int i3;
        boolean z;
        Float f2 = f;
        Modifier modifier2 = modifier;
        C286575Wy r8 = r15;
        r15.ExV(-235751703);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r15, modifier2) | i;
        } else {
            i3 = i6;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0P(r15, f2);
        }
        if ((i3 & 91) != 18 || !r15.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                f2 = null;
            }
            if (0fL.A02()) {
                0fL.A01(102768155, "com.instagram.creator.achievements.modules.views.RefreshSpinner (RefreshSpinner.kt:14)");
            }
            if (f2 != null) {
                r15.ExS(369696021);
                z = false;
                C52390GQp.A01(r8, modifier2, f2.floatValue(), 2.0f, 0.0f, 196608 | ((i3 >> 3) & 14) | ((i3 << 3) & 112), 88, C51966G9m.A0K(r15), 0, false);
            } else {
                r15.ExS(369837226);
                z = false;
                C52390GQp.A02(r8, modifier2, 2.0f, (i3 & 14) | 384, 0, C51966G9m.A0K(r15));
            }
            if (C51970G9q.A1a(r8, z)) {
                0fL.A00(-1653701107);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(modifier2, f2, i4, i6, 31);
        }
    }
}
