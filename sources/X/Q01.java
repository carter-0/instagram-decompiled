package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class Q01 {
    public static ExecutorService A00;
    public static final Q01 A01 = new Object();

    public final void A00(Runnable runnable) {
        0qQ.A0B(runnable, 0);
        ExecutorService executorService = A00;
        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(5);
            A00 = executorService;
        }
        executorService.execute(runnable);
    }
}
