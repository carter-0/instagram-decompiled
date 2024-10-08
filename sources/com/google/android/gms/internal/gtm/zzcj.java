package com.google.android.gms.internal.gtm;

import X.C11381SQt;
import android.content.BroadcastReceiver;

public final class zzcj extends BroadcastReceiver {
    public boolean A00;
    public boolean A01;
    public final C11381SQt A02;

    public zzcj(C11381SQt sQt) {
        this.A02 = sQt;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            r0 = 1213994756(0x485c1704, float:225372.06)
            int r3 = X.C66580MXl.A03(r6, r7, r8, r0)
            X.SQt r4 = r6.A02
            X.QvX r2 = r4.A0C
            X.C11381SQt.A02(r2)
            X.QvT r5 = r4.A06
            X.C11381SQt.A02(r5)
            java.lang.String r1 = r8.getAction()
            X.C11381SQt.A02(r2)
            java.lang.String r0 = "NetworkBroadcastReceiver received action"
            r2.A0E(r0, r1)
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003f
            android.content.Context r1 = r4.A00
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x00a1 }
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r0.isConnected()     // Catch:{ SecurityException -> 0x00a1 }
            r1 = 1
            if (r0 != 0) goto L_0x00a2
            goto L_0x00a1
        L_0x003f:
            java.lang.String r0 = "com.google.analytics.RADIO_POWERED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = "com.google.android.gms.internal.gtm.zzcj"
            boolean r0 = r8.hasExtra(r0)
            if (r0 != 0) goto L_0x007e
            X.C11381SQt.A02(r5)
            java.lang.String r1 = "Radio powered up"
            r0 = 2
            X.ST5.A0B(r5, r1, r0)
            r5.A0J()
            X.SQt r0 = r5.A00
            android.content.Context r4 = r0.A00
            boolean r0 = X.C11322SMw.A00(r4)
            if (r0 == 0) goto L_0x0082
            boolean r0 = X.SH4.A00(r4)
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            android.content.Intent r2 = X.Pxe.A0G(r0)
            java.lang.String r1 = "com.google.android.gms.analytics.AnalyticsService"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r4, r1)
            r2.setComponent(r0)
            r4.startService(r2)
        L_0x007e:
            r0 = 372240905(0x162ff209, float:1.421276E-25)
            goto L_0x00c5
        L_0x0082:
            r2 = 0
            r5.A0J()
            X.SFa r0 = X.C11381SQt.A00(r5)
            X.TH9 r1 = new X.TH9
            r1.<init>(r5, r2)
            X.TSq r0 = r0.A02
            r0.submit(r1)
            goto L_0x007e
        L_0x0095:
            X.C11381SQt.A02(r2)
            java.lang.String r0 = "NetworkBroadcastReceiver received unknown action"
            r2.A0G(r0, r1)
            r0 = -1171991538(0xffffffffba24d40e, float:-6.287702E-4)
            goto L_0x00c5
        L_0x00a1:
            r1 = 0
        L_0x00a2:
            boolean r0 = r6.A01
            if (r0 == r1) goto L_0x00c2
            r6.A01 = r1
            X.C11381SQt.A02(r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "Network connectivity status changed"
            r5.A0E(r0, r1)
            X.SFa r0 = X.C11381SQt.A00(r5)
            X.TDN r1 = new X.TDN
            r1.<init>(r5)
            X.TSq r0 = r0.A02
            r0.submit(r1)
        L_0x00c2:
            r0 = -1058384818(0xffffffffc0ea544e, float:-7.322791)
        L_0x00c5:
            X.AnonymousClass0fD.A0E(r0, r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcj.onReceive(android.content.Context, android.content.Intent):void");
    }
}
