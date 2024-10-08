package X;

/* renamed from: X.RUc  reason: case insensitive filesystem */
public abstract /* synthetic */ class C9225RUc {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r1.endsWith(".facebook.com") != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.webkit.WebResourceRequest r6, X.C13887TjA r7) {
        /*
            r2 = 1
            X.0qQ.A0B(r6, r2)
            java.lang.String r5 = r6.getMethod()
            android.net.Uri r0 = r6.getUrl()
            java.lang.String r1 = r0.getHost()
            java.lang.String r4 = r0.getPath()
            r3 = 0
            if (r1 == 0) goto L_0x0049
            if (r4 == 0) goto L_0x0049
            java.lang.String r0 = "GET"
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "facebook.com"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0038
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r1)
            java.lang.String r0 = ".facebook.com"
            X.0qQ.A0B(r0, r2)
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x0049
        L_0x0038:
            java.lang.String r0 = "/tr"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = "/tr/"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0049
        L_0x0048:
            r3 = 1
        L_0x0049:
            r4 = 0
            if (r3 == 0) goto L_0x0075
            android.net.Uri r0 = r6.getUrl()
            java.lang.String r3 = X.DbT.A10(r0)
            java.lang.String r0 = "?fbc="
            boolean r0 = X.00l.A0d(r3, r0, r4)
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "&fbc="
            boolean r0 = X.00l.A0d(r3, r0, r4)
            if (r0 != 0) goto L_0x0072
            org.apache.http.client.methods.HttpGet r0 = new org.apache.http.client.methods.HttpGet     // Catch:{ all -> 0x006a }
            r0.<init>(r3)     // Catch:{ all -> 0x006a }
            return r2
        L_0x006a:
            r2 = move-exception
            java.lang.String r1 = "IPixelRequestBuffer"
            java.lang.String r0 = "Url invalid to buffer"
            X.0KC.A0F(r1, r0, r2)
        L_0x0072:
            r7.maybeCallTrListeners(r3)
        L_0x0075:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9225RUc.A00(android.webkit.WebResourceRequest, X.TjA):boolean");
    }
}
