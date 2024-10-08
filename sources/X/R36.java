package X;

public class R36 extends R37 {
    public final byte[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r7 = (X.TAP) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r9 == r8) goto L_0x0062
            boolean r1 = r9 instanceof X.TAP
            r4 = 0
            if (r1 == 0) goto L_0x0025
            int r3 = r8.A02()
            r7 = r9
            X.TAP r7 = (X.TAP) r7
            int r2 = r7.A02()
            if (r3 != r2) goto L_0x0025
            if (r3 == 0) goto L_0x0062
            boolean r0 = r9 instanceof X.R36
            if (r0 == 0) goto L_0x005e
            int r1 = r8.A00
            int r0 = r7.A00
            if (r1 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0026
            if (r1 == r0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            if (r3 > r2) goto L_0x0059
            boolean r0 = r7 instanceof X.R36
            if (r0 == 0) goto L_0x004c
            X.R36 r7 = (X.R36) r7
            byte[] r6 = r8.A00
            byte[] r5 = r7.A00
            int r4 = r8.A06()
            int r3 = r3 + r4
            int r2 = r7.A06()
        L_0x003b:
            if (r4 >= r3) goto L_0x004a
            byte r1 = r6[r4]
            byte r0 = r5[r2]
            if (r1 == r0) goto L_0x0045
            r0 = 0
            return r0
        L_0x0045:
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L_0x003b
        L_0x004a:
            r0 = 1
            return r0
        L_0x004c:
            X.TAP r1 = r7.A03(r3)
            X.TAP r0 = r8.A03(r3)
            boolean r0 = r1.equals(r0)
            return r0
        L_0x0059:
            java.lang.IllegalArgumentException r0 = X.Pxk.A0F(r3)
            throw r0
        L_0x005e:
            boolean r0 = r9.equals(r8)
        L_0x0062:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R36.equals(java.lang.Object):boolean");
    }

    public final int A06() {
        if (this instanceof R35) {
            return ((R35) this).A01;
        }
        return 0;
    }

    public R36(byte[] bArr) {
        bArr.getClass();
        this.A00 = bArr;
    }
}
