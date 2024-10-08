package X;

import android.os.SystemClock;

/* renamed from: X.TIg  reason: case insensitive filesystem */
public final class C13024TIg implements Runnable {
    public final long A00;
    public volatile boolean A01;
    public final /* synthetic */ C12216SpG A02;

    public C13024TIg(C12216SpG spG, long j) {
        this.A02 = spG;
        this.A00 = j;
    }

    public final void run() {
        boolean z;
        if (!this.A01) {
            long uptimeMillis = SystemClock.uptimeMillis() - (this.A00 / 1000000);
            long A07 = C51966G9m.A07(uptimeMillis);
            if (16.666666f - ((float) uptimeMillis) >= 1.0f) {
                C12216SpG spG = this.A02;
                synchronized (spG.A0A) {
                    z = spG.A03;
                }
                if (z) {
                    spG.A09.callIdleCallbacks((double) A07);
                }
                spG.A00 = null;
            }
        }
    }
}
