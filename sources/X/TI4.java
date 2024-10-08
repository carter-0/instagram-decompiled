package X;

import com.google.common.util.concurrent.ListenableFuture;

public final class TI4 implements Runnable {
    public final /* synthetic */ 1MD A00;
    public final /* synthetic */ C2379539x A01;
    public final /* synthetic */ ListenableFuture A02;

    public TI4(1MD r1, C2379539x r2, ListenableFuture listenableFuture) {
        this.A02 = listenableFuture;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        try {
            this.A01.A07(this.A00.apply(this.A02.get()));
        } catch (Throwable th) {
            th = th;
            Throwable cause = th.getCause();
            if (cause != null) {
                th = cause;
            }
            this.A01.A08(th);
        }
    }
}
