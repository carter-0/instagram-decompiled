package X;

public final class SA8 {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A00(java.lang.Object r6) {
        /*
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r4 = com.google.firebase.components.ComponentDiscoveryService.class
            android.content.Context r6 = (android.content.Context) r6
            java.lang.String r3 = "ComponentDiscovery"
            r5 = 0
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x002e }
            if (r2 != 0) goto L_0x0013
            java.lang.String r0 = "Context has no PackageManager."
        L_0x000f:
            android.util.Log.w(r3, r0)     // Catch:{ NameNotFoundException -> 0x002e }
            goto L_0x0033
        L_0x0013:
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x002e }
            r1.<init>(r6, r4)     // Catch:{ NameNotFoundException -> 0x002e }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r0 = r2.getServiceInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x002e }
            if (r0 != 0) goto L_0x002b
            java.lang.StringBuilder r1 = X.JTQ.A0d(r4)     // Catch:{ NameNotFoundException -> 0x002e }
            java.lang.String r0 = " has no service info."
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ NameNotFoundException -> 0x002e }
            goto L_0x000f
        L_0x002b:
            android.os.Bundle r5 = r0.metaData     // Catch:{ NameNotFoundException -> 0x002e }
            goto L_0x0033
        L_0x002e:
            java.lang.String r0 = "Application info not found."
            android.util.Log.w(r3, r0)
        L_0x0033:
            if (r5 != 0) goto L_0x003f
            java.lang.String r0 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r3, r0)
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x003e:
            return r4
        L_0x003f:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = X.Pxf.A0t(r5)
        L_0x0047:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.String r2 = X.AnonymousClass7TE.A18(r3)
            java.lang.Object r1 = r5.get(r2)
            java.lang.String r0 = "com.google.firebase.components.ComponentRegistrar"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = "com.google.firebase.components:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x0047
            r0 = 31
            java.lang.String r0 = r2.substring(r0)
            r4.add(r0)
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SA8.A00(java.lang.Object):java.util.List");
    }
}
