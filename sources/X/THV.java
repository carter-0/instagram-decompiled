package X;

import java.util.concurrent.Executor;

public final class THV implements Runnable {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ Executor A01;

    public THV(Runnable runnable, Executor executor) {
        this.A01 = executor;
        this.A00 = runnable;
    }

    public final void run() {
        this.A01.execute(this.A00);
    }
}
