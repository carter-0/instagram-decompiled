package X;

/* renamed from: X.9yJ  reason: invalid class name and case insensitive filesystem */
public abstract class C394559yJ {
    /* JADX WARNING: type inference failed for: r0v73, types: [java.util.AbstractCollection] */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03ed, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36324372373385262L) == false) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0585, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A02, 36324372373450799L) == false) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x05a4, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A02, 36324372373319725L) == false) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x05bd, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0191, code lost:
        if (r4.A00() != true) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02ac, code lost:
        if (r7.A00() != true) goto L_0x02ae;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass34S A00(com.instagram.common.session.UserSession r45, X.AnonymousClass8QN r46, X.AnonymousClass8K4 r47, X.AnonymousClass8L1 r48, X.AnonymousClass8MC r49, X.B1O r50, X.C3499582p r51, java.lang.String r52, X.AnonymousClass0eK r53, X.AnonymousClass0eK r54, boolean r55) {
        /*
            r13 = r45
            r1 = r51
            X.AnonymousClass7TG.A1N(r13, r1)
            r0 = 4
            r2 = r49
            X.0qQ.A0B(r2, r0)
            X.82o r3 = r1.A02
            java.lang.Class<X.9UB> r17 = X.AnonymousClass9UB.class
            X.9UC r1 = new X.9UC
            r1.<init>(r13)
            r0 = r17
            java.lang.Object r0 = r13.A01(r0, r1)
            X.9UB r0 = (X.AnonymousClass9UB) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1D(r0)
            X.82Y r7 = r3.A01
            java.lang.Integer r0 = r7.A0B
            X.0qQ.A07(r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            r1 = r46
            r5 = r47
            if (r0 != r6) goto L_0x0077
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            X.82p r0 = r1.A0Q
            X.82o r0 = r0.A02
            java.util.List r0 = r0.A05()
            java.util.Iterator r10 = r0.iterator()
        L_0x0043:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r4 = r10.next()
            X.8nh r4 = (X.C365798nh) r4
            X.8QA r0 = r1.A0K
            X.8pU r9 = r0.A07(r4)
            X.8nd r0 = r4.A05
            int r4 = r0.ordinal()
            r0 = 0
            if (r4 == r0) goto L_0x006b
            X.8pV r0 = r9.A03
            r0.getClass()
            X.8PW r4 = r0.A05
        L_0x0065:
            r0 = r16
            r0.add(r4)
            goto L_0x0043
        L_0x006b:
            X.8lx r0 = r9.A02
            r0.getClass()
            X.8PW r4 = r0.A05
            goto L_0x0065
        L_0x0073:
            X.0qQ.A0A(r16)
            goto L_0x008e
        L_0x0077:
            X.8nd r4 = r3.A01()
            X.8nd r0 = X.C365758nd.A04
            if (r4 != r0) goto L_0x00bd
            X.8BA r10 = r5.A0G
            X.87h r9 = r5.A0T
            X.8Kj r4 = r5.A0Z
            r0 = 0
            X.8PW r0 = X.AnonymousClass8MD.A00(r10, r4, r9, r0)
        L_0x008a:
            java.util.List r16 = X.AnonymousClass7TE.A1I(r0)
        L_0x008e:
            r0 = r16
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00c3
            X.8nd r1 = r3.A01()
            X.8nd r0 = X.C365758nd.A04
            if (r1 != r0) goto L_0x00a7
            X.27r r0 = X.27p.A01(r13)
            X.29K r0 = r0.A04
            r0.A0A()
        L_0x00a7:
            X.9UC r1 = new X.9UC
            r1.<init>(r13)
            r0 = r17
            java.lang.Object r0 = r13.A01(r0, r1)
            X.9UB r0 = (X.AnonymousClass9UB) r0
            X.34S r3 = r0.A00
            if (r3 != 0) goto L_0x00c2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00bd:
            X.8PW r0 = r2.A01()
            goto L_0x008a
        L_0x00c2:
            return r3
        L_0x00c3:
            java.lang.Integer r0 = r7.A0B
            X.0qQ.A07(r0)
            if (r0 != r6) goto L_0x0354
            java.lang.String r15 = X.AnonymousClass7TF.A0b()
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            X.82p r0 = r1.A0Q
            r52 = r0
            X.82o r0 = r0.A02
            java.util.List r18 = r0.A05()
            int r6 = r18.size()
            r3 = 0
        L_0x00e5:
            if (r3 >= r6) goto L_0x0332
            r7 = 0
            X.0qQ.A0B(r15, r7)
            int r0 = r6 - r3
            int r0 = r0 + -1
            X.A6R r5 = new X.A6R
            r5.<init>(r15, r0, r6)
            r0 = r18
            java.lang.Object r9 = r0.get(r3)
            X.8nh r9 = (X.C365798nh) r9
            X.8QA r8 = r1.A0K
            X.8pU r10 = r8.A07(r9)
            java.lang.String r2 = r9.A06
            X.0qQ.A0B(r2, r7)
            java.util.Map r0 = r8.A0L
            java.lang.Object r4 = r0.get(r2)
            X.1GK r4 = (X.1GK) r4
            X.8nd r0 = r9.A05
            int r0 = r0.ordinal()
            r31 = 0
            if (r0 == r7) goto L_0x0221
            X.7zv r2 = r9.A03
            r2.getClass()
            X.8pV r0 = r10.A03
            r0.getClass()
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x01f4
            X.8pV r0 = r10.A03
            X.8PW r7 = r0.A05
            r7.getClass()
        L_0x012e:
            X.9I6 r22 = new X.9I6
            r22.<init>()
            X.8L3 r7 = r1.A0W
            X.8BA r10 = r1.A0N
            X.8Cl r11 = r10.A0O
            if (r11 == 0) goto L_0x01f0
            java.lang.String r35 = r11.A06()
        L_0x013f:
            boolean r37 = r8.A0F(r9)
            java.lang.String r36 = r10.A0T()
            java.lang.Object r8 = r54.get()
            boolean r38 = X.AnonymousClass7TE.A1a(r8)
            r29 = r7
            r30 = r4
            r32 = r0
            r33 = r5
            r34 = r2
            X.A3q r5 = r29.A01(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.8Jw r12 = r1.A0a
            X.1iA r26 = X.1iA.A0a
            int r11 = r2.A0F
            java.lang.String r10 = r2.A0f
            java.lang.String r29 = r2.A06()
            com.instagram.camera.effect.models.CameraAREffect r9 = r0.A00
            X.8PW r4 = r0.A05
            if (r4 == 0) goto L_0x01ed
            com.instagram.common.session.UserSession r7 = r1.A0G
            java.util.List r4 = r4.A0E
            java.util.HashMap r34 = X.C59895JbK.A0D(r7, r4)
        L_0x0177:
            X.8PW r4 = r0.A05
            if (r4 == 0) goto L_0x01ea
            java.util.List r4 = r4.A0D
            X.LMJ r24 = X.C59895JbK.A09(r4)
        L_0x0181:
            java.lang.String r8 = r2.A0l
            X.C59895JbK.A0B(r52)
            X.8PW r4 = r0.A05
            if (r4 == 0) goto L_0x0193
            r7 = 1
            boolean r4 = r4.A00()
            r40 = 1
            if (r4 == r7) goto L_0x0195
        L_0x0193:
            r40 = 0
        L_0x0195:
            X.8PW r4 = r0.A05
            if (r4 == 0) goto L_0x01e7
            X.8Nz r4 = r4.A06
            int r39 = X.C59895JbK.A00(r4)
        L_0x019f:
            X.8PW r4 = r0.A05
            if (r4 == 0) goto L_0x01e4
            java.util.List r7 = r4.A0E
            java.util.List r4 = r4.A0F
            android.util.Pair r21 = X.C59895JbK.A04(r7, r4)
        L_0x01ab:
            X.8pT r4 = r0.A04
            com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r25 = X.AEE.A00(r4)
            boolean r0 = X.AEE.A02(r0)
            boolean r41 = X.AnonymousClass7TF.A1P(r0)
            java.lang.Integer r27 = r2.A04()
            r2.A02()
            r23 = r9
            r28 = r10
            r30 = r8
            r32 = r31
            r33 = r31
            r35 = r31
            r36 = r31
            r37 = r31
            r38 = r11
            r20 = r12
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r2 = r20.A01(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
        L_0x01d8:
            r0 = r19
            r0.add(r5)
            r14.add(r2)
            int r3 = r3 + 1
            goto L_0x00e5
        L_0x01e4:
            r21 = r31
            goto L_0x01ab
        L_0x01e7:
            r39 = 0
            goto L_0x019f
        L_0x01ea:
            X.LMJ r24 = X.LMJ.A02
            goto L_0x0181
        L_0x01ed:
            r34 = r31
            goto L_0x0177
        L_0x01f0:
            r35 = 0
            goto L_0x013f
        L_0x01f4:
            X.3QG r0 = X.C366688pV.A0D
            X.8pV r0 = r10.A03
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r12 = r0.A01
            X.3QS r30 = new X.3QS
            r30.<init>()
            X.8vv r11 = new X.8vv
            r11.<init>(r7)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r10 = r0.A06
            X.8pV r0 = new X.8pV
            r22 = r0
            r23 = r31
            r24 = r12
            r25 = r31
            r26 = r11
            r27 = r31
            r28 = r31
            r29 = r10
            r32 = r7
            r33 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x012e
        L_0x0221:
            X.8Cl r0 = r9.A02
            r0.getClass()
            X.8lx r2 = r10.A02
            r2.getClass()
            boolean r2 = r10.A05
            if (r2 == 0) goto L_0x0311
            X.8lx r2 = r10.A02
            X.8PW r8 = r2.A05
            r8.getClass()
        L_0x0236:
            X.8KO r11 = r1.A0V
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r10 = r1.A0P
            X.8BA r8 = r1.A0N
            java.lang.String r12 = r8.A0T()
            java.lang.String r9 = r1.A0j
            X.4nE r8 = new X.4nE
            r8.<init>(r12, r9, r7)
            java.lang.Object r9 = r53.get()
            boolean r32 = X.AnonymousClass7TE.A1a(r9)
            r20 = r11
            r21 = r4
            r22 = r31
            r23 = r31
            r24 = r10
            r25 = r31
            r26 = r2
            r27 = r5
            r28 = r8
            r29 = r0
            r30 = r31
            r33 = r7
            r34 = r7
            X.A3q r5 = r20.A03(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.8Jw r4 = r1.A0a
            r21 = r4
            X.1iA r36 = X.1iA.A0Q
            int r4 = r0.A08
            r20 = r4
            java.lang.String r12 = r0.A0a
            com.instagram.common.gallery.Medium r4 = r0.A0F
            if (r4 == 0) goto L_0x030e
            java.lang.String r4 = r4.A0O
        L_0x027f:
            com.instagram.camera.effect.models.CameraAREffect r11 = r2.A01
            X.8PW r7 = r2.A05
            if (r7 == 0) goto L_0x030b
            com.instagram.common.session.UserSession r8 = r1.A0G
            java.util.List r7 = r7.A0E
            java.util.HashMap r44 = X.C59895JbK.A0D(r8, r7)
        L_0x028d:
            X.8PW r7 = r2.A05
            if (r7 == 0) goto L_0x0308
            java.util.List r7 = r7.A0D
            X.LMJ r34 = X.C59895JbK.A09(r7)
        L_0x0297:
            java.lang.String r10 = r0.A0d
            X.9I6 r32 = new X.9I6
            r32.<init>()
            X.C59895JbK.A0B(r52)
            X.8PW r7 = r2.A05
            if (r7 == 0) goto L_0x02ae
            r8 = 1
            boolean r7 = r7.A00()
            r50 = 1
            if (r7 == r8) goto L_0x02b0
        L_0x02ae:
            r50 = 0
        L_0x02b0:
            X.8PW r7 = r2.A05
            if (r7 == 0) goto L_0x0305
            X.8Nz r7 = r7.A06
            int r49 = X.C59895JbK.A00(r7)
        L_0x02ba:
            X.8PW r7 = r2.A05
            if (r7 == 0) goto L_0x02c6
            java.util.List r8 = r7.A0E
            java.util.List r7 = r7.A0F
            android.util.Pair r31 = X.C59895JbK.A04(r8, r7)
        L_0x02c6:
            X.8pT r7 = r2.A04
            com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r35 = X.AEE.A00(r7)
            boolean r2 = X.AEE.A01(r2)
            boolean r51 = X.AnonymousClass7TF.A1P(r2)
            java.lang.Integer r37 = r0.A04()
            java.util.List r9 = r0.A0q
            java.util.List r8 = r0.A0r
            r0.A01()
            java.util.List r47 = X.C394979z0.A00(r0)
            java.lang.String r7 = r0.A0g
            java.lang.String r2 = r0.A0e
            java.lang.String r0 = r0.A0i
            r30 = r21
            r33 = r11
            r38 = r12
            r39 = r4
            r40 = r10
            r41 = r7
            r42 = r2
            r43 = r0
            r45 = r9
            r46 = r8
            r48 = r20
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r2 = r30.A01(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            goto L_0x01d8
        L_0x0305:
            r49 = 0
            goto L_0x02ba
        L_0x0308:
            X.LMJ r34 = X.LMJ.A02
            goto L_0x0297
        L_0x030b:
            r44 = r31
            goto L_0x028d
        L_0x030e:
            r4 = 0
            goto L_0x027f
        L_0x0311:
            r29 = -1
            X.8lx r2 = r10.A02
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r8 = r2.A03
            X.8lx r2 = new X.8lx
            r20 = r2
            r21 = r31
            r22 = r31
            r23 = r8
            r24 = r31
            r25 = r31
            r26 = r31
            r27 = r31
            r28 = r31
            r30 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0236
        L_0x0332:
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r4 = X.C394539yH.A00(r19)
            java.util.List r0 = r4.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x033c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x06b8
            java.lang.Object r2 = r3.next()
            com.instagram.common.session.UserSession r0 = r1.A0G
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.28K.A00(r0)
            if (r2 == 0) goto L_0x033c
            java.util.Set r0 = r0.A07
            r0.remove(r2)
            goto L_0x033c
        L_0x0354:
            boolean r0 = r5.A0K()
            if (r0 == 0) goto L_0x0523
            X.8nd r1 = X.C365758nd.A04
        L_0x035c:
            X.8nd r0 = X.C365758nd.A04
            if (r1 != r0) goto L_0x0529
            java.lang.Object r0 = r53.get()
            X.0qQ.A07(r0)
            boolean r30 = X.AnonymousClass7TE.A1a(r0)
            X.82p r14 = r5.A0I
            X.82o r0 = r14.A02
            X.82Y r0 = r0.A01
            X.8Cl r0 = r0.A03()
            r0.getClass()
            X.8lx r1 = r5.A0G()
            com.instagram.common.session.UserSession r4 = r5.A0D
            boolean r2 = X.AnonymousClass8KI.A00(r4)
            if (r2 == 0) goto L_0x0393
            X.8KK r2 = r5.A0M
            android.graphics.Rect r3 = r2.A04()
            if (r3 == 0) goto L_0x0393
            java.util.List r2 = r0.A0r
            if (r2 == 0) goto L_0x0393
            r0.A0C(r3)
        L_0x0393:
            X.AnonymousClass8K4.A0B(r5, r0)
            X.8BA r8 = r5.A0G
            boolean r2 = r8.A0p()
            r19 = 0
            r7 = 0
            if (r2 == 0) goto L_0x051f
            X.6if r2 = r5.A0V
            java.lang.Object r3 = r2.get()
            X.8Jj r3 = (X.C353838Jj) r3
            r2 = 1
            android.graphics.Bitmap r3 = r3.A02(r2)
            if (r3 == 0) goto L_0x051f
            android.app.Activity r2 = r5.A0A
            X.1GK r20 = X.AEI.A01(r2, r3, r4, r7)
        L_0x03b6:
            X.8Jb r2 = r5.A0R
            com.instagram.camera.effect.models.CameraAREffect r2 = r2.A00()
            r11 = 1
            boolean r3 = X.AnonymousClass7TF.A1V(r2)
            X.6if r15 = r8.A1g
            java.lang.Object r2 = r15.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            java.util.LinkedHashMap r2 = r2.A1A()
            java.util.LinkedHashSet r29 = X.AJ8.A02(r4, r2, r3, r7)
            X.8Ji r2 = r5.A0F
            X.81C r9 = r2.A00
            X.81E r2 = r9.A00()
            X.8Jj r2 = (X.C353838Jj) r2
            boolean r2 = r2.A03()
            if (r2 == 0) goto L_0x03ef
            X.0Tu r6 = X.0Tu.A05
            r2 = 36324372373385262(0x810cd30001302e, double:3.035017583211665E-306)
            boolean r3 = X.182.A06(r6, r4, r2)
            r2 = 0
            if (r3 != 0) goto L_0x03f0
        L_0x03ef:
            r2 = 1
        L_0x03f0:
            X.81E r3 = r9.A00()
            X.8Jj r3 = (X.C353838Jj) r3
            r25 = 0
            android.graphics.Bitmap r2 = r3.A02(r2)
            if (r2 == 0) goto L_0x0404
            android.app.Activity r3 = r5.A0A
            X.1GK r19 = X.AEI.A01(r3, r2, r4, r11)
        L_0x0404:
            java.lang.Object r2 = r15.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r10 = r2.A1m
            com.instagram.common.session.UserSession r9 = r2.A0r
            java.util.LinkedHashMap r12 = X.AnonymousClass7TE.A1H()
            boolean r2 = X.C355008Of.A01(r10)
            if (r2 == 0) goto L_0x0431
            X.0Tu r6 = X.0Tu.A05
            r2 = 36324372373385262(0x810cd30001302e, double:3.035017583211665E-306)
            boolean r2 = X.182.A06(r6, r9, r2)
            if (r2 == 0) goto L_0x0431
            android.graphics.Matrix r3 = X.AnonymousClass7TE.A0U()
            X.AWH r2 = new X.AWH
            r2.<init>(r7, r3, r10, r12)
            r10.A0u(r2)
        L_0x0431:
            X.8KO r10 = r5.A0O
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r9 = r5.A0H
            java.lang.String r6 = r8.A0T()
            X.88F r2 = r5.A0Y
            if (r2 == 0) goto L_0x0514
            java.lang.String r3 = r2.A0P
        L_0x043f:
            X.4nE r2 = new X.4nE
            r2.<init>(r6, r3, r7)
            java.lang.Object r3 = r15.get()
            X.8ME r3 = (X.AnonymousClass8ME) r3
            boolean r31 = r3.A1W()
            X.1GK r21 = X.AnonymousClass8K4.A01(r5)
            boolean r32 = r5.A0K()
            r23 = r50
            r22 = r9
            r24 = r1
            r26 = r2
            r27 = r0
            r28 = r12
            r18 = r10
            X.A3q r2 = r18.A03(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r2 = X.C394539yH.A00(r2)
            X.8Jw r12 = r5.A0U
            X.1iA r24 = X.1iA.A0Q
            int r10 = r0.A08
            java.lang.String r9 = r0.A0a
            com.instagram.common.gallery.Medium r3 = r0.A0F
            if (r3 == 0) goto L_0x0511
            java.lang.String r3 = r3.A0O
        L_0x047e:
            com.instagram.camera.effect.models.CameraAREffect r8 = r1.A01
            X.8PW r5 = r1.A05
            if (r5 != 0) goto L_0x050d
            r5 = 0
        L_0x0485:
            java.util.HashMap r32 = X.C59895JbK.A0D(r4, r5)
            X.8PW r4 = r1.A05
            if (r4 != 0) goto L_0x050a
            r4 = 0
        L_0x048e:
            X.LMJ r22 = X.C59895JbK.A09(r4)
            java.lang.String r7 = r0.A0d
            X.9I6 r20 = new X.9I6
            r20.<init>()
            X.C59895JbK.A0B(r14)
            X.8PW r4 = r1.A05
            r38 = 1
            if (r4 == 0) goto L_0x0507
            boolean r4 = r4.A00()
            if (r4 != r11) goto L_0x0507
        L_0x04a8:
            X.8PW r4 = r1.A05
            if (r4 != 0) goto L_0x0504
            r4 = 0
        L_0x04ad:
            int r37 = X.C59895JbK.A00(r4)
            X.8PW r4 = r1.A05
            if (r4 != 0) goto L_0x04ff
            r5 = 0
            r4 = 0
        L_0x04b7:
            android.util.Pair r19 = X.C59895JbK.A04(r5, r4)
            X.8pT r4 = r1.A04
            com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r23 = X.AEE.A00(r4)
            boolean r39 = X.AEE.A01(r1)
            java.lang.Integer r25 = r0.A04()
            java.util.List r6 = r0.A0q
            java.util.List r5 = r0.A0r
            r0.A01()
            java.util.List r35 = X.C394979z0.A00(r0)
            java.lang.String r4 = r0.A0g
            java.lang.String r1 = r0.A0e
            java.lang.String r0 = r0.A0i
            r21 = r8
            r26 = r9
            r27 = r3
            r28 = r7
            r29 = r4
            r30 = r1
            r31 = r0
            r33 = r6
            r34 = r5
            r36 = r10
            r18 = r12
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r0 = r18.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.34S r3 = new X.34S
            r3.<init>(r2, r0)
            goto L_0x06bd
        L_0x04ff:
            java.util.List r5 = r4.A0E
            java.util.List r4 = r4.A0F
            goto L_0x04b7
        L_0x0504:
            X.8Nz r4 = r4.A06
            goto L_0x04ad
        L_0x0507:
            r38 = 0
            goto L_0x04a8
        L_0x050a:
            java.util.List r4 = r4.A0D
            goto L_0x048e
        L_0x050d:
            java.util.List r5 = r5.A0E
            goto L_0x0485
        L_0x0511:
            r3 = 0
            goto L_0x047e
        L_0x0514:
            boolean r2 = r5.A0o
            if (r2 == 0) goto L_0x051c
            java.lang.String r3 = r5.A0h
            goto L_0x043f
        L_0x051c:
            r3 = 0
            goto L_0x043f
        L_0x051f:
            r20 = r19
            goto L_0x03b6
        L_0x0523:
            X.8nd r1 = r3.A02()
            goto L_0x035c
        L_0x0529:
            java.lang.Object r0 = r54.get()
            X.0qQ.A07(r0)
            boolean r34 = X.AnonymousClass7TE.A1a(r0)
            X.8pV r0 = r2.A00()
            r21 = 0
            r23 = 7
            r29 = 0
            X.9I6 r20 = new X.9I6
            r22 = r21
            r24 = r21
            r25 = r21
            r20.<init>(r21, r22, r23, r24, r25)
            r3 = 1
            r5 = 0
            r4 = r48
            if (r55 == 0) goto L_0x05c4
            com.instagram.common.session.UserSession r6 = r4.A02
            android.content.Context r2 = r4.A01
            X.6if r1 = r4.A09
            java.lang.Object r1 = r1.get()
            X.8Jj r1 = (X.C353838Jj) r1
            android.graphics.Bitmap r1 = r1.A02(r3)
            X.AnonymousClass7TG.A1N(r6, r2)
            if (r1 == 0) goto L_0x05c1
            X.1GK r27 = X.AEI.A01(r2, r1, r6, r3)
        L_0x0568:
            X.82o r1 = r4.A06
            X.82Y r1 = r1.A01
            X.8Yz r1 = r1.A0X
            if (r1 == 0) goto L_0x05bf
            X.80m r1 = r1.A08
            java.lang.Object r1 = r1.A00
        L_0x0574:
            boolean r1 = r1 instanceof X.AnonymousClass80O
            if (r1 == 0) goto L_0x0587
            com.instagram.common.session.UserSession r7 = r4.A02
            X.0Tu r6 = X.0Tu.A05
            r1 = 36324372373450799(0x810cd30002302f, double:3.035017583253111E-306)
            boolean r1 = X.182.A06(r6, r7, r1)
            if (r1 != 0) goto L_0x05bd
        L_0x0587:
            X.8Ji r1 = r4.A04
            X.81C r1 = r1.A00
            X.81E r1 = r1.A00()
            X.8Jj r1 = (X.C353838Jj) r1
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x05a6
            com.instagram.common.session.UserSession r7 = r4.A02
            X.0Tu r6 = X.0Tu.A05
            r1 = 36324372373319725(0x810cd30000302d, double:3.035017583170219E-306)
            boolean r1 = X.182.A06(r6, r7, r1)
            if (r1 != 0) goto L_0x05bd
        L_0x05a6:
            r6 = 1
        L_0x05a7:
            X.8PW r1 = r0.A05
            X.7zv r1 = X.AnonymousClass8L1.A01(r4, r1)
            if (r1 != 0) goto L_0x05c7
            X.8KX r0 = r4.A0A
            java.lang.String r1 = "Captured video is null"
            X.7UH r0 = r0.A01
            r0.A02(r5, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x05bd:
            r6 = 0
            goto L_0x05a7
        L_0x05bf:
            r1 = r5
            goto L_0x0574
        L_0x05c1:
            r27 = 0
            goto L_0x0568
        L_0x05c4:
            r27 = r5
            goto L_0x0568
        L_0x05c7:
            X.8PW r2 = r0.A05
            if (r2 == 0) goto L_0x06ac
            boolean r2 = X.AnonymousClass8L1.A04(r2)
            if (r2 != r3) goto L_0x06ac
        L_0x05d1:
            X.AnonymousClass8L1.A02(r4, r0)
        L_0x05d4:
            X.8L3 r8 = r4.A07
            java.lang.String r7 = r4.A0B
            com.instagram.common.session.UserSession r2 = r4.A02
            android.content.Context r9 = r4.A01
            X.8Ji r10 = r4.A04
            X.81C r10 = r10.A00
            X.81E r10 = r10.A00()
            X.8Jj r10 = (X.C353838Jj) r10
            android.graphics.Bitmap r6 = r10.A02(r6)
            X.AnonymousClass7TG.A1N(r2, r9)
            if (r6 == 0) goto L_0x06a8
            X.1GK r26 = X.AEI.A01(r9, r6, r2, r3)
        L_0x05f3:
            X.8PW r6 = r0.A05
            if (r6 == 0) goto L_0x06a4
            X.0eM r6 = r6.A0M
            java.lang.Object r9 = r6.getValue()
            java.util.Set r9 = (java.util.Set) r9
            X.9sz r6 = X.C391429sz.A0P
            boolean r33 = r9.contains(r6)
        L_0x0605:
            r32 = r52
            r25 = r8
            r28 = r0
            r30 = r1
            r31 = r7
            X.A3q r11 = r25.A01(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.8Jw r9 = r4.A08
            X.1iA r24 = X.1iA.A0a
            int r8 = r1.A0F
            java.lang.String r7 = r1.A0f
            java.lang.String r27 = r1.A06()
            com.instagram.camera.effect.models.CameraAREffect r6 = r0.A00
            X.8PW r10 = r0.A05
            if (r10 == 0) goto L_0x06a2
            java.util.List r10 = r10.A0E
        L_0x0627:
            java.util.HashMap r32 = X.C59895JbK.A0D(r2, r10)
            X.8PW r2 = r0.A05
            if (r2 == 0) goto L_0x06a0
            java.util.List r2 = r2.A0D
        L_0x0631:
            X.LMJ r22 = X.C59895JbK.A09(r2)
            java.lang.String r2 = r1.A0l
            X.82p r4 = r4.A05
            X.C59895JbK.A0B(r4)
            X.8PW r4 = r0.A05
            r38 = 1
            if (r4 == 0) goto L_0x069d
            boolean r4 = r4.A00()
            if (r4 != r3) goto L_0x069d
        L_0x0648:
            X.8PW r3 = r0.A05
            if (r3 == 0) goto L_0x069b
            X.8Nz r3 = r3.A06
        L_0x064e:
            int r37 = X.C59895JbK.A00(r3)
            X.8PW r4 = r0.A05
            if (r4 == 0) goto L_0x0699
            java.util.List r3 = r4.A0E
            java.util.List r5 = r4.A0F
        L_0x065a:
            android.util.Pair r19 = X.C59895JbK.A04(r3, r5)
            X.8pT r3 = r0.A04
            com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r23 = X.AEE.A00(r3)
            boolean r39 = X.AEE.A02(r0)
            java.lang.Integer r25 = r1.A04()
            r1.A02()
            r21 = r6
            r26 = r7
            r28 = r2
            r30 = r29
            r31 = r29
            r33 = r29
            r34 = r29
            r35 = r29
            r36 = r8
            r18 = r9
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r2 = r18.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r11)
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r1 = X.C394539yH.A00(r0)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r2)
            X.34S r3 = new X.34S
            r3.<init>(r1, r0)
            goto L_0x06c0
        L_0x0699:
            r3 = r5
            goto L_0x065a
        L_0x069b:
            r3 = r5
            goto L_0x064e
        L_0x069d:
            r38 = 0
            goto L_0x0648
        L_0x06a0:
            r2 = r5
            goto L_0x0631
        L_0x06a2:
            r10 = r5
            goto L_0x0627
        L_0x06a4:
            r33 = 0
            goto L_0x0605
        L_0x06a8:
            r26 = 0
            goto L_0x05f3
        L_0x06ac:
            X.8PW r2 = r0.A05
            if (r2 == 0) goto L_0x05d4
            boolean r2 = X.AnonymousClass8L1.A03(r2)
            if (r2 != r3) goto L_0x05d4
            goto L_0x05d1
        L_0x06b8:
            X.34S r3 = new X.34S
            r3.<init>(r4, r14)
        L_0x06bd:
            X.0qQ.A0A(r3)
        L_0x06c0:
            X.9UC r1 = new X.9UC
            r1.<init>(r13)
            r0 = r17
            java.lang.Object r0 = r13.A01(r0, r1)
            X.9UB r0 = (X.AnonymousClass9UB) r0
            X.AnonymousClass9UB.A00(r0)
            r0.A00 = r3
            java.util.List r1 = r0.A01
            r0 = r16
            r1.addAll(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C394559yJ.A00(com.instagram.common.session.UserSession, X.8QN, X.8K4, X.8L1, X.8MC, X.B1O, X.82p, java.lang.String, X.0eK, X.0eK, boolean):X.34S");
    }
}
