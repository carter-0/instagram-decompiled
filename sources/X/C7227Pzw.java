package X;

/* renamed from: X.Pzw  reason: case insensitive filesystem */
public final class C7227Pzw implements JNL {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00de, code lost:
        if (r0 != 0) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0088 A[LOOP:0: B:15:0x0086->B:16:0x0088, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7227Pzw(float r28, float r29, float r30, float r31) {
        /*
            r27 = this;
            r26 = r27
            r26.<init>()
            r4 = r28
            r0 = r26
            r0.A00 = r4
            r25 = r29
            r1 = r25
            r0.A01 = r1
            r3 = r30
            r0.A02 = r3
            r15 = r31
            r0.A03 = r15
            boolean r0 = java.lang.Float.isNaN(r4)
            if (r0 != 0) goto L_0x010b
            boolean r0 = java.lang.Float.isNaN(r25)
            if (r0 != 0) goto L_0x010b
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L_0x010b
            boolean r0 = java.lang.Float.isNaN(r15)
            if (r0 != 0) goto L_0x010b
            r0 = 5
            float[] r13 = new float[r0]
            r12 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            float r14 = r29 - r12
            r0 = 1077936128(0x40400000, float:3.0)
            float r14 = r14 * r0
            float r11 = r31 - r29
            float r11 = r11 * r0
            float r10 = r24 - r31
            float r10 = r10 * r0
            double r8 = (double) r14
            double r6 = (double) r11
            double r0 = (double) r10
            r21 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r19 = r6 * r21
            double r17 = r8 - r19
            double r17 = r17 + r0
            r2 = 0
            r16 = 1
            r4 = 0
            int r3 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x00a9
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x006c
            double r2 = r19 - r0
            double r0 = r0 * r21
            double r19 = r19 - r0
            double r2 = r2 / r19
            float r1 = (float) r2
            r0 = r23
            int r6 = X.C7229Pzy.A00(r13, r1, r0)
        L_0x006b:
            r2 = r6
        L_0x006c:
            float r1 = r11 - r14
            r8 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r8
            float r10 = r10 - r11
            float r10 = r10 * r8
            float r0 = -r1
            float r10 = r10 - r1
            float r0 = r0 / r10
            int r0 = X.C7229Pzy.A00(r13, r0, r2)
            int r2 = r2 + r0
            r0 = r24
            float r7 = java.lang.Math.min(r12, r0)
            float r6 = java.lang.Math.max(r12, r0)
            r5 = 0
        L_0x0086:
            if (r5 >= r2) goto L_0x00e1
            r4 = r13[r5]
            float r0 = r29 - r31
            r3 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r3
            float r1 = r24 + r0
            float r1 = r1 - r12
            float r0 = r8 * r29
            float r0 = r31 - r0
            float r0 = r0 + r12
            float r0 = r0 * r3
            float r1 = r1 * r4
            float r1 = r1 + r0
            float r1 = r1 * r4
            float r1 = r1 + r14
            float r1 = r1 * r4
            float r1 = r1 + r12
            float r7 = java.lang.Math.min(r7, r1)
            float r6 = java.lang.Math.max(r6, r1)
            int r5 = r5 + 1
            goto L_0x0086
        L_0x00a9:
            double r2 = r6 * r6
            double r0 = r0 * r8
            double r2 = r2 - r0
            double r0 = java.lang.Math.sqrt(r2)
            double r4 = -r0
            double r2 = -r8
            double r2 = r2 + r6
            double r6 = r4 + r2
            double r0 = -r6
            double r0 = r0 / r17
            float r6 = (float) r0
            r0 = r23
            int r6 = X.C7229Pzy.A00(r13, r6, r0)
            double r4 = r4 - r2
            double r4 = r4 / r17
            float r0 = (float) r4
            int r0 = X.C7229Pzy.A00(r13, r0, r6)
            int r6 = r6 + r0
            r0 = r16
            if (r6 <= r0) goto L_0x006b
            r2 = r13[r23]
            r1 = r13[r16]
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00da
            r13[r23] = r1
            r13[r16] = r2
            goto L_0x006b
        L_0x00da:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            int r2 = r6 + -1
            if (r0 == 0) goto L_0x006c
            goto L_0x006b
        L_0x00e1:
            int r0 = java.lang.Float.floatToRawIntBits(r7)
            long r1 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r6)
            long r3 = (long) r0
            r0 = 32
            long r1 = r1 << r0
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r3 = r3 | r1
            long r1 = r3 >> r0
            int r0 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r0)
            r0 = r26
            r0.A05 = r1
            long r3 = r3 & r5
            int r0 = (int) r3
            float r1 = java.lang.Float.intBitsToFloat(r0)
            r0 = r26
            r0.A04 = r1
            return
        L_0x010b:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r1 = ", "
            r2.append(r1)
            r0 = r25
            r2.append(r0)
            r2.append(r1)
            r2.append(r3)
            r2.append(r1)
            r2.append(r15)
            r0 = 46
            java.lang.String r0 = X.C51967G9n.A0r(r2, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7227Pzw.<init>(float, float, float, float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        if (r2 < -8.34465E-7f) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c8, code lost:
        if (r2 <= 1.0000008f) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e5, code lost:
        if (r0 < 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fb, code lost:
        if (r0 > 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0151, code lost:
        if (r2 < 0) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0171, code lost:
        if (r2 < 0) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0193, code lost:
        if (r2 > 0) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019e, code lost:
        if (r2 > 0) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a3, code lost:
        if (r0 > 1.0d) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ba, code lost:
        if (r0 < 0) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d0, code lost:
        if (r0 > 0) goto L_0x01bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float FHc(float r29) {
        /*
            r28 = this;
            r12 = r29
            r2 = 0
            int r0 = (r29 > r2 ? 1 : (r29 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x020b
            r27 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r0 >= 0) goto L_0x020b
            float r2 = r2 - r29
            r14 = r28
            float r0 = r14.A00
            r26 = r0
            float r13 = r0 - r29
            float r0 = r14.A02
            r25 = r0
            float r15 = r0 - r29
            float r16 = r27 - r29
            double r10 = (double) r2
            double r0 = (double) r13
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r8
            double r6 = r10 - r0
            double r0 = (double) r15
            double r6 = r6 + r0
            r23 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r6 = r6 * r23
            float r0 = r13 - r2
            double r4 = (double) r0
            double r4 = r4 * r23
            float r0 = -r2
            double r2 = (double) r0
            float r13 = r13 - r15
            double r0 = (double) r13
            double r0 = r0 * r23
            double r2 = r2 + r0
            r0 = r16
            double r0 = (double) r0
            double r2 = r2 + r0
            r21 = 0
            double r0 = r2 - r21
            double r17 = java.lang.Math.abs(r0)
            r15 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r1 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x004f
            r0 = 1
        L_0x004f:
            r20 = 1065353223(0x3f800007, float:1.0000008)
            r19 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            r18 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            r13 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L_0x00fe
            double r0 = r6 - r21
            double r1 = java.lang.Math.abs(r0)
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ce
            double r0 = r4 - r21
            double r1 = java.lang.Math.abs(r0)
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0081
            double r0 = -r10
            double r0 = r0 / r4
        L_0x0072:
            float r2 = (float) r0
        L_0x0073:
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c2
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            r18 = 0
            if (r0 >= 0) goto L_0x007f
        L_0x007d:
            r18 = 2143289344(0x7fc00000, float:NaN)
        L_0x007f:
            r13 = r18
        L_0x0081:
            boolean r0 = java.lang.Float.isNaN(r13)
            if (r0 == 0) goto L_0x01e7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "The cubic curve with parameters ("
            r2.append(r0)
            r0 = r26
            r2.append(r0)
            java.lang.String r1 = ", "
            r2.append(r1)
            float r0 = r14.A01
            r2.append(r0)
            r2.append(r1)
            r0 = r25
            r2.append(r0)
            r2.append(r1)
            float r0 = r14.A03
            r2.append(r0)
            java.lang.String r0 = ") has no solution at "
            r2.append(r0)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00c2:
            int r0 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cb
            int r0 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r0 > 0) goto L_0x007d
            goto L_0x007f
        L_0x00cb:
            r18 = r2
            goto L_0x007f
        L_0x00ce:
            double r2 = r4 * r4
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = r0 * r6
            double r0 = r0 * r10
            double r2 = r2 - r0
            double r2 = java.lang.Math.sqrt(r2)
            double r6 = r6 * r8
            double r0 = r2 - r4
            double r0 = r0 / r6
            float r13 = (float) r0
            int r0 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f3
            int r0 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            r13 = 0
            if (r0 >= 0) goto L_0x00e9
        L_0x00e7:
            r13 = 2143289344(0x7fc00000, float:NaN)
        L_0x00e9:
            boolean r0 = java.lang.Float.isNaN(r13)
            if (r0 == 0) goto L_0x0081
            double r0 = -r4
            double r0 = r0 - r2
            double r0 = r0 / r6
            goto L_0x0072
        L_0x00f3:
            int r0 = (r13 > r27 ? 1 : (r13 == r27 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e9
            int r0 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L_0x00e9
            goto L_0x00e7
        L_0x00fe:
            double r6 = r6 / r2
            double r4 = r4 / r2
            double r10 = r10 / r2
            double r15 = r4 * r23
            double r0 = r6 * r6
            double r15 = r15 - r0
            r0 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r15 = r15 / r0
            double r8 = r8 * r6
            double r8 = r8 * r6
            double r8 = r8 * r6
            double r0 = r0 * r6
            double r0 = r0 * r4
            double r8 = r8 - r0
            r0 = 4628293042053316608(0x403b000000000000, double:27.0)
            double r10 = r10 * r0
            double r8 = r8 + r10
            r0 = 4632796641680687104(0x404b000000000000, double:54.0)
            double r8 = r8 / r0
            double r3 = r8 * r8
            double r0 = r15 * r15
            double r0 = r0 * r15
            double r3 = r3 + r0
            double r6 = r6 / r23
            r13 = 1073741824(0x40000000, float:2.0)
            int r2 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r2 >= 0) goto L_0x01a6
            double r2 = -r0
            double r2 = java.lang.Math.sqrt(r2)
            double r0 = -r8
            double r0 = r0 / r2
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x01a1
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x0135:
            r8 = r0
        L_0x0136:
            double r4 = java.lang.Math.acos(r8)
            float r0 = (float) r2
            float r0 = X.C7228Pzx.A00(r0)
            float r0 = r0 * r13
            double r0 = (double) r0
            double r2 = r4 / r23
            double r2 = java.lang.Math.cos(r2)
            double r2 = r2 * r0
            double r2 = r2 - r6
            float r13 = (float) r2
            int r2 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r2 >= 0) goto L_0x0196
            int r2 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            r13 = 0
            if (r2 >= 0) goto L_0x0155
        L_0x0153:
            r13 = 2143289344(0x7fc00000, float:NaN)
        L_0x0155:
            boolean r2 = java.lang.Float.isNaN(r13)
            if (r2 == 0) goto L_0x0081
            r2 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r2 = r2 + r4
            double r2 = r2 / r23
            double r2 = java.lang.Math.cos(r2)
            double r2 = r2 * r0
            double r2 = r2 - r6
            float r13 = (float) r2
            int r2 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r2 >= 0) goto L_0x018b
            int r2 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            r13 = 0
            if (r2 >= 0) goto L_0x0175
        L_0x0173:
            r13 = 2143289344(0x7fc00000, float:NaN)
        L_0x0175:
            boolean r2 = java.lang.Float.isNaN(r13)
            if (r2 == 0) goto L_0x0081
            r2 = 4623263855806786840(0x402921fb54442d18, double:12.566370614359172)
            double r4 = r4 + r2
            double r4 = r4 / r23
            double r2 = java.lang.Math.cos(r4)
            double r0 = r0 * r2
        L_0x0188:
            double r0 = r0 - r6
            goto L_0x0072
        L_0x018b:
            int r2 = (r13 > r27 ? 1 : (r13 == r27 ? 0 : -1))
            if (r2 <= 0) goto L_0x0175
            int r2 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r2 <= 0) goto L_0x0175
            goto L_0x0173
        L_0x0196:
            int r2 = (r13 > r27 ? 1 : (r13 == r27 ? 0 : -1))
            if (r2 <= 0) goto L_0x0155
            int r2 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r2 <= 0) goto L_0x0155
            goto L_0x0153
        L_0x01a1:
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0135
            goto L_0x0136
        L_0x01a6:
            int r0 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x01d3
            float r0 = (float) r8
            float r0 = X.C7228Pzx.A00(r0)
            float r2 = -r0
            float r13 = r13 * r2
            float r1 = (float) r6
            float r13 = r13 - r1
            int r0 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c8
            int r0 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            r13 = 0
            if (r0 >= 0) goto L_0x01be
        L_0x01bc:
            r13 = 2143289344(0x7fc00000, float:NaN)
        L_0x01be:
            boolean r0 = java.lang.Float.isNaN(r13)
            if (r0 == 0) goto L_0x0081
            float r2 = -r2
            float r2 = r2 - r1
            goto L_0x0073
        L_0x01c8:
            int r0 = (r13 > r27 ? 1 : (r13 == r27 ? 0 : -1))
            if (r0 <= 0) goto L_0x01be
            int r0 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L_0x01be
            goto L_0x01bc
        L_0x01d3:
            double r3 = java.lang.Math.sqrt(r3)
            double r1 = -r8
            double r1 = r1 + r3
            float r0 = (float) r1
            float r1 = X.C7228Pzx.A00(r0)
            double r8 = r8 + r3
            float r0 = (float) r8
            float r0 = X.C7228Pzx.A00(r0)
            float r1 = r1 - r0
            double r0 = (double) r1
            goto L_0x0188
        L_0x01e7:
            float r2 = r14.A01
            float r1 = r14.A03
            float r12 = r2 - r1
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r12 = r12 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r2
            float r1 = r1 - r0
            float r12 = r12 * r13
            float r12 = r12 + r1
            float r12 = r12 * r13
            float r12 = r12 + r2
            r0 = 1077936128(0x40400000, float:3.0)
            float r12 = r12 * r0
            float r12 = r12 * r13
            float r2 = r14.A05
            float r1 = r14.A04
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0206
            r12 = r2
        L_0x0206:
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x020b
            return r1
        L_0x020b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7227Pzw.FHc(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7227Pzw)) {
            return false;
        }
        C7227Pzw pzw = (C7227Pzw) obj;
        if (this.A00 == pzw.A00 && this.A01 == pzw.A01 && this.A02 == pzw.A02 && this.A03 == pzw.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(AnonymousClass7TF.A00(Float.floatToIntBits(this.A00) * 31, this.A01), this.A02) + Float.floatToIntBits(this.A03);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CubicBezierEasing(a=");
        A1A.append(this.A00);
        A1A.append(", b=");
        A1A.append(this.A01);
        A1A.append(", c=");
        A1A.append(this.A02);
        A1A.append(", d=");
        A1A.append(this.A03);
        return AnonymousClass7TG.A0p(A1A);
    }
}
