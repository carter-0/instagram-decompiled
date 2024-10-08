package X;

public abstract class RU8 {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.0TC, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r0 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r3.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.lang.String r3) {
        /*
            if (r3 == 0) goto L_0x0009
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x0044
            if (r3 == 0) goto L_0x0044
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0044
            android.net.Uri r1 = X.C11429STt.A01(r3)
            if (r1 == 0) goto L_0x0044
            X.0TC r0 = new X.0TC
            r0.<init>()
            android.net.Uri r0 = X.C11429STt.A00(r1, r0)
            java.lang.String r1 = X.DbT.A10(r0)
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r1)
            if (r0 == 0) goto L_0x0044
            android.net.Uri r0 = X.C11429STt.A01(r1)
            if (r0 != 0) goto L_0x003d
            r0 = r2
        L_0x0036:
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0044
            return r1
        L_0x003d:
            java.lang.String r0 = r0.getAuthority()
            if (r0 == 0) goto L_0x0044
            goto L_0x0036
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RU8.A00(java.lang.String):java.lang.String");
    }
}
