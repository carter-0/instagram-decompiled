package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.Mt3  reason: case insensitive filesystem */
public abstract class C67701Mt3 extends C71482OlX {
    public void EpZ(View view, Window window, C70638OEk oEk, C70638OEk oEk2, boolean z, boolean z2) {
        int i;
        int i2;
        AnonymousClass7TF.A1H(oEk, oEk2);
        04R.A00(window, false);
        if (z) {
            i = oEk.A00;
        } else {
            i = oEk.A01;
        }
        window.setStatusBarColor(i);
        if (z2) {
            i2 = oEk2.A00;
        } else {
            i2 = oEk2.A01;
        }
        window.setNavigationBarColor(i2);
        04l r1 = new C586704n(view, window).A00;
        r1.A05(!z);
        r1.A04(!z2);
    }
}
