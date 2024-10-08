package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.Am5  reason: case insensitive filesystem */
public final class C40959Am5 implements Runnable {
    public final /* synthetic */ AnonymousClass9SN A00;
    public final /* synthetic */ CountDownLatch A01;

    public C40959Am5(AnonymousClass9SN r1, CountDownLatch countDownLatch) {
        this.A00 = r1;
        this.A01 = countDownLatch;
    }

    public final void run() {
        AnonymousClass9SN r0 = this.A00;
        AnonymousClass9SN.A01(r0);
        AnonymousClass9SN.A03(r0);
        this.A01.countDown();
    }
}
