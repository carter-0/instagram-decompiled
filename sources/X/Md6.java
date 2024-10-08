package X;

public final class Md6 {
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02a9, code lost:
        if (r16 != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r3.length() != 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c0, code lost:
        if (r57 == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0125, code lost:
        if (X.O0U.A00(r5).booleanValue() == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b9, code lost:
        if (r6.A04(r0) == false) goto L_0x01bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C66809Mcv A00(android.content.Context r78, X.AnonymousClass0iw r79, com.instagram.common.session.UserSession r80, X.AnonymousClass9HC r81, X.AnonymousClass7LQ r82, X.AnonymousClass7L2 r83) {
        /*
            r77 = this;
            r10 = 0
            r3 = r78
            X.0qQ.A0B(r3, r10)
            r12 = 1
            r5 = r80
            r7 = r81
            r11 = r83
            X.AnonymousClass7TG.A0w(r12, r5, r11, r7)
            r2 = r82
            X.3su r0 = r2.A0e
            X.0qQ.A07(r0)
            java.lang.Object r1 = r0.A1U
            boolean r4 = r1 instanceof X.1Xj
            if (r4 != 0) goto L_0x0023
            boolean r4 = r1 instanceof X.C300925yB
            if (r4 != 0) goto L_0x0023
            java.lang.Object r1 = r0.A1T
        L_0x0023:
            com.instagram.user.model.User r4 = r2.A0K
            r49 = 0
            if (r4 == 0) goto L_0x002d
            java.lang.String r49 = r4.getUsername()
        L_0x002d:
            X.7SD r4 = r2.A0G
            int r4 = r4.A08
            r6 = 29
            if (r4 != r6) goto L_0x00c3
            X.0eM r4 = r7.A0H
            boolean r4 = X.AnonymousClass7TF.A1Z(r4)
            if (r4 == 0) goto L_0x00c3
            int r4 = X.AnonymousClass7PV.A00(r3, r10)
            X.MeT r8 = new X.MeT
            r8.<init>(r4)
        L_0x0046:
            X.7FT r17 = X.C66580MXl.A0Y(r3, r5, r7, r2, r0)
            X.76d r13 = X.C3262776c.A00(r3, r5)
            boolean r4 = r1 instanceof X.C300925yB
            if (r4 == 0) goto L_0x00d5
            X.5yB r1 = (X.C300925yB) r1
            boolean r57 = r1.A05()
            r48 = 0
            if (r57 == 0) goto L_0x00b8
            java.lang.String r4 = r1.A08
            if (r4 == 0) goto L_0x0066
            int r3 = r4.length()
            if (r3 != 0) goto L_0x00bc
        L_0x0066:
            r41 = r48
        L_0x0068:
            java.lang.String r3 = r1.A08
            if (r3 == 0) goto L_0x0072
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0074
        L_0x0072:
            r3 = r48
        L_0x0074:
            X.7SD r9 = r2.A0G
            boolean r6 = r9.A0x
            X.4li r4 = r9.A0N
            boolean r4 = r4.A08
            java.lang.Long r21 = X.C330007Lb.A00(r9)
            r18 = r13
            r19 = r0
            r20 = r1
            r22 = r6
            r23 = r4
            X.77B r42 = r18.A04(r19, r20, r21, r22, r23)
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r46 = X.C66583MXo.A0W(r2, r0)
            int r52 = r2.A01()
            float r51 = r1.A01()
            X.7FE r44 = X.C66582MXn.A0U(r5, r7, r2, r11, r0)
            r54 = -1
            X.Mcv r40 = new X.Mcv
            r43 = r17
            r45 = r8
            r47 = r3
            r50 = r48
            r53 = r10
            r56 = r12
            r58 = r10
            r59 = r10
            r60 = r10
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r56, r57, r58, r59, r60)
            return r40
        L_0x00b8:
            java.lang.String r4 = r1.A03()
        L_0x00bc:
            com.instagram.common.typedurl.SimpleImageUrl r41 = X.JTQ.A0G(r4)
            if (r57 == 0) goto L_0x0072
            goto L_0x0068
        L_0x00c3:
            android.content.res.Resources r8 = r3.getResources()
            r4 = 2131165226(0x7f07002a, float:1.7944663E38)
            int r4 = r8.getDimensionPixelSize(r4)
            X.MdN r8 = new X.MdN
            r8.<init>(r4)
            goto L_0x0046
        L_0x00d5:
            boolean r4 = r1 instanceof X.1Xj
            if (r4 == 0) goto L_0x02b6
            X.1Xj r1 = (X.1Xj) r1
            java.lang.String r4 = r1.getId()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.Integer r4 = r0.A0d(r4)
            X.0qQ.A07(r4)
            int r4 = r4.intValue()
            if (r4 == r12) goto L_0x0102
            if (r4 == 0) goto L_0x0102
            X.5yA r14 = new X.5yA
            r14.<init>(r5)
            X.7SD r4 = r2.A0G
            X.3t3 r9 = r4.A0P
            if (r9 == 0) goto L_0x0102
            int r4 = r4.A08
            r14.A02(r0, r9, r4)
        L_0x0102:
            java.lang.String r9 = r1.getId()
            X.76m r4 = new X.76m
            r4.<init>(r5, r0, r9)
            boolean r14 = r4.A05()
            X.7SD r9 = r2.A0G
            int r9 = r9.A08
            if (r9 != r6) goto L_0x0127
            boolean r6 = X.C70887OQf.A01(r0)
            if (r6 == 0) goto L_0x0127
            java.lang.Boolean r6 = X.O0U.A00(r5)
            boolean r6 = r6.booleanValue()
            r16 = 1
            if (r6 != 0) goto L_0x0129
        L_0x0127:
            r16 = 0
        L_0x0129:
            r22 = 0
            if (r14 == 0) goto L_0x029b
            android.content.res.Resources r6 = X.AnonymousClass7TF.A0A(r3)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r19 = r4.A04(r6, r10)
        L_0x0135:
            r69 = 1
            if (r14 == 0) goto L_0x0295
            int r62 = r4.A03()
        L_0x013d:
            android.net.Uri r4 = r1.A05
            if (r4 == 0) goto L_0x0291
            java.lang.String r58 = r4.toString()
        L_0x0145:
            boolean r4 = r1.CeS()
            r57 = r22
            if (r4 == 0) goto L_0x014f
            r57 = r58
        L_0x014f:
            com.instagram.model.mediasize.ExtendedImageUrl r51 = r1.A1n(r3)
            X.1Xj r3 = r0.A0s
            if (r3 == 0) goto L_0x028d
            long r64 = r3.A17()
        L_0x015b:
            X.7SD r4 = r2.A0G
            X.0qQ.A07(r4)
            java.lang.String r3 = r0.A1u
            r27 = r3
            java.lang.String r28 = r0.A0g()
            X.2FW r3 = r0.A10
            r21 = r3
            X.0qQ.A07(r21)
            X.1iA r23 = r0.A0W()
            java.lang.String r29 = r0.A0f()
            boolean r3 = r4.A0x
            r20 = r3
            boolean r3 = r0.A2P
            r18 = r3
            boolean r38 = r0.A1T()
            long r14 = r0.C7c()
            java.lang.Long r25 = java.lang.Long.valueOf(r14)
            boolean r15 = r0.A2G
            java.lang.Long r14 = r0.A1L
            boolean r3 = r0.A1S()
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r3)
            X.7AG r3 = r0.A0Q
            if (r3 == 0) goto L_0x028a
            java.lang.String r9 = r3.A08
        L_0x019d:
            X.77w r6 = X.C3267177w.A00
            java.lang.String r3 = X.C3267177w.A01(r0)
            if (r3 != 0) goto L_0x0284
            r32 = 0
        L_0x01a7:
            boolean r3 = r4.A1A
            if (r3 == 0) goto L_0x01bb
            boolean r3 = r4.A14
            if (r3 != 0) goto L_0x01bb
            boolean r3 = r4.A15
            if (r3 != 0) goto L_0x01bb
            boolean r3 = r6.A04(r0)
            r42 = 1
            if (r3 != 0) goto L_0x01bd
        L_0x01bb:
            r42 = 0
        L_0x01bd:
            boolean r43 = r6.A03(r0)
            r75 = 0
            int r3 = r4.A08
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            com.instagram.common.session.UserSession r3 = r13.A02
            java.lang.Boolean r3 = r0.A0Z(r3, r4)
            boolean r48 = r3.booleanValue()
            r30 = r22
            r31 = r9
            r33 = r22
            r34 = r22
            r35 = r22
            r36 = r20
            r37 = r18
            r39 = r15
            r40 = r10
            r41 = r10
            r44 = r10
            r45 = r10
            r46 = r10
            r47 = r10
            r18 = r13
            r20 = r1
            r26 = r14
            X.77B r52 = X.C3262876d.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            if (r16 == 0) goto L_0x0236
            java.lang.String r72 = r0.A0g()
            if (r72 == 0) goto L_0x0236
            X.3t0 r3 = r0.A0U()
            if (r3 == 0) goto L_0x0236
            java.lang.String r4 = r3.A00
            if (r4 == 0) goto L_0x0236
            r3 = r79
            if (r79 != 0) goto L_0x027f
            java.lang.String r3 = "direct_thread"
            X.0wc r70 = X.DbW.A0J(r5, r3)
        L_0x0215:
            java.lang.String r74 = r0.A0e()
            X.1Xj r3 = r0.A0s
            if (r3 == 0) goto L_0x0227
            X.4w4 r3 = r3.BQf()
            if (r3 == 0) goto L_0x0227
            java.lang.String r75 = r3.getTitle()
        L_0x0227:
            boolean r3 = r1.A5p()
            if (r3 == 0) goto L_0x0273
            java.lang.Integer r71 = X.AnonymousClass05K.A00
        L_0x022f:
            r73 = r4
            r76 = r10
            X.O0T.A00(r70, r71, r72, r73, r74, r75, r76)
        L_0x0236:
            boolean r3 = r0.A1c()
            if (r3 != 0) goto L_0x0247
            X.7SD r4 = r2.A0G
            X.0qQ.A07(r4)
            boolean r3 = r0.A2G
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r22 = X.C3263376i.A00(r4, r3)
        L_0x0247:
            boolean r67 = r1.CeS()
            float r61 = r1.A0l()
            X.7FE r54 = X.C66582MXn.A0U(r5, r7, r2, r11, r0)
            X.7SD r1 = r2.A0G
            int r1 = r1.A08
            java.lang.String r60 = r0.A0e()
            X.Mcv r40 = new X.Mcv
            r50 = r40
            r53 = r17
            r55 = r8
            r56 = r22
            r59 = r49
            r63 = r1
            r66 = r10
            r68 = r12
            r70 = r10
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r66, r67, r68, r69, r70)
            return r40
        L_0x0273:
            boolean r3 = r1.CeS()
            if (r3 == 0) goto L_0x027c
            java.lang.Integer r71 = X.AnonymousClass05K.A01
            goto L_0x022f
        L_0x027c:
            java.lang.Integer r71 = X.AnonymousClass05K.A0N
            goto L_0x022f
        L_0x027f:
            X.0wc r70 = X.AnonymousClass0kN.A01(r3, r5)
            goto L_0x0215
        L_0x0284:
            java.lang.String r32 = X.C3267177w.A02(r0, r3)
            goto L_0x01a7
        L_0x028a:
            r9 = 0
            goto L_0x019d
        L_0x028d:
            r64 = -1
            goto L_0x015b
        L_0x0291:
            r58 = r22
            goto L_0x0145
        L_0x0295:
            if (r16 == 0) goto L_0x02b0
            r62 = 1
            goto L_0x013d
        L_0x029b:
            if (r16 == 0) goto L_0x02ad
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r19 = X.C70887OQf.A00(r0)
        L_0x02a1:
            r6 = r17
            boolean r6 = r6.A09
            if (r6 == 0) goto L_0x0135
            r69 = 0
            if (r16 == 0) goto L_0x02b0
            goto L_0x0135
        L_0x02ad:
            r19 = r22
            goto L_0x02a1
        L_0x02b0:
            int r62 = r2.A01()
            goto L_0x013d
        L_0x02b6:
            java.lang.String r0 = "Message content should be an instance of either DirectPendingMedia or Media"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Md6.A00(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7L2):X.Mcv");
    }
}
