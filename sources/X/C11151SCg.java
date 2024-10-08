package X;

/* renamed from: X.SCg  reason: case insensitive filesystem */
public abstract class C11151SCg {
    public static final Object A00 = Pxe.A0p();
    public static volatile T99 A01 = C8419QuA.A00;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.content.Context r8, android.net.Uri r9) {
        /*
            java.lang.String r7 = "com.google.android.gms.phenotype"
            java.lang.String r1 = r9.getAuthority()
            boolean r0 = r7.equals(r1)
            r5 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r0 = "PhenotypeClientHelper"
            X.Pxh.A1L(r2, r1, r0)
            return r5
        L_0x0019:
            X.T99 r0 = A01
            boolean r0 = r0 instanceof X.C8418Qu9
            if (r0 != 0) goto L_0x0085
            java.lang.Object r6 = A00
            monitor-enter(r6)
            X.T99 r0 = A01     // Catch:{ all -> 0x0082 }
            boolean r0 = r0 instanceof X.C8418Qu9     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x003f
            X.T99 r1 = A01     // Catch:{ all -> 0x0082 }
            boolean r0 = r1 instanceof X.C8418Qu9     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0038
            X.Qu9 r1 = (X.C8418Qu9) r1     // Catch:{ all -> 0x0082 }
            java.lang.Object r0 = r1.A00     // Catch:{ all -> 0x0082 }
            boolean r0 = X.AnonymousClass7TE.A1a(r0)     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            return r0
        L_0x0038:
            java.lang.String r0 = "Optional.get() cannot be called on an absent value"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x0082 }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x003f:
            java.lang.String r4 = "com.google.android.gms"
            java.lang.String r0 = r8.getPackageName()     // Catch:{ all -> 0x0082 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x0066
            android.content.pm.PackageManager r3 = r8.getPackageManager()     // Catch:{ all -> 0x0082 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0082 }
            r1 = 29
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            if (r2 >= r1) goto L_0x0058
            r0 = 0
        L_0x0058:
            android.content.pm.ProviderInfo r0 = r3.resolveContentProvider(r7, r0)     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = r0.packageName     // Catch:{ all -> 0x0082 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0075
        L_0x0066:
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch:{ all -> 0x0082 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0075 }
            int r0 = r0.flags     // Catch:{ all -> 0x0082 }
            r0 = r0 & 129(0x81, float:1.81E-43)
            if (r0 == 0) goto L_0x0075
            r5 = 1
        L_0x0075:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0082 }
            X.Qu9 r0 = new X.Qu9     // Catch:{ all -> 0x0082 }
            r0.<init>(r1)     // Catch:{ all -> 0x0082 }
            A01 = r0     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            goto L_0x0085
        L_0x0082:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            throw r0
        L_0x0085:
            X.T99 r1 = A01
            boolean r0 = r1 instanceof X.C8418Qu9
            if (r0 == 0) goto L_0x0094
            X.Qu9 r1 = (X.C8418Qu9) r1
            java.lang.Object r0 = r1.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            return r0
        L_0x0094:
            java.lang.String r0 = "Optional.get() cannot be called on an absent value"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11151SCg.A00(android.content.Context, android.net.Uri):boolean");
    }
}
