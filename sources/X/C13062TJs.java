package X;

/* renamed from: X.TJs  reason: case insensitive filesystem */
public final /* synthetic */ class C13062TJs implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C9144RQv A01;
    public final /* synthetic */ C10819Ryf A02;
    public final /* synthetic */ Runnable A03;

    public /* synthetic */ C13062TJs(C9144RQv rQv, C10819Ryf ryf, Runnable runnable, int i) {
        this.A02 = ryf;
        this.A01 = rQv;
        this.A00 = i;
        this.A03 = runnable;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v173, types: [X.RyL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v178, types: [X.RyL, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:208|(1:210)(1:211)|212|213|214|215|216|217|(2:218|(18:220|(1:222)(2:250|(1:252)(3:253|610|607))|223|(1:225)(1:226)|227|(1:229)(1:230)|231|(1:233)(1:234)|235|(1:237)|238|(1:240)|241|(1:243)|244|(1:246)|247|(3:249|609|607)(2:573|494))(1:608))|206) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:184|187|188|(1:190)|(1:192)|193|(1:195)(2:568|493)) */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0745, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0746, code lost:
        if (r15 != null) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0748, code lost:
        r2 = X.002.A0R("", " requestTimeMs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x074e, code lost:
        if (r14 != null) goto L_0x0756;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0750, code lost:
        r2 = X.002.A0R(r2, " requestUptimeMs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x075a, code lost:
        if (r2.isEmpty() == false) goto L_0x0acd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x075c, code lost:
        r10.add(new X.C8307Qnn(r11, r45, r46, r47, r9, r49, r51));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0969, code lost:
        r2 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x096d, code lost:
        if (r2 != 200) goto L_0x0979;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x096f, code lost:
        r0 = new X.C8312Qns(r6.A01, X.AnonymousClass05K.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x097b, code lost:
        if (r2 >= 500) goto L_0x0999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x097f, code lost:
        if (r2 == 404) goto L_0x0999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0983, code lost:
        if (r2 != 400) goto L_0x098f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0985, code lost:
        r0 = new X.C8312Qns(-1, X.AnonymousClass05K.A0N);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x098f, code lost:
        r0 = new X.C8312Qns(-1, X.AnonymousClass05K.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0999, code lost:
        r0 = new X.C8312Qns(-1, X.AnonymousClass05K.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x09cc, code lost:
        r0 = r27.A03();
        X.C12524SwA.A02(r0, r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:?, code lost:
        r1 = X.AnonymousClass7TE.A11("Null encodedPayload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:?, code lost:
        r0 = X.DbW.A0c("Missing required properties:", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0add, code lost:
        if (r22.iterator().hasNext() == false) goto L_0x0b4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0adf, code lost:
        r4 = X.002.A0R("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ", X.C12524SwA.A01(r22));
        r6 = r55.A03();
        X.AnonymousClass0fa.A01(r6, -1684447961);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:?, code lost:
        r4 = r6.compileStatement(r4);
        X.AnonymousClass0fa.A00(357671100);
        r4.execute();
        X.AnonymousClass0fa.A00(-1013668204);
        r8 = r6.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0b11, code lost:
        if (r8.moveToNext() == false) goto L_0x0b26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0b13, code lost:
        r4 = r55;
        r4.EAr(X.RJF.MAX_RETRIES_REACHED, r8.getString(1), (long) r8.getInt(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:?, code lost:
        r8.close();
        r2 = r6.compileStatement("DELETE FROM events WHERE num_attempts >= 16");
        X.AnonymousClass0fa.A00(257621068);
        r2.execute();
        X.AnonymousClass0fa.A00(1793396735);
        r6.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0b42, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0b43, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0b46, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:?, code lost:
        X.AnonymousClass0fa.A03(r6, 1571926387);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0b4c, code lost:
        r30.EAu(r29, r57.A06.C7E() + r16);
        r0.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:?, code lost:
        X.AnonymousClass0fa.A03(r0, 1896311136);
        r57.A02.EKM(r29, r19 + 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0b92, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0ba5, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0ba6, code lost:
        X.AnonymousClass0fa.A03(r6, -1029534431);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0bb5, code lost:
        r4 = r27.A03();
        X.C12524SwA.A02(r4, r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:?, code lost:
        r30.EAu(r29, r57.A06.C7E() + r16);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:187:0x04f4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:215:0x061a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:285:0x07d3 */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03fc A[Catch:{ all -> 0x0abf }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04ff A[Catch:{ TQF -> 0x0c21, all -> 0x0c33 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0507 A[Catch:{ TQF -> 0x0c21, all -> 0x0c33 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0513 A[Catch:{ TQF -> 0x0c21, all -> 0x0c33 }] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0930 A[Catch:{ all -> 0x0964, IOException -> 0x09a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x09d7 A[Catch:{ TQF -> 0x0c21, all -> 0x0c33 }] */
    /* JADX WARNING: Removed duplicated region for block: B:568:0x0b85 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:572:0x09cc A[EDGE_INSN: B:572:0x09cc->B:407:0x09cc ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:600:0x0403 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:612:0x0969 A[EDGE_INSN: B:612:0x0969->B:387:0x0969 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:285:0x07d3=Splitter:B:285:0x07d3, B:187:0x04f4=Splitter:B:187:0x04f4, B:215:0x061a=Splitter:B:215:0x061a, B:526:0x0bdd=Splitter:B:526:0x0bdd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r58 = this;
            r1 = r58
            X.Ryf r0 = r1.A02
            r57 = r0
            X.RQv r0 = r1.A01
            r29 = r0
            int r0 = r1.A00
            r19 = r0
            java.lang.Runnable r0 = r1.A03
            r56 = r0
            r0 = r57
            X.Tam r0 = r0.A05     // Catch:{ TQF -> 0x0c21 }
            r27 = r0
            r0 = r57
            X.TmX r0 = r0.A04     // Catch:{ TQF -> 0x0c21 }
            r30 = r0
            r30.getClass()     // Catch:{ TQF -> 0x0c21 }
            r0 = r27
            X.SwA r0 = (X.C12524SwA) r0     // Catch:{ TQF -> 0x0c21 }
            r27 = r0
            android.database.sqlite.SQLiteDatabase r8 = r27.A03()     // Catch:{ TQF -> 0x0c21 }
            X.C12524SwA.A02(r8, r0)     // Catch:{ TQF -> 0x0c21 }
            r0 = r30
            X.SwA r0 = (X.C12524SwA) r0     // Catch:{ all -> 0x0c11 }
            r55 = r0
            X.Tdy r0 = r0.A03     // Catch:{ all -> 0x0c11 }
            long r2 = r0.C7E()     // Catch:{ all -> 0x0c11 }
            r0 = r55
            X.RkZ r0 = r0.A01     // Catch:{ all -> 0x0c11 }
            r25 = r0
            r0 = r25
            X.Qnv r0 = (X.C8315Qnv) r0     // Catch:{ all -> 0x0c11 }
            r25 = r0
            long r0 = r0.A03     // Catch:{ all -> 0x0c11 }
            long r2 = r2 - r0
            android.database.sqlite.SQLiteDatabase r9 = r55.A03()     // Catch:{ all -> 0x0c11 }
            r24 = -1684447961(0xffffffff9b995d27, float:-2.5371925E-22)
            r0 = r24
            X.AnonymousClass0fa.A01(r9, r0)     // Catch:{ all -> 0x0c11 }
            r10 = 1
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0c09 }
            r1 = 0
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0c09 }
            java.lang.String r0 = "SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name"
            android.database.Cursor r6 = r9.rawQuery(r0, r7)     // Catch:{ all -> 0x0c09 }
        L_0x0065:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0c04 }
            if (r0 == 0) goto L_0x007c
            int r0 = r6.getInt(r1)     // Catch:{ all -> 0x0c04 }
            java.lang.String r5 = r6.getString(r10)     // Catch:{ all -> 0x0c04 }
            long r2 = (long) r0     // Catch:{ all -> 0x0c04 }
            X.RJF r4 = X.RJF.MESSAGE_TOO_OLD     // Catch:{ all -> 0x0c04 }
            r0 = r55
            r0.EAr(r4, r5, r2)     // Catch:{ all -> 0x0c04 }
            goto L_0x0065
        L_0x007c:
            r6.close()     // Catch:{ all -> 0x0c09 }
            java.lang.String r26 = "events"
            java.lang.String r2 = "timestamp_ms < ?"
            r0 = r26
            r9.delete(r0, r2, r7)     // Catch:{ all -> 0x0c09 }
            r9.setTransactionSuccessful()     // Catch:{ all -> 0x0c09 }
            r0 = 1571926387(0x5db1b173, float:1.60051771E18)
            X.AnonymousClass0fa.A03(r9, r0)     // Catch:{ all -> 0x0c11 }
            r8.setTransactionSuccessful()     // Catch:{ all -> 0x0c11 }
            r28 = 1896311136(0x71076960, float:6.705259E29)
            r0 = r28
            X.AnonymousClass0fa.A03(r8, r0)     // Catch:{ TQF -> 0x0c21 }
            r0 = r57
            android.content.Context r2 = r0.A00     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch:{ TQF -> 0x0c21 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ TQF -> 0x0c21 }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ TQF -> 0x0c21 }
            if (r0 == 0) goto L_0x0bdd
            boolean r0 = r0.isConnected()     // Catch:{ TQF -> 0x0c21 }
            if (r0 == 0) goto L_0x0bdd
            r0 = r57
            X.Tdt r2 = r0.A01     // Catch:{ TQF -> 0x0c21 }
            r0 = r29
            X.Qnr r0 = (X.C8311Qnr) r0     // Catch:{ TQF -> 0x0c21 }
            r54 = r0
            java.lang.String r0 = r0.A01     // Catch:{ TQF -> 0x0c21 }
            X.Tdu r18 = r2.AX5(r0)     // Catch:{ TQF -> 0x0c21 }
            r16 = 0
        L_0x00c7:
            android.database.sqlite.SQLiteDatabase r4 = r27.A03()     // Catch:{ TQF -> 0x0c21 }
            r0 = r27
            X.C12524SwA.A02(r4, r0)     // Catch:{ TQF -> 0x0c21 }
            android.database.sqlite.SQLiteDatabase r3 = r55.A03()     // Catch:{ all -> 0x0bfc }
            r0 = r24
            X.AnonymousClass0fa.A01(r3, r0)     // Catch:{ all -> 0x0bfc }
            r0 = r29
            java.lang.Long r0 = X.C12524SwA.A00(r3, r0)     // Catch:{ all -> 0x0bd5 }
            if (r0 != 0) goto L_0x00e9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0bd5 }
        L_0x00e5:
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x0bd5 }
            goto L_0x0107
        L_0x00e9:
            android.database.sqlite.SQLiteDatabase r5 = r55.A03()     // Catch:{ all -> 0x0bd5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0bd5 }
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0bd5 }
            java.lang.String r0 = "SELECT 1 FROM events WHERE context_id = ? LIMIT 1"
            android.database.Cursor r5 = r5.rawQuery(r0, r2)     // Catch:{ all -> 0x0bd5 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0bd0 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0bd0 }
            r5.close()     // Catch:{ all -> 0x0bd5 }
            goto L_0x00e5
        L_0x0107:
            r23 = 1571926387(0x5db1b173, float:1.60051771E18)
            r0 = r23
            X.AnonymousClass0fa.A03(r3, r0)     // Catch:{ all -> 0x0bfc }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x0bfc }
            r0 = r28
            X.AnonymousClass0fa.A03(r4, r0)     // Catch:{ TQF -> 0x0c21 }
            boolean r0 = r2.booleanValue()     // Catch:{ TQF -> 0x0c21 }
            if (r0 == 0) goto L_0x0bb5
            android.database.sqlite.SQLiteDatabase r0 = r27.A03()     // Catch:{ TQF -> 0x0c21 }
            r2 = r27
            X.C12524SwA.A02(r0, r2)     // Catch:{ TQF -> 0x0c21 }
            android.database.sqlite.SQLiteDatabase r10 = r55.A03()     // Catch:{ all -> 0x0bad }
            r2 = r24
            X.AnonymousClass0fa.A01(r10, r2)     // Catch:{ all -> 0x0bad }
            java.util.ArrayList r22 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0b9d }
            r2 = r29
            java.lang.Long r2 = X.C12524SwA.A00(r10, r2)     // Catch:{ all -> 0x0b9d }
            if (r2 == 0) goto L_0x0245
            java.lang.String r34 = "_id"
            java.lang.String r35 = "transport_name"
            r33 = 1
            r32 = 2
            java.lang.String r36 = "timestamp_ms"
            r31 = 3
            java.lang.String r37 = "uptime_ms"
            r21 = 4
            java.lang.String r38 = "payload_encoding"
            r20 = 5
            java.lang.String r39 = "payload"
            r12 = 6
            java.lang.String r40 = "code"
            r15 = 7
            java.lang.String r41 = "inline"
            java.lang.String[] r36 = new java.lang.String[]{r34, r35, r36, r37, r38, r39, r40, r41}     // Catch:{ all -> 0x0b9d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0b9d }
            java.lang.String[] r38 = new java.lang.String[]{r2}     // Catch:{ all -> 0x0b9d }
            r39 = 0
            r2 = r25
            int r2 = r2.A01     // Catch:{ all -> 0x0b9d }
            java.lang.String r42 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0b9d }
            java.lang.String r37 = "context_id = ?"
            r34 = r10
            r35 = r26
            r40 = r39
            r41 = r39
            android.database.Cursor r3 = r34.query(r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0b9d }
        L_0x0180:
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x0b98 }
            if (r2 == 0) goto L_0x0242
            r6 = 0
            long r13 = r3.getLong(r1)     // Catch:{ all -> 0x0b98 }
            int r2 = r3.getInt(r15)     // Catch:{ all -> 0x0b98 }
            if (r2 == 0) goto L_0x0192
            r6 = 1
        L_0x0192:
            r42 = 0
            java.util.HashMap r46 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0b98 }
            r2 = r33
            java.lang.String r45 = r3.getString(r2)     // Catch:{ all -> 0x0b98 }
            if (r45 == 0) goto L_0x0a9b
            r2 = r32
            long r4 = r3.getLong(r2)     // Catch:{ all -> 0x0b98 }
            java.lang.Long r43 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0b98 }
            r2 = r31
            long r4 = r3.getLong(r2)     // Catch:{ all -> 0x0b98 }
            java.lang.Long r44 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0b98 }
            r2 = r21
            java.lang.String r4 = r3.getString(r2)     // Catch:{ all -> 0x0b98 }
            if (r4 != 0) goto L_0x01bf
            X.S5K r2 = X.C12524SwA.A05     // Catch:{ all -> 0x0b98 }
            goto L_0x01c4
        L_0x01bf:
            X.S5K r2 = new X.S5K     // Catch:{ all -> 0x0b98 }
            r2.<init>(r4)     // Catch:{ all -> 0x0b98 }
        L_0x01c4:
            if (r6 == 0) goto L_0x01c7
            goto L_0x0215
        L_0x01c7:
            android.database.sqlite.SQLiteDatabase r34 = r55.A03()     // Catch:{ all -> 0x0b98 }
            java.lang.String r4 = "bytes"
            java.lang.String[] r36 = new java.lang.String[]{r4}     // Catch:{ all -> 0x0b98 }
            java.lang.String r4 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0b98 }
            java.lang.String[] r38 = new java.lang.String[]{r4}     // Catch:{ all -> 0x0b98 }
            java.lang.String r35 = "event_payloads"
            java.lang.String r37 = "event_id = ?"
            java.lang.String r41 = "sequence_num"
            android.database.Cursor r11 = r34.query(r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0b98 }
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0a96 }
            r5 = 0
        L_0x01e9:
            boolean r4 = r11.moveToNext()     // Catch:{ all -> 0x0a96 }
            if (r4 == 0) goto L_0x01f9
            byte[] r4 = r11.getBlob(r1)     // Catch:{ all -> 0x0a96 }
            r9.add(r4)     // Catch:{ all -> 0x0a96 }
            int r4 = r4.length     // Catch:{ all -> 0x0a96 }
            int r5 = r5 + r4
            goto L_0x01e9
        L_0x01f9:
            byte[] r8 = new byte[r5]     // Catch:{ all -> 0x0a96 }
            r7 = 0
            r6 = 0
        L_0x01fd:
            int r4 = r9.size()     // Catch:{ all -> 0x0a96 }
            if (r7 >= r4) goto L_0x0211
            java.lang.Object r5 = r9.get(r7)     // Catch:{ all -> 0x0a96 }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x0a96 }
            int r4 = r5.length     // Catch:{ all -> 0x0a96 }
            java.lang.System.arraycopy(r5, r1, r8, r6, r4)     // Catch:{ all -> 0x0a96 }
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L_0x01fd
        L_0x0211:
            r11.close()     // Catch:{ all -> 0x0b98 }
            goto L_0x021b
        L_0x0215:
            r4 = r20
            byte[] r8 = r3.getBlob(r4)     // Catch:{ all -> 0x0b98 }
        L_0x021b:
            X.S5i r4 = new X.S5i     // Catch:{ all -> 0x0b98 }
            r4.<init>(r2, r8)     // Catch:{ all -> 0x0b98 }
            boolean r2 = r3.isNull(r12)     // Catch:{ all -> 0x0b98 }
            if (r2 != 0) goto L_0x022e
            int r2 = r3.getInt(r12)     // Catch:{ all -> 0x0b98 }
            java.lang.Integer r42 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0b98 }
        L_0x022e:
            r41 = r4
            X.Qnq r5 = X.C9688Rf6.A00(r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x0b98 }
            X.Qnw r4 = new X.Qnw     // Catch:{ all -> 0x0b98 }
            r2 = r29
            r4.<init>(r5, r2, r13)     // Catch:{ all -> 0x0b98 }
            r2 = r22
            r2.add(r4)     // Catch:{ all -> 0x0b98 }
            goto L_0x0180
        L_0x0242:
            r3.close()     // Catch:{ all -> 0x0b9d }
        L_0x0245:
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0b9d }
            java.lang.String r2 = "event_id IN ("
            java.lang.StringBuilder r5 = X.Pxe.A16(r2)     // Catch:{ all -> 0x0b9d }
            r4 = 0
        L_0x0250:
            int r2 = r22.size()     // Catch:{ all -> 0x0b9d }
            r20 = 1
            if (r4 >= r2) goto L_0x0277
            r2 = r22
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x0b9d }
            X.RLt r2 = (X.C9018RLt) r2     // Catch:{ all -> 0x0b9d }
            X.Qnw r2 = (X.C8316Qnw) r2     // Catch:{ all -> 0x0b9d }
            long r2 = r2.A00     // Catch:{ all -> 0x0b9d }
            r5.append(r2)     // Catch:{ all -> 0x0b9d }
            int r2 = r22.size()     // Catch:{ all -> 0x0b9d }
            int r2 = r2 - r20
            if (r4 >= r2) goto L_0x0274
            r2 = 44
            r5.append(r2)     // Catch:{ all -> 0x0b9d }
        L_0x0274:
            int r4 = r4 + 1
            goto L_0x0250
        L_0x0277:
            r2 = 41
            r5.append(r2)     // Catch:{ all -> 0x0b9d }
            r14 = 3
            java.lang.String r6 = "event_id"
            java.lang.String r3 = "name"
            r4 = 2
            java.lang.String r2 = "value"
            java.lang.String[] r33 = new java.lang.String[]{r6, r3, r2}     // Catch:{ all -> 0x0b9d }
            java.lang.String r34 = r5.toString()     // Catch:{ all -> 0x0b9d }
            r21 = 0
            java.lang.String r32 = "event_metadata"
            r31 = r10
            r35 = r21
            r36 = r21
            r37 = r21
            r38 = r21
            android.database.Cursor r7 = r31.query(r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0b9d }
        L_0x02a0:
            boolean r2 = r7.moveToNext()     // Catch:{ all -> 0x0b93 }
            if (r2 == 0) goto L_0x02d0
            long r2 = r7.getLong(r1)     // Catch:{ all -> 0x0b93 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0b93 }
            java.lang.Object r6 = r9.get(r2)     // Catch:{ all -> 0x0b93 }
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x0b93 }
            if (r6 != 0) goto L_0x02bd
            java.util.HashSet r6 = X.AnonymousClass7TE.A1F()     // Catch:{ all -> 0x0b93 }
            r9.put(r2, r6)     // Catch:{ all -> 0x0b93 }
        L_0x02bd:
            r2 = r20
            java.lang.String r5 = r7.getString(r2)     // Catch:{ all -> 0x0b93 }
            java.lang.String r3 = r7.getString(r4)     // Catch:{ all -> 0x0b93 }
            X.RsX r2 = new X.RsX     // Catch:{ all -> 0x0b93 }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0b93 }
            r6.add(r2)     // Catch:{ all -> 0x0b93 }
            goto L_0x02a0
        L_0x02d0:
            r7.close()     // Catch:{ all -> 0x0b9d }
            java.util.ListIterator r13 = r22.listIterator()     // Catch:{ all -> 0x0b9d }
        L_0x02d7:
            boolean r2 = r13.hasNext()     // Catch:{ all -> 0x0b9d }
            if (r2 == 0) goto L_0x0346
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x0b9d }
            X.RLt r12 = (X.C9018RLt) r12     // Catch:{ all -> 0x0b9d }
            X.Qnw r12 = (X.C8316Qnw) r12     // Catch:{ all -> 0x0b9d }
            long r2 = r12.A00     // Catch:{ all -> 0x0b9d }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0b9d }
            boolean r4 = r9.containsKey(r11)     // Catch:{ all -> 0x0b9d }
            if (r4 == 0) goto L_0x02d7
            X.RQu r8 = r12.A01     // Catch:{ all -> 0x0b9d }
            X.Qnq r8 = (X.C8310Qnq) r8     // Catch:{ all -> 0x0b9d }
            java.lang.String r7 = r8.A04     // Catch:{ all -> 0x0b9d }
            if (r7 == 0) goto L_0x0aaa
            java.lang.Integer r15 = r8.A03     // Catch:{ all -> 0x0b9d }
            X.S5i r6 = r8.A02     // Catch:{ all -> 0x0b9d }
            if (r6 == 0) goto L_0x0aa2
            long r4 = r8.A00     // Catch:{ all -> 0x0b9d }
            java.lang.Long r33 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0b9d }
            long r4 = r8.A01     // Catch:{ all -> 0x0b9d }
            java.lang.Long r34 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0b9d }
            java.util.Map r4 = r8.A05     // Catch:{ all -> 0x0b9d }
            java.util.HashMap r5 = X.Pxe.A19(r4)     // Catch:{ all -> 0x0b9d }
            java.lang.Object r4 = r9.get(r11)     // Catch:{ all -> 0x0b9d }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x0b9d }
            java.util.Iterator r11 = r4.iterator()     // Catch:{ all -> 0x0b9d }
        L_0x031b:
            boolean r4 = r11.hasNext()     // Catch:{ all -> 0x0b9d }
            if (r4 == 0) goto L_0x032f
            java.lang.Object r4 = r11.next()     // Catch:{ all -> 0x0b9d }
            X.RsX r4 = (X.C10456RsX) r4     // Catch:{ all -> 0x0b9d }
            java.lang.String r8 = r4.A00     // Catch:{ all -> 0x0b9d }
            java.lang.String r4 = r4.A01     // Catch:{ all -> 0x0b9d }
            r5.put(r8, r4)     // Catch:{ all -> 0x0b9d }
            goto L_0x031b
        L_0x032f:
            X.RQv r4 = r12.A02     // Catch:{ all -> 0x0b9d }
            r31 = r6
            r32 = r15
            r35 = r7
            r36 = r5
            X.Qnq r6 = X.C9688Rf6.A00(r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0b9d }
            X.Qnw r5 = new X.Qnw     // Catch:{ all -> 0x0b9d }
            r5.<init>(r6, r4, r2)     // Catch:{ all -> 0x0b9d }
            r13.set(r5)     // Catch:{ all -> 0x0b9d }
            goto L_0x02d7
        L_0x0346:
            r10.setTransactionSuccessful()     // Catch:{ all -> 0x0b9d }
            r2 = r23
            X.AnonymousClass0fa.A03(r10, r2)     // Catch:{ all -> 0x0bad }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0bad }
            r2 = r28
            X.AnonymousClass0fa.A03(r0, r2)     // Catch:{ TQF -> 0x0c21 }
            java.util.Iterator r0 = r22.iterator()     // Catch:{ TQF -> 0x0c21 }
            boolean r0 = r0.hasNext()     // Catch:{ TQF -> 0x0c21 }
            if (r0 == 0) goto L_0x0c2f
            if (r18 != 0) goto L_0x0364
            goto L_0x09b4
        L_0x0364:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()     // Catch:{ TQF -> 0x0c21 }
            java.util.Iterator r2 = r22.iterator()     // Catch:{ TQF -> 0x0c21 }
        L_0x036c:
            boolean r0 = r2.hasNext()     // Catch:{ TQF -> 0x0c21 }
            if (r0 == 0) goto L_0x0380
            java.lang.Object r0 = r2.next()     // Catch:{ TQF -> 0x0c21 }
            X.RLt r0 = (X.C9018RLt) r0     // Catch:{ TQF -> 0x0c21 }
            X.Qnw r0 = (X.C8316Qnw) r0     // Catch:{ TQF -> 0x0c21 }
            X.RQu r0 = r0.A01     // Catch:{ TQF -> 0x0c21 }
            r10.add(r0)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x036c
        L_0x0380:
            r0 = r54
            byte[] r13 = r0.A02     // Catch:{ TQF -> 0x0c21 }
            if (r13 == 0) goto L_0x0527
            r0 = r57
            X.Tdx r9 = r0.A03     // Catch:{ TQF -> 0x0c21 }
            r9.getClass()     // Catch:{ TQF -> 0x0c21 }
            android.database.sqlite.SQLiteDatabase r8 = r27.A03()     // Catch:{ TQF -> 0x0c21 }
            r0 = r27
            X.C12524SwA.A02(r8, r0)     // Catch:{ TQF -> 0x0c21 }
            X.SwA r9 = (X.C12524SwA) r9     // Catch:{ all -> 0x0c11 }
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0c11 }
            java.lang.String r0 = ""
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0c11 }
            java.lang.String r3 = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped"
            android.database.sqlite.SQLiteDatabase r7 = r9.A03()     // Catch:{ all -> 0x0c11 }
            r2 = r24
            X.AnonymousClass0fa.A01(r7, r2)     // Catch:{ all -> 0x0c11 }
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0ac4 }
            android.database.Cursor r6 = r7.rawQuery(r3, r2)     // Catch:{ all -> 0x0ac4 }
        L_0x03b3:
            boolean r2 = r6.moveToNext()     // Catch:{ all -> 0x0abf }
            if (r2 == 0) goto L_0x0410
            java.lang.String r4 = r6.getString(r1)     // Catch:{ all -> 0x0abf }
            r2 = r20
            int r3 = r6.getInt(r2)     // Catch:{ all -> 0x0abf }
            X.RJF r15 = X.RJF.REASON_UNKNOWN     // Catch:{ all -> 0x0abf }
            if (r3 == r1) goto L_0x03f0
            X.RJF r5 = X.RJF.MESSAGE_TOO_OLD     // Catch:{ all -> 0x0abf }
            if (r3 == r2) goto L_0x03f1
            X.RJF r5 = X.RJF.CACHE_FULL     // Catch:{ all -> 0x0abf }
            r2 = 2
            if (r3 == r2) goto L_0x03f1
            X.RJF r5 = X.RJF.PAYLOAD_TOO_BIG     // Catch:{ all -> 0x0abf }
            if (r3 == r14) goto L_0x03f1
            X.RJF r5 = X.RJF.MAX_RETRIES_REACHED     // Catch:{ all -> 0x0abf }
            r2 = 4
            if (r3 == r2) goto L_0x03f1
            X.RJF r5 = X.RJF.INVALID_PAYLOD     // Catch:{ all -> 0x0abf }
            r2 = 5
            if (r3 == r2) goto L_0x03f1
            X.RJF r5 = X.RJF.SERVER_ERROR     // Catch:{ all -> 0x0abf }
            r2 = 6
            if (r3 == r2) goto L_0x03f1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0abf }
            java.lang.String r3 = "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x0abf }
            java.lang.String.format(r3, r2)     // Catch:{ all -> 0x0abf }
        L_0x03f0:
            r5 = r15
        L_0x03f1:
            r2 = 2
            long r2 = r6.getLong(r2)     // Catch:{ all -> 0x0abf }
            boolean r15 = r11.containsKey(r4)     // Catch:{ all -> 0x0abf }
            if (r15 != 0) goto L_0x0403
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0abf }
            r11.put(r4, r15)     // Catch:{ all -> 0x0abf }
        L_0x0403:
            java.util.List r15 = X.Pxe.A1B(r4, r11)     // Catch:{ all -> 0x0abf }
            X.RsU r4 = new X.RsU     // Catch:{ all -> 0x0abf }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0abf }
            r15.add(r4)     // Catch:{ all -> 0x0abf }
            goto L_0x03b3
        L_0x0410:
            java.util.Iterator r5 = X.AnonymousClass7TF.A0s(r11)     // Catch:{ all -> 0x0abf }
        L_0x0414:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x0abf }
            if (r2 == 0) goto L_0x0435
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r5)     // Catch:{ all -> 0x0abf }
            java.lang.String r4 = X.DbT.A13(r2)     // Catch:{ all -> 0x0abf }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0abf }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0abf }
            java.util.List r3 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x0abf }
            X.SEX r2 = new X.SEX     // Catch:{ all -> 0x0abf }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0abf }
            r12.add(r2)     // Catch:{ all -> 0x0abf }
            goto L_0x0414
        L_0x0435:
            X.Tdy r2 = r9.A03     // Catch:{ all -> 0x0abf }
            long r4 = r2.C7E()     // Catch:{ all -> 0x0abf }
            android.database.sqlite.SQLiteDatabase r15 = r9.A03()     // Catch:{ all -> 0x0abf }
            r2 = r24
            X.AnonymousClass0fa.A01(r15, r2)     // Catch:{ all -> 0x0abf }
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0ab7 }
            java.lang.String r2 = "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"
            android.database.Cursor r14 = r15.rawQuery(r2, r3)     // Catch:{ all -> 0x0ab7 }
            r14.moveToNext()     // Catch:{ all -> 0x0ab2 }
            long r2 = r14.getLong(r1)     // Catch:{ all -> 0x0ab2 }
            X.RsW r11 = new X.RsW     // Catch:{ all -> 0x0ab2 }
            r11.<init>(r2, r4)     // Catch:{ all -> 0x0ab2 }
            r14.close()     // Catch:{ all -> 0x0ab7 }
            r15.setTransactionSuccessful()     // Catch:{ all -> 0x0ab7 }
            r2 = r23
            X.AnonymousClass0fa.A03(r15, r2)     // Catch:{ all -> 0x0abf }
            long r4 = X.Pxh.A0F(r9)     // Catch:{ all -> 0x0abf }
            X.RkZ r2 = X.C9980RkZ.A00     // Catch:{ all -> 0x0abf }
            X.Qnv r2 = (X.C8315Qnv) r2     // Catch:{ all -> 0x0abf }
            long r2 = r2.A04     // Catch:{ all -> 0x0abf }
            X.RsV r14 = new X.RsV     // Catch:{ all -> 0x0abf }
            r14.<init>(r4, r2)     // Catch:{ all -> 0x0abf }
            X.SDw r2 = new X.SDw     // Catch:{ all -> 0x0abf }
            r2.<init>(r14)     // Catch:{ all -> 0x0abf }
            X.Tdv r3 = r9.A00     // Catch:{ all -> 0x0abf }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0abf }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0abf }
            java.util.List r5 = java.util.Collections.unmodifiableList(r12)     // Catch:{ all -> 0x0abf }
            X.SFK r4 = new X.SFK     // Catch:{ all -> 0x0abf }
            r4.<init>(r2, r11, r3, r5)     // Catch:{ all -> 0x0abf }
            r6.close()     // Catch:{ all -> 0x0ac4 }
            r7.setTransactionSuccessful()     // Catch:{ all -> 0x0ac4 }
            r2 = r23
            X.AnonymousClass0fa.A03(r7, r2)     // Catch:{ all -> 0x0c11 }
            r8.setTransactionSuccessful()     // Catch:{ all -> 0x0c11 }
            r2 = r28
            X.AnonymousClass0fa.A03(r8, r2)     // Catch:{ TQF -> 0x0c21 }
            java.util.HashMap r35 = X.AnonymousClass7TE.A1E()     // Catch:{ TQF -> 0x0c21 }
            r2 = r57
            X.Tdy r2 = r2.A06     // Catch:{ TQF -> 0x0c21 }
            long r36 = r2.C7E()     // Catch:{ TQF -> 0x0c21 }
            java.lang.Long r11 = java.lang.Long.valueOf(r36)     // Catch:{ TQF -> 0x0c21 }
            r2 = r57
            X.Tdy r2 = r2.A07     // Catch:{ TQF -> 0x0c21 }
            long r38 = r2.C7E()     // Catch:{ TQF -> 0x0c21 }
            java.lang.Long r9 = java.lang.Long.valueOf(r38)     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r34 = "GDT_CLIENT_METRICS"
            java.lang.String r2 = "proto"
            X.S5K r8 = new X.S5K     // Catch:{ TQF -> 0x0c21 }
            r8.<init>(r2)     // Catch:{ TQF -> 0x0c21 }
            X.Rv8 r2 = X.C11134SBp.A00     // Catch:{ TQF -> 0x0c21 }
            java.io.ByteArrayOutputStream r7 = X.Pxe.A0b()     // Catch:{ TQF -> 0x0c21 }
            java.util.Map r6 = r2.A01     // Catch:{ IOException -> 0x04f4 }
            java.util.Map r5 = r2.A02     // Catch:{ IOException -> 0x04f4 }
            X.TmO r3 = r2.A00     // Catch:{ IOException -> 0x04f4 }
            X.T4Z r2 = new X.T4Z     // Catch:{ IOException -> 0x04f4 }
            r2.<init>(r3, r7, r6, r5)     // Catch:{ IOException -> 0x04f4 }
            java.util.Map r5 = r2.A02     // Catch:{ IOException -> 0x04f4 }
            java.lang.Class r3 = r4.getClass()     // Catch:{ IOException -> 0x04f4 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ IOException -> 0x04f4 }
            X.TeL r5 = (X.C13654TeL) r5     // Catch:{ IOException -> 0x04f4 }
            if (r5 == 0) goto L_0x04e4
            r5.ARq(r4, r2)     // Catch:{ IOException -> 0x04f4 }
            goto L_0x04f4
        L_0x04e4:
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x04f4 }
            java.lang.String r2 = "No encoder for "
            java.lang.String r3 = X.AnonymousClass7TG.A0m(r3, r2, r4)     // Catch:{ IOException -> 0x04f4 }
            X.TQI r2 = new X.TQI     // Catch:{ IOException -> 0x04f4 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x04f4 }
            throw r2     // Catch:{ IOException -> 0x04f4 }
        L_0x04f4:
            byte[] r3 = r7.toByteArray()     // Catch:{ TQF -> 0x0c21 }
            X.S5i r2 = new X.S5i     // Catch:{ TQF -> 0x0c21 }
            r2.<init>(r8, r3)     // Catch:{ TQF -> 0x0c21 }
            if (r11 != 0) goto L_0x0505
            java.lang.String r3 = " eventMillis"
            java.lang.String r0 = X.002.A0R(r0, r3)     // Catch:{ TQF -> 0x0c21 }
        L_0x0505:
            if (r9 != 0) goto L_0x050d
            java.lang.String r3 = " uptimeMillis"
            java.lang.String r0 = X.002.A0R(r0, r3)     // Catch:{ TQF -> 0x0c21 }
        L_0x050d:
            boolean r3 = r0.isEmpty()     // Catch:{ TQF -> 0x0c21 }
            if (r3 == 0) goto L_0x0b85
            X.Qnq r0 = new X.Qnq     // Catch:{ TQF -> 0x0c21 }
            r31 = r0
            r32 = r2
            r33 = r21
            r31.<init>(r32, r33, r34, r35, r36, r38)     // Catch:{ TQF -> 0x0c21 }
            r2 = r18
            X.Qnq r0 = r2.AOC(r0)     // Catch:{ TQF -> 0x0c21 }
            r10.add(r0)     // Catch:{ TQF -> 0x0c21 }
        L_0x0527:
            java.lang.String r4 = ""
            boolean r0 = r4.isEmpty()     // Catch:{ TQF -> 0x0c21 }
            if (r0 == 0) goto L_0x0b7d
            r0 = r18
            X.Sw7 r0 = (X.Sw7) r0     // Catch:{ TQF -> 0x0c21 }
            r53 = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ TQF -> 0x0c21 }
            java.util.Iterator r6 = r10.iterator()     // Catch:{ TQF -> 0x0c21 }
        L_0x053d:
            boolean r2 = r6.hasNext()     // Catch:{ TQF -> 0x0c21 }
            if (r2 == 0) goto L_0x0564
            java.lang.Object r3 = r6.next()     // Catch:{ TQF -> 0x0c21 }
            X.RQu r3 = (X.C9143RQu) r3     // Catch:{ TQF -> 0x0c21 }
            r2 = r3
            X.Qnq r2 = (X.C8310Qnq) r2     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = r2.A04     // Catch:{ TQF -> 0x0c21 }
            boolean r5 = r0.containsKey(r2)     // Catch:{ TQF -> 0x0c21 }
            if (r5 != 0) goto L_0x055c
            java.util.ArrayList r3 = X.DbV.A14(r3)     // Catch:{ TQF -> 0x0c21 }
            r0.put(r2, r3)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x053d
        L_0x055c:
            java.util.List r2 = X.Pxe.A1B(r2, r0)     // Catch:{ TQF -> 0x0c21 }
            r2.add(r3)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x053d
        L_0x0564:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()     // Catch:{ TQF -> 0x0c21 }
            java.util.Iterator r31 = X.AnonymousClass7TF.A0s(r0)     // Catch:{ TQF -> 0x0c21 }
        L_0x056c:
            boolean r0 = r31.hasNext()     // Catch:{ TQF -> 0x0c21 }
            if (r0 == 0) goto L_0x076c
            java.util.Map$Entry r6 = X.AnonymousClass7TE.A1J(r31)     // Catch:{ TQF -> 0x0c21 }
            java.lang.Object r0 = r6.getValue()     // Catch:{ TQF -> 0x0c21 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ TQF -> 0x0c21 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ TQF -> 0x0c21 }
            X.RQu r0 = (X.C9143RQu) r0     // Catch:{ TQF -> 0x0c21 }
            r46 = 0
            r47 = 0
            X.RDm r45 = X.C8870RDm.DEFAULT     // Catch:{ TQF -> 0x0c21 }
            r2 = r53
            X.Tdy r2 = r2.A03     // Catch:{ TQF -> 0x0c21 }
            long r49 = r2.C7E()     // Catch:{ TQF -> 0x0c21 }
            java.lang.Long r15 = java.lang.Long.valueOf(r49)     // Catch:{ TQF -> 0x0c21 }
            r2 = r53
            X.Tdy r2 = r2.A02     // Catch:{ TQF -> 0x0c21 }
            long r51 = r2.C7E()     // Catch:{ TQF -> 0x0c21 }
            java.lang.Long r14 = java.lang.Long.valueOf(r51)     // Catch:{ TQF -> 0x0c21 }
            X.RDc r3 = X.C8861RDc.ANDROID_FIREBASE     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r5 = "sdk-version"
            r2 = r0
            X.Qnq r2 = (X.C8310Qnq) r2     // Catch:{ TQF -> 0x0c21 }
            java.util.Map r2 = r2.A05     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = X.DbT.A11(r5, r2)     // Catch:{ TQF -> 0x0c21 }
            if (r2 != 0) goto L_0x05b2
            r2 = 0
            goto L_0x05ba
        L_0x05b2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ TQF -> 0x0c21 }
            int r2 = r2.intValue()     // Catch:{ TQF -> 0x0c21 }
        L_0x05ba:
            java.lang.Integer r33 = java.lang.Integer.valueOf(r2)     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "model"
            java.lang.String r34 = r0.A00(r2)     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "hardware"
            java.lang.String r35 = r0.A00(r2)     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "device"
            java.lang.String r36 = r0.A00(r2)     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "product"
            java.lang.String r37 = r0.A00(r2)     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "os-uild"
            java.lang.String r38 = r0.A00(r2)     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "manufacturer"
            java.lang.String r39 = r0.A00(r2)     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "fingerprint"
            java.lang.String r40 = r0.A00(r2)     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "country"
            java.lang.String r42 = r0.A00(r2)     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "locale"
            java.lang.String r41 = r0.A00(r2)     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "mcc_mnc"
            java.lang.String r43 = r0.A00(r2)     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "application_build"
            java.lang.String r44 = r0.A00(r2)     // Catch:{ TQF -> 0x0c21 }
            X.Qnj r0 = new X.Qnj     // Catch:{ TQF -> 0x0c21 }
            r32 = r0
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ TQF -> 0x0c21 }
            X.Qnl r11 = new X.Qnl     // Catch:{ TQF -> 0x0c21 }
            r11.<init>(r0, r3)     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r0 = X.DbT.A13(r6)     // Catch:{ NumberFormatException -> 0x061a }
            java.lang.Integer r46 = X.Pxf.A0Z(r0)     // Catch:{ NumberFormatException -> 0x061a }
            goto L_0x061e
        L_0x061a:
            java.lang.String r47 = X.DbT.A13(r6)     // Catch:{ TQF -> 0x0c21 }
        L_0x061e:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ TQF -> 0x0c21 }
            java.lang.Object r0 = r6.getValue()     // Catch:{ TQF -> 0x0c21 }
            java.util.Iterator r12 = X.C51966G9m.A1H(r0)     // Catch:{ TQF -> 0x0c21 }
        L_0x062a:
            boolean r0 = r12.hasNext()     // Catch:{ TQF -> 0x0c21 }
            if (r0 == 0) goto L_0x0745
            java.lang.Object r5 = r12.next()     // Catch:{ TQF -> 0x0c21 }
            X.RQu r5 = (X.C9143RQu) r5     // Catch:{ TQF -> 0x0c21 }
            X.Qnq r5 = (X.C8310Qnq) r5     // Catch:{ TQF -> 0x0c21 }
            X.S5i r6 = r5.A02     // Catch:{ TQF -> 0x0c21 }
            X.S5K r3 = r6.A00     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "proto"
            X.S5K r0 = new X.S5K     // Catch:{ TQF -> 0x0c21 }
            r0.<init>(r2)     // Catch:{ TQF -> 0x0c21 }
            boolean r0 = r3.equals(r0)     // Catch:{ TQF -> 0x0c21 }
            if (r0 == 0) goto L_0x070d
            byte[] r2 = r6.A01     // Catch:{ TQF -> 0x0c21 }
            X.RyL r0 = new X.RyL     // Catch:{ TQF -> 0x0c21 }
            r0.<init>()     // Catch:{ TQF -> 0x0c21 }
            r0.A06 = r2     // Catch:{ TQF -> 0x0c21 }
        L_0x0653:
            long r2 = r5.A00     // Catch:{ TQF -> 0x0c21 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ TQF -> 0x0c21 }
            r0.A02 = r2     // Catch:{ TQF -> 0x0c21 }
            long r2 = r5.A01     // Catch:{ TQF -> 0x0c21 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ TQF -> 0x0c21 }
            r0.A03 = r2     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "tz-offset"
            java.util.Map r3 = r5.A05     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = X.DbT.A11(r2, r3)     // Catch:{ TQF -> 0x0c21 }
            if (r2 != 0) goto L_0x0671
            r6 = 0
            goto L_0x0679
        L_0x0671:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ TQF -> 0x0c21 }
            long r6 = r2.longValue()     // Catch:{ TQF -> 0x0c21 }
        L_0x0679:
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ TQF -> 0x0c21 }
            r0.A04 = r2     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "net-type"
            java.lang.String r2 = X.DbT.A11(r2, r3)     // Catch:{ TQF -> 0x0c21 }
            if (r2 != 0) goto L_0x068a
            r6 = 0
            goto L_0x0692
        L_0x068a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ TQF -> 0x0c21 }
            int r6 = r2.intValue()     // Catch:{ TQF -> 0x0c21 }
        L_0x0692:
            android.util.SparseArray r2 = X.C8862RDd.A00     // Catch:{ TQF -> 0x0c21 }
            java.lang.Object r6 = r2.get(r6)     // Catch:{ TQF -> 0x0c21 }
            X.RDd r6 = (X.C8862RDd) r6     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = "mobile-subtype"
            java.lang.String r2 = X.DbT.A11(r2, r3)     // Catch:{ TQF -> 0x0c21 }
            if (r2 != 0) goto L_0x06a5
            r3 = 0
            goto L_0x06ad
        L_0x06a5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ TQF -> 0x0c21 }
            int r3 = r2.intValue()     // Catch:{ TQF -> 0x0c21 }
        L_0x06ad:
            android.util.SparseArray r2 = X.RF4.A01     // Catch:{ TQF -> 0x0c21 }
            java.lang.Object r3 = r2.get(r3)     // Catch:{ TQF -> 0x0c21 }
            X.RF4 r3 = (X.RF4) r3     // Catch:{ TQF -> 0x0c21 }
            X.Qnp r2 = new X.Qnp     // Catch:{ TQF -> 0x0c21 }
            r2.<init>(r3, r6)     // Catch:{ TQF -> 0x0c21 }
            r0.A00 = r2     // Catch:{ TQF -> 0x0c21 }
            java.lang.Integer r3 = r5.A03     // Catch:{ TQF -> 0x0c21 }
            if (r3 == 0) goto L_0x06c2
            r0.A01 = r3     // Catch:{ TQF -> 0x0c21 }
        L_0x06c2:
            java.lang.Long r8 = r0.A02     // Catch:{ TQF -> 0x0c21 }
            r7 = r4
            if (r8 != 0) goto L_0x06cd
            java.lang.String r3 = " eventTimeMs"
            java.lang.String r7 = X.002.A0R(r4, r3)     // Catch:{ TQF -> 0x0c21 }
        L_0x06cd:
            java.lang.Long r6 = r0.A03     // Catch:{ TQF -> 0x0c21 }
            if (r6 != 0) goto L_0x06d7
            java.lang.String r3 = " eventUptimeMs"
            java.lang.String r7 = X.002.A0R(r7, r3)     // Catch:{ TQF -> 0x0c21 }
        L_0x06d7:
            java.lang.Long r3 = r0.A04     // Catch:{ TQF -> 0x0c21 }
            if (r3 != 0) goto L_0x06e1
            java.lang.String r5 = " timezoneOffsetSeconds"
            java.lang.String r7 = X.002.A0R(r7, r5)     // Catch:{ TQF -> 0x0c21 }
        L_0x06e1:
            boolean r5 = r7.isEmpty()     // Catch:{ TQF -> 0x0c21 }
            if (r5 == 0) goto L_0x0b8c
            long r37 = r8.longValue()     // Catch:{ TQF -> 0x0c21 }
            java.lang.Integer r7 = r0.A01     // Catch:{ TQF -> 0x0c21 }
            long r39 = r6.longValue()     // Catch:{ TQF -> 0x0c21 }
            byte[] r6 = r0.A06     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r5 = r0.A05     // Catch:{ TQF -> 0x0c21 }
            long r41 = r3.longValue()     // Catch:{ TQF -> 0x0c21 }
            X.Qnm r0 = new X.Qnm     // Catch:{ TQF -> 0x0c21 }
            r32 = r0
            r33 = r2
            r34 = r7
            r35 = r5
            r36 = r6
            r32.<init>(r33, r34, r35, r36, r37, r39, r41)     // Catch:{ TQF -> 0x0c21 }
            r9.add(r0)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x062a
        L_0x070d:
            java.lang.String r2 = "json"
            X.S5K r0 = new X.S5K     // Catch:{ TQF -> 0x0c21 }
            r0.<init>(r2)     // Catch:{ TQF -> 0x0c21 }
            boolean r0 = r3.equals(r0)     // Catch:{ TQF -> 0x0c21 }
            if (r0 == 0) goto L_0x072e
            byte[] r3 = r6.A01     // Catch:{ TQF -> 0x0c21 }
            java.nio.charset.Charset r0 = X.Pxe.A17()     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = new java.lang.String     // Catch:{ TQF -> 0x0c21 }
            r2.<init>(r3, r0)     // Catch:{ TQF -> 0x0c21 }
            X.RyL r0 = new X.RyL     // Catch:{ TQF -> 0x0c21 }
            r0.<init>()     // Catch:{ TQF -> 0x0c21 }
            r0.A05 = r2     // Catch:{ TQF -> 0x0c21 }
            goto L_0x0653
        L_0x072e:
            java.lang.String r5 = "CctTransportBackend"
            java.lang.String r2 = "Received event of unsupported encoding %s. Skipping..."
            java.lang.String r0 = "TransportRuntime."
            java.lang.String r0 = X.002.A0R(r0, r5)     // Catch:{ TQF -> 0x0c21 }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ TQF -> 0x0c21 }
            android.util.Log.w(r0, r2)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x062a
        L_0x0745:
            r2 = r4
            if (r15 != 0) goto L_0x074e
            java.lang.String r0 = " requestTimeMs"
            java.lang.String r2 = X.002.A0R(r4, r0)     // Catch:{ TQF -> 0x0c21 }
        L_0x074e:
            if (r14 != 0) goto L_0x0756
            java.lang.String r0 = " requestUptimeMs"
            java.lang.String r2 = X.002.A0R(r2, r0)     // Catch:{ TQF -> 0x0c21 }
        L_0x0756:
            boolean r0 = r2.isEmpty()     // Catch:{ TQF -> 0x0c21 }
            if (r0 == 0) goto L_0x0acd
            X.Qnn r0 = new X.Qnn     // Catch:{ TQF -> 0x0c21 }
            r43 = r0
            r44 = r11
            r48 = r9
            r43.<init>(r44, r45, r46, r47, r48, r49, r51)     // Catch:{ TQF -> 0x0c21 }
            r10.add(r0)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x056c
        L_0x076c:
            X.Qnk r2 = new X.Qnk     // Catch:{ TQF -> 0x0c21 }
            r2.<init>(r10)     // Catch:{ TQF -> 0x0c21 }
            r0 = r53
            java.net.URL r0 = r0.A05     // Catch:{ TQF -> 0x0c21 }
            r3 = 0
            if (r13 == 0) goto L_0x07d7
            java.nio.charset.Charset r4 = X.Pxe.A17()     // Catch:{ IllegalArgumentException -> 0x07d3 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x07d3 }
            r0.<init>(r13, r4)     // Catch:{ IllegalArgumentException -> 0x07d3 }
            java.lang.String r4 = "1$"
            boolean r4 = r0.startsWith(r4)     // Catch:{ IllegalArgumentException -> 0x07d3 }
            if (r4 == 0) goto L_0x07c5
            r4 = 2
            java.lang.String r5 = r0.substring(r4)     // Catch:{ IllegalArgumentException -> 0x07d3 }
            java.lang.String r0 = "\\"
            java.lang.String r0 = java.util.regex.Pattern.quote(r0)     // Catch:{ IllegalArgumentException -> 0x07d3 }
            java.lang.String[] r5 = r5.split(r0, r4)     // Catch:{ IllegalArgumentException -> 0x07d3 }
            int r0 = r5.length     // Catch:{ IllegalArgumentException -> 0x07d3 }
            if (r0 != r4) goto L_0x07be
            r4 = r5[r1]     // Catch:{ IllegalArgumentException -> 0x07d3 }
            boolean r0 = r4.isEmpty()     // Catch:{ IllegalArgumentException -> 0x07d3 }
            if (r0 != 0) goto L_0x07cc
            r5 = r5[r20]     // Catch:{ IllegalArgumentException -> 0x07d3 }
            boolean r0 = r5.isEmpty()     // Catch:{ IllegalArgumentException -> 0x07d3 }
            if (r0 != 0) goto L_0x07ac
            r3 = r5
        L_0x07ac:
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x07b2 }
            r0.<init>(r4)     // Catch:{ MalformedURLException -> 0x07b2 }
            goto L_0x07d7
        L_0x07b2:
            r2 = move-exception
            java.lang.String r0 = "Invalid url: "
            java.lang.String r0 = X.002.A0R(r0, r4)     // Catch:{ IllegalArgumentException -> 0x07d3 }
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r2)     // Catch:{ IllegalArgumentException -> 0x07d3 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x07d3 }
        L_0x07be:
            java.lang.String r0 = "Extra is not a valid encoded LegacyFlgDestination"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IllegalArgumentException -> 0x07d3 }
            goto L_0x07d2
        L_0x07c5:
            java.lang.String r0 = "Version marker missing from extras"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IllegalArgumentException -> 0x07d3 }
            goto L_0x07d2
        L_0x07cc:
            java.lang.String r0 = "Missing endpoint in CCTDestination extras"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IllegalArgumentException -> 0x07d3 }
        L_0x07d2:
            throw r0     // Catch:{ IllegalArgumentException -> 0x07d3 }
        L_0x07d3:
            java.lang.Integer r4 = X.AnonymousClass05K.A0C     // Catch:{ TQF -> 0x0c21 }
            goto L_0x09bf
        L_0x07d7:
            X.Ruj r8 = new X.Ruj     // Catch:{ IOException -> 0x09a3 }
            r8.<init>(r2, r3, r0)     // Catch:{ IOException -> 0x09a3 }
            r7 = 5
        L_0x07dd:
            java.net.URL r3 = r8.A02     // Catch:{ IOException -> 0x09a3 }
            java.lang.String r15 = "CctTransportBackend"
            java.lang.String r2 = "Making request to: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ IOException -> 0x09a3 }
            java.lang.String.format(r2, r0)     // Catch:{ IOException -> 0x09a3 }
            java.net.URLConnection r14 = r3.openConnection()     // Catch:{ IOException -> 0x09a3 }
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14     // Catch:{ IOException -> 0x09a3 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r14.setConnectTimeout(r0)     // Catch:{ IOException -> 0x09a3 }
            r0 = 40000(0x9c40, float:5.6052E-41)
            r14.setReadTimeout(r0)     // Catch:{ IOException -> 0x09a3 }
            r0 = r20
            r14.setDoOutput(r0)     // Catch:{ IOException -> 0x09a3 }
            r14.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x09a3 }
            java.lang.String r0 = "POST"
            r14.setRequestMethod(r0)     // Catch:{ IOException -> 0x09a3 }
            java.lang.String r0 = "3.1.0"
            java.lang.Object[] r2 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x09a3 }
            java.lang.String r0 = "datatransport/%s android/"
            java.lang.String r2 = java.lang.String.format(r0, r2)     // Catch:{ IOException -> 0x09a3 }
            java.lang.String r0 = "User-Agent"
            r14.setRequestProperty(r0, r2)     // Catch:{ IOException -> 0x09a3 }
            java.lang.String r13 = "Content-Encoding"
            java.lang.String r12 = "gzip"
            r14.setRequestProperty(r13, r12)     // Catch:{ IOException -> 0x09a3 }
            java.lang.String r11 = "Content-Type"
            java.lang.String r0 = "application/json"
            r14.setRequestProperty(r11, r0)     // Catch:{ IOException -> 0x09a3 }
            java.lang.String r0 = "Accept-Encoding"
            r14.setRequestProperty(r0, r12)     // Catch:{ IOException -> 0x09a3 }
            java.lang.String r2 = r8.A01     // Catch:{ IOException -> 0x09a3 }
            if (r2 == 0) goto L_0x0835
            java.lang.String r0 = "X-Goog-Api-Key"
            r14.setRequestProperty(r0, r2)     // Catch:{ IOException -> 0x09a3 }
        L_0x0835:
            r0 = -793538524(0xffffffffd0b39024, float:-2.41005445E10)
            r3 = 0
            X.0fY r10 = X.0fi.A01(r14, r0)     // Catch:{ ConnectException | UnknownHostException -> 0x0906, TQI | IOException -> 0x08f7 }
            java.util.zip.GZIPOutputStream r9 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x08ed }
            r9.<init>(r10)     // Catch:{ all -> 0x08ed }
            r0 = r53
            X.S0j r6 = r0.A04     // Catch:{ all -> 0x08e3 }
            X.Rf1 r5 = r8.A00     // Catch:{ all -> 0x08e3 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x08e3 }
            r2.<init>(r9)     // Catch:{ all -> 0x08e3 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x08e3 }
            r0.<init>(r2)     // Catch:{ all -> 0x08e3 }
            r6.A00(r0, r5)     // Catch:{ all -> 0x08e3 }
            r9.close()     // Catch:{ all -> 0x08ed }
            r10.close()     // Catch:{ ConnectException | UnknownHostException -> 0x0906, TQI | IOException -> 0x08f7 }
            int r0 = r14.getResponseCode()     // Catch:{ IOException -> 0x09a3 }
            r14.getHeaderField(r11)     // Catch:{ IOException -> 0x09a3 }
            r14.getHeaderField(r13)     // Catch:{ IOException -> 0x09a3 }
            r2 = 302(0x12e, float:4.23E-43)
            if (r0 == r2) goto L_0x091c
            r2 = 301(0x12d, float:4.22E-43)
            if (r0 == r2) goto L_0x091c
            r2 = 307(0x133, float:4.3E-43)
            if (r0 == r2) goto L_0x091c
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x0914
            r2 = -2077750413(0xffffffff84280b73, float:-1.9753562E-36)
            X.0fV r4 = X.0fi.A00(r14, r2)     // Catch:{ IOException -> 0x09a3 }
            java.lang.String r2 = r14.getHeaderField(r13)     // Catch:{ all -> 0x095f }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x095f }
            if (r2 == 0) goto L_0x088d
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x095f }
            r5.<init>(r4)     // Catch:{ all -> 0x095f }
            goto L_0x088e
        L_0x088d:
            r5 = r4
        L_0x088e:
            java.io.BufferedReader r2 = X.Pxg.A0X(r5)     // Catch:{ all -> 0x0955 }
            android.util.JsonReader r9 = new android.util.JsonReader     // Catch:{ all -> 0x0955 }
            r9.<init>(r2)     // Catch:{ all -> 0x0955 }
            r9.beginObject()     // Catch:{ all -> 0x0950 }
        L_0x089a:
            boolean r2 = r9.hasNext()     // Catch:{ all -> 0x0950 }
            if (r2 == 0) goto L_0x0949
            java.lang.String r3 = r9.nextName()     // Catch:{ all -> 0x0950 }
            java.lang.String r2 = "nextRequestWaitMillis"
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x0950 }
            if (r2 == 0) goto L_0x08c3
            android.util.JsonToken r3 = r9.peek()     // Catch:{ all -> 0x0950 }
            android.util.JsonToken r2 = android.util.JsonToken.STRING     // Catch:{ all -> 0x0950 }
            if (r3 != r2) goto L_0x08c7
            java.lang.String r2 = r9.nextString()     // Catch:{ all -> 0x0950 }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ all -> 0x0950 }
            X.Qno r6 = new X.Qno     // Catch:{ all -> 0x0950 }
            r6.<init>(r2)     // Catch:{ all -> 0x0950 }
            goto L_0x08d0
        L_0x08c3:
            r9.skipValue()     // Catch:{ all -> 0x0950 }
            goto L_0x089a
        L_0x08c7:
            long r2 = r9.nextLong()     // Catch:{ all -> 0x0950 }
            X.Qno r6 = new X.Qno     // Catch:{ all -> 0x0950 }
            r6.<init>(r2)     // Catch:{ all -> 0x0950 }
        L_0x08d0:
            r9.close()     // Catch:{ all -> 0x0955 }
            long r2 = r6.A00     // Catch:{ all -> 0x0955 }
            X.Ruk r6 = new X.Ruk     // Catch:{ all -> 0x0955 }
            r9 = r21
            r6.<init>(r9, r0, r2)     // Catch:{ all -> 0x0955 }
            r5.close()     // Catch:{ all -> 0x095f }
            r4.close()     // Catch:{ IOException -> 0x09a3 }
            goto L_0x092c
        L_0x08e3:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x08e8 }
            goto L_0x08ec
        L_0x08e8:
            r2 = move-exception
            X.C9153RRe.A00(r0, r2)     // Catch:{ all -> 0x08ed }
        L_0x08ec:
            throw r0     // Catch:{ all -> 0x08ed }
        L_0x08ed:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x08f2 }
            goto L_0x08f6
        L_0x08f2:
            r2 = move-exception
            X.C9153RRe.A00(r0, r2)     // Catch:{ ConnectException | UnknownHostException -> 0x0906, TQI | IOException -> 0x08f7 }
        L_0x08f6:
            throw r0     // Catch:{ ConnectException | UnknownHostException -> 0x0906, TQI | IOException -> 0x08f7 }
        L_0x08f7:
            r5 = move-exception
            java.lang.String r2 = "Couldn't encode request, returning with 400"
            java.lang.String r0 = "TransportRuntime."
            java.lang.String r0 = X.002.A0R(r0, r15)     // Catch:{ IOException -> 0x09a3 }
            android.util.Log.e(r0, r2, r5)     // Catch:{ IOException -> 0x09a3 }
            r0 = 400(0x190, float:5.6E-43)
            goto L_0x0914
        L_0x0906:
            r5 = move-exception
            java.lang.String r2 = "Couldn't open connection, returning with 500"
            java.lang.String r0 = "TransportRuntime."
            java.lang.String r0 = X.002.A0R(r0, r15)     // Catch:{ IOException -> 0x09a3 }
            android.util.Log.e(r0, r2, r5)     // Catch:{ IOException -> 0x09a3 }
            r0 = 500(0x1f4, float:7.0E-43)
        L_0x0914:
            X.Ruk r6 = new X.Ruk     // Catch:{ IOException -> 0x09a3 }
            r2 = r21
            r6.<init>(r2, r0, r3)     // Catch:{ IOException -> 0x09a3 }
            goto L_0x092c
        L_0x091c:
            java.lang.String r2 = "Location"
            java.lang.String r5 = r14.getHeaderField(r2)     // Catch:{ IOException -> 0x09a3 }
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x09a3 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x09a3 }
            X.Ruk r6 = new X.Ruk     // Catch:{ IOException -> 0x09a3 }
            r6.<init>(r2, r0, r3)     // Catch:{ IOException -> 0x09a3 }
        L_0x092c:
            java.net.URL r3 = r6.A02     // Catch:{ IOException -> 0x09a3 }
            if (r3 == 0) goto L_0x0969
            java.lang.String r2 = "Following redirect to: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ IOException -> 0x09a3 }
            java.lang.String.format(r2, r0)     // Catch:{ IOException -> 0x09a3 }
            X.Rf1 r2 = r8.A00     // Catch:{ IOException -> 0x09a3 }
            java.lang.String r0 = r8.A01     // Catch:{ IOException -> 0x09a3 }
            X.Ruj r8 = new X.Ruj     // Catch:{ IOException -> 0x09a3 }
            r8.<init>(r2, r0, r3)     // Catch:{ IOException -> 0x09a3 }
            int r7 = r7 + -1
            r0 = r20
            if (r7 >= r0) goto L_0x07dd
            goto L_0x0969
        L_0x0949:
            java.lang.String r0 = "Response is missing nextRequestWaitMillis field."
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x0950 }
            throw r0     // Catch:{ all -> 0x0950 }
        L_0x0950:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0955 }
            throw r0     // Catch:{ all -> 0x0955 }
        L_0x0955:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x095a }
            goto L_0x095e
        L_0x095a:
            r2 = move-exception
            X.C9153RRe.A00(r0, r2)     // Catch:{ all -> 0x095f }
        L_0x095e:
            throw r0     // Catch:{ all -> 0x095f }
        L_0x095f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0964 }
            goto L_0x0968
        L_0x0964:
            r2 = move-exception
            X.C9153RRe.A00(r0, r2)     // Catch:{ IOException -> 0x09a3 }
        L_0x0968:
            throw r0     // Catch:{ IOException -> 0x09a3 }
        L_0x0969:
            int r2 = r6.A00     // Catch:{ IOException -> 0x09a3 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 != r0) goto L_0x0979
            long r2 = r6.A01     // Catch:{ IOException -> 0x09a3 }
            java.lang.Integer r4 = X.AnonymousClass05K.A00     // Catch:{ IOException -> 0x09a3 }
            X.Qns r0 = new X.Qns     // Catch:{ IOException -> 0x09a3 }
            r0.<init>(r2, r4)     // Catch:{ IOException -> 0x09a3 }
            goto L_0x09c6
        L_0x0979:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 >= r0) goto L_0x0999
            r0 = 404(0x194, float:5.66E-43)
            if (r2 == r0) goto L_0x0999
            r0 = 400(0x190, float:5.6E-43)
            if (r2 != r0) goto L_0x098f
            java.lang.Integer r4 = X.AnonymousClass05K.A0N     // Catch:{ IOException -> 0x09a3 }
            r2 = -1
            X.Qns r0 = new X.Qns     // Catch:{ IOException -> 0x09a3 }
            r0.<init>(r2, r4)     // Catch:{ IOException -> 0x09a3 }
            goto L_0x09c6
        L_0x098f:
            java.lang.Integer r4 = X.AnonymousClass05K.A0C     // Catch:{ IOException -> 0x09a3 }
            r2 = -1
            X.Qns r0 = new X.Qns     // Catch:{ IOException -> 0x09a3 }
            r0.<init>(r2, r4)     // Catch:{ IOException -> 0x09a3 }
            goto L_0x09c6
        L_0x0999:
            java.lang.Integer r4 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x09a3 }
            r2 = -1
            X.Qns r0 = new X.Qns     // Catch:{ IOException -> 0x09a3 }
            r0.<init>(r2, r4)     // Catch:{ IOException -> 0x09a3 }
            goto L_0x09c6
        L_0x09a3:
            r4 = move-exception
            java.lang.String r3 = "CctTransportBackend"
            java.lang.String r2 = "Could not make request to the backend"
            java.lang.String r0 = "TransportRuntime."
            java.lang.String r0 = X.002.A0R(r0, r3)     // Catch:{ TQF -> 0x0c21 }
            android.util.Log.e(r0, r2, r4)     // Catch:{ TQF -> 0x0c21 }
            java.lang.Integer r4 = X.AnonymousClass05K.A01     // Catch:{ TQF -> 0x0c21 }
            goto L_0x09bf
        L_0x09b4:
            java.lang.String r2 = "Unknown backend for %s, deleting event batch for it..."
            java.lang.Object[] r0 = new java.lang.Object[]{r29}     // Catch:{ TQF -> 0x0c21 }
            java.lang.String.format(r2, r0)     // Catch:{ TQF -> 0x0c21 }
            java.lang.Integer r4 = X.AnonymousClass05K.A0C     // Catch:{ TQF -> 0x0c21 }
        L_0x09bf:
            r2 = -1
            X.Qns r0 = new X.Qns     // Catch:{ TQF -> 0x0c21 }
            r0.<init>(r2, r4)     // Catch:{ TQF -> 0x0c21 }
        L_0x09c6:
            java.lang.Integer r3 = r0.A01     // Catch:{ TQF -> 0x0c21 }
            java.lang.Integer r2 = X.AnonymousClass05K.A01     // Catch:{ TQF -> 0x0c21 }
            if (r3 != r2) goto L_0x09d7
            android.database.sqlite.SQLiteDatabase r0 = r27.A03()     // Catch:{ TQF -> 0x0c21 }
            r2 = r27
            X.C12524SwA.A02(r0, r2)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x0ad5
        L_0x09d7:
            android.database.sqlite.SQLiteDatabase r5 = r27.A03()     // Catch:{ TQF -> 0x0c21 }
            r2 = r27
            X.C12524SwA.A02(r5, r2)     // Catch:{ TQF -> 0x0c21 }
            java.util.Iterator r2 = r22.iterator()     // Catch:{ all -> 0x0b74 }
            boolean r2 = r2.hasNext()     // Catch:{ all -> 0x0b74 }
            if (r2 == 0) goto L_0x0a0b
            java.lang.String r4 = "DELETE FROM events WHERE _id in "
            java.lang.String r2 = X.C12524SwA.A01(r22)     // Catch:{ all -> 0x0b74 }
            java.lang.String r4 = X.002.A0R(r4, r2)     // Catch:{ all -> 0x0b74 }
            android.database.sqlite.SQLiteDatabase r2 = r55.A03()     // Catch:{ all -> 0x0b74 }
            android.database.sqlite.SQLiteStatement r4 = r2.compileStatement(r4)     // Catch:{ all -> 0x0b74 }
            r2 = 1002143966(0x3bbb80de, float:0.0057221493)
            X.AnonymousClass0fa.A00(r2)     // Catch:{ all -> 0x0b74 }
            r4.execute()     // Catch:{ all -> 0x0b74 }
            r2 = 1052965446(0x3ec2fa46, float:0.38081568)
            X.AnonymousClass0fa.A00(r2)     // Catch:{ all -> 0x0b74 }
        L_0x0a0b:
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x0b74 }
            r2 = r28
            X.AnonymousClass0fa.A03(r5, r2)     // Catch:{ TQF -> 0x0c21 }
            java.lang.Integer r2 = X.AnonymousClass05K.A00     // Catch:{ TQF -> 0x0c21 }
            if (r3 != r2) goto L_0x0a21
            long r4 = r0.A00     // Catch:{ TQF -> 0x0c21 }
            r2 = r16
            long r16 = java.lang.Math.max(r2, r4)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x00c7
        L_0x0a21:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ TQF -> 0x0c21 }
            if (r3 != r0) goto L_0x00c7
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ TQF -> 0x0c21 }
            java.util.Iterator r4 = r22.iterator()     // Catch:{ TQF -> 0x0c21 }
        L_0x0a2d:
            boolean r2 = r4.hasNext()     // Catch:{ TQF -> 0x0c21 }
            if (r2 == 0) goto L_0x0a5e
            java.lang.Object r2 = r4.next()     // Catch:{ TQF -> 0x0c21 }
            X.RLt r2 = (X.C9018RLt) r2     // Catch:{ TQF -> 0x0c21 }
            X.Qnw r2 = (X.C8316Qnw) r2     // Catch:{ TQF -> 0x0c21 }
            X.RQu r2 = r2.A01     // Catch:{ TQF -> 0x0c21 }
            X.Qnq r2 = (X.C8310Qnq) r2     // Catch:{ TQF -> 0x0c21 }
            java.lang.String r3 = r2.A04     // Catch:{ TQF -> 0x0c21 }
            boolean r2 = r0.containsKey(r3)     // Catch:{ TQF -> 0x0c21 }
            if (r2 != 0) goto L_0x0a4f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch:{ TQF -> 0x0c21 }
        L_0x0a4b:
            r0.put(r3, r2)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x0a2d
        L_0x0a4f:
            java.lang.Object r2 = r0.get(r3)     // Catch:{ TQF -> 0x0c21 }
            int r2 = X.Pxe.A09(r2)     // Catch:{ TQF -> 0x0c21 }
            int r2 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x0a4b
        L_0x0a5e:
            android.database.sqlite.SQLiteDatabase r6 = r27.A03()     // Catch:{ TQF -> 0x0c21 }
            r2 = r27
            X.C12524SwA.A02(r6, r2)     // Catch:{ TQF -> 0x0c21 }
            java.util.Iterator r8 = X.AnonymousClass7TF.A0s(r0)     // Catch:{ all -> 0x0c19 }
        L_0x0a6b:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0c19 }
            if (r0 == 0) goto L_0x0a8c
            java.util.Map$Entry r7 = X.AnonymousClass7TE.A1J(r8)     // Catch:{ all -> 0x0c19 }
            r0 = r57
            X.Tdx r5 = r0.A03     // Catch:{ all -> 0x0c19 }
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x0c19 }
            int r0 = X.Pxe.A09(r0)     // Catch:{ all -> 0x0c19 }
            long r2 = (long) r0     // Catch:{ all -> 0x0c19 }
            X.RJF r4 = X.RJF.INVALID_PAYLOD     // Catch:{ all -> 0x0c19 }
            java.lang.String r0 = X.DbT.A13(r7)     // Catch:{ all -> 0x0c19 }
            r5.EAr(r4, r0, r2)     // Catch:{ all -> 0x0c19 }
            goto L_0x0a6b
        L_0x0a8c:
            r6.setTransactionSuccessful()     // Catch:{ all -> 0x0c19 }
            r0 = r28
            X.AnonymousClass0fa.A03(r6, r0)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x00c7
        L_0x0a96:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0b98 }
            goto L_0x0aa1
        L_0x0a9b:
            java.lang.String r1 = "Null transportName"
            java.lang.NullPointerException r1 = X.AnonymousClass7TE.A11(r1)     // Catch:{ all -> 0x0b98 }
        L_0x0aa1:
            throw r1     // Catch:{ all -> 0x0b98 }
        L_0x0aa2:
            java.lang.String r1 = "Null encodedPayload"
            java.lang.NullPointerException r1 = X.AnonymousClass7TE.A11(r1)     // Catch:{ all -> 0x0b9d }
            goto L_0x0b9c
        L_0x0aaa:
            java.lang.String r1 = "Null transportName"
            java.lang.NullPointerException r1 = X.AnonymousClass7TE.A11(r1)     // Catch:{ all -> 0x0b9d }
            goto L_0x0b9c
        L_0x0ab2:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x0ab7 }
            throw r0     // Catch:{ all -> 0x0ab7 }
        L_0x0ab7:
            r1 = move-exception
            r0 = -1029534431(0xffffffffc2a28d21, float:-81.27564)
            X.AnonymousClass0fa.A03(r15, r0)     // Catch:{ all -> 0x0abf }
            throw r1     // Catch:{ all -> 0x0abf }
        L_0x0abf:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0ac4 }
            throw r0     // Catch:{ all -> 0x0ac4 }
        L_0x0ac4:
            r1 = move-exception
            r0 = -1029534431(0xffffffffc2a28d21, float:-81.27564)
            X.AnonymousClass0fa.A03(r7, r0)     // Catch:{ all -> 0x0c11 }
            goto L_0x0c10
        L_0x0acd:
            java.lang.String r0 = "Missing required properties:"
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r2)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x0b92
        L_0x0ad5:
            java.util.Iterator r2 = r22.iterator()     // Catch:{ all -> 0x0bad }
            boolean r2 = r2.hasNext()     // Catch:{ all -> 0x0bad }
            if (r2 == 0) goto L_0x0b4c
            java.lang.String r3 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in "
            java.lang.String r2 = X.C12524SwA.A01(r22)     // Catch:{ all -> 0x0bad }
            java.lang.String r4 = X.002.A0R(r3, r2)     // Catch:{ all -> 0x0bad }
            java.lang.String r3 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"
            android.database.sqlite.SQLiteDatabase r6 = r55.A03()     // Catch:{ all -> 0x0bad }
            r2 = r24
            X.AnonymousClass0fa.A01(r6, r2)     // Catch:{ all -> 0x0bad }
            android.database.sqlite.SQLiteStatement r4 = r6.compileStatement(r4)     // Catch:{ all -> 0x0ba5 }
            r2 = 357671100(0x1551a0bc, float:4.233401E-26)
            X.AnonymousClass0fa.A00(r2)     // Catch:{ all -> 0x0ba5 }
            r4.execute()     // Catch:{ all -> 0x0ba5 }
            r2 = -1013668204(0xffffffffc394a694, float:-297.3014)
            X.AnonymousClass0fa.A00(r2)     // Catch:{ all -> 0x0ba5 }
            r2 = r21
            android.database.Cursor r8 = r6.rawQuery(r3, r2)     // Catch:{ all -> 0x0ba5 }
        L_0x0b0d:
            boolean r2 = r8.moveToNext()     // Catch:{ all -> 0x0b42 }
            if (r2 == 0) goto L_0x0b26
            int r3 = r8.getInt(r1)     // Catch:{ all -> 0x0b42 }
            r2 = r20
            java.lang.String r7 = r8.getString(r2)     // Catch:{ all -> 0x0b42 }
            long r2 = (long) r3     // Catch:{ all -> 0x0b42 }
            X.RJF r5 = X.RJF.MAX_RETRIES_REACHED     // Catch:{ all -> 0x0b42 }
            r4 = r55
            r4.EAr(r5, r7, r2)     // Catch:{ all -> 0x0b42 }
            goto L_0x0b0d
        L_0x0b26:
            r8.close()     // Catch:{ all -> 0x0ba5 }
            java.lang.String r1 = "DELETE FROM events WHERE num_attempts >= 16"
            android.database.sqlite.SQLiteStatement r2 = r6.compileStatement(r1)     // Catch:{ all -> 0x0ba5 }
            r1 = 257621068(0xf5afc4c, float:1.07968204E-29)
            X.AnonymousClass0fa.A00(r1)     // Catch:{ all -> 0x0ba5 }
            r2.execute()     // Catch:{ all -> 0x0ba5 }
            r1 = 1793396735(0x6ae50fff, float:1.3845978E26)
            X.AnonymousClass0fa.A00(r1)     // Catch:{ all -> 0x0ba5 }
            r6.setTransactionSuccessful()     // Catch:{ all -> 0x0ba5 }
            goto L_0x0b47
        L_0x0b42:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0ba5 }
            throw r1     // Catch:{ all -> 0x0ba5 }
        L_0x0b47:
            r1 = r23
            X.AnonymousClass0fa.A03(r6, r1)     // Catch:{ all -> 0x0bad }
        L_0x0b4c:
            r1 = r57
            X.Tdy r1 = r1.A06     // Catch:{ all -> 0x0bad }
            long r1 = r1.C7E()     // Catch:{ all -> 0x0bad }
            long r1 = r1 + r16
            r4 = r30
            r3 = r29
            r4.EAu(r3, r1)     // Catch:{ all -> 0x0bad }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0bad }
            r1 = r28
            X.AnonymousClass0fa.A03(r0, r1)     // Catch:{ TQF -> 0x0c21 }
            r0 = r57
            X.Tdw r3 = r0.A02     // Catch:{ TQF -> 0x0c21 }
            int r2 = r19 + 1
            r1 = r29
            r0 = r20
            r3.EKM(r1, r2, r0)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x0c2f
        L_0x0b74:
            r2 = move-exception
            r0 = -274389898(0xffffffffefa52476, float:-1.0221821E29)
            X.AnonymousClass0fa.A03(r5, r0)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x0c20
        L_0x0b7d:
            java.lang.String r0 = "Missing required properties:"
            java.lang.IllegalStateException r2 = X.DbW.A0c(r0, r4)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x0c20
        L_0x0b85:
            java.lang.String r1 = "Missing required properties:"
            java.lang.IllegalStateException r0 = X.DbW.A0c(r1, r0)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x0b92
        L_0x0b8c:
            java.lang.String r0 = "Missing required properties:"
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r7)     // Catch:{ TQF -> 0x0c21 }
        L_0x0b92:
            throw r0     // Catch:{ TQF -> 0x0c21 }
        L_0x0b93:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0b9d }
            goto L_0x0b9c
        L_0x0b98:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0b9d }
        L_0x0b9c:
            throw r1     // Catch:{ all -> 0x0b9d }
        L_0x0b9d:
            r2 = move-exception
            r1 = -1029534431(0xffffffffc2a28d21, float:-81.27564)
            X.AnonymousClass0fa.A03(r10, r1)     // Catch:{ all -> 0x0bad }
            goto L_0x0bac
        L_0x0ba5:
            r2 = move-exception
            r1 = -1029534431(0xffffffffc2a28d21, float:-81.27564)
            X.AnonymousClass0fa.A03(r6, r1)     // Catch:{ all -> 0x0bad }
        L_0x0bac:
            throw r2     // Catch:{ all -> 0x0bad }
        L_0x0bad:
            r2 = move-exception
            r1 = -274389898(0xffffffffefa52476, float:-1.0221821E29)
            X.AnonymousClass0fa.A03(r0, r1)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x0c20
        L_0x0bb5:
            android.database.sqlite.SQLiteDatabase r4 = r27.A03()     // Catch:{ TQF -> 0x0c21 }
            r0 = r27
            X.C12524SwA.A02(r4, r0)     // Catch:{ TQF -> 0x0c21 }
            r0 = r57
            X.Tdy r0 = r0.A06     // Catch:{ all -> 0x0bfc }
            long r0 = r0.C7E()     // Catch:{ all -> 0x0bfc }
            long r0 = r0 + r16
            r3 = r30
            r2 = r29
            r3.EAu(r2, r0)     // Catch:{ all -> 0x0bfc }
            goto L_0x0bf3
        L_0x0bd0:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0bd5 }
            throw r0     // Catch:{ all -> 0x0bd5 }
        L_0x0bd5:
            r1 = move-exception
            r0 = -1029534431(0xffffffffc2a28d21, float:-81.27564)
            X.AnonymousClass0fa.A03(r3, r0)     // Catch:{ all -> 0x0bfc }
            throw r1     // Catch:{ all -> 0x0bfc }
        L_0x0bdd:
            android.database.sqlite.SQLiteDatabase r4 = r27.A03()     // Catch:{ TQF -> 0x0c21 }
            r0 = r27
            X.C12524SwA.A02(r4, r0)     // Catch:{ TQF -> 0x0c21 }
            r0 = r57
            X.Tdw r3 = r0.A02     // Catch:{ all -> 0x0bfc }
            int r2 = r19 + 1
            X.Sw9 r3 = (X.Sw9) r3     // Catch:{ all -> 0x0bfc }
            r0 = r29
            r3.EKM(r0, r2, r1)     // Catch:{ all -> 0x0bfc }
        L_0x0bf3:
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x0bfc }
            r0 = r28
            X.AnonymousClass0fa.A03(r4, r0)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x0c2f
        L_0x0bfc:
            r2 = move-exception
            r0 = -274389898(0xffffffffefa52476, float:-1.0221821E29)
            X.AnonymousClass0fa.A03(r4, r0)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x0c20
        L_0x0c04:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0c09 }
            throw r0     // Catch:{ all -> 0x0c09 }
        L_0x0c09:
            r1 = move-exception
            r0 = -1029534431(0xffffffffc2a28d21, float:-81.27564)
            X.AnonymousClass0fa.A03(r9, r0)     // Catch:{ all -> 0x0c11 }
        L_0x0c10:
            throw r1     // Catch:{ all -> 0x0c11 }
        L_0x0c11:
            r2 = move-exception
            r0 = -274389898(0xffffffffefa52476, float:-1.0221821E29)
            X.AnonymousClass0fa.A03(r8, r0)     // Catch:{ TQF -> 0x0c21 }
            goto L_0x0c20
        L_0x0c19:
            r2 = move-exception
            r0 = -274389898(0xffffffffefa52476, float:-1.0221821E29)
            X.AnonymousClass0fa.A03(r6, r0)     // Catch:{ TQF -> 0x0c21 }
        L_0x0c20:
            throw r2     // Catch:{ TQF -> 0x0c21 }
        L_0x0c21:
            r0 = r57
            X.Tdw r3 = r0.A02     // Catch:{ all -> 0x0c33 }
            int r2 = r19 + 1
            X.Sw9 r3 = (X.Sw9) r3     // Catch:{ all -> 0x0c33 }
            r1 = 0
            r0 = r29
            r3.EKM(r0, r2, r1)     // Catch:{ all -> 0x0c33 }
        L_0x0c2f:
            r56.run()
            return
        L_0x0c33:
            r0 = move-exception
            r56.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13062TJs.run():void");
    }
}
