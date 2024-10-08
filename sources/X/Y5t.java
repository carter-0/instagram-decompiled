package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

public final class Y5t extends AtomicReference implements C65051aA, Callable {
    public static final FutureTask A02;
    public static final FutureTask A03;
    public Thread A00;
    public final Runnable A01;

    static {
        Runnable runnable = C3033268h.A04;
        A02 = new FutureTask(runnable, (Object) null);
        A03 = new FutureTask(runnable, (Object) null);
    }

    public Y5t(Runnable runnable) {
        this.A01 = runnable;
    }

    public final void A00(Future future) {
        Object obj;
        do {
            obj = get();
            if (obj == A02) {
                return;
            }
            if (obj == A03) {
                future.cancel(C51969G9p.A1a(this.A00, Thread.currentThread()));
                return;
            }
        } while (!compareAndSet(obj, future));
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.A00 = Thread.currentThread();
        try {
            this.A01.run();
            return null;
        } finally {
            lazySet(A02);
            this.A00 = null;
        }
    }

    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future != A02 && future != (futureTask = A03) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(C51969G9p.A1a(this.A00, Thread.currentThread()));
        }
    }
}
