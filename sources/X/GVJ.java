package X;

import android.os.SystemClock;

public final class GVJ implements Runnable {
    public long A00 = SystemClock.elapsedRealtime();
    public volatile boolean A01;
    public final /* synthetic */ GVI A02;

    public GVJ(GVI gvi) {
        this.A02 = gvi;
    }

    public final void run() {
        if (!this.A01) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            GVI gvi = this.A02;
            long j = gvi.A00 + (elapsedRealtime - this.A00);
            gvi.A00 = j;
            this.A00 = elapsedRealtime;
            C59556JOc jOc = gvi.A04;
            if (jOc != null) {
                jOc.DrZ(j);
            }
            gvi.A03.postDelayed(this, (long) gvi.A02);
        }
    }
}
