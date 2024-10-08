package X;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3zB  reason: invalid class name and case insensitive filesystem */
public class C258503zB extends C258513zC {
    public final ExecutorService A00;

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.A00.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.A00.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.A00.isShutdown();
    }

    public final boolean isTerminated() {
        return this.A00.isTerminated();
    }

    public final void shutdown() {
        this.A00.shutdown();
    }

    public final List shutdownNow() {
        return this.A00.shutdownNow();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }

    public C258503zB(ExecutorService executorService) {
        executorService.getClass();
        this.A00 = executorService;
    }
}
