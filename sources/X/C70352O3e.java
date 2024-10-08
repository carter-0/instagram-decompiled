package X;

/* renamed from: X.O3e  reason: case insensitive filesystem */
public abstract class C70352O3e {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(java.io.File r6) {
        /*
            r2 = 0
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0037
            r1 = 2
            byte[] r5 = new byte[r1]
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r6)
            int r0 = r4.read(r5)     // Catch:{ all -> 0x0030 }
            r3 = 0
            if (r0 != r1) goto L_0x002c
            byte r0 = r5[r2]     // Catch:{ all -> 0x0030 }
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1 = 31
            r0 = 1
            if (r2 != r1) goto L_0x0028
            byte r0 = r5[r0]     // Catch:{ all -> 0x0030 }
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 139(0x8b, float:1.95E-43)
            if (r1 != r0) goto L_0x0028
            r3 = 1
        L_0x0028:
            r4.close()
            return r3
        L_0x002c:
            r4.close()
            return r2
        L_0x0030:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            X.1zE.A00(r4, r1)
            throw r0
        L_0x0037:
            java.lang.String r1 = "File does not exist: "
            java.lang.String r0 = r6.getAbsolutePath()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70352O3e.A00(java.io.File):boolean");
    }
}
