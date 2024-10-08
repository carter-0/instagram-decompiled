package X;

public final class TJ1 implements Runnable {
    public final /* synthetic */ C8481QvT A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;

    public TJ1(C8481QvT qvT, Runnable runnable, String str) {
        this.A00 = qvT;
        this.A02 = str;
        this.A01 = runnable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0194, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0195, code lost:
        r14 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r6 = r26
            X.QvT r0 = r6.A00
            X.Qvc r5 = r0.A00
            java.lang.String r7 = r6.A02
            X.AnonymousClass3Qk.A04(r7)
            X.C11200SFa.A00()
            X.SQt r1 = r5.A00
            X.QvX r0 = r1.A0C
            X.C11381SQt.A02(r0)
            X.Qon r8 = X.C11304SKp.A00(r0, r7)
            if (r8 != 0) goto L_0x0026
            java.lang.String r0 = "Parsing failed. Ignoring invalid campaign data"
            r5.A0G(r0, r7)
        L_0x0020:
            java.lang.Runnable r0 = r6.A01
            r0.run()
            return
        L_0x0026:
            X.QvY r3 = r1.A0D
            X.C11381SQt.A02(r3)
            X.C11200SFa.A00()
            r3.A0J()
            android.content.SharedPreferences r1 = r3.A00
            java.lang.String r4 = "installation_campaign"
            r0 = 0
            java.lang.String r2 = r1.getString(r4, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x0041
            r2 = r0
        L_0x0041:
            boolean r1 = r7.equals(r2)
            if (r1 == 0) goto L_0x004e
            java.lang.String r1 = "Ignoring duplicate install campaign"
            r0 = 5
            X.ST5.A0B(r5, r1, r0)
            goto L_0x0020
        L_0x004e:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x005f
            java.lang.String r12 = "Ignoring multiple install campaigns. original, new"
            r13 = 6
            r8 = r5
            r9 = r2
            r10 = r7
            r11 = r0
            X.ST5.A0A(r8, r9, r10, r11, r12, r13)
            goto L_0x0020
        L_0x005f:
            X.C11381SQt.A02(r3)
            X.C11200SFa.A00()
            r3.A0J()
            android.content.SharedPreferences r1 = r3.A00
            android.content.SharedPreferences$Editor r2 = r1.edit()
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L_0x00a8
            r2.remove(r4)
        L_0x0077:
            boolean r1 = r2.commit()
            if (r1 != 0) goto L_0x0083
            java.lang.String r2 = "Failed to commit campaign data"
            r1 = 5
            X.ST5.A0B(r3, r2, r1)
        L_0x0083:
            X.C11381SQt.A02(r3)
            X.SQt r1 = r3.A00
            X.Tb0 r4 = r1.A04
            long r1 = r3.A0K()
            X.SGt r3 = new X.SGt
            r3.<init>(r4, r1)
            X.SNL r1 = X.SDN.A04
            java.lang.Object r1 = r1.A00
            long r1 = X.AnonymousClass7TE.A0R(r1)
            boolean r1 = r3.A00(r1)
            if (r1 == 0) goto L_0x00ac
            java.lang.String r0 = "Campaign received too late, ignoring"
            r5.A0G(r0, r8)
            goto L_0x0020
        L_0x00a8:
            r2.putString(r4, r7)
            goto L_0x0077
        L_0x00ac:
            java.lang.String r1 = "Received installation campaign"
            r5.A0F(r1, r8)
            X.Qvd r7 = r5.A04
            r7.A0J()
            X.C11200SFa.A00()
            android.database.sqlite.SQLiteDatabase r17 = r7.A0K()
            r16 = 5
            java.lang.String r13 = "cid"
            r4 = 0
            java.lang.String r12 = "tid"
            r15 = 1
            java.lang.String r11 = "adid"
            r10 = 2
            java.lang.String r2 = "hits_count"
            r9 = 3
            java.lang.String r1 = "params"
            r3 = 4
            java.lang.String[] r19 = new java.lang.String[]{r13, r12, r11, r2, r1}     // Catch:{ SQLiteException -> 0x0194, all -> 0x0192 }
            X.SNL r1 = X.SDN.A0F     // Catch:{ SQLiteException -> 0x0194, all -> 0x0192 }
            java.lang.Object r1 = r1.A00     // Catch:{ SQLiteException -> 0x0194, all -> 0x0192 }
            int r2 = X.Pxe.A09(r1)     // Catch:{ SQLiteException -> 0x0194, all -> 0x0192 }
            java.lang.String r25 = java.lang.String.valueOf(r2)     // Catch:{ SQLiteException -> 0x0194, all -> 0x0192 }
            java.lang.String r20 = "app_uid=?"
            java.lang.String r1 = "0"
            java.lang.String[] r21 = new java.lang.String[]{r1}     // Catch:{ SQLiteException -> 0x0194, all -> 0x0192 }
            java.lang.String r18 = "properties"
            r22 = r0
            r23 = r0
            r24 = r0
            android.database.Cursor r14 = r17.query(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ SQLiteException -> 0x0194, all -> 0x0192 }
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()     // Catch:{ SQLiteException -> 0x0190 }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0190 }
            if (r0 == 0) goto L_0x0149
        L_0x00ff:
            java.lang.String r12 = r14.getString(r4)     // Catch:{ SQLiteException -> 0x0190 }
            java.lang.String r11 = r14.getString(r15)     // Catch:{ SQLiteException -> 0x0190 }
            int r0 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0190 }
            boolean r23 = X.AnonymousClass7TF.A1P(r0)
            int r0 = r14.getInt(r9)     // Catch:{ SQLiteException -> 0x0190 }
            long r0 = (long) r0     // Catch:{ SQLiteException -> 0x0190 }
            r17 = r0
            java.lang.String r1 = r14.getString(r3)     // Catch:{ SQLiteException -> 0x0190 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ SQLiteException -> 0x0190 }
            if (r0 == 0) goto L_0x015d
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x0190 }
            r1.<init>(r4)     // Catch:{ SQLiteException -> 0x0190 }
        L_0x0125:
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ SQLiteException -> 0x0190 }
            if (r0 != 0) goto L_0x0157
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ SQLiteException -> 0x0190 }
            if (r0 != 0) goto L_0x0157
            X.RxY r0 = new X.RxY     // Catch:{ SQLiteException -> 0x0190 }
            r20 = r1
            r21 = r17
            r17 = r0
            r18 = r12
            r19 = r11
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ SQLiteException -> 0x0190 }
            r13.add(r0)     // Catch:{ SQLiteException -> 0x0190 }
        L_0x0143:
            boolean r0 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0190 }
            if (r0 != 0) goto L_0x00ff
        L_0x0149:
            int r0 = r13.size()     // Catch:{ SQLiteException -> 0x0190 }
            if (r0 < r2) goto L_0x0179
            java.lang.String r1 = "Sending hits to too many properties. Campaign report might be incorrect"
            r0 = r16
            X.ST5.A0B(r7, r1, r0)     // Catch:{ SQLiteException -> 0x0190 }
            goto L_0x0179
        L_0x0157:
            java.lang.String r0 = "Read property with empty client id or tracker id"
            r7.A0D(r12, r11, r0)     // Catch:{ SQLiteException -> 0x0190 }
            goto L_0x0143
        L_0x015d:
            java.lang.String r0 = "?"
            java.lang.String r1 = X.Pxh.A0m(r0, r1)     // Catch:{ URISyntaxException -> 0x016d }
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x016d }
            r0.<init>(r1)     // Catch:{ URISyntaxException -> 0x016d }
            java.util.Map r1 = X.C11161SCv.A00(r0)     // Catch:{ URISyntaxException -> 0x016d }
            goto L_0x0125
        L_0x016d:
            r1 = move-exception
            java.lang.String r0 = "Error parsing property parameters"
            r7.A0H(r0, r1)     // Catch:{ SQLiteException -> 0x0190 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x0190 }
            r1.<init>(r4)     // Catch:{ SQLiteException -> 0x0190 }
            goto L_0x0125
        L_0x0179:
            r14.close()
            java.util.Iterator r1 = r13.iterator()
        L_0x0180:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r1.next()
            X.RxY r0 = (X.C10754RxY) r0
            X.C8490Qvc.A02(r0, r5, r8)
            goto L_0x0180
        L_0x0190:
            r1 = move-exception
            goto L_0x0196
        L_0x0192:
            r0 = move-exception
            throw r0
        L_0x0194:
            r1 = move-exception
            r14 = 0
        L_0x0196:
            java.lang.String r0 = "Error loading hits from the database"
            r7.A0H(r0, r1)     // Catch:{ all -> 0x019c }
            throw r1     // Catch:{ all -> 0x019c }
        L_0x019c:
            r0 = move-exception
            if (r14 == 0) goto L_0x01a2
            r14.close()
        L_0x01a2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TJ1.run():void");
    }
}
