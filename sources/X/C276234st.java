package X;

import android.os.Handler;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4st  reason: invalid class name and case insensitive filesystem */
public final class C276234st extends AbstractExecutorService implements C258473z8 {
    public final Handler A00;

    public final /* bridge */ /* synthetic */ ListenableFuture Eyj(Runnable runnable) {
        QLQ qlq = new QLQ(this.A00, (Object) null, runnable);
        execute(qlq);
        return qlq;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        QLQ qlq = new QLQ(handler, (Object) null, runnable);
        handler.postAtTime(0ST.A00(qlq, "HandlerListeningExecutorService", 0), qlq, SystemClock.uptimeMillis() + timeUnit.toMillis(j));
        return qlq;
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        runnable.getClass();
        QLQ qlq = new QLQ(this.A00, (Object) null, runnable);
        execute(qlq);
        return qlq;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void execute(Runnable runnable) {
        if ((runnable instanceof Future) && !(runnable instanceof R21)) {
            Class<?> cls = getClass();
            0KC.A0A(cls, "%s submitted as runnable to %s. Potential deadlocks on get().", new Object[]{runnable.getClass(), cls});
        }
        this.A00.postAtTime(0ST.A00(runnable, "HandlerListeningExecutorService", 0), runnable, SystemClock.uptimeMillis());
    }

    public final RunnableFuture newTaskFor(Callable callable) {
        return new QLQ(this.A00, callable);
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public C276234st(Handler handler) {
        this.A00 = handler;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture Eyk(Callable callable) {
        callable.getClass();
        QLQ qlq = new QLQ(this.A00, callable);
        execute(qlq);
        return qlq;
    }

    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new QLQ(this.A00, obj, runnable);
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        QLQ qlq = new QLQ(handler, callable);
        handler.postAtTime(0ST.A00(qlq, "HandlerListeningExecutorService", 0), qlq, SystemClock.uptimeMillis() + timeUnit.toMillis(j));
        return qlq;
    }

    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        callable.getClass();
        QLQ qlq = new QLQ(this.A00, callable);
        execute(qlq);
        return qlq;
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        QLQ qlq = new QLQ(this.A00, obj, runnable);
        execute(qlq);
        return qlq;
    }
}
