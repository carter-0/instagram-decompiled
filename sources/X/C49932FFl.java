package X;

/* renamed from: X.FFl  reason: case insensitive filesystem */
public final class C49932FFl {
    public static final C49932FFl A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        if (r1 != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r4, android.net.Uri r5, com.instagram.common.session.UserSession r6, X.1Xj r7) {
        /*
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "www.facebook.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            if (r7 == 0) goto L_0x005c
            X.1Xy r0 = r7.A0C
            X.DTf r0 = r0.At2()
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = r0.B4A()
        L_0x001f:
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri r3 = r0.build()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36609601151637371(0x82103d0003177b, double:3.2153974111024016E-306)
            int r1 = X.DbS.A04(r2, r6, r0)
            java.lang.String r0 = "com.facebook.wakizashi"
            boolean r2 = X.0JW.A03(r4, r0, r1)
            java.lang.String r0 = "com.facebook.katana"
            boolean r1 = X.0JW.A03(r4, r0, r1)
            if (r2 != 0) goto L_0x0043
            r0 = 0
            if (r1 == 0) goto L_0x0044
        L_0x0043:
            r0 = 1
        L_0x0044:
            java.lang.String r1 = "android.intent.action.VIEW"
            if (r0 == 0) goto L_0x0053
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r5)
            boolean r0 = X.0kR.A0A(r4, r0)
            if (r0 != 0) goto L_0x005b
        L_0x0053:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r3)
            X.0kR.A0D(r4, r0)
        L_0x005b:
            return
        L_0x005c:
            r0 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49932FFl.A00(android.content.Context, android.net.Uri, com.instagram.common.session.UserSession, X.1Xj):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0074, code lost:
        if (r1 != false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r8, com.instagram.common.session.UserSession r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12) {
        /*
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "fb"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "fb_shorts"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "viewer"
            android.net.Uri$Builder r1 = r1.path(r0)
            java.lang.String r0 = "video_id"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r0, r12)
            int r0 = r10.intValue()
            if (r0 == 0) goto L_0x00be
            java.lang.String r3 = "comment_id"
        L_0x0025:
            if (r0 == 0) goto L_0x00ba
            java.lang.String r2 = "0"
        L_0x0029:
            android.net.Uri$Builder r4 = r1.appendQueryParameter(r3, r2)
            java.lang.String r1 = "source"
            java.lang.String r0 = "ig"
            android.net.Uri r7 = X.DbV.A08(r4, r1, r0)
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r6 = "https"
            android.net.Uri$Builder r0 = r0.scheme(r6)
            java.lang.String r5 = "www.facebook.com"
            android.net.Uri$Builder r1 = r0.authority(r5)
            java.lang.String r0 = "reel"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendPath(r12)
            android.net.Uri r3 = X.DbV.A08(r0, r3, r2)
            X.0qQ.A0A(r7)
            X.0qQ.A0A(r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36602329772069494(0x8209a000041276, double:3.210798961384181E-306)
            int r1 = X.DbS.A04(r2, r9, r0)
            java.lang.String r0 = "com.facebook.wakizashi"
            boolean r2 = X.0JW.A03(r8, r0, r1)
            java.lang.String r0 = "com.facebook.katana"
            boolean r1 = X.0JW.A03(r8, r0, r1)
            if (r2 != 0) goto L_0x0076
            r0 = 0
            if (r1 == 0) goto L_0x0077
        L_0x0076:
            r0 = 1
        L_0x0077:
            java.lang.String r4 = "android.intent.action.VIEW"
            if (r0 == 0) goto L_0x00b1
            if (r11 == 0) goto L_0x00b1
            int r0 = r11.length()
            if (r0 == 0) goto L_0x00b1
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r0 = r0.scheme(r6)
            android.net.Uri$Builder r1 = r0.authority(r5)
            java.lang.String r0 = "inter_app/redirect"
            android.net.Uri$Builder r1 = r1.path(r0)
            java.lang.String r0 = "account_id"
            android.net.Uri$Builder r2 = r1.appendQueryParameter(r0, r11)
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "destination_url"
            android.net.Uri r1 = X.DbV.A08(r2, r0, r1)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4, r1)
            boolean r0 = X.0kR.A0A(r8, r0)
            if (r0 != 0) goto L_0x00b9
        L_0x00b1:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4, r3)
            X.0kR.A0D(r8, r0)
        L_0x00b9:
            return
        L_0x00ba:
            java.lang.String r2 = "true"
            goto L_0x0029
        L_0x00be:
            java.lang.String r3 = "open_like_count"
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49932FFl.A01(android.content.Context, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.String, java.lang.String):void");
    }
}
