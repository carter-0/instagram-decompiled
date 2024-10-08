package X;

import android.view.View;

/* renamed from: X.Wlc  reason: case insensitive filesystem */
public final class C20116Wlc implements Runnable {
    public U5z A00;
    public final /* synthetic */ WDU A01;

    public C20116Wlc(U5z u5z, WDU wdu) {
        this.A01 = wdu;
        this.A00 = u5z;
    }

    public final void run() {
        AnonymousClass2X5 r0;
        WDU wdu = this.A01;
        C18932WDk wDk = wdu.A06;
        if (!(wDk == null || (r0 = wDk.A03) == null)) {
            r0.DRM(wDk);
        }
        View view = (View) wdu.A08;
        if (!(view == null || view.getWindowToken() == null)) {
            U5z u5z = this.A00;
            WDW wdw = u5z.A03;
            if (wdw == null || !wdw.Cc6()) {
                if (u5z.A01 != null) {
                    WDW A002 = u5z.A00();
                    if (A002 instanceof C14735U5x) {
                        ((C14735U5x) A002).A07 = false;
                    } else {
                        ((C14734U5w) A002).A0D = false;
                    }
                    A002.show();
                }
            }
            wdu.A0D = u5z;
        }
        wdu.A0B = null;
    }
}
