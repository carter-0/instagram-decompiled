package X;

import android.os.Handler;

public final /* synthetic */ class Y3G implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C341687nM A01;
    public final /* synthetic */ C22253XyB A02;

    public /* synthetic */ Y3G(Handler handler, C341687nM r2, C22253XyB xyB) {
        this.A02 = xyB;
        this.A01 = r2;
        this.A00 = handler;
    }

    public final void run() {
        C22253XyB xyB = this.A02;
        C22253XyB.A01(this.A00, this.A01, xyB, true);
    }
}
