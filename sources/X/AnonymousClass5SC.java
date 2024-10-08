package X;

/* renamed from: X.5SC  reason: invalid class name */
public class AnonymousClass5SC {
    public final C285385Rc A00;
    public final C285385Rc A01;
    public final C285385Rc A02;
    public final C285385Rc A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5SC(X.C285385Rc r7, X.C285385Rc r8) {
        /*
            r6 = this;
            long r1 = r7.A01
            long r4 = X.C285435Rh.A02
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
            X.5Ra r1 = X.AnonymousClass5RZ.A01
            X.5Rt r0 = X.C285555Rt.A01
            X.5Rc r3 = X.C285465Rk.A00(r0, r7, r1)
        L_0x0010:
            long r1 = r8.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0022
            X.5Ra r1 = X.AnonymousClass5RZ.A01
            X.5Rt r0 = X.C285555Rt.A01
            X.5Rc r0 = X.C285465Rk.A00(r0, r8, r1)
        L_0x001e:
            r6.<init>(r7, r8, r3, r0)
            return
        L_0x0022:
            r0 = r8
            goto L_0x001e
        L_0x0024:
            r3 = r7
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5SC.<init>(X.5Rc, X.5Rc):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x029a, code lost:
        if (r3 > 0.5f) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0303, code lost:
        if (r4 > 2.0f) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0363, code lost:
        if (r4 > 128.0f) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03d9, code lost:
        if (r8 > 128.0f) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03de, code lost:
        if (r1 > 100.0f) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01f5, code lost:
        if (r3 > 2.0f) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0202, code lost:
        if (r3 > 0.5f) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x028c, code lost:
        if (r3 > 128.0f) goto L_0x0265;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0210  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A00(long r22) {
        /*
            r21 = this;
            r10 = r21
            boolean r0 = r10 instanceof X.AnonymousClass5SB
            if (r0 == 0) goto L_0x0007
            return r22
        L_0x0007:
            float r5 = X.AnonymousClass5RW.A03(r22)
            float r4 = X.AnonymousClass5RW.A02(r22)
            float r3 = X.AnonymousClass5RW.A01(r22)
            float r12 = X.AnonymousClass5RW.A00(r22)
            X.5Rc r6 = r10.A03
            boolean r9 = r6 instanceof X.C285545Rs
            if (r9 == 0) goto L_0x02a8
            r20 = r5
            r19 = r4
            r2 = r3
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x029e
            r20 = 0
        L_0x0029:
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0031
            r19 = -1090519040(0xffffffffbf000000, float:-0.5)
        L_0x0031:
            r18 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r19 > r18 ? 1 : (r19 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r19 = 1056964608(0x3f000000, float:0.5)
        L_0x0039:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0298
            r2 = -1090519040(0xffffffffbf000000, float:-0.5)
        L_0x003f:
            r18 = r2
        L_0x0041:
            float[] r11 = X.C285545Rs.A01
            r13 = 0
            r7 = r11[r13]
            float r7 = r7 * r20
            r17 = 3
            r0 = r11[r17]
            float r0 = r0 * r19
            float r7 = r7 + r0
            r16 = 6
            r0 = r11[r16]
            float r0 = r0 * r18
            float r7 = r7 + r0
            r8 = 1
            r2 = r11[r8]
            float r2 = r2 * r20
            r15 = 4
            r0 = r11[r15]
            float r0 = r0 * r19
            float r2 = r2 + r0
            r14 = 7
            r0 = r11[r14]
            float r0 = r0 * r18
            float r2 = r2 + r0
            r0 = 2
            r1 = r11[r0]
            float r1 = r1 * r20
            r0 = 5
            r0 = r11[r0]
            float r0 = r0 * r19
            float r1 = r1 + r0
            r0 = 8
            r0 = r11[r0]
            float r0 = r0 * r18
            float r1 = r1 + r0
            float r11 = r7 * r7
            float r11 = r11 * r7
            float r7 = r2 * r2
            float r7 = r7 * r2
            float r2 = r1 * r1
            float r2 = r2 * r1
            float[] r1 = X.C285545Rs.A00
            r13 = r1[r13]
            float r13 = r13 * r11
            r0 = r1[r17]
            float r0 = r0 * r7
            float r13 = r13 + r0
            r0 = r1[r16]
            float r0 = r0 * r2
            float r13 = r13 + r0
            r8 = r1[r8]
            float r8 = r8 * r11
            r0 = r1[r15]
            float r0 = r0 * r7
            float r8 = r8 + r0
            r0 = r1[r14]
            float r0 = r0 * r2
        L_0x0099:
            float r8 = r8 + r0
        L_0x009a:
            int r0 = java.lang.Float.floatToRawIntBits(r13)
            long r0 = (long) r0
            int r2 = java.lang.Float.floatToRawIntBits(r8)
            long r7 = (long) r2
            r2 = 32
            long r0 = r0 << r2
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r13
        L_0x00ad:
            long r0 = r0 | r7
            long r7 = r0 >> r2
            int r2 = (int) r7
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r0 = r0 & r13
            int r7 = (int) r0
            float r8 = java.lang.Float.intBitsToFloat(r7)
            if (r9 == 0) goto L_0x0210
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0206
            r5 = 0
        L_0x00c3:
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cb
            r4 = -1090519040(0xffffffffbf000000, float:-0.5)
        L_0x00cb:
            r14 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d3
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x00d3:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0200
            r3 = -1090519040(0xffffffffbf000000, float:-0.5)
        L_0x00d9:
            r14 = r3
        L_0x00da:
            float[] r13 = X.C285545Rs.A01
            r0 = 0
            r11 = r13[r0]
            float r11 = r11 * r5
            r0 = 3
            r0 = r13[r0]
            float r0 = r0 * r4
            float r11 = r11 + r0
            r0 = 6
            r0 = r13[r0]
            float r0 = r0 * r14
            float r11 = r11 + r0
            r0 = 1
            r9 = r13[r0]
            float r9 = r9 * r5
            r0 = 4
            r0 = r13[r0]
            float r0 = r0 * r4
            float r9 = r9 + r0
            r0 = 7
            r0 = r13[r0]
            float r0 = r0 * r14
            float r9 = r9 + r0
            r3 = 2
            r1 = r13[r3]
            float r1 = r1 * r5
            r7 = 5
            r0 = r13[r7]
            float r0 = r0 * r4
            float r1 = r1 + r0
            r6 = 8
            r0 = r13[r6]
            float r0 = r0 * r14
            float r1 = r1 + r0
            float r0 = r11 * r11
            float r0 = r0 * r11
            float r5 = r9 * r9
            float r5 = r5 * r9
            float r4 = r1 * r1
            float r4 = r4 * r1
            float[] r1 = X.C285545Rs.A00
            r3 = r1[r3]
            float r3 = r3 * r0
            r0 = r1[r7]
            float r0 = r0 * r5
            float r3 = r3 + r0
            r0 = r1[r6]
            float r0 = r0 * r4
        L_0x011c:
            float r3 = r3 + r0
        L_0x011d:
            X.5Rc r1 = r10.A02
            X.5Rc r5 = r10.A00
            boolean r0 = r1 instanceof X.C285375Rb
            if (r0 == 0) goto L_0x016d
            X.5Rb r1 = (X.C285375Rb) r1
            float[] r9 = r1.A0B
            r0 = 0
            r7 = r9[r0]
            float r7 = r7 * r2
            r0 = 3
            r0 = r9[r0]
            float r0 = r0 * r8
            float r7 = r7 + r0
            r0 = 6
            r0 = r9[r0]
            float r0 = r0 * r3
            float r7 = r7 + r0
            r0 = 1
            r6 = r9[r0]
            float r6 = r6 * r2
            r0 = 4
            r0 = r9[r0]
            float r0 = r0 * r8
            float r6 = r6 + r0
            r0 = 7
            r0 = r9[r0]
            float r0 = r0 * r3
            float r6 = r6 + r0
            r0 = 2
            r4 = r9[r0]
            float r4 = r4 * r2
            r0 = 5
            r0 = r9[r0]
            float r0 = r0 * r8
            float r4 = r4 + r0
            r0 = 8
            r0 = r9[r0]
            float r0 = r0 * r3
            float r4 = r4 + r0
            X.5Re r3 = r1.A04
            double r0 = (double) r7
            double r0 = r3.CNq(r0)
            float r2 = (float) r0
            double r0 = (double) r6
            double r0 = r3.CNq(r0)
            float r8 = (float) r0
            double r0 = (double) r4
            double r0 = r3.CNq(r0)
            float r4 = (float) r0
        L_0x0168:
            long r0 = X.C285595Rx.A02(r5, r2, r8, r4, r12)
            return r0
        L_0x016d:
            boolean r0 = r1 instanceof X.C285545Rs
            if (r0 == 0) goto L_0x01d0
            float[] r18 = X.C285545Rs.A02
            r17 = 0
            r7 = r18[r17]
            float r7 = r7 * r2
            r16 = 3
            r0 = r18[r16]
            float r0 = r0 * r8
            float r7 = r7 + r0
            r15 = 6
            r0 = r18[r15]
            float r0 = r0 * r3
            float r7 = r7 + r0
            r14 = 1
            r6 = r18[r14]
            float r6 = r6 * r2
            r13 = 4
            r0 = r18[r13]
            float r0 = r0 * r8
            float r6 = r6 + r0
            r11 = 7
            r0 = r18[r11]
            float r0 = r0 * r3
            float r6 = r6 + r0
            r4 = 2
            r1 = r18[r4]
            float r1 = r1 * r2
            r10 = 5
            r0 = r18[r10]
            float r0 = r0 * r8
            float r1 = r1 + r0
            r9 = 8
            r0 = r18[r9]
            float r0 = r0 * r3
            float r1 = r1 + r0
            float r7 = X.C7228Pzx.A00(r7)
            float r6 = X.C7228Pzx.A00(r6)
            float r3 = X.C7228Pzx.A00(r1)
            float[] r1 = X.C285545Rs.A03
            r2 = r1[r17]
            float r2 = r2 * r7
            r0 = r1[r16]
            float r0 = r0 * r6
            float r2 = r2 + r0
            r0 = r1[r15]
            float r0 = r0 * r3
            float r2 = r2 + r0
            r8 = r1[r14]
            float r8 = r8 * r7
            r0 = r1[r13]
            float r0 = r0 * r6
            float r8 = r8 + r0
            r0 = r1[r11]
            float r0 = r0 * r3
            float r8 = r8 + r0
            r4 = r1[r4]
            float r4 = r4 * r7
            r0 = r1[r10]
            float r0 = r0 * r6
            float r4 = r4 + r0
            r0 = r1[r9]
            float r0 = r0 * r3
            float r4 = r4 + r0
            goto L_0x0168
        L_0x01d0:
            boolean r0 = r1 instanceof X.C285525Rq
            if (r0 == 0) goto L_0x036f
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01dc
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
        L_0x01dc:
            r4 = 1073741824(0x40000000, float:2.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e4
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x01e4:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f9
            r8 = -1073741824(0xffffffffc0000000, float:-2.0)
        L_0x01ea:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f3
            r3 = -1073741824(0xffffffffc0000000, float:-2.0)
        L_0x01f0:
            r4 = r3
            goto L_0x0168
        L_0x01f3:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f0
            goto L_0x0168
        L_0x01f9:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ea
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x01ea
        L_0x0200:
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d9
            goto L_0x00da
        L_0x0206:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c3
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c3
        L_0x0210:
            boolean r0 = r6 instanceof X.C285375Rb
            if (r0 == 0) goto L_0x023c
            X.5Rb r6 = (X.C285375Rb) r6
            X.5Re r7 = r6.A02
            double r0 = (double) r5
            double r0 = r7.CNq(r0)
            float r5 = (float) r0
            double r0 = (double) r4
            double r0 = r7.CNq(r0)
            float r4 = (float) r0
            double r0 = (double) r3
            double r0 = r7.CNq(r0)
            float r7 = (float) r0
            float[] r1 = r6.A0D
            r0 = 2
            r3 = r1[r0]
            float r3 = r3 * r5
            r0 = 5
            r0 = r1[r0]
            float r0 = r0 * r4
            float r3 = r3 + r0
            r0 = 8
            r0 = r1[r0]
            float r0 = r0 * r7
            goto L_0x011c
        L_0x023c:
            boolean r0 = r6 instanceof X.C285525Rq
            if (r0 == 0) goto L_0x0254
            r0 = -1073741824(0xffffffffc0000000, float:-2.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x024a
            r3 = -1073741824(0xffffffffc0000000, float:-2.0)
            goto L_0x011d
        L_0x024a:
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x011d
            r3 = 1073741824(0x40000000, float:2.0)
            goto L_0x011d
        L_0x0254:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x028f
            r5 = 0
        L_0x025a:
            r0 = -1023410176(0xffffffffc3000000, float:-128.0)
            r1 = 1124073472(0x43000000, float:128.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x028a
            r3 = -1023410176(0xffffffffc3000000, float:-128.0)
        L_0x0264:
            r1 = r3
        L_0x0265:
            r0 = 1098907648(0x41800000, float:16.0)
            float r5 = r5 + r0
            r0 = 1122500608(0x42e80000, float:116.0)
            float r5 = r5 / r0
            r0 = 1000593162(0x3ba3d70a, float:0.005)
            float r1 = r1 * r0
            float r5 = r5 - r1
            r0 = 1045683377(0x3e53dcb1, float:0.20689656)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0282
            float r3 = r5 * r5
        L_0x0279:
            float r3 = r3 * r5
            float[] r1 = X.AnonymousClass5RZ.A04
            r0 = 2
            r0 = r1[r0]
            float r3 = r3 * r0
            goto L_0x011d
        L_0x0282:
            r3 = 1040416807(0x3e038027, float:0.12841855)
            r0 = 1041055179(0x3e0d3dcb, float:0.13793103)
            float r5 = r5 - r0
            goto L_0x0279
        L_0x028a:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0264
            goto L_0x0265
        L_0x028f:
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x025a
            r5 = 1120403456(0x42c80000, float:100.0)
            goto L_0x025a
        L_0x0298:
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            goto L_0x0041
        L_0x029e:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
            r20 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0029
        L_0x02a8:
            boolean r0 = r6 instanceof X.C285375Rb
            if (r0 == 0) goto L_0x02e2
            r8 = r6
            X.5Rb r8 = (X.C285375Rb) r8
            X.5Re r7 = r8.A02
            double r0 = (double) r5
            double r0 = r7.CNq(r0)
            float r2 = (float) r0
            double r0 = (double) r4
            double r0 = r7.CNq(r0)
            float r11 = (float) r0
            double r0 = (double) r3
            double r0 = r7.CNq(r0)
            float r7 = (float) r0
            float[] r1 = r8.A0D
            r0 = 0
            r13 = r1[r0]
            float r13 = r13 * r2
            r0 = 3
            r0 = r1[r0]
            float r0 = r0 * r11
            float r13 = r13 + r0
            r0 = 6
            r0 = r1[r0]
            float r0 = r0 * r7
            float r13 = r13 + r0
            r0 = 1
            r8 = r1[r0]
            float r8 = r8 * r2
            r0 = 4
            r0 = r1[r0]
            float r0 = r0 * r11
            float r8 = r8 + r0
            r0 = 7
            r0 = r1[r0]
            float r0 = r0 * r7
            goto L_0x0099
        L_0x02e2:
            boolean r0 = r6 instanceof X.C285525Rq
            r13 = r5
            if (r0 == 0) goto L_0x0307
            r2 = r4
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02f0
            r13 = -1073741824(0xffffffffc0000000, float:-2.0)
        L_0x02f0:
            r8 = 1073741824(0x40000000, float:2.0)
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x02f8
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x02f8:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0301
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
        L_0x02fe:
            r8 = r2
            goto L_0x009a
        L_0x0301:
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x02fe
            goto L_0x009a
        L_0x0307:
            r1 = r4
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0366
            r13 = 0
        L_0x030e:
            r0 = -1023410176(0xffffffffc3000000, float:-128.0)
            r11 = 1124073472(0x43000000, float:128.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0361
            r1 = -1023410176(0xffffffffc3000000, float:-128.0)
        L_0x0318:
            r11 = r1
        L_0x0319:
            r0 = 1098907648(0x41800000, float:16.0)
            float r13 = r13 + r0
            r0 = 1122500608(0x42e80000, float:116.0)
            float r13 = r13 / r0
            r0 = 990057071(0x3b03126f, float:0.002)
            float r11 = r11 * r0
            float r11 = r11 + r13
            r8 = 1041055179(0x3e0d3dcb, float:0.13793103)
            r2 = 1040416807(0x3e038027, float:0.12841855)
            r1 = 1045683377(0x3e53dcb1, float:0.20689656)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x035d
            float r7 = r11 * r11
            float r7 = r7 * r11
        L_0x0334:
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x035a
            float r2 = r13 * r13
            float r2 = r2 * r13
        L_0x033b:
            float[] r1 = X.AnonymousClass5RZ.A04
            r0 = 0
            r0 = r1[r0]
            float r7 = r7 * r0
            r0 = 1
            r0 = r1[r0]
            float r2 = r2 * r0
            int r0 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r2)
            long r0 = (long) r0
            r2 = 32
            long r7 = r7 << r2
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r13
            goto L_0x00ad
        L_0x035a:
            float r13 = r13 - r8
            float r2 = r2 * r13
            goto L_0x033b
        L_0x035d:
            float r11 = r11 - r8
            float r7 = r11 * r2
            goto L_0x0334
        L_0x0361:
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0318
            goto L_0x0319
        L_0x0366:
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x030e
            r13 = 1120403456(0x42c80000, float:100.0)
            goto L_0x030e
        L_0x036f:
            float[] r1 = X.AnonymousClass5RZ.A04
            r0 = 0
            r0 = r1[r0]
            float r2 = r2 / r0
            r0 = 1
            r0 = r1[r0]
            float r8 = r8 / r0
            r0 = 2
            r0 = r1[r0]
            float r3 = r3 / r0
            r7 = 1041055179(0x3e0d3dcb, float:0.13793103)
            r6 = 1090072424(0x40f92f68, float:7.787037)
            r4 = 1007753895(0x3c111aa7, float:0.008856452)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x03e7
            double r0 = (double) r2
            double r0 = java.lang.Math.cbrt(r0)
            float r2 = (float) r0
        L_0x0390:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x03e4
            double r0 = (double) r8
            double r0 = java.lang.Math.cbrt(r0)
            float r8 = (float) r0
        L_0x039a:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x03e1
            double r0 = (double) r3
            double r0 = java.lang.Math.cbrt(r0)
            float r3 = (float) r0
        L_0x03a4:
            r1 = 1122500608(0x42e80000, float:116.0)
            float r1 = r1 * r8
            r0 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 - r0
            r0 = 1140457472(0x43fa0000, float:500.0)
            float r2 = r2 - r8
            float r2 = r2 * r0
            r0 = 1128792064(0x43480000, float:200.0)
            float r8 = r8 - r3
            float r8 = r8 * r0
            r0 = 0
            r4 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x03dc
            r1 = 0
        L_0x03ba:
            r4 = r1
        L_0x03bb:
            r3 = -1023410176(0xffffffffc3000000, float:-128.0)
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x03c3
            r2 = -1023410176(0xffffffffc3000000, float:-128.0)
        L_0x03c3:
            r1 = 1124073472(0x43000000, float:128.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03cb
            r2 = 1124073472(0x43000000, float:128.0)
        L_0x03cb:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x03d7
            r8 = -1023410176(0xffffffffc3000000, float:-128.0)
        L_0x03d1:
            r1 = r8
        L_0x03d2:
            long r0 = X.C285595Rx.A02(r5, r4, r2, r1, r12)
            return r0
        L_0x03d7:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03d1
            goto L_0x03d2
        L_0x03dc:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x03ba
            goto L_0x03bb
        L_0x03e1:
            float r3 = r3 * r6
            float r3 = r3 + r7
            goto L_0x03a4
        L_0x03e4:
            float r8 = r8 * r6
            float r8 = r8 + r7
            goto L_0x039a
        L_0x03e7:
            float r2 = r2 * r6
            float r2 = r2 + r7
            goto L_0x0390
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5SC.A00(long):long");
    }

    public AnonymousClass5SC(C285385Rc r1, C285385Rc r2, C285385Rc r3, C285385Rc r4) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }
}
