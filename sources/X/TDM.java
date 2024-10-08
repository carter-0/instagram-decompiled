package X;

import java.util.concurrent.locks.Lock;

public final class TDM implements Runnable {
    public final /* synthetic */ C12553Sxe A00;

    public TDM(C12553Sxe sxe) {
        this.A00 = sxe;
    }

    public final void run() {
        C12553Sxe sxe = this.A00;
        Lock lock = sxe.A0B;
        lock.lock();
        try {
            C12553Sxe.A02(sxe);
        } finally {
            lock.unlock();
        }
    }
}
