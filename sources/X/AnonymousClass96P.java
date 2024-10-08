package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.96P  reason: invalid class name */
public final class AnonymousClass96P {
    public String A00;
    public int A01;
    public int A02 = 0;
    public String A03;
    public final Context A04;

    public static final synchronized void A02(AnonymousClass96P r2) {
        synchronized (r2) {
            PackageInfo A002 = r2.A00(r2.A04.getPackageName());
            if (A002 != null) {
                r2.A03 = Integer.toString(A002.versionCode);
                r2.A00 = A002.versionName;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int A03() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r2 = r5.A02     // Catch:{ all -> 0x0048 }
            if (r2 != 0) goto L_0x0046
            android.content.Context r0 = r5.A04     // Catch:{ all -> 0x0048 }
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = "com.google.android.c2dm.permission.SEND"
            r0 = 270(0x10e, float:3.78E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0048 }
            int r2 = r4.checkPermission(r1, r0)     // Catch:{ all -> 0x0048 }
            r1 = -1
            r3 = 0
            if (r2 != r1) goto L_0x0024
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r0 = "Google Play services missing or without correct permission."
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)
            return r3
        L_0x0024:
            java.lang.String r2 = "com.google.iid.TOKEN_REQUEST"
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0048 }
            r1.<init>(r2)     // Catch:{ all -> 0x0048 }
            r1.setPackage(r0)     // Catch:{ all -> 0x0048 }
            java.util.List r0 = r4.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x0048 }
            r2 = 2
            if (r0 == 0) goto L_0x003e
            int r0 = r0.size()     // Catch:{ all -> 0x0048 }
            if (r0 <= 0) goto L_0x003e
        L_0x003b:
            r5.A02 = r2     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x003e:
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r0 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0048 }
            goto L_0x003b
        L_0x0046:
            monitor-exit(r5)
            return r2
        L_0x0048:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96P.A03():int");
    }

    public final synchronized int A04() {
        PackageInfo A002;
        if (this.A01 == 0 && (A002 = A00(AnonymousClass000.A00(270))) != null) {
            this.A01 = A002.versionCode;
        }
        return this.A01;
    }

    public final synchronized String A05() {
        if (this.A03 == null) {
            A02(this);
        }
        return this.A03;
    }

    private final PackageInfo A00(String str) {
        try {
            return this.A04.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public AnonymousClass96P(Context context) {
        this.A04 = context;
    }

    public static String A01(C3734195g r3) {
        C3734195g.A01(r3);
        C3733995e r0 = r3.A01;
        String str = r0.A01;
        if (str == null) {
            C3734195g.A01(r3);
            str = r0.A00;
            if (str.startsWith("1:")) {
                String[] split = str.split(":");
                if (split.length >= 2) {
                    str = split[1];
                    if (str.isEmpty()) {
                        return null;
                    }
                }
                return null;
            }
        }
        return str;
    }
}
