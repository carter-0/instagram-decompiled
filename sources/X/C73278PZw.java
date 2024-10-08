package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: X.PZw  reason: case insensitive filesystem */
public final class C73278PZw implements Runnable {
    public final ListenableFuture A00;
    public final 1IX A01;

    public final void run() {
        ListenableFuture listenableFuture = this.A00;
        if (listenableFuture.isCancelled()) {
            this.A01.AG9((Throwable) null);
            return;
        }
        try {
            this.A01.resumeWith(AnonymousClass412.A00(listenableFuture));
        } catch (ExecutionException e) {
            1IX r2 = this.A01;
            Throwable cause = e.getCause();
            JTQ.A1K(cause);
            r2.resumeWith(new 0eQ(cause));
        }
    }

    public C73278PZw(ListenableFuture listenableFuture, 1IX r2) {
        this.A00 = listenableFuture;
        this.A01 = r2;
    }
}
