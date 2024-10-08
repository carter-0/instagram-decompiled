package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

public final class SOD {
    public boolean A00;
    public final AtomicReference A01 = new AtomicReference();
    public final Object A02 = Pxe.A0p();
    public final Queue A03 = new ArrayDeque();

    public static final void A00(SOD sod) {
        synchronized (sod.A02) {
            Queue queue = sod.A03;
            if (queue.isEmpty()) {
                sod.A00 = false;
                return;
            }
            C10478Rst rst = (C10478Rst) queue.remove();
            sod.A01(rst.A00, rst.A01);
        }
    }

    private final void A01(Runnable runnable, Executor executor) {
        try {
            executor.execute(new THN(this, runnable));
        } catch (RejectedExecutionException unused) {
            A00(this);
        }
    }

    public final void A02(Runnable runnable, Executor executor) {
        synchronized (this.A02) {
            if (this.A00) {
                this.A03.add(new C10478Rst(runnable, executor));
                return;
            }
            this.A00 = true;
            A01(runnable, executor);
        }
    }
}
