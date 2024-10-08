package X;

import java.util.concurrent.Future;

/* renamed from: X.5oZ  reason: invalid class name and case insensitive filesystem */
public final class C295605oZ implements Runnable {
    public final /* synthetic */ C3722690d A00;
    public final /* synthetic */ Future A01;

    public C295605oZ(C3722690d r1, Future future) {
        this.A00 = r1;
        this.A01 = future;
    }

    public final void run() {
        if (this.A00.A01.isCancelled()) {
            this.A01.cancel(true);
        }
    }
}
