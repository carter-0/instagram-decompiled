package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.3zL  reason: invalid class name and case insensitive filesystem */
public final class C258603zL implements Runnable {
    public final 2IR A00;
    public final Future A01;

    public final void run() {
        2IR r1;
        Throwable th;
        Future future = this.A01;
        if (!(future instanceof AnonymousClass1K3) || (th = ((AnonymousClass1K3) future).A06()) == null) {
            try {
                17k.A0B(future, "Future was expected to be done: %s", future.isDone());
                this.A00.onSuccess(AnonymousClass412.A00(future));
            } catch (ExecutionException e) {
                r1 = this.A00;
                th = e.getCause();
            } catch (Throwable th2) {
                th = th2;
                r1 = this.A00;
            }
        } else {
            r1 = this.A00;
            r1.onFailure(th);
        }
    }

    public C258603zL(2IR r1, Future future) {
        this.A01 = future;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.ODJ, java.lang.Object] */
    public final String toString() {
        C66726MbX A002 = C66725MbW.A00(this);
        2IR r2 = this.A00;
        ? obj = new Object();
        A002.A00.A00 = obj;
        A002.A00 = obj;
        obj.A01 = r2;
        return A002.toString();
    }
}
