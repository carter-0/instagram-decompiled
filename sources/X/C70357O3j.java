package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: X.O3j  reason: case insensitive filesystem */
public abstract class C70357O3j {
    public static final Object A00(ListenableFuture listenableFuture, AnonymousClass4D7 r4) {
        try {
            if (listenableFuture.isDone()) {
                return AnonymousClass412.A00(listenableFuture);
            }
            1IW A0q = C51973G9u.A0q(r4);
            listenableFuture.addListener(new C73278PZw(listenableFuture, A0q), 1Lf.A01);
            A0q.CO0(new J6L(listenableFuture, 26));
            return A0q.A0E();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            0qQ.A0A(cause);
            throw cause;
        }
    }
}
