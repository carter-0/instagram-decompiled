package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.2mV  reason: invalid class name and case insensitive filesystem */
public final class C228892mV implements Runnable {
    public final /* synthetic */ C277144uZ A00;
    public final /* synthetic */ 11W A01;
    public final /* synthetic */ AnonymousClass1GR A02;
    public final /* synthetic */ String A03;

    public C228892mV(C277144uZ r1, 11W r2, AnonymousClass1GR r3, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
    }

    public final void run() {
        C277144uZ r4 = this.A00;
        if (r4 != null) {
            r4.A00();
        }
        11W r3 = this.A01;
        ReentrantLock reentrantLock = r3.A01;
        reentrantLock.lock();
        if (r4 != null) {
            try {
                r4.A02();
            } catch (Throwable th) {
                reentrantLock.unlock();
                if (r4 != null) {
                    r4.A01();
                }
                throw th;
            }
        }
        AnonymousClass1GR r1 = this.A02;
        11W.A00(r3, r1, this.A03);
        r3.A00.A02(r1);
        reentrantLock.unlock();
        if (r4 != null) {
            r4.A01();
        }
    }
}
