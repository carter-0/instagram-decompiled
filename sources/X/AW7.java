package X;

import java.util.concurrent.CountDownLatch;

public final class AW7 implements C365558nJ {
    public final /* synthetic */ C365618nP A00;
    public final /* synthetic */ CountDownLatch A01;

    public AW7(C365618nP r1, CountDownLatch countDownLatch) {
        this.A00 = r1;
        this.A01 = countDownLatch;
    }

    public final void D59(AnonymousClass9GD r2) {
        this.A01.countDown();
    }
}
