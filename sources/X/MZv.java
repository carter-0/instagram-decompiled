package X;

public final class MZv {
    public static final MZv A00 = new Object();

    public final void A01(String str, String str2) {
        0qQ.A0B(str, 0);
        0wj.A01.EFR(216072193, 002.A11("IgPushSdkPushDispatcher", ": Push  notifications lost. source=", str, Pxd.A00(49), str2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a A[Catch:{ IOException -> 0x00aa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.BBV r9, X.C61081JwJ r10) {
        /*
            r8 = this;
            java.lang.String r2 = r9.A00
            java.lang.String r3 = "FBNS"
            boolean r0 = X.0qQ.A0K(r2, r3)
            if (r0 == 0) goto L_0x0011
            com.instagram.common.notifications.push.intf.PushChannelType r5 = com.instagram.common.notifications.push.intf.PushChannelType.FBNS
        L_0x000c:
            java.lang.String r1 = r10.A01
            if (r1 == 0) goto L_0x00bf
            goto L_0x001c
        L_0x0011:
            java.lang.String r0 = "FCM"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x00cb
            com.instagram.common.notifications.push.intf.PushChannelType r5 = com.instagram.common.notifications.push.intf.PushChannelType.FCM
            goto L_0x000c
        L_0x001c:
            java.lang.String r0 = X.AnonymousClass3FH.A00(r5)     // Catch:{ IOException -> 0x00aa }
            X.5HJ r4 = X.AnonymousClass5HJ.A01(r1, r0)     // Catch:{ IOException -> 0x00aa }
            if (r4 == 0) goto L_0x002a
            java.lang.String r0 = r4.A0j     // Catch:{ IOException -> 0x00aa }
            if (r0 != 0) goto L_0x002c
        L_0x002a:
            java.lang.String r0 = ""
        L_0x002c:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass5HM.A00(r0)     // Catch:{ IOException -> 0x00aa }
            if (r6 == 0) goto L_0x0099
            X.0Tu r2 = X.0Tu.A05     // Catch:{ IOException -> 0x00aa }
            r0 = 36321335831962908(0x810a100008251c, double:3.0330972621889975E-306)
            boolean r0 = X.182.A06(r2, r6, r0)     // Catch:{ IOException -> 0x00aa }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r1 = r9.A00     // Catch:{ IOException -> 0x00aa }
            boolean r0 = X.0qQ.A0K(r1, r3)     // Catch:{ IOException -> 0x00aa }
            if (r0 == 0) goto L_0x005e
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ IOException -> 0x00aa }
        L_0x0049:
            r3 = 0
            X.MYi r7 = X.C66596MYi.A01     // Catch:{ IOException -> 0x00aa }
            long r1 = r7.ExJ(r0)     // Catch:{ IOException -> 0x00aa }
            java.lang.String r0 = "IgPushSdkPushDispatcher"
            r7.Eac(r0, r1)     // Catch:{ IOException -> 0x00aa }
            android.content.Context r0 = X.C60960kU.A00     // Catch:{ IOException -> 0x00aa }
            boolean r0 = X.0oI.A09(r0)     // Catch:{ IOException -> 0x00aa }
            if (r0 != 0) goto L_0x006c
            goto L_0x0069
        L_0x005e:
            java.lang.String r0 = "FCM"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ IOException -> 0x00aa }
            if (r0 == 0) goto L_0x00e5
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x00aa }
            goto L_0x0049
        L_0x0069:
            if (r4 == 0) goto L_0x0074
            goto L_0x006f
        L_0x006c:
            if (r4 == 0) goto L_0x0074
            goto L_0x0072
        L_0x006f:
            X.MZZ.A00(r4, r1)     // Catch:{ IOException -> 0x00aa }
        L_0x0072:
            java.lang.String r3 = r4.A0N     // Catch:{ IOException -> 0x00aa }
        L_0x0074:
            boolean r0 = X.AnonymousClass5HM.A01(r6)     // Catch:{ IOException -> 0x00aa }
            if (r0 == 0) goto L_0x0091
            X.0eM r0 = X.MZr.A00     // Catch:{ IOException -> 0x00aa }
            X.0Tu r2 = X.0Tu.A06     // Catch:{ IOException -> 0x00aa }
            r0 = 36320360874123618(0x81092d00042162, double:3.0324806949255904E-306)
            boolean r0 = X.182.A06(r2, r6, r0)     // Catch:{ IOException -> 0x00aa }
            if (r0 != 0) goto L_0x0091
            X.OMX r0 = X.O1Q.A00(r6)     // Catch:{ IOException -> 0x00aa }
            r0.A00(r4, r5, r3)     // Catch:{ IOException -> 0x00aa }
            return
        L_0x0091:
            X.1XZ r0 = X.AnonymousClass3F2.A00()     // Catch:{ IOException -> 0x00aa }
            r0.A08(r4, r5, r3)     // Catch:{ IOException -> 0x00aa }
            return
        L_0x0099:
            java.lang.String r1 = "IgPushSdkPushDispatcher"
            java.lang.String r0 = ": Dropping notification because no user session found"
            java.lang.String r2 = X.002.A0R(r1, r0)     // Catch:{ IOException -> 0x00aa }
            X.0wj r1 = X.0wj.A01     // Catch:{ IOException -> 0x00aa }
            r0 = 216072193(0xce10001, float:3.4666741E-31)
            r1.EFR(r0, r2)     // Catch:{ IOException -> 0x00aa }
            goto L_0x00bf
        L_0x00aa:
            r0 = move-exception
            java.lang.String r2 = "IgPushSdkPushDispatcher"
            java.lang.String r1 = ": Failed to parse IgNotification. "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = X.002.A0g(r2, r1, r0)
            X.0wj r1 = X.0wj.A01
            r0 = 216072193(0xce10001, float:3.4666741E-31)
            r1.EFR(r0, r2)
        L_0x00bf:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "IgPushSdkPushDispatcher"
            r1.append(r0)
            java.lang.String r2 = ": Null notif content data"
            goto L_0x00d9
        L_0x00cb:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "IgPushSdkPushDispatcher"
            r1.append(r0)
            java.lang.String r0 = ": Invalid  notif source. "
            r1.append(r0)
        L_0x00d9:
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r2, r1)
            X.0wj r1 = X.0wj.A01
            r0 = 216072193(0xce10001, float:3.4666741E-31)
            r1.EFR(r0, r2)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MZv.A00(X.BBV, X.JwJ):void");
    }
}
