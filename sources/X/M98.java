package X;

import android.view.View;

public final class M98 implements Runnable {
    public final /* synthetic */ C64183LSq A00;
    public final /* synthetic */ C53362Gmm A01;
    public final /* synthetic */ boolean A02;

    public M98(C64183LSq lSq, C53362Gmm gmm, boolean z) {
        this.A02 = z;
        this.A00 = lSq;
        this.A01 = gmm;
    }

    public final void run() {
        boolean z = this.A02;
        C64183LSq lSq = this.A00;
        if (z) {
            View A04 = lSq.A04();
            if (A04 != null) {
                A04.post(new C66006M7r(lSq, this.A01));
                return;
            }
            return;
        }
        C64183LSq.A03(lSq, this.A01);
    }
}
