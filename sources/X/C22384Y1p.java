package X;

import android.os.Handler;

/* renamed from: X.Y1p  reason: case insensitive filesystem */
public final class C22384Y1p implements Runnable {
    public final /* synthetic */ C265144Ss A00;

    public C22384Y1p(C265144Ss r1) {
        this.A00 = r1;
    }

    public final void run() {
        C265144Ss r2 = this.A00;
        C265144Ss r0 = C265144Ss.$redex_init_class;
        Handler handler = r2.A08;
        if (handler != null) {
            handler.removeCallbacks(r2.A0Q);
        }
    }
}
