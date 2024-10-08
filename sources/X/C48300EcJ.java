package X;

/* renamed from: X.EcJ  reason: case insensitive filesystem */
public abstract class C48300EcJ {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034 A[Catch:{ SecurityException -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c A[Catch:{ SecurityException -> 0x0040 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r4, java.lang.String r5) {
        /*
            if (r4 == 0) goto L_0x0050
            if (r5 == 0) goto L_0x0050
            android.content.pm.PackageManager r3 = r4.getPackageManager()     // Catch:{ SecurityException -> 0x0040 }
            r2 = 0
            if (r3 == 0) goto L_0x001d
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ NameNotFoundException -> 0x0016 }
            java.lang.String r1 = r0.packageName     // Catch:{ NameNotFoundException -> 0x0016 }
            r0 = 0
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0016 }
        L_0x0016:
            if (r2 == 0) goto L_0x001d
            java.lang.CharSequence r0 = r3.getApplicationLabel(r2)     // Catch:{ SecurityException -> 0x0040 }
            goto L_0x0024
        L_0x001d:
            r0 = 17039375(0x104000f, float:2.4244613E-38)
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SecurityException -> 0x0040 }
        L_0x0024:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ SecurityException -> 0x0040 }
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r0, r5)     // Catch:{ SecurityException -> 0x0040 }
            java.lang.Object r0 = X.DbZ.A0e(r4)     // Catch:{ SecurityException -> 0x0040 }
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0     // Catch:{ SecurityException -> 0x0040 }
            if (r0 != 0) goto L_0x003c
            java.lang.String r1 = "ClipboardUtil"
            java.lang.String r0 = "Failed to get clipboard service"
            X.0KC.A0C(r1, r0)     // Catch:{ SecurityException -> 0x0040 }
            return
        L_0x003c:
            r0.setPrimaryClip(r1)     // Catch:{ SecurityException -> 0x0040 }
            return
        L_0x0040:
            r2 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 != r0) goto L_0x004f
            java.lang.String r1 = "ClipboardUtil"
            java.lang.String r0 = "Failed to copy to clipboard"
            X.0KC.A0F(r1, r0, r2)
            return
        L_0x004f:
            throw r2
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48300EcJ.A00(android.content.Context, java.lang.String):void");
    }
}
