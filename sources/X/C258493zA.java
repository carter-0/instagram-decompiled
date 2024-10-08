package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3zA  reason: invalid class name and case insensitive filesystem */
public final class C258493zA extends C258503zB implements C258473z8 {
    public final ScheduledExecutorService A00;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.3zD, java.lang.Runnable] */
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        boolean z = 1K2.A02;
        Callable callable = Executors.callable(runnable, (Object) null);
        ? obj = new Object();
        obj.A00 = new C258563zH(obj, callable);
        return new R23(obj, this.A00.schedule(obj, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C8705R1w r1w = new C8705R1w(runnable);
        return new R23(r1w, this.A00.scheduleAtFixedRate(r1w, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C8705R1w r1w = new C8705R1w(runnable);
        return new R23(r1w, this.A00.scheduleWithFixedDelay(r1w, j, j2, timeUnit));
    }

    public C258493zA(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.A00 = scheduledExecutorService;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.3zD, java.lang.Runnable] */
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        ? obj = new Object();
        obj.A00 = new C258563zH(obj, callable);
        return new R23(obj, this.A00.schedule(obj, j, timeUnit));
    }
}
