package X;

/* renamed from: X.WhC  reason: case insensitive filesystem */
public final class C19883WhC implements Runnable {
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|(1:5)(3:6|1a|(4:20|21|22|(8:5d|43|44|45|(1:47)(1:49)|48|81|82)(3:56|57|58)))|83|103|101) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r1.A00 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00d7, code lost:
        if (r2 != null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00e2, code lost:
        if (r3 == null) goto L_0x00ef;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0077 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:101:0x0000, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
        L_0x0000:
            java.util.concurrent.BlockingQueue r0 = X.UHJ.A07     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.Object r5 = r0.take()     // Catch:{ InterruptedException -> 0x0000 }
            X.V3b r5 = (X.C16718V3b) r5     // Catch:{ InterruptedException -> 0x0000 }
            r3 = 0
            java.lang.String r0 = r5.A01     // Catch:{ IOException -> 0x00c7, all -> 0x00f5 }
            if (r0 != 0) goto L_0x0016
            X.1yR r1 = X.1yR.A0C     // Catch:{ IOException -> 0x00c7, all -> 0x00f5 }
            java.lang.String r0 = "Tile stringKey is null"
            r1.A03(r0)     // Catch:{ IOException -> 0x00c7, all -> 0x00f5 }
            goto L_0x00dc
        L_0x0016:
            X.Wgt r6 = X.UHJ.A09     // Catch:{ IOException -> 0x00c7, all -> 0x00f5 }
            java.lang.String r7 = r5.A01     // Catch:{ IOException -> 0x00c7, all -> 0x00f5 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x00c7, all -> 0x00f5 }
            java.io.Writer r0 = r6.A03     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00bc
            X.C19866Wgt.A05(r7)     // Catch:{ all -> 0x00c4 }
            java.util.LinkedHashMap r0 = r6.A0A     // Catch:{ all -> 0x00c4 }
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x00c4 }
            X.VjW r1 = (X.C17994VjW) r1     // Catch:{ all -> 0x00c4 }
            r4 = 0
            if (r1 != 0) goto L_0x004f
            X.VjW r1 = new X.VjW     // Catch:{ all -> 0x00c4 }
            r1.<init>(r6, r7)     // Catch:{ all -> 0x00c4 }
            r0.put(r7, r1)     // Catch:{ all -> 0x00c4 }
        L_0x0035:
            X.VhR r4 = new X.VhR     // Catch:{ all -> 0x00c4 }
            r4.<init>(r1, r6)     // Catch:{ all -> 0x00c4 }
            r1.A00 = r4     // Catch:{ all -> 0x00c4 }
            java.io.Writer r2 = r6.A03     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = "DIRTY "
            r0 = 10
            java.lang.String r0 = X.002.A0S(r1, r7, r0)     // Catch:{ all -> 0x00c4 }
            r2.write(r0)     // Catch:{ all -> 0x00c4 }
            java.io.Writer r0 = r6.A03     // Catch:{ all -> 0x00c4 }
            r0.flush()     // Catch:{ all -> 0x00c4 }
            goto L_0x0053
        L_0x004f:
            X.VhR r0 = r1.A00     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x0035
        L_0x0053:
            monitor-exit(r6)     // Catch:{ IOException -> 0x00c7, all -> 0x00f5 }
            if (r4 == 0) goto L_0x00dc
            r7 = 0
            X.Wgt r6 = r4.A04     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
            int r2 = r6.A06     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
            if (r7 >= r2) goto L_0x00af
            monitor-enter(r6)     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
            X.VjW r8 = r4.A02     // Catch:{ all -> 0x00ac }
            X.VhR r0 = r8.A00     // Catch:{ all -> 0x00ac }
            if (r0 != r4) goto L_0x00a6
            boolean r0 = r8.A01     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x006d
            boolean[] r1 = r4.A03     // Catch:{ all -> 0x00ac }
            r0 = 1
            r1[r7] = r0     // Catch:{ all -> 0x00ac }
        L_0x006d:
            java.io.File r1 = r8.A01()     // Catch:{ all -> 0x00ac }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0077 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0077 }
            goto L_0x0081
        L_0x0077:
            java.io.File r0 = r6.A07     // Catch:{ all -> 0x00ac }
            r0.mkdirs()     // Catch:{ all -> 0x00ac }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0087 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0087 }
        L_0x0081:
            X.UvV r2 = new X.UvV     // Catch:{ all -> 0x00ac }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x00ac }
            goto L_0x0089
        L_0x0087:
            java.io.OutputStream r2 = X.C19866Wgt.A0E     // Catch:{ all -> 0x00ac }
        L_0x0089:
            monitor-exit(r6)     // Catch:{ all -> 0x00ac }
            r3 = r2
            byte[] r1 = r5.A02     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
            int r0 = r5.A00     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
            r2.write(r1, r7, r0)     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
            boolean r0 = r4.A01     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
            r1 = 1
            if (r0 == 0) goto L_0x00a2
            X.C19866Wgt.A00(r4, r6, r7)     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
            java.lang.String r0 = r8.A02     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
            r6.A07(r0)     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
        L_0x009f:
            r4.A00 = r1     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
            goto L_0x00d9
        L_0x00a2:
            X.C19866Wgt.A00(r4, r6, r1)     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
            goto L_0x009f
        L_0x00a6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ac }
            r0.<init>()     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00ac }
            goto L_0x00b7
        L_0x00af:
            java.lang.String r1 = "Expected index "
            java.lang.String r0 = " to be greater than 0 and less than the maximum value count of "
            java.lang.IllegalArgumentException r0 = X.C51971G9r.A0l(r1, r0, r7, r2)     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
        L_0x00b7:
            throw r0     // Catch:{ IOException -> 0x00b8, all -> 0x00e5 }
        L_0x00b8:
            r1 = move-exception
            r2 = r3
            r3 = r4
            goto L_0x00c9
        L_0x00bc:
            java.lang.String r1 = "cache is closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c4 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c4 }
            throw r0     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x00c7, all -> 0x00f5 }
            throw r0     // Catch:{ IOException -> 0x00c7, all -> 0x00f5 }
        L_0x00c7:
            r1 = move-exception
            r2 = r3
        L_0x00c9:
            X.1yR r0 = X.1yR.A0E     // Catch:{ all -> 0x00e1 }
            r0.A04(r1)     // Catch:{ all -> 0x00e1 }
            if (r3 == 0) goto L_0x00d7
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x00d7
            r3.A00()     // Catch:{ IOException -> 0x00d7 }
        L_0x00d7:
            if (r2 == 0) goto L_0x00dc
        L_0x00d9:
            r2.close()     // Catch:{ IOException -> 0x00dc }
        L_0x00dc:
            X.C18973WFa.A01(r5)
            goto L_0x0000
        L_0x00e1:
            r1 = move-exception
            if (r3 == 0) goto L_0x00ef
            goto L_0x00e8
        L_0x00e5:
            r1 = move-exception
            r2 = r3
            r3 = r4
        L_0x00e8:
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x00ef
            r3.A00()     // Catch:{ IOException -> 0x00ef }
        L_0x00ef:
            if (r2 == 0) goto L_0x00f6
            r2.close()     // Catch:{ IOException -> 0x00f6 }
            throw r1
        L_0x00f5:
            r1 = move-exception
        L_0x00f6:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19883WhC.run():void");
    }
}
