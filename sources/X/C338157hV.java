package X;

/* renamed from: X.7hV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C338157hV implements Runnable {
    public final /* synthetic */ 2We A00;

    public /* synthetic */ C338157hV(2We r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = (X.C295015nP) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r0 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        X.2We.A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            X.2We r3 = r4.A00
            java.lang.Object r2 = r3.A0Z
            monitor-enter(r2)
            r0 = 0
            r3.A0G = r0     // Catch:{ all -> 0x0033 }
            java.util.Deque r0 = r3.A0D     // Catch:{ all -> 0x0033 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            return
        L_0x0012:
            java.util.Deque r0 = r3.A0D     // Catch:{ all -> 0x0033 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0033 }
            java.util.ArrayDeque r0 = new java.util.ArrayDeque     // Catch:{ all -> 0x0033 }
            r0.<init>()     // Catch:{ all -> 0x0033 }
            r3.A0D = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
        L_0x0020:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r1.next()
            X.5nP r0 = (X.C295015nP) r0
            if (r0 == 0) goto L_0x0020
            X.2We.A0A(r0)
            goto L_0x0020
        L_0x0032:
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C338157hV.run():void");
    }
}
