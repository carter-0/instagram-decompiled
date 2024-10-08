package X;

import com.instagram.common.session.UserSession;

public abstract class GZU {
    public static final void A00(C286575Wy r12, UserSession userSession, String str, 0sL r15, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        String str2 = str;
        0qQ.A0B(str, 0);
        r12.ExV(107645343);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r12, str) | i;
        } else {
            i3 = i5;
        }
        UserSession userSession2 = userSession;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r12, userSession);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0a(r12, z2);
        }
        0sL r8 = r15;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r12, r15);
        }
        if ((i3 & 1171) != 1170 || !r12.Bwn()) {
            if (i6 != 0) {
                z2 = false;
            }
            if (0fL.A02()) {
                0fL.A01(-1982059946, "com.instagram.barcelona.bds.core.BdsRoot (BdsRoot.kt:30)");
            }
            boolean A1N = C51973G9u.A1N(r12, -1972464701, i3);
            Object ECw = r12.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = new GZO(str);
                r12.FLL(ECw);
            }
            C51965G9l.A1X(r12, false);
            if (C51973G9u.A1U(r12, new J73(3, r15, z2), new C286705Xl[]{C286915Yh.A00.A02(ECw), C286935Yj.A00.A02(ECw), C286955Yl.A00.A02(userSession), C286895Yf.A00.A02(userSession)}, -1373397793)) {
                0fL.A00(-1216885954);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J83(userSession2, str2, r8, i5, i4, z2);
        }
    }
}
