package X;

/* renamed from: X.SMw  reason: case insensitive filesystem */
public final class C11322SMw {
    public static C11331SNk A00;
    public static Object A01 = Pxe.A0p();
    public static Boolean A02;

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
            java.lang.String r3 = "com.google.android.gms.analytics.AnalyticsReceiver"
            r2 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0023 }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0023 }
            r0.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x0023 }
            android.content.pm.ActivityInfo r0 = r1.getReceiverInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0023 }
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
        throw new UnsupportedOperationException("Method not decompiled: X.C11322SMw.A00(android.content.Context):boolean");
    }
}
