package X;

/* renamed from: X.4NC  reason: invalid class name */
public final class AnonymousClass4NC implements Runnable {
    public final /* synthetic */ AnonymousClass4NB A00;

    public AnonymousClass4NC(AnonymousClass4NB r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if ((r4 - r6.A05) <= 1000) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            X.4NB r6 = r9.A00
            long r4 = android.os.SystemClock.elapsedRealtime()
            monitor-enter(r6)
            long r7 = r6.A04     // Catch:{ all -> 0x003f }
            r1 = -1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0022
            long r7 = r6.A04     // Catch:{ all -> 0x003f }
            long r1 = r4 - r7
            r7 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            long r0 = r6.A05     // Catch:{ all -> 0x003f }
            long r2 = r4 - r0
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            monitor-exit(r6)
            if (r0 == 0) goto L_0x003e
            java.lang.String r3 = "BackscreenDetector"
            java.lang.String r2 = "detected blackscreen. Last frame ms: "
            long r0 = r6.A05
            long r4 = r4 - r0
            java.lang.String r0 = X.002.A0Q(r2, r4)
            android.util.Log.w(r3, r0)
            X.4NA r0 = r6.A00
            X.4Ms r0 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0M
            r0 = 1
            r1.set(r0)
        L_0x003e:
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4NC.run():void");
    }
}
