package com.instagram.video.live.mvvm.model.domainmodel;

public abstract class IgLiveBroadcastInfoKt {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r3.A00 != com.instagram.api.schemas.IGLiveBadgeSettings.ON) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        if (r2.intValue() < 3) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0117, code lost:
        if (r2 == null) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C61013JvD A00(X.C270194gL r50, java.util.List r51) {
        /*
            r0 = r50
            com.instagram.user.model.User r20 = r0.A03()
            java.util.Set r33 = r0.A06()
            X.0qQ.A07(r33)
            java.lang.String r1 = r0.A0Y
            r22 = r1
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = ""
        L_0x0015:
            int r1 = r1.length()
            boolean r1 = X.AnonymousClass7TF.A1R(r1)
            r48 = 0
            if (r1 == 0) goto L_0x0126
            if (r22 != 0) goto L_0x0025
            java.lang.String r22 = ""
        L_0x0025:
            int r34 = r0.A00()
            java.lang.Boolean r1 = r0.A0C
            if (r1 == 0) goto L_0x011b
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x011b
            X.3NV r1 = X.AnonymousClass3NV.A06
        L_0x0035:
            java.lang.Long r2 = r0.A0U
            boolean r36 = X.AnonymousClass7TF.A1V(r2)
            X.4wG r3 = r0.A03
            if (r3 == 0) goto L_0x004b
            X.58x r2 = r3.A02
            if (r2 == 0) goto L_0x004b
            com.instagram.api.schemas.IGLiveBadgeSettings r3 = r3.A00
            com.instagram.api.schemas.IGLiveBadgeSettings r2 = com.instagram.api.schemas.IGLiveBadgeSettings.ON
            r37 = 1
            if (r3 == r2) goto L_0x004d
        L_0x004b:
            r37 = 0
        L_0x004d:
            X.4wI r2 = r0.A06
            if (r2 != 0) goto L_0x0053
            X.4wI r2 = X.C278114wI.UNKNOWN
        L_0x0053:
            boolean r38 = r2.A00()
            java.lang.String r14 = r0.A0X
            r14.getClass()
            java.lang.String r13 = r0.A0e
            r13.getClass()
            X.4wI r3 = r0.A06
            if (r3 != 0) goto L_0x0067
            X.4wI r3 = X.C278114wI.UNKNOWN
        L_0x0067:
            X.4w0 r12 = r0.A02
            X.4wG r2 = r0.A03
            if (r2 == 0) goto L_0x0113
            com.instagram.api.schemas.LiveUserPaySupportTier r11 = r2.A01
            java.lang.Integer r4 = r2.A04
            if (r4 == 0) goto L_0x0115
            int r35 = r4.intValue()
        L_0x0077:
            java.lang.Integer r2 = r2.A04
            if (r2 == 0) goto L_0x0084
            int r4 = r2.intValue()
            r2 = 3
            r39 = 1
            if (r4 >= r2) goto L_0x0086
        L_0x0084:
            r39 = 0
        L_0x0086:
            java.lang.String r10 = r0.A0f
            X.4w9 r2 = r0.A00
            if (r2 == 0) goto L_0x010f
            java.lang.String r9 = r2.A00
        L_0x008e:
            java.util.List r2 = r0.A0m
            java.util.List r30 = X.JTQ.A0j(r2)
            java.lang.String r8 = r0.A0j
            java.lang.String r2 = r0.A0h
            if (r2 != 0) goto L_0x009c
            java.lang.String r2 = ""
        L_0x009c:
            java.util.List r31 = X.C63328KvB.A00(r0)
            java.util.List r4 = r0.A0k
            java.util.List r32 = X.JTQ.A0j(r4)
            java.lang.Boolean r4 = r0.A0M
            if (r4 != 0) goto L_0x010a
            r40 = 0
        L_0x00ac:
            java.lang.Boolean r4 = r0.A0J
            if (r4 != 0) goto L_0x0105
            r41 = 0
        L_0x00b2:
            X.4wA r0 = r0.A01
            if (r0 == 0) goto L_0x0100
            r42 = 1
            X.QP7 r16 = new X.QP7
            java.lang.String r7 = r0.A0D
            com.instagram.user.model.User r5 = r0.A01
            if (r5 == 0) goto L_0x00fd
            com.instagram.common.typedurl.ImageUrl r44 = r5.Bh3()
        L_0x00c4:
            com.instagram.user.model.User r4 = r0.A01
            if (r4 == 0) goto L_0x00cc
            java.lang.String r48 = r4.getUsername()
        L_0x00cc:
            java.lang.Long r6 = r0.A05
            java.lang.String r4 = r0.A09
            java.lang.String r0 = r0.A0A
            r43 = r16
            r45 = r5
            r46 = r6
            r47 = r7
            r49 = r4
            r50 = r0
            r43.<init>((com.instagram.common.typedurl.ImageUrl) r44, (com.instagram.user.model.User) r45, (java.lang.Long) r46, (java.lang.String) r47, (java.lang.String) r48, (java.lang.String) r49, (java.lang.String) r50)
        L_0x00e1:
            X.JvD r15 = new X.JvD
            r29 = r51
            r27 = r8
            r28 = r2
            r24 = r13
            r25 = r10
            r26 = r9
            r21 = r1
            r23 = r14
            r19 = r3
            r18 = r11
            r17 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r15
        L_0x00fd:
            r44 = r48
            goto L_0x00c4
        L_0x0100:
            r42 = 0
            r16 = r48
            goto L_0x00e1
        L_0x0105:
            boolean r41 = r4.booleanValue()
            goto L_0x00b2
        L_0x010a:
            boolean r40 = r4.booleanValue()
            goto L_0x00ac
        L_0x010f:
            r9 = r48
            goto L_0x008e
        L_0x0113:
            r11 = r48
        L_0x0115:
            r35 = 0
            if (r2 == 0) goto L_0x0084
            goto L_0x0077
        L_0x011b:
            X.3NV r1 = r0.A0A
            if (r1 != 0) goto L_0x0121
            X.3NV r1 = X.AnonymousClass3NV.A08
        L_0x0121:
            X.0qQ.A0A(r1)
            goto L_0x0035
        L_0x0126:
            r22 = r48
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.domainmodel.IgLiveBroadcastInfoKt.A00(X.4gL, java.util.List):X.JvD");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.common.session.UserSession r5, X.C270194gL r6, X.AnonymousClass4D7 r7) {
        /*
            r0 = 13
            boolean r0 = X.C66139MDr.A01(r0, r7)
            if (r0 == 0) goto L_0x0043
            r4 = r7
            X.MDr r4 = (X.C66139MDr) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0043
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x0049
            java.lang.Object r6 = r4.A01
            X.4gL r6 = (X.C270194gL) r6
            X.0eS.A00(r3)
        L_0x0028:
            java.util.List r3 = (java.util.List) r3
            X.JvD r0 = A00(r6, r3)
            return r0
        L_0x002f:
            X.0eS.A00(r3)
            java.util.List r0 = X.C63328KvB.A00(r6)
            r4.A01 = r6
            r4.A02 = r5
            r4.A00 = r1
            java.lang.Object r3 = com.instagram.video.live.mvvm.model.domainmodel.IgLiveSponsorKt.A00(r5, r0, r4)
            if (r3 != r2) goto L_0x0028
            return r2
        L_0x0043:
            X.MDr r4 = new X.MDr
            r4.<init>(r7)
            goto L_0x0016
        L_0x0049:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.domainmodel.IgLiveBroadcastInfoKt.A01(com.instagram.common.session.UserSession, X.4gL, X.4D7):java.lang.Object");
    }
}
