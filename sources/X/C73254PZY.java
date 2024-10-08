package X;

import android.app.Activity;

/* renamed from: X.PZY  reason: case insensitive filesystem */
public final class C73254PZY implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 1yi A01;

    public C73254PZY(Activity activity, 1yi r2) {
        this.A01 = r2;
        this.A00 = activity;
    }

    public final void run() {
        C70653OFa oFa = (C70653OFa) this.A01.A01.get(this.A00);
        if (oFa != null) {
            oFa.A01.A01();
        }
    }
}
