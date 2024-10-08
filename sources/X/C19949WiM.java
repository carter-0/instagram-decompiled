package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.WiM  reason: case insensitive filesystem */
public final class C19949WiM implements Runnable {
    public final /* synthetic */ CountDownLatch A00;

    public C19949WiM(CountDownLatch countDownLatch) {
        this.A00 = countDownLatch;
    }

    public final void run() {
        this.A00.countDown();
    }
}
