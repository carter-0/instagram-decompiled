package X;

/* renamed from: X.KtZ  reason: case insensitive filesystem */
public abstract class C63228KtZ {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.graphics.Bitmap r5, X.C62320sa r6, X.0sP r7, int r8) {
        /*
            X.AnonymousClass7TG.A1Q(r7, r6)
            java.lang.String r0 = "avatar_sticker_"
            java.lang.String r4 = X.002.A0O(r0, r8)     // Catch:{ IOException -> 0x004c }
            java.lang.String r3 = ".webp"
            X.1BJ r2 = X.AnonymousClass1F2.A00()     // Catch:{ IOException -> 0x004c }
            r1 = 1814181387(0x6c22360b, float:7.844048E26)
            r0 = 0
            java.io.File r0 = r2.AXT(r0, r1)     // Catch:{ IOException -> 0x004c }
            java.io.File r3 = java.io.File.createTempFile(r4, r3, r0)     // Catch:{ IOException -> 0x004c }
            java.lang.String r1 = r3.getCanonicalPath()     // Catch:{ IOException -> 0x004c }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x004c }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x004c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x004c }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0045 }
            r0 = 30
            if (r1 < r0) goto L_0x0037
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.WEBP_LOSSLESS     // Catch:{ all -> 0x0045 }
        L_0x0031:
            r0 = 100
            X.0fO.A02(r1, r5, r2, r0)     // Catch:{ all -> 0x0045 }
            goto L_0x003a
        L_0x0037:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{ all -> 0x0045 }
            goto L_0x0031
        L_0x003a:
            r2.close()     // Catch:{ IOException -> 0x004c }
            java.lang.String r0 = X.JTP.A0u(r3)     // Catch:{ IOException -> 0x004c }
            r7.invoke(r0)     // Catch:{ IOException -> 0x004c }
            return
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException -> 0x004c }
            throw r0     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            r6.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63228KtZ.A00(android.graphics.Bitmap, X.0sa, X.0sP, int):void");
    }
}
