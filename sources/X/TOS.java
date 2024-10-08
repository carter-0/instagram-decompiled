package X;

import java.util.concurrent.ThreadFactory;

public final class TOS implements ThreadFactory {
    public static final TOS A00 = new TOS();

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }
}
