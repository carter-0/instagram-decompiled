package X;

/* renamed from: X.S1e  reason: case insensitive filesystem */
public final class C10926S1e {
    public final long A00;
    public final String A01;
    public final String A02;

    public C10926S1e(long j, String str, String str2) {
        0qQ.A0B(str, 2);
        this.A00 = j;
        this.A01 = str;
        this.A02 = str2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0089, code lost:
        r2 = X.SRY.A00();
        X.SRY.A02(new X.C7557QJh(r2, r3, ""), r2, false);
        r0 = r9.optString("url", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009b, code lost:
        if (r0 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009d, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009e, code lost:
        X.SPF.A07 = r0;
     */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void postMessage(java.lang.String r11) {
        /*
            r10 = this;
            r6 = 0
            X.0qQ.A0B(r11, r6)
            org.json.JSONObject r9 = X.C66580MXl.A17(r11)     // Catch:{ JSONException -> 0x00bf }
            java.lang.String r7 = "messageCode"
            java.lang.String r0 = "UNKNOWN_ERROR"
            java.lang.String r5 = r9.optString(r7, r0)
            X.SPF r4 = X.SPF.A06
            if (r4 == 0) goto L_0x005a
            if (r5 == 0) goto L_0x0021
            int r0 = r5.hashCode()
            java.lang.String r8 = "url"
            switch(r0) {
                case -1747592519: goto L_0x00a1;
                case -1694626987: goto L_0x007f;
                case -1546851156: goto L_0x0066;
                case -256569643: goto L_0x005b;
                default: goto L_0x0021;
            }
        L_0x0021:
            X.0eP r5 = X.AnonymousClass7TE.A1L(r7, r5)
            boolean r0 = r4.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_organic"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r1)
            X.Rtm r0 = r4.A03
            long r0 = r0.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "token_expiry_time"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = r10.A02
            java.lang.String r0 = "media_id"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r1, r5, r3, r2)
            java.util.HashMap r5 = X.0Yt.A02(r0)
            X.SRY r0 = X.SRY.A00()
            long r1 = r10.A00
            java.lang.String r4 = r10.A01
            java.lang.String r3 = "JS_MESSAGE_RECEIVED"
            r0.A04(r1, r3, r4, r5)
        L_0x005a:
            return
        L_0x005b:
            java.lang.String r0 = "AUTHENTICATE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r3 = "BWP_START_LOGIN"
            goto L_0x0089
        L_0x0066:
            java.lang.String r0 = "CLOSE_VIEW"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r3 = "BWP_RETURN_TO_FEED"
            X.SRY r2 = X.SRY.A00()
            java.lang.String r0 = ""
            X.QJh r1 = new X.QJh
            r1.<init>(r2, r3, r0)
            X.SRY.A02(r1, r2, r6)
            goto L_0x009e
        L_0x007f:
            java.lang.String r0 = "REFRESH_TOKEN"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r3 = "BWP_REFRESH_TOKEN"
        L_0x0089:
            X.SRY r2 = X.SRY.A00()
            java.lang.String r1 = ""
            X.QJh r0 = new X.QJh
            r0.<init>(r2, r3, r1)
            X.SRY.A02(r0, r2, r6)
            java.lang.String r0 = r9.optString(r8, r1)
            if (r0 != 0) goto L_0x009e
            r0 = r1
        L_0x009e:
            X.SPF.A07 = r0
            goto L_0x0021
        L_0x00a1:
            java.lang.String r0 = "OPEN_EXTERNAL_LINK"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = ""
            java.lang.String r3 = r9.optString(r8, r0)
            X.SRY r2 = X.SRY.A00()
            java.lang.String r1 = "BWP_OPEN_EXTERNAL_LINK"
            X.QJh r0 = new X.QJh
            r0.<init>(r2, r1, r3)
            X.SRY.A02(r0, r2, r6)
            goto L_0x0021
        L_0x00bf:
            java.lang.String r2 = "BwPMessageHandler"
            java.lang.Object[] r1 = new java.lang.Object[]{r11}
            java.lang.String r0 = "Ill formatted message %s"
            X.SQO.A02(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10926S1e.postMessage(java.lang.String):void");
    }
}
