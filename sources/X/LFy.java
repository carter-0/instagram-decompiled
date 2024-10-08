package X;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public final class LFy {
    public boolean A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final ReentrantLock A02 = new ReentrantLock();
    public final C62320sa A03;
    public final 0sP A04;

    public final void A00(Object obj) {
        C62320sa r0 = this.A03;
        boolean z = true;
        if (r0 != null && C51971G9r.A1b(r0)) {
            A02();
        }
        if (!this.A00) {
            ReentrantLock reentrantLock = this.A02;
            reentrantLock.lock();
            try {
                if (!this.A00) {
                    this.A01.add(obj);
                    z = false;
                }
                if (!z) {
                    return;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.A04.invoke(obj);
    }

    public final void A01(Object obj) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            this.A01.remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean A02() {
        boolean z = false;
        if (!this.A00) {
            ReentrantLock reentrantLock = this.A02;
            reentrantLock.lock();
            try {
                if (this.A00) {
                    return false;
                }
                z = true;
                this.A00 = true;
                List list = this.A01;
                List<Object> A0a = 00k.A0a(list);
                list.clear();
                reentrantLock.unlock();
                0sP r2 = this.A04;
                for (Object invoke : A0a) {
                    r2.invoke(invoke);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return z;
    }

    public LFy(C62320sa r2, 0sP r3) {
        this.A04 = r3;
        this.A03 = r2;
    }
}
