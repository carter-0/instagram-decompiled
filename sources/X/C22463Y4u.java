package X;

/* renamed from: X.Y4u  reason: case insensitive filesystem */
public final class C22463Y4u implements C13970TmY {
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public short A04;
    public final YCT A05;

    public final void close() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0094, code lost:
        return -1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long E6C(X.C13198TPe r12, long r13) {
        /*
            r11 = this;
        L_0x0000:
            int r0 = r11.A01
            r9 = -1
            if (r0 != 0) goto L_0x007d
            X.YCT r8 = r11.A05
            short r0 = r11.A04
            long r0 = (long) r0
            r8.Evi(r0)
            r6 = 0
            r11.A04 = r6
            byte r0 = r11.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x0094
            int r5 = r11.A03
            int r0 = X.YCT.A00(r8)
            int r1 = r0 << 16
            int r0 = X.YCT.A00(r8)
            int r0 = r0 << 8
            r1 = r1 | r0
            int r0 = X.YCT.A00(r8)
            r0 = r0 | r1
            r11.A01 = r0
            r11.A02 = r0
            int r0 = X.YCT.A00(r8)
            byte r4 = (byte) r0
            int r0 = X.YCT.A00(r8)
            byte r0 = (byte) r0
            r11.A00 = r0
            java.util.logging.Logger r7 = X.Y1L.A03
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            boolean r0 = r7.isLoggable(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0053
            int r2 = r11.A03
            int r1 = r11.A02
            byte r0 = r11.A00
            java.lang.String r0 = X.C21995Xq2.A00(r4, r0, r2, r1, r3)
            r7.fine(r0)
        L_0x0053:
            int r1 = r8.readInt()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r0
            r11.A03 = r1
            r0 = 9
            if (r4 != r0) goto L_0x0072
            if (r1 == r5) goto L_0x0000
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r1 = "TYPE_CONTINUATION streamId changed"
        L_0x0067:
            java.lang.String[] r0 = X.C21995Xq2.A01
            X.Xt4 r0 = X.SUS.A04
            java.util.Locale r0 = java.util.Locale.US
            java.io.IOException r0 = X.C21053XCe.A0V(r1, r0, r2)
            throw r0
        L_0x0072:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "%s != TYPE_CONTINUATION"
            goto L_0x0067
        L_0x007d:
            X.YCT r2 = r11.A05
            long r0 = (long) r0
            long r0 = java.lang.Math.min(r13, r0)
            long r3 = r2.E6C(r12, r0)
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0094
            int r0 = r11.A01
            long r1 = (long) r0
            long r1 = r1 - r3
            int r0 = (int) r1
            r11.A01 = r0
            return r3
        L_0x0094:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22463Y4u.E6C(X.TPe, long):long");
    }

    public final C11291SJy Ezn() {
        return this.A05.Ezn();
    }

    public C22463Y4u(YCT yct) {
        this.A05 = yct;
    }
}
