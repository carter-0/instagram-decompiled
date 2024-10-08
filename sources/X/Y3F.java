package X;

import android.os.Handler;

public final /* synthetic */ class Y3F implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C341687nM A01;
    public final /* synthetic */ C22254XyC A02;

    public /* synthetic */ Y3F(Handler handler, C341687nM r2, C22254XyC xyC) {
        this.A02 = xyC;
        this.A01 = r2;
        this.A00 = handler;
    }

    public final void run() {
        C22254XyC xyC = this.A02;
        C22254XyC.A02(this.A00, this.A01, xyC, true);
    }
}
