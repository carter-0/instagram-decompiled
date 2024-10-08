package X;

/* renamed from: X.8dm  reason: invalid class name and case insensitive filesystem */
public final class C359968dm implements C359978dn {
    public C360008dq A00;
    public final C359928di A01;

    public final void A9V(C360008dq r6) {
        C360008dq r0;
        Object obj;
        synchronized (this) {
            r0 = this.A00;
            this.A00 = r6;
        }
        if (r0 == null) {
            C359908dg r4 = ((C359918dh) this.A01).A00;
            synchronized (r4) {
                obj = r4.A00;
            }
            1Kg.A02("DataSynchronizer_sendInitial");
            try {
                C360018dr r1 = (C360018dr) obj;
                if (r1 != null) {
                    synchronized (this) {
                        C360008dq r02 = this.A00;
                        if (r02 != null) {
                            r02.DfA(r1);
                        }
                    }
                }
                1Kg.A01();
                C359888de r2 = r4.A02;
                if (r2.CYP()) {
                    C359908dg.A00(this, r4, obj);
                } else {
                    r2.E3G(new C360028ds(this, r4, obj), "DataSynchronizer_setDataObserver");
                }
            } catch (Throwable th) {
                1Kg.A01();
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r0.remove(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r2.E3G(new X.AnonymousClass9P3(r4, r3), "DataSynchronizer_removeDataObserver");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r3 = ((X.C359918dh) r4.A01).A00;
        r2 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r2.CYP() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EEE(X.C360008dq r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            X.8dq r0 = r4.A00     // Catch:{ all -> 0x002c }
            if (r0 == r5) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x002c }
            return
        L_0x0007:
            r0 = 0
            r4.A00 = r0     // Catch:{ all -> 0x002c }
            monitor-exit(r4)     // Catch:{ all -> 0x002c }
            X.8di r0 = r4.A01
            X.8dh r0 = (X.C359918dh) r0
            X.8dg r3 = r0.A00
            X.8de r2 = r3.A02
            boolean r0 = r2.CYP()
            if (r0 == 0) goto L_0x0021
            java.util.List r0 = r3.A01
            if (r0 == 0) goto L_0x0020
            r0.remove(r4)
        L_0x0020:
            return
        L_0x0021:
            X.9P3 r1 = new X.9P3
            r1.<init>(r4, r3)
            java.lang.String r0 = "DataSynchronizer_removeDataObserver"
            r2.E3G(r1, r0)
            return
        L_0x002c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359968dm.EEE(X.8dq):void");
    }

    public final void EB8() {
        this.A01.A03(1);
    }

    public final void destroy() {
        this.A01.A02();
    }

    public C359968dm(C359928di r1) {
        this.A01 = r1;
    }
}
