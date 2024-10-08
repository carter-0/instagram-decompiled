package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Haa  reason: case insensitive filesystem */
public abstract class C55003Haa {
    public static final void A00(C286575Wy r15, C299665vd r16, C299635va r17, AnonymousClass5vX r18, 0sP r19, 0sP r20, 0sP r21, 0sL r22, int i) {
        int i2;
        C299665vd r9 = r16;
        C299635va r6 = r17;
        AnonymousClass5vX r7 = r18;
        C51973G9u.A1E(r7, r6, r9);
        0sP r8 = r19;
        0sP r11 = r20;
        0sP r10 = r21;
        0sL r4 = r22;
        C51974G9v.A0d(3, r8, r11, r10, r4);
        r15.ExV(-909533543);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r15, r7) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r15, r6);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r15, r9);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r15, r8);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r15, r11);
        }
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r15, r10);
        }
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0K(r15, r4);
        }
        if ((599187 & i2) != 599186 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-127468314, "com.instagram.feed.tifu.ui.Tifu1x1Unit (Tifu1x1Unit.kt:44)");
            }
            if (C51972G9s.A1T(r15, G9t.A0p(r15, Modifier.A00), new C59206JAk(0, r4, C51965G9l.A0r(r15), r6, r7, r8, r9, r10, r11), -347291433)) {
                0fL.A00(1119271731);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59205JAj(i3, 3, r7, r16, r11, r10, r4, r6, r8);
        }
    }
}
