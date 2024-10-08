package X;

import android.content.Context;
import android.os.Handler;

public final class SH4 {
    public static Boolean A02;
    public final Context A00;
    public final Handler A01 = new Handler();

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(android.content.Intent r11, int r12) {
        /*
            r10 = this;
            java.lang.Object r9 = X.C11322SMw.A01     // Catch:{ SecurityException -> 0x008f }
            monitor-enter(r9)     // Catch:{ SecurityException -> 0x008f }
            X.SNk r7 = X.C11322SMw.A00     // Catch:{ all -> 0x008c }
            if (r7 == 0) goto L_0x008a
            android.os.PowerManager$WakeLock r0 = r7.A05     // Catch:{ all -> 0x008c }
            boolean r0 = r0.isHeld()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x008a
            java.util.concurrent.atomic.AtomicInteger r0 = r7.A02     // Catch:{ all -> 0x008c }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x008c }
            if (r0 >= 0) goto L_0x0024
            java.lang.String r2 = "WakeLock"
            java.lang.String r0 = r7.A07     // Catch:{ all -> 0x008c }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = " release without a matched acquire!"
            X.Pxh.A1L(r1, r0, r2)     // Catch:{ all -> 0x008c }
        L_0x0024:
            r8 = 0
            boolean r0 = r7.A03     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x002c
            android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x008c }
        L_0x002c:
            java.lang.Object r6 = r7.A06     // Catch:{ all -> 0x008c }
            monitor-enter(r6)     // Catch:{ all -> 0x008c }
            boolean r0 = r7.A03     // Catch:{ all -> 0x0084 }
            r5 = 1
            r3 = 0
            if (r0 == 0) goto L_0x007b
            java.util.Map r2 = r7.A08     // Catch:{ all -> 0x0084 }
            java.lang.Object r1 = r2.get(r8)     // Catch:{ all -> 0x0084 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x007b
            int r0 = X.JTO.A0A(r1, r3)     // Catch:{ all -> 0x0084 }
            if (r0 != r5) goto L_0x0074
            r2.remove(r8)     // Catch:{ all -> 0x0084 }
        L_0x0048:
            android.os.PowerManager$WakeLock r1 = r7.A05     // Catch:{ all -> 0x0084 }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x0084 }
            long r3 = (long) r0     // Catch:{ all -> 0x0084 }
            int r0 = java.lang.System.identityHashCode(r1)     // Catch:{ all -> 0x0084 }
            long r1 = (long) r0     // Catch:{ all -> 0x0084 }
            r0 = 32
            long r3 = r3 << r0
            long r3 = r3 | r1
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0084 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0084 }
            if (r5 != r0) goto L_0x0064
            java.lang.String r8 = ""
        L_0x0064:
            java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0084 }
            java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0084 }
            X.C11331SNk.A00(r7)     // Catch:{ all -> 0x0084 }
            int r0 = r7.A00     // Catch:{ all -> 0x0084 }
            int r0 = r0 - r5
            r7.A00 = r0     // Catch:{ all -> 0x0084 }
        L_0x0072:
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            goto L_0x0087
        L_0x0074:
            int r0 = r0 - r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0084 }
            r1[r3] = r0     // Catch:{ all -> 0x0084 }
        L_0x007b:
            boolean r0 = r7.A03     // Catch:{ all -> 0x0084 }
            if (r0 != 0) goto L_0x0072
            int r0 = r7.A00     // Catch:{ all -> 0x0084 }
            if (r0 != r5) goto L_0x0072
            goto L_0x0048
        L_0x0084:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ all -> 0x008c }
        L_0x0087:
            X.C11331SNk.A01(r7)     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r9)     // Catch:{ all -> 0x008c }
            goto L_0x008f
        L_0x008c:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x008c }
            throw r0     // Catch:{ SecurityException -> 0x008f }
        L_0x008f:
            android.content.Context r2 = r10.A00
            X.SQt r0 = X.C11381SQt.A01(r2)
            X.QvX r3 = r0.A0C
            X.C11381SQt.A02(r3)
            r8 = 2
            if (r11 != 0) goto L_0x00a4
            java.lang.String r1 = "AnalyticsService started with null intent"
            r0 = 5
            X.ST5.A0B(r3, r1, r0)
        L_0x00a3:
            return r8
        L_0x00a4:
            java.lang.String r5 = r11.getAction()
            java.lang.String r7 = "Local AnalyticsService called. startId, action"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r6 = 0
            X.ST5.A0A(r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00a3
            X.TJ2 r1 = new X.TJ2
            r1.<init>(r3, r10, r12)
            X.SQt r0 = X.C11381SQt.A01(r2)
            X.QvT r3 = r0.A06
            X.C11381SQt.A02(r3)
            X.SyH r2 = new X.SyH
            r2.<init>(r10, r1)
            r3.A0J()
            X.SFa r0 = X.C11381SQt.A00(r3)
            X.TH9 r1 = new X.TH9
            r1.<init>(r3, r2)
            X.TSq r0 = r0.A02
            r0.submit(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SH4.A01(android.content.Intent, int):int");
    }

    public SH4(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0.enabled == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.content.Context r4) {
        /*
            X.AnonymousClass3Qk.A02(r4)
            java.lang.Boolean r0 = A02
            if (r0 == 0) goto L_0x000c
            boolean r1 = r0.booleanValue()
            return r1
        L_0x000c:
            java.lang.String r3 = "com.google.android.gms.analytics.AnalyticsService"
            r2 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0023 }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0023 }
            r0.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x0023 }
            android.content.pm.ServiceInfo r0 = r1.getServiceInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0023 }
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0023 }
            r1 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            A02 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SH4.A00(android.content.Context):boolean");
    }
}
