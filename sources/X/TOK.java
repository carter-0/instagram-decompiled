package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class TOK implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        return new TR4(runnable, 002.A0O("RtiExecutor #", this.A00.getAndIncrement()));
    }
}
