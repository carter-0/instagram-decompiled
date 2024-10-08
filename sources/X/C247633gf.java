package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3gf  reason: invalid class name and case insensitive filesystem */
public final class C247633gf {
    public final UserSession A00;
    public final 0Pl A01;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r1 != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        if (r31 != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r44 != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f3, code lost:
        if (X.AnonymousClass3VO.A00(r2, r4) != 1) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C247663gi A01(X.1Xj r40, X.AnonymousClass4DU r41, X.AnonymousClass3W1 r42, java.lang.String r43, boolean r44) {
        /*
            r39 = this;
            r4 = r40
            java.lang.String r29 = r4.BpP()
            int r0 = r4.A0v()
            if (r0 <= 0) goto L_0x0010
            r30 = 1
            if (r44 == 0) goto L_0x0012
        L_0x0010:
            r30 = 0
        L_0x0012:
            r5 = r39
            com.instagram.common.session.UserSession r2 = r5.A00
            boolean r31 = X.C247643gg.A0B(r2, r4)
            boolean r33 = X.AnonymousClass3VO.A05(r2, r4)
            r8 = 0
            X.1Xy r0 = r4.A0C
            java.util.List r6 = r0.BxO()
            r32 = 1
            r3 = r43
            if (r6 == 0) goto L_0x017d
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x017d
            boolean r0 = r4.CcK()
            if (r0 == 0) goto L_0x017d
            boolean r7 = X.C247623ge.A00(r2, r4, r3)
            java.lang.Object r0 = r6.get(r8)
            X.3yf r0 = (X.C258223yf) r0
            com.instagram.api.schemas.SocialContextType r1 = r0.BxW()
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.FOLLOWED_BY
            if (r1 == r0) goto L_0x0064
            java.lang.Object r0 = r6.get(r8)
            X.3yf r0 = (X.C258223yf) r0
            com.instagram.api.schemas.SocialContextType r1 = r0.BxW()
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.FOLLOWER_COUNT
            if (r1 != r0) goto L_0x017a
            X.0Tu r6 = X.0Tu.A06
            r0 = 36324501222338681(0x810cf100003079, double:3.0350990678086404E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            if (r0 != 0) goto L_0x017a
        L_0x0064:
            r1 = 1
        L_0x0065:
            X.3Yy r0 = X.C243483Yy.A00
            java.util.List r0 = r0.A06(r2, r4)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x017d
            if (r7 == 0) goto L_0x017d
            if (r1 == 0) goto L_0x017d
        L_0x0075:
            if (r30 != 0) goto L_0x007f
            if (r33 != 0) goto L_0x007f
            if (r32 != 0) goto L_0x007f
            r34 = 0
            if (r31 == 0) goto L_0x0081
        L_0x007f:
            r34 = 1
        L_0x0081:
            r6 = 1000(0x3e8, float:1.401E-42)
            r35 = 0
            boolean r0 = r4.CcK()
            if (r0 == 0) goto L_0x00c8
            r0 = r42
            X.1sy r1 = r0.A0o
            X.1sy r0 = X.1sy.A0H
            if (r1 != r0) goto L_0x00c8
            X.1Xy r0 = r4.A0C
            X.41Z r0 = r0.BUC()
            if (r0 == 0) goto L_0x00c8
            X.4hQ r0 = r0.B7C()
            if (r0 == 0) goto L_0x00c8
            X.1Xy r0 = r4.A0C
            X.41Z r0 = r0.BUC()
            if (r0 == 0) goto L_0x00c8
            X.4hQ r0 = r0.B7C()
            if (r0 == 0) goto L_0x00c8
            com.instagram.api.schemas.MoreInfoType r1 = r0.BUD()
            if (r1 == 0) goto L_0x00c8
            java.util.Set r0 = X.C55338Hg6.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00c8
            X.0Tu r7 = X.0Tu.A06
            r0 = 36321602119411288(0x810a4e00002658, double:3.0332656634436065E-306)
            boolean r35 = X.182.A06(r7, r2, r0)
        L_0x00c8:
            X.0Tu r7 = X.0Tu.A06
            r0 = 36321602119476825(0x810a4e00012659, double:3.0332656634850524E-306)
            boolean r36 = X.182.A06(r7, r2, r0)
            java.lang.String r0 = "feed_timeline"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00e3
            java.lang.String r0 = "explore_popular"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00f5
        L_0x00e3:
            boolean r0 = X.AnonymousClass3VO.A0A(r4)
            if (r0 == 0) goto L_0x00f5
            long r9 = X.AnonymousClass3VO.A00(r2, r4)
            r7 = 1
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r37 = 1
            if (r0 == 0) goto L_0x00f7
        L_0x00f5:
            r37 = 0
        L_0x00f7:
            r0 = 6
            X.9Mt r15 = new X.9Mt
            r15.<init>(r5, r4, r3, r0)
            r0 = 7
            X.9Mt r14 = new X.9Mt
            r14.<init>(r5, r4, r3, r0)
            r0 = 8
            X.9Mt r13 = new X.9Mt
            r13.<init>(r5, r4, r3, r0)
            r0 = 19
            X.9M5 r12 = new X.9M5
            r12.<init>(r0, r5, r4)
            r0 = 9
            X.9Mt r11 = new X.9Mt
            r11.<init>(r5, r4, r3, r0)
            r0 = 3
            X.9M6 r10 = new X.9M6
            r10.<init>((int) r6, (int) r0, (java.lang.Object) r5, (java.lang.Object) r4)
            r0 = 20
            X.9M5 r9 = new X.9M5
            r9.<init>(r0, r5, r4)
            r0 = 21
            X.9M5 r8 = new X.9M5
            r8.<init>(r0, r5, r4)
            r0 = 22
            X.9M5 r7 = new X.9M5
            r7.<init>(r0, r5, r4)
            r0 = 17
            X.9M5 r3 = new X.9M5
            r3.<init>(r0, r5, r4)
            r0 = 14
            X.9MC r1 = new X.9MC
            r6 = r41
            r1.<init>(r0, r5, r6, r4)
            r6 = 18
            X.9M5 r0 = new X.9M5
            r0.<init>(r6, r5, r4)
            X.3gh r16 = new X.3gh
            r28 = r0
            r26 = r3
            r27 = r1
            r25 = r7
            r24 = r8
            r23 = r9
            r22 = r10
            r21 = r11
            r20 = r12
            r19 = r13
            r18 = r14
            r17 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324694495998201(0x810d1e000230f9, double:3.0352212948491714E-306)
            boolean r38 = X.182.A06(r3, r2, r0)
            X.3gi r27 = new X.3gi
            r28 = r16
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r27
        L_0x017a:
            r1 = 0
            goto L_0x0065
        L_0x017d:
            r32 = 0
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247633gf.A01(X.1Xj, X.4DU, X.3W1, java.lang.String, boolean):X.3gi");
    }

    public C247633gf(UserSession userSession, 0Pl r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public static final void A00(UserSession userSession, 1Xj r2) {
        AnonymousClass1Nd.A00(userSession).A00(new C240283Kh(r2));
        r2.A0C.EYW(false);
    }
}
