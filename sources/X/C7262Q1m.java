package X;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.Q1m  reason: case insensitive filesystem */
public final class C7262Q1m implements Executor {
    public final /* synthetic */ 1K2 A00;
    public final /* synthetic */ Executor A01;

    public C7262Q1m(1K2 r1, Executor executor) {
        this.A01 = executor;
        this.A00 = r1;
    }

    public final void execute(Runnable runnable) {
        try {
            this.A01.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.A00.setException(e);
        }
    }
}
