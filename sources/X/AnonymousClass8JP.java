package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.8JP  reason: invalid class name */
public final class AnonymousClass8JP implements ScheduledExecutorService {
    public final AnonymousClass4CZ A00;
    public final C262224Cq A01;

    public final void execute(Runnable runnable) {
        0qQ.A0B(runnable, 0);
        C262224Cq r3 = this.A01;
        C376879Jr r2 = new C376879Jr(runnable, (AnonymousClass4D7) null, 5);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }

    public final List invokeAll(Collection collection) {
        0qQ.A0B(collection, 0);
        return A01(collection, C41693Ayk.A00);
    }

    public final Object invokeAny(Collection collection) {
        0qQ.A0B(collection, 0);
        return A00(collection, C41694Ayl.A00);
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        0qQ.A0B(callable, 0);
        0qQ.A0B(timeUnit, 2);
        long millis = timeUnit.toMillis(j);
        C13272TSn tSn = new C13272TSn(callable, millis);
        C262224Cq r1 = this.A01;
        1Eo.A05(19B.A00, new MGA((Object) tSn, (AnonymousClass4D7) null, 5, millis), r1);
        return tSn;
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        0qQ.A0B(runnable, 0);
        TimeUnit timeUnit2 = timeUnit;
        0qQ.A0B(timeUnit2, 3);
        long millis = timeUnit2.toMillis(j);
        C13272TSn tSn = new C13272TSn((Object) null, runnable, millis);
        C262224Cq r1 = this.A01;
        1Eo.A05(19B.A00, new MGH(tSn, timeUnit2, (AnonymousClass4D7) null, 0, j2, millis), r1);
        return tSn;
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        0qQ.A0B(runnable, 0);
        TimeUnit timeUnit2 = timeUnit;
        0qQ.A0B(timeUnit2, 3);
        long millis = timeUnit2.toMillis(j);
        C13272TSn tSn = new C13272TSn((Object) null, runnable, millis);
        C262224Cq r1 = this.A01;
        1Eo.A05(19B.A00, new MGH(tSn, timeUnit2, (AnonymousClass4D7) null, 1, j2, millis), r1);
        return tSn;
    }

    public final Future submit(Runnable runnable, Object obj) {
        0qQ.A0B(runnable, 0);
        C13272TSn tSn = new C13272TSn(obj, runnable, 0);
        C262224Cq r3 = this.A01;
        1Eo.A05(19B.A00, new C59712JUv(tSn, (AnonymousClass4D7) null, 37), r3);
        return tSn;
    }

    private final List A01(Collection collection, 0sP r7) {
        ArrayList<Future> arrayList = new ArrayList<>(0Yv.A1E(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(submit((Callable) it.next()));
        }
        for (Future future : arrayList) {
            if (!future.isDone()) {
                try {
                    r7.invoke(future);
                } catch (CancellationException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
                    for (Future cancel : arrayList) {
                        arrayList2.add(Boolean.valueOf(cancel.cancel(false)));
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Shutdown not supported");
    }

    public final void shutdown() {
        throw new UnsupportedOperationException("Shutdown not supported");
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutdown not supported");
    }

    public AnonymousClass8JP(AnonymousClass4CZ r2) {
        this.A00 = r2;
        this.A01 = 19E.A02(r2);
    }

    private final Object A00(Collection collection, 0sP r6) {
        if (!collection.isEmpty()) {
            e = null;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Future submit = submit((Callable) it.next());
                try {
                    return r6.invoke(submit);
                } catch (ExecutionException e) {
                    e = e;
                } catch (RuntimeException e2) {
                    e = new ExecutionException(e2);
                } catch (TimeoutException e3) {
                    submit.cancel(false);
                    throw e3;
                }
            }
            if (e == null) {
                throw new IllegalStateException("Required value was null.");
            }
            throw e;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        0qQ.A0B(collection, 0);
        0qQ.A0B(timeUnit, 2);
        return A01(collection, new GQ2(SystemClock.elapsedRealtime() + timeUnit.toMillis(j), 2));
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        0qQ.A0B(collection, 0);
        0qQ.A0B(timeUnit, 2);
        return A00(collection, new GQ2(SystemClock.elapsedRealtime() + timeUnit.toMillis(j), 3));
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        0qQ.A0B(runnable, 0);
        0qQ.A0B(timeUnit, 2);
        long millis = timeUnit.toMillis(j);
        C13272TSn tSn = new C13272TSn((Object) null, runnable, millis);
        C262224Cq r1 = this.A01;
        1Eo.A05(19B.A00, new MGA((Object) tSn, (AnonymousClass4D7) null, 4, millis), r1);
        return tSn;
    }

    public final Future submit(Callable callable) {
        0qQ.A0B(callable, 0);
        C13272TSn tSn = new C13272TSn(callable, 0);
        C262224Cq r3 = this.A01;
        1Eo.A05(19B.A00, new C59712JUv(tSn, (AnonymousClass4D7) null, 36), r3);
        return tSn;
    }

    public final Future submit(Runnable runnable) {
        0qQ.A0B(runnable, 0);
        C13272TSn tSn = new C13272TSn((Object) null, runnable, 0);
        C262224Cq r2 = this.A01;
        1Eo.A05(19B.A00, new C59712JUv(tSn, (AnonymousClass4D7) null, 38), r2);
        return tSn;
    }
}
