package X;

/* renamed from: X.59n  reason: invalid class name and case insensitive filesystem */
public final class C2817759n implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C2817659m A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C2817759n(C2817659m r1, String str, String str2, long j, long j2) {
        this.A02 = r1;
        this.A01 = j;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00cb, code lost:
        if (r19 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cd, code lost:
        r8 = r12.A02;
        r9 = r8.A00(r8.A00, "idle_profiler");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00dd, code lost:
        if (r9.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00df, code lost:
        r10 = r11.replaceAll("[0-9]", "X");
        r9.AAJ("log_type", "dup_request");
        r9.AAJ("start_time_gmt", X.002.A0Q("", r1));
        r9.AAJ("cpu_cycles", "ig4a");
        r7 = android.os.SystemClock.uptimeMillis();
        r0 = X.0LA.A06;
        r9.AAJ("request_json", X.002.A0Q("", r7));
        r9.AAJ("request_friendly_name", r10);
        r9.AAJ("window_failure_reason", X.002.A0Q("", r3 - r17));
        r9.A7p("window_outcome", true);
        r9.AAJ("time_zone", X.002.A0Q("", r5 - r1));
        r9.AAJ("end_time_gmt", X.002.A0Q("", r5));
        r9.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x013d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r17 = 0
            r1 = 0
            r3 = r22
            X.59m r12 = r3.A02
            android.content.Context r9 = r12.A01
            long r5 = r3.A01
            java.lang.String r11 = r3.A03
            java.lang.String r0 = r3.A04
            r21 = r0
            long r3 = r3.A00
            java.lang.Class<X.59o> r20 = X.C2817859o.class
            monitor-enter(r20)
            r14 = 0
            java.lang.String r8 = "DuplicateRequestDetector.db"
            r7 = 2
            X.59p r0 = new X.59p     // Catch:{ NumberFormatException -> 0x0147, all -> 0x0149 }
            r0.<init>(r9, r8, r14, r7)     // Catch:{ NumberFormatException -> 0x0147, all -> 0x0149 }
            android.database.sqlite.SQLiteDatabase r10 = r0.getWritableDatabase()     // Catch:{ NumberFormatException -> 0x0147, all -> 0x0149 }
            java.lang.String r7 = "SELECT * FROM %s WHERE %s = '%s' ORDER BY %s DESC LIMIT 1"
            java.lang.String r9 = "DUPLICATE_REQUEST_DETECTOR_LOGS"
            java.lang.String r15 = "log_request_name"
            java.lang.String r0 = "_id"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r7, r9, r15, r11, r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            android.database.Cursor r13 = r10.rawQuery(r0, r14)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            boolean r0 = r13.moveToNext()     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r19 = 0
            if (r0 == 0) goto L_0x006f
            r19 = 1
            java.lang.String r0 = "log_date"
            int r1 = r13.getColumnIndex(r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            int r17 = r13.getColumnIndex(r15)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            java.lang.String r0 = "log_request_url"
            int r16 = r13.getColumnIndex(r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            java.lang.String r0 = "log_diff_since_prev_ms"
            int r8 = r13.getColumnIndex(r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            java.lang.String r0 = "log_request_real_time_ms"
            int r7 = r13.getColumnIndex(r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            long r1 = r13.getLong(r1)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r0 = r17
            r13.getString(r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r0 = r16
            r13.getString(r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r13.getLong(r8)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            long r17 = r13.getLong(r7)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
        L_0x006f:
            r13.close()     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            java.lang.String r8 = "log_date"
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r7.put(r8, r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r7.put(r15, r11)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            java.lang.String r8 = "log_request_url"
            r0 = r21
            r7.put(r8, r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            java.lang.String r8 = "log_diff_since_prev_ms"
            if (r19 == 0) goto L_0x0091
            long r15 = r5 - r1
            goto L_0x0093
        L_0x0091:
            r15 = -1
        L_0x0093:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r7.put(r8, r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            java.lang.String r8 = "log_request_real_time_ms"
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r7.put(r8, r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r0 = 15247584(0xe8a8e0, float:2.1366416E-38)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r10.insert(r9, r14, r7)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r0 = 710721969(0x2a5cc1b1, float:1.9607125E-13)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r13 = 604800000(0x240c8400, double:2.988109026E-315)
            long r7 = r5 - r13
            java.lang.String r14 = "log_date < ?"
            r15 = 1
            java.lang.String r13 = ""
            java.lang.String r0 = X.002.A0Q(r13, r7)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r10.delete(r9, r14, r0)     // Catch:{ NumberFormatException -> 0x0142, all -> 0x013e }
            r10.close()     // Catch:{ all -> 0x014f }
            monitor-exit(r20)
            if (r19 == 0) goto L_0x0148
            X.0Ae r8 = r12.A02
            java.lang.String r7 = "idle_profiler"
            X.0wc r8 = (X.0wc) r8
            X.0kJ r0 = r8.A00
            X.0Aj r9 = r8.A00(r0, r7)
            boolean r0 = r9.isSampled()
            if (r0 == 0) goto L_0x0148
            java.lang.String r7 = "[0-9]"
            java.lang.String r0 = "X"
            java.lang.String r10 = r11.replaceAll(r7, r0)
            java.lang.String r7 = "dup_request"
            java.lang.String r0 = "log_type"
            r9.AAJ(r0, r7)
            java.lang.String r7 = X.002.A0Q(r13, r1)
            java.lang.String r0 = "start_time_gmt"
            r9.AAJ(r0, r7)
            java.lang.String r7 = "ig4a"
            java.lang.String r0 = "cpu_cycles"
            r9.AAJ(r0, r7)
            long r7 = android.os.SystemClock.uptimeMillis()
            boolean r0 = X.0LA.A06
            java.lang.String r7 = X.002.A0Q(r13, r7)
            java.lang.String r0 = "request_json"
            r9.AAJ(r0, r7)
            java.lang.String r0 = "request_friendly_name"
            r9.AAJ(r0, r10)
            long r3 = r3 - r17
            java.lang.String r3 = X.002.A0Q(r13, r3)
            java.lang.String r0 = "window_failure_reason"
            r9.AAJ(r0, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            java.lang.String r0 = "window_outcome"
            r9.A7p(r0, r3)
            long r3 = r5 - r1
            java.lang.String r1 = X.002.A0Q(r13, r3)
            java.lang.String r0 = "time_zone"
            r9.AAJ(r0, r1)
            java.lang.String r1 = X.002.A0Q(r13, r5)
            java.lang.String r0 = "end_time_gmt"
            r9.AAJ(r0, r1)
            r9.Cgf()
            return
        L_0x013e:
            r0 = move-exception
            if (r10 == 0) goto L_0x014e
            goto L_0x014b
        L_0x0142:
            if (r10 == 0) goto L_0x0147
            r10.close()     // Catch:{ all -> 0x014f }
        L_0x0147:
            monitor-exit(r20)
        L_0x0148:
            return
        L_0x0149:
            r0 = move-exception
            goto L_0x014e
        L_0x014b:
            r10.close()     // Catch:{ all -> 0x014f }
        L_0x014e:
            throw r0     // Catch:{ all -> 0x014f }
        L_0x014f:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2817759n.run():void");
    }
}
