package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.TFo  reason: case insensitive filesystem */
public final class C12955TFo implements Runnable {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ CountDownLatch A01;

    public C12955TFo(Runnable runnable, CountDownLatch countDownLatch) {
        this.A00 = runnable;
        this.A01 = countDownLatch;
    }

    public final void run() {
        this.A00.run();
        this.A01.countDown();
    }
}
