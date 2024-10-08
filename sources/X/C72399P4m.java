package X;

/* renamed from: X.P4m  reason: case insensitive filesystem */
public final /* synthetic */ class C72399P4m implements AnonymousClass7B5 {
    public final /* synthetic */ C327367Am A00;

    public /* synthetic */ C72399P4m(C327367Am r1) {
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: X.74T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: X.74T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: X.74T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v1, resolved type: com.instagram.common.typedurl.ImageUrl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: X.74T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: X.74T} */
    /* JADX WARNING: type inference failed for: r29v3, types: [X.NZi] */
    /* JADX WARNING: type inference failed for: r27v4, types: [com.instagram.common.typedurl.ImageUrl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7FW AXV(android.content.Context r70, com.instagram.common.session.UserSession r71, X.AnonymousClass9HC r72, X.AnonymousClass7LQ r73, X.AnonymousClass7L2 r74, X.17i r75) {
        /*
            r69 = this;
            r1 = 1
            X.Pd6 r0 = new X.Pd6
            r0.<init>(r1)
            X.0t0 r11 = X.AnonymousClass0eN.A01(r0)
            r8 = r73
            X.3su r4 = r8.A0e
            X.2FW r10 = r4.A10
            r17 = 0
            r14 = 0
            r6 = r71
            r7 = r72
            r9 = r74
            X.7FE r26 = X.AnonymousClass7FD.A04(r6, r7, r8, r9, r10, r11)
            r5 = r70
            X.0qQ.A0B(r5, r14)
            X.AnonymousClass7TF.A1C(r6, r1, r7)
            X.17i r2 = X.17h.A00(r6)
            java.lang.String r0 = r4.A1u
            r2.A02(r0)
            X.3tC r0 = X.C3266377o.A00(r4)
            com.instagram.model.direct.messageid.DirectMessageIdentifier r35 = r4.A0V()
            boolean r16 = X.C3266377o.A03(r6, r4)
            java.lang.String r2 = r4.A1u
            X.0qQ.A07(r2)
            com.instagram.user.model.User r3 = r8.A0K
            java.lang.String r43 = X.C51971G9r.A0t(r3)
            X.7FT r25 = X.C66580MXl.A0Y(r5, r6, r7, r8, r4)
            X.7SD r3 = r8.A0G
            X.3t3 r3 = r3.A0P
            r36 = r3
            java.lang.String r3 = r4.A1V
            r20 = r3
            com.instagram.model.mediasize.GifUrlImpl r15 = r0.A0Z
            java.lang.String r4 = r0.A1N
            java.lang.String r3 = r0.A1L
            android.text.SpannableString r48 = X.AnonymousClass775.A00(r4, r3)
            r27 = 0
            if (r48 == 0) goto L_0x00d2
            java.lang.Integer r3 = r0.A0j
            if (r3 == 0) goto L_0x01ca
            int r3 = r3.intValue()
            if (r3 != r1) goto L_0x01ca
            int r3 = r7.A00
            java.lang.Integer r54 = java.lang.Integer.valueOf(r3)
        L_0x0071:
            java.lang.String r13 = r0.A1H
            X.17i r3 = X.17h.A00(r6)
            java.lang.String r4 = r48.toString()
            java.util.concurrent.ConcurrentMap r3 = r3.A02
            java.lang.Object r3 = r3.get(r4)
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            if (r3 == 0) goto L_0x0089
            com.instagram.common.typedurl.ImageUrl r27 = r3.Bh3()
        L_0x0089:
            X.3tE r12 = r0.A0P
            java.lang.String r3 = r0.A0t
            if (r3 == 0) goto L_0x01c7
            X.0eM r4 = r7.A0w
            boolean r4 = X.AnonymousClass7TF.A1Z(r4)
            if (r4 == 0) goto L_0x009b
            android.text.SpannableStringBuilder r3 = X.C66889MeU.A01(r3)
        L_0x009b:
            java.lang.String r11 = r0.A1L
            int r10 = r0.A07
            int r4 = r0.A06
            java.lang.Integer r55 = java.lang.Integer.valueOf(r4)
            java.lang.String r9 = r0.A1P
            java.lang.Integer r8 = r0.A0j
            java.lang.String r7 = r0.A1J
            java.lang.String r5 = r0.A1I
            com.instagram.model.mediasize.ExtendedImageUrl r4 = r0.A0Y
            int r6 = r0.A0A
            java.lang.Integer r57 = java.lang.Integer.valueOf(r6)
            X.74T r44 = new X.74T
            r45 = r27
            r46 = r4
            r47 = r12
            r49 = r13
            r50 = r3
            r51 = r11
            r52 = r7
            r53 = r5
            r56 = r8
            r58 = r9
            r59 = r10
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            r27 = r44
        L_0x00d2:
            java.lang.String r5 = r0.A0u
            if (r5 != 0) goto L_0x00d8
            java.lang.String r5 = ""
        L_0x00d8:
            r4 = 5
            X.9J6 r3 = new X.9J6
            r3.<init>(r5, r2, r4)
            com.instagram.model.mediasize.ExtendedImageUrl r2 = r0.A0X
            r29 = 0
            if (r2 != 0) goto L_0x0179
            int r2 = r0.A09
            if (r2 != r1) goto L_0x00ea
            X.NZi r29 = X.C68850NZi.A00
        L_0x00ea:
            java.util.List r1 = r0.A1d
            if (r1 != 0) goto L_0x0173
            r54 = 0
        L_0x00f0:
            X.3tD r12 = r0.A0Q
            X.0qQ.A07(r12)
            int r11 = r0.A00
            java.util.List r55 = r0.A02()
            int r10 = r0.A01
            java.lang.Long r9 = r0.A0m
            java.lang.String r8 = r0.A1N
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = r0.A0b
            boolean r59 = r5.equals(r1)
            int r7 = r0.A0B
            java.lang.Long r6 = r0.A0n
            java.lang.String r4 = r0.A1G
            java.lang.Long r2 = r0.A0o
            com.instagram.model.mediasize.ImageInfoImpl r1 = r0.A0a
            boolean r0 = r0.A1h
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r61 = r5.equals(r0)
            X.7Fr r16 = new X.7Fr
            r18 = r17
            r19 = r17
            r21 = r17
            r22 = r17
            r23 = r17
            r24 = r17
            r28 = r17
            r30 = r17
            r31 = r17
            r32 = r17
            r33 = r12
            r34 = r17
            r37 = r15
            r38 = r1
            r39 = r17
            r40 = r9
            r41 = r6
            r42 = r2
            r44 = r8
            r45 = r17
            r46 = r4
            r47 = r17
            r48 = r20
            r49 = r17
            r50 = r17
            r51 = r17
            r52 = r17
            r53 = r17
            r56 = r11
            r57 = r10
            r58 = r7
            r60 = r14
            r62 = r14
            r63 = r14
            r64 = r14
            r65 = r14
            r66 = r14
            r67 = r14
            r68 = r14
            r20 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)
            return r16
        L_0x0173:
            com.google.common.collect.ImmutableList r54 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            goto L_0x00f0
        L_0x0179:
            boolean r1 = r0.A05()
            if (r1 == 0) goto L_0x0183
            if (r16 != 0) goto L_0x0183
            goto L_0x00ea
        L_0x0183:
            int r1 = r2.getWidth()
            if (r1 <= 0) goto L_0x01c1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
        L_0x018d:
            int r1 = r2.getHeight()
            if (r1 <= 0) goto L_0x01bb
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
        L_0x0197:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = r0.A0e
            boolean r5 = r4.equals(r1)
            r4 = 2131238689(0x7f081f21, float:1.8093664E38)
            java.lang.String r1 = r0.A0x
            X.776 r29 = new X.776
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.Float r7 = X.C51967G9n.A0h()
            r4 = r29
            r5 = r2
            r11 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00ea
        L_0x01bb:
            r0.A03()
            r9 = r17
            goto L_0x0197
        L_0x01c1:
            r0.A03()
            r8 = r17
            goto L_0x018d
        L_0x01c7:
            r3 = 0
            goto L_0x009b
        L_0x01ca:
            r54 = r17
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72399P4m.AXV(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7L2, X.17i):X.7FW");
    }
}
