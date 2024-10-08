package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5Es  reason: invalid class name and case insensitive filesystem */
public final class C282785Es {
    public final UserSession A00;
    public final C247223fy A01;

    public C282785Es(UserSession userSession, C247223fy r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r5 != 1) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (1 == r5) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        if (X.C247643gg.A06(r1, r0) == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r5 != 3) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018d, code lost:
        if (r5 == X.C231592rv.ICONIC_ENTRYPOINTS_CTA.ordinal()) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01aa, code lost:
        r3 = X.C54364HAf.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ae, code lost:
        if (r35 == null) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C282815Ev A00(X.AnonymousClass3YT r44, X.1Xj r45, X.AnonymousClass4DU r46, X.AnonymousClass3W1 r47) {
        /*
            r43 = this;
            r8 = 0
            r0 = r45
            X.0qQ.A0B(r0, r8)
            r7 = 1
            r2 = r47
            X.0qQ.A0B(r2, r7)
            r4 = 3
            r40 = r46
            r1 = r40
            X.0qQ.A0B(r1, r4)
            r10 = r43
            com.instagram.common.session.UserSession r1 = r10.A00
            java.lang.String r37 = X.C231122qu.A07(r1, r0)
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r3 = X.C231122qu.A00(r1, r0)
            r34 = 0
            if (r3 == 0) goto L_0x01b6
            com.instagram.api.schemas.OnFeedMessagesIntf r3 = r3.BTY()
            if (r3 == 0) goto L_0x01b6
            java.lang.Integer r35 = r3.Awj()
        L_0x002e:
            boolean r3 = X.C247643gg.A06(r1, r0)
            r9 = r44
            if (r3 == 0) goto L_0x003f
            r3 = 2
            if (r35 == 0) goto L_0x003f
            int r5 = r35.intValue()
            if (r5 == r3) goto L_0x004e
        L_0x003f:
            boolean r3 = r0.CcK()
            if (r3 != r7) goto L_0x0056
            r3 = 2
            if (r35 == 0) goto L_0x0056
            int r5 = r35.intValue()
            if (r3 != r5) goto L_0x0056
        L_0x004e:
            boolean r3 = X.C247643gg.A06(r1, r0)
            if (r3 == 0) goto L_0x01b2
            if (r5 != r4) goto L_0x01b2
        L_0x0056:
            boolean r3 = X.C247643gg.A06(r1, r0)
            if (r3 == 0) goto L_0x01ae
            if (r35 == 0) goto L_0x0072
            int r5 = r35.intValue()
            if (r5 == r7) goto L_0x006a
        L_0x0064:
            int r5 = r35.intValue()
            if (r7 != r5) goto L_0x0072
        L_0x006a:
            boolean r3 = X.C247643gg.A06(r1, r0)
            if (r3 == 0) goto L_0x01aa
            if (r5 != r4) goto L_0x01aa
        L_0x0072:
            java.lang.Integer r3 = r9.BEK()
            if (r3 == 0) goto L_0x01a7
            int r5 = r3.intValue()
            X.5pv r3 = new X.5pv
            r3.<init>(r5)
        L_0x0081:
            java.lang.String r36 = r0.getId()
            if (r36 == 0) goto L_0x01ba
            boolean r38 = r0.A5D()
            java.util.List r5 = r0.A3P()
            java.lang.Object r5 = X.00k.A0J(r5)
            com.instagram.model.androidlink.AndroidLink r5 = (com.instagram.model.androidlink.AndroidLink) r5
            if (r5 == 0) goto L_0x009b
            X.47L r34 = X.C271714jT.A01(r5)
        L_0x009b:
            boolean r39 = r0.CcK()
            r29 = 0
            if (r3 == 0) goto L_0x00a5
            r29 = 1
        L_0x00a5:
            X.3yx r6 = X.C258393yw.A00(r1)
            X.9Lx r17 = new X.9Lx
            r5 = r17
            r5.<init>(r6, r0, r8)
            X.9Lf r16 = new X.9Lf
            r5 = r16
            r5.<init>(r0, r7)
            X.9Lx r15 = new X.9Lx
            r15.<init>(r6, r0, r7)
            r5 = 2
            X.9Lf r14 = new X.9Lf
            r14.<init>(r0, r5)
            r5 = 4
            X.9Lw r13 = new X.9Lw
            r13.<init>(r5, r0, r2)
            r5 = 16
            X.9MC r12 = new X.9MC
            r12.<init>(r5, r2, r9, r0)
            X.9MX r23 = new X.9MX
            r24 = r7
            r25 = r10
            r26 = r2
            r27 = r0
            r28 = r9
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r25 = 8
            X.9MZ r24 = new X.9MZ
            r27 = r10
            r28 = r0
            r29 = r3
            r30 = r9
            r24.<init>(r25, r26, r27, r28, r29, r30)
            X.9MT r28 = new X.9MT
            r29 = r4
            r30 = r10
            r31 = r0
            r32 = r9
            r33 = r2
            r28.<init>(r29, r30, r31, r32, r33)
            r4 = 36
            X.9MI r11 = new X.9MI
            r11.<init>((int) r4, (java.lang.Object) r0, (java.lang.Object) r2, (java.lang.Object) r9)
            r4 = 37
            X.9MI r8 = new X.9MI
            r8.<init>((int) r4, (java.lang.Object) r0, (java.lang.Object) r10, (java.lang.Object) r9)
            r4 = 49
            X.9Km r7 = new X.9Km
            r7.<init>(r0, r4)
            r4 = 25
            X.9LZ r6 = new X.9LZ
            r6.<init>(r0, r4)
            X.5Et r26 = X.C282795Et.A00
            r4 = 7
            X.9LP r5 = new X.9LP
            r5.<init>(r2, r4)
            X.5Eu r18 = new X.5Eu
            r31 = r15
            r32 = r16
            r33 = r14
            r21 = r5
            r22 = r12
            r25 = r7
            r27 = r13
            r29 = r6
            r30 = r17
            r19 = r11
            r20 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.3fy r5 = r10.A01
            r4 = r40
            X.3g4 r32 = X.C247243g1.A00(r4, r1, r0, r5, r2)
            int r5 = r2.A0E
            X.2rv r4 = X.C231592rv.AD_CTA
            int r4 = r4.ordinal()
            if (r5 == r4) goto L_0x018f
            X.2rv r4 = X.C231592rv.SHOPPING_CTA
            int r4 = r4.ordinal()
            if (r5 == r4) goto L_0x018f
            X.2rv r4 = X.C231592rv.APP_INSTALL_CTA
            int r4 = r4.ordinal()
            if (r5 == r4) goto L_0x018f
            X.2rv r4 = X.C231592rv.IGBIO_PRODUCT_MEDIA_BAR_CTA
            int r4 = r4.ordinal()
            if (r5 == r4) goto L_0x018f
            X.2rv r4 = X.C231592rv.PROFESSIONAL_ORGANIC_MEDIA_BAR_CTA
            int r4 = r4.ordinal()
            if (r5 == r4) goto L_0x018f
            X.2rv r4 = X.C231592rv.UPCOMING_LIVE_EVENT_MEDIA_BAR_CTA
            int r4 = r4.ordinal()
            if (r5 == r4) goto L_0x018f
            X.2rv r4 = X.C231592rv.UPCOMING_ONLINE_EVENT_MEDIA_BAR_CTA
            int r4 = r4.ordinal()
            if (r5 == r4) goto L_0x018f
            X.2rv r4 = X.C231592rv.BOOST_GUIDANCE_CTA
            int r4 = r4.ordinal()
            if (r5 == r4) goto L_0x018f
            X.2rv r4 = X.C231592rv.ICONIC_ENTRYPOINTS_CTA
            int r4 = r4.ordinal()
            r40 = 0
            if (r5 != r4) goto L_0x0191
        L_0x018f:
            r40 = 1
        L_0x0191:
            boolean r41 = r9.EtS()
            boolean r42 = r9.Et1(r1, r0, r2)
            X.5Ev r28 = new X.5Ev
            r29 = r18
            r30 = r3
            r31 = r0
            r33 = r2
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r28
        L_0x01a7:
            r3 = 0
            goto L_0x0081
        L_0x01aa:
            X.HAf r3 = X.C54364HAf.A00
            goto L_0x0081
        L_0x01ae:
            if (r35 != 0) goto L_0x0064
            goto L_0x0072
        L_0x01b2:
            X.5Ey r3 = X.AnonymousClass5Ey.A00
            goto L_0x0081
        L_0x01b6:
            r35 = r34
            goto L_0x002e
        L_0x01ba:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C282785Es.A00(X.3YT, X.1Xj, X.4DU, X.3W1):X.5Ev");
    }
}
