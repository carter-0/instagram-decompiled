package X;

public abstract class Q1U {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            if (r3 == 0) goto L_0x0053
            java.lang.String r2 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r3)
            r0 = 0
            if (r2 == 0) goto L_0x0032
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0011
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x002a
            r1 = 46
            int r0 = r3.length()
            int r0 = r0 + -1
            int r0 = X.00l.A05(r3, r1, r0)
            if (r0 < 0) goto L_0x002a
            int r0 = r0 + 1
            java.lang.String r2 = r3.substring(r0)
            X.0qQ.A07(r2)
        L_0x002a:
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r0 = r0.getMimeTypeFromExtension(r2)
        L_0x0032:
            if (r5 == 0) goto L_0x0050
            if (r0 != 0) goto L_0x0050
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x004f }
            r2.<init>(r3)     // Catch:{ Exception -> 0x004f }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0048 }
            r0.<init>(r2)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = java.net.URLConnection.guessContentTypeFromStream(r0)     // Catch:{ all -> 0x0048 }
            r2.close()     // Catch:{ Exception -> 0x004f }
            goto L_0x0050
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ Exception -> 0x004f }
            throw r0     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            return r4
        L_0x0050:
            if (r0 == 0) goto L_0x0053
            return r0
        L_0x0053:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1U.A00(java.lang.String, java.lang.String, boolean):java.lang.String");
    }
}
