package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class TO8 implements ExecutorService {
    public final ExecutorService A00;

    public final C13158TNq A01(Callable callable) {
        C635813i r2;
        if (this instanceof R27) {
            r2 = ((R27) this).A01;
        } else {
            r2 = ((R26) this).A00;
        }
        callable.getClass();
        return new C13158TNq(4, r2, callable);
    }

    public final THG A02(Runnable runnable) {
        C635813i r1;
        if (this instanceof R27) {
            r1 = ((R27) this).A01;
        } else {
            r1 = ((R26) this).A00;
        }
        runnable.getClass();
        return new THG(r1, runnable);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.A00.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.A00.execute(A02(runnable));
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.A00.invokeAll(A00(collection), j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.A00.invokeAny(A00(collection), j, timeUnit);
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

    public final Future submit(Runnable runnable, Object obj) {
        return this.A00.submit(A02(runnable), obj);
    }

    public TO8(ExecutorService executorService) {
        this.A00 = executorService;
    }

    private ImmutableList A00(Collection collection) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            builder.add(A01((Callable) it.next()));
        }
        return builder.build();
    }

    public final List invokeAll(Collection collection) {
        return this.A00.invokeAll(A00(collection));
    }

    public final Object invokeAny(Collection collection) {
        return this.A00.invokeAny(A00(collection));
    }

    public final Future submit(Callable callable) {
        ExecutorService executorService = this.A00;
        callable.getClass();
        return executorService.submit(A01(callable));
    }

    public final Future submit(Runnable runnable) {
        return this.A00.submit(A02(runnable));
    }
}
