package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.9lR  reason: invalid class name and case insensitive filesystem */
public final class C386959lR extends 0ng {
    public final ImmutableList A00;
    public final UserSession A01;
    public final AnonymousClass833 A02;
    public final AnonymousClass2Fj A03;
    public volatile boolean A04;
    public final /* synthetic */ AnonymousClass8IR A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386959lR(AnonymousClass2Fj r5, ImmutableList immutableList, UserSession userSession, AnonymousClass8IR r8) {
        super(73, 3, true, false);
        this.A05 = r8;
        this.A01 = userSession;
        this.A00 = immutableList;
        this.A03 = r5;
        this.A02 = new AnonymousClass833(userSession);
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r46 = this;
            r7 = r46
            X.833 r0 = r7.A02     // Catch:{ 8Af -> 0x03d7 }
            r45 = r0
            X.8IR r1 = r7.A05     // Catch:{ 8Af -> 0x03d7 }
            android.content.Context r0 = r1.A01     // Catch:{ 8Af -> 0x03d7 }
            r44 = r0
            X.2Nn r8 = r1.A02     // Catch:{ 8Af -> 0x03d7 }
            java.util.concurrent.ExecutorService r0 = r1.A04     // Catch:{ 8Af -> 0x03d7 }
            r43 = r0
            com.google.common.collect.ImmutableList r0 = r7.A00     // Catch:{ 8Af -> 0x03d7 }
            r42 = r0
            r21 = 0
            r15 = 0
            r6 = 1
            X.0qQ.A0B(r8, r6)     // Catch:{ 8Af -> 0x03d7 }
            r10 = 2
            r0 = r43
            X.0qQ.A0B(r0, r10)     // Catch:{ 8Af -> 0x03d7 }
            boolean r0 = r42.isEmpty()     // Catch:{ 8Af -> 0x03d7 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03c9
            r0 = r42
            java.lang.Object r0 = r0.get(r15)     // Catch:{ IOException -> 0x03c2 }
            X.51M r0 = (X.AnonymousClass51M) r0     // Catch:{ IOException -> 0x03c2 }
            X.51R r0 = r0.A0F     // Catch:{ IOException -> 0x03c2 }
            java.lang.String r0 = r0.A0F     // Catch:{ IOException -> 0x03c2 }
            java.io.File r2 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ IOException -> 0x03c2 }
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x03c2 }
            java.lang.String r0 = "stitched"
            r1.append(r0)     // Catch:{ IOException -> 0x03c2 }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IOException -> 0x03c2 }
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)     // Catch:{ IOException -> 0x03c2 }
            java.io.File r19 = X.C39907AIy.A01(r8, r2, r0)     // Catch:{ IOException -> 0x03c2 }
            int r0 = r42.size()     // Catch:{ 8Af -> 0x03d7 }
            if (r0 != r6) goto L_0x0084
            r0 = r42
            java.lang.Object r3 = r0.get(r15)     // Catch:{ 8Af -> 0x03d7 }
            X.51M r3 = (X.AnonymousClass51M) r3     // Catch:{ 8Af -> 0x03d7 }
            boolean r0 = r3.A0R     // Catch:{ 8Af -> 0x03d7 }
            if (r0 == 0) goto L_0x0084
            X.51R r0 = r3.A0F     // Catch:{ 8Af -> 0x03d7 }
            int r2 = r0.A04     // Catch:{ 8Af -> 0x03d7 }
            int r1 = r3.A08     // Catch:{ 8Af -> 0x03d7 }
            int r0 = r3.A09     // Catch:{ 8Af -> 0x03d7 }
            int r1 = r1 - r0
            if (r2 != r1) goto L_0x0084
            r0 = r42
            java.lang.Object r0 = r0.get(r15)     // Catch:{ IOException -> 0x03d0 }
            X.51M r0 = (X.AnonymousClass51M) r0     // Catch:{ IOException -> 0x03d0 }
            X.51R r0 = r0.A0F     // Catch:{ IOException -> 0x03d0 }
            java.lang.String r0 = r0.A0F     // Catch:{ IOException -> 0x03d0 }
            java.io.File r1 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ IOException -> 0x03d0 }
            r0 = r19
            X.0b9.A01(r1, r0)     // Catch:{ IOException -> 0x03d0 }
            goto L_0x0353
        L_0x0084:
            r42.size()     // Catch:{ 8Af -> 0x03d7 }
            r0 = r45
            com.instagram.common.session.UserSession r0 = r0.A00     // Catch:{ 8Af -> 0x03d7 }
            X.8A2 r5 = X.AnonymousClass8A1.A01(r0)     // Catch:{ 8Af -> 0x03d7 }
            int r9 = r42.size()     // Catch:{ 8Af -> 0x03d7 }
            X.1QP r3 = r5.A0J     // Catch:{ 8Af -> 0x03d7 }
            java.lang.String r2 = "stitcher"
            r1 = 838611363(0x31fc31a3, float:7.3398083E-9)
            X.AE4 r4 = r3.A01(r2, r1)     // Catch:{ 8Af -> 0x03d7 }
            java.lang.String r1 = "num_segments"
            r4.A05(r1, r9)     // Catch:{ 8Af -> 0x03d7 }
            java.lang.String r3 = "use_fb_transcoder"
            java.util.Map r2 = r4.A04     // Catch:{ 8Af -> 0x03d7 }
            java.lang.String r1 = java.lang.String.valueOf(r15)     // Catch:{ 8Af -> 0x03d7 }
            r2.put(r3, r1)     // Catch:{ 8Af -> 0x03d7 }
            long r1 = r4.A01()     // Catch:{ 8Af -> 0x03d7 }
            r5.A0C = r1     // Catch:{ 8Af -> 0x03d7 }
            X.AVe r18 = new X.AVe     // Catch:{ 8Af -> 0x03d7 }
            r3 = r18
            r2 = r45
            r1 = r44
            r3.<init>(r1, r2, r8)     // Catch:{ 8Af -> 0x03d7 }
            X.3kO r16 = r42.iterator()     // Catch:{ IOException -> 0x03bb }
            X.0qQ.A07(r16)     // Catch:{ IOException -> 0x03bb }
        L_0x00c6:
            boolean r1 = r16.hasNext()     // Catch:{ IOException -> 0x03bb }
            if (r1 == 0) goto L_0x01dd
            java.lang.Object r2 = r16.next()     // Catch:{ IOException -> 0x03bb }
            X.51M r2 = (X.AnonymousClass51M) r2     // Catch:{ IOException -> 0x03bb }
            X.0qQ.A0A(r2)     // Catch:{ IOException -> 0x03bb }
            X.7rW r1 = X.C343457qF.A00(r0)     // Catch:{ IOException -> 0x03bb }
            X.7r6 r3 = r1.A00     // Catch:{ IOException -> 0x03bb }
            r1 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r23 = r3.Ar6(r1)     // Catch:{ IOException -> 0x03bb }
            X.0qQ.A0B(r2, r6)     // Catch:{ IOException -> 0x03bb }
            X.51R r3 = r2.A0F     // Catch:{ IOException -> 0x03bb }
            java.lang.String r1 = r3.A0F     // Catch:{ IOException -> 0x03bb }
            java.io.File r9 = X.AnonymousClass7TE.A0t(r1)     // Catch:{ IOException -> 0x03bb }
            float r1 = r2.A00     // Catch:{ IOException -> 0x03bb }
            r5 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00c6
            java.lang.String r1 = r3.A0F     // Catch:{ IOException -> 0x03bb }
            java.io.File r4 = X.AnonymousClass7TE.A0t(r1)     // Catch:{ IOException -> 0x03bb }
            java.lang.String r1 = "adjusted"
            java.io.File r11 = X.C39907AIy.A01(r8, r4, r1)     // Catch:{ IOException -> 0x03bb }
            boolean r1 = r11.exists()     // Catch:{ IOException -> 0x03bb }
            if (r1 != 0) goto L_0x00c6
            int r14 = r3.A09     // Catch:{ IOException -> 0x03bb }
            int r13 = r3.A05     // Catch:{ IOException -> 0x03bb }
            int r12 = r3.A02     // Catch:{ IOException -> 0x03bb }
            float r1 = r2.A00     // Catch:{ IOException -> 0x03bb }
            float r4 = java.lang.Math.abs(r1)     // Catch:{ IOException -> 0x03bb }
            X.0Tu r3 = X.0Tu.A05     // Catch:{ IOException -> 0x03bb }
            r1 = 36324179099922271(0x810ca600022f5f, double:3.03489535629542E-306)
            boolean r37 = X.182.A06(r3, r0, r1)     // Catch:{ IOException -> 0x03bb }
            r1 = 36324179100446564(0x810ca6000a2f64, double:3.034895356626985E-306)
            boolean r38 = X.182.A06(r3, r0, r1)     // Catch:{ IOException -> 0x03bb }
            r1 = 36324179101495153(0x810ca6001a2f71, double:3.034895357290117E-306)
            boolean r39 = X.182.A06(r3, r0, r1)     // Catch:{ IOException -> 0x03bb }
            r1 = 36324179101101931(0x810ca600142f6b, double:3.0348953570414415E-306)
            boolean r40 = X.182.A06(r3, r0, r1)     // Catch:{ IOException -> 0x03bb }
            r1 = 36605654077019425(0x820ca600081521, double:3.212901265220419E-306)
            long r31 = X.182.A01(r3, r0, r1)     // Catch:{ IOException -> 0x03bb }
            r1 = 36324179101888375(0x810ca600202f77, double:3.034895357538792E-306)
            boolean r41 = X.182.A06(r3, r0, r1)     // Catch:{ IOException -> 0x03bb }
            r28 = -1
            X.0qQ.A0B(r9, r10)     // Catch:{ IOException -> 0x03bb }
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0158
            r1 = 0
            r2 = r1
            r22 = r1
            goto L_0x01b5
        L_0x0158:
            X.4aH r1 = new X.4aH     // Catch:{ IOException -> 0x03bb }
            r1.<init>(r9)     // Catch:{ IOException -> 0x03bb }
            X.4aI r3 = r1.A00()     // Catch:{ IOException -> 0x03bb }
            X.4aE r2 = X.C266714aE.AUDIO     // Catch:{ IOException -> 0x03bb }
            X.4aJ r1 = new X.4aJ     // Catch:{ IOException -> 0x03bb }
            r1.<init>(r2)     // Catch:{ IOException -> 0x03bb }
            r1.A02(r3)     // Catch:{ IOException -> 0x03bb }
            r1.A00(r4)     // Catch:{ IOException -> 0x03bb }
            X.4aM r2 = new X.4aM     // Catch:{ IOException -> 0x03bb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x03bb }
            X.4aE r5 = X.C266714aE.VIDEO     // Catch:{ IOException -> 0x03bb }
            X.4aJ r1 = new X.4aJ     // Catch:{ IOException -> 0x03bb }
            r1.<init>(r5)     // Catch:{ IOException -> 0x03bb }
            r1.A02(r3)     // Catch:{ IOException -> 0x03bb }
            r1.A00(r4)     // Catch:{ IOException -> 0x03bb }
            X.4aM r3 = new X.4aM     // Catch:{ IOException -> 0x03bb }
            r3.<init>(r1)     // Catch:{ IOException -> 0x03bb }
            X.4aP r1 = new X.4aP     // Catch:{ IOException -> 0x03bb }
            r1.<init>()     // Catch:{ IOException -> 0x03bb }
            r1.A04(r2)     // Catch:{ IOException -> 0x03bb }
            r1.A04(r3)     // Catch:{ IOException -> 0x03bb }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = new com.facebook.videolite.transcoder.base.composition.MediaComposition     // Catch:{ IOException -> 0x03bb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x03bb }
            X.SF8 r3 = new X.SF8     // Catch:{ IOException -> 0x03bb }
            r3.<init>()     // Catch:{ IOException -> 0x03bb }
            X.SFQ r1 = new X.SFQ     // Catch:{ IOException -> 0x03bb }
            r1.<init>(r3)     // Catch:{ IOException -> 0x03bb }
            r3 = r44
            X.SOn r22 = X.C9606Rdk.A00(r3, r9, r15)     // Catch:{ IOException -> 0x03bb }
            if (r22 != 0) goto L_0x01aa
            r22 = 0
            goto L_0x01b5
        L_0x01aa:
            r24 = r21
            r25 = r14
            r26 = r13
            r27 = r6
            X.SRj.A03(r22, r23, r24, r25, r26, r27)     // Catch:{ IOException -> 0x03bb }
        L_0x01b5:
            r23 = r18
            r24 = r2
            r25 = r1
            r26 = r9
            r27 = r43
            r29 = r12
            r30 = r6
            r33 = r15
            r34 = r15
            r35 = r15
            r36 = r15
            r20 = r44
            java.io.File r1 = X.C9598Rdc.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ IOException -> 0x03bb }
            com.google.common.io.Files.A02(r1, r11)     // Catch:{ IOException -> 0x03bb }
            java.lang.String r1 = r11.getPath()     // Catch:{ IOException -> 0x03bb }
            X.AIF.A01(r1)     // Catch:{ IOException -> 0x03bb }
            goto L_0x00c6
        L_0x01dd:
            X.8A2 r1 = X.AnonymousClass8A1.A01(r0)     // Catch:{ IOException -> 0x03bb }
            X.1QP r4 = r1.A0J     // Catch:{ IOException -> 0x03bb }
            long r1 = r1.A0C     // Catch:{ IOException -> 0x03bb }
            X.AE4 r3 = new X.AE4     // Catch:{ IOException -> 0x03bb }
            r3.<init>(r4)     // Catch:{ IOException -> 0x03bb }
            r3.A01 = r1     // Catch:{ IOException -> 0x03bb }
            java.lang.String r1 = "ADJUSTED_FILES_CREATED"
            r3.A04(r1)     // Catch:{ IOException -> 0x03bb }
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()     // Catch:{ 8Af -> 0x0381 }
            java.util.Iterator r16 = r42.iterator()     // Catch:{ 8Af -> 0x0381 }
        L_0x01f9:
            boolean r1 = r16.hasNext()     // Catch:{ 8Af -> 0x0381 }
            if (r1 == 0) goto L_0x0324
            java.lang.Object r13 = r16.next()     // Catch:{ 8Af -> 0x0381 }
            X.51M r13 = (X.AnonymousClass51M) r13     // Catch:{ 8Af -> 0x0381 }
            X.0qQ.A0A(r13)     // Catch:{ 8Af -> 0x0381 }
            X.7rW r1 = X.C343457qF.A00(r0)     // Catch:{ 8Af -> 0x0381 }
            X.7r6 r2 = r1.A00     // Catch:{ 8Af -> 0x0381 }
            r1 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r23 = r2.Ar6(r1)     // Catch:{ 8Af -> 0x0381 }
            X.51R r12 = r13.A0F     // Catch:{ 8Af -> 0x0381 }
            float r2 = r13.A00     // Catch:{ FileNotFoundException -> 0x031d }
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1Q(r1)
            r2 = r1 ^ 1
            java.lang.String r1 = r12.A0F     // Catch:{ FileNotFoundException -> 0x031d }
            java.io.File r5 = X.AnonymousClass7TE.A0t(r1)     // Catch:{ FileNotFoundException -> 0x031d }
            if (r2 == 0) goto L_0x023e
            java.lang.String r1 = "adjusted"
            java.io.File r5 = X.C39907AIy.A01(r8, r5, r1)     // Catch:{ FileNotFoundException -> 0x031d }
            boolean r1 = r5.exists()     // Catch:{ FileNotFoundException -> 0x031d }
            if (r1 != 0) goto L_0x023e
            java.lang.String r2 = "Adjusted source video file does not exist"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x031d }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x031d }
            throw r1     // Catch:{ FileNotFoundException -> 0x031d }
        L_0x023e:
            int r14 = r13.A09     // Catch:{ 8Af -> 0x0381 }
            int r1 = r13.A08     // Catch:{ 8Af -> 0x0381 }
            r20 = r1
            if (r14 > 0) goto L_0x0257
            int r2 = r13.A0B()     // Catch:{ 8Af -> 0x0381 }
            if (r1 != r2) goto L_0x0257
        L_0x024c:
            X.SE7 r2 = new X.SE7     // Catch:{ 8Af -> 0x0381 }
            r2.<init>(r5)     // Catch:{ 8Af -> 0x0381 }
            r1 = r17
            r1.add(r2)     // Catch:{ 8Af -> 0x0381 }
            goto L_0x01f9
        L_0x0257:
            X.51R r1 = r13.A0F     // Catch:{ IOException -> 0x0316 }
            java.lang.String r1 = r1.A0F     // Catch:{ IOException -> 0x0316 }
            java.io.File r11 = X.AnonymousClass7TE.A0t(r1)     // Catch:{ IOException -> 0x0316 }
            int r1 = r13.A09     // Catch:{ IOException -> 0x0316 }
            long r3 = (long) r1     // Catch:{ IOException -> 0x0316 }
            int r1 = r13.A08     // Catch:{ IOException -> 0x0316 }
            long r1 = (long) r1     // Catch:{ IOException -> 0x0316 }
            java.lang.StringBuilder r10 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x0316 }
            java.lang.String r9 = "user_trimmed_"
            r10.append(r9)     // Catch:{ IOException -> 0x0316 }
            r10.append(r3)     // Catch:{ IOException -> 0x0316 }
            r3 = 95
            r10.append(r3)     // Catch:{ IOException -> 0x0316 }
            r10.append(r1)     // Catch:{ IOException -> 0x0316 }
            java.lang.String r1 = r10.toString()     // Catch:{ IOException -> 0x0316 }
            java.io.File r4 = X.C39907AIy.A01(r8, r11, r1)     // Catch:{ IOException -> 0x0316 }
            boolean r1 = r4.exists()     // Catch:{ 8Af -> 0x0381 }
            if (r1 != 0) goto L_0x030b
            int r10 = r12.A09     // Catch:{ 8Af -> 0x0381 }
            int r9 = r12.A05     // Catch:{ 8Af -> 0x0381 }
            boolean r1 = r13.A0R     // Catch:{ 8Af -> 0x0381 }
            r27 = r1 ^ 1
            X.0Tu r3 = X.0Tu.A05     // Catch:{ 8Af -> 0x0381 }
            r1 = 36324179101691764(0x810ca6001d2f74, double:3.034895357414454E-306)
            boolean r37 = X.182.A06(r3, r0, r1)     // Catch:{ 8Af -> 0x0381 }
            r1 = 36324179100184417(0x810ca600062f61, double:3.034895356461202E-306)
            boolean r38 = X.182.A06(r3, r0, r1)     // Catch:{ 8Af -> 0x0381 }
            r1 = 36324179099856734(0x810ca600012f5e, double:3.034895356253974E-306)
            boolean r39 = X.182.A06(r3, r0, r1)     // Catch:{ 8Af -> 0x0381 }
            r1 = 36324179100643174(0x810ca6000d2f66, double:3.034895356751322E-306)
            boolean r40 = X.182.A06(r3, r0, r1)     // Catch:{ 8Af -> 0x0381 }
            r1 = 36605654076691743(0x820ca60003151f, double:3.2129012650131914E-306)
            long r31 = X.182.A01(r3, r0, r1)     // Catch:{ 8Af -> 0x0381 }
            r1 = 36324179101822838(0x810ca6001f2f76, double:3.034895357497346E-306)
            boolean r41 = X.182.A06(r3, r0, r1)     // Catch:{ 8Af -> 0x0381 }
            if (r14 <= 0) goto L_0x02d4
            r1 = r44
            X.SOn r22 = X.C9606Rdk.A00(r1, r5, r15)     // Catch:{ 8Af -> 0x0381 }
            if (r22 != 0) goto L_0x02d7
            r22 = 0
            goto L_0x02e0
        L_0x02d4:
            r22 = r21
            goto L_0x02e0
        L_0x02d7:
            r24 = r21
            r25 = r10
            r26 = r9
            X.SRj.A03(r22, r23, r24, r25, r26, r27)     // Catch:{ 8Af -> 0x0381 }
        L_0x02e0:
            r23 = r18
            r24 = r21
            r25 = r21
            r26 = r5
            r27 = r43
            r28 = r14
            r29 = r20
            r30 = r6
            r33 = r15
            r34 = r15
            r35 = r15
            r36 = r15
            r20 = r44
            java.io.File r1 = X.C9598Rdc.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ 8Af -> 0x0381 }
            com.google.common.io.Files.A02(r1, r4)     // Catch:{ IOException -> 0x0375 }
            java.lang.String r1 = r4.getPath()     // Catch:{ IOException -> 0x030e }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x030e }
            X.AIF.A00(r1)     // Catch:{ IOException -> 0x030e }
        L_0x030b:
            r5 = r4
            goto L_0x024c
        L_0x030e:
            java.lang.String r1 = "could not extract the duration of trimmed file"
            X.8Af r3 = new X.8Af     // Catch:{ 8Af -> 0x0381 }
            r3.<init>(r1)     // Catch:{ 8Af -> 0x0381 }
            goto L_0x0380
        L_0x0316:
            r2 = move-exception
            X.8Af r1 = new X.8Af     // Catch:{ 8Af -> 0x0381 }
            r1.<init>(r2)     // Catch:{ 8Af -> 0x0381 }
            throw r1     // Catch:{ 8Af -> 0x0381 }
        L_0x031d:
            r1 = move-exception
            X.8Af r3 = new X.8Af     // Catch:{ 8Af -> 0x0381 }
            r3.<init>(r1)     // Catch:{ 8Af -> 0x0381 }
            goto L_0x0380
        L_0x0324:
            r1 = r19
            X.0qQ.A0B(r1, r6)     // Catch:{ 8Af -> 0x0381 }
            r1 = 485(0x1e5, float:6.8E-43)
            java.lang.String r1 = X.Pxd.A00(r1)     // Catch:{ 8Af -> 0x0381 }
            X.TdH r9 = X.STf.A01     // Catch:{ 8Af -> 0x0381 }
            X.STf r8 = X.STf.A00     // Catch:{ 8Af -> 0x036b, IOException -> 0x0361 }
            X.STf.A05(r17)     // Catch:{ 8Af -> 0x036b, IOException -> 0x0361 }
            r13 = 2097152(0x200000, float:2.938736E-39)
            r10 = r19
            r11 = r17
            r12 = r21
            X.STf.A04(r8, r9, r10, r11, r12, r13)     // Catch:{ 8Af -> 0x036b, IOException -> 0x0361 }
            X.8A2 r0 = X.AnonymousClass8A1.A01(r0)     // Catch:{ 8Af -> 0x03d7 }
            X.1QP r3 = r0.A0J     // Catch:{ 8Af -> 0x03d7 }
            long r1 = r0.A0C     // Catch:{ 8Af -> 0x03d7 }
            X.AE4 r0 = new X.AE4     // Catch:{ 8Af -> 0x03d7 }
            r0.<init>(r3)     // Catch:{ 8Af -> 0x03d7 }
            r0.A01 = r1     // Catch:{ 8Af -> 0x03d7 }
            r0.A02()     // Catch:{ 8Af -> 0x03d7 }
        L_0x0353:
            r0 = r45
            com.instagram.common.session.UserSession r2 = r0.A00     // Catch:{ 8Af -> 0x03d7 }
            r1 = r42
            r0 = r19
            X.7zv r1 = X.AnonymousClass834.A00(r1, r2, r0)     // Catch:{ 8Af -> 0x03d7 }
            goto L_0x03e5
        L_0x0361:
            r2 = move-exception
            X.0qQ.A0B(r1, r6)     // Catch:{ 8Af -> 0x0381 }
            X.8Af r3 = new X.8Af     // Catch:{ 8Af -> 0x0381 }
            r3.<init>(r1, r2)     // Catch:{ 8Af -> 0x0381 }
            goto L_0x0380
        L_0x036b:
            r2 = move-exception
            X.0qQ.A0B(r1, r6)     // Catch:{ 8Af -> 0x0381 }
            X.8Af r3 = new X.8Af     // Catch:{ 8Af -> 0x0381 }
            r3.<init>(r1, r2)     // Catch:{ 8Af -> 0x0381 }
            goto L_0x0380
        L_0x0375:
            r2 = move-exception
            java.lang.String r1 = "could not move trimmed file to expected location"
            X.0qQ.A0B(r1, r6)     // Catch:{ 8Af -> 0x0381 }
            X.8Af r3 = new X.8Af     // Catch:{ 8Af -> 0x0381 }
            r3.<init>(r1, r2)     // Catch:{ 8Af -> 0x0381 }
        L_0x0380:
            throw r3     // Catch:{ 8Af -> 0x0381 }
        L_0x0381:
            r3 = move-exception
            X.8A2 r0 = X.AnonymousClass8A1.A01(r0)     // Catch:{ 8Af -> 0x03d7 }
            X.1QP r4 = r0.A0J     // Catch:{ 8Af -> 0x03d7 }
            long r0 = r0.A0C     // Catch:{ 8Af -> 0x03d7 }
            X.AE4 r2 = new X.AE4     // Catch:{ 8Af -> 0x03d7 }
            r2.<init>(r4)     // Catch:{ 8Af -> 0x03d7 }
            r2.A01 = r0     // Catch:{ 8Af -> 0x03d7 }
            java.lang.String r1 = r3.getMessage()     // Catch:{ 8Af -> 0x03d7 }
            java.lang.String r0 = "error"
            r2.A06(r0, r1)     // Catch:{ 8Af -> 0x03d7 }
            int r0 = r42.size()     // Catch:{ 8Af -> 0x03d7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ 8Af -> 0x03d7 }
            java.lang.String r1 = "null"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ 8Af -> 0x03d7 }
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0, r0}     // Catch:{ 8Af -> 0x03d7 }
            java.lang.String r0 = "Error in Stitching. Num segments: %d, mediaAudioOverlayInfo: %s, bleepMap is Null: %b, fbaAudioEffect is Null: %b"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ 8Af -> 0x03d7 }
            X.0qQ.A07(r0)     // Catch:{ 8Af -> 0x03d7 }
            X.8Af r1 = new X.8Af     // Catch:{ 8Af -> 0x03d7 }
            r1.<init>(r0, r3)     // Catch:{ 8Af -> 0x03d7 }
            goto L_0x03d6
        L_0x03bb:
            r0 = move-exception
            X.8Af r1 = new X.8Af     // Catch:{ 8Af -> 0x03d7 }
            r1.<init>(r0)     // Catch:{ 8Af -> 0x03d7 }
            goto L_0x03d6
        L_0x03c2:
            r0 = move-exception
            X.8Af r1 = new X.8Af     // Catch:{ 8Af -> 0x03d7 }
            r1.<init>(r0)     // Catch:{ 8Af -> 0x03d7 }
            goto L_0x03d6
        L_0x03c9:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ 8Af -> 0x03d7 }
            goto L_0x03d6
        L_0x03d0:
            r0 = move-exception
            X.8Af r1 = new X.8Af     // Catch:{ 8Af -> 0x03d7 }
            r1.<init>(r0)     // Catch:{ 8Af -> 0x03d7 }
        L_0x03d6:
            throw r1     // Catch:{ 8Af -> 0x03d7 }
        L_0x03d7:
            r3 = move-exception
            X.0wj r2 = X.0wj.A01
            r1 = 817905350(0x30c03ec6, float:1.398768E-9)
            java.lang.String r0 = "failed to stitch videos"
            X.AnonymousClass7TG.A1I(r2, r0, r3, r1)
            X.9nk r2 = X.C388389nk.A00
            goto L_0x0403
        L_0x03e5:
            com.instagram.common.session.UserSession r0 = r7.A01
            r16 = r21
            r17 = r21
            r18 = r0
            r19 = r21
            r20 = r1
            r22 = r21
            r23 = r21
            r24 = r21
            r25 = r42
            r26 = r15
            X.AEK.A02(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.8Y4 r2 = new X.8Y4
            r2.<init>(r1)
        L_0x0403:
            boolean r0 = r7.A04
            if (r0 != 0) goto L_0x040c
            X.2Fj r0 = r7.A03
            r0.A0A(r2)
        L_0x040c:
            int r1 = r2.A00
            r0 = 3
            if (r1 != r0) goto L_0x0424
            java.lang.Object r0 = r2.A00()
            X.7zv r0 = (X.C349307zv) r0
            java.lang.String r0 = r0.A0k
            java.io.File r4 = X.AnonymousClass7TE.A0t(r0)
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0425
            r4.delete()
        L_0x0424:
            return
        L_0x0425:
            X.8IR r3 = r7.A05
            monitor-enter(r3)
            java.util.Queue r2 = r3.A03     // Catch:{ all -> 0x0446 }
            r2.remove(r4)     // Catch:{ all -> 0x0446 }
        L_0x042d:
            int r1 = r2.size()     // Catch:{ all -> 0x0446 }
            r0 = 5
            if (r1 <= r0) goto L_0x0441
            java.lang.Object r0 = r2.poll()     // Catch:{ all -> 0x0446 }
            r0.getClass()     // Catch:{ all -> 0x0446 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0446 }
            r0.delete()     // Catch:{ all -> 0x0446 }
            goto L_0x042d
        L_0x0441:
            r2.add(r4)     // Catch:{ all -> 0x0446 }
            monitor-exit(r3)
            return
        L_0x0446:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C386959lR.run():void");
    }
}
