package X;

import androidx.compose.ui.Modifier;

public abstract class HXR {
    public static final void A00(C286575Wy r15, Modifier modifier, HLX hlx, String str, C62320sa r19, int i, int i2, boolean z) {
        int i3;
        long A0L;
        boolean z2 = z;
        HLX hlx2 = hlx;
        Modifier modifier2 = modifier;
        String str2 = str;
        C62320sa r12 = r19;
        boolean A1U = AnonymousClass7TF.A1U(0, r12, str2);
        C286575Wy r3 = r15;
        r15.ExV(-1353057148);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r3, r12) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r3, str2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r3, modifier2);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0R(r3, hlx2);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i3 |= G9t.A0c(r3, z2);
        }
        if ((i3 & 9363) != 9362 || !r3.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                hlx2 = HLX.A02;
            }
            z2 = C51966G9m.A1R(i8, z2);
            if (0fL.A02()) {
                0fL.A01(742981306, "com.instagram.compose.igds.components.textcell.IgdsActionCell (IgdsActionCell.kt:37)");
            }
            float f = 0.3f;
            if (z2) {
                f = 1.0f;
            }
            int ordinal = hlx2.ordinal();
            if (ordinal == 0) {
                A0L = C51970G9q.A0L(r3, -760918605);
            } else if (ordinal == A1U) {
                A0L = C51967G9n.A0a(r3, -760916427).A0l;
            } else if (ordinal == 2) {
                A0L = C51967G9n.A0a(r3, -760914150).A0E;
            } else {
                throw C51973G9u.A0n(r3, -760920528);
            }
            C51965G9l.A1X(r3, false);
            C286575Wy r16 = r3;
            String str3 = str2;
            AnonymousClass5ZZ.A0M(r16, C287195Zj.A09(C287635aW.A05(modifier2, C51965G9l.A0R(0), (String) null, r12, z2), C287645aX.A00(r3), 14.0f), C51966G9m.A0g(r3), str3, (i3 >> 3) & 14, C285595Rx.A02(AnonymousClass5RX.A0K[(int) (A0L & 63)], AnonymousClass5RW.A03(A0L), AnonymousClass5RW.A02(A0L), AnonymousClass5RW.A01(A0L), f));
            if (0fL.A02()) {
                0fL.A00(-1953148548);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA7(hlx2, modifier2, r12, str2, i5, i4, 2, z2);
        }
    }
}
