package X;

import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TSn  reason: case insensitive filesystem */
public final class C13272TSn extends FutureTask implements ScheduledFuture {
    public final long A00;
    public final C12063SmF A01;

    public final Object get(long j, TimeUnit timeUnit) {
        0qQ.A0B(timeUnit, 1);
        this.A01.A00();
        return super.get(j, timeUnit);
    }

    public final long getDelay(TimeUnit timeUnit) {
        0qQ.A0B(timeUnit, 0);
        return timeUnit.convert(this.A00 - SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS);
    }

    public final boolean cancel(boolean z) {
        this.A01.A00();
        return super.cancel(z);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        0qQ.A0B(delayed, 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return 0qQ.A01(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    public final void done() {
        Throwable th;
        C12063SmF smF = this.A01;
        synchronized (smF) {
            if (!isCancelled() && isDone()) {
                boolean z = smF.A01;
                try {
                    get();
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        smF.A00 = cause;
                    } else {
                        smF.A00 = e;
                    }
                } catch (Exception unused) {
                }
                if (smF.A02 || (th = smF.A00) == null) {
                    smF.A01 = z;
                } else {
                    throw C41845B3m.A0j(th);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.SmF, java.lang.Object, X.Y9I] */
    public C13272TSn(Object obj, Runnable runnable, long j) {
        super(runnable, obj);
        ? obj2 = new Object();
        obj2.A02 = true;
        C21536Xe7.A00(obj2, this);
        obj2.A02 = true;
        this.A01 = obj2;
        this.A00 = j + SystemClock.elapsedRealtime();
    }

    public final void A00() {
        super.runAndReset();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.SmF, java.lang.Object, X.Y9I] */
    public C13272TSn(Callable callable, long j) {
        super(callable);
        ? obj = new Object();
        obj.A02 = true;
        C21536Xe7.A00(obj, this);
        obj.A02 = true;
        this.A01 = obj;
        this.A00 = j + SystemClock.elapsedRealtime();
    }

    public final Object get() {
        this.A01.A00();
        return super.get();
    }
}
