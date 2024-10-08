package X;

import android.view.View;

/* renamed from: X.Y1u  reason: case insensitive filesystem */
public final class C22389Y1u implements Runnable {
    public final /* synthetic */ Y0B A00;

    public C22389Y1u(Y0B y0b) {
        this.A00 = y0b;
    }

    public final void run() {
        Y0B y0b = this.A00;
        if (y0b.A02) {
            int B85 = y0b.B85();
            if (B85 >= 0 && y0b.A00 != B85) {
                y0b.A04.A00.A0B(y0b);
                y0b.A00 = B85;
            }
            View view = y0b.A03;
            Runnable runnable = y0b.A01;
            if (runnable == null) {
                0qQ.A0F("timeRunnable");
                throw AnonymousClass00P.createAndThrow();
            } else {
                view.postOnAnimation(runnable);
            }
        }
    }
}
