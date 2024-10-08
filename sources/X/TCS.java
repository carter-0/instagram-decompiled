package X;

public final class TCS implements Runnable {
    public final /* synthetic */ C12231Spl A00;

    public TCS(C12231Spl spl) {
        this.A00 = spl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c7, code lost:
        if (r6 == 200) goto L_0x00c9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r0 = r22
            X.Spl r1 = r0.A00
            X.TO6 r0 = X.C12231Spl.A0E
            X.RuA r11 = r1.A02
            X.SHT r10 = r11.A01
            java.lang.String r1 = "upload_event_attempted"
            r3 = 1
            X.S6G r0 = new X.S6G
            r0.<init>(r1, r3)
            r10.A00(r0)
            java.lang.String r9 = "AnalyticsUploader"
            java.io.File r5 = r11.A02
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x004c
            java.io.File[] r8 = r5.listFiles()
            java.lang.String r20 = "upload_event_succeeded"
            r1 = 0
            java.lang.String r7 = "uploaded_log_event_file_size_in_bytes"
            if (r8 != 0) goto L_0x0059
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "directory_not_found"
        L_0x0037:
            X.0KC.A0C(r9, r0)
        L_0x003a:
            X.S6G r0 = new X.S6G
            r0.<init>(r7, r1)
            r10.A00(r0)
            X.S6G r5 = new X.S6G
            r0 = r20
            r5.<init>(r0, r3)
        L_0x0049:
            r10.A00(r5)
        L_0x004c:
            return
        L_0x004d:
            boolean r0 = r5.isFile()
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "directory_is_file"
            goto L_0x0037
        L_0x0056:
            java.lang.String r0 = "directory_unknown_error"
            goto L_0x0037
        L_0x0059:
            int r0 = r8.length
            r21 = r0
            r19 = 0
            r12 = 0
        L_0x005f:
            r0 = r21
            if (r12 >= r0) goto L_0x003a
            r18 = r8[r12]
            java.lang.Long r17 = X.C51971G9r.A0m()
            r16 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r19)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x00b8 }
            r0 = r18
            r5.<init>(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "UTF-8"
            java.io.InputStreamReader r14 = new java.io.InputStreamReader     // Catch:{ all -> 0x00b8 }
            r14.<init>(r5, r0)     // Catch:{ all -> 0x00b8 }
            java.lang.StringBuilder r15 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x00b3 }
            r0 = 1024(0x400, float:1.435E-42)
            char[] r13 = new char[r0]     // Catch:{ all -> 0x00b3 }
        L_0x0085:
            int r5 = r14.read(r13)     // Catch:{ all -> 0x00b3 }
            r0 = -1
            if (r5 == r0) goto L_0x0092
            r0 = r19
            r15.append(r13, r0, r5)     // Catch:{ all -> 0x00b3 }
            goto L_0x0085
        L_0x0092:
            java.lang.String r13 = r15.toString()     // Catch:{ all -> 0x00b3 }
            r14.close()     // Catch:{ IOException -> 0x0099 }
        L_0x0099:
            r14 = 200(0xc8, float:2.8E-43)
            X.S1o r0 = r11.A00     // Catch:{ Exception -> 0x00cb }
            int r6 = r0.A00(r13)     // Catch:{ Exception -> 0x00cb }
            if (r6 != r14) goto L_0x00c7
            boolean r0 = r18.delete()     // Catch:{ Exception -> 0x00c7 }
            if (r0 != 0) goto L_0x00c9
            java.lang.String r5 = "File %s was not deleted"
            java.lang.Object[] r0 = new java.lang.Object[]{r18}     // Catch:{ Exception -> 0x00c7 }
            X.0KC.A0P(r9, r5, r0)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00c9
        L_0x00b3:
            r0 = move-exception
            r14.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00b9
        L_0x00b8:
            r0 = move-exception
        L_0x00b9:
            throw r0     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            r5 = move-exception
            java.lang.String r0 = "Unable to read file"
            X.0KC.A0G(r9, r0, r5)
            r0 = r17
            android.util.Pair r5 = android.util.Pair.create(r6, r0)
            goto L_0x00db
        L_0x00c7:
            if (r6 != r14) goto L_0x00cb
        L_0x00c9:
            r16 = 1
        L_0x00cb:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r16)
            int r0 = r13.length()
            java.lang.Long r0 = X.DbS.A0j(r0)
            android.util.Pair r5 = android.util.Pair.create(r5, r0)
        L_0x00db:
            java.lang.Object r0 = r5.first
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x00ea
            X.S6G r5 = new X.S6G
            r5.<init>(r7, r1)
            goto L_0x0049
        L_0x00ea:
            java.lang.Object r0 = r5.second
            long r5 = X.AnonymousClass7TE.A0R(r0)
            long r1 = r1 + r5
            int r12 = r12 + 1
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TCS.run():void");
    }
}
