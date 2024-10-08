package X;

/* renamed from: X.3pZ  reason: invalid class name and case insensitive filesystem */
public final class C252723pZ implements Runnable {
    public final /* synthetic */ C252713pY A00;

    public C252723pZ(C252713pY r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5 = new java.util.ArrayList();
        r9 = new java.util.ArrayList();
        r13 = r3.A01.now();
        r12 = r6.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r12.hasNext() == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r0 = (java.util.Map.Entry) r12.next();
        r8 = r0.getKey();
        r7 = (com.facebook.common.memory.leaklistener.core.KeyedWeakReference) r0.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if ((r13 - r7.mTimestamp) <= com.facebook.proxygen.LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r7.mCanary.get() != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        r8.toString();
        r5.add(r7);
        r9.add(new java.lang.ref.WeakReference(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        r8.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        r1 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r1.hasNext() == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        r0 = ((java.lang.ref.WeakReference) r1.next()).get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        if (r0 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        r6.remove(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (r3.A00 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r5.isEmpty() != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        r2 = X.2QF.A00().A09().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        if (r2.hasNext() == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
        r1 = (X.C257473xS) r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c0, code lost:
        if (r1.isEnabled() == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        r1.onLeaksDetected(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c6, code lost:
        r0 = X.2QF.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ca, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cb, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cc, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r3.A03 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cf, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            java.lang.Class<X.3pY> r1 = X.C252713pY.class
            java.lang.String r0 = "Detecting leaks"
            X.0KC.A03(r1, r0)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.runFinalization()
            X.3pY r3 = r15.A00
            monitor-enter(r3)
            java.util.WeakHashMap r6 = r3.A02     // Catch:{ all -> 0x00d7 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x00d7 }
            r4 = 0
            if (r0 == 0) goto L_0x002a
            r3.A03 = r4     // Catch:{ all -> 0x00d7 }
            monitor-exit(r3)     // Catch:{ all -> 0x00d7 }
            return
        L_0x002a:
            monitor-exit(r3)     // Catch:{ all -> 0x00d7 }
            monitor-enter(r3)
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00d4 }
            r5.<init>()     // Catch:{ all -> 0x00d4 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00d4 }
            r9.<init>()     // Catch:{ all -> 0x00d4 }
            X.0JR r0 = r3.A01     // Catch:{ all -> 0x00d4 }
            long r13 = r0.now()     // Catch:{ all -> 0x00d4 }
            java.util.Set r0 = r6.entrySet()     // Catch:{ all -> 0x00d4 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x00d4 }
        L_0x0044:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x00d4 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x00d4 }
            java.lang.Object r8 = r0.getKey()     // Catch:{ all -> 0x00d4 }
            java.lang.Object r7 = r0.getValue()     // Catch:{ all -> 0x00d4 }
            com.facebook.common.memory.leaklistener.core.KeyedWeakReference r7 = (com.facebook.common.memory.leaklistener.core.KeyedWeakReference) r7     // Catch:{ all -> 0x00d4 }
            long r0 = r7.mTimestamp     // Catch:{ all -> 0x00d4 }
            long r10 = r13 - r0
            r1 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x007b
            java.lang.ref.WeakReference r0 = r7.mCanary     // Catch:{ all -> 0x00d4 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00d4 }
            if (r0 != 0) goto L_0x007b
            r8.toString()     // Catch:{ all -> 0x00d4 }
            r5.add(r7)     // Catch:{ all -> 0x00d4 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00d4 }
            r0.<init>(r8)     // Catch:{ all -> 0x00d4 }
            r9.add(r0)     // Catch:{ all -> 0x00d4 }
            goto L_0x0044
        L_0x007b:
            r8.toString()     // Catch:{ all -> 0x00d4 }
            goto L_0x0044
        L_0x007f:
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x00d4 }
        L_0x0083:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00d4 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x00d4 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x0083
            r6.remove(r0)     // Catch:{ all -> 0x00d4 }
            goto L_0x0083
        L_0x0099:
            monitor-exit(r3)
            X.3pX r0 = r3.A00
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00cc
            X.2QF r0 = X.2QF.A00()
            java.util.List r0 = r0.A09()
            java.util.Iterator r2 = r0.iterator()
        L_0x00b0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r1 = r2.next()
            X.3xS r1 = (X.C257473xS) r1
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x00b0
            r1.onLeaksDetected(r5)
            goto L_0x00b0
        L_0x00c6:
            X.2QF r0 = X.2QF.A00()
            monitor-enter(r0)
            monitor-exit(r0)
        L_0x00cc:
            monitor-enter(r3)
            r3.A03 = r4     // Catch:{ all -> 0x00d1 }
            monitor-exit(r3)     // Catch:{ all -> 0x00d1 }
            return
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00d1 }
            throw r0
        L_0x00d4:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00d7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252723pZ.run():void");
    }
}
