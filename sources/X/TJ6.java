package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class TJ6 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ExecutorService A01;
    public final /* synthetic */ TimeUnit A02;

    public TJ6(ExecutorService executorService, long j, TimeUnit timeUnit) {
        this.A01 = executorService;
        this.A00 = j;
        this.A02 = timeUnit;
    }

    public final void run() {
        try {
            ExecutorService executorService = this.A01;
            executorService.shutdown();
            executorService.awaitTermination(this.A00, this.A02);
        } catch (InterruptedException unused) {
        }
    }
}
