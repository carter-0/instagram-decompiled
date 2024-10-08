package X;

import android.view.ViewTreeObserver;

public final class WCG implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C19204WPk A01;

    public WCG(C19204WPk wPk, long j) {
        this.A01 = wPk;
        this.A00 = j;
    }

    public final boolean onPreDraw() {
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        C19204WPk wPk = this.A01;
        if (currentTimeMillis2 - wPk.A00 >= 33) {
            wPk.A00 = currentTimeMillis;
            U1A u1a = wPk.A02;
            if (u1a != null) {
                u1a.A09 = true;
                U1A.A05(u1a);
                if (System.currentTimeMillis() - this.A00 > 1000) {
                    C13988Tno.A12(wPk.A0E, this);
                    wPk.A01 = null;
                }
            }
            wPk.A00 = currentTimeMillis;
        }
        return true;
    }
}
