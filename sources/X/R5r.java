package X;

public class R5r extends R5s {
    public final byte[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r7 = (X.TAM) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r9 == r8) goto L_0x006d
            boolean r1 = r9 instanceof X.TAM
            r4 = 0
            if (r1 == 0) goto L_0x0025
            int r3 = r8.A00()
            r7 = r9
            X.TAM r7 = (X.TAM) r7
            int r2 = r7.A00()
            if (r3 != r2) goto L_0x0025
            if (r3 == 0) goto L_0x006d
            boolean r0 = r9 instanceof X.R5r
            if (r0 == 0) goto L_0x0069
            int r1 = r8.A00
            int r0 = r7.A00
            if (r1 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0026
            if (r1 == r0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            if (r3 > r2) goto L_0x0064
            boolean r0 = r7 instanceof X.R5r
            if (r0 == 0) goto L_0x0057
            X.R5r r7 = (X.R5r) r7
            byte[] r6 = r8.A00
            byte[] r5 = r7.A00
            r1 = r8
            boolean r0 = r8 instanceof X.R5q
            if (r0 == 0) goto L_0x003b
            X.R5q r1 = (X.R5q) r1
            int r4 = r1.A01
        L_0x003b:
            int r3 = r3 + r4
            boolean r0 = r7 instanceof X.R5q
            if (r0 == 0) goto L_0x0053
            X.R5q r7 = (X.R5q) r7
            int r2 = r7.A01
        L_0x0044:
            if (r4 >= r3) goto L_0x0055
            byte r1 = r6[r4]
            byte r0 = r5[r2]
            if (r1 == r0) goto L_0x004e
            r0 = 0
            return r0
        L_0x004e:
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L_0x0044
        L_0x0053:
            r2 = 0
            goto L_0x0044
        L_0x0055:
            r0 = 1
            return r0
        L_0x0057:
            X.TAM r1 = r7.A01(r3)
            X.TAM r0 = r8.A01(r3)
            boolean r0 = r1.equals(r0)
            return r0
        L_0x0064:
            java.lang.IllegalArgumentException r0 = X.Pxk.A0F(r3)
            throw r0
        L_0x0069:
            boolean r0 = r9.equals(r8)
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R5r.equals(java.lang.Object):boolean");
    }

    public R5r(byte[] bArr) {
        bArr.getClass();
        this.A00 = bArr;
    }
}
