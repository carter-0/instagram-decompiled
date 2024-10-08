package X;

import java.util.concurrent.ThreadFactory;

public final class TOF implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "msys-reporter-executor");
    }
}
