package X;

public final class TH8 implements Runnable {
    public final /* synthetic */ C8481QvT A00;
    public final /* synthetic */ C11250SHk A01;

    public TH8(C8481QvT qvT, C11250SHk sHk) {
        this.A00 = qvT;
        this.A01 = sHk;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.String, android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r14v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d3, code lost:
        if (r14 == 0) goto L_0x01dd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r1 = r26
            X.QvT r0 = r1.A00
            X.Qvc r3 = r0.A00
            X.SHk r2 = r1.A01
            X.AnonymousClass3Qk.A02(r2)
            X.C11200SFa.A00()
            r3.A0J()
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x00ff
            java.lang.String r1 = "Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions"
            r0 = 3
            X.ST5.A0B(r3, r1, r0)
        L_0x001b:
            java.lang.String r8 = "_m"
            java.lang.String r15 = ""
            X.AnonymousClass3Qk.A04(r8)
            java.lang.String r0 = "&"
            boolean r0 = r8.startsWith(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "Short param name required"
            X.AnonymousClass3Qk.A08(r1, r0)
            java.util.Map r9 = r2.A04
            java.lang.String r0 = X.DbT.A11(r8, r9)
            r1 = r15
            if (r0 == 0) goto L_0x0039
            r1 = r0
        L_0x0039:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0080
            X.SQt r0 = r3.A00
            X.QvY r0 = r0.A0D
            X.C11381SQt.A02(r0)
            X.SEI r10 = r0.A03
            X.QvY r11 = r10.A01
            android.content.SharedPreferences r6 = r11.A00
            java.lang.String r14 = "monitoring"
            java.lang.String r1 = java.lang.String.valueOf(r14)
            java.lang.String r0 = ":start"
            java.lang.String r0 = r1.concat(r0)
            r4 = 0
            long r12 = r6.getLong(r0, r4)
            r0 = 0
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x006e
            long r4 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r4
            long r4 = java.lang.Math.abs(r12)
        L_0x006e:
            long r6 = r10.A00
            r12 = 0
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x0080
            r25 = 1
            long r6 = r6 << r25
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x0092
            X.SEI.A00(r10)
        L_0x0080:
            X.C8490Qvc.A03(r3)
            X.QvZ r0 = r3.A03
            boolean r0 = r0.A0L(r2)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = "Hit sent to the device AnalyticsService for delivery"
            r0 = 3
            X.ST5.A0B(r3, r1, r0)
            return
        L_0x0092:
            android.content.SharedPreferences r6 = r11.A00
            java.lang.String r5 = java.lang.String.valueOf(r14)
            java.lang.String r4 = ":value"
            java.lang.String r4 = r5.concat(r4)
            java.lang.String r7 = r6.getString(r4, r12)
            android.content.SharedPreferences r6 = r11.A00
            java.lang.String r5 = java.lang.String.valueOf(r14)
            java.lang.String r4 = ":count"
            java.lang.String r4 = r5.concat(r4)
            long r5 = r6.getLong(r4, r0)
            X.SEI.A00(r10)
            if (r7 == 0) goto L_0x0080
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0080
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            android.util.Pair r5 = X.Pxe.A0K(r7, r4)
            java.lang.Object r4 = r5.second
            java.lang.Object r7 = r5.first
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r4 = X.Pxf.A09(r6)
            int r4 = r4 + 1
            java.lang.StringBuilder r5 = X.Pxh.A0q(r7, r4)
            r5.append(r6)
            java.lang.String r4 = ":"
            java.lang.String r4 = X.Pxg.A0s(r4, r7, r5)
            java.util.HashMap r7 = X.Pxe.A19(r9)
            r7.put(r8, r4)
            long r4 = r2.A02
            r20 = 0
            java.util.List r6 = r2.A03
            X.SHk r2 = new X.SHk
            r21 = r4
            r23 = r0
            r16 = r2
            r17 = r3
            r18 = r6
            r19 = r7
            r16.<init>(r17, r18, r19, r20, r21, r23, r25)
            goto L_0x0080
        L_0x00ff:
            java.lang.String r0 = "Delivering hit"
            r3.A0E(r0, r2)
            goto L_0x001b
        L_0x0106:
            X.Qvd r4 = r3.A04     // Catch:{ SQLiteException -> 0x0256 }
            X.C11200SFa.A00()     // Catch:{ SQLiteException -> 0x0256 }
            r4.A0J()     // Catch:{ SQLiteException -> 0x0256 }
            android.net.Uri$Builder r7 = X.Pxe.A0I()     // Catch:{ SQLiteException -> 0x0256 }
            java.util.Map r0 = r2.A04     // Catch:{ SQLiteException -> 0x0256 }
            java.util.Iterator r6 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ SQLiteException -> 0x0256 }
        L_0x0118:
            boolean r0 = r6.hasNext()     // Catch:{ SQLiteException -> 0x0256 }
            if (r0 == 0) goto L_0x0147
            java.util.Map$Entry r5 = X.AnonymousClass7TE.A1J(r6)     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.String r1 = X.DbT.A13(r5)     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.String r0 = "ht"
            boolean r0 = r0.equals(r1)     // Catch:{ SQLiteException -> 0x0256 }
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = "qt"
            boolean r0 = r0.equals(r1)     // Catch:{ SQLiteException -> 0x0256 }
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = "AppUID"
            boolean r0 = r0.equals(r1)     // Catch:{ SQLiteException -> 0x0256 }
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = X.DbS.A0s(r5)     // Catch:{ SQLiteException -> 0x0256 }
            r7.appendQueryParameter(r1, r0)     // Catch:{ SQLiteException -> 0x0256 }
            goto L_0x0118
        L_0x0147:
            android.net.Uri r0 = r7.build()     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.String r5 = r0.getEncodedQuery()     // Catch:{ SQLiteException -> 0x0256 }
            if (r5 != 0) goto L_0x0152
            r5 = r15
        L_0x0152:
            int r1 = r5.length()     // Catch:{ SQLiteException -> 0x0256 }
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 <= r0) goto L_0x016b
            X.SQt r0 = r4.A00     // Catch:{ SQLiteException -> 0x0256 }
            X.QvX r1 = r0.A0C     // Catch:{ SQLiteException -> 0x0256 }
            X.C11381SQt.A02(r1)     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.String r0 = "Hit length exceeds the maximum allowed size"
            r1.A0K(r2, r0)     // Catch:{ SQLiteException -> 0x0256 }
        L_0x0166:
            r3.A0L()     // Catch:{ SQLiteException -> 0x0256 }
            goto L_0x024e
        L_0x016b:
            X.SNL r0 = X.SDN.A0E     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.Object r0 = r0.A00     // Catch:{ SQLiteException -> 0x0256 }
            int r1 = X.AnonymousClass7TE.A0M(r0)     // Catch:{ SQLiteException -> 0x0256 }
            long r9 = X.C8491Qvd.A00(r4)     // Catch:{ SQLiteException -> 0x0256 }
            int r0 = r1 + -1
            long r6 = (long) r0     // Catch:{ SQLiteException -> 0x0256 }
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e9
            long r0 = (long) r1     // Catch:{ SQLiteException -> 0x0256 }
            long r9 = r9 - r0
            r0 = 1
            long r9 = r9 + r0
            java.lang.String r8 = "hit_id"
            X.C11200SFa.A00()     // Catch:{ SQLiteException -> 0x0256 }
            r4.A0J()     // Catch:{ SQLiteException -> 0x0256 }
            r6 = 0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0192
            goto L_0x01d9
        L_0x0192:
            android.database.sqlite.SQLiteDatabase r11 = r4.A0K()     // Catch:{ SQLiteException -> 0x0256 }
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()     // Catch:{ SQLiteException -> 0x0256 }
            r14 = 0
            java.lang.String r12 = "hits2"
            r7 = 0
            java.lang.String[] r13 = new java.lang.String[]{r8}     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r1 = "%s ASC"
            java.lang.Object[] r0 = new java.lang.Object[]{r8}     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r18 = java.lang.String.format(r1, r0)     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r19 = java.lang.Long.toString(r9)     // Catch:{ SQLiteException -> 0x01cd }
            r15 = r14
            r16 = r14
            r17 = r14
            android.database.Cursor r14 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x01cd }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x01cd }
            if (r0 == 0) goto L_0x01d5
        L_0x01bf:
            long r0 = r14.getLong(r7)     // Catch:{ SQLiteException -> 0x01cd }
            X.AnonymousClass7TE.A1Y(r6, r0)     // Catch:{ SQLiteException -> 0x01cd }
            boolean r0 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x01cd }
            if (r0 != 0) goto L_0x01bf
            goto L_0x01d5
        L_0x01cd:
            r1 = move-exception
            java.lang.String r0 = "Error selecting hit ids"
            r4.A0G(r0, r1)     // Catch:{ all -> 0x024f }
            if (r14 == 0) goto L_0x01dd
        L_0x01d5:
            r14.close()     // Catch:{ SQLiteException -> 0x0256 }
            goto L_0x01dd
        L_0x01d9:
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0256 }
        L_0x01dd:
            java.lang.Integer r1 = X.C51968G9o.A0t(r6)     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.String r0 = "Store full, deleting hits to make room, count"
            r4.A0G(r0, r1)     // Catch:{ SQLiteException -> 0x0256 }
            r4.A0N(r6)     // Catch:{ SQLiteException -> 0x0256 }
        L_0x01e9:
            android.database.sqlite.SQLiteDatabase r7 = r4.A0K()     // Catch:{ SQLiteException -> 0x0256 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0256 }
            r6.<init>()     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.String r0 = "hit_string"
            r6.put(r0, r5)     // Catch:{ SQLiteException -> 0x0256 }
            long r0 = r2.A02     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.String r0 = "hit_time"
            r6.put(r0, r1)     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.Integer r1 = X.C51967G9n.A0k()     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.String r0 = "hit_app_id"
            r6.put(r0, r1)     // Catch:{ SQLiteException -> 0x0256 }
            X.SNL r0 = X.SDN.A0N     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.Object r1 = r0.A00     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.String r0 = "hit_url"
            r6.put(r0, r1)     // Catch:{ SQLiteException -> 0x0256 }
            java.lang.String r5 = "hits2"
            r1 = 0
            r0 = -237847429(0xfffffffff1d2bc7b, float:-2.0870308E30)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLiteException -> 0x0246 }
            long r7 = r7.insert(r5, r1, r6)     // Catch:{ SQLiteException -> 0x0246 }
            r0 = -841256629(0xffffffffcddb714b, float:-4.60204384E8)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLiteException -> 0x0246 }
            r5 = -1
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0237
            java.lang.String r1 = "Failed to insert a hit (got -1)"
            r0 = 6
            X.ST5.A0B(r4, r1, r0)     // Catch:{ SQLiteException -> 0x0246 }
            goto L_0x0166
        L_0x0237:
            java.lang.String r9 = "Hit saved to database. db-id, hit"
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0246 }
            r10 = 3
            r5 = r4
            r7 = r2
            r8 = r1
            X.ST5.A0A(r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0246 }
            goto L_0x0166
        L_0x0246:
            r1 = move-exception
            java.lang.String r0 = "Error storing a hit"
            r4.A0H(r0, r1)     // Catch:{ SQLiteException -> 0x0256 }
            goto L_0x0166
        L_0x024e:
            return
        L_0x024f:
            r0 = move-exception
            if (r14 == 0) goto L_0x0255
            r14.close()     // Catch:{ SQLiteException -> 0x0256 }
        L_0x0255:
            throw r0     // Catch:{ SQLiteException -> 0x0256 }
        L_0x0256:
            r1 = move-exception
            java.lang.String r0 = "Delivery failed to save hit to a database"
            r3.A0H(r0, r1)
            X.SQt r0 = r3.A00
            X.QvX r1 = r0.A0C
            X.C11381SQt.A02(r1)
            java.lang.String r0 = "deliver: failed to insert hit to database"
            r1.A0K(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TH8.run():void");
    }
}
