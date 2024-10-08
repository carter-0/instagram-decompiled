package com.google.android.gms.common;

import java.util.concurrent.atomic.AtomicBoolean;

public final class GooglePlayServicesUtil {
    public static boolean A00;
    public static boolean A01;
    @Deprecated
    public static final AtomicBoolean A02 = new AtomicBoolean();
    public static final AtomicBoolean A03 = new AtomicBoolean();

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.content.Context r3, int r4) {
        /*
            r1 = 1
            r0 = 18
            if (r4 != r0) goto L_0x0006
            return r1
        L_0x0006:
            if (r4 != r1) goto L_0x0041
            java.lang.String r2 = "com.google.android.gms"
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch:{ Exception -> 0x003f }
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch:{ Exception -> 0x003f }
            java.util.List r0 = r0.getAllSessions()     // Catch:{ Exception -> 0x003f }
            java.util.Iterator r1 = r0.iterator()
        L_0x001a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r0 = (android.content.pm.PackageInstaller.SessionInfo) r0
            java.lang.String r0 = r0.getAppPackageName()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001a
            r0 = 1
            return r0
        L_0x0032:
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r2, r0)     // Catch:{  }
            boolean r0 = r0.enabled     // Catch:{  }
            return r0
        L_0x003f:
            r0 = 0
            return r0
        L_0x0041:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.A00(android.content.Context, int):boolean");
    }
}
