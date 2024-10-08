package X;

public final class PCE implements C74335PtB {
    public final AnonymousClass9HC A00;
    public final AnonymousClass7L2 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r1 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0133, code lost:
        r12 = r12 - 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1 A[LOOP:3: B:36:0x00ab->B:38:0x00b1, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList AWi(android.content.Context r32, X.C61084JwM r33, X.C74541Pwa r34, com.instagram.direct.model.messaginguser.MessagingUser r35, X.OMF r36, X.C74552Pwl r37, X.C74552Pwl r38, java.util.Map r39, java.util.Set r40, java.util.Set r41) {
        /*
            r31 = this;
            r8 = 0
            r5 = 1
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            r6 = r37
            int r3 = r6.getCount()
            if (r3 < r5) goto L_0x0144
            boolean r26 = X.OPx.A01(r36)
            r15 = r31
            X.9HC r9 = r15.A00
            r2 = 4
            int r7 = r6.getCount()
            int r7 = r7 - r5
            r1 = -1
            X.2HZ r0 = new X.2HZ
            r0.<init>(r7, r8, r1)
            java.util.Iterator r7 = r0.iterator()
        L_0x0026:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0141
            java.lang.Object r1 = r7.next()
            int r0 = X.AnonymousClass7TE.A0M(r1)
            int r0 = r6.BSR(r0)
            if (r0 == r5) goto L_0x0026
        L_0x003a:
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x013e
            int r0 = r1.intValue()
            r1 = r35
            boolean r1 = X.C74552Pwl.A02(r1, r6, r0)
        L_0x0048:
            if (r26 != 0) goto L_0x004d
            r7 = 1
            if (r1 != 0) goto L_0x013b
        L_0x004d:
            r7 = 0
            if (r26 == 0) goto L_0x013b
            X.0eM r0 = r9.A0O
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x013b
            X.0eM r0 = r9.A0Q
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x0062
            if (r1 == 0) goto L_0x013b
        L_0x0062:
            r1 = 1
        L_0x0063:
            boolean r0 = X.C66580MXl.A1b(r40)
            if (r0 == 0) goto L_0x0144
            if (r7 != 0) goto L_0x006d
            if (r1 == 0) goto L_0x0144
        L_0x006d:
            if (r26 == 0) goto L_0x0077
            X.0eM r0 = r9.A0Q
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x0078
        L_0x0077:
            r5 = 0
        L_0x0078:
            java.util.List r1 = X.00k.A0a(r40)
            r0 = 24
            java.util.List r14 = X.C73429PcU.A00(r1, r0)
            java.util.LinkedHashMap r13 = X.AnonymousClass7TE.A1H()
            int r12 = X.C51966G9m.A06(r14)
            int r0 = r6.getCount()
            int r11 = r0 + -1
            r10 = r11
        L_0x0091:
            if (r12 < 0) goto L_0x00a7
            java.lang.Object r9 = r14.get(r12)
            X.9Iv r9 = (X.C376659Iv) r9
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r9.A00
            long r18 = r7.toMillis(r0)
        L_0x00a1:
            if (r10 < 0) goto L_0x0133
            if (r10 == r11) goto L_0x0111
            if (r5 != 0) goto L_0x0111
        L_0x00a7:
            java.util.Iterator r11 = X.AnonymousClass7TF.A0s(r13)
        L_0x00ab:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0144
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r11)
            java.lang.Object r0 = r1.getKey()
            int r9 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r10 = r1.getValue()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.String r17 = r6.BSF(r9)
            java.lang.String r7 = X.C71095OcV.A02(r6, r9)
            r0 = r6
            X.PCK r0 = (X.PCK) r0
            X.NBH r0 = r0.A00
            com.facebook.msys.mci.CQLResultSet r0 = r0.mResultSet
            java.lang.Long r0 = r0.getNullableLong(r9, r2)
            long r22 = X.DbY.A04(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "seen_indicator_{0}"
            java.lang.String r1 = java.text.MessageFormat.format(r0, r1)
            java.util.Set r18 = X.00k.A0k(r10)
            int r0 = r3 + -1
            boolean r29 = X.AnonymousClass7TF.A1S(r9, r0)
            X.7L2 r0 = r15.A01
            int r9 = r0.A00
            boolean r30 = r0.A00()
            X.0sl r19 = X.0sl.A00
            X.7Pc r0 = new X.7Pc
            r20 = r9
            r21 = r8
            r24 = r8
            r25 = r8
            r27 = r8
            r28 = r5
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            X.OTT.A00(r9, r1, r0, r7, r4)
            goto L_0x00ab
        L_0x0111:
            r0 = r6
            X.PCK r0 = (X.PCK) r0
            X.NBH r0 = r0.A00
            com.facebook.msys.mci.CQLResultSet r0 = r0.mResultSet
            java.lang.Long r0 = r0.getNullableLong(r10, r2)
            if (r0 == 0) goto L_0x0137
            long r16 = r0.longValue()
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x0137
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Object r0 = X.JTS.A0h(r0, r13)
            java.util.Collection r0 = (java.util.Collection) r0
            r0.add(r9)
        L_0x0133:
            int r12 = r12 + -1
            goto L_0x0091
        L_0x0137:
            int r10 = r10 + -1
            goto L_0x00a1
        L_0x013b:
            r1 = 0
            goto L_0x0063
        L_0x013e:
            r1 = 0
            goto L_0x0048
        L_0x0141:
            r1 = 0
            goto L_0x003a
        L_0x0144:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PCE.AWi(android.content.Context, X.JwM, X.Pwa, com.instagram.direct.model.messaginguser.MessagingUser, X.OMF, X.Pwl, X.Pwl, java.util.Map, java.util.Set, java.util.Set):java.util.ArrayList");
    }

    public PCE(AnonymousClass9HC r1, AnonymousClass7L2 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
