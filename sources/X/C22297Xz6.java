package X;

/* renamed from: X.Xz6  reason: case insensitive filesystem */
public final class C22297Xz6 implements AnonymousClass4TQ {
    public AnonymousClass4XZ A00;
    public final /* synthetic */ C265144Ss A01;

    public C22297Xz6(C265144Ss r1) {
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ void DO6(C266204Xy r2, long j, long j2, boolean z) {
        this.A01.A0F((Xz7) r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.3ve} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.3ve} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.3ve} */
    /* JADX WARNING: type inference failed for: r2v11, types: [X.4Xy, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x015e, code lost:
        if (r12 < r3) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x021e, code lost:
        if (r22 != false) goto L_0x0203;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void DOA(X.C266204Xy r41, long r42, long r44) {
        /*
            r40 = this;
            r5 = r42
            r3 = r41
            X.Xz7 r3 = (X.Xz7) r3
            r0 = r40
            X.4Ss r0 = r0.A01
            X.3x7 r1 = r3.A02
            r39 = r1
            X.4Xz r1 = r3.A03
            r38 = r1
            r2 = r39
            X.4Y0 r27 = X.C21053XCe.A0A(r2, r1)
            X.4Sv r9 = r0.A0P
            int r8 = r3.A00
            java.lang.Object r7 = r3.A05
            X.3w6 r2 = r0.A0C
            r4 = -1
            r26 = 0
            r1 = 0
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25 = r9
            r28 = r26
            r29 = r7
            r30 = r2
            r31 = r8
            r32 = r4
            r33 = r1
            r36 = r34
            r25.A05(r26, r27, r28, r29, r30, r31, r32, r33, r34, r36)
            java.lang.Object r9 = r3.A05
            X.3w6 r9 = (X.C256633w6) r9
            X.3w6 r2 = r0.A0C
            if (r2 != 0) goto L_0x0060
            r25 = 0
        L_0x0046:
            X.3wM r2 = r9.A02(r1)
            long r7 = r2.A00
            r15 = 0
        L_0x004d:
            r2 = r25
            if (r15 >= r2) goto L_0x0067
            X.3w6 r2 = r0.A0C
            X.3wM r2 = r2.A02(r15)
            long r2 = r2.A00
            int r10 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x0067
            int r15 = r15 + 1
            goto L_0x004d
        L_0x0060:
            java.util.List r2 = r2.A0Q
            int r25 = r2.size()
            goto L_0x0046
        L_0x0067:
            boolean r2 = r9.A0R
            r24 = r2
            r23 = 1
            if (r2 == 0) goto L_0x0229
            int r3 = r25 - r15
            java.util.List r2 = r9.A0Q
            int r2 = r2.size()
            if (r3 <= r2) goto L_0x00ac
            java.lang.String r2 = "DashMediaSource"
            java.lang.String r1 = "Loaded out of sync manifest"
        L_0x007d:
            android.util.Log.w(r2, r1)
            int r3 = r0.A01
            int r2 = r3 + 1
            r0.A01 = r2
            X.4Sm r1 = r0.A0R
            X.4Sl r1 = (X.C265074Sl) r1
            int r1 = r1.A00
            if (r1 != r4) goto L_0x008f
            r1 = 3
        L_0x008f:
            if (r3 >= r1) goto L_0x0221
            int r1 = r2 + -1
            int r2 = r1 * 1000
            r1 = 5000(0x1388, float:7.006E-42)
            int r1 = java.lang.Math.min(r2, r1)
            long r2 = (long) r1
        L_0x009c:
            X.Y3O r4 = r0.A0Q
            r1 = 1778(0x6f2, float:2.492E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.A00 = r1
            android.os.Handler r0 = r0.A08
            r0.postDelayed(r4, r2)
            return
        L_0x00ac:
            long r12 = r0.A03
            int r2 = (r12 > r34 ? 1 : (r12 == r34 ? 0 : -1))
            if (r2 == 0) goto L_0x00c7
            long r10 = r9.A0C
            r2 = 1000(0x3e8, double:4.94E-321)
            long r7 = r10 * r2
            int r2 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x00c7
            java.lang.String r2 = "DashMediaSource"
            java.lang.String r8 = "Loaded stale dynamic manifest: "
            java.lang.String r9 = ", "
            java.lang.String r1 = X.002.A0f(r8, r9, r10, r12)
            goto L_0x007d
        L_0x00c7:
            r0.A01 = r1
            X.3w6 r2 = r0.A0C
            if (r2 == 0) goto L_0x0229
            X.3wM r2 = r2.A02(r1)
            java.util.List r2 = r2.A03
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0229
            X.3w6 r2 = r0.A0C
            X.3wM r2 = r2.A02(r1)
            java.util.List r2 = r2.A03
            java.lang.Object r2 = r2.get(r1)
            X.3wK r2 = (X.C256773wK) r2
            java.util.List r2 = r2.A07
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0229
            X.3w6 r2 = r0.A0C
            X.3wG r2 = X.C21055XCg.A07(r2)
            X.4XE r2 = r2.A00()
            if (r2 == 0) goto L_0x0229
            X.3wM r2 = r9.A02(r1)
            java.util.List r2 = r2.A03
            boolean r2 = r2.isEmpty()
            r7 = 0
            if (r2 != 0) goto L_0x0203
            X.3wM r2 = r9.A02(r1)
            java.util.List r2 = r2.A03
            java.lang.Object r2 = r2.get(r1)
            X.3wK r2 = (X.C256773wK) r2
            java.util.List r2 = r2.A07
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0203
            X.3wG r2 = X.C21055XCg.A07(r9)
            X.4XE r2 = r2.A00()
            if (r2 == 0) goto L_0x0203
            X.3w6 r2 = r0.A0C
            X.3wG r2 = X.C21055XCg.A07(r2)
            X.4XE r4 = r2.A00()
            long r2 = r4.B6B()
            long r16 = r4.C7P(r2)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r12 = r4.BrO(r2)
            X.3wG r4 = X.C21055XCg.A07(r9)
            X.4XE r4 = r4.A00()
            long r10 = r4.B6B()
            long r10 = r4.C7P(r10)
            long r3 = r4.BrO(r2)
            int r2 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0160
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            r22 = 1
            if (r2 >= 0) goto L_0x0162
        L_0x0160:
            r22 = 0
        L_0x0162:
            X.3w6 r2 = r0.A0C
            X.3wM r2 = r2.A02(r1)
            java.util.List r2 = r2.A03
            java.lang.Object r2 = r2.get(r1)
            X.3wK r2 = (X.C256773wK) r2
            java.util.List r3 = r2.A07
            X.3wM r2 = r9.A02(r1)
            java.util.List r2 = r2.A03
            java.lang.Object r1 = r2.get(r1)
            X.3wK r1 = (X.C256773wK) r1
            java.util.List r1 = r1.A07
            r27 = r1
            java.util.Iterator r21 = r3.iterator()
        L_0x0186:
            boolean r1 = r21.hasNext()
            if (r1 == 0) goto L_0x021e
            java.lang.Object r14 = r21.next()
            X.3wG r14 = (X.C256733wG) r14
            java.util.Iterator r20 = r27.iterator()
        L_0x0196:
            boolean r1 = r20.hasNext()
            if (r1 == 0) goto L_0x021b
            java.lang.Object r2 = r20.next()
            X.3wG r2 = (X.C256733wG) r2
            X.3wB r1 = r14.A02
            java.lang.String r3 = r1.A0T
            X.3wB r1 = r2.A02
            java.lang.String r1 = r1.A0T
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0196
            X.4XE r13 = r14.A00()
            X.4XE r12 = r2.A00()
            long r3 = r13.B6B()
            long r1 = r13.BrO(r7)
            long r3 = r3 + r1
            r16 = 1
            long r3 = r3 - r16
            long r1 = r12.B6B()
            long r10 = r12.BrO(r7)
            long r1 = r1 + r10
            long r1 = r1 - r16
            long r18 = r13.C7P(r3)
            r10 = -1
            long r3 = r13.AzV(r3, r10)
            long r18 = r18 + r3
            long r16 = r12.C7P(r1)
            long r1 = r12.AzV(r1, r10)
            long r16 = r16 + r1
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r3, r1)
            java.lang.Object r1 = r2.first
            long r10 = X.AnonymousClass7TE.A0R(r1)
            java.lang.Object r1 = r2.second
            long r2 = X.AnonymousClass7TE.A0R(r1)
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0196
        L_0x0203:
            X.3w6 r1 = r0.A0C
            long r2 = r1.A0A
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x020d
            r2 = 5000(0x1388, double:2.4703E-320)
        L_0x020d:
            long r5 = r42 - r44
            long r5 = r5 + r2
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r1
            long r2 = java.lang.Math.max(r7, r5)
            goto L_0x009c
        L_0x021b:
            if (r22 == 0) goto L_0x0186
            goto L_0x0203
        L_0x021e:
            if (r22 == 0) goto L_0x0229
            goto L_0x0203
        L_0x0221:
            X.XQV r1 = new X.XQV
            r1.<init>()
            r0.A0F = r1
            return
        L_0x0229:
            X.4Qh r4 = r0.A0N
            r0.A0C = r9
            boolean r1 = r0.A0H
            r1 = r1 & r24
            r0.A0H = r1
            long r1 = r42 - r44
            r0.A06 = r1
            r0.A05 = r5
            java.lang.Object r3 = r0.A0S
            monitor-enter(r3)
            r1 = r39
            android.net.Uri r2 = r1.A06     // Catch:{ all -> 0x033b }
            android.net.Uri r1 = r0.A07     // Catch:{ all -> 0x033b }
            if (r2 != r1) goto L_0x0250
            X.3w6 r1 = r0.A0C     // Catch:{ all -> 0x033b }
            android.net.Uri r1 = r1.A0F     // Catch:{ all -> 0x033b }
            if (r1 != 0) goto L_0x024e
            r1 = r38
            android.net.Uri r1 = r1.A01     // Catch:{ all -> 0x033b }
        L_0x024e:
            r0.A07 = r1     // Catch:{ all -> 0x033b }
        L_0x0250:
            monitor-exit(r3)     // Catch:{ all -> 0x033b }
            if (r25 != 0) goto L_0x0326
            X.3w6 r1 = r0.A0C
            X.5Ma r3 = r1.A0I
            if (r3 == 0) goto L_0x032b
            java.lang.String r2 = r3.A00
            java.lang.String r1 = "urn:mpeg:dash:utc:direct:2014"
            boolean r1 = com.google.android.exoplayer2.util.Util.A0I(r2, r1)
            if (r1 != 0) goto L_0x0314
            java.lang.String r1 = "urn:mpeg:dash:utc:direct:2012"
            boolean r1 = com.google.android.exoplayer2.util.Util.A0I(r2, r1)
            if (r1 != 0) goto L_0x0314
            java.lang.String r1 = "urn:mpeg:dash:utc:http-iso:2014"
            boolean r1 = com.google.android.exoplayer2.util.Util.A0I(r2, r1)
            if (r1 != 0) goto L_0x02d4
            java.lang.String r1 = "urn:mpeg:dash:utc:http-iso:2012"
            boolean r1 = com.google.android.exoplayer2.util.Util.A0I(r2, r1)
            if (r1 != 0) goto L_0x02d4
            java.lang.String r1 = "urn:mpeg:dash:utc:http-xsdate:2014"
            boolean r1 = com.google.android.exoplayer2.util.Util.A0I(r2, r1)
            if (r1 != 0) goto L_0x02da
            java.lang.String r1 = "urn:mpeg:dash:utc:http-xsdate:2012"
            boolean r1 = com.google.android.exoplayer2.util.Util.A0I(r2, r1)
            if (r1 != 0) goto L_0x02da
            java.lang.String r1 = "urn:mpeg:dash:utc:ntp:2014"
            boolean r1 = com.google.android.exoplayer2.util.Util.A0I(r2, r1)
            if (r1 != 0) goto L_0x02a5
            java.lang.String r1 = "urn:mpeg:dash:utc:ntp:2012"
            boolean r1 = com.google.android.exoplayer2.util.Util.A0I(r2, r1)
            if (r1 != 0) goto L_0x02a5
            java.lang.String r1 = "Unsupported UTC timing scheme"
            java.io.IOException r1 = X.JTO.A0u(r1)
            X.C265144Ss.A03(r0, r1)
            return
        L_0x02a5:
            X.4XY r4 = r0.A0E
            X.XzH r3 = new X.XzH
            r3.<init>(r0)
            java.lang.Object r1 = X.SN0.A03
            monitor-enter(r1)
            boolean r0 = X.SN0.A01     // Catch:{ all -> 0x02d1 }
            monitor-exit(r1)     // Catch:{ all -> 0x02d1 }
            if (r0 == 0) goto L_0x02b8
            r3.onInitialized()
            return
        L_0x02b8:
            if (r4 != 0) goto L_0x02c1
            java.lang.String r0 = "SntpClient"
            X.4XY r4 = new X.4XY
            r4.<init>(r0)
        L_0x02c1:
            X.Swl r2 = new X.Swl
            r2.<init>()
            X.Xz5 r1 = new X.Xz5
            r1.<init>(r3)
            r0 = r23
            r4.A02(r1, r2, r0)
            return
        L_0x02d1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02d1 }
            throw r0
        L_0x02d4:
            X.Swn r5 = new X.Swn
            r5.<init>()
            goto L_0x02df
        L_0x02da:
            X.Swm r5 = new X.Swm
            r5.<init>()
        L_0x02df:
            X.3ws r4 = r0.A0D
            java.lang.String r1 = r3.A01
            android.net.Uri r7 = android.net.Uri.parse(r1)
            r2 = 5
            java.util.Map r10 = java.util.Collections.emptyMap()
            X.C256703wD.A02(r7)
            X.3x6 r8 = new X.3x6
            r8.<init>()
            r14 = 0
            r18 = -1
            X.3x7 r1 = new X.3x7
            r6 = r1
            r11 = r26
            r12 = r23
            r13 = r12
            r16 = r14
            r9 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r18)
            X.Xz7 r3 = new X.Xz7
            r3.<init>(r4, r1, r5, r2)
            X.Xz4 r2 = new X.Xz4
            r2.<init>(r0)
            X.C265144Ss.A02(r0, r2, r3, r12)
            return
        L_0x0314:
            java.lang.String r1 = r3.A01     // Catch:{ 47p -> 0x0321 }
            long r3 = com.google.android.exoplayer2.util.Util.A0A(r1)     // Catch:{ 47p -> 0x0321 }
            long r1 = r0.A05     // Catch:{ 47p -> 0x0321 }
            long r3 = r3 - r1
            X.C265144Ss.A01(r0, r3)     // Catch:{ 47p -> 0x0321 }
            return
        L_0x0321:
            r1 = move-exception
            X.C265144Ss.A03(r0, r1)
            return
        L_0x0326:
            int r1 = r0.A00
            int r1 = r1 + r15
            r0.A00 = r1
        L_0x032b:
            boolean r1 = r4.A0U
            if (r1 == 0) goto L_0x0335
            r1 = r23
            X.C265144Ss.A06(r0, r1)
            return
        L_0x0335:
            r1 = r23
            X.C265144Ss.A05(r0, r1)
            return
        L_0x033b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x033b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22297Xz6.DOA(X.4Xy, long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (X.C21993XpG.A02(r1) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.AnonymousClass4XZ DOC(X.C266204Xy r29, java.io.IOException r30, int r31, long r32, long r34) {
        /*
            r28 = this;
            r3 = r29
            X.Xz7 r3 = (X.Xz7) r3
            r6 = r28
            X.4Ss r5 = r6.A01
            X.4Ss r0 = X.C265144Ss.$redex_init_class
            r11 = r30
            boolean r0 = r11 instanceof X.C2609447q
            r2 = 1
            if (r0 == 0) goto L_0x0022
            r0 = r11
            X.47q r0 = (X.C2609447q) r0
            java.util.Map r1 = r0.A01
            X.4Qh r0 = r5.A0N
            X.0qQ.A0B(r0, r2)
            boolean r0 = X.C21993XpG.A02(r1)
            r7 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r7 = 0
        L_0x0023:
            boolean r0 = r11 instanceof X.C2609347p
            if (r0 != 0) goto L_0x0028
            r2 = 0
        L_0x0028:
            X.3x7 r1 = r3.A02
            X.4Xz r0 = r3.A03
            X.4Y0 r10 = X.C21053XCe.A0A(r1, r0)
            int r13 = r3.A00
            r14 = -1
            r9 = 0
            r15 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.4Y4 r0 = new X.4Y4
            r18 = r0
            r19 = r9
            r20 = r9
            r21 = r13
            r22 = r14
            r23 = r15
            r24 = r16
            r26 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24, r26)
            X.XDS r4 = new X.XDS
            r1 = r31
            r4.<init>(r10, r0, r11, r1)
            X.4Sv r8 = r5.A0P
            r12 = r9
            r18 = r16
            r20 = r2
            r8.A01(r9, r10, r11, r12, r13, r14, r15, r16, r18, r20)
            if (r2 == 0) goto L_0x008d
            X.4XZ r2 = X.AnonymousClass4XY.A05
        L_0x0064:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto L_0x0077
            X.4Sm r0 = r5.A0R
            long r0 = r0.Bo4(r4)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0087
            X.4XZ r2 = X.AnonymousClass4XY.A05
        L_0x0077:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            java.lang.Object r0 = r0.first
            X.4XZ r0 = (X.AnonymousClass4XZ) r0
            r6.A00 = r0
            return r0
        L_0x0087:
            X.4XZ r2 = new X.4XZ
            r2.<init>(r15, r0)
            goto L_0x0077
        L_0x008d:
            int r0 = r31 + -1
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r0 = 500(0x1f4, double:2.47E-321)
            long r2 = r2 + r0
            r0 = 5000(0x1388, double:2.4703E-320)
            long r0 = java.lang.Math.min(r2, r0)
            int r2 = (int) r0
            long r0 = (long) r2
            X.4XZ r2 = new X.4XZ
            r2.<init>(r15, r0)
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22297Xz6.DOC(X.4Xy, java.io.IOException, int, long, long):X.4XZ");
    }

    public final /* bridge */ /* synthetic */ void DOS(C266204Xy r14, int i, long j, long j2) {
        Xz7 xz7 = (Xz7) r14;
        C265144Ss r2 = this.A01;
        if (r2.A0V) {
            AnonymousClass4Y0 A0A = C21053XCe.A0A(xz7.A02, xz7.A03);
            int i2 = i;
            if (i > 0) {
                r2.A0P.A02((C256683wB) null, A0A, (Object) null, xz7.A00, -1, 0, i2, -9223372036854775807L, -9223372036854775807L);
            }
        }
    }
}
