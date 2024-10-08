package X;

import androidx.work.Worker;

/* renamed from: X.TEo  reason: case insensitive filesystem */
public final class C12937TEo implements Runnable {
    public final /* synthetic */ Worker A00;
    public final /* synthetic */ C2379539x A01;

    public C12937TEo(Worker worker, C2379539x r2) {
        this.A00 = worker;
        this.A01 = r2;
    }

    public final void run() {
        try {
            this.A00.getForegroundInfo();
            throw AnonymousClass00P.createAndThrow();
        } catch (Throwable th) {
            this.A01.A08(th);
        }
    }
}
