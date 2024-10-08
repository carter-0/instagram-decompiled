package com.instagram.analytics.uploadscheduler;

import android.content.BroadcastReceiver;

public final class AnalyticsUploadAlarmReceiver extends BroadcastReceiver {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if (r3 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            r0 = -1934231635(0xffffffff8cb5f7ad, float:-2.803653E-31)
            int r2 = X.AnonymousClass0fD.A01(r0)
            X.AnonymousClass0fQ.A01(r7, r8, r9)
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r0 = 1
            X.0qQ.A0B(r9, r0)
            java.lang.String r6 = r9.getAction()
            X.3IV[] r5 = X.AnonymousClass3IV.values()
            int r4 = r5.length
            r1 = 0
        L_0x001c:
            if (r1 >= r4) goto L_0x002b
            r3 = r5[r1]
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x002c
            int r1 = r1 + 1
            goto L_0x001c
        L_0x002b:
            r3 = 0
        L_0x002c:
            X.3IV r0 = X.AnonymousClass3IV.A07
            if (r3 != r0) goto L_0x0063
            X.0wX r0 = X.C61170le.A00
            X.18g r1 = X.C638918c.A01(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A07
        L_0x0038:
            r1.A0K(r9, r0)
        L_0x003b:
            r0 = 0
            r3.A02 = r0
        L_0x003e:
            X.08y r0 = X.09i.A0A
            X.0wW r0 = r0.A05(r7)
            X.0xN r1 = X.C60510iO.A00(r0)
            boolean r0 = r1 instanceof X.AnonymousClass0xK
            if (r0 == 0) goto L_0x005c
            X.0iY r1 = (X.C60560iY) r1
            X.1t1 r1 = (X.1t1) r1
            X.1t0 r1 = r1.A00
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 5
            android.os.Message r0 = r1.obtainMessage(r0)
            r1.sendMessage(r0)
        L_0x005c:
            r0 = 843667725(0x3249590d, float:1.1719988E-8)
            X.AnonymousClass0fD.A0E(r0, r2, r9)
            return
        L_0x0063:
            X.3IV r0 = X.AnonymousClass3IV.A06
            if (r3 != r0) goto L_0x0070
            X.0wX r0 = X.C61170le.A00
            X.18g r1 = X.C638918c.A01(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            goto L_0x0038
        L_0x0070:
            if (r3 == 0) goto L_0x003e
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.analytics.uploadscheduler.AnalyticsUploadAlarmReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
