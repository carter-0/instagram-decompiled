package X;

/* renamed from: X.4dt  reason: invalid class name and case insensitive filesystem */
public final class C268724dt extends C249903kY {
    public C268724dt(1T7 r2, 1T3 r3, Object obj) {
        super(r2, r3, obj, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r5 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r1 = r5.getClass().getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        X.0I1.A09("DefaultCloseableReference", r0, new java.lang.Object[]{r3, r2, r1});
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r1 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r1.EG8(r6, r7.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
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
            monitor-enter(r7)     // Catch:{ all -> 0x0049 }
            boolean r0 = r7.A00     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)     // Catch:{ all -> 0x0046 }
            return
        L_0x0007:
            monitor-exit(r7)     // Catch:{ all -> 0x0046 }
            X.3Lg r6 = r7.A02     // Catch:{ all -> 0x0049 }
            java.lang.Object r5 = r6.A01()     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = "DefaultCloseableReference"
            r0 = 2279(0x8e7, float:3.194E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0049 }
            int r1 = java.lang.System.identityHashCode(r7)     // Catch:{ all -> 0x0049 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0049 }
            int r1 = java.lang.System.identityHashCode(r6)     // Catch:{ all -> 0x0049 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0049 }
            if (r5 != 0) goto L_0x002a
            r1 = 0
            goto L_0x0032
        L_0x002a:
            java.lang.Class r1 = r5.getClass()     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0049 }
        L_0x0032:
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1}     // Catch:{ all -> 0x0049 }
            X.0I1.A09(r4, r0, r1)     // Catch:{ all -> 0x0049 }
            X.1T7 r1 = r7.A01     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0042
            java.lang.Throwable r0 = r7.A03     // Catch:{ all -> 0x0049 }
            r1.EG8(r6, r0)     // Catch:{ all -> 0x0049 }
        L_0x0042:
            r7.close()     // Catch:{ all -> 0x0049 }
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268724dt.finalize():void");
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return A03();
    }

    public C268724dt(1T7 r1, C240533Lg r2, Throwable th) {
        super(r1, r2, th);
    }
}
