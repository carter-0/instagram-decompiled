package X;

import android.view.View;

/* renamed from: X.8q6  reason: invalid class name and case insensitive filesystem */
public final class C367048q6 implements Runnable {
    public final /* synthetic */ C367038q5 A00;

    public C367048q6(C367038q5 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C367038q5 r2 = this.A00;
        if (r2.A02) {
            int CEG = r2.CEG();
            if (CEG >= 0 && r2.A00 != CEG) {
                r2.A04.A0A(r2);
                r2.A00 = CEG;
            }
            View view = r2.A03;
            Runnable runnable = r2.A01;
            if (runnable == null) {
                0qQ.A0F("timeRunnable");
                throw AnonymousClass00P.createAndThrow();
            } else {
                view.postOnAnimation(runnable);
            }
        }
    }
}
