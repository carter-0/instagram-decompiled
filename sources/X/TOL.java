package X;

import java.util.concurrent.ThreadFactory;

public final class TOL implements ThreadFactory {
    public final /* synthetic */ ThreadFactory A00;

    public TOL(ThreadFactory threadFactory) {
        this.A00 = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A00.newThread(runnable);
        newThread.getClass();
        newThread.setDaemon(true);
        return newThread;
    }
}
