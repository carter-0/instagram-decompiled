package X;

import android.os.SystemClock;

public final class TGF implements Runnable {
    public final Runnable A00;
    public final /* synthetic */ TO6 A01;

    public TGF(TO6 to6, Runnable runnable) {
        this.A01 = to6;
        this.A00 = runnable;
        SystemClock.uptimeMillis();
    }

    public final void run() {
        SystemClock.uptimeMillis();
        TO6 to6 = this.A01;
        SystemClock.currentThreadTimeMillis();
        this.A00.run();
        SystemClock.currentThreadTimeMillis();
        SystemClock.uptimeMillis();
        synchronized (to6) {
            to6.A00 = false;
        }
        TO6.A01(to6);
    }
}
