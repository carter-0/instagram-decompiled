package X;

/* renamed from: X.3dm  reason: invalid class name and case insensitive filesystem */
public final class C245973dm {
    public static final C245973dm A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0307, code lost:
        if (r10.BxW() == com.instagram.api.schemas.SocialContextType.A05) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x031c, code lost:
        X.0sr.A1T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0323, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C246653ex A00(X.AnonymousClass0iw r41, com.instagram.common.session.UserSession r42, X.C245893de r43, java.lang.Integer r44, int r45, boolean r46) {
        /*
            r40 = this;
            r15 = 0
            r22 = 1
            X.3DI r3 = X.AnonymousClass3DI.A00
            java.lang.String r0 = r41.getModuleName()
            r5 = r42
            boolean r0 = r3.A07(r5, r0)
            r11 = 0
            if (r0 == 0) goto L_0x0324
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325197007762112(0x810d93000b32c0, double:3.035539085312121E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r4 = r43
            if (r0 != 0) goto L_0x006c
            X.1Xj r0 = r4.A00
            java.util.List r7 = r0.A3b()
            if (r7 == 0) goto L_0x006c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r7.iterator()
        L_0x0032:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.54u r0 = (X.C2809354u) r0
            boolean r0 = X.C52338GOh.A01(r0)
            if (r0 == 0) goto L_0x0032
            r6.add(r1)
            goto L_0x0032
        L_0x0049:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x006c
            int r0 = r6.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r7.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x006c
            boolean r0 = X.C245953dk.A01(r5, r4, r15)
            if (r0 == 0) goto L_0x006c
            return r11
        L_0x006c:
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x0324
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r14 = r4.A04
            if (r14 == 0) goto L_0x0324
            java.util.List r8 = r4.A03
            java.lang.String r21 = ""
            r1 = 10
            r0 = r44
            if (r8 == 0) goto L_0x0159
            boolean r6 = r3.A03(r5)
            if (r6 == 0) goto L_0x0159
            boolean r6 = r3.A04(r5)
            if (r6 == 0) goto L_0x0093
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            if (r0 == r6) goto L_0x0159
        L_0x0093:
            com.instagram.api.schemas.SocialContextType r13 = com.instagram.api.schemas.SocialContextType.COMMENTED_BY
            X.0qQ.A0B(r13, r15)
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            r7 = 2
            if (r0 != r6) goto L_0x009e
            r7 = 1
        L_0x009e:
            java.util.List r10 = X.00k.A0d(r8, r7)
            int r6 = X.0Yv.A1E(r10, r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L_0x00af:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x00c5
            java.lang.Object r6 = r10.next()
            X.50W r6 = (X.AnonymousClass50W) r6
            com.instagram.user.model.User r6 = r6.A00
            com.instagram.common.typedurl.ImageUrl r6 = r6.Bh3()
            r9.add(r6)
            goto L_0x00af
        L_0x00c5:
            java.util.List r7 = X.00k.A0d(r8, r7)
            int r6 = X.0Yv.A1E(r7, r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r6)
            java.util.Iterator r16 = r7.iterator()
            r20 = 0
            r36 = 0
        L_0x00da:
            boolean r6 = r16.hasNext()
            if (r6 == 0) goto L_0x015d
            java.lang.Object r7 = r16.next()
            X.50W r7 = (X.AnonymousClass50W) r7
            boolean r6 = r7.A04
            if (r6 != 0) goto L_0x00f0
            boolean r6 = X.AnonymousClass3DI.A01(r5)
            if (r6 == 0) goto L_0x0153
        L_0x00f0:
            X.1Xj r6 = r4.A00
            java.lang.String r29 = r6.getId()
            if (r29 != 0) goto L_0x00fa
            r29 = r21
        L_0x00fa:
            java.lang.String r12 = r41.getModuleName()
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            r37 = 0
            if (r0 != r6) goto L_0x0106
            r37 = 1
        L_0x0106:
            r6 = 3
            X.0qQ.A0B(r12, r6)
            com.instagram.user.model.User r6 = r7.A00
            r27 = r6
            com.instagram.common.typedurl.ImageUrl r26 = r27.Bh3()
            java.lang.String r30 = r27.getId()
            java.lang.String r6 = r7.A01
            r32 = r6
            java.lang.String r6 = r7.A02
            r20 = r6
            boolean r6 = r7.A06
            r19 = r6
            java.util.List r6 = r7.A03
            r18 = r6
            boolean r6 = r7.A05
            r17 = r6
            r7 = 28
            X.JwI r10 = new X.JwI
            r6 = r22
            r10.<init>((X.C62320sa) r11, (kotlin.jvm.internal.DefaultConstructorMarker) r11, (int) r6, (int) r7)
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r6 = new com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState
            r23 = r6
            r24 = r10
            r25 = r13
            r28 = r0
            r31 = r12
            r33 = r20
            r34 = r9
            r35 = r18
            r38 = r19
            r39 = r17
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r2.add(r6)
            int r36 = r36 + 1
            r20 = 1
        L_0x0153:
            X.0gF r6 = X.C60340gF.A00
            r8.add(r6)
            goto L_0x00da
        L_0x0159:
            r20 = 0
            r36 = 0
        L_0x015d:
            boolean r6 = r2.isEmpty()
            r6 = r6 ^ 1
            if (r6 != 0) goto L_0x0171
            boolean r6 = r3.A04(r5)
            if (r6 == 0) goto L_0x01c1
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            if (r0 != r6) goto L_0x01c1
            if (r46 != 0) goto L_0x01c1
        L_0x0171:
            r19 = 1
        L_0x0173:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0324
            r1 = 3
            java.util.List r1 = X.00k.A0d(r2, r1)
            X.4Jf r3 = new X.4Jf
            r3.<init>(r1)
            X.1Xj r2 = r4.A00
            java.lang.String r10 = r2.getId()
            if (r10 != 0) goto L_0x018d
            r10 = r21
        L_0x018d:
            X.1Xy r1 = r2.A0C
            java.lang.String r11 = r1.BIl()
            X.1Xy r1 = r2.A0C
            java.lang.String r12 = r1.getLoggingInfoToken()
            if (r19 == 0) goto L_0x01ba
            java.lang.Integer r2 = X.AnonymousClass05K.A01
        L_0x019d:
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            if (r19 == 0) goto L_0x01b7
            r9 = r8
        L_0x01a2:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r16 = 0
            if (r0 != r1) goto L_0x01aa
            r16 = 1
        L_0x01aa:
            X.3ex r5 = new X.3ex
            r13 = r45
            r6 = r3
            r7 = r2
            r14 = r15
            r17 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r5
        L_0x01b7:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            goto L_0x01a2
        L_0x01ba:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r0 == r2) goto L_0x019d
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            goto L_0x019d
        L_0x01c1:
            boolean r6 = r3.A05(r5)
            if (r6 == 0) goto L_0x0171
            r19 = 0
            boolean r6 = r14.isEmpty()
            if (r6 != 0) goto L_0x0324
            java.lang.Object r6 = X.00k.A0J(r14)
            java.util.List r6 = java.util.Collections.singletonList(r6)
            X.0qQ.A07(r6)
            java.util.Iterator r18 = r6.iterator()
        L_0x01de:
            boolean r6 = r18.hasNext()
            if (r6 == 0) goto L_0x0173
            java.lang.Object r10 = r18.next()
            X.3yf r10 = (X.C258223yf) r10
            if (r10 == 0) goto L_0x01de
            java.util.List r9 = r10.BxP()
            if (r9 == 0) goto L_0x01de
            com.instagram.api.schemas.SocialContextType r6 = r10.BxW()
            r8 = 9
            r7 = 3
            if (r6 == 0) goto L_0x01de
            int r6 = r6.ordinal()
            if (r6 == r8) goto L_0x020d
            if (r6 != r7) goto L_0x01de
            boolean r6 = r3.A04(r5)
            if (r6 == 0) goto L_0x01de
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            if (r0 == r6) goto L_0x01de
        L_0x020d:
            boolean r6 = r9.isEmpty()
            if (r6 != 0) goto L_0x01de
            com.instagram.api.schemas.SocialContextType r7 = r10.BxW()
            X.0qQ.A0B(r7, r15)
            com.instagram.api.schemas.SocialContextType r6 = com.instagram.api.schemas.SocialContextType.LIKED_BY
            if (r7 != r6) goto L_0x0314
            r13 = 3
        L_0x021f:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.List r7 = r10.BxQ()
            int r6 = X.0Yv.A1E(r7, r1)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r6)
            java.util.Iterator r17 = r7.iterator()
            r6 = 0
        L_0x0236:
            boolean r7 = r17.hasNext()
            if (r7 == 0) goto L_0x026b
            java.lang.Object r8 = r17.next()
            int r16 = r6 + 1
            if (r6 < 0) goto L_0x031c
            boolean r7 = X.AnonymousClass3DI.A01(r5)
            if (r7 != 0) goto L_0x0260
            java.lang.Object r6 = X.00k.A0O(r9, r6)
            X.3yd r6 = (X.C258203yd) r6
            if (r6 == 0) goto L_0x0263
            java.lang.Boolean r7 = r6.CUi()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r22)
            boolean r6 = X.0qQ.A0K(r7, r6)
            if (r6 == 0) goto L_0x0263
        L_0x0260:
            r12.add(r8)
        L_0x0263:
            X.0gF r6 = X.C60340gF.A00
            r14.add(r6)
            r6 = r16
            goto L_0x0236
        L_0x026b:
            java.util.List r7 = X.00k.A0d(r12, r13)
            int r6 = X.0Yv.A1E(r7, r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r6)
            java.util.Iterator r7 = r7.iterator()
        L_0x027c:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L_0x0290
            java.lang.Object r6 = r7.next()
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            com.instagram.common.typedurl.ImageUrl r6 = r6.Bh3()
            r8.add(r6)
            goto L_0x027c
        L_0x0290:
            java.util.List r12 = X.00k.A0d(r12, r13)
            int r6 = X.0Yv.A1E(r12, r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
            java.util.Iterator r16 = r12.iterator()
            r13 = 0
        L_0x02a2:
            boolean r6 = r16.hasNext()
            if (r6 == 0) goto L_0x01de
            java.lang.Object r6 = r16.next()
            int r14 = r13 + 1
            if (r13 < 0) goto L_0x031c
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            boolean r12 = X.AnonymousClass3DI.A01(r5)
            if (r12 != 0) goto L_0x02ce
            java.lang.Object r12 = X.00k.A0O(r9, r13)
            X.3yd r12 = (X.C258203yd) r12
            if (r12 == 0) goto L_0x030d
            java.lang.Boolean r13 = r12.CUi()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r22)
            boolean r12 = X.0qQ.A0K(r13, r12)
            if (r12 == 0) goto L_0x030d
        L_0x02ce:
            X.1Xj r12 = r4.A00
            java.lang.String r26 = r12.getId()
            if (r26 != 0) goto L_0x02d8
            r26 = r21
        L_0x02d8:
            X.0sa r13 = r4.A05
            java.lang.String r27 = r41.getModuleName()
            com.instagram.api.schemas.SocialContextType r23 = r10.BxW()
            java.lang.Integer r12 = X.AnonymousClass05K.A0N
            r32 = 0
            if (r0 != r12) goto L_0x02ea
            r32 = 1
        L_0x02ea:
            r24 = r6
            r25 = r0
            r28 = r9
            r29 = r8
            r30 = r13
            r31 = r36
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r6 = X.C52301GMr.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r2.add(r6)
            if (r20 != 0) goto L_0x0309
            com.instagram.api.schemas.SocialContextType r12 = r10.BxW()
            com.instagram.api.schemas.SocialContextType r6 = com.instagram.api.schemas.SocialContextType.COMMENTED_BY
            r20 = 0
            if (r12 != r6) goto L_0x030b
        L_0x0309:
            r20 = 1
        L_0x030b:
            int r36 = r36 + 1
        L_0x030d:
            X.0gF r6 = X.C60340gF.A00
            r7.add(r6)
            r13 = r14
            goto L_0x02a2
        L_0x0314:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            r13 = 2
            if (r0 != r6) goto L_0x021f
            r13 = 1
            goto L_0x021f
        L_0x031c:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0324:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245973dm.A00(X.0iw, com.instagram.common.session.UserSession, X.3de, java.lang.Integer, int, boolean):X.3ex");
    }
}
