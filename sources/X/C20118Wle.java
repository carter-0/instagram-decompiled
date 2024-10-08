package X;

/* renamed from: X.Wle  reason: case insensitive filesystem */
public final class C20118Wle implements Runnable {
    public final /* synthetic */ C18412VrH A00;
    public final /* synthetic */ C18946WDz A01;

    public C20118Wle(C18412VrH vrH, C18946WDz wDz) {
        this.A01 = wDz;
        this.A00 = vrH;
    }

    /* JADX WARNING: type inference failed for: r2v17, types: [X.VgO, java.lang.Object, X.UEy] */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object, X.V4u] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r4 == -1) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        X.C13988Tno.A1S(r8, (int) (r4 - ((long) r8.position())));
        r8.position(r8.position() + 12);
        r2 = ((long) r8.getInt()) & 4294967295L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        if (((long) r6) >= r2) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        r15 = r8.getInt();
        r0 = ((long) r8.getInt()) & 4294967295L;
        r8.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        if (1164798569 == r15) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        if (1701669481 == r15) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00db, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00de, code lost:
        r8.position((int) (r0 + r4));
        r2 = new java.lang.Object();
        r8.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r2.A00 = r8.getInt(r8.position()) + r8.position();
        r2.A01 = r8;
        r0 = new X.C18470VsM(r12, r2);
        r3 = r11.A00;
        r3.A02 = r0;
        r2 = r3.A02;
        r1 = new java.lang.Object();
        r4 = r3.A00;
        r3.A01 = new X.W16(r1, r2);
        r3 = new java.util.ArrayList();
        r1 = r4.A05;
        r1.writeLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r4.A00 = 1;
        r0 = r4.A04;
        r3.addAll(r0);
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.C13988Tno.A1V(r1);
        r4.A01.post(new X.C20267WoI((java.lang.Throwable) null, r3, r4.A00));
        X.C18946WDz.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0141, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0142, code lost:
        r2 = new java.io.IOException("Cannot read metadata.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0183, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0184, code lost:
        X.C13988Tno.A1V(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r0 = r18
            X.WDz r9 = r0.A01
            X.VrH r0 = r0.A00
            r9.A02 = r0
            android.content.Context r5 = r9.A03     // Catch:{ NameNotFoundException -> 0x017a }
            X.1rR r0 = r9.A04     // Catch:{ NameNotFoundException -> 0x017a }
            r10 = 0
            X.26z r0 = X.C67001rX.A00(r5, r0)     // Catch:{ NameNotFoundException -> 0x017a }
            int r2 = r0.A00     // Catch:{ all -> 0x0188 }
            if (r2 != 0) goto L_0x016c
            X.26x[] r1 = r0.A01     // Catch:{ all -> 0x0188 }
            if (r1 == 0) goto L_0x0164
            int r0 = r1.length     // Catch:{ all -> 0x0188 }
            if (r0 == 0) goto L_0x0164
            r4 = 0
            r3 = r1[r4]     // Catch:{ all -> 0x0188 }
            int r2 = r3.A00     // Catch:{ all -> 0x0188 }
            r0 = 2
            if (r2 != r0) goto L_0x002e
            java.lang.Object r0 = r9.A05     // Catch:{ all -> 0x0188 }
            monitor-enter(r0)     // Catch:{ all -> 0x0188 }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            goto L_0x0156
        L_0x002a:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            goto L_0x0187
        L_0x002e:
            if (r2 != 0) goto L_0x0156
            r13 = 1
            X.26x[] r1 = new X.26x[]{r3}     // Catch:{ all -> 0x0188 }
            X.272 r0 = X.270.A01     // Catch:{ all -> 0x0188 }
            android.graphics.Typeface r12 = r0.A03(r5, r10, r1, r4)     // Catch:{ all -> 0x0188 }
            android.net.Uri r0 = r3.A03     // Catch:{ all -> 0x0188 }
            java.nio.MappedByteBuffer r0 = X.2BV.A01(r5, r0)     // Catch:{ all -> 0x0188 }
            if (r0 == 0) goto L_0x014e
            X.VrH r11 = r9.A02     // Catch:{ all -> 0x0188 }
            java.nio.ByteBuffer r8 = r0.duplicate()     // Catch:{ all -> 0x0188 }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x0188 }
            r8.order(r0)     // Catch:{ all -> 0x0188 }
            int r0 = r8.position()     // Catch:{ all -> 0x0188 }
            int r0 = r0 + 4
            r8.position(r0)     // Catch:{ all -> 0x0188 }
            short r3 = r8.getShort()     // Catch:{ all -> 0x0188 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            java.lang.String r7 = "Cannot read metadata."
            r0 = 100
            if (r3 > r0) goto L_0x0148
            int r0 = r8.position()     // Catch:{ all -> 0x0188 }
            int r0 = r0 + 6
            r8.position(r0)     // Catch:{ all -> 0x0188 }
            r6 = 0
            r2 = 0
        L_0x0070:
            r14 = -1
            if (r2 >= r3) goto L_0x0142
            int r1 = r8.getInt()     // Catch:{ all -> 0x0188 }
            int r0 = r8.position()     // Catch:{ all -> 0x0188 }
            int r0 = r0 + 4
            r8.position(r0)     // Catch:{ all -> 0x0188 }
            int r0 = r8.getInt()     // Catch:{ all -> 0x0188 }
            long r4 = (long) r0     // Catch:{ all -> 0x0188 }
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r16
            int r0 = r8.position()     // Catch:{ all -> 0x0188 }
            int r0 = r0 + 4
            r8.position(r0)     // Catch:{ all -> 0x0188 }
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r0 != r1) goto L_0x00a0
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0142
            goto L_0x00a3
        L_0x00a0:
            int r2 = r2 + 1
            goto L_0x0070
        L_0x00a3:
            int r0 = r8.position()     // Catch:{ all -> 0x0188 }
            long r2 = (long) r0     // Catch:{ all -> 0x0188 }
            long r0 = r4 - r2
            int r2 = (int) r0     // Catch:{ all -> 0x0188 }
            X.C13988Tno.A1S(r8, r2)     // Catch:{ all -> 0x0188 }
            int r0 = r8.position()     // Catch:{ all -> 0x0188 }
            int r0 = r0 + 12
            r8.position(r0)     // Catch:{ all -> 0x0188 }
            int r0 = r8.getInt()     // Catch:{ all -> 0x0188 }
            long r2 = (long) r0     // Catch:{ all -> 0x0188 }
            long r2 = r2 & r16
        L_0x00be:
            long r0 = (long) r6     // Catch:{ all -> 0x0188 }
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 >= 0) goto L_0x0142
            int r15 = r8.getInt()     // Catch:{ all -> 0x0188 }
            int r0 = r8.getInt()     // Catch:{ all -> 0x0188 }
            long r0 = (long) r0     // Catch:{ all -> 0x0188 }
            long r0 = r0 & r16
            r8.getInt()     // Catch:{ all -> 0x0188 }
            r14 = 1164798569(0x456d6a69, float:3798.6506)
            if (r14 == r15) goto L_0x00de
            r14 = 1701669481(0x656d6a69, float:7.0072736E22)
            if (r14 == r15) goto L_0x00de
            int r6 = r6 + 1
            goto L_0x00be
        L_0x00de:
            long r0 = r0 + r4
            int r2 = (int) r0     // Catch:{ all -> 0x0188 }
            r8.position(r2)     // Catch:{ all -> 0x0188 }
            X.UEy r2 = new X.UEy     // Catch:{ all -> 0x0188 }
            r2.<init>()     // Catch:{ all -> 0x0188 }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x0188 }
            r8.order(r0)     // Catch:{ all -> 0x0188 }
            int r0 = r8.position()     // Catch:{ all -> 0x0188 }
            int r1 = r8.getInt(r0)     // Catch:{ all -> 0x0188 }
            int r0 = r8.position()     // Catch:{ all -> 0x0188 }
            int r1 = r1 + r0
            r2.A00 = r1     // Catch:{ all -> 0x0188 }
            r2.A01 = r8     // Catch:{ all -> 0x0188 }
            X.VsM r0 = new X.VsM     // Catch:{ all -> 0x0188 }
            r0.<init>(r12, r2)     // Catch:{ all -> 0x0188 }
            X.VUI r3 = r11.A00     // Catch:{ all -> 0x0188 }
            r3.A02 = r0     // Catch:{ all -> 0x0188 }
            X.VsM r2 = r3.A02     // Catch:{ all -> 0x0188 }
            X.V4u r1 = new X.V4u     // Catch:{ all -> 0x0188 }
            r1.<init>()     // Catch:{ all -> 0x0188 }
            X.W0M r4 = r3.A00     // Catch:{ all -> 0x0188 }
            X.W16 r0 = new X.W16     // Catch:{ all -> 0x0188 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0188 }
            r3.A01 = r0     // Catch:{ all -> 0x0188 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0188 }
            r3.<init>()     // Catch:{ all -> 0x0188 }
            java.util.concurrent.locks.ReadWriteLock r1 = r4.A05     // Catch:{ all -> 0x0188 }
            java.util.concurrent.locks.Lock r0 = r1.writeLock()     // Catch:{ all -> 0x0188 }
            r0.lock()     // Catch:{ all -> 0x0188 }
            r4.A00 = r13     // Catch:{ all -> 0x0183 }
            java.util.Set r0 = r4.A04     // Catch:{ all -> 0x0183 }
            r3.addAll(r0)     // Catch:{ all -> 0x0183 }
            r0.clear()     // Catch:{ all -> 0x0183 }
            X.C13988Tno.A1V(r1)     // Catch:{ all -> 0x0188 }
            android.os.Handler r2 = r4.A01     // Catch:{ all -> 0x0188 }
            int r1 = r4.A00     // Catch:{ all -> 0x0188 }
            X.WoI r0 = new X.WoI     // Catch:{ all -> 0x0188 }
            r0.<init>(r10, r3, r1)     // Catch:{ all -> 0x0188 }
            r2.post(r0)     // Catch:{ all -> 0x0188 }
            X.C18946WDz.A00(r9)     // Catch:{ all -> 0x0188 }
            return
        L_0x0142:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0188 }
            r2.<init>(r7)     // Catch:{ all -> 0x0188 }
            goto L_0x0187
        L_0x0148:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0188 }
            r2.<init>(r7)     // Catch:{ all -> 0x0188 }
            goto L_0x0187
        L_0x014e:
            java.lang.String r0 = "Unable to open file."
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0188 }
            r2.<init>(r0)     // Catch:{ all -> 0x0188 }
            goto L_0x0187
        L_0x0156:
            java.lang.String r1 = "fetchFonts result is not OK. ("
            java.lang.String r0 = ")"
            java.lang.String r0 = X.002.A0c(r1, r0, r2)     // Catch:{ all -> 0x0188 }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0188 }
            r2.<init>(r0)     // Catch:{ all -> 0x0188 }
            goto L_0x0187
        L_0x0164:
            java.lang.String r0 = "fetchFonts failed (empty result)"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0188 }
            r2.<init>(r0)     // Catch:{ all -> 0x0188 }
            goto L_0x0187
        L_0x016c:
            java.lang.String r1 = "fetchFonts failed ("
            java.lang.String r0 = ")"
            java.lang.String r0 = X.002.A0c(r1, r0, r2)     // Catch:{ all -> 0x0188 }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0188 }
            r2.<init>(r0)     // Catch:{ all -> 0x0188 }
            goto L_0x0187
        L_0x017a:
            r1 = move-exception
            java.lang.String r0 = "provider not found"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0188 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0188 }
            goto L_0x0187
        L_0x0183:
            r2 = move-exception
            X.C13988Tno.A1V(r1)     // Catch:{ all -> 0x0188 }
        L_0x0187:
            throw r2     // Catch:{ all -> 0x0188 }
        L_0x0188:
            r1 = move-exception
            X.VrH r0 = r9.A02
            X.VUI r0 = r0.A00
            X.W0M r0 = r0.A00
            r0.A04(r1)
            X.C18946WDz.A00(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20118Wle.run():void");
    }
}
