package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.TFs  reason: case insensitive filesystem */
public final class C12959TFs implements Runnable {
    public final /* synthetic */ C12143Sno A00;
    public final /* synthetic */ C2602244t A01;

    public C12959TFs(C12143Sno sno, C2602244t r2) {
        this.A00 = sno;
        this.A01 = r2;
    }

    public final void run() {
        C12143Sno sno = this.A00;
        if (sno.A00.compareAndSet(true, false)) {
            C2602244t r2 = this.A01;
            try {
                ReentrantReadWriteLock reentrantReadWriteLock = r2.A04;
                reentrantReadWriteLock.writeLock().lock();
                r2.A03.remove(sno);
                reentrantReadWriteLock.writeLock().unlock();
                sno.onTimeout(sno.A01, false);
            } catch (Throwable th) {
                r2.A04.writeLock().unlock();
                throw th;
            }
        }
    }
}
