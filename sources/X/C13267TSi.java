package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.TSi  reason: case insensitive filesystem */
public final class C13267TSi extends FutureTask {
    public SSQ A00;

    public final void done() {
        try {
            if (!isCancelled()) {
                SSQ.A00((SIM) get(), this.A00);
            }
        } catch (InterruptedException | ExecutionException e) {
            SSQ.A00(new SIM(e), this.A00);
        } catch (Throwable th) {
            this.A00 = null;
            throw th;
        }
        this.A00 = null;
    }
}
