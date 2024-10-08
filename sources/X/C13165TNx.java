package X;

import java.util.concurrent.Executor;

/* renamed from: X.TNx  reason: case insensitive filesystem */
public final class C13165TNx implements Executor {
    public final /* synthetic */ C635813i A00;
    public final /* synthetic */ Executor A01;

    public C13165TNx(C635813i r1, Executor executor) {
        this.A01 = executor;
        this.A00 = r1;
    }

    public final void execute(Runnable runnable) {
        Executor executor = this.A01;
        C635813i r1 = this.A00;
        runnable.getClass();
        executor.execute(new THG(r1, runnable));
    }
}
