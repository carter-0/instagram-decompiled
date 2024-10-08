package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.Nxi  reason: case insensitive filesystem */
public abstract class C70128Nxi {
    public static final void A00(Runnable runnable) {
        if (11Z.A07()) {
            runnable.run();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        11Z.A03(new C73229PZ8(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            0wb.A06("DirectNotificationActionService", "Error waiting for task to complete on UI thread", e);
        }
    }
}
