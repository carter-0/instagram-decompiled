package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.Mt1  reason: case insensitive filesystem */
public class C67699Mt1 extends C67700Mt2 {
    public final void EpZ(View view, Window window, C70638OEk oEk, C70638OEk oEk2, boolean z, boolean z2) {
        int i;
        int i2;
        AnonymousClass7TF.A1H(oEk, oEk2);
        boolean z3 = false;
        04R.A00(window, false);
        if (oEk.A02 == 0) {
            i = 0;
        } else if (z) {
            i = oEk.A00;
        } else {
            i = oEk.A01;
        }
        window.setStatusBarColor(i);
        int i3 = oEk2.A02;
        if (i3 == 0) {
            i2 = 0;
        } else if (z2) {
            i2 = oEk2.A00;
        } else {
            i2 = oEk2.A01;
        }
        window.setNavigationBarColor(i2);
        window.setStatusBarContrastEnforced(false);
        if (i3 == 0) {
            z3 = true;
        }
        window.setNavigationBarContrastEnforced(z3);
        04l r1 = new C586704n(view, window).A00;
        r1.A05(!z);
        r1.A04(!z2);
    }
}
