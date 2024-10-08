package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class S1A {
    public final C13712Tfa A00;
    public final ScheduledExecutorService A01;

    public final void A00(Runnable runnable) {
        this.A01.submit(new C12963TFw(this, runnable));
    }

    public S1A(C13712Tfa tfa) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.A00 = tfa;
        this.A01 = newSingleThreadScheduledExecutor;
    }
}
