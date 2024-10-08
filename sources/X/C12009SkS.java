package X;

/* renamed from: X.SkS  reason: case insensitive filesystem */
public final class C12009SkS implements C66731qH {
    public final C10771Rxp A00;

    public final void onEventsWritten(int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014c, code lost:
        X.0KC.A0I("BeaconIdGenerator", "Failed to increment beacon id", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0155, code lost:
        if ((r2 instanceof java.io.IOException) != false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x015c, code lost:
        r2 = (((long) r11.A03.nextInt()) & 4294967295L) | (0 << 32);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEventReceived() {
        /*
            r18 = this;
            r0 = r18
            X.Rxp r8 = r0.A00
            int r2 = r8.A02
            if (r2 <= 0) goto L_0x020d
            int r1 = r8.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x0068
            int r0 = r0 % r2
            int r0 = r0 + 1
        L_0x0012:
            r8.A00 = r0
            int r0 = r0 % r2
            if (r0 != 0) goto L_0x020d
            X.1sh r7 = r8.A04
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            r6 = 0
            java.lang.String r0 = "pigeon_beacon"
            com.facebook.flexiblesampling.SamplingResult r11 = com.facebook.flexiblesampling.SamplingResult.A05
            if (r11 != 0) goto L_0x0032
            r12 = 0
            r14 = 1
            com.facebook.flexiblesampling.SamplingResult r11 = new com.facebook.flexiblesampling.SamplingResult
            r15 = r14
            r16 = r6
            r17 = r6
            r11.<init>(r12, r14, r15, r16, r17)
            com.facebook.flexiblesampling.SamplingResult.A05 = r11
        L_0x0032:
            X.1sk r9 = r7.A00(r11, r10, r0, r6)
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r9.A03
            long r2 = r2 | r0
            r9.A03 = r2
            r0 = 53
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "marauder"
            r9.A06(r1, r0)
            X.Rvv r11 = r8.A01
            if (r11 != 0) goto L_0x006b
            android.content.Context r2 = r8.A03
            java.lang.String r1 = "micro_batch"
            r0 = 1262619000(0x4b420978, float:1.2716408E7)
            java.io.File r0 = X.AnonymousClass0eX.A00(r2, r0)
            r0.mkdirs()
            java.io.File r0 = X.JTO.A0s(r0, r1)
            X.Rvv r11 = new X.Rvv
            r11.<init>(r0)
            r8.A01 = r11
            goto L_0x006b
        L_0x0068:
            int r0 = r1 + 1
            goto L_0x0012
        L_0x006b:
            monitor-enter(r11)     // Catch:{ Exception -> 0x014b }
            java.io.File r1 = r11.A02     // Catch:{ all -> 0x0148 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0148 }
            if (r0 != 0) goto L_0x0099
            java.io.File r0 = r11.A01     // Catch:{ all -> 0x0148 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0148 }
            if (r0 != 0) goto L_0x0099
            java.io.File r2 = r11.A00     // Catch:{ all -> 0x0148 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0148 }
            if (r0 != 0) goto L_0x0099
            boolean r0 = r2.mkdirs()     // Catch:{ all -> 0x0148 }
            if (r0 != 0) goto L_0x0099
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "Cannot create "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)     // Catch:{ all -> 0x0148 }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x0148 }
        L_0x0098:
            throw r0     // Catch:{ all -> 0x0148 }
        L_0x0099:
            X.0Hg r12 = new X.0Hg     // Catch:{ all -> 0x0148 }
            r12.<init>(r1)     // Catch:{ all -> 0x0148 }
            java.io.File r13 = r11.A01     // Catch:{ all -> 0x013d }
            boolean r0 = r13.exists()     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x010a
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00fe }
            r2.<init>(r13)     // Catch:{ IOException -> 0x00fe }
            r1 = 16
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00fe }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x00fe }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00fe }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00fe }
            int r2 = r1.readInt()     // Catch:{ all -> 0x00f9 }
            r0 = 1
            if (r2 != r0) goto L_0x00ee
            long r2 = r1.readLong()     // Catch:{ all -> 0x00f9 }
            r1.close()     // Catch:{ IOException -> 0x00fe }
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x010a
            r17 = 32
            long r0 = r2 >> r17
            int r14 = (int) r0     // Catch:{ IOException -> 0x00fe }
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r15
            int r1 = (int) r2     // Catch:{ IOException -> 0x00fe }
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r14 != r0) goto L_0x00e6
            java.util.Random r0 = r11.A03     // Catch:{ all -> 0x013d }
            int r0 = r0.nextInt()     // Catch:{ all -> 0x013d }
            long r4 = r4 << r17
            long r2 = (long) r0     // Catch:{ all -> 0x013d }
            goto L_0x00ec
        L_0x00e6:
            int r0 = r14 + 1
            long r4 = (long) r0     // Catch:{ all -> 0x013d }
            long r4 = r4 << r17
            long r2 = (long) r1     // Catch:{ all -> 0x013d }
        L_0x00ec:
            long r2 = r2 & r15
            goto L_0x011c
        L_0x00ee:
            java.lang.String r0 = "expected 1; got "
            java.lang.String r0 = X.002.A0O(r0, r2)     // Catch:{ all -> 0x00f9 }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x00f9 }
            throw r0     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x00fe }
            throw r0     // Catch:{ IOException -> 0x00fe }
        L_0x00fe:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r13}     // Catch:{ all -> 0x013d }
            java.lang.String r1 = "BeaconIdGenerator"
            java.lang.String r0 = "Failure reading beacon id file %s"
            X.0KC.A0M(r1, r0, r3, r2)     // Catch:{ all -> 0x013d }
        L_0x010a:
            java.util.Random r0 = r11.A03     // Catch:{ all -> 0x013d }
            int r1 = r0.nextInt()     // Catch:{ all -> 0x013d }
            r4 = 0
            r0 = 32
            long r4 = r4 << r0
            long r2 = (long) r1     // Catch:{ all -> 0x013d }
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
        L_0x011c:
            long r2 = r2 | r4
            java.io.FileOutputStream r4 = X.JTO.A0t(r13)     // Catch:{ all -> 0x013d }
            r1 = 16
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x013d }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x013d }
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ all -> 0x013d }
            r1.<init>(r0)     // Catch:{ all -> 0x013d }
            r0 = 1
            r1.writeInt(r0)     // Catch:{ all -> 0x0138 }
            r1.writeLong(r2)     // Catch:{ all -> 0x0138 }
            r1.close()     // Catch:{ all -> 0x013d }
            goto L_0x0143
        L_0x0138:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x013d:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0148 }
            goto L_0x0098
        L_0x0143:
            r12.close()     // Catch:{ all -> 0x0148 }
            monitor-exit(r11)     // Catch:{ Exception -> 0x014b }
            goto L_0x016f
        L_0x0148:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ Exception -> 0x014b }
            throw r0     // Catch:{ Exception -> 0x014b }
        L_0x014b:
            r2 = move-exception
            java.lang.String r1 = "BeaconIdGenerator"
            java.lang.String r0 = "Failed to increment beacon id"
            X.0KC.A0I(r1, r0, r2)
            boolean r0 = r2 instanceof java.io.IOException
            if (r0 != 0) goto L_0x015c
            boolean r0 = r2 instanceof java.nio.channels.OverlappingFileLockException
            if (r0 != 0) goto L_0x015c
            throw r2
        L_0x015c:
            java.util.Random r0 = r11.A03
            int r1 = r0.nextInt()
            r4 = 0
            r0 = 32
            long r4 = r4 << r0
            long r2 = (long) r1
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            long r2 = r2 | r4
        L_0x016f:
            java.lang.String r1 = "micro_batch"
            java.lang.String r0 = "tier"
            r9.A06(r0, r1)
            r0 = 32
            long r0 = r2 >> r0
            int r4 = (int) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "beacon_id"
            r9.A05(r1, r0)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r0 = (int) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "beacon_session_id"
            r9.A05(r1, r0)
            r9.A02()
            r9.A09()
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x020d
            java.lang.String r1 = "falco_data_quality_stream"
            X.1sp r14 = r7.A03
            com.facebook.flexiblesampling.SamplingResult r0 = r14.EsY(r1)
            X.1sk r15 = r7.A00(r0, r10, r1, r6)
            java.lang.String r0 = "falco_data_quality_stream_module"
            X.1sk.A00(r15)
            r15.A0C = r0
            r13 = 1
            r15.A07(r13)
            r0 = 18014398510716552(0x4000000012d688, double:1.7800590872937272E-307)
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            java.lang.String r11 = "test_int"
            r15.A05(r12, r11)
            r0 = 4745025603272957755(0x41d9b7a55d37df3b, double:1.725863284873E9)
            java.lang.Double r9 = java.lang.Double.valueOf(r0)
            java.lang.String r8 = "test_float"
            r15.A05(r9, r8)
            java.lang.String r5 = "test_string"
            java.lang.String r4 = "Test String to test extra data encoding during transport"
            r15.A06(r5, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r13)
            java.lang.String r2 = "test_bool"
            r15.A04(r3, r2)
            r15.A09()
            java.lang.String r1 = "falco_data_quality_batch"
            com.facebook.flexiblesampling.SamplingResult r0 = r14.EsY(r1)
            X.1sk r1 = r7.A00(r0, r10, r1, r6)
            java.lang.String r0 = "falco_data_quality_batch_module"
            X.1sk.A00(r1)
            r1.A0C = r0
            r1.A07(r13)
            r1.A05(r12, r11)
            r1.A05(r9, r8)
            r1.A06(r5, r4)
            r1.A04(r3, r2)
            r1.A09()
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12009SkS.onEventReceived():void");
    }

    public C12009SkS(C10771Rxp rxp) {
        this.A00 = rxp;
    }
}
