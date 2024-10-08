package X;

import android.os.ConditionVariable;

public final class TR8 extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C12538Swo A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TR8(ConditionVariable conditionVariable, C12538Swo swo) {
        super("ExoPlayer:SimpleCacheInit");
        this.A01 = swo;
        this.A00 = conditionVariable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: int} */
    /* JADX WARNING: type inference failed for: r1v13, types: [X.5HZ] */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r7 != -1) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7 = new java.security.SecureRandom().nextLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r7 != Long.MIN_VALUE) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        r0 = java.lang.Math.abs(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        r2 = X.Pxf.A0U(java.lang.Long.toString(r0, 16), ".uid", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r2.createNewFile() != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        throw X.JTO.A0u(X.AnonymousClass7TG.A0m(r2, "Failed to create UID file: ", X.AnonymousClass7TE.A1A()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c3, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c4, code lost:
        r0 = X.AnonymousClass7TG.A0m(r5, "Failed to create cache UID: ", X.AnonymousClass7TE.A1A());
        X.2AG.A05("SimpleCache", r0, r2);
        r1 = new java.io.IOException(r0, r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            X.Swo r3 = r9.A01
            monitor-enter(r3)
            android.os.ConditionVariable r0 = r9.A00     // Catch:{ all -> 0x0104 }
            r0.open()     // Catch:{ all -> 0x0104 }
            java.io.File r5 = r3.A05     // Catch:{ all -> 0x0104 }
            boolean r0 = r5.exists()     // Catch:{ all -> 0x0104 }
            if (r0 != 0) goto L_0x0013
            X.C12538Swo.A04(r5)     // Catch:{ 5HZ -> 0x00ff }
        L_0x0013:
            java.io.File[] r6 = r5.listFiles()     // Catch:{ all -> 0x0104 }
            java.lang.String r4 = "SimpleCache"
            if (r6 != 0) goto L_0x0031
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "Failed to list cache directory files: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r1)     // Catch:{ all -> 0x0104 }
            X.2AG.A03(r4, r0)     // Catch:{ all -> 0x0104 }
            X.5HZ r1 = new X.5HZ     // Catch:{ all -> 0x0104 }
            r1.<init>(r0)     // Catch:{ all -> 0x0104 }
        L_0x002d:
            r3.A00 = r1     // Catch:{ all -> 0x0104 }
            goto L_0x0102
        L_0x0031:
            int r8 = r6.length     // Catch:{ all -> 0x0104 }
            r7 = 0
        L_0x0033:
            if (r7 >= r8) goto L_0x006d
            r2 = r6[r7]     // Catch:{ all -> 0x0104 }
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = ".uid"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x0064
            r0 = 46
            int r0 = r1.indexOf(r0)     // Catch:{ NumberFormatException -> 0x0054 }
            java.lang.String r1 = X.Pxe.A0x(r1, r0)     // Catch:{ NumberFormatException -> 0x0054 }
            r0 = 16
            long r7 = java.lang.Long.parseLong(r1, r0)     // Catch:{ NumberFormatException -> 0x0054 }
            goto L_0x0067
        L_0x0054:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "Malformed UID file: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)     // Catch:{ all -> 0x0104 }
            X.2AG.A03(r4, r0)     // Catch:{ all -> 0x0104 }
            r2.delete()     // Catch:{ all -> 0x0104 }
        L_0x0064:
            int r7 = r7 + 1
            goto L_0x0033
        L_0x0067:
            r1 = -1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a4
        L_0x006d:
            java.security.SecureRandom r0 = new java.security.SecureRandom     // Catch:{ IOException -> 0x00c3 }
            r0.<init>()     // Catch:{ IOException -> 0x00c3 }
            long r7 = r0.nextLong()     // Catch:{ IOException -> 0x00c3 }
            r1 = -9223372036854775808
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007f
            r0 = 0
            goto L_0x0083
        L_0x007f:
            long r0 = java.lang.Math.abs(r7)     // Catch:{ IOException -> 0x00c3 }
        L_0x0083:
            r2 = 16
            java.lang.String r1 = java.lang.Long.toString(r0, r2)     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r0 = ".uid"
            java.io.File r2 = X.Pxf.A0U(r1, r0, r5)     // Catch:{ IOException -> 0x00c3 }
            boolean r0 = r2.createNewFile()     // Catch:{ IOException -> 0x00c3 }
            if (r0 != 0) goto L_0x00a4
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r0 = "Failed to create UID file: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)     // Catch:{ IOException -> 0x00c3 }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException -> 0x00c3 }
            throw r0     // Catch:{ IOException -> 0x00c3 }
        L_0x00a4:
            X.SJa r2 = r3.A04     // Catch:{ IOException -> 0x00ae }
            r2.A02()     // Catch:{ IOException -> 0x00ae }
            r0 = 1
            X.C12538Swo.A02(r3, r5, r6, r0)     // Catch:{ IOException -> 0x00ae }
            goto L_0x00d8
        L_0x00ae:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "Failed to initialize cache indices: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r1)     // Catch:{ all -> 0x0104 }
            X.2AG.A05(r4, r0, r2)     // Catch:{ all -> 0x0104 }
            X.5HZ r1 = new X.5HZ     // Catch:{ all -> 0x0104 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x002d
        L_0x00c3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "Failed to create cache UID: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r1)     // Catch:{ all -> 0x0104 }
            X.2AG.A05(r4, r0, r2)     // Catch:{ all -> 0x0104 }
            X.5HZ r1 = new X.5HZ     // Catch:{ all -> 0x0104 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x002d
        L_0x00d8:
            java.util.HashMap r0 = r2.A03     // Catch:{ all -> 0x0104 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0104 }
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.A03(r0)     // Catch:{ all -> 0x0104 }
            X.3kO r1 = r0.iterator()     // Catch:{ all -> 0x0104 }
        L_0x00e6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)     // Catch:{ all -> 0x0104 }
            r2.A04(r0)     // Catch:{ all -> 0x0104 }
            goto L_0x00e6
        L_0x00f4:
            r2.A03()     // Catch:{ IOException -> 0x00f8 }
            goto L_0x0102
        L_0x00f8:
            r1 = move-exception
            java.lang.String r0 = "Storing index file failed"
            X.2AG.A05(r4, r0, r1)     // Catch:{ all -> 0x0104 }
            goto L_0x0102
        L_0x00ff:
            r0 = move-exception
            r3.A00 = r0     // Catch:{ all -> 0x0104 }
        L_0x0102:
            monitor-exit(r3)     // Catch:{ all -> 0x0104 }
            return
        L_0x0104:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0104 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TR8.run():void");
    }
}
