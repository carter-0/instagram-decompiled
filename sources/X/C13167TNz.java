package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.TNz  reason: case insensitive filesystem */
public final class C13167TNz implements Executor {
    public Runnable A00;
    public final C13567Tcn A01;
    public final ArrayDeque A02 = new ArrayDeque();
    public final Executor A03;

    public final synchronized void A00() {
        Runnable runnable = (Runnable) this.A02.poll();
        this.A00 = runnable;
        if (runnable != null) {
            this.A03.execute(runnable);
        }
    }

    public final synchronized void execute(Runnable runnable) {
        this.A02.offer(new C12949TFi(this, runnable));
        if (this.A00 == null) {
            A00();
        }
    }

    public C13167TNz(C13567Tcn tcn, Executor executor) {
        this.A03 = executor;
        this.A01 = tcn;
    }
}
