package androidx.work;

import X.AnonymousClass7TE;
import X.C12845TAk;
import X.C12937TEo;
import X.C2379539x;
import X.C282935Fi;
import X.C283015Ft;
import X.C7325Q4b;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

public abstract class Worker extends C283015Ft {
    public C2379539x mFuture;

    public abstract C282935Fi doWork();

    public C7325Q4b getForegroundInfo() {
        throw AnonymousClass7TE.A0z("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.39x, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public ListenableFuture getForegroundInfoAsync() {
        ? obj = new Object();
        this.mWorkerParams.A0A.execute(new C12937TEo(this, obj));
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.39x, java.lang.Object] */
    public final ListenableFuture startWork() {
        this.mFuture = new Object();
        this.mWorkerParams.A0A.execute(new C12845TAk(this));
        return this.mFuture;
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
