package X;

/* renamed from: X.3ch  reason: invalid class name and case insensitive filesystem */
public abstract class C245333ch {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r4 > r3) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        if (r4 > r3) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        if (r2 > r6) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(float r7, long r8) {
        /*
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
            boolean r0 = java.lang.Float.isNaN(r7)
            if (r0 != 0) goto L_0x00c6
            boolean r0 = java.lang.Float.isInfinite(r7)
            if (r0 != 0) goto L_0x00c6
            boolean r5 = X.C245073cH.A06(r8)
            if (r5 != 0) goto L_0x002a
            boolean r0 = X.C245073cH.A05(r8)
            if (r0 != 0) goto L_0x002a
            int r1 = X.C245073cH.A03(r8)
            int r0 = X.C245073cH.A02(r8)
            long r0 = X.C245133cN.A00(r1, r0)
            return r0
        L_0x002a:
            int r6 = X.C245073cH.A01(r8)
            float r0 = (float) r6
            float r0 = r0 / r7
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r4 = (int) r0
            int r3 = X.C245073cH.A00(r8)
            float r0 = (float) r3
            float r0 = r0 * r7
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r2 = (int) r0
            boolean r1 = X.C245073cH.A08(r8)
            if (r1 != 0) goto L_0x00a1
            if (r5 == 0) goto L_0x00a1
            boolean r0 = X.C245073cH.A07(r8)
            if (r0 != 0) goto L_0x00a1
            boolean r0 = X.C245073cH.A05(r8)
            if (r0 == 0) goto L_0x00a1
            if (r4 <= r3) goto L_0x00c4
        L_0x0058:
            r4 = r3
        L_0x0059:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r5) goto L_0x0084
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x0061:
            if (r4 == r5) goto L_0x0077
            int r1 = X.C245073cH.A02(r8)
            if (r1 != r3) goto L_0x007c
            X.3bu r0 = X.C244883bu.A00
        L_0x006b:
            X.2HY r0 = r0.A01
            int r0 = r0.A01
            int r0 = java.lang.Math.min(r3, r0)
            int r5 = X.C229632nm.A03(r4, r1, r0)
        L_0x0077:
            long r0 = X.C245133cN.A00(r2, r5)
            return r0
        L_0x007c:
            if (r1 != 0) goto L_0x0081
            X.3bw r0 = X.C244903bw.A00
            goto L_0x006b
        L_0x0081:
            X.Gxz r0 = X.C54017Gxz.A00
            goto L_0x006b
        L_0x0084:
            int r1 = X.C245073cH.A03(r8)
            if (r1 != r6) goto L_0x0099
            X.3bu r0 = X.C244883bu.A00
        L_0x008c:
            X.2HY r0 = r0.A01
            int r0 = r0.A01
            int r0 = java.lang.Math.min(r6, r0)
            int r2 = X.C229632nm.A03(r2, r1, r0)
            goto L_0x0061
        L_0x0099:
            if (r1 != 0) goto L_0x009e
            X.3bw r0 = X.C244903bw.A00
            goto L_0x008c
        L_0x009e:
            X.Gxz r0 = X.C54017Gxz.A00
            goto L_0x008c
        L_0x00a1:
            if (r1 == 0) goto L_0x00ad
            r2 = r6
            boolean r0 = X.C245073cH.A05(r8)
            if (r0 == 0) goto L_0x0059
            if (r4 > r3) goto L_0x0058
            goto L_0x0059
        L_0x00ad:
            boolean r0 = X.C245073cH.A07(r8)
            if (r0 == 0) goto L_0x00b9
            r4 = r3
            if (r5 == 0) goto L_0x0059
            if (r2 > r6) goto L_0x00c4
            goto L_0x0059
        L_0x00b9:
            if (r5 != 0) goto L_0x00c4
            boolean r0 = X.C245073cH.A05(r8)
            if (r0 != 0) goto L_0x0058
            r4 = 0
            r2 = 0
            goto L_0x0059
        L_0x00c4:
            r2 = r6
            goto L_0x0059
        L_0x00c6:
            long r0 = X.C245143cO.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245333ch.A00(float, long):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A03(X.C245153cP r4, float r5, int r6, int r7, long r8) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            boolean r0 = X.C245073cH.A06(r8)
            if (r0 == 0) goto L_0x006d
            int r1 = X.C245073cH.A03(r8)
            int r0 = X.C245073cH.A01(r8)
            if (r6 > r0) goto L_0x006d
            if (r1 > r6) goto L_0x006d
            r0 = 32
            long r1 = r8 >>> r0
            int r0 = (int) r1
            X.3bv r0 = X.C245083cI.A00(r0)
            int r3 = r0.A03(r8)
            int r0 = (int) r8
            X.3bv r0 = X.C245083cI.A00(r0)
            int r2 = r0.A00(r8)
            int r1 = r0.A01(r8)
            X.3bx r0 = X.C244913bx.A00
            long r1 = r0.A00(r3, r6, r2, r1)
        L_0x0036:
            boolean r0 = X.C245073cH.A05(r8)
            if (r0 == 0) goto L_0x0068
            int r3 = X.C245073cH.A02(r8)
            int r0 = X.C245073cH.A00(r8)
            if (r7 > r0) goto L_0x0068
            if (r3 > r7) goto L_0x0068
            r0 = 32
            long r3 = r1 >>> r0
            int r0 = (int) r3
            X.3bv r0 = X.C245083cI.A00(r0)
            int r4 = r0.A03(r1)
            int r3 = r0.A02(r1)
            int r0 = (int) r1
            X.3bv r0 = X.C245083cI.A00(r0)
            int r1 = r0.A00(r1)
            X.3bx r0 = X.C244913bx.A00
            long r1 = r0.A00(r4, r3, r1, r7)
        L_0x0068:
            long r0 = A00(r5, r1)
            return r0
        L_0x006d:
            r1 = r8
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245333ch.A03(X.3cP, float, int, int, long):long");
    }

    public static final long A01(long j) {
        if (!C245073cH.A08(j) || !C245073cH.A07(j)) {
            return C245143cO.A00;
        }
        return C245133cN.A00(C245073cH.A01(j), C245073cH.A00(j));
    }

    public static final long A02(long j, int i, int i2) {
        boolean A06 = C245073cH.A06(j);
        if (!A06 && !C245073cH.A05(j)) {
            return C245133cN.A00(Math.max(C245073cH.A03(j), i), Math.max(C245073cH.A02(j), i2));
        }
        if (A06) {
            i = C245073cH.A01(j);
        }
        if (C245073cH.A05(j)) {
            i2 = C245073cH.A00(j);
        }
        return C245133cN.A00(i, i2);
    }
}
