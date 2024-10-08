package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9kc  reason: invalid class name and case insensitive filesystem */
public final class C386449kc extends 0ng {
    public final /* synthetic */ C258803zf A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386449kc(C258803zf r4) {
        super(364579106, 3, false, false);
        this.A00 = r4;
    }

    public final void run() {
        C39893ADv aDv = (C39893ADv) this.A00.A01.getValue();
        ReentrantLock reentrantLock = aDv.A02;
        reentrantLock.lock();
        try {
            if (aDv.A00 == null) {
                aDv.A01();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
