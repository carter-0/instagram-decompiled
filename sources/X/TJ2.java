package X;

import android.app.Service;

public final /* synthetic */ class TJ2 implements Runnable {
    public final int A00;
    public final C8485QvX A01;
    public final SH4 A02;

    public TJ2(C8485QvX qvX, SH4 sh4, int i) {
        this.A02 = sh4;
        this.A00 = i;
        this.A01 = qvX;
    }

    public final void run() {
        SH4 sh4 = this.A02;
        int i = this.A00;
        C8485QvX qvX = this.A01;
        if (((Service) ((C13642Te9) sh4.A00)).stopSelfResult(i)) {
            ST5.A0B(qvX, "Local AnalyticsService processed last dispatch request", 2);
        }
    }
}
