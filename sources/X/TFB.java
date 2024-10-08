package X;

import java.util.concurrent.Future;

public final /* synthetic */ class TFB implements Runnable {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ Future A01;

    public /* synthetic */ TFB(Runnable runnable, Future future) {
        this.A01 = future;
        this.A00 = runnable;
    }

    public final void run() {
        Future future = this.A01;
        if (!future.isDone() && !future.isCancelled()) {
            Runnable runnable = this.A00;
            future.cancel(true);
            SUN.A0A("BillingClient", "Async task is taking too long, cancel it!");
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
