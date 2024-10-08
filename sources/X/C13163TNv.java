package X;

import java.util.concurrent.Executor;

/* renamed from: X.TNv  reason: case insensitive filesystem */
public final class C13163TNv implements Executor {
    public final Executor A00;

    public final void execute(Runnable runnable) {
        this.A00.execute(new TDD(runnable));
    }

    public C13163TNv(Executor executor) {
        this.A00 = executor;
    }
}
