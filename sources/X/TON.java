package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class TON implements ThreadFactory {
    public final ThreadFactory A00 = Executors.defaultThreadFactory();
    public final AtomicInteger A01 = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.A01;
        Thread newThread = this.A00.newThread(runnable);
        newThread.setName(002.A0O("PlayBillingLibrary-", atomicInteger.getAndIncrement()));
        return newThread;
    }
}
