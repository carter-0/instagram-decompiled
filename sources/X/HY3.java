package X;

import android.content.Context;
import androidx.compose.ui.Modifier;

public abstract class HY3 {
    public static final void A00(boolean z, C286575Wy r13, int i, int i2) {
        int i3;
        C286575Wy r6 = r13;
        r13.ExV(1179702144);
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r13, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0Z(r13, z);
        }
        if ((i3 & 19) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1343629870, "com.instagram.creation.genai.common.ui.KeyFrameView (KeyFrameView.kt:12)");
            }
            Context A0I = C51968G9o.A0I(r13);
            Object A0m = C51967G9n.A0m(r13, 1877157489);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = C303756Aq.A00(A0I, i);
                r13.FLL(A0m);
            }
            C286565Wx r2 = (C286565Wx) r6;
            C286565Wx.A0L(r2, false);
            boolean A1Z = C51967G9n.A1Z(r13, A0m, 1877161116) | C51972G9s.A1L(i3);
            Object ECw = r13.ECw();
            if (A1Z || ECw == obj) {
                ECw = new C58736Iwj(10, A0m, z);
                r13.FLL(ECw);
            }
            I63.A02(r6, (Modifier) null, C51965G9l.A0z(r2, ECw), (0sP) null, 0, 6);
            if (0fL.A02()) {
                0fL.A00(-1918052139);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59115J6x(i, z, i2);
        }
    }
}
