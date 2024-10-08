package X;

public final class S99 {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        if (r10.equals("extend") != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r9.equals("extend") != false) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final double A00(java.lang.String r9, java.lang.String r10, double r11, double r13, double r15, double r17, double r19) {
        /*
            java.lang.String r7 = "clamp"
            java.lang.String r6 = "identity"
            java.lang.String r5 = "extend"
            r4 = 94742715(0x5a5a8bb, float:1.5578507E-35)
            r3 = -135761730(0xfffffffff7e870be, float:-9.428903E33)
            r2 = -1289044198(0xffffffffb32abf1a, float:-3.9755015E-8)
            java.lang.String r1 = "Invalid extrapolation type "
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0059
            if (r9 == 0) goto L_0x0081
            int r0 = r9.hashCode()
            if (r0 == r2) goto L_0x0053
            if (r0 == r3) goto L_0x007a
            if (r0 != r4) goto L_0x0081
            boolean r0 = r9.equals(r7)
            if (r0 == 0) goto L_0x0081
            r8 = r13
        L_0x0028:
            int r0 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            if (r10 == 0) goto L_0x006e
            int r0 = r10.hashCode()
            if (r0 == r2) goto L_0x004c
            if (r0 == r3) goto L_0x0067
            if (r0 != r4) goto L_0x006e
            boolean r0 = r10.equals(r7)
            if (r0 == 0) goto L_0x006e
            r8 = r15
        L_0x003f:
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x005b
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            return r19
        L_0x004c:
            boolean r0 = r10.equals(r5)
            if (r0 == 0) goto L_0x006e
            goto L_0x003f
        L_0x0053:
            boolean r0 = r9.equals(r5)
            if (r0 == 0) goto L_0x0081
        L_0x0059:
            r8 = r11
            goto L_0x0028
        L_0x005b:
            double r19 = r19 - r17
            double r8 = r8 - r13
            double r19 = r19 * r8
            double r15 = r15 - r13
            double r19 = r19 / r15
            double r17 = r17 + r19
            return r17
        L_0x0066:
            return r17
        L_0x0067:
            boolean r0 = r10.equals(r6)
            if (r0 == 0) goto L_0x006e
            return r8
        L_0x006e:
            java.lang.String r0 = "for right extrapolation"
            java.lang.String r1 = X.002.A0g(r1, r10, r0)
            X.QZ8 r0 = new X.QZ8
            r0.<init>(r1)
            throw r0
        L_0x007a:
            boolean r0 = r9.equals(r6)
            if (r0 == 0) goto L_0x0081
            return r11
        L_0x0081:
            java.lang.String r0 = "for left extrapolation"
            java.lang.String r1 = X.002.A0g(r1, r9, r0)
            X.QZ8 r0 = new X.QZ8
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S99.A00(java.lang.String, java.lang.String, double, double, double, double, double):double");
    }
}
