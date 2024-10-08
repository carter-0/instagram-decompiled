package X;

public abstract class Q1J {
    public double A00;
    public long A01;
    public final long A02;
    public final C9591RdV A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if ((r5 - r9.A01) >= r9.A02) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00(java.lang.Object r10, double r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00db
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x00db
            boolean r0 = r9.A04     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0019
            double r1 = r9.A00     // Catch:{ all -> 0x00d8 }
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0019
            goto L_0x00db
        L_0x0019:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d8 }
            double r3 = r11 - r7
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002f
            r1 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            long r0 = r9.A01     // Catch:{ all -> 0x00d8 }
            long r3 = r5 - r0
            long r1 = r9.A02     // Catch:{ all -> 0x00d8 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00db
        L_0x0039:
            r9.A00 = r11     // Catch:{ all -> 0x00d8 }
            r9.A01 = r5     // Catch:{ all -> 0x00d8 }
            r1 = r9
            boolean r0 = r9 instanceof X.C7954Qdv     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x009a
            X.Qdv r1 = (X.C7954Qdv) r1     // Catch:{ all -> 0x00d8 }
            int r0 = r1.A00     // Catch:{ all -> 0x00d8 }
            switch(r0) {
                case 0: goto L_0x0054;
                case 1: goto L_0x0090;
                default: goto L_0x0049;
            }     // Catch:{ all -> 0x00d8 }
        L_0x0049:
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00d8 }
            X.8a9 r0 = (X.C357968a9) r0     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x00db
            r0.Cwf(r11)     // Catch:{ all -> 0x00d8 }
            goto L_0x00db
        L_0x0054:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ all -> 0x00d8 }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00d8 }
            X.TIp r0 = (X.C13033TIp) r0     // Catch:{ all -> 0x00d8 }
            X.Ss2 r8 = r0.A01     // Catch:{ all -> 0x00d8 }
            float r7 = (float) r11     // Catch:{ all -> 0x00d8 }
            if (r10 == 0) goto L_0x008d
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x00d8 }
            long r0 = r10.longValue()     // Catch:{ all -> 0x00d8 }
            long r5 = r2.toMillis(r0)     // Catch:{ all -> 0x00d8 }
        L_0x0069:
            X.Rpq r0 = r8.A0R     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x00db
            android.os.Handler r0 = r8.A0E     // Catch:{ all -> 0x00d8 }
            r0.getClass()     // Catch:{ all -> 0x00d8 }
            r4 = 1
            r0.removeMessages(r4)     // Catch:{ all -> 0x00d8 }
            X.Rpq r3 = r8.A0R     // Catch:{ all -> 0x00d8 }
            android.os.Handler r2 = r8.A0E     // Catch:{ all -> 0x00d8 }
            r2.getClass()     // Catch:{ all -> 0x00d8 }
            java.lang.Float r1 = java.lang.Float.valueOf(r7)     // Catch:{ all -> 0x00d8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00d8 }
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r1, r0}     // Catch:{ all -> 0x00d8 }
            X.Pxe.A1N(r2, r0, r4)     // Catch:{ all -> 0x00d8 }
            goto L_0x00db
        L_0x008d:
            r5 = 0
            goto L_0x0069
        L_0x0090:
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00d8 }
            X.Ti9 r0 = (X.C13834Ti9) r0     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x00db
            r0.DaK(r11)     // Catch:{ all -> 0x00d8 }
            goto L_0x00db
        L_0x009a:
            boolean r0 = r9 instanceof X.C7953Qdu     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x00db
            X.Qdu r1 = (X.C7953Qdu) r1     // Catch:{ all -> 0x00d8 }
            r4 = 0
            X.STT r6 = r1.A01     // Catch:{ all -> 0x00d8 }
            X.Sma r3 = r1.A00     // Catch:{ all -> 0x00d8 }
            X.SJc r5 = r3.A02     // Catch:{ all -> 0x00d8 }
            float r2 = (float) r11     // Catch:{ all -> 0x00d8 }
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b1
            r2 = 0
            goto L_0x00b7
        L_0x00b1:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00b7:
            monitor-enter(r6)     // Catch:{ all -> 0x00d8 }
            X.RxR r0 = r6.A0C     // Catch:{ all -> 0x00d5 }
            X.Thz r0 = r0.A01     // Catch:{ all -> 0x00d5 }
            r0.Dig(r5, r2)     // Catch:{ all -> 0x00d5 }
            monitor-exit(r6)     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = X.C12081Sma.A00(r3)     // Catch:{ all -> 0x00d8 }
            long r0 = r3.A00     // Catch:{ all -> 0x00d8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d8 }
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r0}     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "onBytesUploaded segment=%s, bytes=%s"
            X.C12081Sma.A01(r3, r4, r0, r1)     // Catch:{ all -> 0x00d8 }
            goto L_0x00db
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00d8 }
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x00db:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1J.A00(java.lang.Object, double):void");
    }

    public Q1J(C9591RdV rdV, long j, boolean z, boolean z2) {
        this.A00 = -1.0d;
        this.A03 = rdV;
        this.A04 = z;
        this.A02 = !z2 ? Math.max(j, 300) : j;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.RdV, java.lang.Object] */
    public Q1J() {
        this(new Object(), 0, true, false);
    }
}
