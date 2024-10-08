package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.PZ8  reason: case insensitive filesystem */
public final class C73229PZ8 implements Runnable {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ CountDownLatch A01;

    public C73229PZ8(Runnable runnable, CountDownLatch countDownLatch) {
        this.A00 = runnable;
        this.A01 = countDownLatch;
    }

    public final void run() {
        this.A00.run();
        this.A01.countDown();
    }
}
