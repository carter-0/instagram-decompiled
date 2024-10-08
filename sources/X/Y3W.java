package X;

import java.util.concurrent.TimeUnit;

public final class Y3W implements Runnable {
    public final long A00;
    public final XQJ A01;
    public final Runnable A02;

    public final void run() {
        XQJ xqj = this.A01;
        if (!xqj.A03) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long convert = timeUnit.convert(System.currentTimeMillis(), timeUnit);
            long j = this.A00;
            if (j > convert) {
                try {
                    Thread.sleep(j - convert);
                } catch (InterruptedException e) {
                    Pxe.A1F();
                    C318176oW.A01(e);
                    return;
                }
            }
            if (!xqj.A03) {
                this.A02.run();
            }
        }
    }

    public Y3W(XQJ xqj, Runnable runnable, long j) {
        this.A02 = runnable;
        this.A01 = xqj;
        this.A00 = j;
    }
}
