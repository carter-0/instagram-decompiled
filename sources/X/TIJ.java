package X;

public final class TIJ implements Runnable {
    public final /* synthetic */ C307706Rd A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ String A02;

    public TIJ(C307706Rd r1, C307786Rm r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c7, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ca, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            X.6Rd r4 = r13.A00
            X.6Rm r0 = r13.A01
            android.content.Context r3 = r0.A00
            java.lang.String r1 = r13.A02
            r0 = 0
            X.PmN r2 = new X.PmN
            r2.<init>(r1, r4, r0)
            boolean r0 = X.RTC.A00()
            if (r0 == 0) goto L_0x00cb
            android.content.Context r0 = r3.getApplicationContext()
            android.content.ContentResolver r6 = r0.getContentResolver()
            java.lang.String r0 = "external"
            android.net.Uri r7 = android.provider.MediaStore.Files.getContentUri(r0)
            java.lang.String r5 = "bucket_id"
            java.lang.String r4 = "bucket_display_name"
            java.lang.String[] r10 = new java.lang.String[]{r5, r4}
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            java.lang.String r8 = X.RTD.A00(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Querying albums:\n        |uri = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ",\n        |projection = "
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r10)
            X.0qQ.A07(r0)
            r1.append(r0)
            java.lang.String r0 = "\n      "
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)
            r9 = 0
            java.lang.String r0 = "|"
            X.0rw.A0u(r1, r0)
            r12 = 732311764(0x2ba630d4, float:1.1808562E-12)
            r11 = r9
            android.database.Cursor r3 = X.0fM.A01(r6, r7, r8, r9, r10, r11, r12)
            if (r3 == 0) goto L_0x00cb
            int r0 = r3.getCount()     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00c0
            int r8 = r3.getColumnIndex(r5)     // Catch:{ all -> 0x00c4 }
            int r7 = r3.getColumnIndex(r4)     // Catch:{ all -> 0x00c4 }
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()     // Catch:{ all -> 0x00c4 }
        L_0x0074:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00ad
            int r9 = r3.getInt(r8)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r3.getString(r7)     // Catch:{ all -> 0x00c4 }
            if (r5 == 0) goto L_0x0074
            boolean r0 = X.C51966G9m.A1X(r5)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x0074
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c4 }
            boolean r0 = r6.containsKey(r4)     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x0074
            java.lang.String r1 = "id"
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00c4 }
            X.0eP r1 = X.AnonymousClass7TE.A1L(r1, r0)     // Catch:{ all -> 0x00c4 }
            java.lang.String r0 = "name"
            X.0eP[] r0 = X.JTQ.A1b(r0, r5, r1)     // Catch:{ all -> 0x00c4 }
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)     // Catch:{ all -> 0x00c4 }
            r6.put(r4, r0)     // Catch:{ all -> 0x00c4 }
            goto L_0x0074
        L_0x00ad:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x00c4 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00c0
            java.util.Collection r0 = r6.values()     // Catch:{ all -> 0x00c4 }
            java.util.List r0 = X.00k.A0a(r0)     // Catch:{ all -> 0x00c4 }
            r2.invoke(r0)     // Catch:{ all -> 0x00c4 }
        L_0x00c0:
            r3.close()
            return
        L_0x00c4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TIJ.run():void");
    }
}
