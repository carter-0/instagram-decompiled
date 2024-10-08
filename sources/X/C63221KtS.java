package X;

/* renamed from: X.KtS  reason: case insensitive filesystem */
public abstract class C63221KtS {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.1zE.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(android.graphics.Bitmap r7, com.instagram.common.session.UserSession r8, java.io.File r9, int r10) {
        /*
            X.AnonymousClass457.A0E()
            if (r9 == 0) goto L_0x001a
            r0 = 1234(0x4d2, float:1.729E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = ".jpeg"
            java.lang.String r0 = X.002.A0e(r3, r0, r1)
            java.io.File r6 = X.JTO.A0s(r9, r0)
            goto L_0x0021
        L_0x001a:
            java.io.File r6 = X.AnonymousClass457.A01()
            X.0qQ.A0A(r6)
        L_0x0021:
            java.io.FileOutputStream r5 = X.JTO.A0t(r6)     // Catch:{ IOException -> 0x006c }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x0065 }
            r0 = 36609382108895079(0x82100a000c1767, double:3.215258887590162E-306)
            int r4 = X.DbS.A04(r2, r8, r0)     // Catch:{ all -> 0x0065 }
            if (r4 != 0) goto L_0x0036
            int r4 = X.LTE.A00(r10)     // Catch:{ all -> 0x0065 }
        L_0x0036:
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0065 }
            X.0fO.A01(r3, r7, r4)     // Catch:{ all -> 0x0065 }
            boolean r0 = r7.compress(r3, r4, r5)     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x005d
            X.0wj r2 = X.0wj.A01     // Catch:{ all -> 0x0065 }
            r1 = 817901174(0x30c02e76, float:1.3983044E-9)
            java.lang.String r0 = "bitmap_compress_failed"
            X.0f9 r2 = r2.AEf(r0, r1)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "format"
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0065 }
            r2.ABQ(r1, r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "imageQuality"
            r2.ABO(r0, r4)     // Catch:{ all -> 0x0065 }
            r2.report()     // Catch:{ all -> 0x0065 }
        L_0x005d:
            java.lang.String r0 = X.JTP.A0u(r6)     // Catch:{ all -> 0x0065 }
            r5.close()     // Catch:{ IOException -> 0x006c }
            return r0
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.1zE.A00(r5, r1)     // Catch:{ IOException -> 0x006c }
            throw r0     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            r2 = move-exception
            java.lang.String r1 = "VideoCoverFileUtil"
            java.lang.String r0 = "io error"
            X.0KC.A0G(r1, r0, r2)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63221KtS.A00(android.graphics.Bitmap, com.instagram.common.session.UserSession, java.io.File, int):java.lang.String");
    }
}
