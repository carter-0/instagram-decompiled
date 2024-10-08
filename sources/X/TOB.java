package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class TOB implements RejectedExecutionHandler {
    public final AtomicBoolean A00 = new AtomicBoolean();

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException unused) {
            Pxe.A1F();
        }
        this.A00.getAndSet(true);
    }
}
