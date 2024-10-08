package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.5fO  reason: invalid class name and case insensitive filesystem */
public final class C290485fO extends C290495fP implements AnonymousClass4TQ {
    public HeroPlayerSetting A00;
    public C256633w6 A01;
    public C256353vd A02;
    public final AnonymousClass4SX A03;
    public final AnonymousClass4XY A04;

    public final /* synthetic */ void DOS(C266204Xy r1, int i, long j, long j2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0265, code lost:
        if (r4.A07 != false) goto L_0x0267;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C256633w6 r48, boolean r49, boolean r50) {
        /*
            r47 = this;
            java.lang.String r2 = "Exo2DashLiveManifestFetcher"
            r20 = 1
            r3 = r47
            android.net.Uri r0 = r3.A06
            r6 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Process single manifest, uri=%s"
            X.27B.A01(r2, r0, r1)
            r1 = r3
            monitor-enter(r1)
            r2 = r48
            r3.A01 = r2     // Catch:{ all -> 0x028e }
            monitor-exit(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A01(r0)
            X.YAA r0 = r3.A00
            if (r0 == 0) goto L_0x003f
            r0.Dks(r2)
        L_0x0025:
            com.facebook.exoplayer.monitor.VpsEventCallback r4 = r3.A0A
            if (r50 == 0) goto L_0x003e
            X.3wn r0 = r3.A0B
            java.lang.String r8 = r0.A07
            java.lang.String r1 = r2.A0P
            int r0 = r2.A02
            X.Qdh r7 = new X.Qdh
            r9 = r1
            r10 = r6
            r11 = r0
            r12 = r20
            r7.<init>(r8, r9, r10, r11, r12)
            r4.callback(r7)
        L_0x003e:
            return
        L_0x003f:
            boolean r0 = r3.A0I
            if (r0 == 0) goto L_0x0025
            if (r49 == 0) goto L_0x0025
            java.util.List r0 = r2.A0Q
            int r1 = r0.size()
            r0 = r20
            if (r1 < r0) goto L_0x0280
            X.3wM r0 = r2.A02(r6)
            java.util.List r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0280
            X.28Y r5 = r3.A0D
            X.3wn r0 = r3.A0B
            r46 = r0
            int r15 = r3.A02
            int r0 = r3.A04
            r28 = r0
            com.facebook.exoplayer.monitor.VpsEventCallback r0 = r3.A0A
            r45 = r0
            java.lang.String r0 = r3.A0F
            r44 = r0
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            X.28w r11 = r5.A01
            r0 = r46
            java.lang.String r10 = r0.A07
            X.28X r13 = r5.A0B
            java.util.concurrent.BlockingQueue r0 = r5.A0C
            r43 = r0
            r43.size()
            r12 = 0
            X.3wM r0 = r2.A02(r6)
            java.util.List r0 = r0.A03
            java.util.Iterator r16 = r0.iterator()
            r9 = 0
            r4 = r9
            r8 = r9
        L_0x0091:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r14 = r16.next()
            X.3wK r14 = (X.C256773wK) r14
            java.util.List r7 = r14.A07
            if (r4 != 0) goto L_0x00bb
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00bb
            java.lang.Object r0 = r7.get(r6)
            X.3wG r0 = (X.C256733wG) r0
            X.3wB r0 = r0.A02
            java.lang.String r1 = r0.A0S
            java.lang.String r0 = "video/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00bb
            r4 = r14
            goto L_0x0091
        L_0x00bb:
            if (r8 != 0) goto L_0x0151
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0091
            java.lang.Object r0 = r7.get(r6)
            X.3wG r0 = (X.C256733wG) r0
            X.3wB r0 = r0.A02
            java.lang.String r1 = r0.A0S
            java.lang.String r0 = "audio/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0091
            r8 = r14
            goto L_0x0091
        L_0x00d7:
            if (r4 != 0) goto L_0x0153
            r7 = r9
        L_0x00da:
            if (r8 != 0) goto L_0x014e
            r0 = r9
        L_0x00dd:
            if (r4 != 0) goto L_0x0149
            r4 = r9
        L_0x00e0:
            if (r8 != 0) goto L_0x0144
            r1 = r9
        L_0x00e3:
            if (r4 == 0) goto L_0x0142
            X.3wB r8 = r4.A04
            X.3wG r8 = X.C22020Xsv.A02(r8, r7)
        L_0x00eb:
            if (r1 == 0) goto L_0x00f3
            X.3wB r1 = r1.A04
            X.3wG r9 = X.C22020Xsv.A02(r1, r0)
        L_0x00f3:
            X.3p9 r18 = X.C252463p9.LIVE_VIDEO
            r1 = r18
            r0 = r19
            X.C22020Xsv.A04(r13, r1, r8, r10, r0)
            X.3p9 r17 = X.C252463p9.LIVE_AUDIO
            r1 = r0
            r0 = r17
            X.C22020Xsv.A04(r13, r0, r9, r10, r1)
            int r0 = r15 * 1000
            long r0 = (long) r0
            int r16 = X.C22020Xsv.A00(r2, r8, r0)
            int r15 = X.C22020Xsv.A00(r2, r9, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object[] r14 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Exo2DashManifestWrapper"
            java.lang.String r0 = "Using align prefetch: %d"
            X.27B.A01(r1, r0, r14)
            r0 = 0
        L_0x011f:
            r1 = r28
            if (r12 >= r1) goto L_0x0156
            int r27 = r16 + r12
            r22 = r18
            r23 = r2
            r24 = r8
            r25 = r10
            r26 = r19
            r21 = r13
            X.C22020Xsv.A03(r21, r22, r23, r24, r25, r26, r27)
            int r0 = r0 + 1
            int r27 = r15 + r12
            r22 = r17
            r24 = r9
            X.C22020Xsv.A03(r21, r22, r23, r24, r25, r26, r27)
            int r12 = r12 + 1
            goto L_0x011f
        L_0x0142:
            r8 = r9
            goto L_0x00eb
        L_0x0144:
            X.3we r1 = X.C22020Xsv.A01(r11, r2, r10, r0)
            goto L_0x00e3
        L_0x0149:
            X.3we r4 = X.C22020Xsv.A01(r11, r2, r10, r7)
            goto L_0x00e0
        L_0x014e:
            java.util.List r0 = r8.A07
            goto L_0x00dd
        L_0x0151:
            if (r4 == 0) goto L_0x0091
        L_0x0153:
            java.util.List r7 = r4.A07
            goto L_0x00da
        L_0x0156:
            if (r4 == 0) goto L_0x0164
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r1 = r11.A09
            int r1 = r1.getMaxWidthToPrefetch()
            X.3wh r0 = X.C256373vf.A00(r8, r7, r0, r1)
            r4.A03 = r0
        L_0x0164:
            X.3wh r12 = r4.A03
            r8 = 0
            if (r12 == 0) goto L_0x021b
            int r7 = r12.A00
            if (r7 <= 0) goto L_0x021b
            X.27w r23 = X.C697227w.A00
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r0 = r5.A02
            X.1xk r0 = r0.abrSetting
            boolean r1 = r0.A0a
            X.3wf r0 = new X.3wf
            r21 = r0
            r22 = r45
            r24 = r10
            r25 = r7
            r26 = r20
            r27 = r20
            r28 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r43.size()
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r1 = r11.A09
            r1.getMaxWidthToPrefetch()
            r0.A01(r12, r8)
            X.3wG r1 = r12.A07
            long r14 = r1.A01
            long r9 = r1.A00
            X.3wB r1 = r12.A01
            X.3wB[] r7 = r12.A08
            X.3wB r13 = r12.A03
            r17 = r13
            X.3wB r12 = r12.A04
            r16 = r12
            X.28z r11 = r11.A03
            int r33 = r11.A05(r7)
            java.util.LinkedList r30 = new java.util.LinkedList
            r30.<init>()
            r11 = r46
            java.lang.String r11 = r11.A03
            X.27s r12 = r5.A03
            if (r12 != 0) goto L_0x0215
            r42 = 0
        L_0x01ba:
            r32 = 1065353216(0x3f800000, float:1.0)
            r34 = -1
            X.3wi r13 = new X.3wi
            r25 = r11
            r26 = r8
            r27 = r8
            r28 = r8
            r29 = r8
            r31 = r7
            r36 = r14
            r38 = r34
            r40 = r9
            r22 = r1
            r23 = r17
            r24 = r16
            r21 = r13
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r40, r42)
            r0.A01 = r13
            int r14 = r4.A00
            r0.A00 = r14
            long r11 = r4.A01
            long r9 = r4.A02
            int r7 = r1.A05
            long r7 = (long) r7
            X.3wA r1 = r1.A0N
            java.lang.String r1 = r1.A07
            r26 = r9
            r28 = r7
            r30 = r7
            r22 = r1
            r23 = r14
            r24 = r11
            r21.A04(r22, r23, r24, r26, r28, r30)
            java.util.List r1 = r4.A06
            java.util.Iterator r7 = r1.iterator()
        L_0x0203:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x021a
            java.lang.Object r4 = r7.next()
            X.3wi r1 = r0.A01
            java.util.ArrayList r1 = r1.A0I
            r1.add(r4)
            goto L_0x0203
        L_0x0215:
            boolean r42 = r12.A01()
            goto L_0x01ba
        L_0x021a:
            r8 = r0
        L_0x021b:
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x0242
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.A0D
            r7 = 0
            r0 = r20
            boolean r0 = r1.compareAndSet(r6, r0)
            if (r0 == 0) goto L_0x0242
            r4 = 2
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r4)
            r5.A06 = r0
        L_0x0233:
            java.util.concurrent.ExecutorService r1 = r5.A06
            X.Y2a r0 = new X.Y2a
            r0.<init>(r5, r7)
            r1.execute(r0)
            int r7 = r7 + 1
            if (r7 >= r4) goto L_0x0242
            goto L_0x0233
        L_0x0242:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r19.iterator()
        L_0x0250:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0285
            java.lang.Object r4 = r5.next()
            X.Xb8 r4 = (X.Xb8) r4
            X.3p9 r1 = r4.A04
            r0 = r18
            if (r1 != r0) goto L_0x0267
            boolean r0 = r4.A07
            r10 = r8
            if (r0 == 0) goto L_0x0268
        L_0x0267:
            r10 = 0
        L_0x0268:
            X.Xbz r1 = new X.Xbz
            r9 = r1
            r11 = r45
            r12 = r4
            r13 = r46
            r14 = r3
            r15 = r44
            r9.<init>(r10, r11, r12, r13, r14, r15)
            boolean r0 = r7.contains(r1)
            if (r0 != 0) goto L_0x0250
            r7.add(r1)
            goto L_0x0250
        L_0x0280:
            java.util.List r7 = java.util.Collections.emptyList()
            goto L_0x028a
        L_0x0285:
            r0 = r43
            r0.addAll(r7)
        L_0x028a:
            r3.A01 = r7
            goto L_0x0025
        L_0x028e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290485fO.A03(X.3w6, boolean, boolean):void");
    }

    public final /* bridge */ /* synthetic */ void DOA(C266204Xy r3, long j, long j2) {
        A03((C256633w6) ((Xz7) r3).A05, true, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (X.C21993XpG.A00(r1, r10, r13.A0G.get()) == -9223372036854775807L) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ef, code lost:
        if (r0 >= 0) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.AnonymousClass4XZ DOC(X.C266204Xy r14, java.io.IOException r15, int r16, long r17, long r19) {
        /*
            r13 = this;
            X.YAA r1 = r13.A00
            r2 = r16
            if (r1 == 0) goto L_0x0025
            boolean r0 = r15 instanceof X.C2609547r
            if (r0 == 0) goto L_0x0025
            r0 = -1
            if (r2 > r0) goto L_0x0025
        L_0x000d:
            r4 = 0
            int r0 = r16 + -1
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r0 = 500(0x1f4, double:2.47E-321)
            long r2 = r2 + r0
            r0 = 5000(0x1388, double:2.4703E-320)
            long r1 = java.lang.Math.min(r2, r0)
            int r0 = (int) r1
            long r1 = (long) r0
            X.4XZ r0 = new X.4XZ
            r0.<init>(r4, r1)
            return r0
        L_0x0025:
            if (r1 == 0) goto L_0x0038
            boolean r0 = r15 instanceof X.C2609447q
            if (r0 == 0) goto L_0x0038
            r0 = r15
            X.47q r0 = (X.C2609447q) r0
            int r1 = r0.A00
            r0 = 503(0x1f7, float:7.05E-43)
            if (r1 != r0) goto L_0x0038
            r0 = -1
            if (r2 > r0) goto L_0x0038
            goto L_0x000d
        L_0x0038:
            java.lang.String r3 = "BaseManifestFetcher"
            java.lang.String r0 = r15.getMessage()
            r12 = 0
            android.net.Uri r7 = r13.A06
            r6 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r7}
            java.lang.String r0 = "Single dash manifest request error: %s, uri=%s "
            X.27B.A01(r3, r0, r1)
            boolean r2 = r15 instanceof X.C2609447q
            if (r2 == 0) goto L_0x00b6
            r1 = r15
            X.47q r1 = (X.C2609447q) r1
            int r10 = r1.A00
            r0 = 410(0x19a, float:5.75E-43)
            if (r10 == r0) goto L_0x0077
            r0 = 417(0x1a1, float:5.84E-43)
            if (r10 == r0) goto L_0x0077
            java.util.Map r1 = r1.A01
            boolean r0 = X.C21993XpG.A02(r1)
            if (r0 == 0) goto L_0x00b7
            java.util.concurrent.atomic.AtomicInteger r0 = r13.A0G
            int r0 = r0.get()
            long r8 = X.C21993XpG.A00(r1, r10, r0)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00b7
        L_0x0077:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r13.A01(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r13.A0G
            r0.set(r12)
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r7}
            java.lang.String r0 = "Stop retry loading manifest: retryCount=%d, uri=%s"
            X.27B.A01(r3, r0, r1)
        L_0x0092:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r13.A01(r0)
            X.YAA r0 = r13.A00
            if (r0 == 0) goto L_0x009e
            r0.Dkt(r15)
        L_0x009e:
            com.facebook.exoplayer.monitor.VpsEventCallback r1 = r13.A0A
            X.3wn r0 = r13.A0B
            java.lang.String r8 = r0.A07
            r9 = 0
            r11 = -1
            X.Qdh r7 = new X.Qdh
            r7.<init>(r8, r9, r10, r11, r12)
            r1.callback(r7)
            X.3wy r0 = r13.A09
            r0.DtY(r15)
        L_0x00b3:
            X.4XZ r0 = X.AnonymousClass4XY.A04
            return r0
        L_0x00b6:
            r10 = 0
        L_0x00b7:
            int r1 = r13.A03
            if (r1 <= 0) goto L_0x0092
            java.util.concurrent.atomic.AtomicInteger r8 = r13.A0G
            int r0 = r8.intValue()
            if (r0 <= 0) goto L_0x0092
            int r0 = r8.decrementAndGet()
            if (r0 < 0) goto L_0x0092
            int r0 = r8.intValue()
            int r1 = r1 - r0
            int r4 = java.lang.Math.min(r1, r6)
            r0 = 503(0x1f7, float:7.05E-43)
            if (r10 != r0) goto L_0x010a
            if (r2 == 0) goto L_0x010a
            X.47q r15 = (X.C2609447q) r15
            java.util.Map r1 = r15.A01
            boolean r0 = X.C21993XpG.A02(r1)
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = "Retry-After"
            java.lang.String r1 = X.C21993XpG.A01(r0, r1)
            r0 = -1
            if (r1 == 0) goto L_0x010a
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x00f1 }
            if (r0 < 0) goto L_0x010a
        L_0x00f1:
            long r5 = (long) r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x010a
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x010a
            r1 = 15
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0109
            r5 = 15
        L_0x0109:
            int r4 = (int) r5
        L_0x010a:
            int r0 = r8.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0, r7}
            java.lang.String r0 = "Retry loading manifest: retryCount=%d, retryAfterSec=%d, uri=%s"
            X.27B.A01(r3, r0, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r13.A01(r0)
            android.os.Handler r3 = r13.A07
            X.Y1o r2 = new X.Y1o
            r2.<init>(r13)
            int r0 = r4 * 1000
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290485fO.DOC(X.4Xy, java.io.IOException, int, long, long):X.4XZ");
    }

    public final /* bridge */ /* synthetic */ void DO6(C266204Xy r1, long j, long j2, boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r35 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.A0W != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r35 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r47 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r36 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r6.A0R != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r36 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r7 = r46;
        r3 = r44;
        r5 = r56;
        r20 = r43;
        r19 = r42;
        r17 = r40;
        r16 = r39;
        r27 = r51;
        r15 = r38;
        r26 = r50;
        r14 = r37;
        r18 = r41;
        r21 = r3;
        r23 = r7;
        super(r15, r16, r17, r18, r19, r20, r21, r45, r23, r48, r49, r26, r27, r52, r53, r55, r5, r33, r34, r35, r36);
        r14.A00 = r7;
        r9 = null;
        r10 = r3.A07;
        r14.A02 = new X.C256343vc((android.content.Context) null, r7, r10, true);
        r14.A03 = new X.C22289Xyy(r3, r14.A0C, r7.A18);
        r14.A04 = new X.AnonymousClass4XY("Loader:ManifestFetcher");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        if (r47 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (android.text.TextUtils.isEmpty(r10) != false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r8 = r6.A0Q.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0088, code lost:
        if (r7 >= r8) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        r13 = r6.A02(r7).A03.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        if (r13.hasNext() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        r12 = ((X.C256773wK) r13.next()).A07.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        if (r12.hasNext() == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        r3 = (X.C256733wG) r12.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
        if ((r3 instanceof X.XOL) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        r2 = r3.A03;
        r1 = ((X.XOL) r3).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bd, code lost:
        if (r2 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
        if (r1 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r1.isEmpty() != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c7, code lost:
        r11 = r2.A00(r3.A03());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r2 = android.util.Base64.decode(r1, 0);
        r14.A08.A00(r11, r10, r2, r2.length);
        X.27B.A01("Exo2DashLiveManifestFetcher", "Added inline for %s, uri=%s", new java.lang.Object[]{r10, r11});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e5, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r6.A0U == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e6, code lost:
        android.util.Log.e("Exo2DashLiveManifestFetcher", java.lang.String.format("Invalid inline binary is given for %s, uri=%s", new java.lang.Object[]{r10, r11}), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f6, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f9, code lost:
        r10 = java.lang.System.currentTimeMillis();
        r0 = r6.A03;
        X.27B.A01("Exo2DashLiveManifestFetcher", "Availability end time is %d, current time is %d", new java.lang.Object[]{java.lang.Long.valueOf(r0), java.lang.Long.valueOf(r10)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0118, code lost:
        if (r10 > (r0 + 300000)) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0120, code lost:
        if (r6.A0Q.size() <= 0) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0122, code lost:
        r10 = r6.A02(0).A03.iterator();
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012d, code lost:
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0132, code lost:
        if (r10.hasNext() == false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0134, code lost:
        r9 = (X.C256773wK) r10.next();
        r8 = r9.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0140, code lost:
        if (r8.isEmpty() != false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014c, code lost:
        if (((X.C256733wG) r8.get(0)).A02.A0S == null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014e, code lost:
        if (r2 != null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0160, code lost:
        if (((X.C256733wG) r8.get(0)).A02.A0S.startsWith("video/") == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0162, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0164, code lost:
        if (r7 != null) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r47 != null) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0176, code lost:
        if (((X.C256733wG) r8.get(0)).A02.A0S.startsWith("audio/") == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0179, code lost:
        if (r2 == null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017c, code lost:
        if (r2 == null) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017e, code lost:
        if (r7 == null) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0180, code lost:
        r2 = r2.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0186, code lost:
        if (r2.isEmpty() != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0188, code lost:
        r1 = r7.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018e, code lost:
        if (r1.isEmpty() != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019a, code lost:
        if (((X.C256733wG) r2.get(0)).A00() == null) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r34 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a6, code lost:
        if (((X.C256733wG) r1.get(0)).A00() == null) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a8, code lost:
        A03(r6, r5, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ac, code lost:
        X.27B.A01("Exo2DashLiveManifestFetcher", "Manifest is too old, skip it: %s", new java.lang.Object[]{r14.A06});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r6.A0V != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r34 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r47 == null) goto L_0x001e;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C290485fO(android.content.Context r38, android.net.Uri r39, android.os.Handler r40, X.28X r41, X.AnonymousClass27J r42, com.facebook.exoplayer.monitor.VpsEventCallback r43, X.C257063wn r44, X.28Y r45, com.facebook.video.heroplayer.setting.HeroPlayerSetting r46, X.C256633w6 r47, java.lang.String r48, java.util.Map r49, java.util.concurrent.atomic.AtomicBoolean r50, java.util.concurrent.atomic.AtomicBoolean r51, int r52, long r53, boolean r55, boolean r56) {
        /*
            r37 = this;
            r6 = r47
            if (r47 == 0) goto L_0x000a
            boolean r0 = r6.A0U
            r33 = 1
            if (r0 != 0) goto L_0x000e
        L_0x000a:
            r33 = 0
            if (r47 == 0) goto L_0x0014
        L_0x000e:
            boolean r0 = r6.A0V
            r34 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0014:
            r34 = 0
            if (r47 == 0) goto L_0x001e
        L_0x0018:
            boolean r0 = r6.A0W
            r35 = 1
            if (r0 != 0) goto L_0x0022
        L_0x001e:
            r35 = 0
            if (r47 == 0) goto L_0x0028
        L_0x0022:
            boolean r0 = r6.A0R
            r36 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0028:
            r36 = 0
        L_0x002a:
            r4 = 0
            r25 = r49
            r24 = r48
            r7 = r46
            r22 = r45
            r3 = r44
            r5 = r56
            r20 = r43
            r31 = r55
            r19 = r42
            r29 = r53
            r17 = r40
            r28 = r52
            r16 = r39
            r27 = r51
            r15 = r38
            r26 = r50
            r14 = r37
            r18 = r41
            r21 = r3
            r23 = r7
            r32 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36)
            r14.A00 = r7
            r9 = 0
            java.lang.String r10 = r3.A07
            r1 = 1
            X.3vc r0 = new X.3vc
            r0.<init>(r9, r7, r10, r1)
            r14.A02 = r0
            X.Xz9 r2 = r14.A0C
            java.lang.String r1 = r7.A18
            X.Xyy r0 = new X.Xyy
            r0.<init>(r3, r2, r1)
            r14.A03 = r0
            java.lang.String r1 = "Loader:ManifestFetcher"
            X.4XY r0 = new X.4XY
            r0.<init>(r1)
            r14.A04 = r0
            if (r47 == 0) goto L_0x01b7
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00f9
            java.util.List r0 = r6.A0Q
            int r8 = r0.size()
            r7 = 0
        L_0x0088:
            if (r7 >= r8) goto L_0x00f9
            X.3wM r0 = r6.A02(r7)
            java.util.List r0 = r0.A03
            java.util.Iterator r13 = r0.iterator()
        L_0x0094:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r13.next()
            X.3wK r0 = (X.C256773wK) r0
            java.util.List r0 = r0.A07
            java.util.Iterator r12 = r0.iterator()
        L_0x00a6:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r3 = r12.next()
            X.3wG r3 = (X.C256733wG) r3
            boolean r0 = r3 instanceof X.XOL
            if (r0 == 0) goto L_0x00a6
            X.3vz r2 = r3.A03
            r0 = r3
            X.XOL r0 = (X.XOL) r0
            java.lang.String r1 = r0.A01
            if (r2 == 0) goto L_0x00a6
            if (r1 == 0) goto L_0x00a6
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = r3.A03()
            android.net.Uri r11 = r2.A00(r0)
            byte[] r2 = android.util.Base64.decode(r1, r4)     // Catch:{ IllegalArgumentException -> 0x00e5 }
            X.28X r1 = r14.A08     // Catch:{ IllegalArgumentException -> 0x00e5 }
            int r0 = r2.length     // Catch:{ IllegalArgumentException -> 0x00e5 }
            r1.A00(r11, r10, r2, r0)     // Catch:{ IllegalArgumentException -> 0x00e5 }
            java.lang.String r2 = "Exo2DashLiveManifestFetcher"
            java.lang.String r1 = "Added inline for %s, uri=%s"
            java.lang.Object[] r0 = new java.lang.Object[]{r10, r11}     // Catch:{ IllegalArgumentException -> 0x00e5 }
            X.27B.A01(r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x00e5 }
            goto L_0x00a6
        L_0x00e5:
            r3 = move-exception
            java.lang.String r2 = "Exo2DashLiveManifestFetcher"
            java.lang.Object[] r1 = new java.lang.Object[]{r10, r11}
            java.lang.String r0 = "Invalid inline binary is given for %s, uri=%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.e(r2, r0, r3)
            goto L_0x00a6
        L_0x00f6:
            int r7 = r7 + 1
            goto L_0x0088
        L_0x00f9:
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "Exo2DashLiveManifestFetcher"
            long r0 = r6.A03
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r2}
            java.lang.String r2 = "Availability end time is %d, current time is %d"
            X.27B.A01(r3, r2, r7)
            r7 = 300000(0x493e0, double:1.482197E-318)
            long r0 = r0 + r7
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x01ac
            java.util.List r0 = r6.A0Q
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01ac
            X.3wM r0 = r6.A02(r4)
            java.util.List r0 = r0.A03
            java.util.Iterator r10 = r0.iterator()
            r2 = 0
        L_0x012d:
            r7 = r9
        L_0x012e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x017c
            java.lang.Object r9 = r10.next()
            X.3wK r9 = (X.C256773wK) r9
            java.util.List r8 = r9.A07
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x012e
            java.lang.Object r0 = r8.get(r4)
            X.3wG r0 = (X.C256733wG) r0
            X.3wB r0 = r0.A02
            java.lang.String r0 = r0.A0S
            if (r0 == 0) goto L_0x012e
            if (r2 != 0) goto L_0x0164
            java.lang.Object r0 = r8.get(r4)
            X.3wG r0 = (X.C256733wG) r0
            X.3wB r0 = r0.A02
            java.lang.String r1 = r0.A0S
            java.lang.String r0 = "video/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0164
            r2 = r9
            goto L_0x012e
        L_0x0164:
            if (r7 != 0) goto L_0x0179
            java.lang.Object r0 = r8.get(r4)
            X.3wG r0 = (X.C256733wG) r0
            X.3wB r0 = r0.A02
            java.lang.String r1 = r0.A0S
            java.lang.String r0 = "audio/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x012e
            goto L_0x012d
        L_0x0179:
            if (r2 == 0) goto L_0x012e
            goto L_0x0180
        L_0x017c:
            if (r2 == 0) goto L_0x01ac
            if (r7 == 0) goto L_0x01ac
        L_0x0180:
            java.util.List r2 = r2.A07
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x01ac
            java.util.List r1 = r7.A07
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01ac
            java.lang.Object r0 = r2.get(r4)
            X.3wG r0 = (X.C256733wG) r0
            X.4XE r0 = r0.A00()
            if (r0 == 0) goto L_0x01ac
            java.lang.Object r0 = r1.get(r4)
            X.3wG r0 = (X.C256733wG) r0
            X.4XE r0 = r0.A00()
            if (r0 == 0) goto L_0x01ac
            r14.A03(r6, r5, r4)
            return
        L_0x01ac:
            android.net.Uri r0 = r14.A06
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Manifest is too old, skip it: %s"
            X.27B.A01(r3, r0, r1)
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290485fO.<init>(android.content.Context, android.net.Uri, android.os.Handler, X.28X, X.27J, com.facebook.exoplayer.monitor.VpsEventCallback, X.3wn, X.28Y, com.facebook.video.heroplayer.setting.HeroPlayerSetting, X.3w6, java.lang.String, java.util.Map, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, int, long, boolean, boolean):void");
    }
}
