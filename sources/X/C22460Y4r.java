package X;

/* renamed from: X.Y4r  reason: case insensitive filesystem */
public final class C22460Y4r implements C13972Tma {
    public boolean A00;
    public boolean A01;
    public final C13198TPe A02 = new Object();
    public final /* synthetic */ C21989Xp3 A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.TPe] */
    public C22460Y4r(C21989Xp3 xp3) {
        this.A03 = xp3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:(3:33|34|(2:36|(1:38)(5:73|49|50|51|52))(1:39))|53|54|55) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r4 != r7.A00) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r12 = r8.A0J;
        r11 = java.lang.Math.min((int) java.lang.Math.min(r4, r2), r12.A00);
        r0 = (long) r11;
        r8.A03 = r2 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        if (r4 != 0) goto L_0x0090;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0020 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x009c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(boolean r16) {
        /*
            r15 = this;
            X.Xp3 r9 = r15.A03
            monitor-enter(r9)
            X.Y7W r6 = r9.A0B     // Catch:{ all -> 0x00b6 }
            r6.A0A()     // Catch:{ all -> 0x00b6 }
        L_0x0008:
            long r1 = r9.A00     // Catch:{ all -> 0x00b1 }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0029
            boolean r0 = r15.A01     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0029
            boolean r0 = r15.A00     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0029
            java.lang.Integer r0 = r9.A03     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0029
            r9.wait()     // Catch:{ InterruptedException -> 0x0020 }
            goto L_0x0008
        L_0x0020:
            X.Pxe.A1F()     // Catch:{ all -> 0x00b1 }
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00b1 }
            r0.<init>()     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x0029:
            r6.A0D()     // Catch:{ all -> 0x00b6 }
            r9.A03()     // Catch:{ all -> 0x00b6 }
            long r0 = r9.A00     // Catch:{ all -> 0x00b6 }
            X.TPe r7 = r15.A02     // Catch:{ all -> 0x00b6 }
            long r2 = r7.A00     // Catch:{ all -> 0x00b6 }
            long r4 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x00b6 }
            long r0 = r0 - r4
            r9.A00 = r0     // Catch:{ all -> 0x00b6 }
            monitor-exit(r9)     // Catch:{ all -> 0x00b6 }
            r6.A0A()
            if (r16 == 0) goto L_0x0049
            long r0 = r7.A00     // Catch:{ all -> 0x00ac }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r10 = 1
            if (r2 == 0) goto L_0x004a
        L_0x0049:
            r10 = 0
        L_0x004a:
            X.Y1K r8 = r9.A07     // Catch:{ all -> 0x00ac }
            int r9 = r9.A05     // Catch:{ all -> 0x00ac }
            r1 = 0
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x005b
            X.Y1J r0 = r8.A0J     // Catch:{ all -> 0x00ac }
            r0.A04(r7, r9, r1, r10)     // Catch:{ all -> 0x00ac }
            goto L_0x00a8
        L_0x005b:
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a8
            monitor-enter(r8)     // Catch:{ all -> 0x00ac }
        L_0x0060:
            long r2 = r8.A03     // Catch:{ InterruptedException -> 0x009c }
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0076
            java.util.Map r1 = r8.A0E     // Catch:{ InterruptedException -> 0x009c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x009c }
            boolean r0 = r1.containsKey(r0)     // Catch:{ InterruptedException -> 0x009c }
            if (r0 == 0) goto L_0x0095
            r8.wait()     // Catch:{ InterruptedException -> 0x009c }
            goto L_0x0060
        L_0x0076:
            long r0 = java.lang.Math.min(r4, r2)     // Catch:{ all -> 0x00a5 }
            int r11 = (int) r0     // Catch:{ all -> 0x00a5 }
            X.Y1J r12 = r8.A0J     // Catch:{ all -> 0x00a5 }
            int r0 = r12.A00     // Catch:{ all -> 0x00a5 }
            int r11 = java.lang.Math.min(r11, r0)     // Catch:{ all -> 0x00a5 }
            long r0 = (long) r11     // Catch:{ all -> 0x00a5 }
            long r2 = r2 - r0
            r8.A03 = r2     // Catch:{ all -> 0x00a5 }
            monitor-exit(r8)     // Catch:{ all -> 0x00a5 }
            long r4 = r4 - r0
            if (r10 == 0) goto L_0x0090
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L_0x0091
        L_0x0090:
            r0 = 0
        L_0x0091:
            r12.A04(r7, r9, r11, r0)     // Catch:{ all -> 0x00ac }
            goto L_0x005b
        L_0x0095:
            java.lang.String r0 = "stream closed"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ InterruptedException -> 0x009c }
            throw r0     // Catch:{ InterruptedException -> 0x009c }
        L_0x009c:
            X.Pxe.A1F()     // Catch:{ all -> 0x00a5 }
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00a5 }
            r0.<init>()     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00a8:
            r6.A0D()
            return
        L_0x00ac:
            r0 = move-exception
            r6.A0D()
            throw r0
        L_0x00b1:
            r0 = move-exception
            r6.A0D()     // Catch:{ all -> 0x00b6 }
            throw r0     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00b6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22460Y4r.A00(boolean):void");
    }

    public final C11291SJy Ezn() {
        return this.A03.A0B;
    }

    public final void FNi(C13198TPe tPe, long j) {
        C13198TPe tPe2 = this.A02;
        tPe2.FNi(tPe, j);
        while (tPe2.A00 >= 16384) {
            A00(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        r7 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r7.A00 > 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r0 = r5.A07;
        r0.A0J.A04((X.C13198TPe) null, r5.A05, 0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r7.A00 <= 0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        A00(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r8.A00 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r5.A07.A0J.A00();
        r5.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        if (r5.A08.A01 != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r8 = this;
            X.Xp3 r5 = r8.A03
            monitor-enter(r5)
            boolean r0 = r8.A00     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r5)     // Catch:{ all -> 0x0043 }
            return
        L_0x0009:
            monitor-exit(r5)     // Catch:{ all -> 0x0043 }
            X.Y4r r0 = r5.A08
            boolean r0 = r0.A01
            r6 = 1
            if (r0 != 0) goto L_0x0026
            X.TPe r7 = r8.A02
            long r1 = r7.A00
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0028
            X.Y1K r0 = r5.A07
            int r3 = r5.A05
            r2 = 0
            r1 = 0
            X.Y1J r0 = r0.A0J
            r0.A04(r2, r3, r1, r6)
        L_0x0026:
            monitor-enter(r5)
            goto L_0x0032
        L_0x0028:
            long r1 = r7.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0026
            r8.A00(r6)
            goto L_0x0028
        L_0x0032:
            r8.A00 = r6     // Catch:{ all -> 0x0040 }
            monitor-exit(r5)     // Catch:{ all -> 0x0040 }
            X.Y1K r0 = r5.A07
            X.Y1J r0 = r0.A0J
            r0.A00()
            r5.A02()
            return
        L_0x0040:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0040 }
            throw r0
        L_0x0043:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0043 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22460Y4r.close():void");
    }

    public final void flush() {
        C21989Xp3 xp3 = this.A03;
        synchronized (xp3) {
            xp3.A03();
        }
        while (this.A02.A00 > 0) {
            A00(false);
            xp3.A07.A0J.A00();
        }
    }
}
