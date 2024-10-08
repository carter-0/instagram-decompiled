package X;

import androidx.compose.ui.Modifier;

public abstract class HR6 {
    public static final void A00(C52693Gb5 gb5, C286575Wy r13, 0sL r14, int i) {
        int i2;
        C286575Wy r4 = r13;
        r13.ExV(-1985516685);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, gb5) | i;
        } else {
            i2 = i;
        }
        0sL r8 = r14;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, r14);
        }
        if ((i2 & 19) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(552240289, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:35)");
            }
            Object ECw = r13.ECw();
            Object obj = AnonymousClass5XT.A00;
            if (ECw == obj) {
                ECw = new I1S(C52887GeN.A00);
                r13.FLL(ECw);
            }
            I1S i1s = (I1S) ECw;
            Object ECw2 = r13.ECw();
            if (ECw2 == obj) {
                ECw2 = new C58682Ivr(i1s, 23);
                r13.FLL(ECw2);
            }
            C56162Htq.A01(i1s, r4, (Modifier) null, (C62320sa) ECw2, new J6U(43, i1s, gb5), r8, ((i2 << 12) & 458752) | 54, 8, C51971G9r.A1W(gb5.A0J));
            if (0fL.A02()) {
                0fL.A00(1521350983);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, gb5, r14, i, 4);
        }
    }
}
