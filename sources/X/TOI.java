package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class TOI implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, 002.A0R("gcm-task#", Integer.toString(this.A00.getAndIncrement())));
        thread.setPriority(4);
        return thread;
    }
}
