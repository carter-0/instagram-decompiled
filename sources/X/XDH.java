package X;

public final class XDH implements 1aL, C65051aA {
    public C65051aA A00;
    public C21098XEm A01;
    public boolean A02;
    public final 1aL A03;
    public volatile boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r4 = r6.A03;
        r4.DUK(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r1 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        r6.A02 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        r6.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r1 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        if (r1 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        r0 = r1[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
        if (r0 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0058, code lost:
        if (X.1ai.A01(r4, r0) != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005a, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005c, code lost:
        if (r2 >= 4) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005f, code lost:
        r1 = r1[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0064, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0065, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DUK(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = r6
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x0019
            if (r7 != 0) goto L_0x001a
            X.1aA r0 = r6.A00
            r0.dispose()
            r0 = 3691(0xe6b, float:5.172E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            r6.onError(r0)
        L_0x0019:
            return
        L_0x001a:
            monitor-enter(r5)
            boolean r0 = r6.A04     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r6.A02     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0033
            X.XEm r0 = r6.A01     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x002e
            X.XEm r0 = new X.XEm     // Catch:{ all -> 0x0069 }
            r0.<init>()     // Catch:{ all -> 0x0069 }
            r6.A01 = r0     // Catch:{ all -> 0x0069 }
        L_0x002e:
            r0.A01(r7)     // Catch:{ all -> 0x0069 }
        L_0x0031:
            monitor-exit(r5)     // Catch:{ all -> 0x0069 }
            goto L_0x0064
        L_0x0033:
            r0 = 1
            r6.A02 = r0     // Catch:{ all -> 0x0069 }
            monitor-exit(r5)     // Catch:{ all -> 0x0069 }
            X.1aL r4 = r6.A03
            r4.DUK(r7)
        L_0x003c:
            monitor-enter(r5)
            X.XEm r1 = r6.A01     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x0046
            r0 = 0
            r6.A02 = r0     // Catch:{ all -> 0x0066 }
            monitor-exit(r5)     // Catch:{ all -> 0x0066 }
            goto L_0x0065
        L_0x0046:
            r0 = 0
            r6.A01 = r0     // Catch:{ all -> 0x0066 }
            monitor-exit(r5)     // Catch:{ all -> 0x0066 }
            java.lang.Object[] r1 = r1.A02
            r3 = 4
        L_0x004d:
            r2 = 0
            if (r1 == 0) goto L_0x003c
        L_0x0050:
            r0 = r1[r2]
            if (r0 == 0) goto L_0x005f
            boolean r0 = X.1ai.A01(r4, r0)
            if (r0 != 0) goto L_0x0019
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x005f
            goto L_0x0050
        L_0x005f:
            r1 = r1[r3]
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            goto L_0x004d
        L_0x0064:
            return
        L_0x0065:
            return
        L_0x0066:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0066 }
            throw r0
        L_0x0069:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0069 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XDH.DUK(java.lang.Object):void");
    }

    public final void Do4(C65051aA r2) {
        if (1af.A02(this.A00, r2)) {
            this.A00 = r2;
            this.A03.Do4(this);
        }
    }

    public final void dispose() {
        this.A00.dispose();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete() {
        /*
            r2 = this;
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x002e
            monitor-enter(r2)
            boolean r0 = r2.A04     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x001d
            boolean r0 = r2.A02     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x001f
            X.XEm r1 = r2.A01     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0018
            X.XEm r1 = new X.XEm     // Catch:{ all -> 0x002b }
            r1.<init>()     // Catch:{ all -> 0x002b }
            r2.A01 = r1     // Catch:{ all -> 0x002b }
        L_0x0018:
            X.1ai r0 = X.1ai.A01     // Catch:{ all -> 0x002b }
            r1.A01(r0)     // Catch:{ all -> 0x002b }
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            return
        L_0x001f:
            r0 = 1
            r2.A04 = r0     // Catch:{ all -> 0x002b }
            r2.A02 = r0     // Catch:{ all -> 0x002b }
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            X.1aL r0 = r2.A03
            r0.onComplete()
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r0
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XDH.onComplete():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r1 != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        r3.A03.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0038
            monitor-enter(r3)
            boolean r0 = r3.A04     // Catch:{ all -> 0x0035 }
            r1 = 1
            if (r0 != 0) goto L_0x002c
            boolean r0 = r3.A02     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0027
            r3.A04 = r1     // Catch:{ all -> 0x0035 }
            X.XEm r0 = r3.A01     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x001b
            X.XEm r0 = new X.XEm     // Catch:{ all -> 0x0035 }
            r0.<init>()     // Catch:{ all -> 0x0035 }
            r3.A01 = r0     // Catch:{ all -> 0x0035 }
        L_0x001b:
            X.1aj r2 = new X.1aj     // Catch:{ all -> 0x0035 }
            r2.<init>(r4)     // Catch:{ all -> 0x0035 }
            java.lang.Object[] r1 = r0.A02     // Catch:{ all -> 0x0035 }
            r0 = 0
            r1[r0] = r2     // Catch:{ all -> 0x0035 }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            return
        L_0x0027:
            r3.A04 = r1     // Catch:{ all -> 0x0035 }
            r3.A02 = r1     // Catch:{ all -> 0x0035 }
            r1 = 0
        L_0x002c:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x0038
            X.1aL r0 = r3.A03
            r0.onError(r4)
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x0038:
            X.C318176oW.A01(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XDH.onError(java.lang.Throwable):void");
    }

    public XDH(1aL r1) {
        this.A03 = r1;
    }
}
