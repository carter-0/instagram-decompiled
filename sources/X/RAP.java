package X;

import java.util.List;

public final class RAP extends 0ng {
    public final /* synthetic */ 0lg A00;
    public final /* synthetic */ 1J0 A01;
    public final /* synthetic */ List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAP(0lg r2, 1J0 r3, List list) {
        super(298);
        this.A01 = r3;
        this.A02 = list;
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r11v11, types: [X.RQn, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(23:2|3|4|(3:5|6|(3:8|(2:10|(4:12|(1:14)|15|98)(2:16|99))(1:(2:18|(2:22|103))(1:100))|96)(1:97))|23|24|25|(3:26|27|(1:29)(1:104))|30|38|39|(2:41|42)|43|44|45|47|48|(4:51|(4:53|(1:55)(1:(1:58)(1:59))|56|108)(1:107)|105|49)|106|60|(1:62)|63|64) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:65|66|67|68|(2:70|71)|72|73|74|75) */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e8, code lost:
        if (r2 == null) goto L_0x01ed;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0101 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x01c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x01c3 */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fe A[SYNTHETIC, Splitter:B:41:0x00fe] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f A[Catch:{ IOException -> 0x01c7, all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x019d A[Catch:{ IOException -> 0x01c7, all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bd A[SYNTHETIC, Splitter:B:70:0x01bd] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            X.1J0 r6 = r1.A01
            java.util.List r0 = r1.A02
            X.1J0.A00(r6, r0)
            X.0lg r5 = r1.A00
            java.io.File r7 = r6.A04
            java.lang.String r10 = r6.A05
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x01ee
            long r16 = java.lang.System.currentTimeMillis()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            r2 = 0
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x01ca }
            r0.<init>(r7)     // Catch:{ IOException -> 0x01ca }
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ IOException -> 0x01ca }
            r8.<init>(r0)     // Catch:{ IOException -> 0x01ca }
        L_0x002c:
            java.lang.String r0 = r8.readLine()     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            if (r0 == 0) goto L_0x00ac
            X.2jl r9 = new X.2jl     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            int r1 = r9.A00     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r15 = 1149239296(0x44800000, float:1024.0)
            r0 = 1
            if (r1 != r0) goto L_0x0088
            long r0 = r9.A03     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            long r13 = r16 - r0
            long r11 = X.C10106Rmi.A00     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0082
            int r12 = r9.A01     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.String r1 = r9.A05     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            int r0 = r1.hashCode()     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            int r0 = r0 * 10
            int r0 = r0 + r12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.Object r11 = r4.get(r0)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            X.RQn r11 = (X.C9138RQn) r11     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            if (r11 != 0) goto L_0x006b
            X.RQn r11 = new X.RQn     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r11.<init>()     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r11.A02 = r12     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r11.A05 = r1     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r4.put(r0, r11)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
        L_0x006b:
            int r0 = r11.A00     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            int r0 = r0 + 1
            r11.A00 = r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            long r0 = r9.A02     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            float r13 = (float) r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            float r13 = r13 / r15
            long r0 = r11.A03     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            float r12 = (float) r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            float r12 = r12 + r13
            long r0 = (long) r12     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r11.A03 = r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.String r0 = r9.A04     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r3.put(r0, r11)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            goto L_0x002c
        L_0x0082:
            java.lang.String r0 = r9.A04     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r3.remove(r0)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            goto L_0x002c
        L_0x0088:
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r9.A04     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            boolean r0 = r3.containsKey(r1)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            if (r0 == 0) goto L_0x002c
            java.lang.Object r11 = r3.remove(r1)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            X.RQn r11 = (X.C9138RQn) r11     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            if (r11 == 0) goto L_0x002c
            int r0 = r11.A01     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            int r0 = r0 + 1
            r11.A01 = r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            long r0 = r9.A02     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            float r12 = (float) r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            float r12 = r12 / r15
            long r0 = r11.A04     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            float r9 = (float) r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            float r9 = r9 + r12
            long r0 = (long) r9     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r11.A04 = r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            goto L_0x002c
        L_0x00ac:
            java.lang.String r1 = r7.getParent()     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.String r0 = "tmp_logger_clean"
            java.io.File r12 = new java.io.File     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r12.<init>(r1, r0)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r9 = 0
            r12.createNewFile()     // Catch:{ IOException -> 0x00e4, all -> 0x00e1 }
            r0 = 1
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00e4, all -> 0x00e1 }
            r3.<init>(r12, r0)     // Catch:{ IOException -> 0x00e4, all -> 0x00e1 }
            java.nio.charset.Charset r1 = X.C10106Rmi.A01     // Catch:{ IOException -> 0x00e4, all -> 0x00e1 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x00e4, all -> 0x00e1 }
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x00e4, all -> 0x00e1 }
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x00e4, all -> 0x00e1 }
            r11.<init>(r0)     // Catch:{ IOException -> 0x00e4, all -> 0x00e1 }
        L_0x00ce:
            java.lang.String r0 = r8.readLine()     // Catch:{ IOException -> 0x00df }
            if (r0 == 0) goto L_0x00db
            r11.write(r0)     // Catch:{ IOException -> 0x00df }
            r11.newLine()     // Catch:{ IOException -> 0x00df }
            goto L_0x00ce
        L_0x00db:
            r12.renameTo(r7)     // Catch:{ IOException -> 0x00df }
            goto L_0x00f9
        L_0x00df:
            r0 = move-exception
            goto L_0x00e6
        L_0x00e1:
            r0 = move-exception
            goto L_0x01b8
        L_0x00e4:
            r0 = move-exception
            r11 = r2
        L_0x00e6:
            java.lang.String r9 = "IgCacheLoggerImpl"
            java.lang.String r3 = "IOException when re writing logs into new file: %s. Error: %s"
            java.lang.String r1 = r7.getName()     // Catch:{ all -> 0x01b6 }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x01b6 }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r3, r1, r0)     // Catch:{ all -> 0x01b6 }
            X.0wb.A03(r9, r0)     // Catch:{ all -> 0x01b6 }
        L_0x00f9:
            X.JTR.A1O(r12)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            if (r11 == 0) goto L_0x0101
            r11.close()     // Catch:{ IOException -> 0x0101 }
        L_0x0101:
            r8.close()     // Catch:{ IOException -> 0x0104 }
        L_0x0104:
            r3 = 0
            java.util.Iterator r12 = X.AnonymousClass7TF.A0s(r4)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
        L_0x0109:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            if (r0 == 0) goto L_0x0199
            java.util.Map$Entry r11 = X.AnonymousClass7TE.A1J(r12)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.Object r0 = r11.getValue()     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            X.RQn r0 = (X.C9138RQn) r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            int r0 = r0.A00     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            if (r0 <= 0) goto L_0x0109
            java.lang.String r1 = "ig_cache_stats"
            java.lang.Object r0 = r11.getValue()     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            X.RQn r0 = (X.C9138RQn) r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.String r0 = r0.A05     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            X.0xI r4 = X.0xI.A01(r1, r0)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.String r0 = "cache_type"
            r4.A0C(r0, r10)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.String r9 = "source"
            java.lang.Object r0 = r11.getValue()     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            X.RQn r0 = (X.C9138RQn) r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            int r1 = r0.A02     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r0 = 1
            if (r1 != r0) goto L_0x018f
            java.lang.String r0 = "on_screen"
        L_0x0141:
            r4.A0C(r9, r0)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.String r9 = "kb_used"
            java.lang.Object r0 = r11.getValue()     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            X.RQn r0 = (X.C9138RQn) r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            long r0 = r0.A04     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r4.A0B(r9, r0)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.String r1 = "items_used"
            java.lang.Object r0 = r11.getValue()     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            X.RQn r0 = (X.C9138RQn) r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            int r0 = r0.A01     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r4.A08(r0, r1)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.String r9 = "kb_stored"
            java.lang.Object r0 = r11.getValue()     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            X.RQn r0 = (X.C9138RQn) r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            long r0 = r0.A03     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r4.A0B(r9, r0)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.String r1 = "items_stored"
            java.lang.Object r0 = r11.getValue()     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            X.RQn r0 = (X.C9138RQn) r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            int r0 = r0.A00     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r4.A08(r0, r1)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            X.DbU.A1R(r4, r5)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            int r3 = r3 + 1
            goto L_0x0109
        L_0x018f:
            if (r1 != 0) goto L_0x0195
            java.lang.String r0 = "off_screen"
            goto L_0x0141
        L_0x0195:
            java.lang.String r0 = "undefined"
            goto L_0x0141
        L_0x0199:
            r0 = 100
            if (r3 <= r0) goto L_0x01b2
            java.lang.String r0 = "ig_cache_stats_overflow"
            r0.getClass()     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            X.0xI r2 = X.0xI.A01(r0, r2)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            java.lang.String r1 = "events_reported"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            r2.A08(r0, r1)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            X.DbU.A1R(r2, r5)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
        L_0x01b2:
            r8.close()     // Catch:{ IOException -> 0x01ee }
            goto L_0x01ee
        L_0x01b6:
            r0 = move-exception
            r9 = r11
        L_0x01b8:
            X.JTR.A1O(r12)     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
            if (r9 == 0) goto L_0x01c0
            r9.close()     // Catch:{ IOException -> 0x01c0 }
        L_0x01c0:
            r8.close()     // Catch:{ IOException -> 0x01c3 }
        L_0x01c3:
            throw r0     // Catch:{ IOException -> 0x01c7, all -> 0x01c4 }
        L_0x01c4:
            r0 = move-exception
            r2 = r8
            goto L_0x01ea
        L_0x01c7:
            r0 = move-exception
            r2 = r8
            goto L_0x01cb
        L_0x01ca:
            r0 = move-exception
        L_0x01cb:
            r7.delete()     // Catch:{ all -> 0x01e7 }
            java.lang.String r4 = "IgCacheLoggerImpl"
            java.lang.String r3 = "IOException when reading logs at CacheLoggerUtil. File: %s. Error found: %s"
            java.lang.String r1 = r7.getName()     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r3, r1, r0)     // Catch:{ all -> 0x01e7 }
            X.0wb.A03(r4, r0)     // Catch:{ all -> 0x01e7 }
            if (r2 == 0) goto L_0x01ee
            r2.close()     // Catch:{ IOException -> 0x01ee }
            goto L_0x01ee
        L_0x01e7:
            r0 = move-exception
            if (r2 == 0) goto L_0x01ed
        L_0x01ea:
            r2.close()     // Catch:{ IOException -> 0x01ed }
        L_0x01ed:
            throw r0
        L_0x01ee:
            java.util.concurrent.atomic.AtomicInteger r3 = r6.A01
            int r0 = r3.get()
            if (r0 <= 0) goto L_0x0214
            r1 = 0
            java.lang.String r0 = "ig_cache_report_loss"
            r0.getClass()
            X.0xI r2 = X.0xI.A01(r0, r1)
            int r0 = r3.get()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "count"
            r2.A08(r1, r0)
            X.DbU.A1R(r2, r5)
            r0 = 0
            r3.set(r0)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RAP.run():void");
    }
}
