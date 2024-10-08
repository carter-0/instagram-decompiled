package X;

/* renamed from: X.RVx  reason: case insensitive filesystem */
public abstract class C9272RVx {
    /* JADX WARNING: Can't wrap try/catch for region: R(2:47|48) */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r3 = new X.C10932S1k(X.AnonymousClass05K.A0Y, false, false);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0090 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:47:0x0090=Splitter:B:47:0x0090, B:8:0x0029=Splitter:B:8:0x0029} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C10932S1k A00(android.content.Context r7) {
        /*
            android.content.pm.PackageManager r5 = r7.getPackageManager()
            java.lang.String r6 = "com.facebook.appmanager"
            java.lang.String r0 = "com.facebook.oxygen.appmanager.firstparty.tos.ShouldAcceptTos"
            android.content.ComponentName r3 = new android.content.ComponentName
            r3.<init>(r6, r0)
            java.lang.String r0 = "com.facebook.oxygen.appmanager.firstparty.tos.ShouldShowExplicitTos"
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r6, r0)
            r4 = 0
            int r1 = r5.getComponentEnabledSetting(r3)     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            int r0 = r5.getComponentEnabledSetting(r2)     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            r5 = 1
            if (r1 == 0) goto L_0x0031
            if (r0 == 0) goto L_0x0031
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r5)
            if (r0 == r5) goto L_0x0029
            r5 = 0
        L_0x0029:
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            X.S1k r3 = new X.S1k     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            r3.<init>(r0, r1, r5)     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            return r3
        L_0x0031:
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            r0.getReceiverInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x0063 }
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            r0.getReceiverInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x0063 }
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r4)     // Catch:{ NameNotFoundException -> 0x005b }
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            int r1 = r0.flags     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            r0 = r1 & 1
            if (r0 != 0) goto L_0x0053
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x005b
        L_0x0053:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            X.S1k r3 = new X.S1k     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            r3.<init>(r0, r5, r5)     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            return r3
        L_0x005b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            X.S1k r3 = new X.S1k     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            r3.<init>(r0, r5, r4)     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            return r3
        L_0x0063:
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            java.lang.String r0 = "com.facebook.oxygen.appmanager.firstparty.tos.ShouldShowTos"
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            r1.<init>(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            r3 = 0
            int r0 = r2.getComponentEnabledSetting(r1)     // Catch:{ IllegalArgumentException -> 0x0090 }
            r2 = 1
            if (r0 != 0) goto L_0x0085
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x0090 }
            r0.getReceiverInfo(r1, r4)     // Catch:{ all -> 0x0097 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ IllegalArgumentException -> 0x0090 }
            X.S1k r1 = new X.S1k     // Catch:{ IllegalArgumentException -> 0x0090 }
            r1.<init>(r0, r5, r5)     // Catch:{ IllegalArgumentException -> 0x0090 }
            return r1
        L_0x0085:
            if (r0 == r5) goto L_0x0088
            r2 = 0
        L_0x0088:
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ IllegalArgumentException -> 0x0090 }
            X.S1k r1 = new X.S1k     // Catch:{ IllegalArgumentException -> 0x0090 }
            r1.<init>(r0, r2, r2)     // Catch:{ IllegalArgumentException -> 0x0090 }
            return r1
        L_0x0090:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            X.S1k r3 = new X.S1k     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
            r3.<init>(r0, r4, r4)     // Catch:{ IllegalArgumentException -> 0x00d2, all -> 0x009a }
        L_0x0097:
            if (r3 == 0) goto L_0x009a
            return r3
        L_0x009a:
            java.lang.String r0 = "phone"
            java.lang.Object r3 = r7.getSystemService(r0)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            int r1 = r3.getSimState()
            r2 = 1
            r0 = 5
            if (r1 != r0) goto L_0x00ca
            java.lang.String r1 = r3.getSimOperator()
            java.lang.String r0 = "2"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = "302"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00c7
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            X.S1k r3 = new X.S1k
            r3.<init>(r0, r2, r4)
            return r3
        L_0x00c7:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            goto L_0x00cc
        L_0x00ca:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
        L_0x00cc:
            X.S1k r3 = new X.S1k
            r3.<init>(r0, r2, r2)
            return r3
        L_0x00d2:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.S1k r3 = new X.S1k
            r3.<init>(r0, r4, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9272RVx.A00(android.content.Context):X.S1k");
    }
}
