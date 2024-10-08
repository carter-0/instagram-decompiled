package X;

import androidx.work.multiprocess.RemoteCoroutineWorker;
import java.util.concurrent.CancellationException;

/* renamed from: X.TAr  reason: case insensitive filesystem */
public final /* synthetic */ class C12852TAr implements Runnable {
    public final /* synthetic */ RemoteCoroutineWorker A00;

    public /* synthetic */ C12852TAr(RemoteCoroutineWorker remoteCoroutineWorker) {
        this.A00 = remoteCoroutineWorker;
    }

    public final void run() {
        RemoteCoroutineWorker remoteCoroutineWorker = this.A00;
        if (remoteCoroutineWorker.A00.isCancelled()) {
            remoteCoroutineWorker.A01.AG7((CancellationException) null);
        }
    }
}
