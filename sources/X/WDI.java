package X;

import android.view.Menu;
import android.view.MenuItem;

public final class WDI implements X8B {
    public X8B A00;
    public final /* synthetic */ 2X4 A01;

    public WDI(2X4 r1, X8B x8b) {
        this.A01 = r1;
        this.A00 = x8b;
    }

    public final boolean CtM(MenuItem menuItem, V4T v4t) {
        return this.A00.CtM(menuItem, v4t);
    }

    public final boolean D6a(Menu menu, V4T v4t) {
        return this.A00.D6a(menu, v4t);
    }

    public final void D8S(V4T v4t) {
        this.A00.D8S(v4t);
        2X4 r3 = this.A01;
        if (r3.A0B != null) {
            r3.A0A.getDecorView().removeCallbacks(r3.A0Q);
        }
        if (r3.A0M != null) {
            04K r0 = r3.A0O;
            if (r0 != null) {
                r0.A00();
            }
            04K A03 = 03v.A03(r3.A0M);
            A03.A02(0.0f);
            r3.A0O = A03;
            A03.A07(new U7S(this, 1));
        }
        r3.A0L = null;
        r3.A09.requestApplyInsets();
        r3.A0V();
    }

    public final boolean DYm(Menu menu, V4T v4t) {
        this.A01.A09.requestApplyInsets();
        return this.A00.DYm(menu, v4t);
    }
}
