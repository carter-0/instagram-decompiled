package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.38P  reason: invalid class name */
public final class AnonymousClass38P implements Executor {
    public Runnable A00;
    public final Object A01 = new Object();
    public final ArrayDeque A02 = new ArrayDeque();
    public final Executor A03;

    public final void A00() {
        Runnable runnable = (Runnable) this.A02.poll();
        this.A00 = runnable;
        if (runnable != null) {
            this.A03.execute(runnable);
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.A01) {
            this.A02.add(new C2379039s(this, runnable));
            if (this.A00 == null) {
                A00();
            }
        }
    }

    public AnonymousClass38P(Executor executor) {
        this.A03 = executor;
    }
}
