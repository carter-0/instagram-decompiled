package X;

/* renamed from: X.8nU  reason: invalid class name and case insensitive filesystem */
public final class C365668nU implements C365558nJ {
    public boolean A00 = false;
    public final C365578nL A01;
    public final /* synthetic */ 2JF A02;

    public C365668nU(C365578nL r2, 2JF r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r11.A0E() == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r11.A06() != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r7 = new java.util.ArrayList();
        r6 = r10.A01;
        r8 = r6.A01;
        r9 = r8.A02;
        r3 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r3.hasNext() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (X.0g7.A00().A01(X.0gR.A00((java.lang.String) r3.next())) != X.AnonymousClass05K.A0C) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r7.add(java.lang.Boolean.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r11.A05() == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r4 = r11.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        X.0KC.A0N("GooglePlayDownloader", "Play Core returned an successful task but null result found. modules:%s usecase:%s modulelocalstate:%s", r4, new java.lang.Object[]{r9.toString(), X.AnonymousClass9NW.A00(r8.A01), r7.toString()});
        r11.A05();
        r6.A00.A00(new java.lang.RuntimeException("Play Core returned an successful task but null result found."));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        r4 = new java.lang.RuntimeException("No download exception found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r11.A06().equals(0) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        r3 = r10.A01.A00;
        r0 = new X.AnonymousClass94A((java.lang.Exception) null, (java.lang.Integer) null, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r3.A0C.put((java.lang.Integer) r11.A06(), r10.A01);
        r3.A02 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
        r1 = r11.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        if ((r1 instanceof X.C8359QpH) == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c1, code lost:
        r1 = ((X.RKT) r1).A00.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
        r3 = r10.A01.A00;
        r2 = r11.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        if (r1 != 0) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d1, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d2, code lost:
        r0 = new X.AnonymousClass94A(r2, r1, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d7, code lost:
        r3.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00db, code lost:
        r1 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e0, code lost:
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D59(X.AnonymousClass9GD r11) {
        /*
            r10 = this;
            X.2JF r3 = r10.A02
            monitor-enter(r3)
            boolean r0 = r10.A00     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r3)     // Catch:{ all -> 0x00e2 }
            return
        L_0x0009:
            r5 = 1
            r10.A00 = r5     // Catch:{ all -> 0x00e2 }
            monitor-exit(r3)     // Catch:{ all -> 0x00e2 }
            boolean r0 = r11.A0E()
            r4 = 2
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r1 = r11.A06()
            r0 = 0
            if (r1 != 0) goto L_0x008b
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.8nL r6 = r10.A01
            X.8nC r8 = r6.A01
            java.util.Set r9 = r8.A02
            java.util.Iterator r3 = r9.iterator()
        L_0x002a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            X.0g7 r1 = X.0g7.A00()
            int r0 = X.0gR.A00(r0)
            java.lang.Integer r2 = r1.A01(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 0
            if (r2 != r1) goto L_0x0048
            r0 = 1
        L_0x0048:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.add(r0)
            goto L_0x002a
        L_0x0050:
            java.lang.String r5 = "GooglePlayDownloader"
            java.lang.Exception r0 = r11.A05()
            if (r0 == 0) goto L_0x0083
            java.lang.Exception r4 = r11.A05()
        L_0x005c:
            java.lang.String r3 = "Play Core returned an successful task but null result found. modules:%s usecase:%s modulelocalstate:%s"
            java.lang.String r2 = r9.toString()
            java.lang.Integer r0 = r8.A01
            java.lang.String r1 = X.AnonymousClass9NW.A00(r0)
            java.lang.String r0 = r7.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r1, r0}
            X.0KC.A0N(r5, r3, r4, r0)
            r11.A05()
            X.PyE r2 = r6.A00
            java.lang.String r1 = "Play Core returned an successful task but null result found."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            r2.A00(r0)
            return
        L_0x0083:
            java.lang.String r0 = "No download exception found"
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r0)
            goto L_0x005c
        L_0x008b:
            java.lang.Object r1 = r11.A06()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a4
            X.8nL r0 = r10.A01
            X.PyE r3 = r0.A00
            r1 = 0
            X.94A r0 = new X.94A
            r0.<init>(r1, r1, r5)
            goto L_0x00d7
        L_0x00a4:
            monitor-enter(r3)
            java.util.Map r2 = r3.A0C     // Catch:{ all -> 0x00b6 }
            java.lang.Object r1 = r11.A06()     // Catch:{ all -> 0x00b6 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x00b6 }
            X.8nL r0 = r10.A01     // Catch:{ all -> 0x00b6 }
            r2.put(r1, r0)     // Catch:{ all -> 0x00b6 }
            r3.A02 = r5     // Catch:{ all -> 0x00b6 }
            monitor-exit(r3)     // Catch:{ all -> 0x00b6 }
            return
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b6 }
            throw r0
        L_0x00b9:
            java.lang.Exception r1 = r11.A05()
            boolean r0 = r1 instanceof X.C8359QpH
            if (r0 == 0) goto L_0x00e0
            X.RKT r1 = (X.RKT) r1
            com.google.android.gms.common.api.Status r0 = r1.A00
            int r1 = r0.A00
        L_0x00c7:
            X.8nL r0 = r10.A01
            X.PyE r3 = r0.A00
            java.lang.Exception r2 = r11.A05()
            if (r1 != 0) goto L_0x00db
            r1 = 0
        L_0x00d2:
            X.94A r0 = new X.94A
            r0.<init>(r2, r1, r4)
        L_0x00d7:
            r3.A01(r0)
            return
        L_0x00db:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00d2
        L_0x00e0:
            r1 = 0
            goto L_0x00c7
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365668nU.D59(X.9GD):void");
    }
}
