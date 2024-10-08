package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9d8  reason: invalid class name and case insensitive filesystem */
public final class C382089d8 extends C251343mx {
    public final C385149iT A00;
    public final C52971GgO A01;
    public final UserSession A02;
    public final C333777a7 A03;
    public final C334297b2 A04;

    public C382089d8(C385149iT r2, C333777a7 r3, C334297b2 r4, C52971GgO ggO, UserSession userSession) {
        AnonymousClass7TG.A0w(1, r2, userSession, ggO);
        0qQ.A0B(r4, 5);
        this.A00 = r2;
        this.A03 = r3;
        this.A02 = userSession;
        this.A01 = ggO;
        this.A04 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00be, code lost:
        if (r11.A0c != true) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x015c, code lost:
        if (r11.A00 != 0) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005d, code lost:
        if (r6.A00 == X.C333897aK.SHOW_ORIGINAL) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r53) {
        /*
            r52 = this;
            r7 = 0
            r51 = r53
            r0 = r51
            X.0qQ.A0B(r0, r7)
            r8 = r52
            X.9iT r6 = r8.A00
            boolean r12 = r6.A0C
            if (r12 == 0) goto L_0x024b
            boolean r0 = r6.A0F
            if (r0 == 0) goto L_0x024b
            r0 = 0
        L_0x0016:
            long r4 = java.lang.Double.doubleToRawLongBits(r0)
            X.3XV r11 = X.2WX.A02
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r15 = 1120403456(0x42c80000, float:100.0)
            X.9JQ r0 = new X.9JQ
            r0.<init>(r3, r15, r7)
            r2 = 0
            X.2WX r10 = new X.2WX
            r10.<init>(r2, r0)
            r0 = 4622945017495814144(0x4028000000000000, double:12.0)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            java.lang.Integer r9 = X.AnonymousClass05K.A04
            X.2WX r10 = X.AnonymousClass9JR.A00(r10, r9, r7, r0)
            java.lang.Integer r9 = X.AnonymousClass05K.A15
            X.2WX r5 = X.AnonymousClass9JR.A00(r10, r9, r7, r4)
            java.lang.Integer r4 = X.AnonymousClass05K.A1I
            X.2WX r5 = X.AnonymousClass9JR.A00(r5, r4, r7, r0)
            r0 = 4631248529308778496(0x4045800000000000, double:43.0)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            X.2WX r20 = X.AnonymousClass9JR.A00(r5, r4, r7, r0)
            boolean r10 = r6.A0A
            r9 = 1
            if (r10 == 0) goto L_0x005f
            X.7aK r1 = r6.A00
            X.7aK r0 = X.C333897aK.SHOW_ORIGINAL
            r19 = 1
            if (r1 != r0) goto L_0x0061
        L_0x005f:
            r19 = 0
        L_0x0061:
            X.7b2 r13 = r8.A04
            X.2WX r18 = X.C336827fF.A00(r11, r6, r13)
            r0 = r51
            X.2V1 r0 = r0.A05
            X.2Wb r5 = X.AnonymousClass7TG.A0S(r0)
            X.3Zh r17 = X.C243573Zh.FLEX_START
            X.2V1 r0 = r5.A00
            r50 = r0
            X.2Wb r4 = X.AnonymousClass7TG.A0S(r50)
            com.instagram.common.session.UserSession r1 = r8.A02
            java.lang.String r0 = r6.A00
            r31 = r0
            com.instagram.user.model.User r0 = r6.A02
            r49 = r0
            X.4DU r0 = r13.A05
            r47 = r0
            X.GgO r0 = r8.A01
            r45 = r0
            X.7fG r0 = new X.7fG
            r21 = r0
            r22 = r45
            r23 = r1
            r24 = r47
            r25 = r49
            r26 = r31
            r27 = r7
            r28 = r7
            r29 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            r4.A00(r0)
            X.2V1 r0 = r4.A00
            X.2Wb r0 = X.AnonymousClass7TG.A0S(r0)
            java.lang.Long r11 = r6.A03
            r30 = r11
            boolean r11 = r6.A09
            r40 = r11
            boolean r11 = r6.A0G
            r16 = r11
            X.7a7 r11 = r8.A03
            if (r11 == 0) goto L_0x00c0
            boolean r14 = r11.A0c
            r13 = 1
            if (r14 == r9) goto L_0x00c1
        L_0x00c0:
            r13 = 0
        L_0x00c1:
            r42 = r13 ^ 1
            X.7cA r14 = new X.7cA
            r14.<init>(r1, r2)
            X.7fH r13 = new X.7fH
            r21 = r13
            r22 = r2
            r23 = r11
            r24 = r45
            r25 = r1
            r26 = r47
            r27 = r14
            r28 = r2
            r29 = r49
            r32 = r7
            r33 = r9
            r34 = r7
            r35 = r12
            r36 = r7
            r37 = r7
            r38 = r7
            r39 = r7
            r41 = r16
            r43 = r7
            r44 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r0.A00(r13)
            X.7aK r12 = r6.A00
            r48 = r12
            X.7aK r13 = X.C333897aK.SHOW_TRANSLATION
            if (r12 != r13) goto L_0x0245
            java.lang.String r12 = r6.A07
            r32 = r12
        L_0x0104:
            X.7df r23 = X.C335867df.APPROVED
            boolean r12 = r6.A0D
            r44 = r12
            X.7dd r25 = new X.7dd
            r26 = r2
            r27 = r2
            r29 = r2
            r30 = r2
            r31 = r7
            r25.<init>(r26, r27, r28, r29, r30, r31)
            java.util.Map r12 = r6.A08
            r16 = r12
            if (r19 != 0) goto L_0x0241
            X.0qQ.A0B(r1, r7)
            X.0Tu r12 = X.0Tu.A05
            r13 = 36321108198761578(0x8109db0009246a, double:3.032953306035871E-306)
            boolean r13 = X.182.A06(r12, r1, r13)
            if (r13 != 0) goto L_0x013b
            java.lang.String r14 = r49.getId()
            java.lang.String r13 = r1.A06
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x014e
        L_0x013b:
            if (r16 == 0) goto L_0x0241
            int r13 = r16.size()
            if (r13 == 0) goto L_0x0241
            r13 = 36321108198630504(0x8109db00072468, double:3.0329533059529794E-306)
            boolean r12 = X.182.A06(r12, r1, r13)
            if (r12 == 0) goto L_0x0241
        L_0x014e:
            r46 = 1
        L_0x0150:
            java.lang.String r13 = r6.A06
            boolean r12 = r6.A0E
            if (r12 == 0) goto L_0x0160
            if (r11 == 0) goto L_0x015e
            int r11 = r11.A00
            r38 = 10
            if (r11 == 0) goto L_0x0160
        L_0x015e:
            r38 = 4
        L_0x0160:
            X.7fI r11 = new X.7fI
            r21 = r11
            r24 = r2
            r26 = r45
            r27 = r47
            r28 = r1
            r31 = r49
            r33 = r2
            r34 = r2
            r35 = r13
            r36 = r2
            r37 = r16
            r40 = r7
            r41 = r7
            r42 = r7
            r45 = r44
            r47 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r0.A00(r11)
            X.2V1 r1 = r0.Aqq()
            X.2Wb r11 = X.AnonymousClass7TG.A0S(r1)
            if (r10 == 0) goto L_0x01c5
            X.2WX r1 = X.C336867fJ.A0F
            int r10 = r48.ordinal()
            if (r10 == r7) goto L_0x023c
            if (r10 == r9) goto L_0x0237
            r1 = 2
            if (r10 != r1) goto L_0x024f
            r1 = 2131973006(0x7f13538e, float:1.9583036E38)
        L_0x01a2:
            java.lang.String r10 = X.C244013aV.A0E(r11, r1)
            X.2WX r12 = X.C336867fJ.A0F
            r1 = 36
            X.J6O r13 = new X.J6O
            r13.<init>(r8, r1)
            java.lang.Integer r14 = X.AnonymousClass05K.A1F
            r8 = 4
            X.9JS r1 = new X.9JS
            r1.<init>(r14, r13, r8)
            X.2WX r8 = new X.2WX
            r8.<init>(r12, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.2WW r1 = X.C336877fK.A00(r11, r8, r10, r1, r9)
            r11.A00(r1)
        L_0x01c5:
            java.util.List r8 = r11.A01
            X.2Tp r1 = new X.2Tp
            r21 = r1
            r23 = r2
            r25 = r2
            r26 = r8
            r27 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r0.A00(r1)
            X.2Tl r0 = X.C243563Zg.A00(r0)
            r4.A00(r0)
            r1 = r20
            r0 = r17
            X.2Tp r0 = X.C243563Zg.A0I(r4, r5, r1, r0, r2)
            r5.A00(r0)
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x022e
            r0 = 9221401712017801217(0x7ff9000000000001, double:NaN)
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            X.2WX r1 = X.AnonymousClass9JR.A00(r2, r4, r7, r0)
            X.9JQ r0 = new X.9JQ
            r0.<init>(r3, r15, r7)
            X.2WX r4 = new X.2WX
            r4.<init>(r1, r0)
            r0 = r50
            android.content.Context r1 = r0.A0C
            r0 = 2130970213(0x7f040665, float:1.754913E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = X.C244013aV.A02(r5, r0)
            X.7gD r2 = new X.7gD
            r2.<init>(r0)
            r1 = 4
            X.9JS r0 = new X.9JS
            r0.<init>(r3, r2, r1)
            X.2WX r1 = new X.2WX
            r1.<init>(r4, r0)
            X.2Wb r0 = X.AnonymousClass7TG.A0S(r50)
            X.2Tp r0 = X.C243563Zg.A0B(r0, r5, r1)
            r5.A00(r0)
        L_0x022e:
            r1 = r18
            r0 = r51
            X.2Tl r0 = X.C243563Zg.A03(r5, r0, r1)
            return r0
        L_0x0237:
            r1 = 2131965491(0x7f133633, float:1.9567793E38)
            goto L_0x01a2
        L_0x023c:
            r1 = 2131973013(0x7f135395, float:1.958305E38)
            goto L_0x01a2
        L_0x0241:
            r46 = 0
            goto L_0x0150
        L_0x0245:
            java.lang.String r12 = r6.A04
            r32 = r12
            goto L_0x0104
        L_0x024b:
            r0 = 4622945017495814144(0x4028000000000000, double:12.0)
            goto L_0x0016
        L_0x024f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382089d8.A0X(X.3Y5):X.3mp");
    }
}
