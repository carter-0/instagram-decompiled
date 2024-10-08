package X;

import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6S5  reason: invalid class name */
public abstract class AnonymousClass6S5 {
    public RunnableFuture A00;
    public Object A01;
    public final AtomicInteger A02 = new AtomicInteger(-1);

    public final Object A00() {
        RunnableFuture runnableFuture;
        Object obj;
        synchronized (this) {
            runnableFuture = this.A00;
            obj = this.A01;
        }
        if (obj == null) {
            if (runnableFuture != null) {
                AtomicInteger atomicInteger = this.A02;
                if (atomicInteger.compareAndSet(-1, Process.myTid())) {
                    runnableFuture.run();
                }
                obj = C245983dn.A00(runnableFuture, atomicInteger.get());
                synchronized (this) {
                    this.A01 = obj;
                    this.A00 = null;
                }
                if (this instanceof AnonymousClass6SI) {
                    0qQ.A0B(obj, 0);
                    ((AnonymousClass6SI) this).A01 = null;
                    return obj;
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return obj;
    }

    public AnonymousClass6S5(Callable callable) {
        this.A00 = new FutureTask(callable);
    }
}
