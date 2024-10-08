package X;

import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.RemoteWorkManagerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class QGB extends C10519RtY {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QGB(IWorkManagerImplCallback iWorkManagerImplCallback, RemoteWorkManagerImpl remoteWorkManagerImpl, ListenableFuture listenableFuture, Executor executor, int i) {
        super(iWorkManagerImplCallback, listenableFuture, executor);
        this.A00 = i;
        this.A01 = remoteWorkManagerImpl;
    }
}
