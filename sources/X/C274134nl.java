package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4nl  reason: invalid class name and case insensitive filesystem */
public final class C274134nl {
    public final UserSession A00;
    public final C274114nj A01;
    public final 0Pl A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9LI(this, 46));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new AnonymousClass9LI(this, 48));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new AnonymousClass9LI(this, 49));
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LW(this, 0));
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new AnonymousClass9LW(this, 1));

    public C274134nl(UserSession userSession, C274114nj r5, 0Pl r6) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r5, 3);
        this.A00 = userSession;
        this.A02 = r6;
        this.A01 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        if (r3.A4u() == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        if (r8 <= 2) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0109, code lost:
        if (X.C270804hK.A02(r6) != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017b, code lost:
        if (X.0qQ.A0K(r5, "0") != false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005d, code lost:
        if (r101 == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02bc, code lost:
        if (r4 == false) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02c0, code lost:
        r48 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x029d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C274154nn A00(android.content.Context r88, X.1Xj r89, X.AnonymousClass4DU r90, X.AnonymousClass3W1 r91, java.lang.Float r92, java.lang.Integer r93, java.util.List r94, java.util.Map r95, java.util.Map r96, java.util.Map r97, int r98, int r99, boolean r100, boolean r101, boolean r102, boolean r103) {
        /*
            r87 = this;
            r14 = 0
            r3 = r89
            X.0qQ.A0B(r3, r14)
            r11 = 1
            r13 = r91
            X.0qQ.A0B(r13, r11)
            r12 = 2
            r5 = r94
            X.0qQ.A0B(r5, r12)
            r0 = 11
            r7 = r88
            X.0qQ.A0B(r7, r0)
            r15 = 12
            r4 = r90
            X.0qQ.A0B(r4, r15)
            r1 = 13
            r41 = r95
            r0 = r41
            X.0qQ.A0B(r0, r1)
            r1 = 14
            r27 = r96
            r0 = r27
            X.0qQ.A0B(r0, r1)
            r1 = 15
            r26 = r97
            r0 = r26
            X.0qQ.A0B(r0, r1)
            r10 = r99
            java.lang.Object r1 = r5.get(r10)
            X.1Xj r1 = (X.1Xj) r1
            int r8 = r5.size()
            r2 = r87
            com.instagram.common.session.UserSession r0 = r2.A00
            com.instagram.user.model.User r6 = r3.A2A(r0)
            if (r6 == 0) goto L_0x02c4
            java.lang.String r37 = r6.B8Q()
        L_0x0055:
            boolean r6 = r1.A5f()
            if (r6 == 0) goto L_0x005f
            r18 = 1
            if (r101 != 0) goto L_0x0061
        L_0x005f:
            r18 = 0
        L_0x0061:
            X.2kQ r9 = X.C227942kP.A00(r4)
            java.lang.String r35 = r3.getId()
            java.lang.String r4 = "Required value was null."
            if (r35 == 0) goto L_0x02ce
            java.lang.String r36 = r1.getId()
            if (r36 == 0) goto L_0x02c8
            float r44 = X.AnonymousClass4FX.A00(r5)
            r48 = 1
            r51 = r100
            if (r100 == 0) goto L_0x02b2
            boolean r4 = r3.A4u()
            if (r4 != 0) goto L_0x02c0
        L_0x0083:
            r50 = 0
            if (r8 == 0) goto L_0x00a1
            int r4 = r8 - r11
            if (r10 != r4) goto L_0x00a1
            boolean r4 = r3.CcK()
            if (r4 == 0) goto L_0x00a1
            X.1Xy r4 = r1.A0C
            X.4qh r4 = r4.Br1()
            if (r4 != 0) goto L_0x009f
            java.lang.String r4 = r3.A33(r10)
            if (r4 == 0) goto L_0x00a1
        L_0x009f:
            r50 = 1
        L_0x00a1:
            if (r100 == 0) goto L_0x00a7
            r52 = 1
            if (r8 > r12) goto L_0x00a9
        L_0x00a7:
            r52 = 0
        L_0x00a9:
            r53 = 0
            if (r8 == 0) goto L_0x00cd
            int r6 = r99 + 1
            int r4 = r8 - r11
            r16 = 0
            if (r6 != r4) goto L_0x00b7
            r16 = 1
        L_0x00b7:
            java.lang.Object r4 = X.00k.A0K(r5)
            X.1Xj r4 = (X.1Xj) r4
            X.1Xy r4 = r4.A0C
            X.4qh r5 = r4.Br1()
            r4 = 0
            if (r5 == 0) goto L_0x00c7
            r4 = 1
        L_0x00c7:
            if (r16 == 0) goto L_0x00cd
            if (r4 == 0) goto L_0x00cd
            r53 = 1
        L_0x00cd:
            boolean r54 = r1.CcK()
            boolean r55 = r3.CcK()
            X.0eM r4 = r2.A03
            java.lang.Object r4 = r4.getValue()
            X.3fS r4 = (X.C246923fS) r4
            X.3fX r28 = r4.A00(r7, r1)
            X.1Xy r4 = r1.A0C
            X.4qh r24 = r4.Br1()
            X.1Xy r4 = r3.A0C
            com.instagram.user.model.User r4 = r4.CCd()
            r39 = 0
            if (r4 == 0) goto L_0x02ae
            com.instagram.common.typedurl.ImageUrl r25 = r4.Bh3()
        L_0x00f5:
            com.instagram.model.androidlink.AndroidLink r6 = X.AnonymousClass47K.A02(r7, r0, r3, r14, r14)
            if (r6 == 0) goto L_0x02ab
            X.47L r4 = X.C271714jT.A01(r6)
        L_0x00ff:
            X.47L r5 = X.AnonymousClass47L.AD_DESTINATION_DIRECT_MESSAGE
            if (r4 == r5) goto L_0x010b
            boolean r4 = X.C270804hK.A02(r6)
            r58 = 0
            if (r4 == 0) goto L_0x010d
        L_0x010b:
            r58 = 1
        L_0x010d:
            X.3eZ r4 = X.C246413eY.A00(r0)
            boolean r59 = r4.A02(r9, r1, r3)
            X.0eM r4 = r2.A04
            java.lang.Object r4 = r4.getValue()
            X.3fg r4 = (X.C247043fg) r4
            X.3fk r30 = r4.A00(r1, r13)
            X.0eM r4 = r2.A07
            java.lang.Object r4 = r4.getValue()
            X.4Ge r4 = (X.C262834Ge) r4
            X.4nj r5 = r2.A01
            X.4Gh r66 = r5.BR1()
            r60 = r4
            r61 = r7
            r62 = r3
            r63 = r1
            r64 = r9
            r65 = r13
            X.9IV r21 = r60.A00(r61, r62, r63, r64, r65, r66)
            boolean r60 = r1.A5m()
            float r5 = r1.A0l()
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            r61 = 0
            if (r4 <= 0) goto L_0x0151
            r61 = 1
        L_0x0151:
            boolean r62 = X.C263014Gw.A01(r0, r3)
            X.1Xy r4 = r1.A0C
            com.instagram.user.model.User r31 = r4.BfH()
            boolean r4 = r3.A6H()
            if (r4 == 0) goto L_0x02a7
            X.1Xy r4 = r1.A0C
            com.instagram.user.model.User r4 = r4.BfH()
            if (r4 == 0) goto L_0x017d
            X.1Xy r4 = r1.A0C
            com.instagram.user.model.User r4 = r4.BfH()
            if (r4 == 0) goto L_0x02a3
            java.lang.String r5 = r4.getId()
        L_0x0175:
            java.lang.String r4 = "0"
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 == 0) goto L_0x02a7
        L_0x017d:
            X.1Xy r4 = r3.A0C
            com.instagram.user.model.User r32 = r4.CCd()
        L_0x0183:
            java.lang.String r4 = r1.A34(r7)
            if (r4 != 0) goto L_0x029d
            java.lang.String r38 = ""
        L_0x018b:
            com.instagram.user.model.User r4 = r3.A2A(r0)
            if (r4 == 0) goto L_0x0195
            java.lang.String r39 = r4.getId()
        L_0x0195:
            X.3Ye r4 = new X.3Ye
            r4.<init>(r0)
            java.lang.String r0 = "cta_extension_tap_on_media"
            X.9J3 r22 = r4.A00(r3, r9, r13, r0)
            X.9MM r71 = new X.9MM
            r63 = r71
            r64 = r8
            r65 = r12
            r66 = r2
            r67 = r3
            r68 = r9
            r63.<init>(r64, r65, r66, r67, r68)
            X.9M2 r17 = new X.9M2
            r0 = r17
            r0.<init>(r12, r2, r1)
            r4 = 38
            X.9Lz r16 = new X.9Lz
            r0 = r16
            r0.<init>(r4, r1, r2)
            X.9N1 r66 = new X.9N1
            r72 = r66
            r73 = r2
            r74 = r1
            r75 = r3
            r76 = r9
            r77 = r37
            r78 = r10
            r79 = r8
            r80 = r14
            r72.<init>(r73, r74, r75, r76, r77, r78, r79, r80)
            X.9M9 r68 = new X.9M9
            r47 = r98
            r72 = r68
            r74 = r47
            r76 = r10
            r77 = r14
            r72.<init>(r73, r74, r75, r76, r77)
            X.9M9 r70 = new X.9M9
            r72 = r70
            r77 = r11
            r72.<init>(r73, r74, r75, r76, r77)
            X.4nm r7 = new X.4nm
            r0 = r18
            r7.<init>(r2, r3, r10, r0)
            X.9MT r78 = new X.9MT
            r79 = r11
            r80 = r2
            r81 = r3
            r82 = r1
            r83 = r9
            r78.<init>(r79, r80, r81, r82, r83)
            X.9MT r79 = new X.9MT
            r72 = r79
            r73 = r12
            r74 = r2
            r76 = r1
            r77 = r9
            r72.<init>(r73, r74, r75, r76, r77)
            X.9MT r75 = new X.9MT
            r80 = r75
            r81 = r14
            r82 = r2
            r83 = r3
            r84 = r1
            r85 = r9
            r80.<init>(r81, r82, r83, r84, r85)
            r0 = 37
            X.9Lz r6 = new X.9Lz
            r6.<init>(r0, r1, r2)
            r0 = 32
            X.9MI r5 = new X.9MI
            r5.<init>((int) r0, (java.lang.Object) r9, (java.lang.Object) r2, (java.lang.Object) r1)
            X.9MC r4 = new X.9MC
            r4.<init>(r15, r2, r1, r9)
            X.9MZ r74 = new X.9MZ
            r80 = r74
            r81 = r12
            r82 = r13
            r83 = r2
            r84 = r9
            r85 = r3
            r86 = r1
            r80.<init>(r81, r82, r83, r84, r85, r86)
            r81 = 3
            X.9MZ r72 = new X.9MZ
            r80 = r72
            r80.<init>(r81, r82, r83, r84, r85, r86)
            r0 = 47
            X.9LI r2 = new X.9LI
            r2.<init>(r13, r0)
            X.9IS r20 = new X.9IS
            r63 = r20
            r64 = r16
            r65 = r6
            r67 = r17
            r69 = r5
            r73 = r2
            r76 = r4
            r77 = r7
            r80 = r14
            r63.<init>(r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80)
            X.1Xy r0 = r1.A0C
            X.4qi r23 = r0.BH3()
            X.3QO r29 = r3.A1t()
            java.util.List r40 = r1.A3Z()
            X.4nn r19 = new X.4nn
            r57 = r103
            r56 = r102
            r33 = r92
            r34 = r93
            r42 = r27
            r43 = r26
            r45 = r8
            r46 = r10
            r49 = r18
            r26 = r1
            r27 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            return r19
        L_0x029d:
            java.lang.String r38 = r4.toString()
            goto L_0x018b
        L_0x02a3:
            r5 = r39
            goto L_0x0175
        L_0x02a7:
            r32 = r39
            goto L_0x0183
        L_0x02ab:
            r4 = 0
            goto L_0x00ff
        L_0x02ae:
            r25 = r39
            goto L_0x00f5
        L_0x02b2:
            boolean r6 = r1.A4s()
            boolean r4 = r1.A4u()
            if (r6 != 0) goto L_0x0083
            if (r4 == 0) goto L_0x02c0
            goto L_0x0083
        L_0x02c0:
            r48 = 0
            goto L_0x0083
        L_0x02c4:
            r37 = 0
            goto L_0x0055
        L_0x02c8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x02ce:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C274134nl.A00(android.content.Context, X.1Xj, X.4DU, X.3W1, java.lang.Float, java.lang.Integer, java.util.List, java.util.Map, java.util.Map, java.util.Map, int, int, boolean, boolean, boolean, boolean):X.4nn");
    }
}
