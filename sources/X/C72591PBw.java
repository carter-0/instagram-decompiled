package X;

/* renamed from: X.PBw  reason: case insensitive filesystem */
public final class C72591PBw implements C74334PtA {
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e2, code lost:
        if (r6.A01.A00(X.C376179Gx.MESSAGE_SAVE_MEDIA) == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010c, code lost:
        if (r16.intValue() != r7) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0118, code lost:
        if (r15.intValue() != 0) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012c, code lost:
        if (r0.BmP(r1) == null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0142, code lost:
        if (r16 == null) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.AnonymousClass7FW ALM(android.content.Context r53, X.C74541Pwa r54, com.instagram.common.session.UserSession r55, X.AnonymousClass7FE r56, X.AnonymousClass9HC r57, X.AnonymousClass7L2 r58, com.instagram.direct.model.messaginguser.MessagingUser r59, X.C74552Pwl r60, com.instagram.direct.msys.subtype.MsysThreadSubtype r61, java.lang.String r62, java.util.List r63, int r64, boolean r65, boolean r66, boolean r67, boolean r68) {
        /*
            r52 = this;
            r8 = 0
            r12 = r53
            r0 = r55
            boolean r7 = X.AnonymousClass7TF.A1U(r8, r12, r0)
            r2 = 2
            r6 = r57
            r11 = r59
            int r5 = X.DbW.A03(r2, r6, r11)
            r9 = 4
            r0 = r60
            X.0qQ.A0B(r0, r9)
            r13 = r56
            r1 = r58
            X.C51972G9s.A1E(r13, r1)
            r1 = 12
            r3 = r61
            X.0qQ.A0B(r3, r1)
            r48 = r67
            r1 = r64
            if (r67 == 0) goto L_0x0035
            java.lang.Integer r17 = r0.BmC(r1)
        L_0x0030:
            if (r17 != 0) goto L_0x003a
            r20 = 0
            return r20
        L_0x0035:
            java.lang.Integer r17 = r0.Acu(r1)
            goto L_0x0030
        L_0x003a:
            if (r67 == 0) goto L_0x015b
            java.lang.Integer r10 = r0.BmB(r1)
            java.lang.Integer r4 = r0.BmA(r1)
            java.lang.Integer r16 = r0.BmO(r1)
        L_0x0048:
            if (r67 == 0) goto L_0x0155
            r3 = 10
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
        L_0x0050:
            if (r67 == 0) goto L_0x014f
            r14 = 0
        L_0x0053:
            int r3 = X.C66582MXn.A06(r10)
            if (r4 == 0) goto L_0x0149
            int r4 = r4.intValue()
            if (r4 != 0) goto L_0x014a
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0061:
            int r4 = r17.intValue()
            boolean r41 = X.AnonymousClass7TF.A1S(r9, r4)
            r19 = 0
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r38 = 1640937600000(0x17e0f80b400, double:8.10730895129E-312)
            java.lang.String r10 = ""
            X.4im r9 = new X.4im
            r9.<init>(r4, r10)
            X.3WR r25 = r9.A00()
            r46 = r41 ^ 1
            if (r41 == 0) goto L_0x0145
            X.1iA r23 = X.1iA.A0a
        L_0x0083:
            X.0sn r36 = X.0sn.A00
            X.OrK r18 = X.C71817OrK.A00
            java.lang.String r31 = "organic"
            X.4iq r17 = new X.4iq
            r20 = r19
            r21 = r19
            r22 = r19
            r24 = r19
            r26 = r4
            r27 = r19
            r28 = r19
            r29 = r19
            r30 = r19
            r32 = r19
            r33 = r19
            r34 = r19
            r35 = r19
            r37 = r3
            r40 = r8
            r42 = r8
            r43 = r8
            r44 = r8
            r45 = r8
            r47 = r41
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r46, r47)
            java.lang.Integer r25 = X.AnonymousClass05K.A0u
            if (r14 == 0) goto L_0x0140
            java.lang.Integer r25 = X.AnonymousClass05K.A00
            if (r16 == 0) goto L_0x0140
            int r3 = r16.intValue()
            if (r3 != r2) goto L_0x0140
            if (r15 == 0) goto L_0x00cc
            int r2 = r15.intValue()
            if (r2 == 0) goto L_0x0140
        L_0x00cc:
            r25 = r4
            r30 = 1
        L_0x00d0:
            int r2 = r16.intValue()
            if (r2 == r5) goto L_0x00d8
            if (r2 != 0) goto L_0x00e4
        L_0x00d8:
            com.instagram.direct.capabilities.Capabilities r3 = r6.A01
            X.9Gx r2 = X.C376179Gx.MESSAGE_SAVE_MEDIA
            boolean r2 = r3.A00(r2)
            r44 = 1
            if (r2 != 0) goto L_0x00e6
        L_0x00e4:
            r44 = 0
        L_0x00e6:
            X.2FW r2 = X.2FW.A1j
            X.Pju r42 = X.C73795Pju.A00
            r46 = r65
            r50 = r66
            r37 = r12
            r38 = r6
            r39 = r11
            r40 = r0
            r41 = r2
            r43 = r1
            r47 = r8
            r49 = r46
            r51 = r7
            X.7FT r21 = X.C71136Ode.A01(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            if (r16 == 0) goto L_0x010e
            int r3 = r16.intValue()
            r29 = 1
            if (r3 == r7) goto L_0x0110
        L_0x010e:
            r29 = 0
        L_0x0110:
            if (r15 == 0) goto L_0x011a
            int r3 = r15.intValue()
            r31 = 1
            if (r3 == 0) goto L_0x011c
        L_0x011a:
            r31 = 0
        L_0x011c:
            java.lang.Integer r26 = X.AnonymousClass05K.A0C
            r3 = r54
            X.2FW r3 = X.OZ6.A00(r3, r0, r1)
            if (r3 != r2) goto L_0x012e
            java.lang.Long r0 = r0.BmP(r1)
            r34 = 1
            if (r0 != 0) goto L_0x0130
        L_0x012e:
            r34 = 0
        L_0x0130:
            X.Mdk r20 = new X.Mdk
            r27 = r62
            r22 = r13
            r23 = r17
            r32 = r8
            r33 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return r20
        L_0x0140:
            r30 = 0
            if (r16 != 0) goto L_0x00d0
            goto L_0x00e4
        L_0x0145:
            X.1iA r23 = X.1iA.A0Q
            goto L_0x0083
        L_0x0149:
            r4 = 1
        L_0x014a:
            float r3 = (float) r3
            float r4 = (float) r4
            float r3 = r3 / r4
            goto L_0x0061
        L_0x014f:
            boolean r14 = r0.CFj(r1)
            goto L_0x0053
        L_0x0155:
            java.lang.Integer r15 = r0.CFk(r1)
            goto L_0x0050
        L_0x015b:
            java.lang.Integer r10 = r0.BfB(r1)
            java.lang.Integer r4 = r0.Bf0(r1)
            java.lang.Integer r16 = r0.BS8(r1)
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72591PBw.ALM(android.content.Context, X.Pwa, com.instagram.common.session.UserSession, X.7FE, X.9HC, X.7L2, com.instagram.direct.model.messaginguser.MessagingUser, X.Pwl, com.instagram.direct.msys.subtype.MsysThreadSubtype, java.lang.String, java.util.List, int, boolean, boolean, boolean, boolean):X.7FW");
    }
}
