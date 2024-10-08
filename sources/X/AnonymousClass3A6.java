package X;

/* renamed from: X.3A6  reason: invalid class name */
public final class AnonymousClass3A6 implements AnonymousClass392 {
    public final C251983oI A00;
    public final 1Vg A01;
    public final 1Vg A02;
    public final 1Vf A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.3u2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C255383u2 C3e(X.C255373u1 r8) {
        /*
            r7 = this;
            r5 = 1
            java.lang.String r4 = r8.A01
            int r3 = r8.A00
            java.lang.String r1 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r2 = 2
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r6 = X.1Wa.A00(r1, r2)
            r6.ADh(r5, r4)
            long r0 = (long) r3
            r6.ADa(r2, r0)
            X.3oI r0 = r7.A00
            r0.assertNotSuspendingTransaction()
            r5 = 0
            android.database.Cursor r4 = r0.query((X.AnonymousClass1WA) r6, (android.os.CancellationSignal) r5)
            java.lang.String r0 = "work_spec_id"
            int r3 = X.1Wd.A01(r4, r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "generation"
            int r2 = X.1Wd.A01(r4, r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "system_id"
            int r1 = X.1Wd.A01(r4, r0)     // Catch:{ all -> 0x0056 }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x004f
            boolean r0 = r4.isNull(r3)     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0041
            java.lang.String r5 = r4.getString(r3)     // Catch:{ all -> 0x0056 }
        L_0x0041:
            int r2 = r4.getInt(r2)     // Catch:{ all -> 0x0056 }
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x0056 }
            X.3u2 r0 = new X.3u2     // Catch:{ all -> 0x0056 }
            r0.<init>(r5, r2, r1)     // Catch:{ all -> 0x0056 }
            r5 = r0
        L_0x004f:
            r4.close()
            r6.A00()
            return r5
        L_0x0056:
            r0 = move-exception
            r4.close()
            r6.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3A6.C3e(X.3u1):X.3u2");
    }

    public final void CNX(C255383u2 r3) {
        C251983oI r1 = this.A00;
        r1.assertNotSuspendingTransaction();
        r1.beginTransaction();
        try {
            this.A03.insert(r3);
            r1.setTransactionSuccessful();
        } finally {
            r1.endTransaction();
        }
    }

    public AnonymousClass3A6(C251983oI r2) {
        this.A00 = r2;
        this.A03 = new AnonymousClass3A7(r2, this);
        this.A01 = new AnonymousClass3A8(r2, this);
        this.A02 = new AnonymousClass3A9(r2, this);
    }
}
