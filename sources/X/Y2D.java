package X;

public final /* synthetic */ class Y2D implements Runnable {
    public final /* synthetic */ Xo0 A00;

    public /* synthetic */ Y2D(Xo0 xo0) {
        this.A00 = xo0;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.TPe] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r8 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C11256SHq.A00(r3, r8, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if ((r7 instanceof X.XZY) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        r1 = ((X.XZY) r7).A00;
        r0 = new java.lang.Object();
        r0.A0D(com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage.MAX_ENTRIES);
        r1.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C11256SHq.A00(r3, r0.A08(), 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r3.A00 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r5 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        r0 = (X.Y7C) r4.A0L;
        r0.A00.scheduleCallback(new X.C22382Y1l(r0), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r0 = new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        r3.A00 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0093, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0097, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        X.SUS.A09(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            X.Xo0 r4 = r10.A00
        L_0x0002:
            monitor-enter(r4)     // Catch:{ IOException -> 0x009c }
            boolean r0 = r4.A0D     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x0092
            X.SHq r3 = r4.A0A     // Catch:{ all -> 0x0094 }
            java.util.ArrayDeque r0 = r4.A0I     // Catch:{ all -> 0x0094 }
            java.lang.Object r8 = r0.poll()     // Catch:{ all -> 0x0094 }
            X.TAH r8 = (X.TAH) r8     // Catch:{ all -> 0x0094 }
            r1 = -1
            r7 = 0
            if (r8 != 0) goto L_0x0046
            java.util.ArrayDeque r0 = r4.A0H     // Catch:{ all -> 0x0094 }
            java.lang.Object r9 = r0.poll()     // Catch:{ all -> 0x0094 }
            boolean r0 = r9 instanceof X.XZY     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0040
            int r0 = r4.A00     // Catch:{ all -> 0x0094 }
            if (r0 == r1) goto L_0x002d
            X.Y1F r5 = r4.A08     // Catch:{ all -> 0x0094 }
            r4.A08 = r7     // Catch:{ all -> 0x0094 }
            java.util.concurrent.ScheduledExecutorService r0 = r4.A05     // Catch:{ all -> 0x0094 }
            r0.shutdown()     // Catch:{ all -> 0x0094 }
            goto L_0x0044
        L_0x002d:
            java.util.concurrent.ScheduledExecutorService r6 = r4.A05     // Catch:{ all -> 0x0094 }
            X.Y2E r5 = new X.Y2E     // Catch:{ all -> 0x0094 }
            r5.<init>(r4)     // Catch:{ all -> 0x0094 }
            r1 = 60000(0xea60, double:2.9644E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0094 }
            java.util.concurrent.ScheduledFuture r0 = r6.schedule(r5, r1, r0)     // Catch:{ all -> 0x0094 }
            r4.A06 = r0     // Catch:{ all -> 0x0094 }
            goto L_0x0043
        L_0x0040:
            if (r9 != 0) goto L_0x0043
            goto L_0x0092
        L_0x0043:
            r5 = r7
        L_0x0044:
            r7 = r9
            goto L_0x0047
        L_0x0046:
            r5 = r7
        L_0x0047:
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
            if (r8 == 0) goto L_0x0050
            r0 = 10
            X.C11256SHq.A00(r3, r8, r0)     // Catch:{ all -> 0x0097 }
            goto L_0x0083
        L_0x0050:
            boolean r0 = r7 instanceof X.XZY     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0088
            X.XZY r7 = (X.XZY) r7     // Catch:{ all -> 0x0097 }
            r2 = 1000(0x3e8, float:1.401E-42)
            X.TAH r1 = r7.A00     // Catch:{ all -> 0x0097 }
            X.TPe r0 = new X.TPe     // Catch:{ all -> 0x0097 }
            r0.<init>()     // Catch:{ all -> 0x0097 }
            r0.A0D(r2)     // Catch:{ all -> 0x0097 }
            r1.A0B(r0)     // Catch:{ all -> 0x0097 }
            X.TAH r2 = r0.A08()     // Catch:{ all -> 0x0097 }
            r0 = 8
            r1 = 1
            X.C11256SHq.A00(r3, r2, r0)     // Catch:{ all -> 0x008e }
            r3.A00 = r1     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x0083
            X.XTa r0 = r4.A0L     // Catch:{ all -> 0x0097 }
            X.Y7C r0 = (X.Y7C) r0     // Catch:{ all -> 0x0097 }
            com.facebook.react.devsupport.CxxInspectorPackagerConnection$DelegateImpl r3 = r0.A00     // Catch:{ all -> 0x0097 }
            X.Y1l r2 = new X.Y1l     // Catch:{ all -> 0x0097 }
            r2.<init>(r0)     // Catch:{ all -> 0x0097 }
            r0 = 0
            r3.scheduleCallback(r2, r0)     // Catch:{ all -> 0x0097 }
        L_0x0083:
            X.SUS.A09(r5)     // Catch:{ IOException -> 0x009c }
            goto L_0x0002
        L_0x0088:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0097 }
            r0.<init>()     // Catch:{ all -> 0x0097 }
            goto L_0x0091
        L_0x008e:
            r0 = move-exception
            r3.A00 = r1     // Catch:{ all -> 0x0097 }
        L_0x0091:
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x0092:
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
            return
        L_0x0094:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
            goto L_0x009b
        L_0x0097:
            r0 = move-exception
            X.SUS.A09(r5)     // Catch:{ IOException -> 0x009c }
        L_0x009b:
            throw r0     // Catch:{ IOException -> 0x009c }
        L_0x009c:
            r0 = move-exception
            r4.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y2D.run():void");
    }
}
