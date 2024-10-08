package X;

import com.instagram.model.reels.ReelType;

/* renamed from: X.76w  reason: invalid class name and case insensitive filesystem */
public final class C3264676w implements C3264476u {
    public static final C3264676w A00 = new Object();

    public static final boolean A00(AnonymousClass7FJ r3, 1Xj r4) {
        if (r4 != null) {
            return !r4.A5N() || r3.A02 == ReelType.A0P || r3.A0A || 0qQ.A0K(r3.A03, true);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.NZh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: X.776} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: X.776} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: X.776} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: X.776} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: X.776} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        if (r7 == X.AnonymousClass7Q3.CHALLENGE_NOMINATION) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f0, code lost:
        if (r6 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x018a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C328667Fr AM8(android.content.Context r65, com.instagram.common.session.UserSession r66, X.AnonymousClass7FE r67, X.AnonymousClass9HC r68, X.AnonymousClass7LQ r69) {
        /*
            r64 = this;
            r15 = 0
            r10 = r65
            X.0qQ.A0B(r10, r15)
            r0 = 1
            r3 = r66
            X.0qQ.A0B(r3, r0)
            r0 = 2
            r21 = r67
            r1 = r21
            X.0qQ.A0B(r1, r0)
            r8 = 3
            r14 = r68
            X.0qQ.A0B(r14, r8)
            r1 = 4
            r9 = r69
            X.0qQ.A0B(r9, r1)
            X.3su r4 = r9.A0e
            X.0qQ.A07(r4)
            com.instagram.user.model.User r13 = r9.A0K
            java.lang.Object r2 = r4.A1T
            if (r2 == 0) goto L_0x026f
            boolean r5 = r2 instanceof X.AnonymousClass7FN
            if (r5 == 0) goto L_0x0233
            r5 = r2
            X.7FN r5 = (X.AnonymousClass7FN) r5
            X.1Xj r5 = r5.A02
        L_0x0034:
            com.instagram.model.direct.messageid.DirectMessageIdentifier r30 = r4.A0V()
            r23 = 0
            if (r5 == 0) goto L_0x0094
            java.lang.Object r11 = r4.A1T
            boolean r6 = r11 instanceof X.AnonymousClass7FN
            if (r6 == 0) goto L_0x0069
            java.lang.String r6 = "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia"
            X.0qQ.A0C(r11, r6)
            X.7FN r11 = (X.AnonymousClass7FN) r11
            X.0t1 r6 = X.0eE.A00(r3)
            com.instagram.user.model.User r6 = r6.A00()
            boolean r6 = r4.A1j(r6)
            if (r6 != 0) goto L_0x0094
            X.7Q3 r7 = r11.A01
            r7.getClass()
            X.7Q3 r6 = X.AnonymousClass7Q3.MENTION
            if (r7 == r6) goto L_0x0069
            X.7Q3 r7 = r11.A01
            r7.getClass()
            X.7Q3 r6 = X.AnonymousClass7Q3.CHALLENGE_NOMINATION
            if (r7 != r6) goto L_0x0094
        L_0x0069:
            com.instagram.user.model.User r6 = r5.A2A(r3)
            if (r6 == 0) goto L_0x0094
            java.lang.String r34 = r6.getUsername()
            com.instagram.common.typedurl.ImageUrl r6 = r6.Bh3()
            java.util.List r42 = X.0sr.A1N(r6)
            r32 = 0
            X.774 r23 = new X.774
            r31 = r23
            r33 = r32
            r35 = r32
            r36 = r32
            r37 = r32
            r38 = r32
            r39 = r32
            r40 = r32
            r41 = r32
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
        L_0x0094:
            r11 = r2
            boolean r7 = r2 instanceof X.AnonymousClass7FN
            if (r7 == 0) goto L_0x01e0
            X.7FN r11 = (X.AnonymousClass7FN) r11
            X.1Xj r6 = r11.A02
            X.0qQ.A07(r6)
        L_0x00a0:
            com.instagram.model.mediasize.ExtendedImageUrl r32 = r6.A1n(r10)
            if (r32 != 0) goto L_0x01c9
            r6 = 0
        L_0x00a7:
            r24 = r6
        L_0x00a9:
            X.2FW r11 = r4.A10
            X.0qQ.A07(r11)
            java.lang.String r12 = r4.A1u
            X.0qQ.A07(r12)
            r17 = 1
            r6 = 5
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r15)
            if (r7 == 0) goto L_0x018a
            r7 = r2
            X.7FN r7 = (X.AnonymousClass7FN) r7
            X.1Xj r0 = r7.A02
            boolean r0 = r0.A5v()
            if (r0 == 0) goto L_0x00e8
            X.7Q3 r0 = r7.A01
            r0.getClass()
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x0181
            if (r0 == r8) goto L_0x0178
            if (r0 == r1) goto L_0x01a6
            r1 = 6
            if (r0 != r1) goto L_0x00e8
            X.0Tu r7 = X.0Tu.A05
            r0 = 36313334307620736(0x8102c900040780, double:3.0280370659754556E-306)
        L_0x00e0:
            boolean r0 = X.182.A06(r7, r3, r0)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r0)
        L_0x00e8:
            X.0qQ.A0A(r16)
            boolean r0 = r16.booleanValue()
            if (r0 == 0) goto L_0x0175
            X.OVt r7 = X.OP3.A00()
            r1 = 22
            X.Ay7 r0 = new X.Ay7
            r0.<init>(r3, r1)
            java.lang.String r1 = X.OP4.A01(r3, r7, r11, r2, r0)
        L_0x0100:
            X.9J6 r0 = new X.9J6
            r0.<init>(r1, r12, r6)
            X.3tD r28 = X.C254883tD.SINGLE
            if (r13 == 0) goto L_0x0172
            java.lang.String r38 = r13.getUsername()
        L_0x010d:
            X.9Iu r12 = X.C70865OPe.A00(r5)
            r13 = 0
            X.2FW r1 = r4.A10
            X.7FT r20 = X.AnonymousClass7FG.A00(r10, r3, r14, r9, r1)
            X.7Fr r11 = new X.7Fr
            r14 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r22 = r13
            r25 = r13
            r26 = r13
            r27 = r13
            r29 = r13
            r31 = r13
            r32 = r13
            r33 = r13
            r34 = r13
            r35 = r13
            r36 = r13
            r37 = r13
            r39 = r13
            r40 = r13
            r41 = r13
            r42 = r13
            r43 = r13
            r44 = r13
            r45 = r13
            r46 = r13
            r47 = r13
            r48 = r13
            r49 = r13
            r50 = r13
            r51 = r15
            r52 = r15
            r53 = r15
            r54 = r15
            r55 = r15
            r56 = r15
            r57 = r15
            r58 = r15
            r59 = r15
            r60 = r15
            r61 = r15
            r62 = r15
            r63 = r15
            r15 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            return r11
        L_0x0172:
            r38 = 0
            goto L_0x010d
        L_0x0175:
            java.lang.String r1 = ""
            goto L_0x0100
        L_0x0178:
            X.0Tu r7 = X.0Tu.A05
            r0 = 36313334307686273(0x8102c900050781, double:3.0280370660169014E-306)
            goto L_0x00e0
        L_0x0181:
            X.0Tu r7 = X.0Tu.A05
            r0 = 36313334307489662(0x8102c90002077e, double:3.028037065892564E-306)
            goto L_0x00e0
        L_0x018a:
            boolean r1 = r2 instanceof X.AnonymousClass7FJ
            if (r1 == 0) goto L_0x01af
            r1 = r2
            X.7FJ r1 = (X.AnonymousClass7FJ) r1
            X.1Xj r0 = r1.A01
            boolean r0 = A00(r1, r0)
            if (r0 == 0) goto L_0x01ac
            X.0Tu r7 = X.0Tu.A05
            r0 = 36313334307555199(0x8102c90003077f, double:3.02803706593401E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 == 0) goto L_0x01ac
        L_0x01a6:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r17)
            goto L_0x00e8
        L_0x01ac:
            r17 = 0
            goto L_0x01a6
        L_0x01af:
            boolean r0 = X.N4Q.A00(r0, r2)
            if (r0 != 0) goto L_0x00e8
            java.lang.String r1 = "Unsupported message content type: "
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x01c9:
            r34 = 0
            java.lang.Boolean r33 = java.lang.Boolean.valueOf(r15)
            X.776 r6 = new X.776
            r31 = r6
            r35 = r34
            r36 = r34
            r37 = r34
            r38 = r34
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            goto L_0x00a7
        L_0x01e0:
            boolean r6 = r2 instanceof X.AnonymousClass7FJ
            r24 = 0
            if (r6 == 0) goto L_0x01f4
            X.7FJ r11 = (X.AnonymousClass7FJ) r11
            X.1Xj r6 = r11.A01
            boolean r11 = A00(r11, r6)
            if (r11 == 0) goto L_0x00a9
            if (r6 == 0) goto L_0x00a9
            goto L_0x00a0
        L_0x01f4:
            boolean r6 = X.N4Q.A00(r0, r2)
            if (r6 == 0) goto L_0x0247
            X.N4Q r11 = (X.N4Q) r11
            java.lang.Object r6 = r11.A01
            X.4gL r6 = (X.C270194gL) r6
            if (r6 == 0) goto L_0x00a9
            boolean r11 = r6.A09(r3)
            if (r11 != 0) goto L_0x00a9
            com.instagram.common.typedurl.ImageUrl r32 = r6.A02()
            if (r32 == 0) goto L_0x0225
            java.lang.Boolean r33 = java.lang.Boolean.valueOf(r15)
            X.776 r6 = new X.776
            r31 = r6
            r34 = r24
            r35 = r24
            r36 = r24
            r37 = r24
            r38 = r24
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            goto L_0x00a7
        L_0x0225:
            r6 = 2131100036(0x7f060184, float:1.7812442E38)
            int r11 = r10.getColor(r6)
            X.NZh r6 = new X.NZh
            r6.<init>(r11)
            goto L_0x00a7
        L_0x0233:
            boolean r5 = r2 instanceof X.AnonymousClass7FJ
            if (r5 == 0) goto L_0x023e
            r5 = r2
            X.7FJ r5 = (X.AnonymousClass7FJ) r5
            X.1Xj r5 = r5.A01
            goto L_0x0034
        L_0x023e:
            boolean r5 = X.N4Q.A00(r0, r2)
            if (r5 == 0) goto L_0x025b
            r5 = 0
            goto L_0x0034
        L_0x0247:
            java.lang.String r1 = "Unsupported message content type: "
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x025b:
            java.lang.String r1 = "Unsupported message content type: "
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x026f:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3264676w.AM8(android.content.Context, com.instagram.common.session.UserSession, X.7FE, X.9HC, X.7LQ):X.7Fr");
    }
}
