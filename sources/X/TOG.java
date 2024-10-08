package X;

import java.util.concurrent.ThreadFactory;

public final class TOG implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
