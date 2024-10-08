package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9Rw  reason: invalid class name and case insensitive filesystem */
public final class C378959Rw {
    public int A00 = 0;
    public final ReentrantLock A01 = new ReentrantLock();

    public final boolean A00() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            boolean z = true;
            if ((this.A00 & 1) != 1) {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean A01() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            return AnonymousClass7TF.A1Q(this.A00);
        } finally {
            reentrantLock.unlock();
        }
    }
}
