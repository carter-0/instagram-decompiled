package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.WkP  reason: case insensitive filesystem */
public final class C20065WkP implements Runnable {
    public final /* synthetic */ CountDownLatch A00;

    public C20065WkP(CountDownLatch countDownLatch) {
        this.A00 = countDownLatch;
    }

    public final void run() {
        this.A00.countDown();
    }
}
