package X;

public final class NRf extends 0ng {
    public final /* synthetic */ C290675fi A00;
    public final /* synthetic */ String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (X.0qQ.A0K(r1.A03, r6.A01) != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            X.5fi r4 = r6.A00     // Catch:{ InterruptedException -> 0x0063 }
            X.5fg r1 = r4.A02     // Catch:{ InterruptedException -> 0x0063 }
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r1.A00     // Catch:{ InterruptedException -> 0x0063 }
            boolean r0 = X.C66582MXn.A1V(r3)     // Catch:{ InterruptedException -> 0x0063 }
            if (r0 == 0) goto L_0x0057
            r1.A00()     // Catch:{ all -> 0x0055 }
            java.util.Map r0 = r4.A08     // Catch:{ all -> 0x0055 }
            java.util.Iterator r5 = X.AnonymousClass7TF.A0v(r0)     // Catch:{ all -> 0x0055 }
        L_0x0015:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0055 }
            r0 = 0
            if (r1 == 0) goto L_0x004e
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x0055 }
            X.5gD r2 = (X.C290915gD) r2     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0015
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r1 = r2.A03     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x003d
            java.lang.String r0 = r1.A03     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x003d
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = r1.A03     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x0055 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x003d
        L_0x0039:
            r0 = 1
            r2.A0D = r0     // Catch:{ all -> 0x0055 }
            goto L_0x0015
        L_0x003d:
            com.instagram.direct.model.thread.DiscoverableThreadInfo r0 = r2.A05     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0015
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x0055 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0015
            goto L_0x0039
        L_0x004e:
            X.C290675fi.A00(r4, r0)     // Catch:{ all -> 0x0055 }
            X.C66580MXl.A1W(r3)     // Catch:{ InterruptedException -> 0x0063 }
            return
        L_0x0055:
            r1 = move-exception
            goto L_0x005f
        L_0x0057:
            java.lang.String r0 = "Failed to claim lock after 1 seconds"
            java.lang.InterruptedException r1 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x0063 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x0063 }
            goto L_0x0062
        L_0x005f:
            X.C66580MXl.A1W(r3)     // Catch:{ InterruptedException -> 0x0063 }
        L_0x0062:
            throw r1     // Catch:{ InterruptedException -> 0x0063 }
        L_0x0063:
            r2 = move-exception
            java.lang.String r1 = "BanyanCache"
            r0 = 12
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0KC.A0F(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NRf.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NRf(C290675fi r4, String str) {
        super(1424841959, 3, false, false);
        this.A00 = r4;
        this.A01 = str;
    }
}
