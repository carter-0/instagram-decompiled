package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class TOP implements ThreadFactory {
    public final ThreadFactory A00 = Executors.defaultThreadFactory();
    public final AtomicInteger A01 = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A00.newThread(new PyN(runnable));
        newThread.setName(002.A06(this.A01.getAndIncrement(), "GAC_Executor", "[", "]"));
        return newThread;
    }
}
