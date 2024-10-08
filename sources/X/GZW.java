package X;

import android.view.accessibility.AccessibilityManager;

public abstract class GZW {
    public static final C267314bM A00 = new C267304bL(GZY.A00);

    public static final void A00(C286575Wy r8, 0sL r9, int i) {
        int i2;
        0qQ.A0B(r9, 0);
        r8.ExV(395577785);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r8, r9) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-399677750, "com.instagram.barcelona.bds.core.BdsAccessibilityState (BdsAccessibilityState.kt:18)");
            }
            Object systemService = C51968G9o.A0I(r8).getSystemService("accessibility");
            0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            Object A0m = C51967G9n.A0m(r8, 507032067);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = new GZX(accessibilityManager);
                r8.FLL(A0m);
            }
            C286565Wx A0H = C51965G9l.A0H(r8, false);
            boolean A1Z = C51967G9n.A1Z(r8, accessibilityManager, 507035475);
            Object ECw = r8.ECw();
            if (A1Z || ECw == obj) {
                ECw = C59103J6l.A00(r8, accessibilityManager, A0m, 36);
            }
            C51968G9o.A1F(r8, A0H, ECw, accessibilityManager, false);
            C286715Xm.A00(r8, A00.A02(A0m), r9, ((i2 << 3) & 112) | 8);
            if (0fL.A02()) {
                0fL.A00(-670713530);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r9, i, 19);
        }
    }
}
