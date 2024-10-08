package X;

import java.util.List;

/* renamed from: X.Ar6  reason: case insensitive filesystem */
public final /* synthetic */ class C41270Ar6 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8K4 A01;
    public final /* synthetic */ B1O A02;
    public final /* synthetic */ LD4 A03;
    public final /* synthetic */ C381539bv A04;
    public final /* synthetic */ C381779cJ A05;
    public final /* synthetic */ L8M A06;
    public final /* synthetic */ AnonymousClass8VT A07;
    public final /* synthetic */ C15023UKc A08;
    public final /* synthetic */ C352218Cl A09;
    public final /* synthetic */ Boolean A0A;
    public final /* synthetic */ Integer A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ List A0G;
    public final /* synthetic */ List A0H;
    public final /* synthetic */ boolean A0I;
    public final /* synthetic */ boolean A0J;

    public /* synthetic */ C41270Ar6(AnonymousClass8K4 r2, B1O b1o, LD4 ld4, C381539bv r5, C381779cJ r6, L8M l8m, AnonymousClass8VT r8, C15023UKc uKc, C352218Cl r10, Boolean bool, Integer num, String str, String str2, String str3, String str4, List list, List list2, int i, boolean z, boolean z2) {
        this.A01 = r2;
        this.A0B = num;
        this.A03 = ld4;
        this.A00 = i;
        this.A05 = r6;
        this.A06 = l8m;
        this.A07 = r8;
        this.A0E = str;
        this.A0F = str2;
        this.A08 = uKc;
        this.A04 = r5;
        this.A0G = list;
        this.A0H = list2;
        this.A0C = str3;
        this.A0A = bool;
        this.A0D = str4;
        this.A02 = b1o;
        this.A0I = z;
        this.A0J = z2;
        this.A09 = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01c5, code lost:
        if (((X.AnonymousClass8ME) r34.get()).A1W() == false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0232, code lost:
        if (r1.A0K() == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x026a, code lost:
        if (((X.AnonymousClass8ME) r34.get()).A1W() == false) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0079, code lost:
        if (r3 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02e7, code lost:
        if (r1.A0K() == false) goto L_0x0274;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r76 = this;
            r2 = r76
            X.8K4 r1 = r2.A01
            java.lang.Integer r0 = r2.A0B
            r72 = r0
            X.LD4 r12 = r2.A03
            int r3 = r2.A00
            X.9cJ r0 = r2.A05
            r18 = r0
            X.L8M r0 = r2.A06
            r61 = r0
            X.8VT r0 = r2.A07
            r60 = r0
            java.lang.String r0 = r2.A0E
            r64 = r0
            java.lang.String r0 = r2.A0F
            r71 = r0
            X.UKc r0 = r2.A08
            r42 = r0
            X.9bv r0 = r2.A04
            r40 = r0
            java.util.List r0 = r2.A0G
            r43 = r0
            java.util.List r0 = r2.A0H
            r44 = r0
            java.lang.String r0 = r2.A0C
            r39 = r0
            java.lang.Boolean r0 = r2.A0A
            r38 = r0
            java.lang.String r0 = r2.A0D
            r41 = r0
            X.B1O r0 = r2.A02
            r37 = r0
            boolean r0 = r2.A0I
            r73 = r0
            boolean r0 = r2.A0J
            r35 = r0
            X.8Cl r2 = r2.A09
            X.ADt r17 = X.C39892ADt.A00(r12)
            r13 = 2
            if (r3 != r13) goto L_0x0247
            java.lang.String r36 = "share_sheet"
        L_0x0053:
            X.8Jb r0 = r1.A0R
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A00()
            r5 = 0
            boolean r7 = X.AnonymousClass7TF.A1V(r0)
            X.8BA r10 = r1.A0G
            X.6if r0 = r10.A1g
            r34 = r0
            java.lang.Object r0 = r34.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            java.util.LinkedHashMap r4 = r0.A1A()
            r0 = r17
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x007b
            boolean r3 = r0.isEmpty()
            r0 = 1
            if (r3 == 0) goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            com.instagram.common.session.UserSession r6 = r1.A0D
            java.util.LinkedHashSet r45 = X.AJ8.A02(r6, r4, r7, r0)
            X.8Ji r0 = r1.A0F
            X.81C r0 = r0.A00
            X.81E r0 = r0.A00()
            X.8Jj r0 = (X.C353838Jj) r0
            r8 = 1
            android.graphics.Bitmap r9 = r0.A02(r8)
            r19 = 0
            if (r9 == 0) goto L_0x0243
            android.app.Activity r0 = r1.A0A
            X.1GK r20 = X.AEI.A01(r0, r9, r6, r5)
        L_0x009b:
            boolean r0 = r10.A0p()
            if (r0 == 0) goto L_0x023f
            X.6if r0 = r1.A0V
            java.lang.Object r0 = r0.get()
            X.8Jj r0 = (X.C353838Jj) r0
            android.graphics.Bitmap r3 = r0.A02(r8)
            if (r3 == 0) goto L_0x023b
            android.app.Activity r0 = r1.A0A
            X.1GK r21 = X.AEI.A01(r0, r3, r6, r5)
        L_0x00b5:
            X.82p r3 = r1.A0I
            X.82o r0 = r3.A02
            r33 = r0
            boolean r0 = X.AnonymousClass8KI.A00(r6)
            if (r0 == 0) goto L_0x00d0
            X.8KK r0 = r1.A0M
            android.graphics.Rect r4 = r0.A04()
            if (r4 == 0) goto L_0x00d0
            java.util.List r0 = r2.A0r
            if (r0 == 0) goto L_0x00d0
            r2.A0C(r4)
        L_0x00d0:
            X.AnonymousClass8K4.A0B(r1, r2)
            X.28D r7 = r3.A01
            java.lang.String r16 = r7.toString()
            X.87h r4 = r1.A0T
            X.8Kj r0 = r1.A0Z
            X.8PW r0 = X.AnonymousClass8MD.A00(r10, r0, r4, r5)
            X.8lx r11 = r1.A0G()
            if (r18 == 0) goto L_0x0235
            r4 = r18
            java.lang.String r10 = r4.A00
            if (r10 == 0) goto L_0x0235
        L_0x00ed:
            X.28D r4 = X.28D.A2S
            if (r7 != r4) goto L_0x0112
            X.80D r7 = r1.A0J
            boolean r4 = r7.A3B
            if (r4 != 0) goto L_0x0112
            X.8KX r15 = r1.A0b
            com.instagram.model.direct.DirectShareTarget r14 = r12.A00
            com.instagram.model.direct.camera.DirectCameraViewModel r7 = r7.A1I
            int r4 = r2.A08
            java.lang.Integer r26 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r27 = X.AnonymousClass05K.A1F
            r23 = r14
            r24 = r7
            r25 = r18
            r28 = r10
            r22 = r15
            r22.A00(r23, r24, r25, r26, r27, r28)
        L_0x0112:
            java.util.List r4 = r0.A0E
            X.8Jw r14 = r1.A0U
            int r67 = X.C59895JbK.A02(r12)
            X.1iA r54 = X.1iA.A0Q
            int r7 = r2.A08
            r68 = r7
            java.lang.String r7 = r2.A0a
            r56 = r7
            java.lang.String r57 = r2.A05()
            com.instagram.camera.effect.models.CameraAREffect r7 = r11.A01
            r50 = r7
            java.util.HashMap r66 = X.C59895JbK.A0D(r6, r4)
            java.util.List r7 = r0.A0D
            X.C59895JbK.A09(r7)
            X.3sy r53 = X.AnonymousClass8K4.A02(r1, r12)
            java.lang.String r58 = X.C59895JbK.A0B(r3)
            java.lang.String r3 = r2.A0b
            r59 = r3
            r70 = 1
            boolean r3 = r0.A00()
            if (r3 == r8) goto L_0x014b
            r70 = 0
        L_0x014b:
            X.8Nz r3 = r0.A06
            int r69 = X.C59895JbK.A00(r3)
            java.util.List r0 = r0.A0F
            android.util.Pair r49 = X.C59895JbK.A04(r4, r0)
            X.8pT r0 = r11.A04
            com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r52 = X.AEE.A00(r0)
            X.AEE.A01(r11)
            java.lang.Integer r55 = r2.A04()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r51 = r2.A01()
            java.util.List r65 = X.C394979z0.A00(r2)
            java.lang.String r0 = r2.A0g
            r62 = r0
            java.lang.String r0 = r2.A0e
            r15 = r0
            java.lang.String r7 = r2.A0i
            X.0qQ.A0B(r14, r8)
            X.80D r0 = r1.A0J
            boolean r3 = r0.A3B
            if (r3 == 0) goto L_0x024b
            android.app.Activity r3 = r1.A0A
            android.content.Context r23 = r3.getApplicationContext()
            r48 = 0
            com.instagram.model.direct.camera.DirectCameraViewModel r3 = r0.A1I
            X.Ab1 r0 = new X.Ab1
            r24 = r6
            r25 = r12
            r26 = r3
            r27 = r18
            r28 = r19
            r29 = r2
            r30 = r16
            r31 = r10
            r32 = r73
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.8KO r9 = r1.A0O
            boolean r3 = r1.A0o
            r52 = 0
            r47 = 0
            if (r3 != 0) goto L_0x01b1
            r52 = r11
            r47 = r20
            r48 = r21
        L_0x01b1:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r1.A0H
            java.lang.Boolean r62 = java.lang.Boolean.valueOf(r35)
            if (r3 != 0) goto L_0x01c7
            java.lang.Object r4 = r34.get()
            X.8ME r4 = (X.AnonymousClass8ME) r4
            boolean r4 = r4.A1W()
            r74 = 1
            if (r4 != 0) goto L_0x0228
        L_0x01c7:
            r74 = 0
            if (r3 == 0) goto L_0x0228
            r49 = 0
            r45 = 0
        L_0x01cf:
            r75 = 0
        L_0x01d1:
            X.AtM r4 = new X.AtM
            r4.<init>(r0, r5)
            r3 = 3
            X.TPI r1 = new X.TPI
            r1.<init>(r3)
            r46 = r9
            r50 = r7
            r51 = r37
            r53 = r12
            r54 = r40
            r55 = r18
            r56 = r19
            r57 = r61
            r58 = r60
            r59 = r42
            r60 = r2
            r61 = r38
            r63 = r36
            r65 = r71
            r66 = r39
            r67 = r41
            r68 = r43
            r69 = r44
            r70 = r45
            r71 = r4
            r72 = r1
            r46.A06(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75)
            X.S6X r3 = X.C394279xp.A00(r6)
            java.util.List r1 = r33.A05()
            java.lang.Object r2 = r1.get(r5)
            X.8nh r2 = (X.C365798nh) r2
            X.A52 r1 = new X.A52
            r1.<init>(r2, r0)
            java.util.List r7 = java.util.Collections.singletonList(r1)
            java.lang.String r6 = "activity_result"
            r4 = 5000(0x1388, double:2.4703E-320)
            r3.A01(r4, r6, r7, r8)
            return
        L_0x0228:
            X.1GK r49 = X.AnonymousClass8K4.A01(r1)
            boolean r1 = r1.A0K()
            r75 = 1
            if (r1 != 0) goto L_0x01d1
            goto L_0x01cf
        L_0x0235:
            java.lang.String r10 = X.HZX.A00()
            goto L_0x00ed
        L_0x023b:
            r21 = r19
            goto L_0x00b5
        L_0x023f:
            r21 = r19
            goto L_0x00b5
        L_0x0243:
            r20 = r19
            goto L_0x009b
        L_0x0247:
            java.lang.String r36 = "post_capture"
            goto L_0x0053
        L_0x024b:
            X.8KO r5 = r1.A0O
            boolean r0 = r1.A0o
            if (r0 == 0) goto L_0x0256
            r11 = 0
            r20 = 0
            r21 = 0
        L_0x0256:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r1.A0H
            java.lang.Boolean r35 = java.lang.Boolean.valueOf(r35)
            if (r0 != 0) goto L_0x026c
            java.lang.Object r3 = r34.get()
            X.8ME r3 = (X.AnonymousClass8ME) r3
            boolean r3 = r3.A1W()
            r47 = 1
            if (r3 != 0) goto L_0x02dd
        L_0x026c:
            r47 = 0
            if (r0 == 0) goto L_0x02dd
            r22 = 0
            r45 = 0
        L_0x0274:
            r48 = 0
        L_0x0276:
            X.0qQ.A0B(r6, r8)
            X.AnonymousClass7TF.A1F(r5, r13, r12)
            r0 = 15
            X.0qQ.A0B(r4, r0)
            r3 = 22
            r0 = r16
            X.0qQ.A0B(r0, r3)
            r0 = 28
            X.0qQ.A0B(r10, r0)
            r23 = r4
            r24 = r37
            r25 = r11
            r26 = r12
            r27 = r40
            r28 = r18
            r29 = r19
            r30 = r61
            r31 = r60
            r32 = r42
            r33 = r2
            r34 = r38
            r37 = r64
            r38 = r71
            r40 = r16
            r42 = r10
            r46 = r73
            r18 = r5
            X.A3r r0 = r18.A04(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            java.lang.String r2 = r0.A00
            r48 = r14
            r60 = r2
            r61 = r64
            r63 = r15
            r64 = r7
            r48.A02(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)
            boolean r5 = r1.A0n
            X.AuA r4 = new X.AuA
            r3 = r72
            r2 = r17
            r4.<init>(r9, r1, r2, r3)
            X.0t0 r13 = X.AnonymousClass0eN.A01(r4)
            r9 = r1
            r10 = r0
            r11 = r2
            r12 = r3
            r14 = r8
            r15 = r5
            X.AnonymousClass8K4.A09(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x02dd:
            X.1GK r22 = X.AnonymousClass8K4.A01(r1)
            boolean r0 = r1.A0K()
            r48 = 1
            if (r0 != 0) goto L_0x0276
            goto L_0x0274
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41270Ar6.run():void");
    }
}
