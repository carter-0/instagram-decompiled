package X;

/* renamed from: X.Iie  reason: case insensitive filesystem */
public final class C57923Iie implements Runnable {
    public final /* synthetic */ 26s A00;
    public final /* synthetic */ C256203vO A01;
    public final /* synthetic */ boolean A02;

    public C57923Iie(26s r1, C256203vO r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        r1 = r5.A02;
        r0 = r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r0.Dxq(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            X.26s r1 = r5.A00
            X.3vO r4 = r5.A01
            X.3WR r0 = r4.A07
            java.lang.String r3 = r0.A0G
            java.util.Map r2 = r1.A07
            monitor-enter(r2)
            boolean r0 = r2.containsKey(r3)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0040 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x0040 }
            r1 = 1
            if (r0 == 0) goto L_0x003e
            boolean r0 = r0.remove(r4)     // Catch:{ all -> 0x0040 }
            if (r0 != r1) goto L_0x003e
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0040 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0031
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0040 }
            if (r0 != r1) goto L_0x0031
            r2.remove(r3)     // Catch:{ all -> 0x0040 }
        L_0x0031:
            monitor-exit(r2)
            boolean r1 = r5.A02
            X.3vQ r0 = r4.A00()
            if (r0 == 0) goto L_0x003d
            r0.Dxq(r1)
        L_0x003d:
            return
        L_0x003e:
            monitor-exit(r2)
            return
        L_0x0040:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57923Iie.run():void");
    }
}
