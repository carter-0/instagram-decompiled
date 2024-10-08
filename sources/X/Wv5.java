package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

public final class Wv5 extends AbstractExecutorService {
    public static final Wv5 A00 = new AbstractExecutorService();

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
    }

    public final List shutdownNow() {
        return Collections.emptyList();
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
