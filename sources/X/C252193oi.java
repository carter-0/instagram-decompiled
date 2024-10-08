package X;

import java.util.concurrent.locks.LockSupport;

/* renamed from: X.3oi  reason: invalid class name and case insensitive filesystem */
public final class C252193oi extends AnonymousClass4D9 {
    public final C262144Ch A00;
    public final Thread A01;

    public C252193oi(Thread thread, C262094Cc r3, C262144Ch r4) {
        super(r3, true, true);
        this.A01 = thread;
        this.A00 = r4;
    }

    public final void A0I(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.A01;
        if (!0qQ.A0K(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
