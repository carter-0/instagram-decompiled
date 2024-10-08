package X;

/* renamed from: X.4xj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C278914xj implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 2QF A01;
    public final /* synthetic */ 2Pn A02;
    public final /* synthetic */ C278904xi A03;
    public final /* synthetic */ C278884xg A04;

    public /* synthetic */ C278914xj(2QF r1, 2Pn r2, C278904xi r3, C278884xg r4, int i) {
        this.A00 = i;
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0733, code lost:
        r3 = r35.A0C;
        r2 = r35.A07;
        r0 = r35.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        X.0Sd.A00(r35.A0C);
        X.0Sd.A00(r35.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0753, code lost:
        if (r10 == null) goto L_0x0774;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0755, code lost:
        X.2Pm.A01(r10, r35.A07, "upload_failed", r35.A0C, r49, r35.A00, r35.A02, r35.A01, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0774, code lost:
        r4 = r33.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0778, code lost:
        if (r4 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x077a, code lost:
        r4.A01("hprof_upload_failed_network_error", new java.lang.String[]{"dump_cause", r35.A0C, "dump_cause_details", r35.A0B, "hprof_id", r35.A07.toString(), "file_size", java.lang.String.valueOf(r11), "number_of_chunks", java.lang.String.valueOf(r35.A02), "current_chunk_index", java.lang.String.valueOf(r35.A01), "error_message", r49});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x07af, code lost:
        if (r10 == null) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:?, code lost:
        r42 = r1 - 1;
        r37 = "upload_succeeded";
        r35 = r10;
        r36 = r2;
        r38 = r3;
        r40 = r0;
        r41 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x07c6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:?, code lost:
        r2 = new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x07cd, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        r2 = new java.lang.IllegalArgumentException(X.002.A0O("Unknown compression type ", r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x07db, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:?, code lost:
        X.0Sd.A00(r35.A0C);
        X.0Sd.A00(r35.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x07e6, code lost:
        if (r10 != null) goto L_0x07e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x07e8, code lost:
        r6 = r35.A0C;
        X.2Pm.A01(r10, r35.A07, "upload_failed", r6, r1.getMessage(), r35.A00, r35.A02, r35.A01, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0809, code lost:
        r4 = r33.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x080d, code lost:
        if (r4 != null) goto L_0x080f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x080f, code lost:
        r4.A00("hprof_upload_failed", r1, new java.lang.String[]{"dump_cause", r35.A0C, "dump_cause_details", r35.A0B, "hprof_id", r35.A07.toString(), "file_size", java.lang.String.valueOf(r11), "number_of_chunks", java.lang.String.valueOf(r35.A02), "current_chunk_index", java.lang.String.valueOf(r35.A01)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0191, code lost:
        if (r1.exists() != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01cd, code lost:
        if (r2.canRead() == false) goto L_0x01cf;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x02f1 */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0481 A[Catch:{ IOException -> 0x039a, all -> 0x0a9e }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x07db A[ExcHandler: IOException | JSONException (r1v58 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:202:0x0537] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0199 A[Catch:{ IOException -> 0x039a, all -> 0x0a9e }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01db A[Catch:{ IOException -> 0x039a, all -> 0x0a9e }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e7 A[Catch:{ IOException -> 0x039a, all -> 0x0a9e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r65 = this;
            r3 = r65
            int r0 = r3.A00
            r64 = r0
            X.4xi r2 = r3.A03
            X.2QF r1 = r3.A01
            X.2Pn r0 = r3.A02
            r63 = r0
            X.4xg r0 = r3.A04
            r62 = r0
            r34 = 0
            r17 = 1
            r0 = r17
            r2.A01 = r0     // Catch:{ all -> 0x0aa7 }
            X.4xm r33 = r1.A04()     // Catch:{ all -> 0x0aa7 }
            r0 = r33
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0A     // Catch:{ all -> 0x0aa7 }
            r61 = r0
            r2 = r0
            r1 = r34
            r0 = r17
            boolean r0 = r2.compareAndSet(r1, r0)     // Catch:{ all -> 0x0aa7 }
            if (r0 == 0) goto L_0x0ab3
            X.2QF r0 = X.2QF.A00()     // Catch:{ all -> 0x0a9e }
            X.2QK r30 = r0.A08()     // Catch:{ all -> 0x0a9e }
            r0 = r30
            X.2QL r0 = r0.A00     // Catch:{ all -> 0x0a9e }
            X.0xa r2 = r0.A00     // Catch:{ all -> 0x0a9e }
            java.lang.String r29 = "dump_id"
            java.lang.String r8 = ""
            r0 = r29
            java.lang.String r36 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r36 == 0) goto L_0x08c6
            int r0 = r36.length()     // Catch:{ all -> 0x0a9e }
            if (r0 == 0) goto L_0x08c6
            java.lang.String r1 = "version"
            r0 = r34
            int r1 = r2.getInt(r1, r0)     // Catch:{ all -> 0x0a9e }
            java.lang.String r28 = "app_version_name"
            r0 = 2733(0xaad, float:3.83E-42)
            java.lang.String r16 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0a9e }
            java.lang.String r15 = "attempts_to_upload"
            java.lang.String r27 = "trace_id"
            java.lang.String r26 = "asl_session_id"
            java.lang.String r25 = "endpoint_history"
            java.lang.String r24 = "endpoint"
            java.lang.String r32 = "dump_cause_details"
            java.lang.String r23 = "uid"
            java.lang.String r21 = "file_name"
            java.lang.String r20 = "maximum_heap_size"
            java.lang.String r18 = "was_ever_foregrounded"
            java.lang.String r19 = "is_backgrounded"
            java.lang.String r31 = "dump_cause"
            java.lang.String r3 = "Required value was null."
            r49 = 0
            r4 = 0
            r9 = 0
            r50 = 0
            r6 = 0
            r44 = 0
            r0 = r17
            if (r1 != r0) goto L_0x0847
            r0 = r31
            java.lang.String r42 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r42 == 0) goto L_0x0a5d
            r1 = r19
            r0 = r34
            boolean r59 = r2.getBoolean(r1, r0)     // Catch:{ all -> 0x0a9e }
            r1 = r18
            boolean r60 = r2.getBoolean(r1, r0)     // Catch:{ all -> 0x0a9e }
            r0 = r20
            long r55 = r2.getLong(r0, r4)     // Catch:{ all -> 0x0a9e }
            r0 = r21
            java.lang.String r38 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r38 == 0) goto L_0x0a57
            r0 = r23
            java.lang.String r46 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r46 == 0) goto L_0x0a51
            r0 = r32
            java.lang.String r41 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r41 == 0) goto L_0x0a4b
            r0 = r24
            java.lang.String r43 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r43 == 0) goto L_0x0a45
            r0 = r25
            java.lang.String r37 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r37 == 0) goto L_0x0a3f
            r0 = r26
            java.lang.String r40 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r40 == 0) goto L_0x0a39
            r0 = r27
            java.lang.String r45 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r45 == 0) goto L_0x0a33
            r0 = r34
            int r47 = r2.getInt(r15, r0)     // Catch:{ all -> 0x0a9e }
            r1 = r16
            int r48 = r2.getInt(r1, r0)     // Catch:{ all -> 0x0a9e }
            r0 = r28
            java.lang.String r39 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r39 == 0) goto L_0x0a2d
            java.lang.String r1 = "number_of_chunks"
            r0 = r17
            int r50 = r2.getInt(r1, r0)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "current_chunk_index"
            r0 = r34
            int r49 = r2.getInt(r1, r0)     // Catch:{ all -> 0x0a9e }
            r0 = 765(0x2fd, float:1.072E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0a9e }
            java.lang.String r44 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            java.lang.String r0 = "dump_time_millis"
            long r4 = r2.getLong(r0, r4)     // Catch:{ all -> 0x0a9e }
            java.lang.String r0 = "dump_uptime_millis"
            long r9 = r2.getLong(r0, r9)     // Catch:{ all -> 0x0a9e }
            java.lang.String r0 = "oom_time_millis"
            long r6 = r2.getLong(r0, r6)     // Catch:{ all -> 0x0a9e }
        L_0x011d:
            X.2QO r0 = new X.2QO     // Catch:{ all -> 0x0a9e }
            r35 = r0
            r51 = r4
            r53 = r9
            r57 = r6
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r53, r55, r57, r59, r60)     // Catch:{ all -> 0x0a9e }
            r4 = 0
            r7 = 0
            java.lang.CharSequence r6 = r0.A09     // Catch:{ all -> 0x0a9e }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a9e }
            if (r1 != 0) goto L_0x01d2
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0a9e }
            java.io.File r22 = new java.io.File     // Catch:{ all -> 0x0a9e }
            r2 = r22
            r2.<init>(r1)     // Catch:{ all -> 0x0a9e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a9e }
            r1.<init>()     // Catch:{ all -> 0x0a9e }
            r1.append(r6)     // Catch:{ all -> 0x0a9e }
            java.lang.String r3 = ".gz"
            r1.append(r3)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0a9e }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0a9e }
            r5.<init>(r1)     // Catch:{ all -> 0x0a9e }
            boolean r1 = r5.exists()     // Catch:{ all -> 0x0a9e }
            if (r1 != 0) goto L_0x0844
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a9e }
            r2.<init>()     // Catch:{ all -> 0x0a9e }
            r2.append(r6)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = ".zst"
            r2.append(r1)     // Catch:{ all -> 0x0a9e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0a9e }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0a9e }
            r1.<init>(r2)     // Catch:{ all -> 0x0a9e }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0a9e }
            if (r2 != 0) goto L_0x0193
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a9e }
            r1.<init>()     // Catch:{ all -> 0x0a9e }
            r1.append(r6)     // Catch:{ all -> 0x0a9e }
            java.lang.String r2 = ".xz"
            r1.append(r2)     // Catch:{ all -> 0x0a9e }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0a9e }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0a9e }
            r1.<init>(r2)     // Catch:{ all -> 0x0a9e }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0a9e }
            if (r2 == 0) goto L_0x0844
        L_0x0193:
            boolean r2 = r22.exists()     // Catch:{ all -> 0x0a9e }
            if (r2 == 0) goto L_0x01e7
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0a9e }
            if (r2 == 0) goto L_0x01c9
            r1.delete()     // Catch:{ all -> 0x0a9e }
            java.lang.String r9 = r0.A0C     // Catch:{ all -> 0x0a9e }
            if (r9 == 0) goto L_0x01c9
            java.lang.CharSequence r6 = r0.A07     // Catch:{ all -> 0x0a9e }
            if (r6 == 0) goto L_0x01c9
            int r5 = r0.A00     // Catch:{ all -> 0x0a9e }
            long r42 = r22.length()     // Catch:{ all -> 0x0a9e }
            r1 = r33
            int r2 = r1.A01     // Catch:{ all -> 0x0a9e }
            int r1 = r1.A00     // Catch:{ all -> 0x0a9e }
            r44 = 0
            java.lang.String r38 = "partial_compressed_file"
            r35 = r33
            r36 = r6
            r37 = r9
            r39 = r5
            r40 = r2
            r41 = r1
            X.C278944xm.A00(r35, r36, r37, r38, r39, r40, r41, r42, r44)     // Catch:{ all -> 0x0a9e }
        L_0x01c9:
            boolean r1 = r22.canRead()     // Catch:{ all -> 0x0a9e }
            if (r1 != 0) goto L_0x0219
        L_0x01cf:
            r22.delete()     // Catch:{ all -> 0x0a9e }
        L_0x01d2:
            r30.A00()     // Catch:{ all -> 0x0a9e }
        L_0x01d5:
            r0 = r33
            X.2Pm r5 = r0.A05     // Catch:{ all -> 0x0a9e }
            if (r5 == 0) goto L_0x0a0c
            X.2QF r0 = X.2QF.A00()     // Catch:{ all -> 0x0a9e }
            X.2QM r0 = r0.A02()     // Catch:{ all -> 0x0a9e }
            java.io.File r0 = r0.A0C     // Catch:{ all -> 0x0a9e }
            goto L_0x095b
        L_0x01e7:
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0a9e }
            if (r2 == 0) goto L_0x01d2
            r22 = r1
            r4 = 1
            java.lang.String r5 = r1.getName()     // Catch:{ all -> 0x0a9e }
            boolean r2 = r5.endsWith(r3)     // Catch:{ all -> 0x0a9e }
            if (r2 == 0) goto L_0x01fc
            r7 = 1
            goto L_0x020f
        L_0x01fc:
            java.lang.String r2 = ".zst"
            boolean r2 = r5.endsWith(r2)     // Catch:{ all -> 0x0a9e }
            if (r2 == 0) goto L_0x0206
            r7 = 2
            goto L_0x020f
        L_0x0206:
            java.lang.String r2 = ".xz"
            boolean r2 = r5.endsWith(r2)     // Catch:{ all -> 0x0a9e }
            if (r2 == 0) goto L_0x0a21
            r7 = 3
        L_0x020f:
            boolean r2 = r1.canRead()     // Catch:{ all -> 0x0a9e }
            if (r2 != 0) goto L_0x0219
            r1.delete()     // Catch:{ all -> 0x0a9e }
            goto L_0x01d2
        L_0x0219:
            long r11 = r22.length()     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = r0.A0C     // Catch:{ all -> 0x0a9e }
            X.0Sd.A00(r1)     // Catch:{ all -> 0x0a9e }
            java.lang.CharSequence r1 = r0.A07     // Catch:{ all -> 0x0a9e }
            X.0Sd.A00(r1)     // Catch:{ all -> 0x0a9e }
            java.lang.String r14 = r0.A0C     // Catch:{ all -> 0x0a9e }
            java.lang.CharSequence r1 = r0.A07     // Catch:{ all -> 0x0a9e }
            r35 = r1
            int r13 = r0.A00     // Catch:{ all -> 0x0a9e }
            int r9 = r0.A02     // Catch:{ all -> 0x0a9e }
            int r6 = r0.A01     // Catch:{ all -> 0x0a9e }
            r1 = r33
            X.2Pm r10 = r1.A06     // Catch:{ all -> 0x0a9e }
            if (r10 == 0) goto L_0x0268
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0a9e }
            java.lang.String r5 = "upload_attempted"
            com.facebook.quicklog.EventBuilder r2 = X.2Pm.A00(r10, r14, r5, r1)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "attempt_number"
            r2.annotate(r1, r13)     // Catch:{ all -> 0x0a9e }
            java.lang.String r5 = r35.toString()     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "hprof_id"
            r2.annotate(r1, r5)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "file_size"
            r2.annotate(r1, r11)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "is_compressed"
            r2.annotate(r1, r4)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "number_of_chunks"
            r2.annotate(r1, r9)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "current_chunk_index"
            r2.annotate(r1, r6)     // Catch:{ all -> 0x0a9e }
            r2.report()     // Catch:{ all -> 0x0a9e }
        L_0x0268:
            int r1 = r0.A00     // Catch:{ all -> 0x0a9e }
            r2 = r33
            int r2 = r2.A02     // Catch:{ all -> 0x0a9e }
            if (r1 <= r2) goto L_0x028a
            java.lang.String r4 = r0.A0C     // Catch:{ all -> 0x0a9e }
            java.lang.CharSequence r3 = r0.A07     // Catch:{ all -> 0x0a9e }
            int r2 = r0.A02     // Catch:{ all -> 0x0a9e }
            int r0 = r0.A01     // Catch:{ all -> 0x0a9e }
            if (r10 == 0) goto L_0x01cf
            java.lang.String r37 = "upload_abandoned"
            r39 = 0
            r35 = r10
            r36 = r3
            r38 = r4
            r40 = r1
            r41 = r2
            goto L_0x0533
        L_0x028a:
            int r1 = r1 + 1
            r0.A00 = r1     // Catch:{ all -> 0x0a9e }
            X.2QF r1 = X.2QF.A00()     // Catch:{ all -> 0x0a9e }
            X.2QK r1 = r1.A08()     // Catch:{ all -> 0x0a9e }
            r1.A01(r0)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = r0.A0C     // Catch:{ all -> 0x0a9e }
            X.0Sd.A00(r1)     // Catch:{ all -> 0x0a9e }
            java.lang.CharSequence r1 = r0.A07     // Catch:{ all -> 0x0a9e }
            X.0Sd.A00(r1)     // Catch:{ all -> 0x0a9e }
            r1 = r33
            int r5 = r1.A01     // Catch:{ all -> 0x0a9e }
            if (r4 != 0) goto L_0x0505
            java.lang.String r37 = "hprof_upload_failed_compression"
            java.io.File r2 = r22.getParentFile()     // Catch:{ all -> 0x0a9e }
            java.lang.String r4 = r0.A0A     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = ".txt"
            java.lang.String r1 = X.002.A0R(r4, r1)     // Catch:{ all -> 0x0a9e }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0a9e }
            r6.<init>(r2, r1)     // Catch:{ all -> 0x0a9e }
            boolean r1 = r6.exists()     // Catch:{ all -> 0x0a9e }
            if (r1 == 0) goto L_0x02f4
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ IOException | NumberFormatException -> 0x02f1, all -> 0x0a99 }
            r1.<init>(r6)     // Catch:{ IOException | NumberFormatException -> 0x02f1, all -> 0x0a99 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException | NumberFormatException -> 0x02f1, all -> 0x0a99 }
            r4.<init>(r1)     // Catch:{ IOException | NumberFormatException -> 0x02f1, all -> 0x0a99 }
            java.lang.String r1 = r4.readLine()     // Catch:{ all -> 0x02e7 }
            if (r1 == 0) goto L_0x02e3
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ all -> 0x02e7 }
            r0.A06 = r1     // Catch:{ all -> 0x02e7 }
            X.2QF r1 = X.2QF.A00()     // Catch:{ all -> 0x02e7 }
            X.2QK r1 = r1.A08()     // Catch:{ all -> 0x02e7 }
            r1.A01(r0)     // Catch:{ all -> 0x02e7 }
        L_0x02e3:
            r4.close()     // Catch:{ IOException | NumberFormatException -> 0x02f1, all -> 0x0a99 }
            goto L_0x02f1
        L_0x02e7:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x02ec }
            goto L_0x02f0
        L_0x02ec:
            r2 = move-exception
            X.C9153RRe.A00(r1, r2)     // Catch:{ IOException | NumberFormatException -> 0x02f1, all -> 0x0a99 }
        L_0x02f0:
            throw r1     // Catch:{ IOException | NumberFormatException -> 0x02f1, all -> 0x0a99 }
        L_0x02f1:
            r6.delete()     // Catch:{ all -> 0x0a9e }
        L_0x02f4:
            r1 = r33
            boolean r1 = r1.A0B     // Catch:{ all -> 0x0a9e }
            r47 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 != 0) goto L_0x03b2
            long r35 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0a9e }
            X.2QF r4 = X.2QF.A00()     // Catch:{ IOException -> 0x039a }
            monitor-enter(r4)     // Catch:{ IOException -> 0x039a }
            com.facebook.common.errorreporting.memory.heapsanitizer.HeapSanitizer r1 = r4.A01     // Catch:{ all -> 0x038b }
            if (r1 != 0) goto L_0x0325
            java.lang.String r2 = "MemoryManager.getHprofFileSanitizer"
            r1 = -1032081470(0xffffffffc27bafc2, float:-62.92164)
            X.0ff.A01(r2, r1)     // Catch:{ all -> 0x038b }
            X.0eK r1 = r4.A0G     // Catch:{ all -> 0x038b }
            r1.getClass()     // Catch:{ all -> 0x038b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x038b }
            com.facebook.common.errorreporting.memory.heapsanitizer.HeapSanitizer r1 = (com.facebook.common.errorreporting.memory.heapsanitizer.HeapSanitizer) r1     // Catch:{ all -> 0x038b }
            r4.A01 = r1     // Catch:{ all -> 0x038b }
            r1 = 1919573225(0x726a5ce9, float:4.642036E30)
            X.0ff.A00(r1)     // Catch:{ all -> 0x038b }
        L_0x0325:
            monitor-exit(r4)     // Catch:{ IOException -> 0x039a }
            java.lang.String r2 = r22.getCanonicalPath()     // Catch:{ IOException -> 0x039a }
            boolean r1 = com.facebook.common.errorreporting.memory.heapsanitizer.HeapSanitizer.sInit     // Catch:{ IOException -> 0x039a }
            if (r1 != 0) goto L_0x0341
            java.lang.Class<com.facebook.common.errorreporting.memory.heapsanitizer.HeapSanitizer> r4 = com.facebook.common.errorreporting.memory.heapsanitizer.HeapSanitizer.class
            monitor-enter(r4)     // Catch:{ IOException -> 0x039a }
            boolean r1 = com.facebook.common.errorreporting.memory.heapsanitizer.HeapSanitizer.sInit     // Catch:{ all -> 0x033e }
            if (r1 != 0) goto L_0x033c
            java.lang.String r1 = "hprofsanitizer"
            X.0dV.A0C(r1)     // Catch:{ all -> 0x033e }
            com.facebook.common.errorreporting.memory.heapsanitizer.HeapSanitizer.sInit = r17     // Catch:{ all -> 0x033e }
        L_0x033c:
            monitor-exit(r4)     // Catch:{ all -> 0x033e }
            goto L_0x0341
        L_0x033e:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x033e }
            goto L_0x0399
        L_0x0341:
            java.lang.String r1 = com.facebook.common.errorreporting.memory.heapsanitizer.HeapSanitizer.nativeSanitizeHprof(r2)     // Catch:{ IOException -> 0x039a }
            int r2 = r1.length()     // Catch:{ IOException -> 0x039a }
            if (r2 > 0) goto L_0x038e
            java.lang.String r7 = r0.A0C     // Catch:{ IOException -> 0x039a }
            if (r7 == 0) goto L_0x03b2
            java.lang.CharSequence r9 = r0.A07     // Catch:{ IOException -> 0x039a }
            if (r9 == 0) goto L_0x03b2
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ IOException -> 0x039a }
            long r1 = r1 - r35
            int r4 = (r1 > r47 ? 1 : (r1 == r47 ? 0 : -1))
            if (r4 <= 0) goto L_0x0360
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x0360:
            int r6 = r0.A00     // Catch:{ IOException -> 0x039a }
            if (r10 == 0) goto L_0x03b2
            int r4 = (int) r1     // Catch:{ IOException -> 0x039a }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x039a }
            java.lang.String r13 = "sanitization_succeeded"
            com.facebook.quicklog.EventBuilder r2 = X.2Pm.A00(r10, r7, r13, r1)     // Catch:{ IOException -> 0x039a }
            java.lang.String r1 = "attempt_number"
            r2.annotate(r1, r6)     // Catch:{ IOException -> 0x039a }
            java.lang.String r6 = r9.toString()     // Catch:{ IOException -> 0x039a }
            java.lang.String r1 = "hprof_id"
            r2.annotate(r1, r6)     // Catch:{ IOException -> 0x039a }
            java.lang.String r1 = "file_size"
            r2.annotate(r1, r11)     // Catch:{ IOException -> 0x039a }
            java.lang.String r1 = "time_to_sanitize_ms"
            r2.annotate(r1, r4)     // Catch:{ IOException -> 0x039a }
            r2.report()     // Catch:{ IOException -> 0x039a }
            goto L_0x03b2
        L_0x038b:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x039a }
            goto L_0x0399
        L_0x038e:
            java.lang.String r2 = "hprofsanitizer: "
            java.lang.String r1 = X.002.A0R(r2, r1)     // Catch:{ IOException -> 0x039a }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x039a }
            r2.<init>(r1)     // Catch:{ IOException -> 0x039a }
        L_0x0399:
            throw r2     // Catch:{ IOException -> 0x039a }
        L_0x039a:
            r6 = move-exception
            java.lang.String r5 = r0.A0C     // Catch:{ all -> 0x0a9e }
            if (r5 == 0) goto L_0x0479
            java.lang.CharSequence r4 = r0.A07     // Catch:{ all -> 0x0a9e }
            if (r4 == 0) goto L_0x0479
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0a9e }
            long r1 = r1 - r35
            int r3 = (r1 > r47 ? 1 : (r1 == r47 ? 0 : -1))
            if (r3 <= 0) goto L_0x0446
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            goto L_0x0446
        L_0x03b2:
            java.lang.String r1 = r22.getPath()     // Catch:{ all -> 0x0a9e }
            r2 = r17
            if (r5 == r2) goto L_0x03c5
            r2 = 2
            if (r5 != r2) goto L_0x03c0
            java.lang.String r3 = ".zst"
            goto L_0x03c5
        L_0x03c0:
            r2 = 3
            if (r5 != r2) goto L_0x0a15
            java.lang.String r3 = ".xz"
        L_0x03c5:
            java.lang.String r1 = X.002.A0R(r1, r3)     // Catch:{ all -> 0x0a9e }
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x0a9e }
            r14.<init>(r1)     // Catch:{ all -> 0x0a9e }
            long r35 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0a9e }
            r1 = r33
            int r9 = r1.A00     // Catch:{ IOException -> 0x0415, OutOfMemoryError -> 0x03ee }
            r1 = r22
            long r6 = X.C9246RUx.A00(r1, r14, r5, r9)     // Catch:{ IOException -> 0x0415, OutOfMemoryError -> 0x03ee }
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ IOException -> 0x0415, OutOfMemoryError -> 0x03ee }
            long r1 = r1 - r35
            int r3 = (r1 > r47 ? 1 : (r1 == r47 ? 0 : -1))
            if (r3 <= 0) goto L_0x03e9
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x03e9:
            r22.delete()     // Catch:{ IOException -> 0x0415, OutOfMemoryError -> 0x03ee }
            goto L_0x04aa
        L_0x03ee:
            r6 = move-exception
            java.lang.String r4 = r0.A0C     // Catch:{ all -> 0x0a9e }
            if (r4 == 0) goto L_0x047b
            java.lang.CharSequence r3 = r0.A07     // Catch:{ all -> 0x0a9e }
            if (r3 == 0) goto L_0x047b
            int r2 = r0.A00     // Catch:{ all -> 0x0a9e }
            r1 = r33
            int r1 = r1.A00     // Catch:{ all -> 0x0a9e }
            r27 = 0
            java.lang.String r21 = r6.toString()     // Catch:{ all -> 0x0a9e }
            r18 = r33
            r19 = r3
            r20 = r4
            r22 = r2
            r23 = r5
            r24 = r1
            r25 = r11
            X.C278944xm.A00(r18, r19, r20, r21, r22, r23, r24, r25, r27)     // Catch:{ all -> 0x0a9e }
            goto L_0x047b
        L_0x0415:
            r8 = move-exception
            java.lang.String r4 = r0.A0C     // Catch:{ all -> 0x0a9e }
            if (r4 == 0) goto L_0x047b
            java.lang.CharSequence r3 = r0.A07     // Catch:{ all -> 0x0a9e }
            if (r3 == 0) goto L_0x047b
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0a9e }
            long r6 = r6 - r35
            int r1 = (r6 > r47 ? 1 : (r6 == r47 ? 0 : -1))
            if (r1 > 0) goto L_0x042a
            r47 = r6
        L_0x042a:
            int r2 = r0.A00     // Catch:{ all -> 0x0a9e }
            r1 = r33
            int r1 = r1.A00     // Catch:{ all -> 0x0a9e }
            java.lang.String r41 = r8.toString()     // Catch:{ all -> 0x0a9e }
            r38 = r33
            r39 = r3
            r40 = r4
            r42 = r2
            r43 = r5
            r44 = r1
            r45 = r11
            X.C278944xm.A00(r38, r39, r40, r41, r42, r43, r44, r45, r47)     // Catch:{ all -> 0x0a9e }
            goto L_0x047b
        L_0x0446:
            int r7 = r0.A00     // Catch:{ all -> 0x0a9e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0a9e }
            if (r10 == 0) goto L_0x0479
            int r3 = (int) r1     // Catch:{ all -> 0x0a9e }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0a9e }
            java.lang.String r8 = "sanitization_failed"
            com.facebook.quicklog.EventBuilder r2 = X.2Pm.A00(r10, r5, r8, r1)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "attempt_number"
            r2.annotate(r1, r7)     // Catch:{ all -> 0x0a9e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "hprof_id"
            r2.annotate(r1, r4)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "file_size"
            r2.annotate(r1, r11)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "time_to_sanitize_ms"
            r2.annotate(r1, r3)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "reason"
            r2.annotate(r1, r6)     // Catch:{ all -> 0x0a9e }
            r2.report()     // Catch:{ all -> 0x0a9e }
        L_0x0479:
            java.lang.String r37 = "hprof_upload_failed_sanitization"
        L_0x047b:
            r1 = r33
            X.2Pn r4 = r1.A07     // Catch:{ all -> 0x0a9e }
            if (r4 == 0) goto L_0x01d5
            java.lang.CharSequence r1 = r0.A07     // Catch:{ all -> 0x0a9e }
            X.0Sd.A00(r1)     // Catch:{ all -> 0x0a9e }
            java.lang.String r3 = r0.A0C     // Catch:{ all -> 0x0a9e }
            java.lang.String r2 = r0.A0B     // Catch:{ all -> 0x0a9e }
            java.lang.String r9 = "hprof_id"
            java.lang.CharSequence r1 = r0.A07     // Catch:{ all -> 0x0a9e }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x0a9e }
            int r0 = r0.A00     // Catch:{ all -> 0x0a9e }
            java.lang.String r12 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0a9e }
            r5 = r31
            r6 = r3
            r7 = r32
            r8 = r2
            r11 = r15
            java.lang.String[] r1 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12}     // Catch:{ all -> 0x0a9e }
            r0 = r37
            r4.A01(r0, r1)     // Catch:{ all -> 0x0a9e }
            goto L_0x01d5
        L_0x04aa:
            java.lang.String r13 = r0.A0C     // Catch:{ all -> 0x0a9e }
            if (r13 == 0) goto L_0x04fe
            java.lang.CharSequence r3 = r0.A07     // Catch:{ all -> 0x0a9e }
            r22 = r3
            if (r3 == 0) goto L_0x04fe
            int r3 = r0.A00     // Catch:{ all -> 0x0a9e }
            r36 = r3
            long r3 = r14.length()     // Catch:{ all -> 0x0a9e }
            int r15 = (int) r1     // Catch:{ all -> 0x0a9e }
            r35 = r15
            if (r10 == 0) goto L_0x04fe
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0a9e }
            java.lang.String r15 = "compression_succeeded"
            com.facebook.quicklog.EventBuilder r2 = X.2Pm.A00(r10, r13, r15, r1)     // Catch:{ all -> 0x0a9e }
            java.lang.String r13 = "attempt_number"
            r1 = r36
            r2.annotate(r13, r1)     // Catch:{ all -> 0x0a9e }
            java.lang.String r13 = r22.toString()     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "hprof_id"
            r2.annotate(r1, r13)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "original_file_size"
            r2.annotate(r1, r11)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "compressed_file_size"
            r2.annotate(r1, r3)     // Catch:{ all -> 0x0a9e }
            java.lang.String r3 = "time_to_compress_ms"
            r1 = r35
            r2.annotate(r3, r1)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "compression_type"
            r2.annotate(r1, r5)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "compression_level"
            r2.annotate(r1, r9)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "java_memory_estimate_bytes"
            r2.annotate(r1, r6)     // Catch:{ all -> 0x0a9e }
            r2.report()     // Catch:{ all -> 0x0a9e }
        L_0x04fe:
            r22 = r14
            long r11 = r14.length()     // Catch:{ all -> 0x0a9e }
            r7 = r5
        L_0x0505:
            double r3 = (double) r11     // Catch:{ all -> 0x0a9e }
            int r1 = r0.A02     // Catch:{ all -> 0x0a9e }
            double r1 = (double) r1     // Catch:{ all -> 0x0a9e }
            double r3 = r3 / r1
            double r1 = java.lang.Math.ceil(r3)     // Catch:{ all -> 0x0a9e }
            long r3 = (long) r1     // Catch:{ all -> 0x0a9e }
            r5 = 104857600(0x6400000, double:5.1806538E-316)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0537
            r22.getPath()     // Catch:{ all -> 0x0a9e }
            int r4 = r0.A02     // Catch:{ all -> 0x0a9e }
            java.lang.String r3 = r0.A0C     // Catch:{ all -> 0x0a9e }
            java.lang.CharSequence r2 = r0.A07     // Catch:{ all -> 0x0a9e }
            int r1 = r0.A00     // Catch:{ all -> 0x0a9e }
            int r0 = r0.A01     // Catch:{ all -> 0x0a9e }
            if (r10 == 0) goto L_0x01cf
            java.lang.String r37 = "upload_abandoned"
            r39 = 0
            r35 = r10
            r36 = r2
            r38 = r3
            r40 = r1
            r41 = r4
        L_0x0533:
            r42 = r0
            goto L_0x07bf
        L_0x0537:
            int r1 = r0.A01     // Catch:{ IOException | JSONException -> 0x07db }
            long r1 = (long) r1     // Catch:{ IOException | JSONException -> 0x07db }
            long r5 = r3 * r1
            long r13 = r3 + r5
            int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x0544
            long r3 = r11 - r5
        L_0x0544:
            java.util.ArrayList r36 = new java.util.ArrayList     // Catch:{ IOException | JSONException -> 0x07db }
            r36.<init>()     // Catch:{ IOException | JSONException -> 0x07db }
            r1 = r17
            if (r7 != r1) goto L_0x0550
            java.lang.String r1 = "5"
            goto L_0x055c
        L_0x0550:
            r1 = 2
            if (r7 != r1) goto L_0x0554
            goto L_0x055a
        L_0x0554:
            r1 = 3
            if (r7 != r1) goto L_0x07cf
            java.lang.String r1 = "15"
            goto L_0x055c
        L_0x055a:
            java.lang.String r1 = "14"
        L_0x055c:
            java.lang.String r14 = "filetype"
            android.util.Pair r2 = new android.util.Pair     // Catch:{ IOException | JSONException -> 0x07db }
            r2.<init>(r14, r1)     // Catch:{ IOException | JSONException -> 0x07db }
            r1 = r36
            r1.add(r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.CharSequence r9 = r0.A07     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = "crash_id"
            android.util.Pair r2 = new android.util.Pair     // Catch:{ IOException | JSONException -> 0x07db }
            r2.<init>(r1, r9)     // Catch:{ IOException | JSONException -> 0x07db }
            r1 = r36
            r1.add(r2)     // Catch:{ IOException | JSONException -> 0x07db }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x07db }
            r9.<init>()     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.CharSequence r2 = r0.A07     // Catch:{ IOException | JSONException -> 0x07db }
            r1 = r29
            org.json.JSONObject r13 = r9.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = r0.A0C     // Catch:{ IOException | JSONException -> 0x07db }
            r1 = r31
            org.json.JSONObject r13 = r13.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException | JSONException -> 0x07db }
            long r1 = r1.maxMemory()     // Catch:{ IOException | JSONException -> 0x07db }
            r15 = r20
            org.json.JSONObject r13 = r13.put(r15, r1)     // Catch:{ IOException | JSONException -> 0x07db }
            boolean r2 = r0.A0H     // Catch:{ IOException | JSONException -> 0x07db }
            r1 = r19
            org.json.JSONObject r13 = r13.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            boolean r2 = r0.A0I     // Catch:{ IOException | JSONException -> 0x07db }
            r1 = r18
            org.json.JSONObject r13 = r13.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.CharSequence r2 = r0.A09     // Catch:{ IOException | JSONException -> 0x07db }
            r1 = r21
            org.json.JSONObject r13 = r13.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = r0.A0G     // Catch:{ IOException | JSONException -> 0x07db }
            r1 = r23
            org.json.JSONObject r2 = r13.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = "5"
            org.json.JSONObject r13 = r2.put(r14, r1)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.CharSequence r2 = r0.A08     // Catch:{ IOException | JSONException -> 0x07db }
            if (r2 != 0) goto L_0x05c4
            r2 = r8
        L_0x05c4:
            r1 = r25
            org.json.JSONObject r13 = r13.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = "hprof_new_architecture"
            r1 = r17
            org.json.JSONObject r13 = r13.put(r2, r1)     // Catch:{ IOException | JSONException -> 0x07db }
            int r2 = r0.A0J     // Catch:{ IOException | JSONException -> 0x07db }
            r1 = r16
            org.json.JSONObject r13 = r13.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = r0.A0K     // Catch:{ IOException | JSONException -> 0x07db }
            r1 = r28
            org.json.JSONObject r13 = r13.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            int r2 = r0.A02     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r35 = "number_of_chunks"
            r1 = r35
            org.json.JSONObject r13 = r13.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            int r2 = r0.A01     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r15 = "current_chunk_index"
            org.json.JSONObject r14 = r13.put(r15, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            long r1 = r0.A03     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r13 = "dump_time_millis"
            org.json.JSONObject r14 = r14.put(r13, r1)     // Catch:{ IOException | JSONException -> 0x07db }
            long r1 = r0.A04     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r13 = "dump_uptime_millis"
            org.json.JSONObject r14 = r14.put(r13, r1)     // Catch:{ IOException | JSONException -> 0x07db }
            long r1 = r0.A06     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r13 = "oom_time_millis"
            r14.put(r13, r1)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = r0.A0D     // Catch:{ IOException | JSONException -> 0x07db }
            if (r2 == 0) goto L_0x0614
            r1 = r24
            r9.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
        L_0x0614:
            java.lang.String r2 = r0.A0A     // Catch:{ IOException | JSONException -> 0x07db }
            if (r2 == 0) goto L_0x061d
            r1 = r26
            r9.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
        L_0x061d:
            java.lang.String r2 = r0.A0L     // Catch:{ IOException | JSONException -> 0x07db }
            if (r2 == 0) goto L_0x062a
            r1 = 765(0x2fd, float:1.072E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ IOException | JSONException -> 0x07db }
            r9.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
        L_0x062a:
            java.lang.String r2 = r0.A0B     // Catch:{ IOException | JSONException -> 0x07db }
            if (r2 == 0) goto L_0x0639
            boolean r1 = r2.isEmpty()     // Catch:{ IOException | JSONException -> 0x07db }
            if (r1 != 0) goto L_0x0639
            r1 = r32
            r9.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
        L_0x0639:
            java.lang.String r2 = r0.A0F     // Catch:{ IOException | JSONException -> 0x07db }
            if (r2 == 0) goto L_0x0642
            r1 = r27
            r9.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
        L_0x0642:
            r1 = r33
            X.4xl r13 = r1.A04     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = r13.A01     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = "app"
            org.json.JSONObject r9 = r9.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = r13.A00     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = "app_id"
            org.json.JSONObject r9 = r9.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = r13.A03     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = "process_name"
            org.json.JSONObject r9 = r9.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = android.os.Build.BRAND     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = "brand"
            org.json.JSONObject r9 = r9.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = "model"
            org.json.JSONObject r9 = r9.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch:{ IOException | JSONException -> 0x07db }
            r1 = 2608(0xa30, float:3.655E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ IOException | JSONException -> 0x07db }
            org.json.JSONObject r9 = r9.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = r13.A02     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = "memclass"
            org.json.JSONObject r2 = r9.put(r1, r2)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = "file_offset"
            org.json.JSONObject r2 = r2.put(r1, r5)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = "chunk_size"
            org.json.JSONObject r1 = r2.put(r1, r3)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r9 = r1.toString()     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = "extras"
            android.util.Pair r1 = new android.util.Pair     // Catch:{ IOException | JSONException -> 0x07db }
            r1.<init>(r2, r9)     // Catch:{ IOException | JSONException -> 0x07db }
            r2 = r36
            r2.add(r1)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = "app/hprof"
            X.SIZ r9 = new X.SIZ     // Catch:{ IOException | JSONException -> 0x07db }
            r9.<init>()     // Catch:{ IOException | JSONException -> 0x07db }
            r9.A03 = r1     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ IOException | JSONException -> 0x07db }
            r9.A01 = r1     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r13 = "567067343352427"
            java.lang.String r2 = "|"
            r1 = 600(0x258, float:8.41E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = X.002.A0u(r8, r13, r2, r1)     // Catch:{ IOException | JSONException -> 0x07db }
            r9.A02 = r1     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.Class<X.D2N> r1 = X.D2N.class
            r9.A02(r1)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r14 = "file"
            X.1Fc r13 = r9.A04     // Catch:{ IOException | JSONException -> 0x07db }
            java.util.Map r2 = r13.A00     // Catch:{ IOException | JSONException -> 0x07db }
            X.T6D r1 = new X.T6D     // Catch:{ IOException | JSONException -> 0x07db }
            r37 = r1
            r38 = r22
            r39 = r5
            r41 = r3
            r37.<init>(r38, r39, r41)     // Catch:{ IOException | JSONException -> 0x07db }
            r2.put(r14, r1)     // Catch:{ IOException | JSONException -> 0x07db }
            java.util.Iterator r5 = r36.iterator()     // Catch:{ IOException | JSONException -> 0x07db }
        L_0x06da:
            boolean r1 = r5.hasNext()     // Catch:{ IOException | JSONException -> 0x07db }
            if (r1 == 0) goto L_0x06f6
            java.lang.Object r1 = r5.next()     // Catch:{ IOException | JSONException -> 0x07db }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.Object r2 = r1.first     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.Object r1 = r1.second     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException | JSONException -> 0x07db }
            r13.A05(r2, r1)     // Catch:{ IOException | JSONException -> 0x07db }
            goto L_0x06da
        L_0x06f6:
            X.1NU r1 = r9.A00     // Catch:{ IOException -> 0x07cd, Exception -> 0x07c6, IOException | JSONException -> 0x07db }
            r1.getClass()     // Catch:{ IOException -> 0x07cd, Exception -> 0x07c6, IOException | JSONException -> 0x07db }
            X.1C7 r2 = X.AnonymousClass1C7.A00()     // Catch:{ IOException -> 0x07cd, Exception -> 0x07c6, IOException | JSONException -> 0x07db }
            X.1QX r1 = X.SIZ.A00(r9)     // Catch:{ IOException -> 0x07cd, Exception -> 0x07c6, IOException | JSONException -> 0x07db }
            r39 = 0
            X.2ZL r1 = r2.A01(r1)     // Catch:{ IOException -> 0x07cd, Exception -> 0x07c6, IOException | JSONException -> 0x07db }
            X.1NU r2 = r9.A00     // Catch:{ IOException -> 0x07cd, Exception -> 0x07c6, IOException | JSONException -> 0x07db }
            java.lang.Object r1 = r2.then(r1)     // Catch:{ IOException -> 0x07cd, Exception -> 0x07c6, IOException | JSONException -> 0x07db }
            X.1XR r1 = (X.1XR) r1     // Catch:{ IOException -> 0x07cd, Exception -> 0x07c6, IOException | JSONException -> 0x07db }
            X.CHJ r1 = (X.CHJ) r1     // Catch:{ IOException -> 0x07cd, Exception -> 0x07c6, IOException | JSONException -> 0x07db }
            boolean r9 = r1.isOk()     // Catch:{ IOException -> 0x07cd, Exception -> 0x07c6, IOException | JSONException -> 0x07db }
            java.lang.String r6 = "Status: "
            int r5 = r1.mStatusCode     // Catch:{ IOException -> 0x07cd, Exception -> 0x07c6, IOException | JSONException -> 0x07db }
            java.lang.String r2 = " success: "
            boolean r1 = r1.A00     // Catch:{ IOException -> 0x07cd, Exception -> 0x07c6, IOException | JSONException -> 0x07db }
            java.lang.String r49 = X.002.A0d(r6, r2, r5, r1)     // Catch:{ IOException -> 0x07cd, Exception -> 0x07c6, IOException | JSONException -> 0x07db }
            if (r9 != 0) goto L_0x0726
            goto L_0x0747
        L_0x0726:
            r22.getPath()     // Catch:{ all -> 0x0a9e }
            int r1 = r0.A01     // Catch:{ all -> 0x0a9e }
            int r2 = r1 + 1
            r0.A01 = r2     // Catch:{ all -> 0x0a9e }
            int r1 = r0.A02     // Catch:{ all -> 0x0a9e }
            if (r2 != r1) goto L_0x073a
            java.lang.String r3 = r0.A0C     // Catch:{ all -> 0x0a9e }
            java.lang.CharSequence r2 = r0.A07     // Catch:{ all -> 0x0a9e }
            int r0 = r0.A00     // Catch:{ all -> 0x0a9e }
            goto L_0x07af
        L_0x073a:
            X.2QF r1 = X.2QF.A00()     // Catch:{ all -> 0x0a9e }
            X.2QK r1 = r1.A08()     // Catch:{ all -> 0x0a9e }
            r1.A01(r0)     // Catch:{ all -> 0x0a9e }
            goto L_0x0537
        L_0x0747:
            java.lang.String r3 = "hprof_upload_failed_network_error"
            java.lang.String r1 = r0.A0C     // Catch:{ IOException | JSONException -> 0x07db }
            X.0Sd.A00(r1)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.CharSequence r1 = r0.A07     // Catch:{ IOException | JSONException -> 0x07db }
            X.0Sd.A00(r1)     // Catch:{ IOException | JSONException -> 0x07db }
            if (r10 == 0) goto L_0x0774
            java.lang.String r6 = r0.A0C     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.CharSequence r5 = r0.A07     // Catch:{ IOException | JSONException -> 0x07db }
            int r4 = r0.A00     // Catch:{ IOException | JSONException -> 0x07db }
            int r2 = r0.A02     // Catch:{ IOException | JSONException -> 0x07db }
            int r1 = r0.A01     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r20 = "upload_failed"
            r18 = r10
            r19 = r5
            r21 = r6
            r22 = r49
            r23 = r4
            r24 = r2
            r25 = r1
            r26 = r11
            X.2Pm.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ IOException | JSONException -> 0x07db }
        L_0x0774:
            r1 = r33
            X.2Pn r4 = r1.A07     // Catch:{ IOException | JSONException -> 0x07db }
            if (r4 == 0) goto L_0x01d5
            java.lang.String r2 = r0.A0C     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r1 = r0.A0B     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r40 = "hprof_id"
            java.lang.CharSequence r5 = r0.A07     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r41 = r5.toString()     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r42 = "file_size"
            java.lang.String r43 = java.lang.String.valueOf(r11)     // Catch:{ IOException | JSONException -> 0x07db }
            int r5 = r0.A02     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r45 = java.lang.String.valueOf(r5)     // Catch:{ IOException | JSONException -> 0x07db }
            int r5 = r0.A01     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r47 = java.lang.String.valueOf(r5)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.String r48 = "error_message"
            r36 = r31
            r37 = r2
            r38 = r32
            r39 = r1
            r44 = r35
            r46 = r15
            java.lang.String[] r1 = new java.lang.String[]{r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49}     // Catch:{ IOException | JSONException -> 0x07db }
            r4.A01(r3, r1)     // Catch:{ IOException | JSONException -> 0x07db }
            goto L_0x01d5
        L_0x07af:
            if (r10 == 0) goto L_0x01cf
            int r42 = r1 + -1
            java.lang.String r37 = "upload_succeeded"
            r35 = r10
            r36 = r2
            r38 = r3
            r40 = r0
            r41 = r1
        L_0x07bf:
            r43 = r11
            X.2Pm.A01(r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x0a9e }
            goto L_0x01cf
        L_0x07c6:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ IOException | JSONException -> 0x07db }
            r2.<init>(r1)     // Catch:{ IOException | JSONException -> 0x07db }
            goto L_0x07da
        L_0x07cd:
            r2 = move-exception
            goto L_0x07da
        L_0x07cf:
            java.lang.String r1 = "Unknown compression type "
            java.lang.String r1 = X.002.A0O(r1, r7)     // Catch:{ IOException | JSONException -> 0x07db }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IOException | JSONException -> 0x07db }
            r2.<init>(r1)     // Catch:{ IOException | JSONException -> 0x07db }
        L_0x07da:
            throw r2     // Catch:{ IOException | JSONException -> 0x07db }
        L_0x07db:
            r1 = move-exception
            java.lang.String r2 = r0.A0C     // Catch:{ all -> 0x0a9e }
            X.0Sd.A00(r2)     // Catch:{ all -> 0x0a9e }
            java.lang.CharSequence r2 = r0.A07     // Catch:{ all -> 0x0a9e }
            X.0Sd.A00(r2)     // Catch:{ all -> 0x0a9e }
            if (r10 == 0) goto L_0x0809
            java.lang.String r6 = r0.A0C     // Catch:{ all -> 0x0a9e }
            java.lang.CharSequence r5 = r0.A07     // Catch:{ all -> 0x0a9e }
            int r4 = r0.A00     // Catch:{ all -> 0x0a9e }
            java.lang.String r22 = r1.getMessage()     // Catch:{ all -> 0x0a9e }
            int r3 = r0.A02     // Catch:{ all -> 0x0a9e }
            int r2 = r0.A01     // Catch:{ all -> 0x0a9e }
            java.lang.String r20 = "upload_failed"
            r18 = r10
            r19 = r5
            r21 = r6
            r23 = r4
            r24 = r3
            r25 = r2
            r26 = r11
            X.2Pm.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0a9e }
        L_0x0809:
            r2 = r33
            X.2Pn r4 = r2.A07     // Catch:{ all -> 0x0a9e }
            if (r4 == 0) goto L_0x01d5
            java.lang.String r3 = r0.A0C     // Catch:{ all -> 0x0a9e }
            java.lang.String r2 = r0.A0B     // Catch:{ all -> 0x0a9e }
            java.lang.String r22 = "hprof_id"
            java.lang.CharSequence r5 = r0.A07     // Catch:{ all -> 0x0a9e }
            java.lang.String r23 = r5.toString()     // Catch:{ all -> 0x0a9e }
            java.lang.String r24 = "file_size"
            java.lang.String r25 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0a9e }
            java.lang.String r26 = "number_of_chunks"
            int r5 = r0.A02     // Catch:{ all -> 0x0a9e }
            java.lang.String r27 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0a9e }
            java.lang.String r28 = "current_chunk_index"
            int r0 = r0.A01     // Catch:{ all -> 0x0a9e }
            java.lang.String r29 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0a9e }
            r18 = r31
            r19 = r3
            r20 = r32
            r21 = r2
            java.lang.String[] r2 = new java.lang.String[]{r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}     // Catch:{ all -> 0x0a9e }
            java.lang.String r0 = "hprof_upload_failed"
            r4.A00(r0, r1, r2)     // Catch:{ all -> 0x0a9e }
            goto L_0x01d5
        L_0x0844:
            r1 = r5
            goto L_0x0193
        L_0x0847:
            r0 = r31
            java.lang.String r42 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r42 == 0) goto L_0x0a93
            java.lang.String r1 = "false"
            r0 = r19
            java.lang.String r0 = r2.getString(r0, r1)     // Catch:{ all -> 0x0a9e }
            boolean r59 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ all -> 0x0a9e }
            r0 = r18
            java.lang.String r0 = r2.getString(r0, r1)     // Catch:{ all -> 0x0a9e }
            boolean r60 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ all -> 0x0a9e }
            java.lang.String r1 = "0"
            r0 = r20
            java.lang.String r0 = r2.getString(r0, r1)     // Catch:{ all -> 0x0a9e }
            if (r0 == 0) goto L_0x0a8d
            long r55 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x0a9e }
            r0 = r21
            java.lang.String r38 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r38 == 0) goto L_0x0a87
            r0 = r23
            java.lang.String r46 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r46 == 0) goto L_0x0a81
            r0 = r32
            java.lang.String r41 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r41 == 0) goto L_0x0a7b
            r0 = r24
            java.lang.String r43 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r43 == 0) goto L_0x0a75
            r0 = r25
            java.lang.String r37 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r37 == 0) goto L_0x0a6f
            r0 = r26
            java.lang.String r40 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r40 == 0) goto L_0x0a69
            r0 = r27
            java.lang.String r45 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r45 == 0) goto L_0x0a63
            r0 = r34
            int r47 = r2.getInt(r15, r0)     // Catch:{ all -> 0x0a9e }
            r1 = r16
            int r48 = r2.getInt(r1, r0)     // Catch:{ all -> 0x0a9e }
            r0 = r28
            java.lang.String r39 = r2.getString(r0, r8)     // Catch:{ all -> 0x0a9e }
            if (r39 != 0) goto L_0x011d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x08c6:
            X.2QF r0 = X.2QF.A00()     // Catch:{ all -> 0x0a9e }
            X.2QM r0 = r0.A02()     // Catch:{ all -> 0x0a9e }
            java.io.File r0 = r0.A0C     // Catch:{ all -> 0x0a9e }
            java.nio.file.Path r0 = r0.toPath()     // Catch:{ IOException -> 0x01d5 }
            java.nio.file.DirectoryStream r7 = java.nio.file.Files.newDirectoryStream(r0)     // Catch:{ IOException -> 0x01d5 }
            if (r7 == 0) goto L_0x01d5
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x0951 }
            X.0Sd.A00(r6)     // Catch:{ all -> 0x0951 }
        L_0x08e1:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0951 }
            if (r0 == 0) goto L_0x094c
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x0951 }
            java.nio.file.Path r0 = (java.nio.file.Path) r0     // Catch:{ all -> 0x0951 }
            java.io.File r5 = r0.toFile()     // Catch:{ all -> 0x0951 }
            java.lang.String r4 = r5.getName()     // Catch:{ all -> 0x0951 }
            java.lang.String r0 = "hprof"
            boolean r0 = r4.endsWith(r0)     // Catch:{ all -> 0x0951 }
            if (r0 != 0) goto L_0x0915
            java.lang.String r0 = "hprof.gz"
            boolean r0 = r4.endsWith(r0)     // Catch:{ all -> 0x0951 }
            if (r0 != 0) goto L_0x0915
            java.lang.String r0 = "hprof.zst"
            boolean r0 = r4.endsWith(r0)     // Catch:{ all -> 0x0951 }
            if (r0 != 0) goto L_0x0915
            java.lang.String r0 = "hprof.xz"
            boolean r0 = r4.endsWith(r0)     // Catch:{ all -> 0x0951 }
            if (r0 == 0) goto L_0x08e1
        L_0x0915:
            r0 = r33
            X.2Pm r3 = r0.A06     // Catch:{ all -> 0x0951 }
            if (r3 == 0) goto L_0x0948
            r0 = 95
            int r2 = r4.indexOf(r0)     // Catch:{ all -> 0x0951 }
            if (r2 < 0) goto L_0x0931
            r0 = 46
            int r1 = r4.indexOf(r0, r2)     // Catch:{ all -> 0x0951 }
            if (r1 < 0) goto L_0x0931
            int r0 = r2 + 1
            java.lang.String r4 = r4.substring(r0, r1)     // Catch:{ all -> 0x0951 }
        L_0x0931:
            long r26 = r5.length()     // Catch:{ all -> 0x0951 }
            java.lang.String r21 = "unknown"
            java.lang.String r20 = "upload_abandoned"
            r22 = 0
            r18 = r3
            r19 = r4
            r23 = r34
            r24 = r34
            r25 = r34
            X.2Pm.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0951 }
        L_0x0948:
            r5.delete()     // Catch:{ all -> 0x0951 }
            goto L_0x08e1
        L_0x094c:
            r7.close()     // Catch:{ IOException -> 0x01d5 }
            goto L_0x01d5
        L_0x0951:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0956 }
            goto L_0x095a
        L_0x0956:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x01d5 }
        L_0x095a:
            throw r1     // Catch:{ IOException -> 0x01d5 }
        L_0x095b:
            java.nio.file.Path r0 = r0.toPath()     // Catch:{ IOException -> 0x0a0c }
            java.nio.file.DirectoryStream r9 = java.nio.file.Files.newDirectoryStream(r0)     // Catch:{ IOException -> 0x0a0c }
            if (r9 == 0) goto L_0x0a0c
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x0a02 }
            X.0Sd.A00(r8)     // Catch:{ all -> 0x0a02 }
        L_0x096c:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0a02 }
            if (r0 == 0) goto L_0x09fe
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0a02 }
            java.nio.file.Path r0 = (java.nio.file.Path) r0     // Catch:{ all -> 0x0a02 }
            java.io.File r4 = r0.toFile()     // Catch:{ all -> 0x0a02 }
            java.util.regex.Pattern r1 = X.AnonymousClass2QQ.A00     // Catch:{ all -> 0x0a02 }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x0a02 }
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch:{ all -> 0x0a02 }
            boolean r0 = r1.matches()     // Catch:{ all -> 0x0a02 }
            if (r0 == 0) goto L_0x096c
            r0 = r17
            java.lang.String r7 = r1.group(r0)     // Catch:{ all -> 0x0a02 }
            r0 = 2
            java.lang.String r6 = r1.group(r0)     // Catch:{ all -> 0x0a02 }
            if (r7 == 0) goto L_0x09f9
            if (r6 == 0) goto L_0x09f9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a02 }
            r1.<init>()     // Catch:{ all -> 0x0a02 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x09e5 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x09e5 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x09e5 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x09e5 }
            java.lang.String r0 = r3.readLine()     // Catch:{ all -> 0x09db }
        L_0x09ae:
            if (r0 == 0) goto L_0x09bd
            r1.append(r0)     // Catch:{ all -> 0x09db }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x09db }
            java.lang.String r0 = r3.readLine()     // Catch:{ all -> 0x09db }
            goto L_0x09ae
        L_0x09bd:
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x09db }
            com.facebook.quicklog.LightweightQuickPerformanceLogger r1 = r5.A00     // Catch:{ all -> 0x09db }
            r0 = 21373416(0x14621e8, float:3.6391183E-38)
            com.facebook.quicklog.EventBuilder r1 = r1.markEventBuilder(r0, r7)     // Catch:{ all -> 0x09db }
            java.lang.String r0 = "hprof_id"
            r1.annotate(r0, r6)     // Catch:{ all -> 0x09db }
            java.lang.String r0 = "contents"
            r1.annotate(r0, r2)     // Catch:{ all -> 0x09db }
            r1.report()     // Catch:{ all -> 0x09db }
            r3.close()     // Catch:{ IOException -> 0x09e5 }
            goto L_0x09f9
        L_0x09db:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x09e0 }
            goto L_0x09e4
        L_0x09e0:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x09e5 }
        L_0x09e4:
            throw r1     // Catch:{ IOException -> 0x09e5 }
        L_0x09e5:
            r3 = move-exception
            r0 = r33
            X.2Pn r2 = r0.A07     // Catch:{ all -> 0x0a02 }
            if (r2 == 0) goto L_0x09f9
            java.lang.String r1 = "hprof_id"
            java.lang.String r0 = "file_type"
            java.lang.String[] r1 = new java.lang.String[]{r1, r6, r0, r7}     // Catch:{ all -> 0x0a02 }
            java.lang.String r0 = "hprof_additional_data_upload_failed"
            r2.A00(r0, r3, r1)     // Catch:{ all -> 0x0a02 }
        L_0x09f9:
            r4.delete()     // Catch:{ all -> 0x0a02 }
            goto L_0x096c
        L_0x09fe:
            r9.close()     // Catch:{ IOException -> 0x0a0c }
            goto L_0x0a0c
        L_0x0a02:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0a07 }
            goto L_0x0a0b
        L_0x0a07:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x0a0c }
        L_0x0a0b:
            throw r1     // Catch:{ IOException -> 0x0a0c }
        L_0x0a0c:
            r1 = r61
            r0 = r34
            r1.set(r0)     // Catch:{ all -> 0x0aa7 }
            goto L_0x0ab3
        L_0x0a15:
            java.lang.String r0 = "Unknown compression type "
            java.lang.String r0 = X.002.A0O(r0, r5)     // Catch:{ all -> 0x0a9e }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r0)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a21:
            java.lang.String r0 = "Unknown compressed extension "
            java.lang.String r0 = X.002.A0R(r0, r5)     // Catch:{ all -> 0x0a9e }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r0)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a8d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0a9e }
            r1.<init>(r3)     // Catch:{ all -> 0x0a9e }
            goto L_0x0a9d
        L_0x0a99:
            r1 = move-exception
            r6.delete()     // Catch:{ all -> 0x0a9e }
        L_0x0a9d:
            throw r1     // Catch:{ all -> 0x0a9e }
        L_0x0a9e:
            r2 = move-exception
            r1 = r61
            r0 = r34
            r1.set(r0)     // Catch:{ all -> 0x0aa7 }
            throw r2     // Catch:{ all -> 0x0aa7 }
        L_0x0aa7:
            r3 = move-exception
            java.lang.String r2 = "hprof_upload_failed"
            r0 = r34
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0ac2 }
            r0 = r63
            r0.A00(r2, r3, r1)     // Catch:{ all -> 0x0ac2 }
        L_0x0ab3:
            r1 = r62
            r0 = r34
            r1.DMd(r0)
            android.util.SparseArray r1 = X.C278854xd.A00
            r0 = r64
            r1.remove(r0)
            return
        L_0x0ac2:
            r2 = move-exception
            r1 = r62
            r0 = r34
            r1.DMd(r0)
            android.util.SparseArray r1 = X.C278854xd.A00
            r0 = r64
            r1.remove(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C278914xj.run():void");
    }
}
