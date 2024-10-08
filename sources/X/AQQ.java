package X;

import java.util.concurrent.CountDownLatch;

public final class AQQ implements C371478yM {
    public final /* synthetic */ CountDownLatch A00;

    public AQQ(CountDownLatch countDownLatch) {
        this.A00 = countDownLatch;
    }

    public final void DEV(C8993RKl rKl) {
        this.A00.countDown();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.countDown();
    }
}
