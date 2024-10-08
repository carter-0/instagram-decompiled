package X;

import androidx.compose.ui.Modifier;

public abstract class He3 {
    public static final void A00(C286575Wy r11, Modifier modifier, float f, int i, int i2, long j, boolean z) {
        int i3;
        float f2;
        Modifier A0D;
        boolean z2 = z;
        Modifier modifier2 = modifier;
        0qQ.A0B(modifier, 0);
        r11.ExV(-1968128800);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r11, modifier) | i;
        } else {
            i3 = i;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0C(r11, j2);
        }
        float f3 = f;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= G9t.A01(r11, f);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= G9t.A0b(r11, z2);
        }
        if ((i3 & 1171) != 1170 || !r11.Bwn()) {
            z2 = C51966G9m.A1R(i6, z2);
            if (0fL.A02()) {
                0fL.A01(1988926806, "com.meta.compose.component.divider.BasicDivider (BasicDivider.kt:32)");
            }
            r11.ExS(261349344);
            if (C289095d0.A01(f, 0.0f)) {
                f2 = 1.0f / C51968G9o.A0Y(r11).AwL();
            } else {
                f2 = f;
            }
            C51965G9l.A1X(r11, false);
            C285245Qk r1 = Modifier.A00;
            if (z2) {
                A0D = C287205Zk.A08(C51966G9m.A0T(r1), f2);
            } else {
                A0D = C287205Zk.A0D(r1.Ezh(C287205Zk.A00), f2);
            }
            C51969G9p.A14(r11, modifier.Ezh(A0D), j2);
            if (0fL.A02()) {
                0fL.A00(1492407075);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8M(modifier2, f3, i5, i4, j2, z2);
        }
    }
}
