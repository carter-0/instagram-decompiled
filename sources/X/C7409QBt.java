package X;

/* renamed from: X.QBt  reason: case insensitive filesystem */
public final class C7409QBt extends C284205Lj {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r13 < 2048) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[LOOP:1: B:13:0x0036->B:19:0x0048, LOOP_START, PHI: r1 r6 r14 
      PHI: (r1v3 char) = (r1v2 char), (r1v15 char) binds: [B:10:0x0032, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v2 long) = (r6v1 long), (r6v15 long) binds: [B:10:0x0032, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r14v2 int) = (r14v1 int), (r14v7 int) binds: [B:10:0x0032, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(java.lang.CharSequence r21, byte[] r22, int r23, int r24) {
        /*
            r20 = this;
            r3 = r23
            long r6 = (long) r3
            r2 = r24
            long r4 = (long) r2
            long r4 = r4 + r6
            r10 = r21
            int r8 = r10.length()
            java.lang.String r11 = " at index "
            java.lang.String r19 = "Failed writing "
            if (r8 > r2) goto L_0x011a
            r9 = r22
            int r0 = r9.length
            int r0 = r0 - r24
            if (r0 < r3) goto L_0x011a
            r14 = 0
        L_0x001b:
            r1 = 128(0x80, float:1.794E-43)
            r17 = 1
            if (r14 >= r8) goto L_0x0032
            char r0 = r10.charAt(r14)
            if (r0 >= r1) goto L_0x0032
            long r17 = r17 + r6
            byte r0 = (byte) r0
            X.C284115La.A0B(r9, r0, r6)
            int r14 = r14 + 1
            r6 = r17
            goto L_0x001b
        L_0x0032:
            if (r14 != r8) goto L_0x0036
        L_0x0034:
            int r0 = (int) r6
            return r0
        L_0x0036:
            if (r14 >= r8) goto L_0x0034
            char r13 = r10.charAt(r14)
            if (r13 >= r1) goto L_0x004e
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            long r15 = r6 + r17
            byte r0 = (byte) r13
            X.C284115La.A0B(r9, r0, r6)
        L_0x0048:
            int r14 = r14 + 1
            r1 = 128(0x80, float:1.794E-43)
            r6 = r15
            goto L_0x0036
        L_0x004e:
            r0 = 2048(0x800, float:2.87E-42)
            if (r13 >= r0) goto L_0x0070
        L_0x0052:
            r15 = 2
            long r1 = r4 - r15
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0070
            long r2 = r6 + r17
            int r0 = r13 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            byte r0 = (byte) r0
            X.C284115La.A0B(r9, r0, r6)
            long r15 = r2 + r17
            r1 = r13 & 63
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 | r0
        L_0x006b:
            byte r0 = (byte) r1
            X.C284115La.A0B(r9, r0, r2)
            goto L_0x0048
        L_0x0070:
            r12 = 57343(0xdfff, float:8.0355E-41)
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r3) goto L_0x007a
            if (r12 >= r13) goto L_0x009f
        L_0x007a:
            r15 = 3
            long r1 = r4 - r15
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x009f
            long r0 = r6 + r17
            int r2 = r13 >>> 12
            r2 = r2 | 480(0x1e0, float:6.73E-43)
            byte r2 = (byte) r2
            X.C284115La.A0B(r9, r2, r6)
            long r2 = r0 + r17
            int r6 = r13 >>> 6
            r6 = r6 & 63
            r7 = 128(0x80, float:1.794E-43)
            r6 = r6 | r7
            byte r6 = (byte) r6
            X.C284115La.A0B(r9, r6, r0)
            long r15 = r2 + r17
            r1 = r13 & 63
            r1 = r1 | r7
            goto L_0x006b
        L_0x009f:
            r15 = 4
            long r1 = r4 - r15
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00f1
            int r12 = r14 + 1
            if (r12 == r8) goto L_0x00e9
            char r1 = r10.charAt(r12)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r1)
            if (r0 == 0) goto L_0x00e8
            int r13 = java.lang.Character.toCodePoint(r13, r1)
            long r0 = r6 + r17
            int r2 = r13 >>> 18
            r2 = r2 | 240(0xf0, float:3.36E-43)
            byte r2 = (byte) r2
            X.C284115La.A0B(r9, r2, r6)
            long r2 = r0 + r17
            int r6 = r13 >>> 12
            r6 = r6 & 63
            r7 = 128(0x80, float:1.794E-43)
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            X.C284115La.A0B(r9, r6, r0)
            long r0 = r2 + r17
            int r6 = r13 >>> 6
            r6 = r6 & 63
            r6 = r6 | r7
            byte r6 = (byte) r6
            X.C284115La.A0B(r9, r6, r2)
            long r15 = r0 + r17
            r2 = r13 & 63
            r2 = r2 | r7
            byte r2 = (byte) r2
            X.C284115La.A0B(r9, r2, r0)
            r14 = r12
            goto L_0x0048
        L_0x00e8:
            r14 = r12
        L_0x00e9:
            int r1 = r14 + -1
            X.RKp r0 = new X.RKp
            r0.<init>(r1, r8)
            throw r0
        L_0x00f1:
            if (r3 > r13) goto L_0x0109
            if (r13 > r12) goto L_0x0109
            int r0 = r14 + 1
            if (r0 == r8) goto L_0x0103
            char r0 = r10.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L_0x0109
        L_0x0103:
            X.RKp r0 = new X.RKp
            r0.<init>(r14, r8)
            throw r0
        L_0x0109:
            java.lang.StringBuilder r0 = X.AnonymousClass7TF.A0n(r19)
            r0.append(r13)
            java.lang.String r1 = X.Pxg.A0u(r11, r0, r6)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x011a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r19)
            int r0 = r8 + -1
            char r0 = r10.charAt(r0)
            r1.append(r0)
            r1.append(r11)
            int r3 = r23 + r24
            java.lang.String r1 = X.Pxe.A0z(r1, r3)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7409QBt.A00(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047 A[LOOP:0: B:5:0x0019->B:21:0x0047, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(byte[] r15, int r16, int r17, int r18) {
        /*
            r14 = this;
            r4 = r17
            r3 = r18
            r2 = r17 | r18
            int r1 = r15.length
            int r0 = r1 - r18
            r2 = r2 | r0
            if (r2 < 0) goto L_0x00da
            long r5 = (long) r4
            long r0 = (long) r3
            long r0 = r0 - r5
            int r7 = (int) r0
            r3 = r5
            r8 = 0
            r0 = 16
            if (r7 >= r0) goto L_0x0089
        L_0x0016:
            int r7 = r7 - r8
            long r0 = (long) r8
            long r5 = r5 + r0
        L_0x0019:
            r9 = 0
        L_0x001a:
            r12 = 1
            if (r7 <= 0) goto L_0x002a
            long r0 = r5 + r12
            byte r9 = X.C284115La.A02(r15, r5)
            if (r9 < 0) goto L_0x002e
            int r7 = r7 + -1
            r5 = r0
            goto L_0x001a
        L_0x002a:
            if (r7 != 0) goto L_0x002f
            r9 = 0
        L_0x002d:
            return r9
        L_0x002e:
            r5 = r0
        L_0x002f:
            int r1 = r7 + -1
            r11 = -32
            r8 = -65
            r10 = -1
            if (r9 >= r11) goto L_0x0049
            if (r1 == 0) goto L_0x002d
            int r7 = r1 + -1
            r0 = -62
            if (r9 < r0) goto L_0x00bc
        L_0x0040:
            long r12 = r12 + r5
            byte r0 = X.C284115La.A02(r15, r5)
        L_0x0045:
            if (r0 > r8) goto L_0x00bc
            r5 = r12
            goto L_0x0019
        L_0x0049:
            r0 = -16
            if (r9 >= r0) goto L_0x006d
            r0 = 2
            if (r1 < r0) goto L_0x009a
            int r7 = r1 + -2
            long r3 = r5 + r12
            byte r2 = X.C284115La.A02(r15, r5)
            if (r2 > r8) goto L_0x00bc
            r1 = -96
            if (r9 != r11) goto L_0x0066
            if (r2 < r1) goto L_0x00bc
        L_0x0060:
            long r12 = r12 + r3
            byte r0 = X.C284115La.A02(r15, r3)
            goto L_0x0045
        L_0x0066:
            r0 = -19
            if (r9 != r0) goto L_0x0060
            if (r2 >= r1) goto L_0x00bc
            goto L_0x0060
        L_0x006d:
            r0 = 3
            if (r1 < r0) goto L_0x009a
            int r7 = r1 + -3
            long r1 = r5 + r12
            byte r0 = X.C284115La.A02(r15, r5)
            if (r0 > r8) goto L_0x00bc
            int r0 = X.Pxi.A04(r9, r0)
            if (r0 != 0) goto L_0x00bc
            long r5 = r1 + r12
            byte r0 = X.C284115La.A02(r15, r1)
            if (r0 > r8) goto L_0x00bc
            goto L_0x0040
        L_0x0089:
            r1 = 1
            long r1 = r1 + r3
            byte r0 = X.C284115La.A02(r15, r3)
            if (r0 < 0) goto L_0x0016
            int r8 = r8 + 1
            r3 = r1
            if (r8 < r7) goto L_0x0089
            r8 = r7
            goto L_0x0016
        L_0x009a:
            if (r1 == 0) goto L_0x00cc
            r0 = 1
            if (r1 == r0) goto L_0x00bd
            r0 = 2
            if (r1 != r0) goto L_0x00d5
            byte r2 = X.C284115La.A02(r15, r5)
            long r5 = r5 + r12
            byte r1 = X.C284115La.A02(r15, r5)
            X.5Lj r0 = X.C284185Lh.A00
            r0 = -12
            if (r9 > r0) goto L_0x00d3
            if (r2 > r8) goto L_0x00d3
            if (r1 > r8) goto L_0x00d3
            int r0 = r2 << 8
            r9 = r9 ^ r0
            int r0 = r1 << 16
        L_0x00ba:
            r10 = r9 ^ r0
        L_0x00bc:
            return r10
        L_0x00bd:
            byte r1 = X.C284115La.A02(r15, r5)
            X.5Lj r0 = X.C284185Lh.A00
            r0 = -12
            if (r9 > r0) goto L_0x00d3
            if (r1 > r8) goto L_0x00d3
            int r0 = r1 << 8
            goto L_0x00ba
        L_0x00cc:
            r10 = r9
            X.5Lj r0 = X.C284185Lh.A00
            r0 = -12
            if (r9 <= r0) goto L_0x00bc
        L_0x00d3:
            r10 = -1
            return r10
        L_0x00d5:
            java.lang.AssertionError r0 = X.Pxe.A0d()
            throw r0
        L_0x00da:
            java.lang.Object[] r1 = X.Pxh.A1a(r1, r4, r3)
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.ArrayIndexOutOfBoundsException r0 = X.Pxf.A0V(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7409QBt.A01(byte[], int, int, int):int");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 148 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r13 = r13 + 1;
        r8[r5] = (char) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r6 >= r2) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = X.C284115La.A02(r15, (long) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r0 < 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        r6 = r6 + 1;
        r8[r13] = (char) r0;
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r6 >= r2) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r3 = r6 + 1;
        r1 = X.C284115La.A02(r15, (long) r6);
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        if (r9 < -62) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r1 > -65) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        X.Pxi.A0s(r9, r1, r8, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        if (r6 >= (r2 - 2)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        r3 = r6 + 1;
        r10 = X.C284115La.A02(r15, (long) r6);
        r5 = r3 + 1;
        r11 = X.C284115La.A02(r15, (long) r3);
        r3 = r5 + 1;
        X.C11050S7v.A00(r8, r9, r10, r11, X.C284115La.A02(r15, (long) r5), r13);
        r13 = (r13 + 1) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a9, code lost:
        throw new X.C289845eJ("Protocol message had invalid UTF-8.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A02(byte[] r15, int r16, int r17) {
        /*
            r14 = this;
            r5 = r17
            r3 = r16
            r2 = r16 | r17
            int r1 = r15.length
            int r0 = r1 - r16
            int r0 = r0 - r17
            r2 = r2 | r0
            r4 = 0
            if (r2 < 0) goto L_0x00b8
            int r2 = r16 + r17
            char[] r8 = new char[r5]
            r13 = 0
        L_0x0014:
            if (r3 >= r2) goto L_0x0041
            long r0 = (long) r3
            byte r0 = X.C284115La.A02(r15, r0)
            if (r0 < 0) goto L_0x0041
            int r3 = r3 + 1
            int r1 = r13 + 1
            char r0 = (char) r0
            r8[r13] = r0
            r13 = r1
            goto L_0x0014
        L_0x0026:
            r0 = -16
            if (r9 >= r0) goto L_0x0081
            int r0 = r2 + -1
            if (r6 >= r0) goto L_0x00b0
            int r7 = r6 + 1
            long r0 = (long) r6
            byte r6 = X.C284115La.A02(r15, r0)
            int r3 = r7 + 1
            long r0 = (long) r7
            byte r0 = X.C284115La.A02(r15, r0)
            int r13 = r13 + 1
            X.C11050S7v.A01(r8, r9, r6, r0, r5)
        L_0x0041:
            r5 = r13
            if (r3 >= r2) goto L_0x00aa
            int r6 = r3 + 1
            long r0 = (long) r3
            byte r9 = X.C284115La.A02(r15, r0)
            if (r9 < 0) goto L_0x0066
            int r13 = r13 + 1
            char r0 = (char) r9
            r8[r5] = r0
        L_0x0052:
            if (r6 >= r2) goto L_0x0064
            long r0 = (long) r6
            byte r0 = X.C284115La.A02(r15, r0)
            if (r0 < 0) goto L_0x0064
            int r6 = r6 + 1
            int r1 = r13 + 1
            char r0 = (char) r0
            r8[r13] = r0
            r13 = r1
            goto L_0x0052
        L_0x0064:
            r3 = r6
            goto L_0x0041
        L_0x0066:
            r0 = -32
            if (r9 >= r0) goto L_0x0026
            if (r6 >= r2) goto L_0x00b0
            int r3 = r6 + 1
            long r0 = (long) r6
            byte r1 = X.C284115La.A02(r15, r0)
            int r13 = r13 + 1
            r0 = -62
            if (r9 < r0) goto L_0x00a2
            r0 = -65
            if (r1 > r0) goto L_0x00a2
            X.Pxi.A0s(r9, r1, r8, r5)
            goto L_0x0041
        L_0x0081:
            int r0 = r2 + -2
            if (r6 >= r0) goto L_0x00b0
            int r3 = r6 + 1
            long r0 = (long) r6
            byte r10 = X.C284115La.A02(r15, r0)
            int r5 = r3 + 1
            long r0 = (long) r3
            byte r11 = X.C284115La.A02(r15, r0)
            int r3 = r5 + 1
            long r0 = (long) r5
            byte r12 = X.C284115La.A02(r15, r0)
            int r0 = r13 + 1
            X.C11050S7v.A00(r8, r9, r10, r11, r12, r13)
            int r13 = r0 + 1
            goto L_0x0041
        L_0x00a2:
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.5eJ r0 = new X.5eJ
            r0.<init>(r1)
            throw r0
        L_0x00aa:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r8, r4, r13)
            return r0
        L_0x00b0:
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.5eJ r0 = new X.5eJ
            r0.<init>(r1)
            throw r0
        L_0x00b8:
            java.lang.Object[] r1 = X.Pxh.A1a(r1, r3, r5)
            java.lang.String r0 = "buffer length=%d, index=%d, size=%d"
            java.lang.ArrayIndexOutOfBoundsException r0 = X.Pxf.A0V(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7409QBt.A02(byte[], int, int):java.lang.String");
    }
}
