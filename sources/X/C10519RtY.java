package X;

import androidx.work.multiprocess.IWorkManagerImplCallback;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.RtY  reason: case insensitive filesystem */
public abstract class C10519RtY {
    public final IWorkManagerImplCallback A00;
    public final ListenableFuture A01;
    public final Executor A02;

    public C10519RtY(IWorkManagerImplCallback iWorkManagerImplCallback, ListenableFuture listenableFuture, Executor executor) {
        this.A02 = executor;
        this.A00 = iWorkManagerImplCallback;
        this.A01 = listenableFuture;
    }
}
