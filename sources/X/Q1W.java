package X;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

public final class Q1W implements SurfaceTexture.OnFrameAvailableListener {
    public static final long A07 = TimeUnit.MILLISECONDS.toNanos(10000);
    public int A00 = 0;
    public long A01 = 0;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SurfaceTexture A05;
    public final Object A06 = Pxe.A0p();

    public final void A00() {
        RuntimeException runtimeException;
        if (!this.A02) {
            long nanoTime = System.nanoTime();
            long j = A07 + nanoTime;
            Object obj = this.A06;
            synchronized (obj) {
                while (!this.A04) {
                    if (nanoTime < j) {
                        try {
                            obj.wait(10000);
                            nanoTime = System.nanoTime();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            runtimeException = new RuntimeException(e);
                        }
                    } else {
                        runtimeException = new RuntimeException("Surface frame wait timed out");
                        throw runtimeException;
                    }
                }
                this.A04 = false;
                this.A00 = 0;
            }
            C345907uH.A02("before updateTexImage", new Object[0]);
            this.A05.updateTexImage();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        r2 = r4.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001d, code lost:
        if (r4.A03 == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001f, code lost:
        r4.A00++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        r4.A04 = true;
        r2.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        if (r4.A04 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        throw new java.lang.RuntimeException("mFrameAvailable already set, frame could be dropped");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFrameAvailable(android.graphics.SurfaceTexture r5) {
        /*
            r4 = this;
            boolean r0 = r4.A02
            r2 = 1
            monitor-enter(r4)
            if (r0 == 0) goto L_0x0011
            long r0 = r4.A01     // Catch:{ all -> 0x000e }
            long r0 = r0 + r2
            r4.A01 = r0     // Catch:{ all -> 0x000e }
            monitor-exit(r4)     // Catch:{ all -> 0x000e }
            return
        L_0x000e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x000e }
            throw r0
        L_0x0011:
            long r0 = r4.A01     // Catch:{ all -> 0x003c }
            long r0 = r0 + r2
            r4.A01 = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            java.lang.Object r2 = r4.A06
            monitor-enter(r2)
            boolean r0 = r4.A03     // Catch:{ all -> 0x0039 }
            r1 = 1
            if (r0 == 0) goto L_0x002c
            int r0 = r4.A00     // Catch:{ all -> 0x0039 }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ all -> 0x0039 }
        L_0x0025:
            r4.A04 = r1     // Catch:{ all -> 0x0039 }
            r2.notifyAll()     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
            goto L_0x0038
        L_0x002c:
            boolean r0 = r4.A04     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = "mFrameAvailable already set, frame could be dropped"
            X.TQ9 r0 = new X.TQ9     // Catch:{ all -> 0x0039 }
            r0.<init>(r1)     // Catch:{ all -> 0x0039 }
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0038:
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
            throw r0
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1W.onFrameAvailable(android.graphics.SurfaceTexture):void");
    }

    public Q1W(SurfaceTexture surfaceTexture) {
        this.A05 = surfaceTexture;
    }
}
