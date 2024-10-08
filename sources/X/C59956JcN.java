package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* renamed from: X.JcN  reason: case insensitive filesystem */
public final class C59956JcN implements Runnable {
    public final /* synthetic */ ListenableFuture A00;
    public final /* synthetic */ 1IX A01;

    public C59956JcN(ListenableFuture listenableFuture, 1IX r2) {
        this.A01 = r2;
        this.A00 = listenableFuture;
    }

    public final void run() {
        try {
            this.A01.resumeWith(this.A00.get());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            boolean z = th instanceof CancellationException;
            1IX r1 = this.A01;
            if (z) {
                r1.AG9(cause);
            } else {
                r1.resumeWith(JTO.A1B(cause));
            }
        }
    }
}
