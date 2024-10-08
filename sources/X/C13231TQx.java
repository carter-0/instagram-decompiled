package X;

/* renamed from: X.TQx  reason: case insensitive filesystem */
public final class C13231TQx extends Thread {
    public C13231TQx() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.A09();
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0045 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
        L_0x0000:
            java.lang.Class<X.TZ6> r7 = X.TZ6.class
            monitor-enter(r7)     // Catch:{ InterruptedException -> 0x0000 }
            X.TZ6 r9 = X.TZ6.A03     // Catch:{ all -> 0x004f }
            X.TZ6 r3 = r9.A01     // Catch:{ all -> 0x004f }
            r8 = 0
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x004f }
            if (r3 != 0) goto L_0x0025
            long r0 = X.TZ6.A04     // Catch:{ all -> 0x004f }
            r7.wait(r0)     // Catch:{ all -> 0x004f }
            X.TZ6 r9 = X.TZ6.A03     // Catch:{ all -> 0x004f }
            X.TZ6 r0 = r9.A01     // Catch:{ all -> 0x004f }
            if (r0 != 0) goto L_0x0039
            long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x004f }
            long r3 = r3 - r10
            long r1 = X.TZ6.A05     // Catch:{ all -> 0x004f }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0039
            goto L_0x0042
        L_0x0025:
            long r5 = r3.A00     // Catch:{ all -> 0x004f }
            long r5 = r5 - r10
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r5 / r3
            long r3 = r3 * r1
            long r5 = r5 - r3
            int r0 = (int) r5     // Catch:{ all -> 0x004f }
            r7.wait(r1, r0)     // Catch:{ all -> 0x004f }
        L_0x0039:
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            goto L_0x0000
        L_0x003b:
            X.TZ6 r0 = r3.A01     // Catch:{ all -> 0x004f }
            r9.A01 = r0     // Catch:{ all -> 0x004f }
            r3.A01 = r8     // Catch:{ all -> 0x004f }
            goto L_0x0043
        L_0x0042:
            r3 = r9
        L_0x0043:
            if (r3 != r9) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            r3.A09()     // Catch:{ InterruptedException -> 0x0000 }
            goto L_0x0000
        L_0x004b:
            X.TZ6.A03 = r8     // Catch:{ all -> 0x004f }
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            return
        L_0x004f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13231TQx.run():void");
    }
}
