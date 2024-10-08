package X;

public final class P76 implements C328347El {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a0, code lost:
        if (r0.length() == 0) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C232262tL AWb(android.content.Context r52, com.instagram.common.session.UserSession r53, X.AnonymousClass9HC r54, X.C331837So r55, X.AnonymousClass7L2 r56, X.17i r57, boolean r58) {
        /*
            r51 = this;
            r4 = r55
            X.7LQ r4 = (X.AnonymousClass7LQ) r4
            r13 = 0
            r50 = r52
            r5 = r53
            r48 = r57
            r1 = r48
            r0 = r50
            boolean r10 = X.C51973G9u.A1b(r0, r5, r1)
            r1 = 3
            r15 = r54
            r49 = r56
            r0 = r49
            X.C51973G9u.A0r(r1, r0, r4, r15)
            X.PjU r0 = X.C73769PjU.A00
            X.0t0 r19 = X.AnonymousClass0eN.A01(r0)
            r8 = 0
            X.3su r3 = r4.A0e
            X.2FW r0 = r3.A10
            X.0qQ.A07(r0)
            r14 = r5
            r16 = r4
            r17 = r49
            r18 = r0
            X.7FE r20 = X.AnonymousClass7FD.A03(r14, r15, r16, r17, r18, r19)
            r6 = 0
            X.76s r0 = new X.76s
            r0.<init>(r6, r6, r6, r1)
            com.google.common.collect.ImmutableList r2 = r3.A0H()
            if (r2 != 0) goto L_0x0049
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r2)
        L_0x0049:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r2.iterator()
            r7 = 0
        L_0x0052:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r1 = r11.next()
            int r0 = r7 + 1
            if (r7 >= 0) goto L_0x0068
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0068:
            if (r7 <= 0) goto L_0x006d
            r9.add(r1)
        L_0x006d:
            r7 = r0
            goto L_0x0052
        L_0x006f:
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r9)
            java.util.Iterator r16 = r9.iterator()
        L_0x0077:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x014c
            java.lang.Object r1 = r16.next()
            X.3tC r1 = (X.C254873tC) r1
            X.7SD r9 = r4.A0G
            int r7 = r9.A08
            r0 = 29
            if (r7 != r0) goto L_0x0149
            boolean r14 = r9.A0n
        L_0x008d:
            java.lang.Object r7 = r2.get(r13)
            X.3tC r7 = (X.C254873tC) r7
            r0 = 2
            X.AnonymousClass7TF.A1E(r1, r0, r7)
            java.lang.String r0 = r1.A1N
            if (r0 == 0) goto L_0x00a2
            int r11 = r0.length()
            r9 = 0
            if (r11 != 0) goto L_0x00a3
        L_0x00a2:
            r9 = 1
        L_0x00a3:
            java.lang.String r40 = ""
            if (r9 == 0) goto L_0x013d
            java.lang.String r0 = r1.A0t
            if (r0 != 0) goto L_0x00ad
            r0 = r40
        L_0x00ad:
            com.instagram.model.direct.messageid.DirectMessageIdentifier r26 = r3.A0V()
            boolean r35 = X.C3266377o.A03(r5, r3)
            java.lang.String r9 = r3.A1u
            r18 = r9
            X.0qQ.A07(r18)
            com.instagram.user.model.User r9 = r4.A0K
            java.lang.String r29 = X.C51971G9r.A0t(r9)
            r9 = r50
            X.7FT r19 = X.C66580MXl.A0Y(r9, r5, r15, r4, r3)
            X.7SD r11 = r4.A0G
            X.3t3 r9 = r11.A0P
            r17 = r9
            int r9 = r11.A08
            r11 = r9
            java.util.List r47 = r1.A02()
            X.0qQ.A07(r47)
            X.774 r22 = new X.774
            r36 = r22
            r37 = r6
            r38 = r6
            r39 = r0
            r41 = r6
            r42 = r6
            r43 = r6
            r44 = r6
            r45 = r6
            r46 = r6
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            X.7SD r0 = r4.A0G
            X.3t3 r9 = r0.A0P
            int r0 = r0.A08
            java.util.List r33 = X.AnonymousClass773.A05(r7, r9, r0, r10)
            r24 = r1
            r25 = r6
            r27 = r17
            r28 = r18
            r30 = r6
            r31 = r6
            r32 = r6
            r34 = r11
            r36 = r14
            r37 = r13
            r38 = r13
            r39 = r13
            r40 = r13
            r41 = r13
            r42 = r13
            r17 = r50
            r18 = r6
            r21 = r15
            r23 = r3
            X.7Fr r9 = X.AnonymousClass773.A04(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.7SD r0 = r4.A0G
            java.lang.String r7 = r0.A0W
            java.util.List r0 = r0.A0b
            java.lang.Object r0 = r0.get(r13)
            java.lang.String r1 = X.DbS.A0q(r0)
            X.N8G r0 = new X.N8G
            r0.<init>(r9, r7, r1)
            r12.add(r0)
            goto L_0x0077
        L_0x013d:
            if (r0 != 0) goto L_0x0141
            r0 = r40
        L_0x0141:
            java.lang.String r9 = r1.A0t
            if (r9 == 0) goto L_0x00ad
            r40 = r9
            goto L_0x00ad
        L_0x0149:
            r14 = 1
            goto L_0x008d
        L_0x014c:
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r3.A0V()
            X.7Fw r11 = new X.7Fw
            r11.<init>(r0, r12)
            java.lang.String r0 = r3.A1u
            boolean r12 = X.C51966G9m.A1W(r5, r0)
            java.lang.String r1 = r11.A04
            if (r1 == 0) goto L_0x0196
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0196
            android.net.Uri r1 = X.0cp.A03(r1)
            java.lang.String r0 = "user_ids"
            java.lang.String r9 = r1.getQueryParameter(r0)
            if (r9 == 0) goto L_0x0196
            int r7 = r9.length()
            if (r7 == 0) goto L_0x0196
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            r2 = 0
        L_0x017c:
            if (r2 >= r7) goto L_0x018c
            char r1 = r9.charAt(r2)
            r0 = 44
            if (r1 != r0) goto L_0x0189
            r6.append(r1)
        L_0x0189:
            int r2 = r2 + 1
            goto L_0x017c
        L_0x018c:
            java.lang.String r0 = X.DbT.A10(r6)
            int r0 = r0.length()
            int r8 = r0 + 1
        L_0x0196:
            android.content.res.Resources r1 = r50.getResources()
            if (r12 == 0) goto L_0x01d7
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            if (r8 != r10) goto L_0x01a4
            r0 = 2131165205(0x7f070015, float:1.794462E38)
        L_0x01a4:
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r50.getResources()
            r0 = 2131165535(0x7f07015f, float:1.794529E38)
        L_0x01af:
            int r0 = r1.getDimensionPixelSize(r0)
            float r2 = (float) r2
            float r1 = (float) r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r2, r1)
            r1 = r58
            java.lang.String r2 = X.C66582MXn.A0s(r5, r3, r1)
            X.0qQ.A0A(r2)
            r12 = r50
            r13 = r0
            r14 = r5
            r16 = r4
            r17 = r49
            r18 = r48
            X.7Fl r1 = X.AnonymousClass7FX.A01(r12, r13, r14, r15, r16, r17, r18)
            X.N6Y r0 = new X.N6Y
            r0.<init>(r11, r1, r2)
            return r0
        L_0x01d7:
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            if (r8 != r10) goto L_0x01df
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
        L_0x01df:
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r50.getResources()
            r0 = 2131165461(0x7f070115, float:1.794514E38)
            goto L_0x01af
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P76.AWb(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7So, X.7L2, X.17i, boolean):X.2tL");
    }
}
