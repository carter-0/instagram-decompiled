package X;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6oh  reason: invalid class name and case insensitive filesystem */
public abstract class C318286oh implements C65051aA {
    public C65051aA A00(Runnable runnable) {
        if (this instanceof AnonymousClass6FM) {
            AnonymousClass6FM r3 = (AnonymousClass6FM) this;
            if (r3.A04) {
                return AnonymousClass6F8.INSTANCE;
            }
            1aP.A01(runnable, "run is null");
            AnonymousClass67O r1 = new AnonymousClass67O(runnable);
            AnonymousClass6FN r2 = r3.A01;
            r2.offer(r1);
            if (r3.A03.getAndIncrement() != 0) {
                return r1;
            }
            try {
                r3.A02.execute(r3);
                return r1;
            } catch (RejectedExecutionException e) {
                r3.A04 = true;
                r2.clear();
                C318176oW.A01(e);
                return AnonymousClass6F8.INSTANCE;
            }
        } else if (this instanceof C318276og) {
            return A01(runnable, (TimeUnit) null, 0);
        } else {
            return A01(runnable, TimeUnit.NANOSECONDS, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1aA, java.util.concurrent.atomic.AtomicReference, X.Y5s] */
    public C65051aA A01(Runnable runnable, TimeUnit timeUnit, long j) {
        Runnable runnable2 = runnable;
        TimeUnit timeUnit2 = timeUnit;
        long j2 = j;
        if (this instanceof C318276og) {
            C318276og r4 = (C318276og) this;
            if (r4.A01) {
                return AnonymousClass6F8.INSTANCE;
            }
            return r4.A02((AnonymousClass1aB) null, runnable2, timeUnit2, j2);
        }
        AnonymousClass6FM r5 = (AnonymousClass6FM) this;
        if (j <= 0) {
            return r5.A00(runnable);
        }
        if (r5.A04) {
            return AnonymousClass6F8.INSTANCE;
        }
        AtomicReference atomicReference = new AtomicReference();
        ? atomicReference2 = new AtomicReference();
        atomicReference2.lazySet(atomicReference);
        1aP.A01(runnable, "run is null");
        Y3V y3v = new Y3V(atomicReference2, r5, runnable);
        C65041a9 r0 = r5.A00;
        XDF xdf = new XDF(r0, y3v);
        r0.A7i(xdf);
        Executor executor = r5.A02;
        if (executor instanceof ScheduledExecutorService) {
            try {
                xdf.A00(((ScheduledExecutorService) executor).schedule(xdf, j, timeUnit));
            } catch (RejectedExecutionException e) {
                r5.A04 = true;
                C318176oW.A01(e);
                return AnonymousClass6F8.INSTANCE;
            }
        } else {
            xdf.A00(new Y4B(C318396os.A01.A02(xdf, timeUnit, j)));
        }
        1af.A00(xdf, atomicReference);
        return atomicReference2;
    }
}
