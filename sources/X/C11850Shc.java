package X;

/* renamed from: X.Shc  reason: case insensitive filesystem */
public final class C11850Shc implements C13529Tc1 {
    public final ST0 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r2 == null) goto L_0x003b;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean ARr(X.C11856Shi r8, java.io.File r9, java.lang.Object r10) {
        /*
            r7 = this;
            java.io.InputStream r10 = (java.io.InputStream) r10
            java.lang.String r6 = "StreamEncoder"
            X.ST0 r5 = r7.A00
            java.lang.Class<byte[]> r1 = byte[].class
            r0 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r4 = r5.A04(r0, r1)
            byte[] r4 = (byte[]) r4
            r3 = 0
            r2 = 0
            java.io.FileOutputStream r2 = X.JTO.A0t(r9)     // Catch:{ IOException -> 0x0028 }
        L_0x0016:
            int r1 = r10.read(r4)     // Catch:{ IOException -> 0x0028, all -> 0x0026 }
            r0 = -1
            if (r1 == r0) goto L_0x0021
            r2.write(r4, r3, r1)     // Catch:{ IOException -> 0x0028, all -> 0x0026 }
            goto L_0x0016
        L_0x0021:
            r2.close()     // Catch:{ IOException -> 0x0028, all -> 0x0026 }
            r3 = 1
            goto L_0x002e
        L_0x0026:
            r0 = move-exception
            goto L_0x0038
        L_0x0028:
            r0 = 3
            android.util.Log.isLoggable(r6, r0)     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0031
        L_0x002e:
            r2.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            r5.A05(r4)
            return r3
        L_0x0035:
            r0 = move-exception
            if (r2 == 0) goto L_0x003b
        L_0x0038:
            r2.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            r5.A05(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11850Shc.ARr(X.Shi, java.io.File, java.lang.Object):boolean");
    }

    public C11850Shc(ST0 st0) {
        this.A00 = st0;
    }
}
