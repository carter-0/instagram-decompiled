package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class TOU implements ThreadFactory {
    public static final AtomicInteger A03 = new AtomicInteger(1);
    public final String A00;
    public final ThreadGroup A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.A01, runnable, 002.A0O(this.A00, this.A02.getAndIncrement()), 0);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }

    public TOU() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.A01 = threadGroup;
        this.A00 = 002.A0c("lottie-", "-thread-", A03.getAndIncrement());
    }
}
