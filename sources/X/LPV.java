package X;

public abstract class LPV {
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C62643Kk5 r82, X.C62668KkU r83, X.C62649KkB r84, com.instagram.common.session.UserSession r85, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r86, X.C293505kq r87, java.lang.Integer r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, java.util.List r92, java.util.List r93, long r94, boolean r96) {
        /*
            r1 = r87
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r0 = r1.A0B
            if (r0 == 0) goto L_0x0184
            com.instagram.music.common.model.AudioOverlayTrack r3 = r1.A0N
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r2 = r0.A0b
            if (r2 == 0) goto L_0x0024
            java.util.Iterator r4 = X.AnonymousClass7TF.A0s(r2)
        L_0x0014:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0024
            java.lang.Object r2 = X.AnonymousClass7TF.A0a(r4)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            X.JTR.A1U(r5, r2)
            goto L_0x0014
        L_0x0024:
            X.29f r17 = X.JTO.A0c(r85)
            int r2 = r0.A04
            X.JYm r21 = X.2AL.A03(r2)
            int r2 = r0.A05
            X.28t r22 = X.C59895JbK.A05(r2)
            int r2 = r0.A01
            r70 = r2
            int r2 = r0.A02
            r71 = r2
            java.util.ArrayList r54 = r0.A01()
            X.80N r28 = X.AnonymousClass80N.A00
            int r2 = r0.A03
            r72 = r2
            java.util.List r2 = r0.A0g
            r55 = r2
            java.util.List r2 = r0.A0h
            r56 = r2
            java.util.List r2 = r0.A0f
            r57 = r2
            java.util.HashMap r2 = r0.A0a
            r69 = r2
            java.util.List r2 = r0.A0j
            r58 = r2
            boolean r2 = r0.A0v
            r75 = r2
            int r2 = r0.A06
            r73 = r2
            java.util.List r2 = r0.A0l
            r59 = r2
            java.util.List r2 = r0.A0m
            r60 = r2
            android.util.Pair r18 = r0.A00()
            java.lang.String r2 = r0.A0L
            r38 = r2
            java.lang.String r2 = r0.A0M
            r39 = r2
            java.lang.Integer r4 = r0.A0H
            java.lang.Integer r2 = r0.A0I
            A02(r4, r2)
            r31 = 0
            if (r3 == 0) goto L_0x0125
            java.lang.String r2 = r3.A0E
            if (r2 == 0) goto L_0x0121
            java.lang.String r41 = "original"
        L_0x0087:
            java.lang.String r6 = r3.A0A
        L_0x0089:
            X.JVj r25 = X.C59725JVj.AUDIENCE_PICKER
            X.JXu r3 = r1.A0G
            X.JXu r2 = X.JXu.A03
            boolean r76 = X.AnonymousClass7TF.A1W(r3, r2)
            java.lang.Integer r2 = r0.A0F
            r34 = r2
            boolean r2 = r0.A0y
            r77 = r2
            java.lang.String r3 = r0.A0O
            if (r3 == 0) goto L_0x011e
            int r2 = r3.length()
            if (r2 == 0) goto L_0x011e
            X.8aU r23 = X.C358178aU.valueOf(r3)
        L_0x00a9:
            java.util.List r2 = r0.A0d
            r61 = r2
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo r15 = r0.A0D
            X.50r r5 = r1.A0H
            X.50r r4 = X.C2801950r.FEED_POST
            boolean r78 = X.AnonymousClass7TF.A1W(r5, r4)
            java.util.List r2 = r1.A0v
            java.util.ArrayList r62 = X.2AL.A0C(r2)
            java.lang.String r14 = r1.A0T
            boolean r13 = r0.A13
            X.4ys r2 = r1.A08
            if (r2 == 0) goto L_0x011b
            long r2 = r2.A00
            java.lang.Long r36 = java.lang.Long.valueOf(r2)
        L_0x00cb:
            int r2 = r0.A08
            r3 = 1
            if (r2 == r3) goto L_0x0118
            r3 = 2
            if (r2 == r3) goto L_0x0115
            r3 = 3
            if (r2 == r3) goto L_0x0112
            X.293 r26 = X.293.A06
        L_0x00d8:
            r80 = 0
            java.lang.String r12 = r0.A0X
            int r11 = r0.A07
            boolean r10 = r0.A10
            java.util.List r9 = r0.A0i
            java.lang.String r8 = r0.A0U
            java.lang.String r7 = r0.A0T
            java.lang.String r3 = r0.A0Q
            X.Jw4 r1 = r1.A03
            if (r1 == 0) goto L_0x012a
            boolean r2 = r1.A01
            java.lang.Boolean r32 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x012c
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r16 = r1.iterator()
        L_0x0100:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x012d
            java.lang.Object r1 = r16.next()
            X.JtT r1 = (X.C60909JtT) r1
            java.lang.String r1 = r1.A01
            r2.add(r1)
            goto L_0x0100
        L_0x0112:
            X.293 r26 = X.293.A03
            goto L_0x00d8
        L_0x0115:
            X.293 r26 = X.293.A02
            goto L_0x00d8
        L_0x0118:
            X.293 r26 = X.293.A04
            goto L_0x00d8
        L_0x011b:
            r36 = 0
            goto L_0x00cb
        L_0x011e:
            r23 = 0
            goto L_0x00a9
        L_0x0121:
            java.lang.String r41 = "song"
            goto L_0x0087
        L_0x0125:
            r41 = 0
            r6 = 0
            goto L_0x0089
        L_0x012a:
            r32 = 0
        L_0x012c:
            r2 = 0
        L_0x012d:
            boolean r0 = r0.A0q
            java.lang.Boolean r33 = java.lang.Boolean.valueOf(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r94)
            java.util.List r67 = X.AnonymousClass7TE.A1I(r0)
            java.util.List r68 = X.AnonymousClass7TE.A1I(r91)
            if (r5 != r4) goto L_0x0181
            X.4yP r20 = X.C279294yP.FEED
        L_0x0143:
            r19 = r82
            r24 = r83
            r83 = r96
            r27 = r84
            r29 = r86
            r35 = r88
            r43 = r89
            r44 = r90
            r63 = r92
            r64 = r93
            r30 = r15
            r37 = r31
            r40 = r31
            r42 = r6
            r45 = r14
            r46 = r12
            r47 = r31
            r48 = r8
            r49 = r7
            r50 = r3
            r51 = r31
            r52 = r31
            r53 = r31
            r65 = r9
            r66 = r2
            r74 = r11
            r79 = r13
            r81 = r10
            r82 = r80
            r17.A0S(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83)
            return
        L_0x0181:
            r20 = 0
            goto L_0x0143
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LPV.A00(X.Kk5, X.KkU, X.KkB, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, X.5kq, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007d, code lost:
        if (X.AnonymousClass7TF.A1Y(r0.A23, r5) == false) goto L_0x007f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0102 A[LOOP:0: B:31:0x00fc->B:33:0x0102, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015d A[LOOP:1: B:48:0x0157->B:50:0x015d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017d A[LOOP:2: B:53:0x0177->B:55:0x017d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0249  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C62649KkB r86, com.instagram.common.session.UserSession r87, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r88, com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig r89, X.C293505kq r90, X.AnonymousClass3Q2 r91, X.C60951Ju9 r92, X.C54704HPj r93, java.lang.String r94, boolean r95) {
        /*
            r4 = r93
            r17 = 0
            r13 = r87
            r2 = r90
            r0 = r17
            boolean r5 = X.AnonymousClass7TF.A1U(r0, r13, r2)
            r11 = 2
            r0 = r91
            r71 = r94
            r1 = r71
            X.AnonymousClass7TF.A1E(r0, r11, r1)
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            X.KkU r6 = X.C62668KkU.CLIPS
            r12.add(r6)
            X.27r r14 = X.27p.A01(r13)
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r1 = r2.A0B
            if (r1 == 0) goto L_0x0121
            int r3 = r1.A05
        L_0x002b:
            X.28t r7 = X.C59895JbK.A05(r3)
            X.4yP r8 = X.C279294yP.CLIPS
            java.lang.String r3 = r2.A0T
            r69 = r3
            java.lang.String r10 = X.DbS.A0k()
            X.0wc r9 = r14.A01
            java.lang.String r3 = "ig_camera_publish_media_click"
            X.0Aj r9 = X.AnonymousClass7TE.A0e(r9, r3)
            boolean r3 = r9.isSampled()
            if (r3 == 0) goto L_0x006b
            X.283 r3 = r14.A04
            X.JTP.A1I(r9, r3)
            X.28D r3 = r3.A09
            X.JTS.A15(r3, r9, r11)
            X.JTO.A1P(r7, r9)
            r3 = r71
            X.DbS.A1K(r9, r3)
            java.lang.String r7 = "composition_str_id"
            r3 = r69
            r9.AAJ(r7, r3)
            X.C51965G9l.A1K(r9, r10)
            java.lang.String r3 = "camera_destination"
            r9.A8M(r8, r3)
            r9.Cgf()
        L_0x006b:
            r26 = 0
            X.818 r19 = X.AnonymousClass818.IG_REELS_COMPOSER
            java.lang.Integer r3 = r0.A2C
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            if (r3 != r9) goto L_0x007f
            java.lang.Boolean r3 = r0.A23
            boolean r3 = X.AnonymousClass7TF.A1Y(r3, r5)
            r24 = 1
            if (r3 != 0) goto L_0x0081
        L_0x007f:
            r24 = 0
        L_0x0081:
            r37 = r26
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            boolean r3 = r4 instanceof X.KYX
            if (r3 == 0) goto L_0x00b0
            X.KYX r4 = (X.KYX) r4
            X.Ki8 r3 = r4.A00()
            X.Jqn r10 = new X.Jqn
            r10.<init>()
            X.Jql r7 = new X.Jql
            r7.<init>()
            int r3 = r3.ordinal()
            if (r3 != r5) goto L_0x00a8
            X.KkY r4 = X.C62672KkY.BRANDED_CONTENT
            java.lang.String r3 = "reason"
            r7.A01(r4, r3)
        L_0x00a8:
            java.lang.String r3 = "contentIneligibilityError"
            r10.A02(r7, r3)
            r8.add(r10)
        L_0x00b0:
            r4 = r92
            if (r92 == 0) goto L_0x011e
            java.lang.String r3 = r4.A03
            int r3 = r3.length()
            if (r3 == 0) goto L_0x011e
            X.Kin r4 = r4.A00
            X.Kin r3 = X.C62616Kin.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            if (r4 == r3) goto L_0x00c6
            X.Kin r3 = X.C62616Kin.FB_HOLDOUT
            if (r4 != r3) goto L_0x00df
        L_0x00c6:
            X.KkG r10 = X.C62654KkG.INVALID_OR_MISSING_DESTINATION_AUDIENCE_TYPE
        L_0x00c8:
            X.Jqn r7 = new X.Jqn
            r7.<init>()
            X.Jqm r4 = new X.Jqm
            r4.<init>()
            java.lang.String r3 = "reason"
            r4.A01(r10, r3)
            java.lang.String r3 = "destinationIneligibilityError"
            r7.A02(r4, r3)
            r8.add(r7)
        L_0x00df:
            X.JZZ r18 = X.JZZ.REELS
            r20 = r13
            r21 = r26
            r22 = r69
            r23 = r8
            X.C64007LIn.A00(r18, r19, r20, r21, r22, r23, r24)
            java.lang.Integer r3 = r0.A2C
            if (r3 != r9) goto L_0x0110
            X.Kk5 r38 = X.C62643Kk5.CROSSPOST
        L_0x00f2:
            java.util.List r8 = r2.A0v
            java.util.ArrayList r16 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r7 = r8.iterator()
        L_0x00fc:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0124
            X.51M r3 = X.JTO.A0g(r7)
            java.util.List r4 = X.JTU.A0a(r3)
            r3 = r16
            r3.add(r4)
            goto L_0x00fc
        L_0x0110:
            java.lang.Boolean r3 = r0.A1y
            boolean r3 = X.AnonymousClass7TF.A1Y(r3, r5)
            if (r3 == 0) goto L_0x011b
            X.Kk5 r38 = X.C62643Kk5.RECOMMEND
            goto L_0x00f2
        L_0x011b:
            r38 = 0
            goto L_0x00f2
        L_0x011e:
            X.KkG r10 = X.C62654KkG.MISSING_REELS_DESTINATION
            goto L_0x00c8
        L_0x0121:
            r3 = 3
            goto L_0x002b
        L_0x0124:
            int r3 = r0.A0R
            java.lang.Long r4 = X.DbS.A0j(r3)
            int r3 = r0.A0S
            java.lang.Long r3 = X.DbS.A0j(r3)
            java.lang.Long[] r3 = new java.lang.Long[]{r4, r3}
            java.util.List r3 = X.0sr.A1P(r3)
            java.util.List r70 = X.AnonymousClass7TE.A1I(r3)
            X.JxB r3 = r0.A0v
            if (r3 == 0) goto L_0x0170
            java.lang.Integer r7 = r3.A00
            if (r7 == 0) goto L_0x0170
            int r3 = r7.intValue()
            if (r3 > 0) goto L_0x014b
            r7 = 0
        L_0x014b:
            java.util.List r3 = r0.A4K
            boolean r93 = X.AnonymousClass7TF.A1V(r3)
            java.util.Iterator r9 = r8.iterator()
            r50 = 0
        L_0x0157:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0172
            X.51M r3 = X.JTO.A0g(r9)
            X.51R r3 = r3.A0F
            java.lang.String r3 = r3.A0F
            java.io.File r3 = X.AnonymousClass7TE.A0t(r3)
            long r3 = r3.length()
            long r50 = r50 + r3
            goto L_0x0157
        L_0x0170:
            r7 = 0
            goto L_0x014b
        L_0x0172:
            java.util.Iterator r9 = r8.iterator()
            r4 = 0
        L_0x0177:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0187
            X.51M r3 = X.JTO.A0g(r9)
            X.51R r3 = r3.A0F
            int r3 = r3.A04
            int r4 = r4 + r3
            goto L_0x0177
        L_0x0187:
            if (r4 != 0) goto L_0x0249
            r50 = 0
        L_0x018b:
            r3 = r17
            java.lang.Object r3 = X.00k.A0O(r8, r3)
            X.51M r3 = (X.AnonymousClass51M) r3
            if (r3 == 0) goto L_0x019b
            X.51R r3 = r3.A0F
            java.lang.String r14 = r3.A0F
            if (r14 != 0) goto L_0x019d
        L_0x019b:
            java.lang.String r14 = ""
        L_0x019d:
            java.lang.String r3 = r0.A3t
            r27 = r86
            r31 = r88
            r39 = r6
            r40 = r27
            r41 = r13
            r42 = r31
            r43 = r2
            r44 = r7
            r45 = r71
            r46 = r3
            r47 = r14
            r48 = r16
            r49 = r70
            r52 = r93
            A00(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r52)
            if (r95 == 0) goto L_0x01e6
            X.KkU r4 = X.C62668KkU.FEED
            java.lang.String r3 = r0.A3t
            r52 = r26
            r53 = r4
            r54 = r27
            r55 = r13
            r56 = r31
            r57 = r2
            r58 = r7
            r59 = r71
            r60 = r3
            r61 = r14
            r62 = r16
            r63 = r70
            r64 = r50
            r66 = r93
            A00(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r66)
            r12.add(r4)
        L_0x01e6:
            java.lang.Boolean r3 = r0.A23
            boolean r3 = X.AnonymousClass7TF.A1Y(r3, r5)
            if (r3 == 0) goto L_0x0214
            X.KkU r4 = X.C62668KkU.FACEBOOK
            java.lang.String r3 = r0.A3t
            r52 = r26
            r53 = r4
            r54 = r27
            r55 = r13
            r56 = r31
            r57 = r2
            r58 = r7
            r59 = r71
            r60 = r3
            r61 = r14
            r62 = r16
            r63 = r70
            r64 = r50
            r66 = r93
            A00(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r66)
            r12.add(r4)
        L_0x0214:
            java.lang.String r0 = r0.A3t
            r54 = r0
            if (r1 == 0) goto L_0x03cb
            com.instagram.music.common.model.AudioOverlayTrack r0 = r2.A0N
            java.util.List r3 = r2.A0p
            if (r3 == 0) goto L_0x0252
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r9 = r3.iterator()
        L_0x0228:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0253
            java.lang.Object r3 = r9.next()
            com.instagram.music.common.model.AudioOverlayTrack r3 = (com.instagram.music.common.model.AudioOverlayTrack) r3
            java.lang.String r6 = r3.A0A
            java.lang.String r4 = ""
            if (r6 != 0) goto L_0x023b
            r6 = r4
        L_0x023b:
            java.lang.String r3 = r3.A0B
            if (r3 == 0) goto L_0x0240
            r4 = r3
        L_0x0240:
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r6, r4)
            r10.add(r3)
            goto L_0x0228
        L_0x0249:
            long r3 = (long) r4
            long r50 = r50 / r3
            r3 = 8000(0x1f40, double:3.9525E-320)
            long r50 = r50 * r3
            goto L_0x018b
        L_0x0252:
            r10 = 0
        L_0x0253:
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r3 = r1.A0b
            if (r3 == 0) goto L_0x026f
            java.util.Iterator r6 = X.AnonymousClass7TF.A0s(r3)
        L_0x025f:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x026f
            java.lang.Object r3 = X.AnonymousClass7TF.A0a(r6)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            X.JTR.A1U(r4, r3)
            goto L_0x025f
        L_0x026f:
            X.29f r18 = X.JTO.A0c(r13)
            int r3 = r1.A04
            r78 = r3
            X.JYm r22 = X.2AL.A03(r78)
            int r3 = r1.A05
            X.28t r23 = X.C59895JbK.A05(r3)
            int r3 = r1.A01
            r79 = r3
            int r3 = r1.A02
            r80 = r3
            java.util.ArrayList r59 = r1.A01()
            X.80N r30 = X.AnonymousClass80N.A00
            int r3 = r1.A03
            r81 = r3
            java.util.List r3 = r1.A0g
            r60 = r3
            java.util.List r3 = r1.A0h
            r61 = r3
            java.util.List r3 = r1.A0f
            r62 = r3
            java.util.HashMap r3 = r1.A0a
            r76 = r3
            java.util.List r3 = r1.A0j
            r63 = r3
            boolean r3 = r1.A0v
            r84 = r3
            int r3 = r1.A06
            r82 = r3
            java.util.List r3 = r1.A0l
            r64 = r3
            java.util.List r3 = r1.A0m
            r65 = r3
            android.util.Pair r19 = r1.A00()
            java.lang.String r3 = r1.A0L
            r43 = r3
            java.lang.String r3 = r1.A0M
            r44 = r3
            java.lang.Integer r4 = r1.A0H
            java.lang.Integer r3 = r1.A0I
            A02(r4, r3)
            if (r0 == 0) goto L_0x0379
            java.lang.String r3 = r0.A0E
            if (r3 == 0) goto L_0x0375
            java.lang.String r46 = "original"
        L_0x02d2:
            java.lang.String r15 = r0.A0A
            java.lang.String r13 = r0.A0B
        L_0x02d6:
            X.JVj r24 = X.C59725JVj.AUDIENCE_PICKER
            X.JXu r3 = r2.A0G
            X.JXu r0 = X.JXu.A03
            boolean r85 = X.AnonymousClass7TF.A1W(r3, r0)
            java.lang.Integer r0 = r1.A0F
            r39 = r0
            boolean r0 = r1.A0y
            r86 = r0
            java.util.List r0 = r1.A0d
            r67 = r0
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo r0 = r1.A0D
            r33 = r0
            X.50r r6 = r2.A0H
            X.50r r4 = X.C2801950r.FEED_POST
            boolean r87 = X.AnonymousClass7TF.A1W(r6, r4)
            java.util.ArrayList r68 = X.2AL.A0C(r8)
            boolean r0 = r1.A13
            r88 = r0
            X.4ys r0 = r2.A08
            if (r0 == 0) goto L_0x0372
            long r8 = r0.A00
            java.lang.Long r41 = java.lang.Long.valueOf(r8)
        L_0x030a:
            int r0 = r1.A08
            if (r0 == r5) goto L_0x036f
            if (r0 == r11) goto L_0x036c
            r3 = 3
            if (r0 == r3) goto L_0x0369
            X.293 r25 = X.293.A06
        L_0x0315:
            int r0 = r1.A00
            X.EZl r20 = X.2AL.A02(r0)
            com.instagram.api.schemas.ACRType r0 = r1.A0A
            r28 = r0
            java.lang.String r0 = r1.A0X
            r52 = r0
            int r0 = r1.A07
            r83 = r0
            boolean r0 = r1.A10
            r90 = r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r1.A0B
            r29 = r0
            java.util.List r0 = r1.A0i
            r72 = r0
            java.lang.String r0 = r1.A0U
            r53 = r0
            java.lang.String r9 = r1.A0T
            java.lang.String r8 = r1.A0Q
            java.lang.String r5 = r1.A0P
            boolean r3 = r1.A11
            X.Jw4 r0 = r2.A03
            if (r0 == 0) goto L_0x037f
            boolean r2 = r0.A01
            java.lang.Boolean r37 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x037f
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x0357:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0380
            java.lang.Object r0 = r11.next()
            X.JtT r0 = (X.C60909JtT) r0
            java.lang.String r0 = r0.A01
            r2.add(r0)
            goto L_0x0357
        L_0x0369:
            X.293 r25 = X.293.A03
            goto L_0x0315
        L_0x036c:
            X.293 r25 = X.293.A02
            goto L_0x0315
        L_0x036f:
            X.293 r25 = X.293.A04
            goto L_0x0315
        L_0x0372:
            r41 = 0
            goto L_0x030a
        L_0x0375:
            java.lang.String r46 = "song"
            goto L_0x02d2
        L_0x0379:
            r46 = 0
            r15 = 0
            r13 = 0
            goto L_0x02d6
        L_0x037f:
            r2 = 0
        L_0x0380:
            boolean r0 = r1.A0q
            java.lang.Boolean r38 = java.lang.Boolean.valueOf(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r50)
            java.util.List r74 = X.AnonymousClass7TE.A1I(r0)
            java.util.List r75 = X.AnonymousClass7TE.A1I(r14)
            if (r6 != r4) goto L_0x0396
            X.4yP r21 = X.C279294yP.FEED
        L_0x0396:
            r32 = r89
            r34 = r26
            r35 = r26
            r36 = r26
            r40 = r7
            r42 = r26
            r45 = r26
            r47 = r15
            r48 = r13
            r49 = r71
            r50 = r54
            r51 = r69
            r54 = r9
            r55 = r8
            r56 = r5
            r57 = r26
            r58 = r26
            r66 = r10
            r69 = r16
            r71 = r12
            r73 = r2
            r77 = r26
            r89 = r17
            r91 = r3
            r92 = r17
            r18.A0T(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93)
        L_0x03cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LPV.A01(X.KkB, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig, X.5kq, X.3Q2, X.Ju9, X.HPj, java.lang.String, boolean):void");
    }

    public static final void A02(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            new AnonymousClass9I6(0, 0, 7, 0, false);
        } else {
            new AnonymousClass9I6(true, num.intValue(), num2.intValue(), 0);
        }
    }
}
