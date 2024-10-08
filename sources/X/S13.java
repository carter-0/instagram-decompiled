package X;

public final class S13 {
    public final long A00;
    public final String A01;

    public S13(long j, String str) {
        0qQ.A0B(str, 2);
        this.A00 = j;
        this.A01 = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        X.SRY.A00().A03(r11.A00, "JS_MESSAGE_RECEIVED", r11.A01, X.Dba.A0f("messageCode", r5));
        r0 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dc, code lost:
        X.SRY.A02(new X.QJd(r2, r1), r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (r9 != null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        r9 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e7, code lost:
        X.SHI.A05 = r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String postMessage(java.lang.String r12) {
        /*
            r11 = this;
            r7 = 0
            java.util.HashMap r4 = X.Pxf.A0r(r12, r7)
            org.json.JSONObject r2 = X.C66580MXl.A17(r12)     // Catch:{ JSONException -> 0x000a }
            goto L_0x0016
        L_0x000a:
            java.lang.String r2 = "BwIMessageHandler"
            java.lang.Object[] r1 = new java.lang.Object[]{r12}
            java.lang.String r0 = "Ill formatted message %s"
            X.SQO.A02(r2, r0, r1)
            r2 = 0
        L_0x0016:
            java.lang.String r3 = "status"
            if (r2 == 0) goto L_0x0028
            X.SHI r8 = X.SHI.A04
            if (r8 != 0) goto L_0x0045
            java.lang.String r2 = "BwIMessageHandler"
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "BwIContext is null"
            X.SQO.A02(r2, r0, r1)
        L_0x0028:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x002a:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x003f;
                case 1: goto L_0x0042;
                default: goto L_0x0031;
            }
        L_0x0031:
            java.lang.String r0 = "success"
        L_0x0034:
            r4.put(r3, r0)
            java.lang.String r0 = X.JTQ.A0c(r4)
            X.0qQ.A07(r0)
            return r0
        L_0x003f:
            java.lang.String r0 = "invalidCode"
            goto L_0x0034
        L_0x0042:
            java.lang.String r0 = "invalidURL"
            goto L_0x0034
        L_0x0045:
            java.lang.String r6 = "messageCode"
            java.lang.String r0 = "UNKNOWN_ERROR"
            java.lang.String r5 = r2.optString(r6, r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r12, r5}
            java.lang.String r0 = "Received message %s, with code %s"
            X.SQO.A03(r0, r1)
            X.0qQ.A0A(r5)
            X.0qQ.A0B(r5, r7)
            X.ThJ r0 = r8.A00
            java.util.Set r0 = r0.AbD()
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x0073
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            java.lang.String r0 = "Received invalid message code %s"
            X.SQO.A03(r0, r1)
            goto L_0x0028
        L_0x0073:
            java.lang.String r0 = "url"
            java.lang.String r8 = ""
            java.lang.String r9 = r2.optString(r0, r8)
            java.lang.String r1 = "CLOSE_VIEW"
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L_0x008d
            boolean r0 = android.webkit.URLUtil.isValidUrl(r9)
            if (r0 != 0) goto L_0x008d
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x002a
        L_0x008d:
            int r0 = r5.hashCode()
            switch(r0) {
                case -1747592519: goto L_0x00ea;
                case -1694626987: goto L_0x00ce;
                case -1546851156: goto L_0x00c1;
                case -256569643: goto L_0x00b2;
                default: goto L_0x0094;
            }
        L_0x0094:
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            java.lang.String r0 = "Cannot handle received code %s"
            X.SQO.A03(r0, r1)
        L_0x009d:
            java.util.HashMap r10 = X.Dba.A0f(r6, r5)
            X.SRY r5 = X.SRY.A00()
            long r6 = r11.A00
            java.lang.String r9 = r11.A01
            java.lang.String r8 = "JS_MESSAGE_RECEIVED"
            r5.A03(r6, r8, r9, r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x002a
        L_0x00b2:
            java.lang.String r0 = "AUTHENTICATE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0094
            X.SRY r2 = X.SRY.A00()
            java.lang.String r1 = "BWI_START_LOGIN"
            goto L_0x00dc
        L_0x00c1:
            boolean r0 = r5.equals(r1)
            if (r0 == 0) goto L_0x0094
            X.SRY r2 = X.SRY.A00()
            java.lang.String r1 = "BWI_RETURN_TO_FEED"
            goto L_0x00dc
        L_0x00ce:
            java.lang.String r0 = "REFRESH_TOKEN"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0094
            X.SRY r2 = X.SRY.A00()
            java.lang.String r1 = "BWI_REFRESH_TOKEN"
        L_0x00dc:
            X.QJd r0 = new X.QJd
            r0.<init>(r2, r1)
            X.SRY.A02(r0, r2, r7)
            if (r9 != 0) goto L_0x00e7
            r9 = r8
        L_0x00e7:
            X.SHI.A05 = r9
            goto L_0x009d
        L_0x00ea:
            java.lang.String r0 = "OPEN_EXTERNAL_LINK"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0094
            if (r9 != 0) goto L_0x00f5
            r9 = r8
        L_0x00f5:
            X.SHI.A05 = r9
            X.SRY r2 = X.SRY.A00()
            java.lang.String r1 = "BWI_OPEN_EXTERNAL_LINK"
            X.QJd r0 = new X.QJd
            r0.<init>(r2, r1)
            X.SRY.A02(r0, r2, r7)
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S13.postMessage(java.lang.String):java.lang.String");
    }
}
