package X;

import java.util.concurrent.BlockingQueue;

public final class TBS implements Runnable {
    public final /* synthetic */ TSb A00;

    public TBS(TSb tSb) {
        this.A00 = tSb;
    }

    public final void run() {
        try {
            TSb tSb = this.A00;
            BlockingQueue blockingQueue = tSb.A02;
            Runnable runnable = (Runnable) blockingQueue.poll();
            if (runnable != null) {
                runnable.run();
            }
            tSb.A05.decrementAndGet();
            if (!blockingQueue.isEmpty()) {
                TSb.A00(tSb);
            }
        } catch (Throwable th) {
            TSb tSb2 = this.A00;
            tSb2.A05.decrementAndGet();
            if (!tSb2.A02.isEmpty()) {
                TSb.A00(tSb2);
            }
            throw th;
        }
    }
}
