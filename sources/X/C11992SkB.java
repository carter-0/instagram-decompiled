package X;

/* renamed from: X.SkB  reason: case insensitive filesystem */
public final class C11992SkB implements C13837TiC, C13832Ti5 {
    public Integer A00;
    public Integer A01;
    public boolean A02;
    public final C13832Ti5 A03;
    public final Object A04;
    public volatile C13837TiC A05;
    public volatile C13837TiC A06;

    public final void ADE() {
        Integer num;
        Integer num2;
        synchronized (this.A04) {
            this.A02 = true;
            try {
                if (!(this.A00 == AnonymousClass05K.A0N || this.A01 == (num2 = AnonymousClass05K.A00))) {
                    this.A01 = num2;
                    this.A06.ADE();
                }
                if (this.A02 && this.A00 != (num = AnonymousClass05K.A00)) {
                    this.A00 = num;
                    this.A05.ADE();
                }
            } finally {
                this.A02 = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r4.A00 == X.AnonymousClass05K.A01) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AFe(X.C13837TiC r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A04
            monitor-enter(r3)
            X.Ti5 r0 = r4.A03     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.AFe(r4)     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001c
        L_0x000d:
            X.TiC r0 = r4.A05     // Catch:{ all -> 0x001f }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001c
            java.lang.Integer r2 = r4.A00     // Catch:{ all -> 0x001f }
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x001f }
            r0 = 1
            if (r2 != r1) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            monitor-exit(r3)     // Catch:{ all -> 0x001f }
            return r0
        L_0x001f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x001f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11992SkB.AFe(X.TiC):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (COm() != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AFf(X.C13837TiC r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A04
            monitor-enter(r2)
            X.Ti5 r0 = r3.A03     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.AFf(r3)     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001c
        L_0x000d:
            X.TiC r0 = r3.A05     // Catch:{ all -> 0x001f }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001c
            boolean r1 = r3.COm()     // Catch:{ all -> 0x001f }
            r0 = 1
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            return r0
        L_0x001f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11992SkB.AFf(X.TiC):boolean");
    }

    public final boolean AFo(C13837TiC tiC) {
        boolean z;
        synchronized (this.A04) {
            C13832Ti5 ti5 = this.A03;
            if ((ti5 == null || ti5.AFo(this)) && (tiC.equals(this.A05) || this.A00 != AnonymousClass05K.A0N)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final C13832Ti5 Boa() {
        C13832Ti5 ti5;
        synchronized (this.A04) {
            C13832Ti5 ti52 = this.A03;
            if (ti52 != null) {
                ti5 = ti52.Boa();
            } else {
                ti5 = this;
            }
        }
        return ti5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r3.A05.COm() != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean COm() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A04
            monitor-enter(r2)
            X.TiC r0 = r3.A06     // Catch:{ all -> 0x0017 }
            boolean r0 = r0.COm()     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0014
            X.TiC r0 = r3.A05     // Catch:{ all -> 0x0017 }
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
        throw new UnsupportedOperationException("Method not decompiled: X.C11992SkB.COm():boolean");
    }

    public final boolean CQ9() {
        boolean A1W;
        synchronized (this.A04) {
            A1W = AnonymousClass7TF.A1W(this.A00, AnonymousClass05K.A0C);
        }
        return A1W;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0017 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CSm(X.C13837TiC r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C11992SkB
            r2 = 0
            if (r0 == 0) goto L_0x0018
            X.SkB r4 = (X.C11992SkB) r4
            X.TiC r0 = r3.A05
            if (r0 != 0) goto L_0x0024
            X.TiC r0 = r4.A05
            if (r0 != 0) goto L_0x0018
        L_0x000f:
            X.TiC r0 = r3.A06
            if (r0 != 0) goto L_0x0019
            X.TiC r0 = r4.A06
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r2 = 1
        L_0x0018:
            return r2
        L_0x0019:
            X.TiC r1 = r3.A06
            X.TiC r0 = r4.A06
            boolean r0 = r1.CSm(r0)
            if (r0 == 0) goto L_0x0018
            goto L_0x0017
        L_0x0024:
            X.TiC r1 = r3.A05
            X.TiC r0 = r4.A05
            boolean r0 = r1.CSm(r0)
            if (r0 == 0) goto L_0x0018
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11992SkB.CSm(X.TiC):boolean");
    }

    public final void DeN(C13837TiC tiC) {
        synchronized (this.A04) {
            if (!tiC.equals(this.A05)) {
                this.A01 = AnonymousClass05K.A0Y;
            } else {
                this.A00 = AnonymousClass05K.A0Y;
                C13832Ti5 ti5 = this.A03;
                if (ti5 != null) {
                    ti5.DeN(this);
                }
            }
        }
    }

    public final void Deq(C13837TiC tiC) {
        synchronized (this.A04) {
            if (tiC.equals(this.A06)) {
                this.A01 = AnonymousClass05K.A0N;
            } else {
                this.A00 = AnonymousClass05K.A0N;
                C13832Ti5 ti5 = this.A03;
                if (ti5 != null) {
                    ti5.Deq(this);
                }
                if (!C9215RTs.A00(this.A01)) {
                    this.A06.clear();
                }
            }
        }
    }

    public final void clear() {
        synchronized (this.A04) {
            this.A02 = false;
            Integer num = AnonymousClass05K.A0C;
            this.A00 = num;
            this.A01 = num;
            this.A06.clear();
            this.A05.clear();
        }
    }

    public final boolean isComplete() {
        boolean A1W;
        synchronized (this.A04) {
            A1W = AnonymousClass7TF.A1W(this.A00, AnonymousClass05K.A0N);
        }
        return A1W;
    }

    public final boolean isRunning() {
        boolean A1W;
        synchronized (this.A04) {
            A1W = AnonymousClass7TF.A1W(this.A00, AnonymousClass05K.A00);
        }
        return A1W;
    }

    public final void pause() {
        synchronized (this.A04) {
            if (!C9215RTs.A00(this.A01)) {
                this.A01 = AnonymousClass05K.A01;
                this.A06.pause();
            }
            if (!C9215RTs.A00(this.A00)) {
                this.A00 = AnonymousClass05K.A01;
                this.A05.pause();
            }
        }
    }

    public C11992SkB(C13832Ti5 ti5, Object obj) {
        Integer num = AnonymousClass05K.A0C;
        this.A00 = num;
        this.A01 = num;
        this.A04 = obj;
        this.A03 = ti5;
    }
}
