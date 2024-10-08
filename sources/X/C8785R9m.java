package X;

/* renamed from: X.R9m  reason: case insensitive filesystem */
public final class C8785R9m extends 2Cl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C13755TgR A03;
    public final /* synthetic */ LO3 A04;
    public final /* synthetic */ AnonymousClass3Q2 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public final int getRunnableId() {
        return 595;
    }

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        if (!this.A07) {
            this.A03.D6T();
        }
    }

    public C8785R9m(C13755TgR tgR, LO3 lo3, AnonymousClass3Q2 r3, String str, int i, int i2, long j, boolean z) {
        this.A07 = z;
        this.A04 = lo3;
        this.A05 = r3;
        this.A06 = str;
        this.A03 = tgR;
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARNING: type inference failed for: r23v4, types: [X.Q1d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r28v1, types: [X.Tgv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r30v2, types: [X.SsM, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r26v6, types: [java.lang.Object, X.TdG] */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r0 = new java.lang.Exception();
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x02db A[Catch:{ all -> 0x04bb, all -> 0x04c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x04a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r105 = this;
            java.lang.String r20 = "ClipsDefaultCoverPhotoGenerator"
            r3 = r105
            boolean r0 = r3.A07
            r9 = 0
            if (r0 == 0) goto L_0x04cb
            X.LO3 r5 = r3.A04
            X.3Q2 r14 = r3.A05
            java.lang.String r0 = r3.A06
            r104 = r0
            X.TgR r13 = r3.A03
            long r0 = r3.A02
            r102 = r0
            X.SOn r4 = new X.SOn
            r4.<init>()
            r0 = 720(0x2d0, float:1.009E-42)
            r4.A0C = r0
            r0 = 1280(0x500, float:1.794E-42)
            r4.A0A = r0
            r0 = 3000000(0x2dc6c0, float:4.203895E-39)
            r4.A01 = r0
            r0 = 0
            r4.A0B = r0
            r11 = 1
            r4.A0O = r11
            r1 = 5
            r4.A03 = r1
            X.51W r3 = r14.A1P
            if (r3 != 0) goto L_0x003a
            r13.D6T()
        L_0x0039:
            return r9
        L_0x003a:
            android.content.Context r12 = r5.A01
            com.instagram.common.session.UserSession r8 = r5.A02
            X.2Nn r24 = X.AnonymousClass830.A00(r12, r8)
            X.0Tu r10 = X.0Tu.A05
            r1 = 36327559239252483(0x810fb900033a03, double:3.0370329700185745E-306)
            boolean r27 = X.182.A06(r10, r8, r1)
            r21 = r12
            r22 = r8
            r23 = r3
            r25 = r0
            r26 = r0
            X.4aP r3 = X.AHJ.A00(r21, r22, r23, r24, r25, r26, r27)
            X.4aE r1 = X.C266714aE.VIDEO
            X.Lc0 r2 = new X.Lc0
            r2.<init>(r14, r0)
            r3.A03(r1, r2)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r6 = new com.facebook.videolite.transcoder.base.composition.MediaComposition
            r6.<init>(r3)
            java.util.HashMap r2 = r6.A00
            java.util.List r3 = X.Pxe.A1B(r1, r2)
            if (r3 == 0) goto L_0x007c
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x008c
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x008c
        L_0x007c:
            java.lang.String r1 = "empty video effects while calling ClipsDefaultCoverPhotoGenerator#generateDefaultCoverPhotoFromMediaComposition"
            r0 = r20
            X.0kD.A09(r0, r1, r9)
            X.THc r0 = new X.THc
            r0.<init>(r13, r5)
            X.11Z.A02(r0)
            return r9
        L_0x008c:
            java.util.Iterator r3 = r3.iterator()
        L_0x0090:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x007c
            java.lang.Object r2 = r3.next()
            X.SIO r2 = (X.SIO) r2
            com.facebook.videolite.transcoder.base.composition.MediaEffect r2 = r2.A01
            boolean r2 = r2 instanceof X.C64445Lc0
            if (r2 == 0) goto L_0x0090
            X.LQr r21 = X.C64152LQr.A00
            r23 = r0
            r24 = r0
            r26 = r11
            X.SJN r7 = r21.A01(r22, r23, r24, r25, r26)
            r2 = 36316190463496248(0x810562002c1038, double:3.029843310451946E-306)
            boolean r86 = X.182.A06(r10, r8, r2)
            boolean r2 = r7.A19
            r38 = r2
            boolean r2 = r7.A1E
            r39 = r2
            boolean r2 = r7.A1C
            r40 = r2
            boolean r2 = r7.A1D
            r41 = r2
            int r2 = r7.A00
            r24 = r2
            boolean r2 = r7.A0G
            r42 = r2
            boolean r2 = r7.A0J
            r43 = r2
            boolean r2 = r7.A0F
            r44 = r2
            boolean r2 = r7.A0H
            r45 = r2
            boolean r2 = r7.A0I
            r46 = r2
            java.lang.String r2 = r7.A0C
            r101 = r2
            boolean r2 = r7.A0K
            r47 = r2
            boolean r2 = r7.A18
            r48 = r2
            boolean r2 = r7.A0m
            r50 = r2
            boolean r2 = r7.A0b
            r52 = r2
            boolean r2 = r7.A14
            r53 = r2
            boolean r2 = r7.A0Q
            r54 = r2
            boolean r2 = r7.A0r
            r55 = r2
            boolean r2 = r7.A0e
            r56 = r2
            boolean r2 = r7.A0p
            r57 = r2
            boolean r2 = r7.A0s
            r58 = r2
            boolean r2 = r7.A0d
            r62 = r2
            boolean r2 = r7.A11
            r63 = r2
            boolean r2 = r7.A13
            r64 = r2
            boolean r2 = r7.A12
            r65 = r2
            boolean r2 = r7.A0y
            r66 = r2
            r25 = 1000(0x3e8, float:1.401E-42)
            boolean r2 = r7.A0g
            r67 = r2
            boolean r2 = r7.A0h
            r68 = r2
            boolean r2 = r7.A0f
            r69 = r2
            boolean r2 = r7.A0i
            r70 = r2
            boolean r2 = r7.A0w
            r71 = r2
            boolean r2 = r7.A0E
            r72 = r2
            boolean r2 = r7.A0j
            r73 = r2
            boolean r2 = r7.A0L
            r74 = r2
            boolean r2 = r7.A10
            r75 = r2
            int r2 = r7.A05
            r26 = r2
            int r2 = r7.A04
            r27 = r2
            boolean r2 = r7.A0T
            r76 = r2
            int r2 = r7.A02
            r28 = r2
            int r2 = r7.A01
            r29 = r2
            java.lang.String r10 = r7.A0D
            boolean r2 = r7.A0M
            r77 = r2
            boolean r2 = r7.A0U
            r79 = r2
            boolean r2 = r7.A0Y
            r80 = r2
            boolean r2 = r7.A0R
            r81 = r2
            boolean r2 = r7.A0W
            r83 = r2
            long r2 = r7.A06
            r32 = r2
            boolean r2 = r7.A0x
            r84 = r2
            long r2 = r7.A09
            r34 = r2
            long r2 = r7.A08
            r36 = r2
            boolean r2 = r7.A0a
            r85 = r2
            boolean r2 = r7.A0l
            r88 = r2
            boolean r2 = r7.A0P
            r90 = r2
            boolean r2 = r7.A0V
            r92 = r2
            boolean r2 = r7.A0t
            r23 = r2
            boolean r2 = r7.A15
            r22 = r2
            boolean r2 = r7.A0k
            r21 = r2
            boolean r2 = r7.A0O
            r19 = r2
            boolean r2 = r7.A16
            r18 = r2
            boolean r2 = r7.A1A
            r17 = r2
            long r15 = r7.A07
            boolean r3 = r7.A0q
            X.SJN r2 = new X.SJN
            r30 = r32
            r32 = r34
            r34 = r36
            r36 = r15
            r49 = r11
            r51 = r11
            r59 = r11
            r60 = r11
            r61 = r11
            r78 = r11
            r82 = r11
            r87 = r11
            r89 = r11
            r91 = r11
            r93 = r23
            r94 = r22
            r95 = r21
            r96 = r11
            r97 = r19
            r98 = r18
            r99 = r17
            r100 = r3
            r21 = r2
            r22 = r101
            r23 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34, r36, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100)
            X.SQv r3 = new X.SQv
            r3.<init>()
            r3.A06 = r4
            r3.A0H = r11
            r3.A08 = r6
            X.Q4k r2 = r2.A0B
            r3.A0B = r2
            X.RzN r7 = new X.RzN
            r7.<init>(r3)
            X.0rm r6 = X.C51965G9l.A11()
            X.Rwm r3 = new X.Rwm
            r2 = r104
            r3.<init>(r13, r5, r2, r6)
            X.Srk r27 = new X.Srk
            r27.<init>()
            boolean r2 = X.C59911Jba.A01(r14)
            X.AVr r4 = X.AAK.A01(r12, r8, r2, r0, r0)
            X.Q0h r2 = X.C9955RkA.A00
            X.Srw r8 = new X.Srw
            r8.<init>(r2, r11)
            X.SrY r26 = new X.SrY
            r26.<init>()
            X.Q1d r23 = new X.Q1d
            r23.<init>()
            X.Q4U r28 = new X.Q4U
            r28.<init>()
            X.Q1f r2 = new X.Q1f
            r2.<init>()
            X.SsN r5 = new X.SsN
            r5.<init>(r2, r4)
            X.Q1i r2 = new X.Q1i
            r2.<init>(r12, r0)
            X.SJL r25 = new X.SJL
            r25.<init>()
            X.SHx r4 = new X.SHx
            r21 = r4
            r22 = r12
            r24 = r2
            r29 = r8
            r30 = r7
            r31 = r5
            r32 = r3
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r6.A00 = r4
            java.lang.Long r2 = java.lang.Long.valueOf(r102)
            java.lang.Long[] r2 = new java.lang.Long[]{r2}
            java.util.List r22 = java.util.Arrays.asList(r2)
            r4.A04 = r9
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            r4.A05 = r2
            java.lang.System.nanoTime()
            java.util.Collections.sort(r22)
            r18 = -1
            boolean r2 = r4.A06     // Catch:{ all -> 0x04c1 }
            if (r2 != 0) goto L_0x0383
            android.content.Context r6 = r4.A07     // Catch:{ all -> 0x04c1 }
            X.Tfv r2 = r4.A09     // Catch:{ all -> 0x04c1 }
            r17 = r2
            X.ThT r8 = r4.A0E     // Catch:{ all -> 0x04c1 }
            X.TdI r7 = r4.A0C     // Catch:{ all -> 0x04c1 }
            X.Tgv r5 = r4.A0D     // Catch:{ all -> 0x04c1 }
            X.SsM r30 = new X.SsM     // Catch:{ all -> 0x04c1 }
            r30.<init>()     // Catch:{ all -> 0x04c1 }
            X.RzN r3 = r4.A01     // Catch:{ all -> 0x04c1 }
            X.Q1d r2 = r4.A08     // Catch:{ all -> 0x04c1 }
            r16 = r2
            java.io.File r10 = r6.getCacheDir()     // Catch:{ all -> 0x04c1 }
            java.lang.String r2 = "transcodeCache"
            java.io.File r32 = X.JTO.A0s(r10, r2)     // Catch:{ all -> 0x04c1 }
            java.lang.Integer r33 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x04c1 }
            X.SRI r2 = new X.SRI     // Catch:{ all -> 0x04c1 }
            r23 = r2
            r24 = r6
            r25 = r16
            r26 = r17
            r27 = r7
            r28 = r5
            r29 = r8
            r31 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x04c1 }
            X.RzN r3 = r4.A01     // Catch:{ all -> 0x04c1 }
            X.Q4k r8 = r3.A0B     // Catch:{ all -> 0x04c1 }
            boolean r3 = r8 instanceof X.C7964QeC     // Catch:{ all -> 0x04c1 }
            if (r3 == 0) goto L_0x02c9
            X.QeC r8 = (X.C7964QeC) r8     // Catch:{ all -> 0x04c1 }
            int r3 = r8.A00     // Catch:{ all -> 0x04c1 }
            int r3 = 1 - r3
            if (r3 != 0) goto L_0x02c9
            java.lang.Object r3 = r8.A01     // Catch:{ all -> 0x04c1 }
            X.SJN r3 = (X.SJN) r3     // Catch:{ all -> 0x04c1 }
            boolean r3 = r3.A0z     // Catch:{ all -> 0x04c1 }
        L_0x02bc:
            com.facebook.videolite.transcoder.base.composition.MediaComposition r3 = r2.A03(r3)     // Catch:{ all -> 0x04c1 }
            X.RzN r2 = r4.A01     // Catch:{ all -> 0x04c1 }
            X.RzN r2 = X.SQv.A00(r3, r2)     // Catch:{ all -> 0x04c1 }
            r4.A01 = r2     // Catch:{ all -> 0x04c1 }
            goto L_0x02cb
        L_0x02c9:
            r3 = 0
            goto L_0x02bc
        L_0x02cb:
            X.TdQ r12 = r4.A0G     // Catch:{ all -> 0x04bb }
            boolean r3 = X.SRj.A04(r2)     // Catch:{ all -> 0x04bb }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = r2.A08     // Catch:{ all -> 0x04bb }
            X.Tfw r8 = r12.ALN(r2, r3)     // Catch:{ all -> 0x04bb }
            boolean r2 = r8 instanceof X.C12370SsJ     // Catch:{ all -> 0x04bb }
            if (r2 == 0) goto L_0x04a6
            X.Tie r2 = r8.ALy()     // Catch:{ all -> 0x04bb }
            X.Q1G r2 = (X.Q1G) r2     // Catch:{ all -> 0x04bb }
            r4.A02 = r2     // Catch:{ all -> 0x04bb }
            X.RzN r2 = r4.A01     // Catch:{ all -> 0x04bb }
            X.SOn r2 = r2.A06     // Catch:{ all -> 0x04bb }
            r13 = 0
            boolean r10 = X.AnonymousClass7TF.A1V(r2)
            java.lang.String r3 = "MediaTranscodeParams should not be null"
            X.C266784aL.A06(r10, r3)     // Catch:{ all -> 0x04bb }
            X.RuS r15 = r4.A0F     // Catch:{ all -> 0x04bb }
            int r14 = r2.A0C     // Catch:{ all -> 0x04bb }
            int r10 = r2.A0A     // Catch:{ all -> 0x04bb }
            java.lang.String r2 = "OffscreenOutput"
            X.7uz r3 = new X.7uz     // Catch:{ all -> 0x04bb }
            r3.<init>(r2)     // Catch:{ all -> 0x04bb }
            X.7v0 r2 = new X.7v0     // Catch:{ all -> 0x04bb }
            r2.<init>(r3)     // Catch:{ all -> 0x04bb }
            r15.A02 = r2     // Catch:{ all -> 0x04bb }
            r2.A00(r14, r10)     // Catch:{ all -> 0x04bb }
            X.7v0 r2 = r15.A02     // Catch:{ all -> 0x04bb }
            int r3 = r2.A00     // Catch:{ all -> 0x04bb }
            android.graphics.SurfaceTexture r2 = new android.graphics.SurfaceTexture     // Catch:{ all -> 0x04bb }
            r2.<init>(r3)     // Catch:{ all -> 0x04bb }
            r15.A00 = r2     // Catch:{ all -> 0x04bb }
            r2.setDefaultBufferSize(r14, r10)     // Catch:{ all -> 0x04bb }
            android.graphics.SurfaceTexture r2 = r15.A00     // Catch:{ all -> 0x04bb }
            android.view.Surface r14 = new android.view.Surface     // Catch:{ all -> 0x04bb }
            r14.<init>(r2)     // Catch:{ all -> 0x04bb }
            r15.A01 = r14     // Catch:{ all -> 0x04bb }
            X.Q1G r10 = r4.A02     // Catch:{ all -> 0x04bb }
            X.RzN r2 = r4.A01     // Catch:{ all -> 0x04bb }
            X.SOn r3 = r2.A06     // Catch:{ all -> 0x04bb }
            X.Q4k r2 = r2.A0B     // Catch:{ all -> 0x04bb }
            r23 = r10
            r25 = r14
            r26 = r3
            r27 = r9
            r28 = r2
            r23.A00(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x04bb }
            X.RzN r3 = r4.A01     // Catch:{ all -> 0x04bb }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = r3.A08     // Catch:{ all -> 0x04bb }
            if (r2 == 0) goto L_0x033b
            r13 = 1
        L_0x033b:
            java.lang.String r2 = "Input should be given as MediaComposition"
            X.C266784aL.A06(r13, r2)     // Catch:{ all -> 0x04bb }
            X.Tfu r10 = X.C9935Rjo.A00     // Catch:{ all -> 0x04bb }
            r2 = r17
            X.S30 r5 = X.S30.A00(r6, r2, r7, r5, r12)     // Catch:{ all -> 0x04bb }
            r5.A01 = r10     // Catch:{ all -> 0x04bb }
            X.SrO r26 = new X.SrO     // Catch:{ all -> 0x04bb }
            r26.<init>()     // Catch:{ all -> 0x04bb }
            X.SJL r6 = r4.A0A     // Catch:{ all -> 0x04bb }
            X.Q1G r2 = r4.A02     // Catch:{ all -> 0x04bb }
            X.RyW r30 = new X.RyW     // Catch:{ all -> 0x04bb }
            r31 = r9
            r32 = r9
            r33 = r9
            r34 = r9
            r35 = r9
            r36 = r9
            r37 = r2
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x04bb }
            X.SU1 r2 = new X.SU1     // Catch:{ all -> 0x04bb }
            r23 = r2
            r24 = r16
            r25 = r9
            r27 = r17
            r28 = r6
            r29 = r9
            r31 = r3
            r32 = r8
            r33 = r5
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x04bb }
            r4.A00 = r2     // Catch:{ all -> 0x04bb }
            r4.A06 = r11     // Catch:{ all -> 0x04bb }
            r4.A04 = r9     // Catch:{ all -> 0x04bb }
        L_0x0383:
            X.SU1 r6 = r4.A00     // Catch:{ all -> 0x04c1 }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x04c1 }
            java.lang.String r3 = "preparePlayer"
            java.lang.String r2 = "MultipleTrackCoordinatorRealtime"
            X.Q1V.A00(r2, r3, r5)     // Catch:{ all -> 0x04c1 }
            java.util.HashSet r2 = X.AnonymousClass7TE.A1F()     // Catch:{ all -> 0x04c1 }
            r6.A0C(r9, r2)     // Catch:{ all -> 0x04c1 }
            r10 = 0
            X.SU1 r5 = r4.A00     // Catch:{ all -> 0x04c1 }
            r2 = r22
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x04c1 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x04c1 }
            long r2 = r0.longValue()     // Catch:{ all -> 0x04c1 }
            r5.A0B(r2)     // Catch:{ all -> 0x04c1 }
            int r0 = r22.size()     // Catch:{ all -> 0x04c1 }
        L_0x03ac:
            if (r10 >= r0) goto L_0x0492
            r2 = r22
            java.lang.Object r12 = r2.get(r10)     // Catch:{ all -> 0x04c1 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x04c1 }
            java.util.concurrent.atomic.AtomicBoolean r2 = r4.A0I     // Catch:{ all -> 0x04c1 }
            boolean r2 = r2.get()     // Catch:{ all -> 0x04c1 }
            if (r2 != 0) goto L_0x0039
            long r18 = r12.longValue()     // Catch:{ all -> 0x04c1 }
            X.SU1 r15 = r4.A00     // Catch:{ all -> 0x04c1 }
            long r5 = r12.longValue()     // Catch:{ all -> 0x04c1 }
            X.Q14 r2 = r15.A08     // Catch:{ all -> 0x04c1 }
            if (r2 == 0) goto L_0x03cf
            r2.A01(r5)     // Catch:{ all -> 0x04c1 }
        L_0x03cf:
            X.Q14 r2 = r15.A07     // Catch:{ all -> 0x04c1 }
            if (r2 == 0) goto L_0x03d6
            r2.A01(r5)     // Catch:{ all -> 0x04c1 }
        L_0x03d6:
            X.SU1.A05(r1, r15, r9, r5)     // Catch:{ all -> 0x04c1 }
            X.SU1.A04(r1, r15, r5, r11)     // Catch:{ all -> 0x04c1 }
            java.util.Map r3 = r15.A0R     // Catch:{ all -> 0x04c1 }
            X.RzN r14 = r15.A0M     // Catch:{ all -> 0x04c1 }
            X.Q4k r2 = r14.A0B     // Catch:{ all -> 0x04c1 }
            java.util.ArrayList r2 = X.SPy.A02(r1, r2, r3, r5)     // Catch:{ all -> 0x04c1 }
            java.util.Iterator r21 = r2.iterator()     // Catch:{ all -> 0x04c1 }
        L_0x03ea:
            boolean r2 = r21.hasNext()     // Catch:{ all -> 0x04c1 }
            if (r2 == 0) goto L_0x0417
            java.lang.Object r2 = r21.next()     // Catch:{ all -> 0x04c1 }
            int r3 = X.Pxe.A09(r2)     // Catch:{ all -> 0x04c1 }
            X.Tia r13 = r15.A08(r1, r3)     // Catch:{ all -> 0x04c1 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = r14.A08     // Catch:{ all -> 0x04c1 }
            r2.getClass()     // Catch:{ all -> 0x04c1 }
            X.4aM r2 = r2.A04(r1, r3)     // Catch:{ all -> 0x04c1 }
            if (r2 == 0) goto L_0x04ae
            long r7 = r2.A00     // Catch:{ all -> 0x04c1 }
            r16 = 0
            int r2 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0411
            r7 = 0
        L_0x0411:
            long r2 = r5 - r7
            r13.ANu(r2)     // Catch:{ all -> 0x04c1 }
            goto L_0x03ea
        L_0x0417:
            X.RyW r2 = r15.A0L     // Catch:{ all -> 0x04c1 }
            java.util.Map r2 = r2.A07     // Catch:{ all -> 0x04c1 }
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r2)     // Catch:{ all -> 0x04c1 }
        L_0x041f:
            boolean r2 = r3.hasNext()     // Catch:{ all -> 0x04c1 }
            if (r2 == 0) goto L_0x042f
            java.lang.Object r2 = X.C51971G9r.A0p(r3)     // Catch:{ all -> 0x04c1 }
            X.Q1G r2 = (X.Q1G) r2     // Catch:{ all -> 0x04c1 }
            r2.EF4(r5)     // Catch:{ all -> 0x04c1 }
            goto L_0x041f
        L_0x042f:
            X.Q1G r5 = r4.A02     // Catch:{ all -> 0x04c1 }
            long r2 = r12.longValue()     // Catch:{ all -> 0x04c1 }
            r5.EF4(r2)     // Catch:{ all -> 0x04c1 }
            long r2 = r12.longValue()     // Catch:{ all -> 0x04c1 }
            r7 = 0
            X.Q1G r5 = r4.A02     // Catch:{ Exception -> 0x0485 }
            X.Tid r5 = r5.A00     // Catch:{ Exception -> 0x0485 }
            r5.getClass()     // Catch:{ Exception -> 0x0485 }
            android.graphics.Bitmap r7 = r5.EJv()     // Catch:{ Exception -> 0x0485 }
            X.Rwm r13 = r4.A03     // Catch:{ Exception -> 0x0485 }
            X.0rm r12 = X.C51965G9l.A11()     // Catch:{ Exception -> 0x0485 }
            X.LO3 r8 = r13.A01     // Catch:{ Exception -> 0x0485 }
            java.lang.String r6 = r13.A02     // Catch:{ Exception -> 0x0485 }
            int r5 = r7.getWidth()     // Catch:{ Exception -> 0x0485 }
            java.lang.String r5 = X.LO3.A00(r7, r8, r6, r5)     // Catch:{ Exception -> 0x0485 }
            r12.A00 = r5     // Catch:{ Exception -> 0x0485 }
            X.0rm r5 = r13.A03     // Catch:{ Exception -> 0x0468 }
            java.lang.Object r5 = r5.A00     // Catch:{ Exception -> 0x0468 }
            X.SHx r5 = (X.C11263SHx) r5     // Catch:{ Exception -> 0x0468 }
            if (r5 == 0) goto L_0x0470
            r5.A01()     // Catch:{ Exception -> 0x0468 }
            goto L_0x0470
        L_0x0468:
            r14 = move-exception
            java.lang.String r6 = "frameRetriever?.release() failed"
            r5 = r20
            X.0kD.A09(r5, r6, r14)     // Catch:{ all -> 0x047f }
        L_0x0470:
            X.0rm r5 = r13.A03     // Catch:{ Exception -> 0x0485 }
            r5.A00 = r9     // Catch:{ Exception -> 0x0485 }
            X.TgR r6 = r13.A00     // Catch:{ Exception -> 0x0485 }
            X.TJF r5 = new X.TJF     // Catch:{ Exception -> 0x0485 }
            r5.<init>(r6, r8, r12)     // Catch:{ Exception -> 0x0485 }
            X.11Z.A02(r5)     // Catch:{ Exception -> 0x0485 }
            goto L_0x0489
        L_0x047f:
            r6 = move-exception
            X.0rm r5 = r13.A03     // Catch:{ Exception -> 0x0485 }
            r5.A00 = r9     // Catch:{ Exception -> 0x0485 }
            throw r6     // Catch:{ Exception -> 0x0485 }
        L_0x0485:
            r5 = move-exception
            X.C11263SHx.A00(r4, r5, r2)     // Catch:{ all -> 0x04b4 }
        L_0x0489:
            if (r7 == 0) goto L_0x048e
            r7.recycle()     // Catch:{ all -> 0x04c1 }
        L_0x048e:
            int r10 = r10 + 1
            goto L_0x03ac
        L_0x0492:
            X.RzN r0 = r4.A01     // Catch:{ all -> 0x04c1 }
            X.Ti9 r1 = r0.A07     // Catch:{ all -> 0x04c1 }
            if (r1 == 0) goto L_0x049d
            java.util.List r0 = r4.A0H     // Catch:{ all -> 0x04c1 }
            r1.D5E(r0)     // Catch:{ all -> 0x04c1 }
        L_0x049d:
            java.lang.Boolean r0 = r4.A04     // Catch:{ all -> 0x04c1 }
            if (r0 != 0) goto L_0x0039
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x04c1 }
            r4.A04 = r0     // Catch:{ all -> 0x04c1 }
            goto L_0x04c0
        L_0x04a6:
            java.lang.String r1 = "Incompatible transcoder"
            X.4ZS r0 = new X.4ZS     // Catch:{ all -> 0x04bb }
            r0.<init>(r1)     // Catch:{ all -> 0x04bb }
            throw r0     // Catch:{ all -> 0x04bb }
        L_0x04ae:
            X.Qe5 r0 = new X.Qe5     // Catch:{ all -> 0x04c1 }
            r0.<init>()     // Catch:{ all -> 0x04c1 }
            goto L_0x04bf
        L_0x04b4:
            r0 = move-exception
            if (r7 == 0) goto L_0x04bf
            r7.recycle()     // Catch:{ all -> 0x04c1 }
            goto L_0x04bf
        L_0x04bb:
            r0 = move-exception
            r4.A01()     // Catch:{ all -> 0x04c1 }
        L_0x04bf:
            throw r0     // Catch:{ all -> 0x04c1 }
        L_0x04c0:
            return r9
        L_0x04c1:
            r2 = move-exception
            r0 = r18
            X.C11263SHx.A00(r4, r2, r0)     // Catch:{ all -> 0x04c8 }
            goto L_0x04ca
        L_0x04c8:
            r0 = move-exception
            throw r0
        L_0x04ca:
            return r9
        L_0x04cb:
            X.LO3 r2 = r3.A04     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            X.3Q2 r7 = r3.A05     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            java.lang.String r1 = r3.A06     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            int r12 = r3.A01     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            int r13 = r3.A00     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            long r14 = r3.A02     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            int r6 = r7.A0H     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r10 = r7.A0r     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            r5 = 1
            r3 = 0
            r4 = 0
            X.8J0 r0 = r7.A12     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r10 == 0) goto L_0x057a
            if (r0 == 0) goto L_0x04e5
            goto L_0x04e7
        L_0x04e5:
            r8 = r9
            goto L_0x04e9
        L_0x04e7:
            X.8JI r8 = r0.A03     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
        L_0x04e9:
            X.8JI r0 = X.AnonymousClass8JI.SEQUENTIAL_REMIX     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r8 != r0) goto L_0x0534
            X.4aE r0 = X.C266714aE.VIDEO     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            java.util.HashMap r0 = r10.A07(r0)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r0 == 0) goto L_0x0534
            int r0 = r0.size()     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r0 <= r5) goto L_0x0534
        L_0x04fb:
            com.facebook.videolite.transcoder.base.composition.MediaComposition r7 = r7.A0r     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r7 == 0) goto L_0x05bc
            X.4aE r0 = X.C266714aE.VIDEO     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            X.4aM r0 = r7.A04(r0, r5)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r0 == 0) goto L_0x05bc
            java.util.List r0 = r0.A04     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            java.lang.Object r0 = r7.get(r3)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            X.4aI r0 = (X.C266754aI) r0     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            boolean r0 = r0.A01(r3)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r0 == 0) goto L_0x0536
            java.lang.Object r0 = r7.get(r3)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            X.4aI r0 = (X.C266754aI) r0     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            java.io.File r0 = r0.A04     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r0 == 0) goto L_0x0532
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
        L_0x0527:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r0 == 0) goto L_0x05bc
            java.lang.String r4 = X.LO3.A00(r0, r2, r1, r6)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            return r4
        L_0x0532:
            r0 = r9
            goto L_0x0527
        L_0x0534:
            r5 = 0
            goto L_0x04fb
        L_0x0536:
            java.lang.Object r0 = r7.get(r3)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            X.4aI r0 = (X.C266754aI) r0     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            java.io.File r0 = r0.A04     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r0 == 0) goto L_0x05bc
            if (r12 <= 0) goto L_0x055d
            if (r13 <= 0) goto L_0x055d
            java.lang.String r11 = X.JTP.A0u(r0)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            java.lang.Object r0 = r7.get(r3)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            X.4aI r0 = (X.C266754aI) r0     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            X.4aF r3 = r0.A03     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            long r14 = r3.A03(r0)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            com.instagram.common.session.UserSession r10 = r2.A02     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            android.graphics.Bitmap r3 = X.C39908AIz.A00(r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            goto L_0x05b0
        L_0x055d:
            java.lang.String r5 = X.JTP.A0u(r0)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            java.lang.Object r0 = r7.get(r3)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            X.4aI r0 = (X.C266754aI) r0     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            X.4aF r3 = r0.A03     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            long r3 = r3.A03(r0)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            android.graphics.Bitmap r0 = X.C39908AIz.A01(r5, r3)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r0 == 0) goto L_0x05bb
            java.lang.String r4 = X.LO3.A00(r0, r2, r1, r6)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            return r4
        L_0x057a:
            if (r0 == 0) goto L_0x057d
            goto L_0x057f
        L_0x057d:
            r3 = r9
            goto L_0x0581
        L_0x057f:
            X.8JI r3 = r0.A03     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
        L_0x0581:
            X.8JI r0 = X.AnonymousClass8JI.SEQUENTIAL_REMIX     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r3 != r0) goto L_0x05a3
            java.util.List r0 = r7.A4J     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r0 == 0) goto L_0x05a3
            int r0 = r0.size()     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r0 <= r5) goto L_0x05a3
            java.util.List r0 = r7.A4J     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r0 == 0) goto L_0x059e
            java.lang.Object r0 = r0.get(r5)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            X.4aA r0 = (X.C266684aA) r0     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            java.lang.String r11 = r0.A0C     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r11 != 0) goto L_0x05aa
            return r4
        L_0x059e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            throw r0     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
        L_0x05a3:
            com.instagram.pendingmedia.model.ClipInfo r0 = r7.A1N     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            java.lang.String r11 = r0.A0F     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            if (r11 != 0) goto L_0x05aa
            return r4
        L_0x05aa:
            com.instagram.common.session.UserSession r10 = r2.A02     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            android.graphics.Bitmap r3 = X.C39908AIz.A00(r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
        L_0x05b0:
            if (r3 == 0) goto L_0x05bb
            int r0 = r3.getWidth()     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            java.lang.String r4 = X.LO3.A00(r3, r2, r1, r0)     // Catch:{ IOException -> 0x05c1, FileNotFoundException -> 0x05bd, NullPointerException -> 0x05c5 }
            return r4
        L_0x05bb:
            r4 = 0
        L_0x05bc:
            return r4
        L_0x05bd:
            r2 = move-exception
            java.lang.String r1 = "FileNotFoundException calling ClipsDefaultCoverPhotoGenerator#generateAndSaveDefaultCoverPhoto"
            goto L_0x05c8
        L_0x05c1:
            r2 = move-exception
            java.lang.String r1 = "IOException calling ClipsDefaultCoverPhotoGenerator#generateAndSaveDefaultCoverPhoto"
            goto L_0x05c8
        L_0x05c5:
            r2 = move-exception
            java.lang.String r1 = "NullPointerException calling ClipsDefaultCoverPhotoGenerator#generateAndSaveDefaultCoverPhoto"
        L_0x05c8:
            r0 = r20
            X.0kD.A09(r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8785R9m.call():java.lang.Object");
    }

    public final void onCancel() {
        this.A04.A00 = AnonymousClass7TE.A0v();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str = (String) obj;
        if (!this.A07) {
            C13755TgR tgR = this.A03;
            if (str != null) {
                tgR.D82(str);
            } else {
                tgR.D6T();
            }
        }
    }
}
