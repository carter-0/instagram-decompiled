package X;

/* renamed from: X.SBs  reason: case insensitive filesystem */
public abstract class C11137SBs {
    public static final int[] A00 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bf, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e6, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.AnonymousClass4Y7 r22, boolean r23) {
        /*
            r12 = r22
            X.4Y6 r12 = (X.AnonymousClass4Y6) r12
            long r7 = r12.A04
            r1 = 4096(0x1000, double:2.0237E-320)
            r20 = -1
            int r0 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0013
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0013
            r1 = r7
        L_0x0013:
            int r11 = (int) r1
            r0 = 64
            X.4XV r10 = new X.4XV
            r10.<init>((int) r0)
            r9 = 0
            r6 = 0
            r19 = 0
        L_0x001f:
            if (r6 >= r11) goto L_0x00e6
            r13 = 8
            r10.A0E(r13)
            byte[] r2 = r10.A02
            r18 = 1
            r0 = r18
            boolean r0 = r12.A02(r13, r0)
            if (r0 == 0) goto L_0x00e6
            byte[] r1 = r12.A03
            int r0 = r12.A01
            int r0 = r0 - r13
            java.lang.System.arraycopy(r1, r0, r2, r9, r13)
            long r2 = r10.A07()
            int r14 = r10.A01()
            r4 = 1
            r1 = 16
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00cd
            byte[] r2 = r10.A02
            r0 = r22
            r0.E2F(r2, r13, r13)
            r10.A0F(r1)
            long r2 = r10.A06()
        L_0x0058:
            long r4 = (long) r1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00f0
            int r6 = r6 + r1
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r14 != r0) goto L_0x0070
            int r0 = (int) r2
            int r11 = r11 + r0
            int r0 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            long r0 = (long) r11
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x001f
            int r11 = (int) r7
            goto L_0x001f
        L_0x0070:
            r0 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r14 == r0) goto L_0x00e8
            r0 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r14 == r0) goto L_0x00e8
            long r0 = (long) r6
            long r0 = r0 + r2
            long r0 = r0 - r4
            long r15 = (long) r11
            int r17 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r17 >= 0) goto L_0x00e6
            long r2 = r2 - r4
            int r5 = (int) r2
            int r6 = r6 + r5
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r14 != r0) goto L_0x00c6
            if (r5 < r13) goto L_0x00f0
            r4 = 0
            r10.A0E(r5)
            byte[] r1 = r10.A02
            r0 = r22
            r0.E2F(r1, r9, r5)
            int r5 = r5 / 4
        L_0x0099:
            if (r4 >= r5) goto L_0x00c3
            r0 = r18
            if (r4 != r0) goto L_0x00a6
            r0 = 4
            r10.A0H(r0)
        L_0x00a3:
            int r4 = r4 + 1
            goto L_0x0099
        L_0x00a6:
            int r13 = r10.A01()
            int r1 = r13 >>> 8
            r0 = 3368816(0x336770, float:4.720717E-39)
            if (r1 == r0) goto L_0x00bf
            int[] r3 = A00
            r2 = 29
            r1 = 0
        L_0x00b6:
            r0 = r3[r1]
            if (r0 == r13) goto L_0x00bf
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x00a3
            goto L_0x00b6
        L_0x00bf:
            r19 = 1
            goto L_0x001f
        L_0x00c3:
            if (r19 != 0) goto L_0x001f
            return r9
        L_0x00c6:
            if (r5 == 0) goto L_0x001f
            r12.A02(r5, r9)
            goto L_0x001f
        L_0x00cd:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00e2
            int r0 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x00e2
            long r0 = r12.A02
            int r2 = r12.A01
            long r2 = (long) r2
            long r0 = r0 + r2
            long r4 = r7 - r0
            r2 = 8
            long r2 = r2 + r4
        L_0x00e2:
            r1 = 8
            goto L_0x0058
        L_0x00e6:
            r0 = 0
            goto L_0x00e9
        L_0x00e8:
            r0 = 1
        L_0x00e9:
            if (r19 == 0) goto L_0x00f0
            r1 = r23
            if (r1 != r0) goto L_0x00f0
            r9 = 1
        L_0x00f0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11137SBs.A00(X.4Y7, boolean):boolean");
    }
}
