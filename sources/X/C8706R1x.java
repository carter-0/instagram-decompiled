package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.R1x  reason: case insensitive filesystem */
public final class C8706R1x extends C258513zC {
    public int A00 = 0;
    public boolean A01 = false;
    public final Object A02 = Pxe.A0p();

    private void A00() {
        Object obj = this.A02;
        synchronized (obj) {
            int i = this.A00 - 1;
            this.A00 = i;
            if (i == 0) {
                obj.notifyAll();
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.A02) {
            if (!this.A01) {
                this.A00++;
            } else {
                throw new RejectedExecutionException("Executor already shutdown");
            }
        }
        try {
            runnable.run();
        } finally {
            A00();
        }
    }

    public final boolean isShutdown() {
        boolean z;
        synchronized (this.A02) {
            z = this.A01;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r3.A00 != 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isTerminated() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A02
            monitor-enter(r2)
            boolean r0 = r3.A01     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x000c
            int r1 = r3.A00     // Catch:{ all -> 0x000f }
            r0 = 1
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8706R1x.isTerminated():boolean");
    }

    public final void shutdown() {
        Object obj = this.A02;
        synchronized (obj) {
            this.A01 = true;
            if (this.A00 == 0) {
                obj.notifyAll();
            }
        }
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        boolean z;
        long nanos = timeUnit.toNanos(j);
        Object obj = this.A02;
        synchronized (obj) {
            while (true) {
                if (this.A01 && this.A00 == 0) {
                    z = true;
                    break;
                } else if (nanos <= 0) {
                    z = false;
                    break;
                } else {
                    long nanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(obj, nanos);
                    nanos -= System.nanoTime() - nanoTime;
                }
            }
        }
        return z;
    }

    public final List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
