package X;

public final class P7A implements C328347El {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0210, code lost:
        if (r3.A1j(X.AnonymousClass7TF.A0Q(r5)) != false) goto L_0x0212;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C232262tL AWb(android.content.Context r103, com.instagram.common.session.UserSession r104, X.AnonymousClass9HC r105, X.C331837So r106, X.AnonymousClass7L2 r107, X.17i r108, boolean r109) {
        /*
            r102 = this;
            r0 = r106
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            r34 = 0
            r9 = r103
            r5 = r104
            r1 = r108
            X.C51973G9u.A1E(r9, r5, r1)
            r2 = 3
            r12 = r105
            r8 = r107
            X.C51973G9u.A0r(r2, r8, r0, r12)
            X.PjW r1 = X.C73771PjW.A00
            X.0t0 r16 = X.AnonymousClass0eN.A01(r1)
            X.3su r3 = r0.A0e
            X.2FW r1 = r3.A10
            X.0qQ.A07(r1)
            r11 = r5
            r13 = r0
            r14 = r8
            r15 = r1
            X.7FE r19 = X.AnonymousClass7FD.A03(r11, r12, r13, r14, r15, r16)
            r14 = 0
            X.76s r1 = new X.76s
            r1.<init>(r14, r14, r14, r2)
            r13 = 2
            X.7Qj r2 = X.C331287Qh.A00(r5)
            java.lang.String r1 = r3.A0g()
            java.util.List r18 = r2.A00(r1)
            boolean r1 = r18.isEmpty()
            if (r1 == 0) goto L_0x0049
            com.google.common.collect.ImmutableList r18 = com.google.common.collect.ImmutableList.of(r3)
        L_0x0049:
            java.util.ArrayList r17 = X.AnonymousClass7TG.A0r(r18)
            java.util.Iterator r16 = r18.iterator()
        L_0x0051:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x00ea
            java.lang.Object r6 = r16.next()
            X.3su r6 = (X.C254703su) r6
            X.7SD r4 = r0.A0G
            int r2 = r4.A08
            r1 = 29
            if (r2 != r1) goto L_0x00e7
            boolean r4 = r4.A0n
        L_0x0067:
            X.0qQ.A0B(r6, r13)
            X.3tC r11 = X.C3266377o.A00(r6)
            com.instagram.model.direct.messageid.DirectMessageIdentifier r44 = r6.A0V()
            boolean r53 = X.C3266377o.A03(r5, r6)
            java.lang.String r15 = r6.A1u
            X.0qQ.A07(r15)
            com.instagram.user.model.User r1 = r0.A0K
            java.lang.String r47 = X.C51971G9r.A0t(r1)
            X.7FT r37 = X.C66580MXl.A0Y(r9, r5, r12, r0, r3)
            X.7SD r1 = r0.A0G
            X.3t3 r2 = r1.A0P
            int r1 = r1.A08
            X.3tC r10 = X.C3266377o.A00(r6)
            X.0eM r7 = r12.A1C
            X.774 r40 = X.AnonymousClass773.A01(r10, r7)
            java.lang.String r7 = r6.A1V
            java.util.List r51 = X.AnonymousClass773.A05(r11, r2, r1, r4)
            r35 = r9
            r36 = r14
            r38 = r19
            r39 = r12
            r41 = r6
            r42 = r11
            r43 = r14
            r45 = r2
            r46 = r15
            r48 = r7
            r49 = r14
            r50 = r14
            r52 = r1
            r54 = r4
            r55 = r34
            r56 = r34
            r57 = r34
            r58 = r34
            r59 = r34
            r60 = r34
            X.7Fr r22 = X.AnonymousClass773.A04(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r23 = X.C3264276s.A00(r0)
            X.NYf r2 = new X.NYf
            r20 = r2
            r21 = r14
            r24 = r14
            r25 = r13
            r26 = r34
            r27 = r34
            r28 = r34
            r29 = r34
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1 = r17
            r1.add(r2)
            goto L_0x0051
        L_0x00e7:
            r4 = 1
            goto L_0x0067
        L_0x00ea:
            java.lang.Object r1 = X.00k.A0J(r18)
            X.3su r1 = (X.C254703su) r1
            if (r1 == 0) goto L_0x0313
            java.lang.String r2 = r1.A0g()
            if (r2 == 0) goto L_0x0313
            java.lang.String r1 = r3.A0g()
            boolean r2 = r2.equals(r1)
        L_0x0100:
            com.instagram.model.direct.messageid.DirectMessageIdentifier r93 = r3.A0V()
            X.7SD r1 = r0.A0G
            X.3t3 r1 = r1.A0P
            r15 = 0
            if (r1 == 0) goto L_0x030f
            java.lang.String r94 = X.C300965yF.A07(r1)
        L_0x010f:
            X.7SD r1 = r0.A0G
            int r7 = r1.A08
            r101 = r2 ^ 1
            X.2FW r4 = r3.A10
            X.0qQ.A0B(r4, r13)
            java.lang.String r2 = r3.A0h()
            java.lang.String r1 = r3.A0f()
            com.instagram.model.direct.messageid.MessageIdentifier r83 = X.C66580MXl.A0i(r2, r1)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r1 = r3.C7c()
            long r86 = r6.toMillis(r1)
            java.lang.String r23 = ""
            X.7FR r20 = new X.7FR
            r22 = r14
            r24 = r23
            r25 = r14
            r26 = r14
            r27 = r14
            r28 = r14
            r29 = r14
            r30 = r14
            r31 = r14
            r32 = r14
            r33 = r14
            r35 = r34
            r36 = r34
            r37 = r34
            r38 = r34
            r39 = r34
            r40 = r34
            r41 = r34
            r42 = r34
            r43 = r34
            r44 = r34
            r45 = r34
            r46 = r34
            r47 = r34
            r48 = r34
            r49 = r34
            r50 = r34
            r51 = r34
            r52 = r34
            r53 = r34
            r54 = r34
            r55 = r34
            r56 = r34
            r57 = r34
            r58 = r34
            r59 = r34
            r60 = r34
            r61 = r34
            r62 = r34
            r63 = r34
            r64 = r34
            r65 = r34
            r66 = r34
            r67 = r34
            r68 = r34
            r69 = r34
            r70 = r34
            r71 = r34
            r72 = r34
            r73 = r34
            r74 = r34
            r75 = r34
            r76 = r34
            r77 = r34
            r78 = r34
            r79 = r34
            r80 = r34
            r81 = r34
            r82 = r34
            r21 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82)
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r5)
            boolean r91 = r3.A1j(r1)
            X.7Bo r81 = X.C327627Bo.NUX_TYPE_NONE
            X.7FT r78 = new X.7FT
            r79 = r14
            r80 = r20
            r84 = r14
            r85 = r14
            r88 = r34
            r90 = r34
            r92 = r34
            r82 = r4
            r89 = r34
            r78.<init>(r79, r80, r81, r82, r83, r84, r85, r86, r88, r89, r90, r91, r92)
            r2 = 38
            r1 = r19
            X.0t0 r96 = X.C73916Plr.A00(r9, r1, r2)
            X.7Ft r4 = new X.7Ft
            r90 = r4
            r91 = r14
            r92 = r78
            r95 = r17
            r97 = r7
            r98 = r13
            r99 = r34
            r100 = r34
            r90.<init>(r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101)
            r1 = r109
            java.lang.String r17 = X.C66582MXn.A0s(r5, r3, r1)
            X.0qQ.A0A(r17)
            boolean r2 = r4.A06
            java.util.List r1 = r4.A04
            int r24 = r1.size()
            r16 = 1
            boolean r1 = X.C328477Ey.A00(r5, r0)
            r6 = 0
            if (r1 != 0) goto L_0x0212
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r5)
            boolean r1 = r3.A1j(r1)
            r7 = 0
            if (r1 == 0) goto L_0x0213
        L_0x0212:
            r7 = 1
        L_0x0213:
            if (r2 != 0) goto L_0x0217
            if (r7 == 0) goto L_0x0219
        L_0x0217:
            r6 = 8
        L_0x0219:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            X.7Fg r53 = X.C328527Fd.A08(r0, r1)
            X.7SD r10 = r0.A0G
            boolean r6 = r10.A0x
            r1 = r16
            boolean r10 = X.C308556Us.A0D(r5, r10, r1)
            boolean r1 = r3.A2P
            if (r10 != 0) goto L_0x0302
            if (r6 != r1) goto L_0x0304
        L_0x0231:
            r6 = 0
        L_0x0232:
            X.7Kz r13 = X.AnonymousClass7FB.A04(r8, r7)
            if (r2 == 0) goto L_0x02fc
            r49 = r14
        L_0x023a:
            boolean r1 = r12.A1W
            if (r1 == 0) goto L_0x024b
            boolean r1 = r3.A1S()
            if (r1 == 0) goto L_0x02f9
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0246:
            X.7AB r15 = new X.7AB
            r15.<init>(r1)
        L_0x024b:
            X.N3J r11 = r3.A0o
            X.7SD r1 = r0.A0G
            X.3t3 r1 = r1.A0P
            if (r11 == 0) goto L_0x02f5
            if (r1 == 0) goto L_0x02f5
            java.lang.String r10 = r3.A0g()
            java.lang.String r1 = X.C66580MXl.A0x(r1)
            X.7AF r52 = X.C328527Fd.A07(r9, r11, r10, r1)
        L_0x0261:
            if (r2 != 0) goto L_0x02f2
            X.0Tu r9 = X.0Tu.A05
            r1 = 36325287201485639(0x810da800023347, double:3.0355961241860606E-306)
            boolean r1 = X.182.A06(r9, r5, r1)
            if (r1 == 0) goto L_0x02f2
            X.7Kx r1 = r8.A04
            int r2 = r1.A0M
            int r1 = r1.A0N
            X.7SD r0 = r0.A0G
            X.3t3 r0 = r0.A0P
            java.lang.String r9 = r3.A0g()
            if (r9 == 0) goto L_0x02ef
            if (r0 == 0) goto L_0x02ef
            X.3t0 r0 = (X.C254763t0) r0
            java.lang.String r0 = r0.A00
            java.lang.String r20 = r3.A0f()
            java.lang.String r21 = r3.A0g()
            X.N8M r43 = new X.N8M
            r18 = r43
            r19 = r0
            r22 = r2
            r23 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24)
        L_0x029b:
            int r1 = r8.A00
            int r0 = r13.A00
            X.7Fl r2 = new X.7Fl
            r35 = r2
            r36 = r6
            r37 = r14
            r38 = r14
            r39 = r5
            r40 = r14
            r41 = r14
            r42 = r14
            r44 = r14
            r45 = r14
            r46 = r15
            r47 = r14
            r48 = r14
            r50 = r14
            r51 = r14
            r54 = r14
            r55 = r14
            r56 = r14
            r57 = r14
            r58 = r14
            r59 = r14
            r60 = r14
            r61 = r14
            r62 = r14
            r63 = r1
            r64 = r0
            r65 = r7
            r66 = r16
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)
            X.NaG r1 = new X.NaG
            r0 = r17
            r1.<init>(r2, r4, r0)
            java.lang.String r3 = r1.A02
            X.7Ft r2 = r1.A01
            X.7Fl r1 = r1.A00
            X.NaE r0 = new X.NaE
            r0.<init>(r1, r2, r3)
            return r0
        L_0x02ef:
            r43 = 0
            goto L_0x029b
        L_0x02f2:
            r43 = r14
            goto L_0x029b
        L_0x02f5:
            r52 = r14
            goto L_0x0261
        L_0x02f9:
            r1 = r14
            goto L_0x0246
        L_0x02fc:
            X.73b r49 = X.C328527Fd.A05(r9, r5, r0, r8)
            goto L_0x023a
        L_0x0302:
            if (r1 == 0) goto L_0x0231
        L_0x0304:
            X.7Kx r1 = r8.A04
            int r1 = r1.A0A
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>(r1)
            goto L_0x0232
        L_0x030f:
            r94 = r14
            goto L_0x010f
        L_0x0313:
            r2 = 1
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P7A.AWb(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7So, X.7L2, X.17i, boolean):X.2tL");
    }
}
