package X;

/* renamed from: X.4mB  reason: invalid class name and case insensitive filesystem */
public abstract class C273224mB {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r4.versionCode < 455772526) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r0.getInt("com.facebook.services.helium.trampoline.api.level", r1) >= 2) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C273234mC A00(android.content.pm.PackageManager r9) {
        /*
            r8 = 0
            if (r9 == 0) goto L_0x005a
            X.4mC r7 = X.C273234mC.A04
            r5 = 0
            java.lang.String r2 = "com.facebook.services"
            java.lang.String r1 = "com.facebook.oxygen.services.helium.trampoline.HeliumSandboxedService"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0046 }
            r0.<init>(r2, r1)     // Catch:{ NameNotFoundException -> 0x0046 }
            android.content.pm.ServiceInfo r0 = r9.getServiceInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x0046 }
            boolean r0 = r0.exported
            if (r0 == 0) goto L_0x0046
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 > r0) goto L_0x0045
            r6 = 2
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r4 = r9.getPackageInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0046 }
            java.lang.String r3 = "com.facebook.services.helium.trampoline.api.level"
            java.lang.String r0 = r4.packageName
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0036
            int r2 = r4.versionCode
            r0 = 455772526(0x1b2a896e, float:1.4106476E-22)
            r1 = 1
            if (r2 >= r0) goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            android.content.pm.ApplicationInfo r0 = r4.applicationInfo
            if (r0 == 0) goto L_0x0046
            android.os.Bundle r0 = r0.metaData
            if (r0 == 0) goto L_0x0046
            int r0 = r0.getInt(r3, r1)
            if (r0 < r6) goto L_0x0046
        L_0x0045:
            return r7
        L_0x0046:
            X.4mC r7 = X.C273234mC.A03
            java.lang.String r2 = "com.facebook.appmanager"
            java.lang.String r1 = "com.facebook.oxygen.appmanager.helium.trampoline.HeliumSandboxedService"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x005a }
            r0.<init>(r2, r1)     // Catch:{ NameNotFoundException -> 0x005a }
            android.content.pm.ServiceInfo r0 = r9.getServiceInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x005a }
            boolean r0 = r0.exported
            if (r0 == 0) goto L_0x005a
            return r7
        L_0x005a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273224mB.A00(android.content.pm.PackageManager):X.4mC");
    }
}
