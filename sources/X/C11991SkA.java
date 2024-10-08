package X;

/* renamed from: X.SkA  reason: case insensitive filesystem */
public final class C11991SkA implements C13837TiC, C13832Ti5 {
    public Integer A00;
    public Integer A01;
    public final C13832Ti5 A02;
    public final Object A03;
    public volatile C13837TiC A04;
    public volatile C13837TiC A05;

    public final void ADE() {
        synchronized (this.A03) {
            Integer num = this.A01;
            Integer num2 = AnonymousClass05K.A00;
            if (num != num2) {
                this.A01 = num2;
                this.A05.ADE();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r4.equals(r3.A05) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AFe(X.C13837TiC r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            X.Ti5 r0 = r3.A02     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.AFe(r3)     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0016
        L_0x000d:
            X.TiC r0 = r3.A05     // Catch:{ all -> 0x0019 }
            boolean r1 = r4.equals(r0)     // Catch:{ all -> 0x0019 }
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11991SkA.AFe(X.TiC):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r1 == r2) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AFf(X.C13837TiC r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A03
            monitor-enter(r3)
            X.Ti5 r0 = r4.A02     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.AFf(r4)     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
        L_0x000d:
            java.lang.Integer r0 = r4.A01     // Catch:{ all -> 0x0031 }
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x0031 }
            if (r0 == r2) goto L_0x001c
            X.TiC r0 = r4.A05     // Catch:{ all -> 0x0031 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
            goto L_0x002c
        L_0x001c:
            X.TiC r0 = r4.A04     // Catch:{ all -> 0x0031 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
            java.lang.Integer r1 = r4.A00     // Catch:{ all -> 0x0031 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0031 }
            if (r1 == r0) goto L_0x002c
            if (r1 != r2) goto L_0x002e
        L_0x002c:
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return r0
        L_0x0031:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11991SkA.AFf(X.TiC):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r1 != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AFo(X.C13837TiC r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            X.Ti5 r0 = r3.A02     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x000e
            boolean r1 = r0.AFo(r3)     // Catch:{ all -> 0x0011 }
            r0 = 0
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11991SkA.AFo(X.TiC):boolean");
    }

    public final C13832Ti5 Boa() {
        C13832Ti5 ti5;
        synchronized (this.A03) {
            C13832Ti5 ti52 = this.A02;
            if (ti52 != null) {
                ti5 = ti52.Boa();
            } else {
                ti5 = this;
            }
        }
        return ti5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r3.A04.COm() != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean COm() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            X.TiC r0 = r3.A05     // Catch:{ all -> 0x0017 }
            boolean r0 = r0.COm()     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0014
            X.TiC r0 = r3.A04     // Catch:{ all -> 0x0017 }
            boolean r1 = r0.COm()     // Catch:{ all -> 0x0017 }
            r0 = 0
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11991SkA.COm():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r4.A00 != r2) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CQ9() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A03
            monitor-enter(r3)
            java.lang.Integer r0 = r4.A01     // Catch:{ all -> 0x0011 }
            java.lang.Integer r2 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0011 }
            if (r0 != r2) goto L_0x000e
            java.lang.Integer r1 = r4.A00     // Catch:{ all -> 0x0011 }
            r0 = 1
            if (r1 == r2) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11991SkA.CQ9():boolean");
    }

    public final boolean CSm(C13837TiC tiC) {
        if (!(tiC instanceof C11991SkA)) {
            return false;
        }
        C11991SkA skA = (C11991SkA) tiC;
        if (!this.A05.CSm(skA.A05) || !this.A04.CSm(skA.A04)) {
            return false;
        }
        return true;
    }

    public final void DeN(C13837TiC tiC) {
        synchronized (this.A03) {
            if (!tiC.equals(this.A04)) {
                this.A01 = AnonymousClass05K.A0Y;
                Integer num = this.A00;
                Integer num2 = AnonymousClass05K.A00;
                if (num != num2) {
                    this.A00 = num2;
                    this.A04.ADE();
                }
            } else {
                this.A00 = AnonymousClass05K.A0Y;
                C13832Ti5 ti5 = this.A02;
                if (ti5 != null) {
                    ti5.DeN(this);
                }
            }
        }
    }

    public final void Deq(C13837TiC tiC) {
        synchronized (this.A03) {
            if (tiC.equals(this.A05)) {
                this.A01 = AnonymousClass05K.A0N;
            } else if (tiC.equals(this.A04)) {
                this.A00 = AnonymousClass05K.A0N;
            }
            C13832Ti5 ti5 = this.A02;
            if (ti5 != null) {
                ti5.Deq(this);
            }
        }
    }

    public final void clear() {
        synchronized (this.A03) {
            Integer num = AnonymousClass05K.A0C;
            this.A01 = num;
            this.A05.clear();
            if (this.A00 != num) {
                this.A00 = num;
                this.A04.clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r4.A00 == r2) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isComplete() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A03
            monitor-enter(r3)
            java.lang.Integer r0 = r4.A01     // Catch:{ all -> 0x0011 }
            java.lang.Integer r2 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0011 }
            if (r0 == r2) goto L_0x000e
            java.lang.Integer r1 = r4.A00     // Catch:{ all -> 0x0011 }
            r0 = 0
            if (r1 != r2) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11991SkA.isComplete():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r4.A00 == r2) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isRunning() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A03
            monitor-enter(r3)
            java.lang.Integer r0 = r4.A01     // Catch:{ all -> 0x0011 }
            java.lang.Integer r2 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0011 }
            if (r0 == r2) goto L_0x000e
            java.lang.Integer r1 = r4.A00     // Catch:{ all -> 0x0011 }
            r0 = 0
            if (r1 != r2) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11991SkA.isRunning():boolean");
    }

    public final void pause() {
        synchronized (this.A03) {
            Integer num = this.A01;
            Integer num2 = AnonymousClass05K.A00;
            if (num == num2) {
                this.A01 = AnonymousClass05K.A01;
                this.A05.pause();
            }
            if (this.A00 == num2) {
                this.A00 = AnonymousClass05K.A01;
                this.A04.pause();
            }
        }
    }

    public C11991SkA(C13832Ti5 ti5, Object obj) {
        Integer num = AnonymousClass05K.A0C;
        this.A01 = num;
        this.A00 = num;
        this.A03 = obj;
        this.A02 = ti5;
    }
}
