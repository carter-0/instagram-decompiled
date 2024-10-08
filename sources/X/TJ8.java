package X;

import android.os.Bundle;

public final /* synthetic */ class TJ8 implements Runnable {
    public final Bundle A00;
    public final C365498nD A01;
    public final AnonymousClass96T A02;

    public TJ8(Bundle bundle, C365498nD r2, AnonymousClass96T r3) {
        this.A02 = r3;
        this.A00 = bundle;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (((X.RKU) r1.getCause()).A00 == 4) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        if (r0 != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            X.96T r0 = r7.A02
            android.os.Bundle r5 = r7.A00
            X.8nD r3 = r7.A01
            X.96U r4 = r0.A02     // Catch:{ IOException -> 0x006b }
            X.96P r0 = r4.A05     // Catch:{ IOException -> 0x006b }
            int r1 = r0.A04()     // Catch:{ IOException -> 0x006b }
            r0 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r1 < r0) goto L_0x004c
            android.content.Context r0 = r4.A03     // Catch:{ IOException -> 0x006b }
            X.PyO r6 = X.PyO.A01(r0)     // Catch:{ IOException -> 0x006b }
            monitor-enter(r6)     // Catch:{ IOException -> 0x006b }
            int r2 = r6.A00     // Catch:{ all -> 0x0030 }
            int r0 = r2 + 1
            r6.A00 = r0     // Catch:{ all -> 0x0030 }
            monitor-exit(r6)     // Catch:{ IOException -> 0x006b }
            r1 = 1
            X.R2A r0 = new X.R2A     // Catch:{ IOException -> 0x006b }
            r0.<init>(r5, r2, r1)     // Catch:{ IOException -> 0x006b }
            X.9GD r0 = X.PyO.A00(r6, r0)     // Catch:{ IOException -> 0x006b }
            java.lang.Object r2 = X.C3736896n.A00(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0033 }
            goto L_0x0067
        L_0x0030:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x006b }
            throw r0     // Catch:{ IOException -> 0x006b }
        L_0x0033:
            r1 = move-exception
            java.lang.String r0 = "FirebaseInstanceId"
            X.Pxg.A1N(r0, r1)     // Catch:{ IOException -> 0x006b }
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ IOException -> 0x006b }
            boolean r0 = r0 instanceof X.RKU     // Catch:{ IOException -> 0x006b }
            if (r0 == 0) goto L_0x0066
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ IOException -> 0x006b }
            X.RKU r0 = (X.RKU) r0     // Catch:{ IOException -> 0x006b }
            int r1 = r0.A00     // Catch:{ IOException -> 0x006b }
            r0 = 4
            if (r1 != r0) goto L_0x0066
        L_0x004c:
            android.os.Bundle r2 = X.AnonymousClass96U.A00(r5, r4)     // Catch:{ IOException -> 0x006b }
            if (r2 == 0) goto L_0x0067
            java.lang.String r1 = "google.messenger"
            boolean r0 = r2.containsKey(r1)     // Catch:{ IOException -> 0x006b }
            if (r0 == 0) goto L_0x0067
            android.os.Bundle r2 = X.AnonymousClass96U.A00(r5, r4)     // Catch:{ IOException -> 0x006b }
            if (r2 == 0) goto L_0x0067
            boolean r0 = r2.containsKey(r1)     // Catch:{ IOException -> 0x006b }
            if (r0 == 0) goto L_0x0067
        L_0x0066:
            r2 = 0
        L_0x0067:
            r3.A01(r2)     // Catch:{ IOException -> 0x006b }
            return
        L_0x006b:
            r0 = move-exception
            r3.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TJ8.run():void");
    }
}
