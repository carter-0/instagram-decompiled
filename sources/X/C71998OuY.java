package X;

import com.facebook.msys.mci.AuthData;

/* renamed from: X.OuY  reason: case insensitive filesystem */
public final class C71998OuY implements C74307Psh {
    public final /* synthetic */ AuthData A00;
    public final /* synthetic */ C68931NbA A01;

    public C71998OuY(AuthData authData, C68931NbA nbA) {
        this.A01 = nbA;
        this.A00 = authData;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ed, code lost:
        if (r9.size() <= 1) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a2, code lost:
        if (r0 == null) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01dd, code lost:
        if (r0 != null) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01e1, code lost:
        if (r0 == null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01e3, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e5, code lost:
        r63 = false;
        r54 = new X.C68179N3u(r55, "", r3, r0, (java.lang.String) null, (java.lang.String) null, r5, r4, 0, r6, r6, r66, r67);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object ABm(java.lang.Object r73, java.lang.Object r74, java.lang.Object r75, java.lang.Object r76) {
        /*
            r72 = this;
            r6 = r76
            r1 = r75
            r0 = r74
            r14 = r73
            com.instagram.direct.model.messaginguser.MessagingUser r14 = (com.instagram.direct.model.messaginguser.MessagingUser) r14
            X.NAq r0 = (X.C68329NAq) r0
            X.NAt r1 = (X.C68332NAt) r1
            X.3xP r6 = (X.C257443xP) r6
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            X.0qQ.A0A(r0)
            X.PCM r8 = new X.PCM
            r8.<init>(r0)
            X.0qQ.A0A(r1)
            X.OMF r0 = new X.OMF
            r0.<init>(r1)
            X.NAq r7 = r8.A00
            int r5 = X.C66580MXl.A04(r7)
            r2 = 0
            r4 = 0
        L_0x002c:
            r3 = r72
            if (r4 >= r5) goto L_0x007a
            X.NbA r10 = r3.A01
            X.0eM r10 = r10.A04
            java.lang.Object r10 = r10.getValue()
            X.17i r10 = (X.17i) r10
            com.facebook.msys.mci.AuthData r3 = r3.A00
            com.instagram.user.model.User r16 = X.C70882OPz.A00(r3, r8, r10, r4)
            if (r16 == 0) goto L_0x0077
            com.facebook.msys.mci.CQLResultSet r10 = r7.mResultSet
            r3 = 32
            boolean r18 = r10.getBoolean(r4, r3)
            com.facebook.msys.mci.CQLResultSet r10 = r7.mResultSet
            r3 = 33
            boolean r22 = r10.getBoolean(r4, r3)
            com.facebook.msys.mci.CQLResultSet r10 = r7.mResultSet
            r3 = 31
            boolean r23 = r10.getBoolean(r4, r3)
            r17 = 0
            X.N9q r3 = new X.N9q
            r15 = r3
            r19 = r2
            r20 = r2
            r21 = r2
            r24 = r2
            r25 = r2
            r26 = r2
            r27 = r2
            r28 = r2
            r29 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r9.add(r3)
        L_0x0077:
            int r4 = r4 + 1
            goto L_0x002c
        L_0x007a:
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r4 = 17
            int r34 = r5.getInteger(r2, r4)
            java.lang.String r23 = r0.A01()
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r4 = 4
            java.lang.String r5 = r5.getString(r2, r4)
            r20 = 0
            if (r5 == 0) goto L_0x0115
            r4 = -1
            com.instagram.model.mediasize.ExtendedImageUrl r11 = new com.instagram.model.mediasize.ExtendedImageUrl
            r11.<init>(r5, r4, r4)
        L_0x0097:
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r4 = 21
            boolean r46 = r5.getBoolean(r2, r4)
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r4 = 20
            boolean r47 = r5.getBoolean(r2, r4)
            java.util.Iterator r7 = r9.iterator()
        L_0x00ab:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0112
            java.lang.Object r5 = r7.next()
            r4 = r5
            X.N9q r4 = (X.C68303N9q) r4
            com.instagram.user.model.User r4 = r4.A00
            java.lang.String r4 = r4.getId()
            boolean r4 = r14.A03(r4)
            if (r4 == 0) goto L_0x00ab
        L_0x00c4:
            r7 = 1
            boolean r48 = X.AnonymousClass7TF.A1V(r5)
            X.NAt r0 = r0.A00
            com.facebook.msys.mci.CQLResultSet r4 = r0.mResultSet
            r0 = 32
            java.lang.Boolean r0 = r4.getNullableBoolean(r2, r0)
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            boolean r49 = X.C66581MXm.A1a(r0)
            X.NbA r0 = r3.A01
            com.instagram.direct.capabilities.Capabilities r4 = r0.A01
            X.9Gx r3 = X.C376179Gx.RTC_VIDEO_CALL
            boolean r3 = r4.A00(r3)
            if (r3 == 0) goto L_0x00ef
            int r3 = r9.size()
            r53 = 1
            if (r3 > r7) goto L_0x00f1
        L_0x00ef:
            r53 = 0
        L_0x00f1:
            java.util.ArrayList r27 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r9.iterator()
        L_0x00fd:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0118
            java.lang.Object r4 = r8.next()
            r3 = r4
            X.N9q r3 = (X.C68303N9q) r3
            boolean r3 = r3.A07
            if (r3 == 0) goto L_0x00fd
            r5.add(r4)
            goto L_0x00fd
        L_0x0112:
            r5 = r20
            goto L_0x00c4
        L_0x0115:
            r11 = r20
            goto L_0x0097
        L_0x0118:
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r5)
            java.util.Iterator r4 = r5.iterator()
        L_0x0120:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0136
            java.lang.Object r3 = r4.next()
            X.N9q r3 = (X.C68303N9q) r3
            com.instagram.user.model.User r3 = r3.A00
            java.lang.String r3 = r3.getId()
            r8.add(r3)
            goto L_0x0120
        L_0x0136:
            com.facebook.msys.mci.CQLResultSet r3 = r1.mResultSet
            long r3 = r3.getLong(r2, r2)
            java.lang.Long r5 = X.C66582MXn.A0m(r1, r2, r7)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r19 = X.C66580MXl.A0j(r5, r3)
            java.lang.Long r3 = X.C66582MXn.A0m(r1, r2, r7)
            java.lang.String r22 = java.lang.String.valueOf(r3)
            X.0qQ.A0A(r6)
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            r3 = 7
            java.lang.Long r4 = r4.getNullableLong(r2, r3)
            if (r4 == 0) goto L_0x02dc
            com.instagram.common.session.UserSession r0 = r0.A00
            X.2HN r0 = X.2HM.A00(r0)
            X.2HR r0 = r0.A0n
            java.lang.Object r0 = r0.A00()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x02dc
            boolean r0 = r6.A06()
            if (r0 == 0) goto L_0x01a4
            java.lang.Object r0 = r6.A03()
            X.0qQ.A07(r0)
            X.NBD r0 = (X.NBD) r0
            java.util.List r0 = X.OSX.A00(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0181:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02d9
            java.lang.Object r0 = r6.next()
            r4 = r0
            com.instagram.direct.model.DirectThreadThemeInfo r4 = (com.instagram.direct.model.DirectThreadThemeInfo) r4
            java.lang.String r5 = r4.A0o
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            java.lang.Long r4 = r4.getNullableLong(r2, r3)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 == 0) goto L_0x0181
        L_0x01a0:
            com.instagram.direct.model.DirectThreadThemeInfo r0 = (com.instagram.direct.model.DirectThreadThemeInfo) r0
            if (r0 != 0) goto L_0x01b1
        L_0x01a4:
            com.facebook.msys.mci.CQLResultSet r0 = r1.mResultSet
            java.lang.Long r0 = r0.getNullableLong(r2, r3)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            if (r4 != 0) goto L_0x02c5
            r0 = 0
        L_0x01b1:
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            java.lang.Long r3 = r4.getNullableLong(r2, r3)
            java.lang.String r55 = java.lang.String.valueOf(r3)
            if (r0 == 0) goto L_0x02ba
            int r6 = r0.A07
            java.util.List r3 = r0.A0s
            int[] r5 = com.instagram.direct.model.DirectThreadThemeInfo.A00(r3)
            java.util.List r3 = r0.A0q
            int[] r4 = com.instagram.direct.model.DirectThreadThemeInfo.A00(r3)
            int r66 = r0.A02()
            int r67 = r0.A01()
        L_0x01d3:
            java.lang.String r56 = ""
            if (r0 == 0) goto L_0x01db
            java.lang.String r3 = r0.A0n
            if (r3 != 0) goto L_0x01df
        L_0x01db:
            r3 = r56
            if (r0 == 0) goto L_0x01e3
        L_0x01df:
            java.lang.String r0 = r0.A0j
            if (r0 != 0) goto L_0x01e5
        L_0x01e3:
            r0 = r56
        L_0x01e5:
            X.N3u r18 = new X.N3u
            r54 = r18
            r57 = r3
            r58 = r0
            r59 = r20
            r60 = r20
            r61 = r5
            r62 = r4
            r63 = r2
            r64 = r6
            r65 = r6
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)
        L_0x01fe:
            com.facebook.msys.mci.CQLResultSet r3 = r1.mResultSet
            r0 = 25
            java.lang.String r3 = r3.getString(r2, r0)
            if (r3 == 0) goto L_0x0212
            java.lang.String r0 = X.C66580MXl.A0v(r1, r2, r0)
            if (r0 == 0) goto L_0x0303
            X.3t0 r20 = X.C66580MXl.A0g(r0)
        L_0x0212:
            com.facebook.msys.mci.CQLResultSet r3 = r1.mResultSet
            r0 = 5
            java.lang.Integer r0 = X.C66581MXm.A0o(r3, r2, r0)
            X.7Cl r17 = X.C327847Ck.A00(r0)
            com.facebook.msys.mci.CQLResultSet r3 = r1.mResultSet
            r0 = 30
            java.lang.Boolean r0 = r3.getNullableBoolean(r2, r0)
            if (r0 != 0) goto L_0x022b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x022b:
            boolean r43 = r0.booleanValue()
            com.facebook.msys.mci.CQLResultSet r1 = r1.mResultSet
            r0 = 31
            java.lang.Integer r36 = r1.getNullableInteger(r2, r0)
            if (r36 != 0) goto L_0x023d
            java.lang.Integer r36 = java.lang.Integer.valueOf(r2)
        L_0x023d:
            r12 = 0
            X.4li r16 = new X.4li
            r35 = r16
            r37 = r12
            r38 = r12
            r39 = r12
            r40 = r12
            r41 = r12
            r42 = r12
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)
            X.0qQ.A0A(r14)
            java.lang.String r24 = "INBOX"
            X.0sm r31 = X.0Yt.A0E()
            X.N4P r10 = new X.N4P
            r13 = r12
            r15 = r12
            r21 = r12
            r25 = r12
            r26 = r9
            r28 = r8
            r29 = r12
            r30 = r12
            r32 = r12
            r33 = r12
            r35 = r2
            r36 = r2
            r37 = r2
            r38 = r2
            r39 = r2
            r40 = r2
            r41 = r2
            r42 = r2
            r43 = r2
            r44 = r2
            r45 = r2
            r50 = r2
            r51 = r2
            r52 = r7
            r54 = r2
            r55 = r2
            r56 = r2
            r57 = r2
            r58 = r2
            r59 = r2
            r60 = r2
            r61 = r2
            r62 = r2
            r64 = r2
            r65 = r2
            r66 = r7
            r67 = r2
            r68 = r2
            r69 = r2
            r70 = r2
            r71 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)
            X.MgO r1 = new X.MgO
            r1.<init>(r10)
            X.PCn r0 = new X.PCn
            r0.<init>(r1)
            return r0
        L_0x02ba:
            r6 = 0
            int[] r5 = new int[r2]
            int[] r4 = new int[r2]
            r66 = 0
            r67 = 0
            goto L_0x01d3
        L_0x02c5:
            java.util.Map r0 = X.AnonymousClass6BI.A0f
            java.lang.Object r0 = r0.get(r4)
            com.instagram.direct.model.DirectThreadThemeInfo r0 = (com.instagram.direct.model.DirectThreadThemeInfo) r0
            if (r0 != 0) goto L_0x01b1
            com.google.common.collect.ImmutableMap r0 = X.AnonymousClass6BI.A00
            java.lang.Object r0 = r0.get(r4)
            com.instagram.direct.model.DirectThreadThemeInfo r0 = (com.instagram.direct.model.DirectThreadThemeInfo) r0
            goto L_0x01b1
        L_0x02d9:
            r0 = 0
            goto L_0x01a0
        L_0x02dc:
            java.lang.String r55 = ""
            int[] r3 = new int[r2]
            int[] r0 = new int[r2]
            X.N3u r18 = new X.N3u
            r54 = r18
            r56 = r55
            r57 = r55
            r58 = r55
            r59 = r20
            r60 = r20
            r61 = r3
            r62 = r0
            r63 = r2
            r64 = r2
            r65 = r2
            r66 = r2
            r67 = r2
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)
            goto L_0x01fe
        L_0x0303:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71998OuY.ABm(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
