package X;

import androidx.compose.ui.Modifier;

public abstract class HUP {
    public static final void A00(C286575Wy r13, Modifier modifier, HL3 hl3, C62320sa r16, int i, int i2) {
        int i3;
        int i4;
        Modifier modifier2 = modifier;
        C62320sa r9 = r16;
        boolean A1U = AnonymousClass7TF.A1U(0, r9, hl3);
        C286575Wy r5 = r13;
        r13.ExV(1252042179);
        int i5 = i2;
        int i6 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r5, r9) | i;
        } else {
            i3 = i6;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r5, hl3);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0Q(r5, modifier);
        }
        if ((i3 & 147) != 146 || !r5.Bwn()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1690058886, "com.instagram.barcelona.accessibility.alttext.AltTextButton (AltTextButton.kt:16)");
            }
            String A00 = C288035bG.A00(r5, 2131953613);
            int ordinal = hl3.ordinal();
            if (ordinal == 0) {
                r5.ExS(-1465215043);
                i4 = 2131953614;
            } else if (ordinal == A1U) {
                r5.ExS(-1465212195);
                i4 = 2131953615;
            } else {
                throw C51973G9u.A0n(r5, -1465216523);
            }
            String A002 = C288035bG.A00(r5, i4);
            C51965G9l.A1X(r5, false);
            HUV.A00(r5, modifier2, A00, A002, r9, (i3 & 14) | ((i3 << 3) & 7168), 0);
            if (0fL.A02()) {
                0fL.A00(-2061261710);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i6, i5, 9, hl3, r16, modifier2);
        }
    }
}
