package X;

/* renamed from: X.7a6  reason: invalid class name and case insensitive filesystem */
public abstract class C333767a6 {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        if (r4.contains("FB") != true) goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C333777a7 A00(com.instagram.common.session.UserSession r54, X.1Xj r55) {
        /*
            r5 = 0
            r0 = r55
            X.0qQ.A0B(r0, r5)
            r2 = 1
            r3 = r54
            X.0qQ.A0B(r3, r2)
            java.lang.Integer r22 = r0.A2L()
            boolean r39 = r0.A4c()
            X.1Xy r1 = r0.A0C
            java.lang.Boolean r1 = r1.ApQ()
            if (r1 == 0) goto L_0x0022
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0038
        L_0x0022:
            boolean r1 = r0.A67()
            if (r1 == 0) goto L_0x019d
            X.1Xy r1 = r0.A0C
            java.lang.Boolean r4 = r1.AkE()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            boolean r1 = X.0qQ.A0K(r4, r1)
            if (r1 != 0) goto L_0x019d
        L_0x0038:
            r40 = 1
        L_0x003a:
            X.1Xy r1 = r0.A0C
            java.lang.String r24 = r1.BIl()
            boolean r41 = r0.A5B()
            boolean r42 = r0.A5G()
            boolean r43 = r0.A5U()
            X.3QO r4 = r0.A1t()
            X.3QO r1 = X.AnonymousClass3QO.HALLPASS
            r44 = 0
            if (r4 != r1) goto L_0x0058
            r44 = 1
        L_0x0058:
            X.1Xy r1 = r0.A0C
            java.lang.Boolean r4 = r1.Cer()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            boolean r45 = X.0qQ.A0K(r4, r1)
            boolean r46 = r0.A62()
            X.1Xy r1 = r0.A0C
            java.util.List r4 = r1.At1()
            if (r4 == 0) goto L_0x007c
            java.lang.String r1 = "FB"
            boolean r1 = r4.contains(r1)
            r47 = 1
            if (r1 == r2) goto L_0x007e
        L_0x007c:
            r47 = 0
        L_0x007e:
            boolean r48 = r0.CcK()
            boolean r51 = X.2R8.A02(r3, r0)
            boolean r49 = r0.A67()
            com.instagram.user.model.User r21 = r0.A2A(r3)
            java.lang.String r25 = r0.getId()
            java.lang.String r2 = "Required value was null."
            if (r25 == 0) goto L_0x01ad
            X.1iA r16 = r0.BR7()
            X.1Xy r1 = r0.A0C
            java.lang.String r26 = r1.getMezqlToken()
            java.lang.String r27 = r0.A2n()
            if (r27 == 0) goto L_0x01a7
            com.instagram.model.mediatype.ProductType r18 = r0.A1v()
            X.1Xy r1 = r0.A0C
            java.lang.String r28 = r1.getLoggingInfoToken()
            X.1Xy r1 = r0.A0C
            X.DUd r1 = r1.Bmy()
            r13 = 0
            if (r1 == 0) goto L_0x0199
            java.lang.String r29 = r1.Bmx()
        L_0x00bd:
            java.lang.String r30 = r0.A2v()
            java.lang.String r31 = r0.A2S()
            boolean r52 = r0.A6L()
            X.3gp r1 = r0.A1T()
            if (r1 == 0) goto L_0x0196
            java.lang.String r10 = r1.A0d
        L_0x00d1:
            X.3gp r1 = r0.A1T()
            if (r1 == 0) goto L_0x0190
            long r6 = r1.A03
        L_0x00d9:
            X.3gp r1 = r0.A1T()
            if (r1 == 0) goto L_0x018d
            java.lang.String r9 = r1.A0G
        L_0x00e1:
            boolean r53 = r0.A5C()
            X.1sw r17 = r0.A1u()
            X.3WT r1 = X.AnonymousClass3WT.POLLING
            java.util.List r1 = r0.A3o(r1)
            if (r1 == 0) goto L_0x018a
            boolean r4 = r1.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x018a
            java.lang.Object r4 = r1.get(r5)
            X.3ui r4 = (X.C255783ui) r4
            X.4jy r4 = r4.A0E()
            if (r4 == 0) goto L_0x01a1
            com.instagram.api.schemas.PollType r4 = r4.A00
            com.instagram.api.schemas.PollType r2 = com.instagram.api.schemas.PollType.COMMENT_POLL
            if (r4 != r2) goto L_0x018a
            java.lang.Object r1 = r1.get(r5)
            X.3ui r1 = (X.C255783ui) r1
            X.4jy r19 = r1.A0E()
        L_0x0115:
            X.1Xy r1 = r0.A0C
            X.4k1 r1 = r1.AlM()
            if (r1 == 0) goto L_0x0187
            X.4jz r20 = r1.BdV()
        L_0x0121:
            X.3QO r15 = r0.A1t()
            int r38 = r0.A0r()
            X.3gp r1 = r0.A1T()
            if (r1 == 0) goto L_0x0185
            boolean r2 = r1.A0h
        L_0x0131:
            X.3gp r1 = r0.A1T()
            if (r1 == 0) goto L_0x0183
            java.util.Map r8 = r1.A0f
        L_0x0139:
            com.instagram.common.typedurl.ImageUrl r14 = r0.A1Q()
            boolean r55 = X.AnonymousClass4LK.A04(r3, r0)
            java.lang.String r34 = X.AnonymousClass4LK.A03(r0)
            boolean r1 = r0.A67()
            if (r1 == 0) goto L_0x0181
            java.lang.String r4 = r0.A0P
        L_0x014d:
            boolean r1 = r0.A67()
            if (r1 == 0) goto L_0x017f
            java.lang.String r3 = r0.A0Q
        L_0x0155:
            X.1Xy r1 = r0.A0C
            X.3lZ r1 = r1.getInjected()
            if (r1 == 0) goto L_0x0161
            com.instagram.api.schemas.TestimonialDict r13 = r1.C4j()
        L_0x0161:
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.IGCommentSheetMoreInfo r12 = r0.ApL()
            java.lang.Long r23 = java.lang.Long.valueOf(r6)
            X.7a7 r11 = new X.7a7
            r32 = r10
            r33 = r9
            r35 = r4
            r36 = r3
            r37 = r8
            r50 = r5
            r54 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            return r11
        L_0x017f:
            r3 = r13
            goto L_0x0155
        L_0x0181:
            r4 = r13
            goto L_0x014d
        L_0x0183:
            r8 = r13
            goto L_0x0139
        L_0x0185:
            r2 = 0
            goto L_0x0131
        L_0x0187:
            r20 = r13
            goto L_0x0121
        L_0x018a:
            r19 = r13
            goto L_0x0115
        L_0x018d:
            r9 = r13
            goto L_0x00e1
        L_0x0190:
            long r6 = r0.A1A()
            goto L_0x00d9
        L_0x0196:
            r10 = r13
            goto L_0x00d1
        L_0x0199:
            r29 = r13
            goto L_0x00bd
        L_0x019d:
            r40 = 0
            goto L_0x003a
        L_0x01a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x01a7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x01ad:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333767a6.A00(com.instagram.common.session.UserSession, X.1Xj):X.7a7");
    }
}
