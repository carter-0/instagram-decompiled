package X;

import android.content.Context;

public abstract class HXV {
    public static final void A00(C286575Wy r6, String str, int i, int i2) {
        int i3;
        r6.ExV(1999360640);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r6, str) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !r6.Bwn()) {
            if (i4 != 0) {
                str = null;
            }
            if (0fL.A02()) {
                0fL.A01(266643886, "com.instagram.compose.ui.dialog.IgProgressDialog (IgProgressDialog.kt:13)");
            }
            Context A0I = C51968G9o.A0I(r6);
            Object A0m = C51967G9n.A0m(r6, -1035278102);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = DbV.A0h(A0I);
                r6.FLL(A0m);
            }
            C286565Wx A0G = C51965G9l.A0G(r6);
            boolean A1U = C51966G9m.A1U(r6, A0m, C51973G9u.A1N(r6, -1035276356, i3));
            Object ECw = r6.ECw();
            if (A1U || ECw == obj) {
                ECw = C51970G9q.A0y(r6, A0m, str, 22);
            }
            C286565Wx.A0I(A0G);
            C286645Xf.A05(r6, (C62320sa) ECw);
            C60340gF r2 = C60340gF.A00;
            boolean A1Z = C51967G9n.A1Z(r6, A0m, -1035272690);
            Object ECw2 = r6.ECw();
            if (A1Z || ECw2 == obj) {
                ECw2 = J6I.A00(r6, A0m, 45);
            }
            C286565Wx.A0I(A0G);
            C286645Xf.A03(r6, r2, (0sP) ECw2);
            if (0fL.A02()) {
                0fL.A00(2126573339);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7O(i2, str, i, 0);
        }
    }
}
