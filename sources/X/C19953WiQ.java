package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.WiQ  reason: case insensitive filesystem */
public final class C19953WiQ implements Runnable {
    public final /* synthetic */ C263634Mt A00;

    public C19953WiQ(C263634Mt r1) {
        this.A00 = r1;
    }

    public final void run() {
        C263634Mt r1 = this.A00;
        AtomicLong atomicLong = C263634Mt.A0c;
        Object obj = r1.A0J;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
