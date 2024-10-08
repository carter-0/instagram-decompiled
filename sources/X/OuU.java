package X;

public final class OuU implements Y9W {
    public final int A00;
    public final Object A01;

    public OuU(0sL r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dc, code lost:
        if (r5 != false) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r93, java.lang.Object r94) {
        /*
            r92 = this;
            r3 = r92
            r2 = r94
            r5 = r93
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0250;
                case 1: goto L_0x000b;
                case 2: goto L_0x01e9;
                case 3: goto L_0x0088;
                case 4: goto L_0x0025;
                case 5: goto L_0x0014;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r3.A01
            X.0sL r0 = (X.0sL) r0
            java.lang.Object r11 = r0.invoke(r5, r2)
            return r11
        L_0x0014:
            java.lang.Object r1 = r3.A01
            X.PPZ r1 = (X.PPZ) r1
            java.util.List r5 = (java.util.List) r5
            X.3xP r2 = (X.C257443xP) r2
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.util.List r11 = X.PPZ.A01(r2, r1, r5, r0)
            return r11
        L_0x0025:
            java.lang.Object r7 = r3.A01
            X.PPZ r7 = (X.PPZ) r7
            X.3xP r5 = (X.C257443xP) r5
            java.util.Map r2 = (java.util.Map) r2
            X.OLO r0 = r7.A07
            r0.getClass()
            java.lang.String r1 = r7.A02
            X.1aS r0 = r0.A01
            java.lang.Object r0 = r0.A0X()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = ""
        L_0x0040:
            boolean r0 = X.0mp.A0G(r1, r0)
            if (r0 == 0) goto L_0x007d
            java.util.Map r6 = r7.A0E
            r6.clear()
            boolean r0 = r7.A0H
            java.util.List r1 = X.PPZ.A00(r5, r7)
            if (r0 == 0) goto L_0x007a
            r0 = 0
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0q(r1, r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x005c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.instagram.model.direct.DirectSearchResult r0 = (com.instagram.model.direct.DirectSearchResult) r0
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            java.lang.Boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005c
            r4.add(r1)
            goto L_0x005c
        L_0x0079:
            r1 = r4
        L_0x007a:
            X.PPZ.A03(r6, r1)
        L_0x007d:
            java.util.concurrent.ConcurrentHashMap r0 = r7.A0F
            r0.putAll(r2)
            X.PPZ.A02(r7)
            java.util.List r11 = r7.A0B
            return r11
        L_0x0088:
            java.lang.Object r6 = r3.A01
            com.instagram.model.direct.threadkey.impl.MsysThreadId r6 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r6
            X.NAt r5 = (X.C68332NAt) r5
            X.5z0 r2 = (X.C301345z0) r2
            X.MYb r0 = X.MYb.A0M
            X.OMF r7 = new X.OMF
            r7.<init>(r5)
            r3 = 1
            X.0qQ.A0B(r2, r3)
            X.NAt r1 = r7.A00
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r0 = 0
            r4 = 6
            java.lang.Integer r4 = X.C66581MXm.A0o(r5, r0, r4)
            X.Mkq r4 = X.C67238MkY.A02(r4)
            int r5 = X.DbU.A02(r4, r0)
            r57 = 1
            if (r5 == r3) goto L_0x00b6
            r4 = 3
            if (r5 == r4) goto L_0x00b6
            r57 = 0
        L_0x00b6:
            boolean r58 = X.OPx.A01(r7)
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r4 = 10
            java.lang.String r31 = r5.getString(r0, r4)
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r4 = 9
            java.lang.Integer r28 = X.C66581MXm.A0o(r5, r0, r4)
            java.lang.String r32 = r7.A01()
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r4 = 3
            java.lang.String r4 = r5.getString(r0, r4)
            if (r4 == 0) goto L_0x00de
            boolean r5 = X.00l.A0W(r4)
            r4 = 0
            if (r5 == 0) goto L_0x00df
        L_0x00de:
            r4 = 1
        L_0x00df:
            r60 = r4 ^ 1
            int r47 = X.C66580MXl.A04(r2)
            com.instagram.direct.model.DirectThreadThemeInfo r21 = X.AnonymousClass6BI.A0D
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.List r8 = java.util.Collections.emptyList()
            java.util.List r7 = java.util.Collections.emptyList()
            com.facebook.msys.mci.CQLResultSet r2 = r1.mResultSet
            r4 = 13
            java.lang.Long r2 = r2.getNullableLong(r0, r4)
            if (r2 == 0) goto L_0x01e5
            com.facebook.msys.mci.CQLResultSet r2 = r1.mResultSet
            java.lang.Long r2 = r2.getNullableLong(r0, r4)
            java.lang.String r34 = r2.toString()
        L_0x0107:
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            r2 = 6
            java.lang.Integer r2 = X.C66581MXm.A0o(r4, r0, r2)
            X.Mkq r2 = X.C67238MkY.A02(r2)
            X.2EN r26 = X.C67238MkY.A01(r2)
            r12 = 0
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            r2 = 27
            java.lang.String r35 = r4.getString(r0, r2)
            java.util.HashMap r43 = X.AnonymousClass7TE.A1E()
            r2 = 2
            long[] r4 = new long[r2]
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r2 = 28
            java.lang.Long r5 = X.C66581MXm.A0q(r5, r0, r2)
            long r10 = r5.longValue()
            r4[r0] = r10
            java.lang.Long r2 = X.C66582MXn.A0m(r1, r0, r2)
            long r10 = r2.longValue()
            r4[r3] = r10
            android.os.Parcelable$Creator r2 = com.instagram.direct.capabilities.Capabilities.CREATOR
            com.instagram.direct.capabilities.Capabilities r18 = X.C376189Gz.A01(r4)
            com.facebook.msys.mci.CQLResultSet r2 = r1.mResultSet
            r1 = 12
            boolean r78 = r2.getBoolean(r0, r1)
            java.lang.Integer r29 = java.lang.Integer.valueOf(r0)
            X.4li r25 = new X.4li
            r25.<init>()
            r1 = 19
            X.0qQ.A0B(r9, r1)
            r1 = 20
            X.0qQ.A0B(r8, r1)
            r1 = 21
            X.0qQ.A0B(r7, r1)
            X.7SD r11 = new X.7SD
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r19 = r12
            r20 = r12
            r22 = r12
            r23 = r12
            r24 = r12
            r27 = r6
            r30 = r12
            r33 = r12
            r36 = r12
            r37 = r9
            r38 = r8
            r39 = r7
            r40 = r12
            r41 = r12
            r42 = r12
            r44 = r12
            r45 = r12
            r46 = r12
            r48 = r0
            r49 = r0
            r50 = r0
            r51 = r0
            r52 = r0
            r53 = r0
            r54 = r0
            r55 = r0
            r56 = r0
            r59 = r0
            r61 = r0
            r62 = r0
            r63 = r0
            r64 = r0
            r65 = r0
            r66 = r0
            r67 = r0
            r68 = r0
            r69 = r0
            r70 = r0
            r71 = r0
            r72 = r0
            r73 = r0
            r74 = r0
            r75 = r0
            r76 = r0
            r77 = r0
            r79 = r0
            r80 = r0
            r81 = r0
            r82 = r0
            r83 = r0
            r84 = r0
            r85 = r0
            r86 = r0
            r87 = r0
            r88 = r0
            r89 = r0
            r90 = r0
            r91 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91)
            return r11
        L_0x01e5:
            r34 = 0
            goto L_0x0107
        L_0x01e9:
            X.GAX r5 = (X.GAX) r5
            X.GAX r2 = (X.GAX) r2
            int r9 = r5.A01
            int r0 = r2.A01
            if (r9 != r0) goto L_0x01f9
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r2.A03
            if (r1 == r0) goto L_0x020f
        L_0x01f9:
            java.lang.Object r0 = r3.A01
            X.MhQ r0 = (X.C67053MhQ) r0
            com.instagram.common.session.UserSession r4 = r0.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36319201232952337(0x81081f00041c11, double:3.031747333179372E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x020f
            X.48z r11 = X.C2612848z.A00
            return r11
        L_0x020f:
            java.lang.Object r6 = r5.A03
            X.48q r6 = (X.C2611948q) r6
            int r0 = r5.A02
            int r10 = r2.A02
            int r10 = r10 + r0
            java.lang.Object r7 = r5.A04
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.Object r0 = r2.A04
            java.lang.Long r0 = (java.lang.Long) r0
            if (r7 == 0) goto L_0x024b
            if (r0 == 0) goto L_0x0234
            long r3 = r7.longValue()
            long r0 = r0.longValue()
            long r0 = java.lang.Math.min(r3, r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x0234:
            java.lang.Object r1 = r5.A05
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r0 = r2.A05
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashSet r8 = X.094.A00(r0, r1)
            X.GAX r5 = new X.GAX
            r5.<init>((X.C2611948q) r6, (java.lang.Long) r7, (java.util.Set) r8, (int) r9, (int) r10)
            X.3xQ r11 = new X.3xQ
            r11.<init>(r5)
            return r11
        L_0x024b:
            r7 = r0
            if (r0 != 0) goto L_0x0234
            r7 = 0
            goto L_0x0234
        L_0x0250:
            X.OOB r5 = (X.OOB) r5
            java.lang.Object r4 = r3.A01
            X.MtV r4 = (X.C67716MtV) r4
            X.NUN r3 = r4.A08
            java.lang.String r0 = "CONFIRM_PIN_SETUP_ATTEMPT"
            r3.A0B(r0)
            java.lang.String r1 = "SETUP_TYPE"
            java.lang.String r0 = "PIN_CODE"
            r3.A0D(r1, r0)
            X.0qQ.A0A(r5)
            X.0qQ.A0A(r2)
            X.Njv r0 = X.C69356Njv.A09
            X.ObS r3 = r5.A04(r0)
            r1 = 7
            X.OmL r0 = new X.OmL
            r0.<init>(r1, r4, r5, r2)
            r3.A04(r0)
            boolean r0 = r4.A0N
            if (r0 == 0) goto L_0x0286
            X.6oS r1 = X.C318116oQ.A00(r4)
            r0 = 30
            X.C66583MXo.A1O(r4, r1, r0)
        L_0x0286:
            X.0gF r11 = X.C60340gF.A00
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OuU.apply(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public OuU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
