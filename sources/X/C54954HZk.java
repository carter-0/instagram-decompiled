package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HZk  reason: case insensitive filesystem */
public abstract class C54954HZk {
    public static final void A00(C286575Wy r11, Modifier modifier, AnonymousClass7AE r13, int i) {
        int i2;
        AnonymousClass7TF.A1H(modifier, r13);
        C286575Wy r4 = r11;
        r11.ExV(-146602879);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r11, r13);
        }
        if ((i2 & 19) != 18 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-519881358, "com.instagram.direct.messagethread.compose.BulkSelector (BulkSelector.kt:14)");
            }
            if (r13.A00 == 0) {
                Object AJO = r11.AJO(C55419HhP.A00);
                boolean A1L = C51972G9s.A1L(i2) | C51967G9n.A1Z(r11, AJO, -924961917);
                Object ECw = r11.ECw();
                if (A1L || ECw == AnonymousClass5XT.A00) {
                    ECw = new C74185PqR(26, AJO, (Object) r13);
                    r11.FLL(ECw);
                }
                C51965G9l.A1X(r11, false);
                boolean z = r13.A02;
                HXJ.A00(r4, C51967G9n.A0G(modifier, 10.0f), (HLW) null, (0sP) ECw, 0, 24, z, false);
            }
            if (0fL.A02()) {
                0fL.A00(819927161);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, r13, modifier, i, 10);
        }
    }
}
