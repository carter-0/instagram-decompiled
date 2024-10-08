package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.PXw  reason: case insensitive filesystem */
public final class C73161PXw implements Runnable {
    public final /* synthetic */ C71068Oan A00;
    public final /* synthetic */ CountDownLatch A01;

    public C73161PXw(C71068Oan oan, CountDownLatch countDownLatch) {
        this.A01 = countDownLatch;
        this.A00 = oan;
    }

    public final void run() {
        this.A01.countDown();
        Runnable runnable = this.A00.A05;
        if (runnable != null) {
            runnable.run();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
