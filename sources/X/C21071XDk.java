package X;

/* renamed from: X.XDk  reason: case insensitive filesystem */
public final class C21071XDk extends AnonymousClass1aI implements 1aN {
    public C21098XEm A00;
    public boolean A01;
    public final AnonymousClass1aI A02;
    public volatile boolean A03;

    public final void A03() {
        C21098XEm xEm;
        while (true) {
            synchronized (this) {
                xEm = this.A00;
                if (xEm == null) {
                    this.A01 = false;
                    return;
                }
                this.A00 = null;
            }
            xEm.A00(this);
        }
        while (true) {
        }
    }

    public final void A02(1aL r2) {
        this.A02.Eyt(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DUK(java.lang.Object r2) {
        /*
            r1 = this;
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x002d
            monitor-enter(r1)
            boolean r0 = r1.A03     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x001b
            boolean r0 = r1.A01     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x001d
            X.XEm r0 = r1.A00     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0018
            X.XEm r0 = new X.XEm     // Catch:{ all -> 0x002a }
            r0.<init>()     // Catch:{ all -> 0x002a }
            r1.A00 = r0     // Catch:{ all -> 0x002a }
        L_0x0018:
            r0.A01(r2)     // Catch:{ all -> 0x002a }
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            return
        L_0x001d:
            r0 = 1
            r1.A01 = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            X.1aI r0 = r1.A02
            r0.DUK(r2)
            r1.A03()
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21071XDk.DUK(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r1 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        r2.A02.Do4(r3);
        A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Do4(X.C65051aA r3) {
        /*
            r2 = this;
            boolean r0 = r2.A03
            r1 = 1
            if (r0 != 0) goto L_0x0035
            monitor-enter(r2)
            boolean r0 = r2.A03     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x0026
            boolean r0 = r2.A01     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0023
            X.XEm r1 = r2.A00     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0019
            X.XEm r1 = new X.XEm     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            r2.A00 = r1     // Catch:{ all -> 0x0032 }
        L_0x0019:
            X.Y1P r0 = new X.Y1P     // Catch:{ all -> 0x0032 }
            r0.<init>(r3)     // Catch:{ all -> 0x0032 }
            r1.A01(r0)     // Catch:{ all -> 0x0032 }
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            return
        L_0x0023:
            r2.A01 = r1     // Catch:{ all -> 0x0032 }
            r1 = 0
        L_0x0026:
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0035
            X.1aI r0 = r2.A02
            r0.Do4(r3)
            r2.A03()
            return
        L_0x0032:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            throw r0
        L_0x0035:
            r3.dispose()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21071XDk.Do4(X.1aA):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete() {
        /*
            r2 = this;
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x002e
            monitor-enter(r2)
            boolean r0 = r2.A03     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0020
            r1 = 1
            r2.A03 = r1     // Catch:{ all -> 0x002b }
            boolean r0 = r2.A01     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0022
            X.XEm r1 = r2.A00     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x001b
            X.XEm r1 = new X.XEm     // Catch:{ all -> 0x002b }
            r1.<init>()     // Catch:{ all -> 0x002b }
            r2.A00 = r1     // Catch:{ all -> 0x002b }
        L_0x001b:
            X.1ai r0 = X.1ai.A01     // Catch:{ all -> 0x002b }
            r1.A01(r0)     // Catch:{ all -> 0x002b }
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            return
        L_0x0022:
            r2.A01 = r1     // Catch:{ all -> 0x002b }
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            X.1aI r0 = r2.A02
            r0.onComplete()
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r0
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21071XDk.onComplete():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r1 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r3.A02.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0036
            monitor-enter(r3)
            boolean r0 = r3.A03     // Catch:{ all -> 0x0033 }
            r1 = 1
            if (r0 != 0) goto L_0x002a
            r3.A03 = r1     // Catch:{ all -> 0x0033 }
            boolean r0 = r3.A01     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0027
            X.XEm r0 = r3.A00     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x001b
            X.XEm r0 = new X.XEm     // Catch:{ all -> 0x0033 }
            r0.<init>()     // Catch:{ all -> 0x0033 }
            r3.A00 = r0     // Catch:{ all -> 0x0033 }
        L_0x001b:
            X.1aj r2 = new X.1aj     // Catch:{ all -> 0x0033 }
            r2.<init>(r4)     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r1 = r0.A02     // Catch:{ all -> 0x0033 }
            r0 = 0
            r1[r0] = r2     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0027:
            r3.A01 = r1     // Catch:{ all -> 0x0033 }
            r1 = 0
        L_0x002a:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            if (r1 != 0) goto L_0x0036
            X.1aI r0 = r3.A02
            r0.onError(r4)
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            X.C318176oW.A01(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21071XDk.onError(java.lang.Throwable):void");
    }

    public final boolean test(Object obj) {
        return 1ai.A01(this.A02, obj);
    }

    public C21071XDk(AnonymousClass1aI r1) {
        this.A02 = r1;
    }
}
