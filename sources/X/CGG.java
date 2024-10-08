package X;

public final class CGG extends 1XP {
    public int A00;
    public JV7 A01;
    public BBJ A02;
    public C45343Cul A03;
    public Boolean A04;
    public Boolean A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r30 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0109, code lost:
        if (r3 != null) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d A[PHI: r3 
      PHI: (r3v14 java.lang.Boolean) = (r3v1 java.lang.Boolean), (r3v15 java.lang.Boolean) binds: [B:73:0x0123, B:36:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0077 A[PHI: r3 
      PHI: (r3v12 java.lang.Boolean) = (r3v3 java.lang.Boolean), (r3v13 java.lang.Boolean) binds: [B:68:0x0115, B:40:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C74254Pri A00(com.instagram.common.session.UserSession r39, java.lang.String r40) {
        /*
            r38 = this;
            r11 = 0
            r4 = r39
            X.0qQ.A0B(r4, r11)
            r2 = r38
            java.lang.String r1 = r2.mErrorMessage
            if (r1 == 0) goto L_0x001a
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x001a
            X.LqX r15 = new X.LqX
            r15.<init>(r1)
        L_0x0017:
            X.Pri r15 = (X.C74254Pri) r15
            return r15
        L_0x001a:
            java.lang.String r12 = r2.A0C
            java.lang.Integer r10 = r2.A06
            java.lang.String r9 = r2.A08
            java.lang.String r8 = r2.A0A
            java.lang.String r7 = r2.A07
            java.lang.Boolean r6 = r2.A05
            java.lang.String r1 = r2.A09
            if (r12 == 0) goto L_0x0136
            if (r10 == 0) goto L_0x0136
            if (r9 == 0) goto L_0x0136
            if (r8 == 0) goto L_0x0136
            if (r7 == 0) goto L_0x0136
            if (r6 == 0) goto L_0x0136
            if (r1 == 0) goto L_0x0136
            java.lang.Boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0132
            boolean r30 = r0.booleanValue()
            if (r30 != 0) goto L_0x0049
        L_0x0040:
            X.BBJ r0 = r2.A02
            if (r0 == 0) goto L_0x012e
            int r3 = r0.A00
            r0 = 2
            if (r3 != r0) goto L_0x012e
        L_0x0049:
            r31 = 1
        L_0x004b:
            X.Cul r0 = r2.A03
            if (r0 == 0) goto L_0x0053
            java.lang.Long r0 = r0.A02
            if (r0 != 0) goto L_0x0065
        L_0x0053:
            X.BBJ r0 = r2.A02
            if (r0 == 0) goto L_0x012b
            com.instagram.user.model.User r0 = r0.A01
            if (r0 == 0) goto L_0x012b
            java.lang.String r3 = r0.getId()
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r3)
        L_0x0065:
            X.Cul r5 = r2.A03
            if (r5 == 0) goto L_0x011d
            java.lang.Boolean r3 = r5.A01
            if (r3 == 0) goto L_0x011d
        L_0x006d:
            boolean r32 = r3.booleanValue()
        L_0x0071:
            if (r5 == 0) goto L_0x010f
            java.lang.Boolean r3 = r5.A00
            if (r3 == 0) goto L_0x010f
        L_0x0077:
            boolean r33 = r3.booleanValue()
        L_0x007b:
            X.BBJ r3 = r2.A02
            if (r3 == 0) goto L_0x0089
            X.17i r5 = X.17h.A00(r4)
            com.instagram.user.model.User r4 = r3.A01
            r3 = 1
            r5.A01(r4, r3, r11)
        L_0x0089:
            boolean r14 = r2.A0D
            int r26 = r10.intValue()
            boolean r29 = r6.booleanValue()
            X.BBJ r3 = r2.A02
            if (r3 == 0) goto L_0x0107
            java.lang.Boolean r4 = r3.A02
            if (r4 == 0) goto L_0x0107
            boolean r34 = r4.booleanValue()
        L_0x009f:
            java.lang.Boolean r4 = r3.A04
            if (r4 == 0) goto L_0x010c
            boolean r35 = r4.booleanValue()
        L_0x00a7:
            java.lang.String r13 = r2.A0B
            boolean r11 = r2.A0F
            boolean r10 = r2.A0E
            if (r3 == 0) goto L_0x0104
            com.instagram.user.model.User r4 = r3.A01
            java.lang.String r18 = r4.getId()
            java.lang.String r19 = r4.getUsername()
            com.instagram.common.typedurl.ImageUrl r17 = r4.Bh3()
            boolean r21 = r4.A29()
            boolean r4 = r3.A06
            int r3 = r3.A00
            com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo r16 = new com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo
            r20 = r3
            r22 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x00ce:
            X.JV7 r3 = r2.A01
            if (r3 == 0) goto L_0x0102
            java.lang.Object r6 = r3.A00
            com.instagram.api.schemas.MessagingOffPlatformShareType r6 = (com.instagram.api.schemas.MessagingOffPlatformShareType) r6
            java.lang.String r5 = r3.A01
            java.lang.String r4 = r3.A02
            com.instagram.direct.request.response.GroupLinkPreviewResponse$SharedThreadContentInfo r3 = new com.instagram.direct.request.response.GroupLinkPreviewResponse$SharedThreadContentInfo
            r3.<init>(r6, r5, r4)
        L_0x00df:
            int r2 = r2.A00
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r15 = new com.instagram.direct.request.response.GroupLinkPreviewResponse$Success
            r24 = r40
            r28 = r14
            r36 = r11
            r37 = r10
            r23 = r1
            r25 = r13
            r27 = r2
            r22 = r7
            r21 = r8
            r20 = r9
            r19 = r12
            r18 = r0
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x0017
        L_0x0102:
            r3 = 0
            goto L_0x00df
        L_0x0104:
            r16 = 0
            goto L_0x00ce
        L_0x0107:
            r34 = 0
            if (r3 == 0) goto L_0x010c
            goto L_0x009f
        L_0x010c:
            r35 = 0
            goto L_0x00a7
        L_0x010f:
            X.BBJ r3 = r2.A02
            if (r3 == 0) goto L_0x0119
            java.lang.Boolean r3 = r3.A03
            if (r3 == 0) goto L_0x0119
            goto L_0x0077
        L_0x0119:
            r33 = 0
            goto L_0x007b
        L_0x011d:
            X.BBJ r3 = r2.A02
            if (r3 == 0) goto L_0x0127
            java.lang.Boolean r3 = r3.A05
            if (r3 == 0) goto L_0x0127
            goto L_0x006d
        L_0x0127:
            r32 = 0
            goto L_0x0071
        L_0x012b:
            r0 = 0
            goto L_0x0065
        L_0x012e:
            r31 = 0
            goto L_0x004b
        L_0x0132:
            r30 = 0
            goto L_0x0040
        L_0x0136:
            java.lang.String r1 = "Invalid response from the server, missing some fields"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CGG.A00(com.instagram.common.session.UserSession, java.lang.String):X.Pri");
    }
}
