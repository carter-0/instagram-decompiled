package X;

import android.content.Context;

public abstract class HXB {
    public static final void A00(C286575Wy r8, 0sP r9, int i) {
        int i2;
        0qQ.A0B(r9, 0);
        r8.ExV(1122247811);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r8, r9) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(465343853, "com.instagram.common.screenshot.compose.DetectScreenshots (DetectScreenshots.kt:17)");
            }
            Context A0I = C51968G9o.A0I(r8);
            AnonymousClass3KG A00 = AnonymousClass3KF.A00(DbT.A05(A0I), C51969G9p.A0j(r8));
            Object AJO = r8.AJO(AnonymousClass5YV.A00);
            C284945Oz A002 = C287175Zh.A00(r8, r9);
            C60340gF r1 = C60340gF.A00;
            boolean A1Z = C51965G9l.A1Z(r8, A002, C51973G9u.A1S(r8, AJO, A00, -1883846602));
            Object ECw = r8.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new MH4(AJO, A00, A002, (AnonymousClass4D7) null, 31);
                r8.FLL(ECw);
            }
            C51972G9s.A0z(r8, ECw, r1);
            if (0fL.A02()) {
                0fL.A00(-1597709941);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r9, i, 28);
        }
    }
}
