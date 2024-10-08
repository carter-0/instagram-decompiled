package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TSc  reason: case insensitive filesystem */
public final class C13261TSc extends AbstractExecutorService implements C13986Tnc {
    public final Handler A00;

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        C7870Qbu qbu = new C7870Qbu(handler, (Object) null, runnable);
        handler.postDelayed(qbu, timeUnit.toMillis(j));
        return qbu;
    }

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Qbu, java.util.concurrent.RunnableFuture] */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C7870Qbu(this.A00, obj, runnable);
    }

    public C13261TSc(Handler handler) {
        this.A00 = handler;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw C66580MXl.A11();
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw C66580MXl.A11();
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw C66580MXl.A11();
    }

    public final void shutdown() {
        throw C66580MXl.A11();
    }

    public final List shutdownNow() {
        throw C66580MXl.A11();
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        C7870Qbu qbu = new C7870Qbu(this.A00, obj, runnable);
        execute(qbu);
        return qbu;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Qbu, java.util.concurrent.RunnableFuture] */
    public final RunnableFuture newTaskFor(Callable callable) {
        return new C7870Qbu(this.A00, callable);
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        C7870Qbu qbu = new C7870Qbu(handler, callable);
        handler.postDelayed(qbu, timeUnit.toMillis(j));
        return qbu;
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        runnable.getClass();
        C7870Qbu qbu = new C7870Qbu(this.A00, (Object) null, runnable);
        execute(qbu);
        return qbu;
    }

    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        callable.getClass();
        C7870Qbu qbu = new C7870Qbu(this.A00, callable);
        execute(qbu);
        return qbu;
    }
}
