package X;

import androidx.compose.ui.Modifier;

public abstract class HY1 {
    public static final void A00(C286575Wy r6, Modifier modifier, HLA hla, int i, int i2) {
        int i3;
        C304796Fg r4;
        AnonymousClass5RW[] r5;
        long A0J;
        0qQ.A0B(hla, 0);
        r6.ExV(-824582938);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r6, hla) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r6, modifier);
        }
        if ((i3 & 19) != 18 || !r6.Bwn()) {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-2058807228, "com.instagram.creation.genai.common.ui.CreationGenAILegibilityGradient (CreationGenAIScreenLegibilityGradient.kt:28)");
            }
            int ordinal = hla.ordinal();
            if (ordinal == 0) {
                r6.ExS(-1217199678);
                r4 = C304786Ff.A00;
                r5 = new AnonymousClass5RW[2];
                r5[0] = C51965G9l.A0N(AnonymousClass5aQ.A00(r6).A0X);
                A0J = C51966G9m.A0J(r6);
            } else if (ordinal == 1) {
                r6.ExS(-1217193758);
                r4 = C304786Ff.A00;
                r5 = new AnonymousClass5RW[2];
                r5[0] = C51965G9l.A0N(C51966G9m.A0J(r6));
                A0J = AnonymousClass5aQ.A00(r6).A0X;
            } else {
                throw C51973G9u.A0n(r6, -1217202523);
            }
            r5[1] = C51965G9l.A0N(A0J);
            C52924Gey A03 = r4.A03(0sr.A1P(r5));
            C51965G9l.A1X(r6, false);
            if (C51967G9n.A1X(r6, C304766Fd.A00(C51969G9p.A0U().Ezh(modifier), A03, AnonymousClass5S0.A00))) {
                0fL.A00(-1261660529);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(hla, modifier, i2, i, 27);
        }
    }
}
