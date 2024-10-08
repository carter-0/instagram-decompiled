package X;

import android.os.Handler;

public final class MA7 implements Runnable {
    public long A00 = 3600;
    public long A01 = -1;
    public Integer A02;
    public final Handler A03;
    public final MSN A04;
    public final MXS A05;

    public MA7(Handler handler, MSN msn, MXS mxs, Integer num) {
        0qQ.A0B(handler, 1);
        this.A03 = handler;
        this.A04 = msn;
        this.A05 = mxs;
        this.A02 = num;
    }

    public final void run() {
        if (this.A02 == AnonymousClass05K.A0C) {
            MXS mxs = this.A05;
            mxs.EM2();
            this.A02 = AnonymousClass05K.A0N;
            this.A04.DjI(mxs);
        }
    }
}
