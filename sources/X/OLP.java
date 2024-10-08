package X;

import com.instagram.common.session.UserSession;

public final class OLP {
    public final UserSession A00;
    public final AnonymousClass9HC A01;
    public final AnonymousClass7L2 A02;
    public final C70743OJo A03;
    public final C70467O7s A04;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0183, code lost:
        if (r10.length() > 0) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r3 == X.2FW.A1j) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C328607Fl A00(X.C74541Pwa r67, X.C3262275x r68, X.C3255473b r69, com.instagram.direct.model.messaginguser.MessagingUser r70, X.OMF r71, X.C74552Pwl r72, X.2FW r73, java.util.Set r74, int r75) {
        /*
            r66 = this;
            r2 = 0
            X.2FW r0 = X.2FW.A1g
            r3 = r73
            if (r3 == r0) goto L_0x0015
            X.2FW r0 = X.2FW.A17
            if (r3 == r0) goto L_0x0015
            X.2FW r0 = X.2FW.A1k
            if (r3 == r0) goto L_0x0015
            X.2FW r0 = X.2FW.A1j
            r48 = 0
            if (r3 != r0) goto L_0x0017
        L_0x0015:
            r48 = 1
        L_0x0017:
            r6 = r70
            r1 = r72
            r0 = r75
            boolean r7 = X.C74552Pwl.A02(r6, r1, r0)
            r5 = r66
            X.7L2 r4 = r5.A02
            X.7Kz r17 = X.AnonymousClass7FB.A04(r4, r7)
            com.instagram.common.session.UserSession r15 = r5.A00
            boolean r47 = X.C74552Pwl.A02(r6, r1, r0)
            X.OJo r8 = r5.A03
            X.9HC r5 = r5.A01
            r20 = r5
            r26 = r71
            boolean r25 = X.OPx.A01(r26)
            r9 = r67
            r23 = r74
            r18 = r8
            r19 = r9
            r21 = r6
            r22 = r1
            r24 = r0
            X.7Rk r33 = r18.A00(r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r5 = r1.BsO(r0)
            com.instagram.common.typedurl.SimpleImageUrl r10 = X.DbS.A0V(r5)
            X.7Ff r9 = X.C71136Ode.A04(r9, r6, r1, r0)
            r5 = r26
            X.NAt r8 = r5.A00
            com.facebook.msys.mci.CQLResultSet r11 = r8.mResultSet
            r5 = 17
            int r11 = r11.getInteger(r2, r5)
            r5 = 15
            boolean r5 = X.AnonymousClass7TF.A1S(r11, r5)
            r11 = r5 ^ 1
            X.7Fg r16 = new X.7Fg
            r5 = r16
            r5.<init>(r10, r9, r11)
            r5 = 1
            X.O7p r9 = r1.Bjo(r0)
            boolean[] r5 = new boolean[r5]
            r5[r2] = r2
            X.0eP r10 = X.C71136Ode.A07(r6, r9, r5)
            java.lang.Object r13 = r10.A00
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r12 = r10.A01
            java.util.Map r12 = (java.util.Map) r12
            java.lang.String r57 = X.C71136Ode.A06(r6, r1, r0)
            r10 = 41
            X.PlY r11 = new X.PlY
            r11.<init>(r15, r10)
            java.lang.Class<X.OKj> r10 = X.C70763OKj.class
            java.lang.Object r10 = r15.A01(r10, r11)
            X.OKj r10 = (X.C70763OKj) r10
            X.Nab r14 = r10.A00(r1, r0)
            X.79F r49 = X.AnonymousClass79F.A00
            long r10 = r1.BsH(r0)
            java.util.ArrayList r60 = X.C71095OcV.A03(r9, r10)
            java.lang.String r10 = r1.BSF(r0)
            java.lang.Long r9 = r1.BNc(r0)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            com.instagram.model.direct.messageid.MessageIdentifier r55 = X.C66580MXl.A0i(r10, r9)
            com.facebook.msys.mci.CQLResultSet r8 = r8.mResultSet
            long r8 = r8.getLong(r2, r2)
            java.lang.String r58 = java.lang.String.valueOf(r8)
            java.lang.String r11 = r6.A03
            X.0qQ.A07(r11)
            boolean r63 = X.OPx.A01(r26)
            X.7Kx r6 = r4.A04
            boolean r64 = r5[r2]
            X.2FW r10 = r14.A10
            X.0qQ.A07(r10)
            long r8 = r14.C7c()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r8 = r5.toMillis(r8)
            java.lang.Long r56 = java.lang.Long.valueOf(r8)
            r18 = 0
            r50 = r18
            r51 = r15
            r52 = r20
            r53 = r6
            r54 = r10
            r59 = r11
            r61 = r13
            r62 = r12
            r65 = r2
            X.79G r42 = r49.A03(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            java.lang.String r10 = r1.BSF(r0)
            int r5 = r1.BsF(r0)
            int r13 = r1.BIa(r0)
            r26.A00()
            r1 = 2
            r8 = 1
            if (r7 == 0) goto L_0x017c
            r0 = 6
            if (r5 == r0) goto L_0x0114
            if (r5 != r1) goto L_0x017c
        L_0x0114:
            r1 = 1
        L_0x0115:
            r8 = 0
        L_0x0116:
            X.2FW r0 = X.2FW.A1A
            if (r3 != r0) goto L_0x0179
            if (r1 != 0) goto L_0x011e
            if (r8 == 0) goto L_0x0179
        L_0x011e:
            r0 = r20
            X.0eM r0 = r0.A0P
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0179
            int r1 = r6.A0M
            int r0 = r6.A0N
            X.77i r30 = new X.77i
            r8 = r30
            r11 = r1
            r12 = r0
            r14 = r7
            r9 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L_0x0137:
            int r1 = r4.A00
            r0 = r17
            int r0 = r0.A00
            X.7Fl r17 = new X.7Fl
            r29 = r68
            r31 = r69
            r19 = r18
            r20 = r18
            r22 = r18
            r23 = r18
            r24 = r18
            r25 = r18
            r26 = r18
            r27 = r18
            r28 = r18
            r32 = r18
            r34 = r18
            r35 = r16
            r36 = r18
            r37 = r18
            r38 = r18
            r39 = r18
            r40 = r18
            r41 = r18
            r43 = r18
            r44 = r18
            r45 = r1
            r46 = r0
            r49 = r2
            r50 = r2
            r21 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            return r17
        L_0x0179:
            r30 = 0
            goto L_0x0137
        L_0x017c:
            r1 = 0
            if (r7 != 0) goto L_0x0115
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x0115
            goto L_0x0116
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OLP.A00(X.Pwa, X.75x, X.73b, com.instagram.direct.model.messaginguser.MessagingUser, X.OMF, X.Pwl, X.2FW, java.util.Set, int):X.7Fl");
    }

    public OLP(UserSession userSession, AnonymousClass9HC r2, AnonymousClass7L2 r3, C70743OJo oJo, C70467O7s o7s) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = oJo;
        this.A04 = o7s;
    }
}
