package X;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0T2  reason: invalid class name */
public abstract class AnonymousClass0T2 {
    public static 0T1 A00;
    public static final ReadWriteLock A01 = new ReentrantReadWriteLock();
    public static volatile boolean A02;

    public static void A00() {
        try {
            ReadWriteLock readWriteLock = A01;
            readWriteLock.readLock().lock();
            readWriteLock.readLock().unlock();
        } catch (Throwable th) {
            A01.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (A00 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01() {
        /*
            java.util.concurrent.locks.ReadWriteLock r2 = A01     // Catch:{ all -> 0x001b }
            java.util.concurrent.locks.Lock r0 = r2.readLock()     // Catch:{ all -> 0x001b }
            r0.lock()     // Catch:{ all -> 0x001b }
            boolean r0 = A02     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0012
            X.0T1 r0 = A00     // Catch:{ all -> 0x001b }
            r1 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.util.concurrent.locks.Lock r0 = r2.readLock()
            r0.unlock()
            return r1
        L_0x001b:
            r1 = move-exception
            java.util.concurrent.locks.ReadWriteLock r0 = A01
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0T2.A01():boolean");
    }
}
