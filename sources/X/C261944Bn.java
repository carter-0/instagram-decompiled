package X;

/* renamed from: X.4Bn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C261944Bn implements Runnable {
    public final /* synthetic */ 1bO A00;

    public /* synthetic */ C261944Bn(1bO r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007a A[Catch:{ IOException -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0096 A[Catch:{ IOException -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b9 A[Catch:{ IOException -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c4 A[Catch:{ IOException -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cb A[Catch:{ IOException -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d6 A[Catch:{ IOException -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0108 A[Catch:{ IOException -> 0x010c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            X.1bO r10 = r0.A00
            java.nio.charset.Charset r0 = X.1bO.A0w
            long r4 = r10.A01
            r9 = 0
            r2 = -1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x0011
            r0 = 1
        L_0x0011:
            X.17k.A0F(r0)
            android.os.Handler r3 = r10.A0J
            r0 = 5
            r3.removeMessages(r0)
            android.os.Message r2 = r3.obtainMessage(r0)
            r0 = 10000(0x2710, double:4.9407E-320)
            r3.sendMessageDelayed(r2, r0)
            long r0 = r10.A01     // Catch:{ IOException -> 0x010c }
            r10.A04 = r0     // Catch:{ IOException -> 0x010c }
            java.util.List r0 = r10.A0V     // Catch:{ IOException -> 0x010c }
            r0.clear()     // Catch:{ IOException -> 0x010c }
            com.instagram.realtimeclient.RealtimeClientManager r12 = r10.A06     // Catch:{ IOException -> 0x010c }
            java.lang.String r11 = "/ig_sub_iris"
            long r4 = r10.A04     // Catch:{ IOException -> 0x010c }
            long r6 = r10.A05     // Catch:{ IOException -> 0x010c }
            java.lang.String r8 = r10.A08     // Catch:{ IOException -> 0x010c }
            java.util.TimeZone r2 = java.util.TimeZone.getDefault()     // Catch:{ IOException -> 0x010c }
            java.util.Date r0 = new java.util.Date     // Catch:{ IOException -> 0x010c }
            r0.<init>()     // Catch:{ IOException -> 0x010c }
            long r0 = r0.getTime()     // Catch:{ IOException -> 0x010c }
            int r0 = r2.getOffset(r0)     // Catch:{ IOException -> 0x010c }
            int r0 = r0 / 1000
            long r2 = (long) r0     // Catch:{ IOException -> 0x010c }
            com.instagram.common.session.UserSession r13 = r10.A0M     // Catch:{ IOException -> 0x010c }
            boolean r0 = X.2El.A03(r13)     // Catch:{ IOException -> 0x010c }
            if (r0 != 0) goto L_0x0070
            X.0qQ.A0B(r13, r9)     // Catch:{ IOException -> 0x010c }
            X.0t1 r0 = X.0eE.A00(r13)     // Catch:{ IOException -> 0x010c }
            com.instagram.user.model.User r0 = r0.A00()     // Catch:{ IOException -> 0x010c }
            boolean r0 = X.2Ek.A02(r0)     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x0098
            X.0Tu r14 = X.0Tu.A05     // Catch:{ IOException -> 0x010c }
            r0 = 36328375282973993(0x81107700023d29, double:3.037549039354002E-306)
            boolean r0 = X.182.A06(r14, r13, r0)     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x0098
        L_0x0070:
            java.lang.Integer r16 = X.AnonymousClass05K.A00     // Catch:{ IOException -> 0x010c }
        L_0x0072:
            java.lang.String r13 = "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969"
            r14 = 0
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0096
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x010c }
        L_0x007e:
            java.lang.Long r14 = java.lang.Long.valueOf(r2)     // Catch:{ IOException -> 0x010c }
            java.io.StringWriter r7 = new java.io.StringWriter     // Catch:{ IOException -> 0x010c }
            r7.<init>()     // Catch:{ IOException -> 0x010c }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x010c }
            X.17W r6 = r0.A0A(r7)     // Catch:{ IOException -> 0x010c }
            r6.A0c()     // Catch:{ IOException -> 0x010c }
            java.lang.String r0 = "seq_id"
            r6.A0Q(r0, r4)     // Catch:{ IOException -> 0x010c }
            goto L_0x00b7
        L_0x0096:
            r1 = 0
            goto L_0x007e
        L_0x0098:
            X.0t1 r0 = X.0eE.A00(r13)     // Catch:{ IOException -> 0x010c }
            com.instagram.user.model.User r0 = r0.A00()     // Catch:{ IOException -> 0x010c }
            boolean r0 = X.2Ek.A01(r0)     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x00b4
            X.0Tu r14 = X.0Tu.A05     // Catch:{ IOException -> 0x010c }
            r0 = 36328375282973993(0x81107700023d29, double:3.037549039354002E-306)
            boolean r0 = X.182.A06(r14, r13, r0)     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x00b4
            goto L_0x0070
        L_0x00b4:
            java.lang.Integer r16 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x010c }
            goto L_0x0072
        L_0x00b7:
            if (r1 == 0) goto L_0x00c2
            long r0 = r1.longValue()     // Catch:{ IOException -> 0x010c }
            java.lang.String r4 = "snapshot_at_ms"
            r6.A0Q(r4, r0)     // Catch:{ IOException -> 0x010c }
        L_0x00c2:
            if (r8 == 0) goto L_0x00c9
            java.lang.String r0 = "snapshot_app_version"
            r6.A0R(r0, r8)     // Catch:{ IOException -> 0x010c }
        L_0x00c9:
            if (r14 == 0) goto L_0x00d0
            java.lang.String r0 = "timezone_offset"
            r6.A0Q(r0, r2)     // Catch:{ IOException -> 0x010c }
        L_0x00d0:
            int r0 = r16.intValue()     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x0108
            java.lang.String r1 = "message"
        L_0x00d8:
            java.lang.String r0 = "subscription_type"
            r6.A0R(r0, r1)     // Catch:{ IOException -> 0x010c }
            java.lang.String r0 = "bloks_versioning_id"
            r6.A0R(r0, r13)     // Catch:{ IOException -> 0x010c }
            r6.A0Z()     // Catch:{ IOException -> 0x010c }
            r6.close()     // Catch:{ IOException -> 0x010c }
            java.lang.String r1 = r7.toString()     // Catch:{ IOException -> 0x010c }
            X.46Y r0 = X.AnonymousClass46Y.ACKNOWLEDGED_DELIVERY     // Catch:{ IOException -> 0x010c }
            r12.publish(r11, r1, r0, r9)     // Catch:{ IOException -> 0x010c }
            X.432 r0 = r10.A0O     // Catch:{ IOException -> 0x010c }
            X.0wc r2 = r0.A01     // Catch:{ IOException -> 0x010c }
            java.lang.String r1 = "ig_direct_iris_subscription"
            X.0kJ r0 = r2.A00     // Catch:{ IOException -> 0x010c }
            X.0Aj r2 = r2.A00(r0, r1)     // Catch:{ IOException -> 0x010c }
            java.lang.String r1 = "attempt"
            java.lang.String r0 = "action"
            r2.AAJ(r0, r1)     // Catch:{ IOException -> 0x010c }
            r2.Cgf()     // Catch:{ IOException -> 0x010c }
            goto L_0x010b
        L_0x0108:
            java.lang.String r1 = "all_message"
            goto L_0x00d8
        L_0x010b:
            return
        L_0x010c:
            r3 = move-exception
            X.0eM r0 = r10.A0Z
            java.lang.Object r2 = r0.getValue()
            X.1Zn r2 = (X.1Zn) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            r0 = 817891655(0x30c00947, float:1.3972475E-9)
            X.1Zp r2 = r2.A00(r1, r0, r9, r9)
            java.lang.String r1 = "Error serializing IrisSubscribeRequest"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r3)
            r2.A05(r0)
            r2.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C261944Bn.run():void");
    }
}
