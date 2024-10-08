package X;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.38Q  reason: invalid class name */
public final class AnonymousClass38Q extends 12Z implements C262114Ce {
    public final Executor A00;

    public final void A0O(Runnable runnable, C262094Cc r5) {
        try {
            this.A00.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            AnonymousClass5H8.A01(cancellationException, r5);
            AnonymousClass12W.A01.A0O(runnable, r5);
        }
    }

    public final AnonymousClass19L CO5(Runnable runnable, C262094Cc r5, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    return new C41495Aut(schedule);
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                AnonymousClass5H8.A01(cancellationException, r5);
            }
        }
        return 12x.A00.CO5(runnable, r5, j);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.4CZ, X.38Q] */
    public final void EKQ(1IX r5, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            M8K m8k = new M8K(r5, this);
            C262094Cc context = r5.getContext();
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(m8k, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    r5.CO0(new C13410TYu(schedule));
                    return;
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                AnonymousClass5H8.A01(cancellationException, context);
            }
        }
        12x.A00.EKQ(r5, j);
    }

    public final void close() {
        ExecutorService executorService;
        Executor executor = this.A00;
        if ((executor instanceof ExecutorService) && (executorService = (ExecutorService) executor) != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass38Q) || ((AnonymousClass38Q) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.A00);
    }

    public final String toString() {
        return this.A00.toString();
    }

    public AnonymousClass38Q(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.A00 = executor;
        try {
            if ((executor instanceof ScheduledThreadPoolExecutor) && (scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor) != null && (method = C10044Rlh.A00) != null) {
                method.invoke(scheduledThreadPoolExecutor, new Object[]{true});
            }
        } catch (Throwable unused) {
        }
    }
}
