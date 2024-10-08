package X;

public abstract class RS9 {
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0269, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        X.1zE.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x026d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0285, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0286, code lost:
        X.1zE.A00(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0289, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x028c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x028d, code lost:
        X.1zE.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0290, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0293, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0294, code lost:
        X.1zE.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0297, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C21501Xd6 A00(X.1W6 r29, java.lang.String r30) {
        /*
            r0 = 0
            r2 = r29
            X.0qQ.A0B(r2, r0)
            java.lang.String r3 = "PRAGMA table_info(`"
            java.lang.String r1 = "`)"
            r0 = r30
            java.lang.String r0 = X.002.A0g(r3, r0, r1)
            android.database.Cursor r5 = r2.E5k(r0)
            java.lang.String r10 = "dflt_value"
            java.lang.String r9 = "pk"
            java.lang.String r4 = "notnull"
            java.lang.String r3 = "type"
            java.lang.String r28 = "name"
            int r0 = r5.getColumnCount()     // Catch:{ all -> 0x0291 }
            if (r0 > 0) goto L_0x002d
            X.0sm r27 = X.0Yt.A0E()     // Catch:{ all -> 0x0291 }
            goto L_0x007a
        L_0x002d:
            r0 = r28
            int r8 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x0291 }
            int r7 = r5.getColumnIndex(r3)     // Catch:{ all -> 0x0291 }
            int r6 = r5.getColumnIndex(r4)     // Catch:{ all -> 0x0291 }
            int r4 = r5.getColumnIndex(r9)     // Catch:{ all -> 0x0291 }
            int r3 = r5.getColumnIndex(r10)     // Catch:{ all -> 0x0291 }
            X.0Ym r0 = new X.0Ym     // Catch:{ all -> 0x0291 }
            r0.<init>()     // Catch:{ all -> 0x0291 }
        L_0x0048:
            boolean r9 = r5.moveToNext()     // Catch:{ all -> 0x0291 }
            if (r9 == 0) goto L_0x0076
            java.lang.String r10 = r5.getString(r8)     // Catch:{ all -> 0x0291 }
            java.lang.String r11 = r5.getString(r7)     // Catch:{ all -> 0x0291 }
            int r9 = r5.getInt(r6)     // Catch:{ all -> 0x0291 }
            boolean r15 = X.AnonymousClass7TF.A1P(r9)
            int r13 = r5.getInt(r4)     // Catch:{ all -> 0x0291 }
            java.lang.String r12 = r5.getString(r3)     // Catch:{ all -> 0x0291 }
            X.0qQ.A07(r10)     // Catch:{ all -> 0x0291 }
            X.0qQ.A07(r11)     // Catch:{ all -> 0x0291 }
            r14 = 2
            X.SJE r9 = new X.SJE     // Catch:{ all -> 0x0291 }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0291 }
            r0.put(r10, r9)     // Catch:{ all -> 0x0291 }
            goto L_0x0048
        L_0x0076:
            X.0Ym r27 = X.0se.A0N(r0)     // Catch:{ all -> 0x0291 }
        L_0x007a:
            r5.close()
            java.lang.String r3 = "PRAGMA foreign_key_list(`"
            r0 = r30
            java.lang.String r0 = X.002.A0g(r3, r0, r1)
            android.database.Cursor r3 = r2.E5k(r0)
            r7 = -1
            java.lang.String r8 = "on_update"
            java.lang.String r6 = "on_delete"
            java.lang.String r5 = "table"
            java.lang.String r4 = "seq"
            java.lang.String r0 = "id"
            int r18 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x028a }
            int r17 = r3.getColumnIndex(r4)     // Catch:{ all -> 0x028a }
            int r16 = r3.getColumnIndex(r5)     // Catch:{ all -> 0x028a }
            int r6 = r3.getColumnIndex(r6)     // Catch:{ all -> 0x028a }
            int r5 = r3.getColumnIndex(r8)     // Catch:{ all -> 0x028a }
            int r15 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x028a }
            int r14 = r3.getColumnIndex(r4)     // Catch:{ all -> 0x028a }
            java.lang.String r0 = "from"
            int r13 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x028a }
            java.lang.String r0 = "to"
            int r12 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x028a }
            X.01N r11 = X.0jo.A1H()     // Catch:{ all -> 0x028a }
        L_0x00c5:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x00ea
            int r10 = r3.getInt(r15)     // Catch:{ all -> 0x028a }
            int r9 = r3.getInt(r14)     // Catch:{ all -> 0x028a }
            java.lang.String r8 = r3.getString(r13)     // Catch:{ all -> 0x028a }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x028a }
            java.lang.String r4 = r3.getString(r12)     // Catch:{ all -> 0x028a }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x028a }
            X.TA8 r0 = new X.TA8     // Catch:{ all -> 0x028a }
            r0.<init>(r10, r9, r8, r4)     // Catch:{ all -> 0x028a }
            r11.add(r0)     // Catch:{ all -> 0x028a }
            goto L_0x00c5
        L_0x00ea:
            X.01N r0 = X.0jo.A1I(r11)     // Catch:{ all -> 0x028a }
            java.util.List r14 = X.00k.A0Z(r0)     // Catch:{ all -> 0x028a }
            r3.moveToPosition(r7)     // Catch:{ all -> 0x028a }
            X.01I r4 = new X.01I     // Catch:{ all -> 0x028a }
            r4.<init>()     // Catch:{ all -> 0x028a }
        L_0x00fa:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0174
            r0 = r17
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x028a }
            if (r0 != 0) goto L_0x00fa
            r0 = r18
            int r13 = r3.getInt(r0)     // Catch:{ all -> 0x028a }
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x028a }
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x028a }
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x028a }
            java.util.Iterator r11 = r14.iterator()     // Catch:{ all -> 0x028a }
        L_0x011e:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0133
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x028a }
            r0 = r10
            X.TA8 r0 = (X.TA8) r0     // Catch:{ all -> 0x028a }
            int r0 = r0.A00     // Catch:{ all -> 0x028a }
            if (r0 != r13) goto L_0x011e
            r12.add(r10)     // Catch:{ all -> 0x028a }
            goto L_0x011e
        L_0x0133:
            java.util.Iterator r11 = r12.iterator()     // Catch:{ all -> 0x028a }
        L_0x0137:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x014e
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x028a }
            X.TA8 r10 = (X.TA8) r10     // Catch:{ all -> 0x028a }
            java.lang.String r0 = r10.A02     // Catch:{ all -> 0x028a }
            r9.add(r0)     // Catch:{ all -> 0x028a }
            java.lang.String r0 = r10.A03     // Catch:{ all -> 0x028a }
            r8.add(r0)     // Catch:{ all -> 0x028a }
            goto L_0x0137
        L_0x014e:
            r0 = r16
            java.lang.String r20 = r3.getString(r0)     // Catch:{ all -> 0x028a }
            X.0qQ.A07(r20)     // Catch:{ all -> 0x028a }
            java.lang.String r21 = r3.getString(r6)     // Catch:{ all -> 0x028a }
            X.0qQ.A07(r21)     // Catch:{ all -> 0x028a }
            java.lang.String r22 = r3.getString(r5)     // Catch:{ all -> 0x028a }
            X.0qQ.A07(r22)     // Catch:{ all -> 0x028a }
            X.A9q r0 = new X.A9q     // Catch:{ all -> 0x028a }
            r19 = r0
            r23 = r9
            r24 = r8
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x028a }
            r4.add(r0)     // Catch:{ all -> 0x028a }
            goto L_0x00fa
        L_0x0174:
            X.01I r26 = X.0kH.A04(r4)     // Catch:{ all -> 0x028a }
            r3.close()
            java.lang.String r3 = "PRAGMA index_list(`"
            r0 = r30
            java.lang.String r0 = X.002.A0g(r3, r0, r1)
            android.database.Cursor r12 = r2.E5k(r0)
            java.lang.String r25 = "c"
            java.lang.String r4 = "unique"
            java.lang.String r3 = "origin"
            r24 = 1
            r23 = 0
            r0 = r28
            int r11 = r12.getColumnIndex(r0)     // Catch:{ all -> 0x0283 }
            int r10 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x0283 }
            int r9 = r12.getColumnIndex(r4)     // Catch:{ all -> 0x0283 }
            if (r11 == r7) goto L_0x0272
            if (r10 == r7) goto L_0x0272
            if (r9 == r7) goto L_0x0272
            X.01I r22 = new X.01I     // Catch:{ all -> 0x0283 }
            r22.<init>()     // Catch:{ all -> 0x0283 }
        L_0x01ac:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0283 }
            if (r0 == 0) goto L_0x026e
            java.lang.String r3 = r12.getString(r10)     // Catch:{ all -> 0x0283 }
            r0 = r25
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0283 }
            if (r0 == 0) goto L_0x01ac
            java.lang.String r13 = r12.getString(r11)     // Catch:{ all -> 0x0283 }
            int r3 = r12.getInt(r9)     // Catch:{ all -> 0x0283 }
            r0 = r24
            boolean r21 = X.AnonymousClass7TF.A1S(r3, r0)
            X.0qQ.A07(r13)     // Catch:{ all -> 0x0283 }
            java.lang.String r0 = "PRAGMA index_xinfo(`"
            java.lang.String r0 = X.002.A0g(r0, r13, r1)     // Catch:{ all -> 0x0283 }
            android.database.Cursor r8 = r2.E5k(r0)     // Catch:{ all -> 0x0283 }
            java.lang.String r20 = "DESC"
            java.lang.String r19 = "ASC"
            java.lang.String r4 = "desc"
            java.lang.String r3 = "cid"
            java.lang.String r0 = "seqno"
            int r14 = r8.getColumnIndex(r0)     // Catch:{ all -> 0x0267 }
            int r6 = r8.getColumnIndex(r3)     // Catch:{ all -> 0x0267 }
            r0 = r28
            int r5 = r8.getColumnIndex(r0)     // Catch:{ all -> 0x0267 }
            int r4 = r8.getColumnIndex(r4)     // Catch:{ all -> 0x0267 }
            if (r14 == r7) goto L_0x025a
            if (r6 == r7) goto L_0x025a
            if (r5 == r7) goto L_0x025a
            if (r4 == r7) goto L_0x025a
            java.util.TreeMap r18 = new java.util.TreeMap     // Catch:{ all -> 0x0267 }
            r18.<init>()     // Catch:{ all -> 0x0267 }
            java.util.TreeMap r17 = new java.util.TreeMap     // Catch:{ all -> 0x0267 }
            r17.<init>()     // Catch:{ all -> 0x0267 }
        L_0x0208:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0267 }
            if (r0 == 0) goto L_0x023c
            int r0 = r8.getInt(r6)     // Catch:{ all -> 0x0267 }
            if (r0 < 0) goto L_0x0208
            int r3 = r8.getInt(r14)     // Catch:{ all -> 0x0267 }
            java.lang.String r16 = r8.getString(r5)     // Catch:{ all -> 0x0267 }
            int r0 = r8.getInt(r4)     // Catch:{ all -> 0x0267 }
            r29 = r19
            if (r0 <= 0) goto L_0x0226
            r29 = r20
        L_0x0226:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0267 }
            X.0qQ.A07(r16)     // Catch:{ all -> 0x0267 }
            r15 = r18
            r0 = r16
            r15.put(r3, r0)     // Catch:{ all -> 0x0267 }
            r15 = r29
            r0 = r17
            r0.put(r3, r15)     // Catch:{ all -> 0x0267 }
            goto L_0x0208
        L_0x023c:
            java.util.Collection r0 = r18.values()     // Catch:{ all -> 0x0267 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0267 }
            java.util.List r4 = X.00k.A0a(r0)     // Catch:{ all -> 0x0267 }
            java.util.Collection r0 = r17.values()     // Catch:{ all -> 0x0267 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0267 }
            java.util.List r3 = X.00k.A0a(r0)     // Catch:{ all -> 0x0267 }
            X.S6D r5 = new X.S6D     // Catch:{ all -> 0x0267 }
            r0 = r21
            r5.<init>(r13, r4, r3, r0)     // Catch:{ all -> 0x0267 }
            goto L_0x025b
        L_0x025a:
            r5 = 0
        L_0x025b:
            r8.close()     // Catch:{ all -> 0x0283 }
            if (r5 == 0) goto L_0x0272
            r0 = r22
            r0.add(r5)     // Catch:{ all -> 0x0283 }
            goto L_0x01ac
        L_0x0267:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0269 }
        L_0x0269:
            r0 = move-exception
            X.1zE.A00(r8, r1)     // Catch:{ all -> 0x0283 }
            throw r0     // Catch:{ all -> 0x0283 }
        L_0x026e:
            X.01I r23 = X.0kH.A04(r22)     // Catch:{ all -> 0x0283 }
        L_0x0272:
            r12.close()
            X.Xd6 r4 = new X.Xd6
            r3 = r27
            r2 = r26
            r1 = r30
            r0 = r23
            r4.<init>(r1, r3, r2, r0)
            return r4
        L_0x0283:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0285 }
        L_0x0285:
            r1 = move-exception
            X.1zE.A00(r12, r0)
            throw r1
        L_0x028a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x028c }
        L_0x028c:
            r1 = move-exception
            X.1zE.A00(r3, r0)
            throw r1
        L_0x0291:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0293 }
        L_0x0293:
            r1 = move-exception
            X.1zE.A00(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RS9.A00(X.1W6, java.lang.String):X.Xd6");
    }
}
