package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.5do  reason: invalid class name and case insensitive filesystem */
public abstract class C289565do {
    public static final void A00(C286575Wy r3, Modifier modifier, 0sP r5, int i) {
        int i2;
        r3.ExV(-932836462);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (r3.AGu(modifier)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = 16;
            if (r3.AGw(r5)) {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i2 & 19) != 18 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1644682655, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            C289585dr.A00(r3, C289575dp.A00(modifier, r5));
            if (0fL.A02()) {
                0fL.A00(1753276627);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGL(i, 1, (Object) r5, (Object) modifier);
        }
    }
}
