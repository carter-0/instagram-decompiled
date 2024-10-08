package X;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class TG6 implements Runnable {
    public final /* synthetic */ TO9 A00;
    public final /* synthetic */ Callable A01;

    public /* synthetic */ TG6(TO9 to9, Callable callable) {
        this.A00 = to9;
        this.A01 = callable;
    }

    public final void run() {
        TO9 to9 = this.A00;
        try {
            Object call = this.A01.call();
            CountDownLatch countDownLatch = to9.A02;
            if (countDownLatch.getCount() != 0) {
                to9.A01 = call;
                countDownLatch.countDown();
                return;
            }
            throw AnonymousClass7TE.A15("Result has already been set!");
        } catch (Exception e) {
            CountDownLatch countDownLatch2 = to9.A02;
            if (countDownLatch2.getCount() != 0) {
                to9.A00 = e;
                countDownLatch2.countDown();
                return;
            }
            throw AnonymousClass7TE.A15("Result has already been set!");
        }
    }
}
