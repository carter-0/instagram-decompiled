package X;

/* renamed from: X.Ei8  reason: case insensitive filesystem */
public abstract class C48661Ei8 {
    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2 = new android.content.Intent(X.C49268EsB.A00);
        r6 = "com.facebook.appmanager";
        r5 = "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity";
        r2.setComponent(new android.content.ComponentName(r6, r5));
        r2.putExtra("package_name", r8.getPackageName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        if (r2.resolveActivityInfo(r7, 0) == null) goto L_0x0091;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r10) {
        /*
            r9 = 1
            androidx.fragment.app.Fragment r0 = X.DbU.A0H(r10)
            android.content.Context r3 = r0.requireContext()
            X.0Tu r2 = X.0Tu.A05
            r0 = 18301053216754918(0x4104b600000ce6, double:1.8933600812715496E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            r4 = 0
            if (r0 == 0) goto L_0x0091
            android.content.Context r8 = r3.getApplicationContext()     // Catch:{ Exception -> 0x008b }
            android.content.pm.PackageManager r7 = r3.getPackageManager()     // Catch:{ Exception -> 0x008b }
            if (r7 == 0) goto L_0x0091
            X.1SF r1 = new X.1SF     // Catch:{ Exception -> 0x008b }
            r1.<init>(r8, r7)     // Catch:{ Exception -> 0x008b }
            r0 = 18
            boolean r0 = r1.A01(r0)     // Catch:{ Exception -> 0x008b }
            if (r0 == 0) goto L_0x0091
            java.lang.String r6 = "com.facebook.appmanager"
            java.lang.String r5 = "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Exception -> 0x003e }
            r0.<init>(r6, r5)     // Catch:{ Exception -> 0x003e }
            int r0 = r7.getComponentEnabledSetting(r0)     // Catch:{ Exception -> 0x003e }
            if (r0 != r9) goto L_0x0091
            goto L_0x0060
        L_0x003e:
            java.lang.String r0 = X.C49268EsB.A00     // Catch:{ Exception -> 0x008b }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x008b }
            r2.<init>(r0)     // Catch:{ Exception -> 0x008b }
            java.lang.String r6 = "com.facebook.appmanager"
            java.lang.String r5 = "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Exception -> 0x008b }
            r0.<init>(r6, r5)     // Catch:{ Exception -> 0x008b }
            r2.setComponent(r0)     // Catch:{ Exception -> 0x008b }
            java.lang.String r1 = r8.getPackageName()     // Catch:{ Exception -> 0x008b }
            java.lang.String r0 = "package_name"
            r2.putExtra(r0, r1)     // Catch:{ Exception -> 0x008b }
            android.content.pm.ActivityInfo r0 = r2.resolveActivityInfo(r7, r4)     // Catch:{ Exception -> 0x008b }
            if (r0 == 0) goto L_0x0091
        L_0x0060:
            java.lang.String r0 = X.C49268EsB.A00     // Catch:{ ActivityNotFoundException -> 0x0087 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0087 }
            r2.<init>(r0)     // Catch:{ ActivityNotFoundException -> 0x0087 }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ ActivityNotFoundException -> 0x0087 }
            r0.<init>(r6, r5)     // Catch:{ ActivityNotFoundException -> 0x0087 }
            r2.setComponent(r0)     // Catch:{ ActivityNotFoundException -> 0x0087 }
            java.lang.String r1 = r3.getPackageName()     // Catch:{ ActivityNotFoundException -> 0x0087 }
            java.lang.String r0 = "package_name"
            r2.putExtra(r0, r1)     // Catch:{ ActivityNotFoundException -> 0x0087 }
            X.0b6 r1 = X.0b6.A00()     // Catch:{ ActivityNotFoundException -> 0x0087 }
            X.0Pj r0 = X.C49269EsC.A00     // Catch:{ ActivityNotFoundException -> 0x0087 }
            X.0bs r0 = r1.A0B(r0)     // Catch:{ ActivityNotFoundException -> 0x0087 }
            r0.A0G(r3, r2)     // Catch:{ ActivityNotFoundException -> 0x0087 }
            r4 = 1
            goto L_0x0091
        L_0x0087:
            r1 = move-exception
            java.lang.String r0 = "Failed to launch App-Update-Settings activity within AppManage"
            goto L_0x008e
        L_0x008b:
            r1 = move-exception
            java.lang.String r0 = "isAppUpdateSettingsSupported query failed"
        L_0x008e:
            X.0wb.A07(r0, r1)
        L_0x0091:
            r3 = 0
            if (r4 != 0) goto L_0x00a4
            X.0lg r2 = X.C308206Td.A0B(r10)
            X.ESF r1 = new X.ESF
            r1.<init>()
            androidx.fragment.app.FragmentActivity r0 = X.C308206Td.A04(r10)
            X.Dbb.A0o(r3, r1, r0, r2)
        L_0x00a4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48661Ei8.A00(X.6Rx):java.lang.Object");
    }
}
