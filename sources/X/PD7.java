package X;

public final class PD7 implements AnonymousClass1cS {
    public final AnonymousClass0eK A00;

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r1.equals(r0) == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r0 = (X.Mf0) r11.A00.get();
        r3 = r13.A05;
        r2 = r13.A05;
        r1 = false;
        X.0qQ.A0B(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        r0.A00.A01(r3, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r1.equals(r0) == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r4 = r13.A05;
        r8 = r13.A05;
        r3 = r13.A01;
        r2 = r13.A02;
        X.0qQ.A0B(r4, 0);
        r1 = ((X.Mf0) r11.A00.get()).A00;
        r9 = X.JTR.A0N(java.util.concurrent.TimeUnit.DAYS);
        r5 = new X.C70704OGz(r1.A00, new X.N4R(r3, r2, 45), r8, r9);
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0083, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.put(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        throw X.DbW.A0c("Invalid lifecycleState: ", r1);
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void DTJ(X.C74248Prc r12, X.AnonymousClass1OR r13) {
        /*
            r11 = this;
            X.MaP r12 = (X.C66656MaP) r12
            java.lang.String r1 = r12.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x004f;
                case -948696717: goto L_0x004c;
                case 1501196714: goto L_0x002e;
                case 1563991648: goto L_0x0015;
                case 1885454214: goto L_0x0012;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r1 = X.DbW.A0c(r0, r1)
            throw r1
        L_0x0012:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x0030
        L_0x0015:
            java.lang.String r0 = "uploaded"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.0eK r0 = r11.A00
            java.lang.Object r0 = r0.get()
            X.Mf0 r0 = (X.Mf0) r0
            java.lang.String r3 = r13.A05
            java.lang.String r2 = r13.A05
            boolean r1 = X.JTQ.A1X(r3)
            goto L_0x0046
        L_0x002e:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x0030:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.0eK r0 = r11.A00
            java.lang.Object r0 = r0.get()
            X.Mf0 r0 = (X.Mf0) r0
            java.lang.String r3 = r13.A05
            java.lang.String r2 = r13.A05
            r1 = 0
            X.0qQ.A0B(r3, r1)
        L_0x0046:
            X.Mez r0 = r0.A00
            r0.A01(r3, r2, r1)
            return
        L_0x004c:
            java.lang.String r0 = "queued"
            goto L_0x0051
        L_0x004f:
            java.lang.String r0 = "executing"
        L_0x0051:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.0eK r0 = r11.A00
            java.lang.Object r1 = r0.get()
            X.Mf0 r1 = (X.Mf0) r1
            java.lang.String r4 = r13.A05
            java.lang.String r8 = r13.A05
            java.lang.Integer r3 = r13.A01
            java.lang.Integer r2 = r13.A02
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.Mez r1 = r1.A00
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r9 = X.JTR.A0N(r0)
            r0 = 45
            X.N4R r7 = new X.N4R
            r7.<init>((java.lang.Integer) r3, (java.lang.Integer) r2, (int) r0)
            X.0nE r6 = r1.A00
            X.OGz r5 = new X.OGz
            r5.<init>(r6, r7, r8, r9)
            java.util.Map r0 = r1.A01
            monitor-enter(r0)
            r0.put(r4, r5)     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            return
        L_0x0089:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PD7.DTJ(X.Prc, X.1OR):void");
    }

    public final /* bridge */ /* synthetic */ void DTN(1OS r2, C74248Prc prc) {
        throw AnonymousClass7TE.A0z("Cancellations are unsupported");
    }

    public final /* bridge */ /* synthetic */ void DTO(1OS r1, C74248Prc prc, C74248Prc prc2) {
        DTJ(prc2, (AnonymousClass1OR) r1);
    }

    public PD7(AnonymousClass0eK r1) {
        this.A00 = r1;
    }
}
