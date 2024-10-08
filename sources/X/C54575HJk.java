package X;

import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.HJk  reason: case insensitive filesystem */
public abstract class C54575HJk extends C52009GBg {
    public final int A0c() {
        int i;
        C51983GAg gAg = (C51983GAg) this;
        if (gAg instanceof C52354GOy) {
            C52354GOy gOy = (C52354GOy) gAg;
            ReentrantReadWriteLock.ReadLock A08 = C52009GBg.A08(gOy);
            try {
                return gOy.A00;
            } finally {
                A08.unlock();
            }
        } else if (!(gAg instanceof C52347GOr)) {
            return gAg.A00;
        } else {
            synchronized (gAg) {
                i = gAg.A00;
            }
            return i;
        }
    }

    public abstract List A0d(Set set);

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0e(int r7) {
        /*
            r6 = this;
            r5 = r6
            X.GAg r5 = (X.C51983GAg) r5
            boolean r0 = r5 instanceof X.C52347GOr
            if (r0 == 0) goto L_0x000f
            monitor-enter(r5)
            r5.A00 = r7     // Catch:{ all -> 0x000c }
            monitor-exit(r5)
            return
        L_0x000c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x000f:
            boolean r0 = r5 instanceof X.C52354GOy
            if (r0 == 0) goto L_0x0050
            X.GOy r5 = (X.C52354GOy) r5
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x002f
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0027:
            if (r0 >= r2) goto L_0x0030
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0027
        L_0x002f:
            r2 = 0
        L_0x0030:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            r5.A00 = r7     // Catch:{ all -> 0x0037 }
            goto L_0x0044
        L_0x0037:
            r0 = move-exception
        L_0x0038:
            if (r3 >= r2) goto L_0x0040
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0040:
            r1.unlock()
            throw r0
        L_0x0044:
            if (r3 >= r2) goto L_0x004c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0044
        L_0x004c:
            r1.unlock()
            return
        L_0x0050:
            r5.A00 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54575HJk.A0e(int):void");
    }

    public abstract void A0f(C267324bN r1, boolean z);

    public abstract void A0g(C267324bN r1, boolean z);
}
