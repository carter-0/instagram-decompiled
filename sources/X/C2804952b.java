package X;

/* renamed from: X.52b  reason: invalid class name and case insensitive filesystem */
public abstract class C2804952b {
    public static final String A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r6.isConnected() == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C2805052c A00(android.net.ConnectivityManager r7) {
        /*
            r0 = 0
            X.0qQ.A0B(r7, r0)
            android.net.NetworkInfo r6 = r7.getActiveNetworkInfo()
            r5 = 1
            if (r6 == 0) goto L_0x0012
            boolean r0 = r6.isConnected()
            r4 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            r3 = 0
            android.net.Network r0 = r7.getActiveNetwork()     // Catch:{ SecurityException -> 0x0025 }
            android.net.NetworkCapabilities r1 = r7.getNetworkCapabilities(r0)     // Catch:{ SecurityException -> 0x0025 }
            if (r1 == 0) goto L_0x0030
            r0 = 16
            boolean r3 = r1.hasCapability(r0)     // Catch:{ SecurityException -> 0x0025 }
            goto L_0x0030
        L_0x0025:
            r2 = move-exception
            X.AnonymousClass389.A00()
            java.lang.String r1 = A00
            java.lang.String r0 = "Unable to validate active network"
            android.util.Log.e(r1, r0, r2)
        L_0x0030:
            boolean r1 = r7.isActiveNetworkMetered()
            if (r6 == 0) goto L_0x0042
            boolean r0 = r6.isRoaming()
            if (r0 != 0) goto L_0x0042
        L_0x003c:
            X.52c r0 = new X.52c
            r0.<init>(r4, r3, r1, r5)
            return r0
        L_0x0042:
            r5 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2804952b.A00(android.net.ConnectivityManager):X.52c");
    }

    static {
        String A01 = AnonymousClass389.A01("NetworkStateTracker");
        0qQ.A07(A01);
        A00 = A01;
    }
}
