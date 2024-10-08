package X;

public final class S4S {
    public final int A00;
    public final String A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r1.equals(r0) == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0036
            r2 = 0
            if (r5 == 0) goto L_0x0024
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0024
            X.S4S r5 = (X.S4S) r5
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0024
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == 0) goto L_0x0025
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0028
        L_0x0024:
            return r2
        L_0x0025:
            if (r0 == 0) goto L_0x0028
            return r2
        L_0x0028:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 == 0) goto L_0x0033
            boolean r2 = r1.equals(r0)
            return r2
        L_0x0033:
            if (r0 == 0) goto L_0x0036
            r3 = 0
        L_0x0036:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S4S.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((((this.A00 * 31) + JTR.A0G(this.A01)) * 31) + Pxh.A0B(this.A02)) * 31;
    }

    public S4S(String str, String str2, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }
}
