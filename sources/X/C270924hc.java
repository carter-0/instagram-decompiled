package X;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: X.4hc  reason: invalid class name and case insensitive filesystem */
public final class C270924hc {
    public static final String[] A02 = {"gps", "network"};
    public final Context A00;
    public final LocationManager A01;

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0073 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A00(X.C270924hc r8, java.lang.Integer r9, java.util.Set r10, java.util.Set r11, boolean r12) {
        /*
            java.lang.String[] r7 = A02
            r5 = 2
            r4 = 0
            r3 = 0
        L_0x0005:
            if (r3 >= r5) goto L_0x0080
            r6 = r7[r3]
            r6.getClass()     // Catch:{ SecurityException -> 0x005f }
            android.location.LocationManager r0 = r8.A01     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0013 }
            android.location.LocationProvider r2 = r0.getProvider(r6)     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r2 != 0) goto L_0x0019
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ SecurityException -> 0x005f }
            goto L_0x0061
        L_0x0019:
            int r1 = r2.getPowerRequirement()     // Catch:{ SecurityException -> 0x005f }
            r0 = 3
            if (r1 != r0) goto L_0x0027
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ SecurityException -> 0x005f }
            if (r9 == r0) goto L_0x0027
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ SecurityException -> 0x005f }
            goto L_0x0061
        L_0x0027:
            r2.hasMonetaryCost()     // Catch:{ SecurityException -> 0x005f }
            android.location.LocationManager r0 = r8.A01     // Catch:{ SecurityException -> 0x005f }
            boolean r0 = r0.isProviderEnabled(r6)     // Catch:{ SecurityException -> 0x005f }
            if (r0 != 0) goto L_0x0035
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ SecurityException -> 0x005f }
            goto L_0x0061
        L_0x0035:
            if (r12 == 0) goto L_0x004b
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            r1 = 0
            android.content.Context r0 = r8.A00     // Catch:{ all -> 0x0043 }
            int r0 = r0.checkCallingOrSelfPermission(r2)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0043
            r1 = 1
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            java.lang.Integer r1 = X.AnonymousClass05K.A0N     // Catch:{ SecurityException -> 0x005f }
            goto L_0x0061
        L_0x0048:
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ SecurityException -> 0x005f }
            goto L_0x0061
        L_0x004b:
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            r1 = 0
            android.content.Context r0 = r8.A00     // Catch:{ all -> 0x0057 }
            int r0 = r0.checkCallingOrSelfPermission(r2)     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x0057
            r1 = 1
        L_0x0057:
            if (r1 == 0) goto L_0x005c
            java.lang.Integer r1 = X.AnonymousClass05K.A0N     // Catch:{ SecurityException -> 0x005f }
            goto L_0x0061
        L_0x005c:
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ SecurityException -> 0x005f }
            goto L_0x0061
        L_0x005f:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0061:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0076
            if (r10 == 0) goto L_0x006a
            r10.add(r6)
        L_0x006a:
            if (r4 == 0) goto L_0x0072
            int r0 = r4.compareTo(r1)
            if (r0 >= 0) goto L_0x0073
        L_0x0072:
            r4 = r1
        L_0x0073:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x0076:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x006a
            if (r11 == 0) goto L_0x006a
            r11.add(r6)
            goto L_0x006a
        L_0x0080:
            if (r4 != 0) goto L_0x0084
            java.lang.Integer r4 = X.AnonymousClass05K.A01
        L_0x0084:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270924hc.A00(X.4hc, java.lang.Integer, java.util.Set, java.util.Set, boolean):java.lang.Integer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r3.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.Q0G A01(java.lang.Integer r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            android.content.Context r3 = r7.A00     // Catch:{ all -> 0x000b }
            int r0 = r3.checkCallingOrSelfPermission(r0)     // Catch:{ all -> 0x000b }
            if (r0 != 0) goto L_0x000b
            goto L_0x0015
        L_0x000b:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            android.content.Context r3 = r7.A00     // Catch:{ all -> 0x0044 }
            int r0 = r3.checkCallingOrSelfPermission(r0)     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0044
        L_0x0015:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.lang.Integer r4 = A00(r7, r8, r6, r5, r9)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r4 == r2) goto L_0x002f
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x0029:
            X.Q0G r3 = new X.Q0G
            r3.<init>(r4, r2, r6, r5)
            return r3
        L_0x002f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0041
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            int r0 = r3.checkCallingOrSelfPermission(r0)     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x003e
            goto L_0x0029
        L_0x003e:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x0029
        L_0x0041:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x0029
        L_0x0044:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            X.Q0G r3 = new X.Q0G
            r3.<init>(r2, r2, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270924hc.A01(java.lang.Integer, boolean):X.Q0G");
    }

    public C270924hc(Context context, LocationManager locationManager) {
        this.A00 = context;
        this.A01 = locationManager;
    }
}
