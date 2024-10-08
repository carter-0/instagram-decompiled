package X;

import androidx.work.CoroutineWorker;
import java.util.concurrent.CancellationException;

/* renamed from: X.5Fu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C283025Fu implements Runnable {
    public final /* synthetic */ CoroutineWorker A00;

    public /* synthetic */ C283025Fu(CoroutineWorker coroutineWorker) {
        this.A00 = coroutineWorker;
    }

    public final void run() {
        CoroutineWorker coroutineWorker = this.A00;
        if (coroutineWorker.A00.isCancelled()) {
            coroutineWorker.A02.AG7((CancellationException) null);
        }
    }
}
