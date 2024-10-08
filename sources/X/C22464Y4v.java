package X;

/* renamed from: X.Y4v  reason: case insensitive filesystem */
public final class C22464Y4v implements C13970TmY {
    public C22023Xt4 A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final C13198TPe A04 = new Object();
    public final C13198TPe A05 = new Object();
    public final /* synthetic */ C21989Xp3 A06;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.TPe] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.TPe] */
    public C22464Y4v(C21989Xp3 xp3, long j) {
        this.A06 = xp3;
        this.A03 = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:35|36) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:47|48|50) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r4 = r5.E6C(r23, java.lang.Math.min(r1, r3));
        r2 = r9.A01 + r4;
        r9.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        if (r10 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r11 = r9.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        if (r2 < ((long) (r11.A0A.A00() / 2))) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r13 = r9.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r17 = r11;
        r11.A0G.execute(new X.Y7M(r17, new java.lang.Object[]{r11.A0C, java.lang.Integer.valueOf(r13)}, r13, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r9.A01 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.Pxe.A1F();
        r0 = new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0082 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0098 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x0082=Splitter:B:35:0x0082, B:47:0x0098=Splitter:B:47:0x0098} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long E6C(X.C13198TPe r23, long r24) {
        /*
            r22 = this;
            r7 = 0
            r1 = r24
            int r0 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x000f
            java.lang.String r0 = "byteCount < 0: "
            java.lang.IllegalArgumentException r10 = X.Pxg.A0b(r0, r1)
        L_0x000e:
            throw r10
        L_0x000f:
            r10 = 0
            r11 = r22
            X.Xp3 r9 = r11.A06
            monitor-enter(r9)
            X.Y7W r6 = r9.A0A     // Catch:{ all -> 0x00ad }
            r6.A0A()     // Catch:{ all -> 0x00ad }
            java.lang.Integer r0 = r9.A03     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0027
            java.io.IOException r10 = r9.A02     // Catch:{ all -> 0x00a8 }
            if (r10 != 0) goto L_0x0027
            X.RCb r10 = new X.RCb     // Catch:{ all -> 0x00a8 }
            r10.<init>(r0)     // Catch:{ all -> 0x00a8 }
        L_0x0027:
            boolean r0 = r11.A01     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x00a1
            X.TPe r5 = r11.A04     // Catch:{ all -> 0x00a8 }
            long r3 = r5.A00     // Catch:{ all -> 0x00a8 }
            r14 = -1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0045
            long r0 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x00a8 }
            r2 = r23
            long r4 = r5.E6C(r2, r0)     // Catch:{ all -> 0x00a8 }
            long r2 = r9.A01     // Catch:{ all -> 0x00a8 }
            long r2 = r2 + r4
            r9.A01 = r2     // Catch:{ all -> 0x00a8 }
            goto L_0x0053
        L_0x0045:
            boolean r0 = r11.A02     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x0085
            if (r10 != 0) goto L_0x0085
            r9.wait()     // Catch:{ InterruptedException -> 0x0098 }
            r6.A0D()     // Catch:{ all -> 0x00ad }
            monitor-exit(r9)     // Catch:{ all -> 0x00ad }
            goto L_0x000f
        L_0x0053:
            if (r10 != 0) goto L_0x0087
            X.Y1K r11 = r9.A07     // Catch:{ all -> 0x00a8 }
            X.XcW r0 = r11.A0A     // Catch:{ all -> 0x00a8 }
            int r0 = r0.A00()     // Catch:{ all -> 0x00a8 }
            int r0 = r0 / 2
            long r0 = (long) r0     // Catch:{ all -> 0x00a8 }
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 < 0) goto L_0x0087
            int r13 = r9.A05     // Catch:{ all -> 0x00a8 }
            java.util.concurrent.ScheduledExecutorService r12 = r11.A0G     // Catch:{ RejectedExecutionException -> 0x0082 }
            java.lang.String r1 = r11.A0C     // Catch:{ RejectedExecutionException -> 0x0082 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ RejectedExecutionException -> 0x0082 }
            java.lang.Object[] r18 = new java.lang.Object[]{r1, r0}     // Catch:{ RejectedExecutionException -> 0x0082 }
            X.Y7M r0 = new X.Y7M     // Catch:{ RejectedExecutionException -> 0x0082 }
            r20 = r2
            r19 = r13
            r17 = r11
            r16 = r0
            r16.<init>(r17, r18, r19, r20)     // Catch:{ RejectedExecutionException -> 0x0082 }
            r12.execute(r0)     // Catch:{ RejectedExecutionException -> 0x0082 }
        L_0x0082:
            r9.A01 = r7     // Catch:{ all -> 0x00a8 }
            goto L_0x0087
        L_0x0085:
            r4 = -1
        L_0x0087:
            r6.A0D()     // Catch:{ all -> 0x00ad }
            monitor-exit(r9)     // Catch:{ all -> 0x00ad }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0095
            X.Y1K r0 = r9.A07
            r0.A04(r4)
            return r4
        L_0x0095:
            if (r10 != 0) goto L_0x000e
            return r14
        L_0x0098:
            X.Pxe.A1F()     // Catch:{ all -> 0x00a8 }
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00a8 }
            r0.<init>()     // Catch:{ all -> 0x00a8 }
            goto L_0x00a7
        L_0x00a1:
            java.lang.String r0 = "stream closed"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x00a8 }
        L_0x00a7:
            throw r0     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            r6.A0D()     // Catch:{ all -> 0x00ad }
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00ad }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22464Y4v.E6C(X.TPe, long):long");
    }

    public final C11291SJy Ezn() {
        return this.A06.A0A;
    }

    public final void close() {
        long j;
        C21989Xp3 xp3 = this.A06;
        synchronized (xp3) {
            this.A01 = true;
            C13198TPe tPe = this.A04;
            j = tPe.A00;
            tPe.A0A();
            xp3.notifyAll();
        }
        if (j > 0) {
            xp3.A07.A04(j);
        }
        xp3.A02();
    }
}
