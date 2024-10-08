package X;

/* renamed from: X.Es7  reason: case insensitive filesystem */
public abstract class C49264Es7 {
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0162 A[Catch:{ JSONException -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ae A[Catch:{ JSONException -> 0x01e2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A00(java.lang.String r18, java.lang.String r19, java.util.List r20, X.C368188sD r21) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r20.iterator()
        L_0x000c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r4.next()
            X.FEV r1 = (X.FEV) r1
            X.8s5 r0 = r1.A01
            X.DbU.A1X(r0, r3)
            X.8sI r0 = r1.A02
            X.DbU.A1X(r0, r2)
            goto L_0x000c
        L_0x0023:
            r7 = 0
            java.lang.String r5 = "waterfall_id"
            r6 = r18
            java.lang.String[] r0 = new java.lang.String[]{r5, r6}
            r4 = r21
            java.util.HashMap r9 = r4.A01(r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x006c
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x006c
            java.util.Iterator r8 = r3.iterator()
        L_0x0042:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.String r11 = X.AnonymousClass7TE.A18(r8)
            java.util.Iterator r1 = r2.iterator()
        L_0x0050:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r12 = r1.next()
            java.lang.String r12 = (java.lang.String) r12
            X.8sJ r10 = X.C368248sJ.REPLICATED_STORAGE_TARGET_APP_FETCH_START
            r13 = 0
            java.lang.Object r14 = r9.get(r5)
            java.lang.String r14 = (java.lang.String) r14
            r15 = r9
            r16 = r4
            X.C368188sD.A00(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0050
        L_0x006c:
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()     // Catch:{ JSONException -> 0x01e2 }
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ JSONException -> 0x01e2 }
            java.util.Iterator r11 = r20.iterator()     // Catch:{ JSONException -> 0x01e2 }
        L_0x007c:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x009a
            java.lang.Object r10 = r11.next()     // Catch:{ JSONException -> 0x01e2 }
            X.FEV r10 = (X.FEV) r10     // Catch:{ JSONException -> 0x01e2 }
            X.8s5 r0 = r10.A01     // Catch:{ JSONException -> 0x01e2 }
            java.lang.String r8 = r0.A01     // Catch:{ JSONException -> 0x01e2 }
            X.8sI r0 = r10.A02     // Catch:{ JSONException -> 0x01e2 }
            java.lang.String r1 = r0.A00     // Catch:{ JSONException -> 0x01e2 }
            java.lang.String r0 = r10.A00     // Catch:{ JSONException -> 0x01e2 }
            java.lang.String r0 = X.002.A0g(r8, r1, r0)     // Catch:{ JSONException -> 0x01e2 }
            r9.add(r0)     // Catch:{ JSONException -> 0x01e2 }
            goto L_0x007c
        L_0x009a:
            java.lang.String r0 = "access_library_shared_storage"
            X.0tX r11 = X.0xn.A01(r0)     // Catch:{ JSONException -> 0x01e2 }
            java.util.Iterator r12 = r9.iterator()     // Catch:{ JSONException -> 0x01e2 }
        L_0x00a4:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x00d7
            java.lang.String r10 = X.AnonymousClass7TE.A18(r12)     // Catch:{ JSONException -> 0x01e2 }
            java.util.Map r0 = r11.getAll()     // Catch:{ JSONException -> 0x01e2 }
            java.util.Iterator r9 = X.DbV.A16(r0)     // Catch:{ JSONException -> 0x01e2 }
        L_0x00b6:
            boolean r0 = r9.hasNext()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x00a4
            java.lang.String r8 = X.AnonymousClass7TE.A18(r9)     // Catch:{ JSONException -> 0x01e2 }
            if (r8 == 0) goto L_0x00b6
            r1 = 0
            boolean r0 = X.00l.A0d(r8, r10, r7)     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = r11.getString(r8, r1)     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x00b6
            X.F3S r0 = X.C49265Es8.A00(r0)     // Catch:{ JSONException -> 0x01e2 }
            r14.add(r0)     // Catch:{ JSONException -> 0x01e2 }
            goto L_0x00b6
        L_0x00d7:
            r14.isEmpty()     // Catch:{ JSONException -> 0x01e2 }
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()     // Catch:{ JSONException -> 0x01e2 }
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()     // Catch:{ JSONException -> 0x01e2 }
            java.util.Iterator r7 = r14.iterator()     // Catch:{ JSONException -> 0x01e2 }
        L_0x00e6:
            boolean r0 = r7.hasNext()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r1 = r7.next()     // Catch:{ JSONException -> 0x01e2 }
            X.F3S r1 = (X.F3S) r1     // Catch:{ JSONException -> 0x01e2 }
            X.8s5 r0 = r1.A04     // Catch:{ JSONException -> 0x01e2 }
            X.DbU.A1X(r0, r13)     // Catch:{ JSONException -> 0x01e2 }
            X.8sI r0 = r1.A05     // Catch:{ JSONException -> 0x01e2 }
            X.DbU.A1X(r0, r12)     // Catch:{ JSONException -> 0x01e2 }
            goto L_0x00e6
        L_0x00fd:
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x01e2 }
            boolean r0 = r14.isEmpty()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x0115
            java.lang.Integer r1 = X.AnonymousClass05K.A0N     // Catch:{ JSONException -> 0x01e2 }
        L_0x0109:
            java.lang.String[] r0 = new java.lang.String[]{r5, r6}     // Catch:{ JSONException -> 0x01e2 }
            java.util.HashMap r0 = r4.A01(r0)     // Catch:{ JSONException -> 0x01e2 }
            r4.A05(r1, r13, r12, r0)     // Catch:{ JSONException -> 0x01e2 }
            goto L_0x0157
        L_0x0115:
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()     // Catch:{ JSONException -> 0x01e2 }
            java.util.Iterator r15 = r14.iterator()     // Catch:{ JSONException -> 0x01e2 }
        L_0x011d:
            boolean r0 = r15.hasNext()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x014e
            java.lang.Object r1 = r15.next()     // Catch:{ JSONException -> 0x01e2 }
            X.F3S r1 = (X.F3S) r1     // Catch:{ JSONException -> 0x01e2 }
            java.lang.String r9 = java.lang.String.valueOf(r16)     // Catch:{ JSONException -> 0x01e2 }
            java.util.Map r8 = r1.A03     // Catch:{ JSONException -> 0x01e2 }
            java.lang.String r7 = "last_access_timestamp"
            java.lang.Object r0 = r8.get(r7)     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x013b
            java.lang.String r9 = X.DbT.A11(r7, r8)     // Catch:{ JSONException -> 0x01e2 }
        L_0x013b:
            long r7 = java.lang.Long.parseLong(r9)     // Catch:{ JSONException -> 0x01e2 }
            long r9 = r16 - r7
            r7 = 7344000000(0x1b5bc8c00, double:3.628418103E-314)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x011d
            r11.add(r1)     // Catch:{ JSONException -> 0x01e2 }
            goto L_0x011d
        L_0x014e:
            boolean r0 = r11.isEmpty()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x015a
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ JSONException -> 0x01e2 }
            goto L_0x0109
        L_0x0157:
            r18 = r14
            goto L_0x015c
        L_0x015a:
            r18 = r11
        L_0x015c:
            boolean r0 = r18.isEmpty()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 != 0) goto L_0x01a6
            java.lang.String[] r0 = new java.lang.String[]{r5, r6}     // Catch:{ JSONException -> 0x01e2 }
            java.util.HashMap r9 = r4.A01(r0)     // Catch:{ JSONException -> 0x01e2 }
            boolean r0 = r2.isEmpty()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 != 0) goto L_0x01a6
            boolean r0 = r3.isEmpty()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 != 0) goto L_0x01a6
            java.util.Iterator r8 = r3.iterator()     // Catch:{ JSONException -> 0x01e2 }
        L_0x017a:
            boolean r0 = r8.hasNext()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x01a6
            java.lang.String r11 = X.AnonymousClass7TE.A18(r8)     // Catch:{ JSONException -> 0x01e2 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ JSONException -> 0x01e2 }
        L_0x0188:
            boolean r0 = r7.hasNext()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x017a
            java.lang.Object r1 = r7.next()     // Catch:{ JSONException -> 0x01e2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x01e2 }
            X.8sJ r10 = X.C368248sJ.REPLICATED_STORAGE_TARGET_APP_FETCH_SUCCESS     // Catch:{ JSONException -> 0x01e2 }
            r13 = 0
            java.lang.Object r0 = r9.get(r5)     // Catch:{ JSONException -> 0x01e2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01e2 }
            r12 = r1
            r14 = r0
            r15 = r9
            r16 = r4
            X.C368188sD.A00(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ JSONException -> 0x01e2 }
            goto L_0x0188
        L_0x01a6:
            X.2LA r0 = X.AnonymousClass2LA.A02     // Catch:{ JSONException -> 0x01e2 }
            X.2LC r11 = r0.A00()     // Catch:{ JSONException -> 0x01e2 }
            if (r11 == 0) goto L_0x01ef
            java.util.Iterator r10 = r18.iterator()     // Catch:{ JSONException -> 0x01e2 }
        L_0x01b2:
            boolean r0 = r10.hasNext()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r0 = r10.next()     // Catch:{ JSONException -> 0x01e2 }
            X.F3S r0 = (X.F3S) r0     // Catch:{ JSONException -> 0x01e2 }
            java.lang.String r9 = r0.A02     // Catch:{ JSONException -> 0x01e2 }
            java.util.Iterator r8 = r3.iterator()     // Catch:{ JSONException -> 0x01e2 }
        L_0x01c4:
            boolean r0 = r8.hasNext()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x01b2
            java.lang.String r7 = X.AnonymousClass7TE.A18(r8)     // Catch:{ JSONException -> 0x01e2 }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ JSONException -> 0x01e2 }
        L_0x01d2:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x01e2 }
            if (r0 == 0) goto L_0x01c4
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)     // Catch:{ JSONException -> 0x01e2 }
            r12 = r19
            r11.A00(r7, r0, r9, r12)     // Catch:{ JSONException -> 0x01e2 }
            goto L_0x01d2
        L_0x01e2:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.String[] r0 = new java.lang.String[]{r5, r6}
            java.util.HashMap r0 = r4.A01(r0)
            r4.A05(r1, r3, r2, r0)
        L_0x01ef:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49264Es7.A00(java.lang.String, java.lang.String, java.util.List, X.8sD):java.util.ArrayList");
    }
}
