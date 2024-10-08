package X;

import androidx.work.Worker;

/* renamed from: X.TAk  reason: case insensitive filesystem */
public final class C12845TAk implements Runnable {
    public final /* synthetic */ Worker A00;

    public C12845TAk(Worker worker) {
        this.A00 = worker;
    }

    public final void run() {
        try {
            Worker worker = this.A00;
            worker.mFuture.A07(worker.doWork());
        } catch (Throwable th) {
            this.A00.mFuture.A08(th);
        }
    }
}
