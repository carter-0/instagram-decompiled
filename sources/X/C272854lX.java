package X;

/* renamed from: X.4lX  reason: invalid class name and case insensitive filesystem */
public abstract class C272854lX {
    public static RRL A00;
    public static C272874lZ A01;
    public static boolean A02;
    public static boolean A03;
    public static Integer A04;
    public static final Object A05 = new Object();

    public static C62507Kgx A00() {
        if (!A02) {
            return null;
        }
        RRL rrl = A00;
        if (rrl == null) {
            return C62507Kgx.UNINITIALIZED;
        }
        return rrl.A00();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:17|18|19|(1:21)|22|24|25|(1:27)|28|29|(1:31)(2:32|33)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0086 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c A[Catch:{ NameNotFoundException -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[Catch:{ NameNotFoundException -> 0x009f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A01() {
        /*
            java.lang.Object r11 = A05
            monitor-enter(r11)
            java.lang.Integer r0 = A04     // Catch:{ all -> 0x00f7 }
            if (r0 != 0) goto L_0x00d9
            X.4lZ r0 = A01     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00a4
            X.4lV r0 = r0.A00     // Catch:{ all -> 0x00f7 }
            android.content.Context r6 = r0.A00     // Catch:{ all -> 0x00f7 }
            X.0lg r7 = r0.A01     // Catch:{ all -> 0x00f7 }
            r4 = 0
            java.io.File r2 = r6.getDataDir()     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "app_webview_embedded"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00f7 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00f7 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00f7 }
            r10 = 0
            if (r0 != 0) goto L_0x009f
            java.lang.String r5 = "com.google.android.webview"
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x009f }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r5, r4)     // Catch:{ NameNotFoundException -> 0x009f }
            long r1 = r0.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x009f }
            X.O5U r0 = new X.O5U     // Catch:{ NameNotFoundException -> 0x009f }
            r0.<init>(r1)     // Catch:{ NameNotFoundException -> 0x009f }
            java.lang.Integer r1 = X.C69694NqG.A00(r0)     // Catch:{ NameNotFoundException -> 0x009f }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ NameNotFoundException -> 0x009f }
            if (r1 != r0) goto L_0x005d
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x009f }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r5, r4)     // Catch:{ NameNotFoundException -> 0x009f }
            long r1 = r0.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x009f }
            X.O5U r0 = new X.O5U     // Catch:{ NameNotFoundException -> 0x009f }
            r0.<init>(r1)     // Catch:{ NameNotFoundException -> 0x009f }
        L_0x0050:
            long r8 = r0.A00     // Catch:{ NameNotFoundException -> 0x009f }
            r0 = 100000(0x186a0, double:4.94066E-319)
            long r8 = r8 / r0
            r1 = 6668(0x1a0c, double:3.2944E-320)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x009f
            goto L_0x009e
        L_0x005d:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x009f }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x009f }
            X.O5U r2 = X.C69695NqH.A00(r6, r5)     // Catch:{ NameNotFoundException -> 0x0071 }
            java.lang.Integer r1 = X.C69694NqG.A00(r2)     // Catch:{ NameNotFoundException -> 0x0071 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ NameNotFoundException -> 0x0071 }
            if (r1 != r0) goto L_0x0071
            r3.add(r2)     // Catch:{ NameNotFoundException -> 0x0071 }
        L_0x0071:
            r0 = 679(0x2a7, float:9.51E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ NameNotFoundException -> 0x0086 }
            X.O5U r2 = X.C69695NqH.A00(r6, r0)     // Catch:{ NameNotFoundException -> 0x0086 }
            java.lang.Integer r1 = X.C69694NqG.A00(r2)     // Catch:{ NameNotFoundException -> 0x0086 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ NameNotFoundException -> 0x0086 }
            if (r1 != r0) goto L_0x0086
            r3.add(r2)     // Catch:{ NameNotFoundException -> 0x0086 }
        L_0x0086:
            boolean r0 = r3.isEmpty()     // Catch:{ NameNotFoundException -> 0x009f }
            if (r0 != 0) goto L_0x0096
            java.lang.Object r0 = r3.get(r4)     // Catch:{ NameNotFoundException -> 0x009f }
            X.0qQ.A0A(r0)     // Catch:{ NameNotFoundException -> 0x009f }
            X.O5U r0 = (X.O5U) r0     // Catch:{ NameNotFoundException -> 0x009f }
            goto L_0x0050
        L_0x0096:
            java.lang.String r1 = "No suitable candidates found for trichrome patching"
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ NameNotFoundException -> 0x009f }
            r0.<init>(r1)     // Catch:{ NameNotFoundException -> 0x009f }
            throw r0     // Catch:{ NameNotFoundException -> 0x009f }
        L_0x009e:
            r10 = 1
        L_0x009f:
            if (r10 == 0) goto L_0x00ac
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x00f7 }
            goto L_0x00d7
        L_0x00a4:
            java.lang.String r1 = "Attempted to fetch device eligibility prior to injection"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f7 }
            throw r0     // Catch:{ all -> 0x00f7 }
        L_0x00ac:
            X.0Tu r5 = X.0Tu.A05     // Catch:{ all -> 0x00f7 }
            r0 = 2342164413765199192(0x20810a2000092558, double:4.0667768207690645E-152)
            boolean r0 = X.182.A06(r5, r7, r0)     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00db
            X.4mA r3 = X.C273214mA.A00     // Catch:{ all -> 0x00f7 }
            r0 = 2342164413765133655(0x20810a2000082557, double:4.066776820713495E-152)
            boolean r2 = X.182.A06(r5, r7, r0)     // Catch:{ all -> 0x00f7 }
            r0 = 36321404551898460(0x810a20000f255c, double:3.0331407209529536E-306)
            boolean r0 = X.182.A06(r5, r7, r0)     // Catch:{ all -> 0x00f7 }
            java.lang.Integer r1 = r3.A01(r6, r2, r0)     // Catch:{ all -> 0x00f7 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x00f7 }
            if (r1 == r0) goto L_0x00db
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x00f7 }
        L_0x00d7:
            A04 = r0     // Catch:{ all -> 0x00f7 }
        L_0x00d9:
            monitor-exit(r11)     // Catch:{ all -> 0x00f7 }
            goto L_0x00f6
        L_0x00db:
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo()     // Catch:{ all -> 0x00f7 }
            java.lang.String r2 = r0.nativeLibraryDir     // Catch:{ all -> 0x00f7 }
            r1 = 1
            if (r2 == 0) goto L_0x00ed
            java.lang.String r0 = "/mnt/asec/"
            boolean r0 = X.00p.A0k(r2, r0, r4)     // Catch:{ all -> 0x00f7 }
            if (r0 != r1) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r1 = 0
        L_0x00ee:
            if (r1 == 0) goto L_0x00f3
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x00f7 }
            goto L_0x00d7
        L_0x00f3:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x00f7 }
            goto L_0x00d7
        L_0x00f6:
            return r0
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00f7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C272854lX.A01():java.lang.Integer");
    }
}
