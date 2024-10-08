package X;

/* renamed from: X.UHu  reason: case insensitive filesystem */
public final class C14976UHu extends C249903kY {
    public C14976UHu(1T7 r2, 1T3 r3, Object obj) {
        super(r2, r3, obj, true);
    }

    public final C249903kY A03() {
        return this;
    }

    public final void close() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r5 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r1 = X.C66581MXm.A0y(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        X.0I1.A09("FinalizerCloseableReference", r0, new java.lang.Object[]{r3, r2, r1});
        r6.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r6 = r7.A02;
        r5 = r6.A01();
        r0 = X.AnonymousClass000.A00(2279);
        r3 = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r7));
        r2 = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r6));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finalize() {
        /*
            r7 = this;
            monitor-enter(r7)     // Catch:{ all -> 0x003c }
            boolean r0 = r7.A00     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)     // Catch:{ all -> 0x0039 }
            return
        L_0x0007:
            monitor-exit(r7)     // Catch:{ all -> 0x0039 }
            X.3Lg r6 = r7.A02     // Catch:{ all -> 0x003c }
            java.lang.Object r5 = r6.A01()     // Catch:{ all -> 0x003c }
            java.lang.String r4 = "FinalizerCloseableReference"
            r0 = 2279(0x8e7, float:3.194E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x003c }
            int r1 = java.lang.System.identityHashCode(r7)     // Catch:{ all -> 0x003c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x003c }
            int r1 = java.lang.System.identityHashCode(r6)     // Catch:{ all -> 0x003c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x003c }
            if (r5 != 0) goto L_0x002a
            r1 = 0
            goto L_0x002e
        L_0x002a:
            java.lang.String r1 = X.C66581MXm.A0y(r5)     // Catch:{ all -> 0x003c }
        L_0x002e:
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1}     // Catch:{ all -> 0x003c }
            X.0I1.A09(r4, r0, r1)     // Catch:{ all -> 0x003c }
            r6.A02()     // Catch:{ all -> 0x003c }
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0039 }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14976UHu.finalize():void");
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return this;
    }
}
