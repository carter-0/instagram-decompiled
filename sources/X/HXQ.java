package X;

import androidx.compose.ui.Modifier;

public abstract class HXQ {
    public static final void A00(C287605aT r23, C286575Wy r24, Modifier modifier, C62320sa r26, int i, int i2, boolean z, boolean z2) {
        int i3;
        float f;
        long j;
        C287605aT r15 = r23;
        boolean z3 = z2;
        Modifier modifier2 = modifier;
        C62320sa r12 = r26;
        0qQ.A0B(r12, 1);
        C286575Wy r6 = r24;
        r6.ExV(2107340373);
        int i4 = i2;
        int i5 = i;
        boolean z4 = z;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0Y(r6, z4) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r6, r12);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r6, modifier2);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0b(r6, z3);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i3 |= G9t.A0S(r6, r15);
        }
        if ((i3 & 9363) != 9362 || !r6.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            z3 = C51966G9m.A1R(i7, z3);
            if (i8 != 0) {
                r15 = (C287605aT) C51974G9v.A0V(r6, 207731274);
                C51965G9l.A1V(r6);
            }
            if (0fL.A02()) {
                0fL.A01(-1714770499, "com.instagram.compose.igds.components.radiobutton.IgdsRadioButton (IgdsRadioButton.kt:47)");
            }
            Object A0m = C51967G9n.A0m(r6, 207733703);
            if (A0m == AnonymousClass5XT.A00) {
                boolean A0D = C61670oa.A0D();
                if (A0D) {
                    2Yo.A01(true);
                }
                A0m = C51967G9n.A0e(r6, A0D);
            }
            boolean A1a = AnonymousClass7TE.A1a(A0m);
            C286565Wx r10 = (C286565Wx) r6;
            C286565Wx.A0L(r10, false);
            if (z) {
                f = 10.0f / 2.0f;
            } else {
                f = 0.0f;
            }
            JNL jnl = C55423HhT.A00;
            C270284gU A01 = I69.A01(GQC.A01(jnl, 50, 0), r6, f, 8);
            if (C51967G9n.A1U(r6, -1487744764)) {
                0fL.A01(200909146, "com.instagram.compose.igds.components.radiobutton.rememberStateColors (IgdsRadioButton.kt:157)");
            }
            if (z) {
                if (z3) {
                    j = C51967G9n.A0a(r6, -390487225).A06;
                } else {
                    j = C51967G9n.A0a(r6, -390483057).A05;
                }
            } else if (z3) {
                j = C51967G9n.A0a(r6, -390485175).A07;
            } else {
                j = C51967G9n.A0a(r6, -390481273).A04;
            }
            C286565Wx.A0L(r10, false);
            C284945Oz A00 = C287175Zh.A00(r6, C51965G9l.A0N(j));
            if (0fL.A02()) {
                0fL.A00(737157646);
            }
            C286565Wx.A0L(r10, false);
            long A0A = C51966G9m.A0A(r6);
            float f2 = 1.5f;
            if (z) {
                f2 = 2.0f;
            }
            C51971G9r.A11(r6, C51969G9p.A0T(C304856Fm.A00, ((AnonymousClass5RW) A00.getValue()).A00), new JB5(r15, A00, I69.A01(GQC.A01(jnl, 50, 0), r6, f2, 8), A01, modifier2, r12, A0A, z3, z4, A1a), -118171243);
            if (0fL.A02()) {
                0fL.A00(-1374188619);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59192J9w(r12, modifier2, r15, i5, i4, 1, z4, z3);
        }
    }
}
