package X;

/* renamed from: X.SAr  reason: case insensitive filesystem */
public abstract class C11114SAr {
    public static final int[] A00 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARNING: type inference failed for: r0v16, types: [X.TZZ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v26, types: [X.TZZ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0115, code lost:
        return new X.C11712Sf9(r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.TZZ A00(X.C13910TlA r18, boolean r19, boolean r20) {
        /*
            r12 = r18
            long r6 = r12.getLength()
            r1 = 4096(0x1000, double:2.0237E-320)
            r15 = -1
            int r0 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0013
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0013
            r1 = r6
        L_0x0013:
            int r11 = (int) r1
            r0 = 64
            X.SRd r10 = X.Pxe.A0P(r0)
            r9 = 0
            r8 = 0
            r18 = 0
        L_0x001e:
            r1 = 1
            if (r8 >= r11) goto L_0x0116
            r14 = 8
            r10.A0M(r14)
            byte[] r0 = r10.A02
            boolean r0 = r12.E2G(r0, r9, r14, r1)
            if (r0 == 0) goto L_0x0116
            long r2 = r10.A0C()
            int r13 = r10.A01()
            r4 = 1
            r1 = 16
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00f8
            byte[] r0 = r10.A02
            r12.E2F(r0, r14, r14)
            r10.A0N(r1)
            long r2 = r10.A0B()
        L_0x004a:
            long r4 = (long) r1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            X.Sf8 r0 = new X.Sf8
            r0.<init>()
            return r0
        L_0x0055:
            int r8 = r8 + r1
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r13 != r0) goto L_0x0068
            int r0 = (int) r2
            int r11 = r11 + r0
            int r0 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
            long r0 = (long) r11
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x001e
            int r11 = (int) r6
            goto L_0x001e
        L_0x0068:
            r0 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r13 == r0) goto L_0x0118
            r0 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r13 == r0) goto L_0x0118
            r0 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r13 != r0) goto L_0x0079
            r18 = 1
        L_0x0079:
            long r0 = (long) r8
            long r0 = r0 + r2
            long r0 = r0 - r4
            long r15 = (long) r11
            int r17 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r17 >= 0) goto L_0x0116
            long r2 = r2 - r4
            int r1 = (int) r2
            int r8 = r8 + r1
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r13 != r0) goto L_0x0091
            if (r1 >= r14) goto L_0x0097
            X.Sf8 r0 = new X.Sf8
            r0.<init>()
            return r0
        L_0x0091:
            if (r1 == 0) goto L_0x00d3
            r12.AAu(r1)
            goto L_0x00d3
        L_0x0097:
            X.C13910TlA.A00(r10, r12, r1)
            int r4 = r10.A01()
            int r1 = r4 >>> 8
            r0 = 3368816(0x336770, float:4.720717E-39)
            if (r1 == r0) goto L_0x00ac
            r0 = 1751476579(0x68656963, float:4.333464E24)
            if (r4 != r0) goto L_0x00ea
            if (r20 == 0) goto L_0x00ea
        L_0x00ac:
            r18 = 1
        L_0x00ae:
            r0 = 4
            r10.A0P(r0)
            int r13 = X.Pxe.A06(r10)
            int r13 = r13 / r0
            if (r18 != 0) goto L_0x00d1
            if (r13 <= 0) goto L_0x010f
            int[] r5 = new int[r13]
        L_0x00bd:
            int r4 = r10.A01()
            r5[r9] = r4
            int r1 = r4 >>> 8
            r0 = 3368816(0x336770, float:4.720717E-39)
            if (r1 == r0) goto L_0x00d1
            r0 = 1751476579(0x68656963, float:4.333464E24)
            if (r4 != r0) goto L_0x00d8
            if (r20 == 0) goto L_0x00d8
        L_0x00d1:
            r18 = 1
        L_0x00d3:
            r15 = -1
            r9 = 0
            goto L_0x001e
        L_0x00d8:
            int[] r3 = A00
            r2 = 29
            r1 = 0
        L_0x00dd:
            r0 = r3[r1]
            if (r0 == r4) goto L_0x00d1
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x00dd
            int r9 = r9 + 1
            if (r9 >= r13) goto L_0x0110
            goto L_0x00bd
        L_0x00ea:
            int[] r3 = A00
            r2 = 29
            r1 = 0
        L_0x00ef:
            r0 = r3[r1]
            if (r0 == r4) goto L_0x00ac
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x00ae
            goto L_0x00ef
        L_0x00f8:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x010b
            int r0 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x010b
            long r0 = r12.BbM()
            long r2 = r6 - r0
            r0 = 8
            long r2 = r2 + r0
        L_0x010b:
            r1 = 8
            goto L_0x004a
        L_0x010f:
            r5 = 0
        L_0x0110:
            X.Sf9 r0 = new X.Sf9
            r0.<init>(r5)
            return r0
        L_0x0116:
            r0 = 0
            goto L_0x0119
        L_0x0118:
            r0 = 1
        L_0x0119:
            if (r18 != 0) goto L_0x011e
            X.SfA r0 = X.C11713SfA.A00
            return r0
        L_0x011e:
            r1 = r19
            if (r1 == r0) goto L_0x012a
            if (r0 == 0) goto L_0x0127
            X.SfB r0 = X.C11714SfB.A00
            return r0
        L_0x0127:
            X.SfB r0 = X.C11714SfB.A01
            return r0
        L_0x012a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11114SAr.A00(X.TlA, boolean, boolean):X.TZZ");
    }
}
