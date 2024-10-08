package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class T0V implements ListenableFuture {
    public final C2379539x A00;
    public final C262204Co A01;

    public final void addListener(Runnable runnable, Executor executor) {
        this.A00.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.A00.cancel(z);
    }

    public final Object get() {
        return this.A00.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.A00.isCancelled();
    }

    public final boolean isDone() {
        return this.A00.isDone();
    }

    public T0V(C2379539x r3, C262204Co r4) {
        this.A01 = r4;
        this.A00 = r3;
        r4.CO3(new C66310MMt(this, 13));
    }
}
