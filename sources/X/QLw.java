package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public final class QLw extends C13274TSp {
    public QLw(BlockingQueue blockingQueue, ThreadFactory threadFactory, TimeUnit timeUnit) {
        super(5, 128, 1, timeUnit, blockingQueue, threadFactory);
    }

    public final void afterExecute(Runnable runnable, Throwable th) {
    }

    public final void beforeExecute(Thread thread, Runnable runnable) {
    }
}
