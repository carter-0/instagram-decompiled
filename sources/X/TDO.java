package X;

public final class TDO implements Runnable {
    public final /* synthetic */ C8490Qvc A00;

    public TDO(C8490Qvc qvc) {
        this.A00 = qvc;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if (r0 == false) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            X.Qvc r5 = r7.A00
            r5.A0J()
            X.C11200SFa.A00()
            X.SQt r6 = r5.A00
            android.content.Context r4 = r6.A00
            boolean r0 = X.C11322SMw.A00(r4)
            if (r0 != 0) goto L_0x00c8
            java.lang.String r1 = "AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions."
            r0 = 5
        L_0x0015:
            X.ST5.A0B(r5, r1, r0)
        L_0x0018:
            X.AnonymousClass3Qk.A02(r4)
            java.lang.Boolean r0 = com.google.android.gms.analytics.CampaignTrackingReceiver.A00
            if (r0 == 0) goto L_0x00a4
            boolean r1 = r0.booleanValue()
        L_0x0023:
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = "CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions."
            r0 = 5
            X.ST5.A0B(r5, r1, r0)
        L_0x002b:
            X.QvY r0 = r6.A0D
            X.C11381SQt.A02(r0)
            r0.A0K()
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            X.3Qe r0 = X.C241663Qd.A00(r4)
            android.content.Context r0 = r0.A00
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 == 0) goto L_0x0058
            java.lang.String r1 = "Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions"
            r0 = 6
            X.ST5.A0B(r5, r1, r0)
            r5.A0J()
            X.C11200SFa.A00()
            r0 = 1
            r5.A02 = r0
            X.QvZ r0 = r5.A03
            r0.A0K()
            r5.A0L()
        L_0x0058:
            java.lang.String r1 = "android.permission.INTERNET"
            X.3Qe r0 = X.C241663Qd.A00(r4)
            android.content.Context r0 = r0.A00
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 == 0) goto L_0x007d
            java.lang.String r1 = "Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions"
            r0 = 6
            X.ST5.A0B(r5, r1, r0)
            r5.A0J()
            X.C11200SFa.A00()
            r0 = 1
            r5.A02 = r0
            X.QvZ r0 = r5.A03
            r0.A0K()
            r5.A0L()
        L_0x007d:
            boolean r0 = X.SH4.A00(r4)
            if (r0 == 0) goto L_0x00a0
            java.lang.String r1 = "AnalyticsService registered in the app manifest and enabled"
            r0 = 2
        L_0x0086:
            X.ST5.A0B(r5, r1, r0)
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x009c
            X.Qvd r0 = r5.A04
            long r3 = X.C8491Qvd.A00(r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x009c
            X.C8490Qvc.A03(r5)
        L_0x009c:
            r5.A0L()
            return
        L_0x00a0:
            java.lang.String r1 = "AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions."
            r0 = 5
            goto L_0x0086
        L_0x00a4:
            java.lang.String r3 = "com.google.android.gms.analytics.CampaignTrackingReceiver"
            r2 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00bf }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x00bf }
            r0.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x00bf }
            android.content.pm.ActivityInfo r1 = r1.getReceiverInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x00bf }
            if (r1 == 0) goto L_0x00bf
            boolean r0 = r1.enabled     // Catch:{ NameNotFoundException -> 0x00bf }
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r1.exported     // Catch:{ NameNotFoundException -> 0x00bf }
            r1 = 1
            if (r0 != 0) goto L_0x00c0
        L_0x00bf:
            r1 = 0
        L_0x00c0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.analytics.CampaignTrackingReceiver.A00 = r0
            goto L_0x0023
        L_0x00c8:
            boolean r0 = X.SH4.A00(r4)
            if (r0 != 0) goto L_0x0018
            java.lang.String r1 = "AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions."
            r0 = 6
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TDO.run():void");
    }
}
