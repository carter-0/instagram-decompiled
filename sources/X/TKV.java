package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public final class TKV implements Runnable {
    public final C11171SDo A00;
    public final C11210SFk A01;
    public final C10999S4t A02;
    public final SettableFuture A03 = new Object();
    public final Executor A04;
    public final AtomicInteger A05 = Pxf.A10();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public TKV(C11210SFk sFk, C10999S4t s4t, Executor executor) {
        C11171SDo sDo = s4t.A01;
        this.A00 = sDo;
        this.A04 = executor;
        this.A01 = sFk;
        this.A02 = s4t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0893, code lost:
        if (r19 == null) goto L_0x0898;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r48 = this;
            r5 = r48
            java.lang.String r2 = "Fetching Download-on-Demand resource must not happen on UI thread"
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            java.lang.Thread r0 = X.C9925Rje.A00     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r0 = r0 ^ 1
            X.0JA.A09(r0, r2)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            X.SFk r0 = r5.A01     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r47 = r0
            X.Rw0 r0 = r0.A02     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r46 = r0
            X.S4t r11 = r5.A02     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r31 = 4
            java.lang.String r1 = "_id"
            r0 = 1146(0x47a, float:1.606E-42)
            java.lang.String r17 = X.AnonymousClass000.A00(r0)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r22 = 1
            java.lang.String r34 = "js_segment_hash"
            r20 = 2
            java.lang.String r35 = "version"
            r18 = 3
            r3 = r17
            r2 = r34
            r0 = r35
            java.lang.String[] r38 = new java.lang.String[]{r1, r3, r2, r0}     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            java.lang.String r10 = "main.jsbundle"
            java.lang.String r9 = r11.A03     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            int r0 = r11.A00     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r45 = r0
            java.lang.String r30 = java.lang.String.valueOf(r45)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r0 = r30
            java.lang.String[] r40 = new java.lang.String[]{r10, r9, r0}     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r0 = r46
            X.13i r0 = r0.A00     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r44 = r0
            java.lang.Object r0 = r44.get()     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r0.getClass()     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            java.lang.String r24 = "cached_resources"
            java.lang.String r39 = "name = ? AND flavor = ? AND build_number <= ?"
            r3 = 0
            java.lang.String r43 = "build_number DESC"
            r37 = r24
            r41 = r3
            r42 = r3
            r36 = r0
            android.database.Cursor r2 = r36.query(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x089b }
            r14 = 0
            if (r0 == 0) goto L_0x012f
            int r0 = r2.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x089b }
            int r13 = r2.getInt(r0)     // Catch:{ all -> 0x089b }
            r0 = r17
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x089b }
            int r6 = r2.getInt(r0)     // Catch:{ all -> 0x089b }
            r0 = r35
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x089b }
            int r4 = r2.getInt(r0)     // Catch:{ all -> 0x089b }
            r0 = r46
            java.io.File r1 = r0.A02     // Catch:{ all -> 0x089b }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x089b }
            java.io.File r7 = X.JTO.A0s(r1, r0)     // Catch:{ all -> 0x089b }
            java.lang.String r0 = "__DELIM__"
            java.lang.String r0 = X.002.A0g(r9, r0, r10)     // Catch:{ all -> 0x089b }
            java.io.File r7 = X.JTO.A0s(r7, r0)     // Catch:{ all -> 0x089b }
            boolean r0 = r7.exists()     // Catch:{ all -> 0x089b }
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x089b }
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch:{ all -> 0x089b }
            java.lang.Object r4 = r44.get()     // Catch:{ all -> 0x089b }
            r4.getClass()     // Catch:{ all -> 0x089b }
            android.database.sqlite.SQLiteDatabase r4 = (android.database.sqlite.SQLiteDatabase) r4     // Catch:{ all -> 0x089b }
            java.lang.String r1 = "_id = ?"
            r0 = r24
            r4.delete(r0, r1, r6)     // Catch:{ all -> 0x089b }
            goto L_0x012f
        L_0x00ca:
            r0 = r45
            if (r6 == r0) goto L_0x012a
            r0 = r34
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x089b }
            java.lang.String r8 = r2.getString(r0)     // Catch:{ all -> 0x089b }
            if (r8 == 0) goto L_0x012a
            java.lang.String r0 = r11.A02     // Catch:{ all -> 0x089b }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x089b }
            if (r0 == 0) goto L_0x012a
            r0 = r30
            java.io.File r1 = X.JTO.A0s(r1, r0)     // Catch:{ IOException -> 0x0122 }
            java.lang.String r0 = r7.getName()     // Catch:{ IOException -> 0x0122 }
            java.io.File r8 = X.JTO.A0s(r1, r0)     // Catch:{ IOException -> 0x0122 }
            com.google.common.io.Files.A00(r8)     // Catch:{ IOException -> 0x0122 }
            com.google.common.io.Files.A02(r7, r8)     // Catch:{ IOException -> 0x0122 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ IOException -> 0x0122 }
            r12.<init>()     // Catch:{ IOException -> 0x0122 }
            r1 = r17
            r0 = r45
            X.Pxe.A1K(r12, r1, r0)     // Catch:{ IOException -> 0x0122 }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ IOException -> 0x0122 }
            java.lang.String[] r14 = new java.lang.String[]{r0}     // Catch:{ IOException -> 0x0122 }
            java.lang.Object r13 = r44.get()     // Catch:{ IOException -> 0x0122 }
            r13.getClass()     // Catch:{ IOException -> 0x0122 }
            android.database.sqlite.SQLiteDatabase r13 = (android.database.sqlite.SQLiteDatabase) r13     // Catch:{ IOException -> 0x0122 }
            java.lang.String r1 = "_id = ?"
            r0 = r24
            r13.update(r0, r12, r1, r14)     // Catch:{ IOException -> 0x0122 }
            X.Rtt r14 = new X.Rtt     // Catch:{ all -> 0x089b }
            r0 = r45
            r14.<init>(r8, r0, r4)     // Catch:{ all -> 0x089b }
            goto L_0x012f
        L_0x0122:
            r8 = move-exception
            java.lang.String r1 = "OnDemandDiskCache"
            java.lang.String r0 = "Failed to move not modified resource"
            X.0KC.A0G(r1, r0, r8)     // Catch:{ all -> 0x089b }
        L_0x012a:
            X.Rtt r14 = new X.Rtt     // Catch:{ all -> 0x089b }
            r14.<init>(r7, r6, r4)     // Catch:{ all -> 0x089b }
        L_0x012f:
            r2.close()     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            if (r14 == 0) goto L_0x0145
            int r1 = r14.A00     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r0 = r45
            if (r1 != r0) goto L_0x0145
            java.io.File r1 = r14.A02     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            X.RrI r2 = new X.RrI     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r2.<init>(r1, r0)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            goto L_0x081d
        L_0x0145:
            r0 = r47
            X.13i r0 = r0.A07     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            java.lang.Object r1 = r0.get()     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            com.facebook.quicklog.QuickPerformanceLogger r1 = (com.facebook.quicklog.QuickPerformanceLogger) r1     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r8 = 28447843(0x1b21463, float:6.5416127E-38)
            int r0 = r11.hashCode()     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            X.S1h r7 = new X.S1h     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r7.<init>(r1, r8, r0)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            com.facebook.quicklog.LightweightQuickPerformanceLogger r6 = r7.A02     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            if (r6 == 0) goto L_0x0181
            int r0 = r7.A00     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r6.markerStart(r8, r0)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            com.facebook.quicklog.MarkerEditor r2 = r6.withMarker(r8, r0)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
        L_0x0168:
            java.lang.String r25 = "resource_name"
            r0 = r25
            r2.annotate(r0, r10)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            java.lang.String r13 = "resource_flavor"
            r2.annotate(r13, r9)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r1 = r17
            r0 = r45
            r2.annotate(r1, r0)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r2.markerEditingCompleted()     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            goto L_0x0184
        L_0x0181:
            X.10M r2 = X.10M.A00     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            goto L_0x0168
        L_0x0184:
            r19 = 0
            r21 = 1
            r4 = 0
            java.lang.String r2 = "has_base_resource"
            boolean r1 = X.AnonymousClass7TF.A1V(r14)
            if (r6 == 0) goto L_0x0196
            int r0 = r7.A00     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            r6.markerAnnotate(r8, r0, r2, r1)     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
        L_0x0196:
            if (r14 == 0) goto L_0x01ae
            java.lang.String r2 = "base_build_number"
            int r1 = r14.A00     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            if (r6 == 0) goto L_0x01a3
            int r0 = r7.A00     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            r6.markerAnnotate(r8, r0, r2, r1)     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
        L_0x01a3:
            java.lang.String r2 = "base_resource_version"
            int r1 = r14.A01     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            if (r6 == 0) goto L_0x01ae
            int r0 = r7.A00     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            r6.markerAnnotate(r8, r0, r2, r1)     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
        L_0x01ae:
            int r0 = com.facebook.common.build.BuildConstants.A01()     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            java.lang.String r16 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            r12 = 0
            if (r14 != 0) goto L_0x01bb
            r2 = r3
            goto L_0x01c7
        L_0x01bb:
            int r0 = r14.A00     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            int r0 = r14.A01     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
        L_0x01c7:
            r0 = r46
            java.io.File r0 = r0.A03     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            r36 = r0
            X.Pxg.A1L(r36)     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            java.lang.String r33 = "__DELIM__"
            r0 = r33
            java.lang.String r1 = X.002.A0g(r9, r0, r10)     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            java.lang.String r32 = "-"
            r0 = r32
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            r0 = r36
            java.io.File r23 = java.io.File.createTempFile(r1, r3, r0)     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            r23.deleteOnExit()     // Catch:{ Exception -> 0x0836, all -> 0x0834 }
            java.lang.String r0 = "network_download_start"
            r7.A00(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            X.1Fc r1 = new X.1Fc     // Catch:{ Exception -> 0x0445 }
            r1.<init>()     // Catch:{ Exception -> 0x0445 }
            java.lang.String r15 = "native_build"
            r0 = r16
            r1.A05(r15, r0)     // Catch:{ Exception -> 0x0445 }
            java.lang.String r0 = "ota_build"
            r15 = r30
            r1.A05(r0, r15)     // Catch:{ Exception -> 0x0445 }
            r0 = r25
            r1.A05(r0, r10)     // Catch:{ Exception -> 0x0445 }
            r1.A05(r13, r9)     // Catch:{ Exception -> 0x0445 }
            java.lang.String r13 = "prefer_compressed"
            java.lang.String r0 = "true"
            r1.A05(r13, r0)     // Catch:{ Exception -> 0x0445 }
            java.lang.String r13 = "567067343352427"
            java.lang.String r0 = "custom_app_id"
            r1.A05(r0, r13)     // Catch:{ Exception -> 0x0445 }
            if (r2 == 0) goto L_0x0223
            java.lang.String r0 = "base_build"
            r1.A05(r0, r2)     // Catch:{ Exception -> 0x0445 }
        L_0x0223:
            if (r12 == 0) goto L_0x022a
            java.lang.String r0 = "base_dod_version"
            r1.A05(r0, r12)     // Catch:{ Exception -> 0x0445 }
        L_0x022a:
            java.lang.String r0 = "/api/v1/facebook_dod/request_dod_resources/"
            java.lang.String r0 = X.1Ma.A03(r0)     // Catch:{ Exception -> 0x0445 }
            java.lang.String r0 = r1.A01(r0)     // Catch:{ Exception -> 0x0445 }
            X.1Pq r2 = new X.1Pq     // Catch:{ Exception -> 0x0445 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0445 }
            r2.A02(r0)     // Catch:{ Exception -> 0x0445 }
            java.lang.Integer r12 = X.AnonymousClass05K.A0N     // Catch:{ Exception -> 0x0445 }
            r2.A01(r12)     // Catch:{ Exception -> 0x0445 }
            r1 = 1
            r2.A05 = r1     // Catch:{ Exception -> 0x0445 }
            X.1QS r13 = r2.A00()     // Catch:{ Exception -> 0x0445 }
            java.lang.String r2 = "get_on_demand_resource_metadata"
            X.1QT r0 = new X.1QT     // Catch:{ Exception -> 0x0445 }
            r0.<init>()     // Catch:{ Exception -> 0x0445 }
            r0.A0A = r2     // Catch:{ Exception -> 0x0445 }
            X.1QX r2 = X.Pxf.A0R(r13, r0)     // Catch:{ Exception -> 0x0445 }
            X.1C7 r0 = X.AnonymousClass1C7.A00()     // Catch:{ Exception -> 0x0445 }
            X.2ZL r13 = r0.A01(r2)     // Catch:{ Exception -> 0x0445 }
            int r0 = r13.A02     // Catch:{ Exception -> 0x0445 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 == r2) goto L_0x028b
            X.1Qb r2 = r13.A00()     // Catch:{ Exception -> 0x0445 }
            if (r2 != 0) goto L_0x026c
            java.lang.String r9 = r13.A03     // Catch:{ Exception -> 0x0445 }
            goto L_0x027e
        L_0x026c:
            java.io.InputStream r9 = r2.AjD()     // Catch:{ Exception -> 0x0445 }
            java.nio.charset.Charset r3 = X.AnonymousClass2RN.A05     // Catch:{ Exception -> 0x0445 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0445 }
            r2.<init>(r9, r3)     // Catch:{ Exception -> 0x0445 }
            java.lang.String r9 = X.AnonymousClass3JA.A00(r2)     // Catch:{ all -> 0x0285 }
            r2.close()     // Catch:{ Exception -> 0x0445 }
        L_0x027e:
            r2 = 404(0x194, float:5.66E-43)
            if (r0 == r2) goto L_0x043f
            r1 = 2
            goto L_0x043f
        L_0x0285:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x0433 }
            goto L_0x0444
        L_0x028b:
            X.1Qb r0 = r13.A00()     // Catch:{ Exception -> 0x0445 }
            if (r0 == 0) goto L_0x0438
            java.io.InputStream r1 = r0.AjD()     // Catch:{ Exception -> 0x0445 }
            java.nio.charset.Charset r0 = X.AnonymousClass2RN.A05     // Catch:{ Exception -> 0x0445 }
            java.io.InputStreamReader r15 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0445 }
            r15.<init>(r1, r0)     // Catch:{ Exception -> 0x0445 }
            java.lang.String r0 = X.AnonymousClass3JA.A00(r15)     // Catch:{ all -> 0x042e }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ all -> 0x042e }
            X.RoB r0 = X.C9245RUw.parseFromJson(r0)     // Catch:{ all -> 0x042e }
            if (r0 == 0) goto L_0x041f
            X.RxA r13 = r0.A00     // Catch:{ all -> 0x042e }
            if (r13 == 0) goto L_0x0419
            java.lang.String r0 = r13.A04     // Catch:{ all -> 0x042e }
            r25 = r0
            if (r0 == 0) goto L_0x0411
            boolean r0 = r25.isEmpty()     // Catch:{ all -> 0x042e }
            if (r0 != 0) goto L_0x0411
            java.lang.String r0 = r13.A03     // Catch:{ all -> 0x042e }
            r29 = r0
            if (r0 == 0) goto L_0x0408
            boolean r0 = r29.isEmpty()     // Catch:{ all -> 0x042e }
            if (r0 != 0) goto L_0x0408
            int r1 = r13.A00     // Catch:{ all -> 0x042e }
            if (r1 <= 0) goto L_0x03fc
            int r0 = r13.A01     // Catch:{ all -> 0x042e }
            r28 = r0
            if (r0 <= 0) goto L_0x03f4
            java.lang.String r13 = r13.A02     // Catch:{ all -> 0x042e }
            if (r13 == 0) goto L_0x0426
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x042e }
            if (r0 != 0) goto L_0x0426
            r15.close()     // Catch:{ Exception -> 0x0445 }
            r16 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0445 }
            r27 = r0 ^ 1
            if (r27 != 0) goto L_0x02e9
            r16 = r25
        L_0x02e9:
            r16.getClass()     // Catch:{ Exception -> 0x0445 }
            X.1Pq r15 = new X.1Pq     // Catch:{ Exception -> 0x0445 }
            r15.<init>(r3)     // Catch:{ Exception -> 0x0445 }
            r0 = r16
            r15.A02 = r0     // Catch:{ Exception -> 0x0445 }
            r15.A01(r12)     // Catch:{ Exception -> 0x0445 }
            r0 = r22
            r15.A05 = r0     // Catch:{ Exception -> 0x0445 }
            X.1QS r15 = r15.A00()     // Catch:{ Exception -> 0x0445 }
            java.lang.String r0 = "download_on_demand_resource"
            X.1QT r12 = new X.1QT     // Catch:{ Exception -> 0x0445 }
            r12.<init>()     // Catch:{ Exception -> 0x0445 }
            r12.A0A = r0     // Catch:{ Exception -> 0x0445 }
            X.1QX r12 = X.Pxf.A0R(r15, r12)     // Catch:{ Exception -> 0x0445 }
            X.1C7 r0 = X.AnonymousClass1C7.A00()     // Catch:{ Exception -> 0x0445 }
            X.2ZL r12 = r0.A01(r12)     // Catch:{ Exception -> 0x0445 }
            int r0 = r12.A02     // Catch:{ Exception -> 0x0445 }
            if (r0 != r2) goto L_0x03ea
            X.1Qb r0 = r12.A00()     // Catch:{ Exception -> 0x0445 }
            if (r0 == 0) goto L_0x03e3
            java.io.InputStream r2 = r0.AjD()     // Catch:{ Exception -> 0x0445 }
            r0 = r23
            X.0mb.A09(r0, r2)     // Catch:{ all -> 0x03de }
            r2.close()     // Catch:{ Exception -> 0x0445 }
            long r15 = (long) r1     // Catch:{ Exception -> 0x0445 }
            java.lang.String r0 = "network_download_end"
            r7.A00(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r6 == 0) goto L_0x033b
            int r0 = r7.A00     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            com.facebook.quicklog.MarkerEditor r12 = r6.withMarker(r8, r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            goto L_0x033d
        L_0x033b:
            X.10M r12 = X.10M.A00     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x033d:
            java.lang.String r2 = "download_file_size"
            long r25 = r23.length()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r25
            r12.annotate(r2, r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = "resource_version"
            r1 = r28
            r12.annotate(r0, r1)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = "compression"
            r12.annotate(r0, r13)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r1 = "is_delta"
            r0 = r27
            r12.annotate(r1, r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r12.markerEditingCompleted()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r1 = r11.A02     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            X.Pxg.A1L(r36)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r33
            java.lang.String r0 = X.002.A0g(r9, r0, r10)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r2 = r32
            java.lang.String r0 = X.002.A0R(r0, r2)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r2 = r36
            java.io.File r25 = java.io.File.createTempFile(r0, r3, r2)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r25.deleteOnExit()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r19 = r25
            if (r27 == 0) goto L_0x04a8
            java.lang.String r0 = "delta_patch_start"
            r7.A00(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = "FetchResourceTask"
            if (r14 == 0) goto L_0x03d1
            r0 = r47
            X.Ro8 r0 = r0.A00     // Catch:{ RK9 -> 0x03be }
            java.io.File r2 = r14.A02     // Catch:{ RK9 -> 0x03be }
            X.RoC r0 = r0.A00     // Catch:{ PatchException -> 0x03ad }
            com.facebook.common.patch.core.BsdiffNativeLibrary r0 = r0.A00     // Catch:{ PatchException -> 0x03ad }
            r0.A00()     // Catch:{ PatchException -> 0x03ad }
            java.lang.String r12 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x03a4 }
            java.lang.String r2 = r25.getAbsolutePath()     // Catch:{ IOException -> 0x03a4 }
            java.lang.String r0 = r23.getAbsolutePath()     // Catch:{ IOException -> 0x03a4 }
            com.facebook.common.patch.core.BsdiffNativeLibrary.patch(r12, r2, r0)     // Catch:{ IOException -> 0x03a4 }
            goto L_0x0537
        L_0x03a4:
            r2 = move-exception
            java.lang.String r1 = "Error applying patch."
            com.facebook.common.patch.core.PatchException r0 = new com.facebook.common.patch.core.PatchException     // Catch:{ PatchException -> 0x03ad }
            r0.<init>(r1, r2)     // Catch:{ PatchException -> 0x03ad }
            throw r0     // Catch:{ PatchException -> 0x03ad }
        L_0x03ad:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ RK9 -> 0x03be }
            if (r0 == 0) goto L_0x03b8
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ RK9 -> 0x03be }
        L_0x03b8:
            X.RK9 r0 = new X.RK9     // Catch:{ RK9 -> 0x03be }
            r0.<init>(r1)     // Catch:{ RK9 -> 0x03be }
            throw r0     // Catch:{ RK9 -> 0x03be }
        L_0x03be:
            r2 = move-exception
            r1 = 7
            java.lang.Throwable r0 = r2.getCause()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r0 == 0) goto L_0x03ca
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x03ca:
            X.QLP r9 = new X.QLP     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r9.<init>((int) r1, (java.lang.Throwable) r2)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            goto L_0x04d7
        L_0x03d1:
            java.lang.String r1 = "Server returned delta, but client didn't have base resource"
            X.0KC.A0E(r0, r1)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = 6
            X.QLP r9 = new X.QLP     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            goto L_0x04d7
        L_0x03de:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x0433 }
            goto L_0x0444
        L_0x03e3:
            java.lang.String r0 = "Response body is null"
            java.io.IOException r3 = X.JTO.A0u(r0)     // Catch:{ Exception -> 0x0445 }
            goto L_0x0444
        L_0x03ea:
            java.lang.String r1 = r12.A03     // Catch:{ Exception -> 0x0445 }
            X.RKm r3 = new X.RKm     // Catch:{ Exception -> 0x0445 }
            r0 = r20
            r3.<init>((int) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x0445 }
            goto L_0x0444
        L_0x03f4:
            java.lang.String r0 = "dod_version_number"
            X.RKA r1 = new X.RKA     // Catch:{ all -> 0x042e }
            r1.<init>(r0)     // Catch:{ all -> 0x042e }
            goto L_0x042d
        L_0x03fc:
            r0 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x042e }
            X.RKA r1 = new X.RKA     // Catch:{ all -> 0x042e }
            r1.<init>(r0)     // Catch:{ all -> 0x042e }
            goto L_0x042d
        L_0x0408:
            java.lang.String r0 = "uncompressed_file_sha256_checksum"
            X.RKA r1 = new X.RKA     // Catch:{ all -> 0x042e }
            r1.<init>(r0)     // Catch:{ all -> 0x042e }
            goto L_0x042d
        L_0x0411:
            java.lang.String r0 = "download_url"
            X.RKA r1 = new X.RKA     // Catch:{ all -> 0x042e }
            r1.<init>(r0)     // Catch:{ all -> 0x042e }
            goto L_0x042d
        L_0x0419:
            X.RKm r1 = new X.RKm     // Catch:{ all -> 0x042e }
            r1.<init>()     // Catch:{ all -> 0x042e }
            goto L_0x042d
        L_0x041f:
            java.lang.String r0 = "Metadata JSON response is null"
            java.io.IOException r1 = X.JTO.A0u(r0)     // Catch:{ all -> 0x042e }
            goto L_0x042d
        L_0x0426:
            java.lang.String r0 = "compression_format"
            X.RKA r1 = new X.RKA     // Catch:{ all -> 0x042e }
            r1.<init>(r0)     // Catch:{ all -> 0x042e }
        L_0x042d:
            throw r1     // Catch:{ all -> 0x042e }
        L_0x042e:
            r3 = move-exception
            r15.close()     // Catch:{ all -> 0x0433 }
            goto L_0x0444
        L_0x0433:
            r0 = move-exception
            X.C9153RRe.A00(r3, r0)     // Catch:{ Exception -> 0x0445 }
            goto L_0x0444
        L_0x0438:
            java.lang.String r0 = "Response body is null"
            java.io.IOException r3 = X.JTO.A0u(r0)     // Catch:{ Exception -> 0x0445 }
            goto L_0x0444
        L_0x043f:
            X.RKm r3 = new X.RKm     // Catch:{ Exception -> 0x0445 }
            r3.<init>((int) r1, (java.lang.String) r9)     // Catch:{ Exception -> 0x0445 }
        L_0x0444:
            throw r3     // Catch:{ Exception -> 0x0445 }
        L_0x0445:
            r2 = move-exception
            boolean r0 = r2 instanceof X.C8994RKm     // Catch:{ RKm -> 0x046b }
            if (r0 == 0) goto L_0x044e
            r1 = r2
            X.RKm r1 = (X.C8994RKm) r1     // Catch:{ RKm -> 0x046b }
        L_0x044d:
            throw r1     // Catch:{ RKm -> 0x046b }
        L_0x044e:
            boolean r0 = r2 instanceof X.RKA     // Catch:{ RKm -> 0x046b }
            if (r0 == 0) goto L_0x045a
            X.RKm r1 = new X.RKm     // Catch:{ RKm -> 0x046b }
            r0 = r31
            r1.<init>((int) r0, (java.lang.Throwable) r2)     // Catch:{ RKm -> 0x046b }
            goto L_0x044d
        L_0x045a:
            boolean r0 = r2 instanceof java.io.IOException     // Catch:{ RKm -> 0x046b }
            if (r0 == 0) goto L_0x0464
            X.RKm r1 = new X.RKm     // Catch:{ RKm -> 0x046b }
            r1.<init>((int) r4, (java.lang.Throwable) r2)     // Catch:{ RKm -> 0x046b }
            goto L_0x044d
        L_0x0464:
            r0 = 5
            X.RKm r1 = new X.RKm     // Catch:{ RKm -> 0x046b }
            r1.<init>((int) r0, (java.lang.Throwable) r2)     // Catch:{ RKm -> 0x046b }
            goto L_0x044d
        L_0x046b:
            r3 = move-exception
            int r2 = r3.A00     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r22
            if (r2 != r0) goto L_0x0484
            java.lang.String r2 = "Resource "
            java.lang.String r1 = r11.A05     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = " was not found on server"
            java.lang.String r1 = X.002.A0g(r2, r1, r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            X.QLP r9 = new X.QLP     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r22
            r9.<init>((int) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            goto L_0x04d7
        L_0x0484:
            r1 = 4
            if (r2 == 0) goto L_0x0497
            r0 = r20
            if (r2 == r0) goto L_0x0495
            r0 = r18
            if (r2 == r0) goto L_0x0493
            if (r2 == r1) goto L_0x0498
            r1 = 5
            goto L_0x0498
        L_0x0493:
            r1 = 3
            goto L_0x0498
        L_0x0495:
            r1 = 2
            goto L_0x0498
        L_0x0497:
            r1 = 0
        L_0x0498:
            java.lang.Throwable r0 = r3.getCause()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r0 == 0) goto L_0x04a2
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x04a2:
            X.QLP r9 = new X.QLP     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r9.<init>((int) r1, (java.lang.Throwable) r3)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            goto L_0x04d7
        L_0x04a8:
            java.lang.String r0 = "none"
            boolean r0 = r13.equals(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0534
            java.lang.String r0 = "uncompress_start"
            r7.A00(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r12 = "gzip"
            boolean r0 = r12.equals(r13)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r0 != 0) goto L_0x04d8
            java.lang.String r0 = "xz"
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r0 != 0) goto L_0x04d8
            r1 = 8
            java.lang.String r0 = " compression is not supported"
            java.lang.String r0 = X.002.A0R(r13, r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            X.QLP r9 = new X.QLP     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r9.<init>((int) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x04d7:
            throw r9     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x04d8:
            r23.getPath()     // Catch:{ IOException -> 0x052b }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x052b }
            r0 = r23
            r2.<init>(r0)     // Catch:{ IOException -> 0x052b }
            java.lang.String r0 = "xz"
            boolean r0 = r13.equals(r0)     // Catch:{ IOException -> 0x052b }
            if (r0 != 0) goto L_0x04fe
            boolean r0 = r13.equals(r12)     // Catch:{ IOException -> 0x052b }
            if (r0 == 0) goto L_0x04f7
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x052b }
            r0.<init>(r2)     // Catch:{ IOException -> 0x052b }
            goto L_0x0503
        L_0x04f7:
            java.lang.String r0 = "Unsupported compression: "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TF.A0W(r0, r13)     // Catch:{ IOException -> 0x052b }
            goto L_0x052a
        L_0x04fe:
            X.0zT r0 = new X.0zT     // Catch:{ IOException -> 0x052b }
            r0.<init>(r2)     // Catch:{ IOException -> 0x052b }
        L_0x0503:
            java.io.FileOutputStream r2 = X.JTO.A0t(r25)     // Catch:{ all -> 0x0521 }
            X.1W7.A00(r0, r2)     // Catch:{ all -> 0x0517 }
            r2.close()     // Catch:{ all -> 0x0521 }
            r0.close()     // Catch:{ IOException -> 0x052b }
            java.lang.String r0 = "uncompress_end"
            r7.A00(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            goto L_0x053c
        L_0x0517:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x051c }
            goto L_0x0520
        L_0x051c:
            r1 = move-exception
            X.C9153RRe.A00(r3, r1)     // Catch:{ all -> 0x0521 }
        L_0x0520:
            throw r3     // Catch:{ all -> 0x0521 }
        L_0x0521:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0526 }
            goto L_0x052a
        L_0x0526:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x052b }
        L_0x052a:
            throw r1     // Catch:{ IOException -> 0x052b }
        L_0x052b:
            r1 = move-exception
            r0 = 9
            X.QLP r9 = new X.QLP     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r9.<init>((int) r0, (java.lang.Throwable) r1)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            goto L_0x04d7
        L_0x0534:
            r19 = r23
            goto L_0x053c
        L_0x0537:
            java.lang.String r0 = "delta_patch_end"
            r7.A00(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x053c:
            java.lang.String r0 = "verify_uncompressed_file_start"
            r7.A00(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r19.getPath()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            long r12 = r19.length()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r2 = 10
            int r0 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x077f
            r19.getPath()     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            X.2RM r0 = X.AnonymousClass2RJ.A00     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            X.2RO r14 = r0.A02()     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            X.RCy r13 = new X.RCy     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            r13.<init>(r14)     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            X.2kF r12 = X.C227852k8.A00     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            java.util.ArrayDeque r11 = new java.util.ArrayDeque     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            r0 = r31
            r11.<init>(r0)     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch:{ all -> 0x0732 }
            r0 = r19
            r15.<init>(r0)     // Catch:{ all -> 0x0732 }
            r11.addFirst(r15)     // Catch:{ all -> 0x0732 }
            X.1W7.A00(r15, r13)     // Catch:{ all -> 0x0732 }
            X.C227852k8.A00(r12, r3, r11)     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            X.2RS r11 = r14.A03()     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            X.2RS r0 = X.2RT.A01(r29)     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            boolean r12 = r11.equals(r0)     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            if (r12 == 0) goto L_0x0757
            java.lang.String r0 = "verify_uncompressed_file_end"
            r7.A00(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = "store_in_cache_start"
            r7.A00(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r46
            java.io.File r12 = r0.A02     // Catch:{ IOException -> 0x0722 }
            r0 = r30
            java.io.File r2 = X.JTO.A0s(r12, r0)     // Catch:{ IOException -> 0x0722 }
            r0 = r33
            java.lang.String r0 = X.002.A0g(r9, r0, r10)     // Catch:{ IOException -> 0x0722 }
            java.io.File r27 = X.JTO.A0s(r2, r0)     // Catch:{ IOException -> 0x0722 }
            com.google.common.io.Files.A00(r27)     // Catch:{ IOException -> 0x0720 }
            r2 = r19
            r0 = r27
            com.google.common.io.Files.A02(r2, r0)     // Catch:{ IOException -> 0x0720 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ IOException -> 0x0720 }
            r13.<init>()     // Catch:{ IOException -> 0x0720 }
            java.lang.String r16 = "name"
            r0 = r16
            r13.put(r0, r10)     // Catch:{ IOException -> 0x0720 }
            java.lang.String r2 = "flavor"
            r13.put(r2, r9)     // Catch:{ IOException -> 0x0720 }
            r11 = r17
            r0 = r45
            X.Pxe.A1K(r13, r11, r0)     // Catch:{ IOException -> 0x0720 }
            r11 = r35
            r0 = r28
            X.Pxe.A1K(r13, r11, r0)     // Catch:{ IOException -> 0x0720 }
            if (r1 == 0) goto L_0x05d5
            r0 = r34
            r13.put(r0, r1)     // Catch:{ IOException -> 0x0720 }
        L_0x05d5:
            java.lang.Object r1 = r44.get()     // Catch:{ IOException -> 0x0720 }
            r1.getClass()     // Catch:{ IOException -> 0x0720 }
            android.database.sqlite.SQLiteDatabase r1 = (android.database.sqlite.SQLiteDatabase) r1     // Catch:{ IOException -> 0x0720 }
            r0 = 2027404110(0x78d7bb4e, float:3.5004463E34)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ IOException -> 0x0720 }
            r0 = r24
            long r25 = r1.insert(r0, r3, r13)     // Catch:{ IOException -> 0x0720 }
            r0 = -438262255(0xffffffffe5e0a611, float:-1.32609185E23)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ IOException -> 0x0720 }
            r14 = -1
            int r0 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0709
            java.lang.String r0 = "store_in_cache_end"
            r7.A00(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = "clear_cache_start"
            r7.A00(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r47
            X.S0J r3 = r0.A06     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.util.HashSet r11 = X.AnonymousClass7TE.A1F()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            int r0 = r3.A00()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r11.add(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            X.13i r0 = r3.A00     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r0 == 0) goto L_0x0823
            X.SEu r0 = (X.C11194SEu) r0     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            X.1Uk r1 = r0.A02     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = "next"
            int r0 = r1.getInt(r0, r4)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r0 != 0) goto L_0x062d
            int r0 = r3.A00()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x062d:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r11.add(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r30
            r11.add(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r46
            java.io.File r1 = r0.A01     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r0 == 0) goto L_0x066b
            X.T94 r0 = new X.T94     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0.<init>()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.io.File[] r14 = r1.listFiles(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r14 == 0) goto L_0x066b
            int r13 = r14.length     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r3 = 0
        L_0x0650:
            if (r3 >= r13) goto L_0x066b
            r15 = r14[r3]     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = r15.getName()     // Catch:{ NumberFormatException -> 0x0668 }
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0668 }
            int r0 = com.facebook.common.build.BuildConstants.A01()     // Catch:{ NumberFormatException -> 0x0668 }
            if (r1 == r0) goto L_0x0668
            r15.getPath()     // Catch:{ NumberFormatException -> 0x0668 }
            X.C9248RUz.A00(r15)     // Catch:{ NumberFormatException -> 0x0668 }
        L_0x0668:
            int r3 = r3 + 1
            goto L_0x0650
        L_0x066b:
            boolean r0 = r12.exists()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r13 = 0
            if (r0 == 0) goto L_0x06ae
            X.T94 r0 = new X.T94     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0.<init>()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.io.File[] r14 = r12.listFiles(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r14 == 0) goto L_0x06ae
            r0 = r33
            java.lang.String r15 = X.002.A0g(r9, r0, r10)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            int r12 = r14.length     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x0684:
            if (r13 >= r12) goto L_0x06ae
            r3 = r14[r13]     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r1 = r3.getName()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r11)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            boolean r0 = r0.contains(r1)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x06ab
            java.io.File r1 = X.JTO.A0s(r3, r15)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r0 == 0) goto L_0x06ab
            boolean r0 = r1.delete()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r0 == 0) goto L_0x06ab
            r1.getPath()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x06ab:
            int r13 = r13 + 1
            goto L_0x0684
        L_0x06ae:
            java.lang.StringBuilder r12 = X.AnonymousClass7TF.A0n(r16)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = " = ? AND "
            r12.append(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r12.append(r2)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = " = ?"
            r12.append(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.util.ArrayList r10 = X.DbV.A14(r10)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r10.add(r9)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r11)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            int r1 = r0.size()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r1 <= 0) goto L_0x07d8
            java.lang.String r0 = " AND "
            r12.append(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r17
            r12.append(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = " NOT IN (?"
            r12.append(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            int r1 = r1 + -1
            java.lang.String r9 = ",?"
            r2 = 1
            if (r1 > r2) goto L_0x06e8
            goto L_0x07aa
        L_0x06e8:
            int r13 = r9.length()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            long r2 = (long) r13     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            long r0 = (long) r1     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            long r2 = r2 * r0
            int r14 = (int) r2     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            long r0 = (long) r14     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 != 0) goto L_0x06fc
            char[] r0 = new char[r14]     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r9.getChars(r4, r13, r0, r4)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            goto L_0x07b7
        L_0x06fc:
            java.lang.String r0 = "Required array size too large: "
            java.lang.String r0 = X.002.A0Q(r0, r2)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.ArrayIndexOutOfBoundsException r9 = new java.lang.ArrayIndexOutOfBoundsException     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            goto L_0x04d7
        L_0x0709:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x0720 }
            java.lang.String r0 = "Failed to insert row "
            r1.append(r0)     // Catch:{ IOException -> 0x0720 }
            r1.append(r13)     // Catch:{ IOException -> 0x0720 }
            java.lang.String r0 = " into database"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ IOException -> 0x0720 }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException -> 0x0720 }
            throw r0     // Catch:{ IOException -> 0x0720 }
        L_0x0720:
            r0 = move-exception
            goto L_0x0724
        L_0x0722:
            r0 = move-exception
            goto L_0x0727
        L_0x0724:
            X.JTR.A1O(r27)     // Catch:{ IOException -> 0x0728 }
        L_0x0727:
            throw r0     // Catch:{ IOException -> 0x0728 }
        L_0x0728:
            r1 = move-exception
            r0 = 12
            X.QLP r9 = new X.QLP     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r9.<init>((int) r0, (java.lang.Throwable) r1)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            goto L_0x04d7
        L_0x0732:
            r3 = move-exception
            java.lang.Class<java.io.IOException> r1 = java.io.IOException.class
            java.lang.Object r0 = X.SS5.A00     // Catch:{ all -> 0x0752 }
            boolean r0 = r1.isInstance(r3)     // Catch:{ all -> 0x0752 }
            if (r0 != 0) goto L_0x074a
            boolean r0 = r3 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0752 }
            if (r0 != 0) goto L_0x0751
            boolean r0 = r3 instanceof java.lang.Error     // Catch:{ all -> 0x0752 }
            if (r0 != 0) goto L_0x0751
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r3)     // Catch:{ all -> 0x0752 }
        L_0x0749:
            throw r0     // Catch:{ all -> 0x0752 }
        L_0x074a:
            java.lang.Object r0 = r1.cast(r3)     // Catch:{ all -> 0x0752 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0752 }
            goto L_0x0749
        L_0x0751:
            throw r3     // Catch:{ all -> 0x0752 }
        L_0x0752:
            r1 = move-exception
            X.C227852k8.A00(r12, r3, r11)     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            goto L_0x076c
        L_0x0757:
            java.lang.String r9 = "Expected SHA-256 is "
            java.lang.String r3 = r0.toString()     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            java.lang.String r1 = ", but actual was "
            java.lang.String r0 = r11.toString()     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            java.lang.String r0 = X.002.A0u(r9, r3, r1, r0)     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            X.RK8 r1 = new X.RK8     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
            r1.<init>(r0)     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
        L_0x076c:
            throw r1     // Catch:{ RK8 -> 0x0777, IOException -> 0x076d }
        L_0x076d:
            r1 = move-exception
            r0 = 11
            X.QLP r9 = new X.QLP     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r9.<init>((int) r0, (java.lang.Throwable) r1)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            goto L_0x04d7
        L_0x0777:
            r0 = move-exception
            X.QLP r9 = new X.QLP     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r9.<init>((int) r2, (java.lang.Throwable) r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            goto L_0x04d7
        L_0x077f:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = "Expected file size of "
            r3.append(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = r11.A05     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r3.append(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = " is to be "
            r3.append(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r15
            r3.append(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = ", but received "
            r3.append(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            long r0 = r19.length()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = X.Pxe.A10(r3, r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            X.QLP r9 = new X.QLP     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r9.<init>((int) r2, (java.lang.String) r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            goto L_0x04d7
        L_0x07aa:
            if (r1 >= 0) goto L_0x07ad
            r2 = 0
        L_0x07ad:
            java.lang.String r0 = "invalid count: %s"
            X.17k.A0C(r0, r1, r2)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r1 != 0) goto L_0x07c9
            java.lang.String r9 = ""
            goto L_0x07c9
        L_0x07b7:
            int r1 = r14 - r13
            if (r13 >= r1) goto L_0x07c1
            java.lang.System.arraycopy(r0, r4, r0, r13, r13)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            int r13 = r13 << 1
            goto L_0x07b7
        L_0x07c1:
            java.lang.System.arraycopy(r0, r4, r0, r13, r1)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x07c9:
            r12.append(r9)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = ")"
            r12.append(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r11)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r10.addAll(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x07d8:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r0, r4)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            boolean r0 = r10 instanceof java.util.Collection     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r0 != 0) goto L_0x07e8
            java.util.ArrayList r10 = X.C11307SKv.A00(r10)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x07e8:
            java.lang.Object[] r3 = r10.toArray(r1)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.Object r2 = r44.get()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r2.getClass()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            android.database.sqlite.SQLiteDatabase r2 = (android.database.sqlite.SQLiteDatabase) r2     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r1 = r12.toString()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r24
            r2.delete(r0, r1, r3)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            java.lang.String r0 = "clear_cache_end"
            r7.A00(r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            if (r6 == 0) goto L_0x080e
            int r1 = r7.A00     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r20
            r6.markerEnd(r8, r1, r0)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x080e:
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            X.RrI r2 = new X.RrI     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            r0 = r27
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            X.JTR.A1O(r23)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            X.JTR.A1O(r19)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
        L_0x081d:
            com.google.common.util.concurrent.SettableFuture r0 = r5.A03     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            r0.set(r2)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            return
        L_0x0823:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
            throw r0     // Catch:{ Exception -> 0x082e, all -> 0x0828 }
        L_0x0828:
            r1 = move-exception
            r3 = r19
            r19 = r23
            goto L_0x0895
        L_0x082e:
            r1 = move-exception
            r3 = r19
            r19 = r23
            goto L_0x0837
        L_0x0834:
            r1 = move-exception
            goto L_0x08aa
        L_0x0836:
            r1 = move-exception
        L_0x0837:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A05     // Catch:{ all -> 0x0892 }
            int r10 = r0.get()     // Catch:{ all -> 0x0892 }
            boolean r0 = r1 instanceof X.QLP     // Catch:{ all -> 0x0892 }
            if (r0 == 0) goto L_0x0845
            r2 = r1
            X.QLP r2 = (X.QLP) r2     // Catch:{ all -> 0x0892 }
            goto L_0x0858
        L_0x0845:
            boolean r0 = r1 instanceof java.io.IOException     // Catch:{ all -> 0x0892 }
            if (r0 == 0) goto L_0x0851
            r0 = 13
            X.QLP r2 = new X.QLP     // Catch:{ all -> 0x0892 }
            r2.<init>((int) r0, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0892 }
            goto L_0x0858
        L_0x0851:
            r0 = 15
            X.QLP r2 = new X.QLP     // Catch:{ all -> 0x0892 }
            r2.<init>((int) r0, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0892 }
        L_0x0858:
            if (r6 == 0) goto L_0x0861
            int r0 = r7.A00     // Catch:{ all -> 0x0892 }
            com.facebook.quicklog.MarkerEditor r9 = r6.withMarker(r8, r0)     // Catch:{ all -> 0x0892 }
            goto L_0x0863
        L_0x0861:
            X.10M r9 = X.10M.A00     // Catch:{ all -> 0x0892 }
        L_0x0863:
            r0 = 1339(0x53b, float:1.876E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0892 }
            java.lang.String r1 = r2.A00()     // Catch:{ all -> 0x0892 }
            r9.annotate(r0, r1)     // Catch:{ all -> 0x0892 }
            java.lang.String r1 = "error_message"
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0892 }
            r9.annotate(r1, r0)     // Catch:{ all -> 0x0892 }
            java.lang.String r1 = "will_retry"
            if (r10 < r4) goto L_0x0880
            r21 = 0
        L_0x0880:
            r0 = r21
            r9.annotate(r1, r0)     // Catch:{ all -> 0x0892 }
            r9.markerEditingCompleted()     // Catch:{ all -> 0x0892 }
            if (r6 == 0) goto L_0x0891
            int r1 = r7.A00     // Catch:{ all -> 0x0892 }
            r0 = r18
            r6.markerEnd(r8, r1, r0)     // Catch:{ all -> 0x0892 }
        L_0x0891:
            throw r2     // Catch:{ all -> 0x0892 }
        L_0x0892:
            r1 = move-exception
            if (r19 == 0) goto L_0x0898
        L_0x0895:
            X.JTR.A1O(r19)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
        L_0x0898:
            if (r3 == 0) goto L_0x08aa
            goto L_0x08a7
        L_0x089b:
            r1 = move-exception
            if (r2 == 0) goto L_0x08aa
            r2.close()     // Catch:{ all -> 0x08a2 }
            goto L_0x08aa
        L_0x08a2:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
            goto L_0x08aa
        L_0x08a7:
            X.JTR.A1O(r3)     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
        L_0x08aa:
            throw r1     // Catch:{ RJQ -> 0x08b2, all -> 0x08ab }
        L_0x08ab:
            r1 = move-exception
            com.google.common.util.concurrent.SettableFuture r0 = r5.A03
            r0.setException(r1)
            return
        L_0x08b2:
            r7 = move-exception
            java.util.concurrent.atomic.AtomicInteger r6 = r5.A05
            int r3 = r6.get()
            X.SDo r2 = r5.A00
            r0 = 0
            java.lang.String r1 = "RetryableTask"
            if (r3 >= r0) goto L_0x08e5
            java.util.concurrent.Executor r4 = r5.A04
            boolean r0 = r4 instanceof java.util.concurrent.ScheduledExecutorService
            if (r0 == 0) goto L_0x08e0
            long r1 = r2.A00
            float r0 = (float) r1
            float r0 = java.lang.Math.scalb(r0, r3)
            long r2 = (long) r0
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r1 = java.lang.Math.min(r2, r0)
            r6.incrementAndGet()
            java.util.concurrent.ScheduledExecutorService r4 = (java.util.concurrent.ScheduledExecutorService) r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.schedule(r5, r1, r0)
            return
        L_0x08e0:
            java.lang.String r0 = "Unable to schedule retry on provided executor, giving up"
            X.0KC.A0D(r1, r0)
        L_0x08e5:
            com.google.common.util.concurrent.SettableFuture r0 = r5.A03
            r0.setException(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TKV.run():void");
    }
}
