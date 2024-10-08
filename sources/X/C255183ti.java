package X;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3ti  reason: invalid class name and case insensitive filesystem */
public abstract class C255183ti {
    public static C67347MmO A00(Iterable iterable) {
        1K8 r0 = 1L8.A03;
        return new C67347MmO(ImmutableList.copyOf(iterable), true);
    }

    public static ListenableFuture A03(Object obj) {
        if (obj == null) {
            return 1Ks.A01;
        }
        return new 1Ks(obj);
    }

    public static void A04(2IR r1, ListenableFuture listenableFuture, Executor executor) {
        listenableFuture.addListener(new C258603zL(r1, listenableFuture), executor);
    }

    public static 1Kz A01(ListenableFuture... listenableFutureArr) {
        return new 1Kz(ImmutableList.copyOf((Object[]) listenableFutureArr));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.3zI, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.3zJ, java.lang.Object, java.lang.Runnable] */
    public static ListenableFuture A02(ListenableFuture listenableFuture, ScheduledExecutorService scheduledExecutorService, TimeUnit timeUnit, long j) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        ? obj = new Object();
        obj.A00 = listenableFuture;
        ? obj2 = new Object();
        obj2.A00 = obj;
        obj.A01 = scheduledExecutorService.schedule(obj2, j, timeUnit);
        listenableFuture.addListener(obj2, 1Lf.A01);
        return obj;
    }
}
