package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Hbg  reason: case insensitive filesystem */
public abstract class C55071Hbg {
    public static final void A00(C286575Wy r14, Modifier modifier, C62320sa r16, int i) {
        int i2;
        Modifier modifier2 = modifier;
        C62320sa r3 = r16;
        AnonymousClass7TF.A1H(r3, modifier);
        C286575Wy r7 = r14;
        r14.ExV(-1419332918);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, r3) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r14, modifier);
        }
        if ((i2 & 19) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(256535391, "com.instagram.opal.impl.ui.OpalDelightAnimationContent (OpalDelightAnimationContent.kt:21)");
            }
            C284945Oz r5 = (C284945Oz) C305136Gr.A00(r7, (C286015Tp) null, C58475IsW.A00, new Object[0], 3072, 6);
            if (C51971G9r.A1W(r5)) {
                J49 j49 = J49.A00;
                boolean A1R = C51968G9o.A1R(i2) | C51967G9n.A1Y(r7, r5, -1945777938);
                Object ECw = r7.ECw();
                if (A1R || ECw == AnonymousClass5XT.A00) {
                    ECw = new MPB(42, (Object) r3, (Object) r5);
                    r7.FLL(ECw);
                }
                C51965G9l.A1X(r7, false);
                I63.A02(r7, modifier2, j49, (0sP) ECw, (i2 & 112) | 6, 0);
            }
            if (0fL.A02()) {
                0fL.A00(-54208761);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, modifier2, r3, i3, 33);
        }
    }
}
