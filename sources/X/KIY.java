package X;

public final class KIY extends 0ng {
    public final /* synthetic */ C64097LMr A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIY(C64097LMr lMr) {
        super(441, 3, false, false);
        this.A00 = lMr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.1zE.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            java.lang.String r5 = "video_pdq_report_hash_calculation_error"
            r0 = r20
            X.LMr r7 = r0.A00
            X.0wc r14 = r7.A00
            X.3Q2 r6 = r7.A03
            java.lang.String r1 = r6.A3t
            com.instagram.common.session.UserSession r0 = r7.A01
            java.lang.String r4 = r0.A06
            java.lang.Integer r15 = X.AnonymousClass05K.A0u
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            r8 = 0
            r18 = r4
            r19 = r8
            r17 = r1
            X.C63376Kvx.A00(r14, r15, r16, r17, r18, r19)
            java.lang.String r3 = "null_image_file"
            java.lang.String r2 = "video_pdq_report_null_image_file_error"
            java.lang.String r10 = r6.A3K
            if (r10 != 0) goto L_0x005c
            java.lang.String r0 = r6.A3L
            if (r0 == 0) goto L_0x005c
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFile(r0)
            if (r11 == 0) goto L_0x005c
            java.io.File r12 = X.AnonymousClass457.A06()
            java.lang.String r13 = "original_frame_capture_"
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = ".jpeg"
            java.lang.String r0 = X.002.A0e(r13, r9, r0)
            java.io.File r13 = X.JTO.A0s(r12, r0)
            java.io.FileOutputStream r9 = X.JTO.A0t(r13)     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0055 }
            X.JZK.A00(r0, r11, r9)     // Catch:{ all -> 0x0055 }
            java.lang.String r10 = r13.getCanonicalPath()     // Catch:{ all -> 0x0055 }
            r9.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x005d
        L_0x0055:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            X.1zE.A00(r9, r1)     // Catch:{ IOException -> 0x005d }
            throw r0     // Catch:{ IOException -> 0x005d }
        L_0x005c:
            r13 = r8
        L_0x005d:
            if (r10 == 0) goto L_0x0090
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            X.Kvf r0 = com.instagram.pdqhashing.PDQHashingBridge.Companion     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            java.lang.String r0 = "pdqhashing"
            com.instagram.pdqhashing.PDQHashingBridge r12 = new com.instagram.pdqhashing.PDQHashingBridge     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            r12.<init>(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            r0 = 0
            X.L6v r11 = new X.L6v     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            r11.<init>(r0, r10)     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            java.lang.String r1 = r11.A02     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            r0 = 0
            java.lang.String r0 = r12.getHashWithQuality(r1, r0, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            r11.A00 = r0     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            r9.add(r11)     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            java.lang.String r0 = r6.A3t     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            java.lang.Integer r15 = X.AnonymousClass05K.A1F     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            r17 = r0
            X.C63376Kvx.A00(r14, r15, r16, r17, r18, r19)     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            X.C64097LMr.A00(r7, r9, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x009c }
            goto L_0x00ab
        L_0x0090:
            java.lang.String r0 = r6.A3t
            java.lang.Integer r15 = X.AnonymousClass05K.A0N
            r19 = r3
            r17 = r0
            X.C63376Kvx.A00(r14, r15, r16, r17, r18, r19)
            goto L_0x00ab
        L_0x009c:
            r1 = move-exception
            java.lang.String r0 = r6.A3t
            java.lang.Integer r15 = X.AnonymousClass05K.A0C
            java.lang.String r19 = "hash_calc_error"
            r17 = r0
            X.C63376Kvx.A00(r14, r15, r16, r17, r18, r19)
            X.0wb.A07(r5, r1)
        L_0x00ab:
            X.0wb.A03(r2, r3)
            if (r13 == 0) goto L_0x00b3
            r13.delete()
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KIY.run():void");
    }
}
