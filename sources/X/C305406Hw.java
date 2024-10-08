package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6Hw  reason: invalid class name and case insensitive filesystem */
public abstract class C305406Hw {
    public static final void A00(AnonymousClass6H8 r11, C286575Wy r12, Modifier modifier, C62320sa r14, 0sL r15, int i, int i2) {
        int i3;
        AnonymousClass6H8 r6 = r11;
        Modifier modifier2 = modifier;
        C286575Wy r3 = r12;
        r12.ExV(2002163445);
        int i4 = i2;
        C62320sa r9 = r14;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i6 = 2;
            if (r12.AGw(r14)) {
                i6 = 4;
            }
            i3 = i6 | i;
        } else {
            i3 = i5;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i8 = 16;
            if (r12.AGu(modifier)) {
                i8 = 32;
            }
            i3 |= i8;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            int i10 = 128;
            if (r12.AGu(r6)) {
                i10 = 256;
            }
            i3 |= i10;
        }
        0sL r8 = r15;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            int i11 = 1024;
            if (r12.AGw(r15)) {
                i11 = C249703kE.FLAG_MOVED;
            }
            i3 |= i11;
        }
        if ((i3 & 1171) != 1170 || !r12.Bwn()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i9 != 0) {
                r6 = null;
            }
            if (0fL.A02()) {
                0fL.A01(1055722787, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:78)");
            }
            C305416Hx.A00(r3, AnonymousClass5PI.A01(r3, new AnonymousClass9MS(0, r6, modifier2, r8, C287175Zh.A00(r12, r14)), -1488997347), 6);
            if (0fL.A02()) {
                0fL.A00(1301871141);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG8(r6, modifier2, r8, r9, i5, i4, 3);
        }
    }
}
