package X;

/* renamed from: X.5Rx  reason: invalid class name and case insensitive filesystem */
public abstract class C285595Rx {
    public static final int A00(long j) {
        return (int) (AnonymousClass5RW.A05(AnonymousClass5RX.A0G, j) >>> 32);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A01(long r18, long r20) {
        /*
            long r0 = X.AnonymousClass5RW.A01
            r2 = 63
            long r0 = r20 & r2
            int r7 = (int) r0
            X.5Rc[] r13 = X.AnonymousClass5RX.A0K
            r0 = r13[r7]
            r1 = r18
            long r11 = X.AnonymousClass5RW.A05(r0, r1)
            float r10 = X.AnonymousClass5RW.A00(r20)
            float r9 = X.AnonymousClass5RW.A00(r11)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r6 = r2 - r9
            float r1 = r10 * r6
            float r1 = r1 + r9
            float r4 = X.AnonymousClass5RW.A03(r11)
            float r3 = X.AnonymousClass5RW.A03(r20)
            r19 = 0
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x0089
            r4 = 0
        L_0x002f:
            float r8 = X.AnonymousClass5RW.A02(r11)
            float r3 = X.AnonymousClass5RW.A02(r20)
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x0083
            r8 = 0
        L_0x003c:
            float r5 = X.AnonymousClass5RW.A01(r11)
            float r3 = X.AnonymousClass5RW.A01(r20)
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x004e
            float r5 = r5 * r9
            float r3 = r3 * r10
            float r3 = r3 * r6
            float r5 = r5 + r3
            float r19 = r5 / r1
        L_0x004e:
            r3 = r13[r7]
            boolean r0 = r3 instanceof X.C285375Rb
            if (r0 == 0) goto L_0x0081
            r0 = r3
            X.5Rb r0 = (X.C285375Rb) r0
            boolean r0 = r0.A0A
        L_0x0059:
            r18 = 32
            r17 = 16
            r16 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x008f
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            float r1 = r1 + r16
            int r0 = (int) r1
            int r1 = r0 << 24
            float r4 = r4 * r2
            float r4 = r4 + r16
            int r0 = (int) r4
            int r0 = r0 << 16
            r1 = r1 | r0
            float r8 = r8 * r2
            float r8 = r8 + r16
            int r0 = (int) r8
            int r0 = r0 << 8
            r1 = r1 | r0
            float r2 = r2 * r19
            float r2 = r2 + r16
            int r0 = (int) r2
            r1 = r1 | r0
            long r4 = (long) r1
            long r4 = r4 << r18
            return r4
        L_0x0081:
            r0 = 0
            goto L_0x0059
        L_0x0083:
            float r8 = r8 * r9
            float r3 = r3 * r10
            float r3 = r3 * r6
            float r8 = r8 + r3
            float r8 = r8 / r1
            goto L_0x003c
        L_0x0089:
            float r4 = r4 * r9
            float r3 = r3 * r10
            float r3 = r3 * r6
            float r4 = r4 + r3
            float r4 = r4 / r1
            goto L_0x002f
        L_0x008f:
            int r7 = java.lang.Float.floatToRawIntBits(r4)
            int r12 = r7 >>> 31
            int r0 = r7 >>> 23
            r6 = 255(0xff, float:3.57E-43)
            r0 = r0 & r6
            r15 = 8388607(0x7fffff, float:1.1754942E-38)
            r7 = r7 & r15
            r14 = 8388608(0x800000, float:1.17549435E-38)
            r5 = -10
            r13 = 49
            r9 = 0
            r4 = 31
            if (r0 != r6) goto L_0x0173
            r11 = 0
            if (r7 == 0) goto L_0x00ae
            r11 = 512(0x200, float:7.175E-43)
        L_0x00ae:
            r10 = 31
        L_0x00b0:
            int r7 = r12 << 15
            int r0 = r10 << 10
            r7 = r7 | r0
        L_0x00b5:
            r11 = r11 | r7
            short r7 = (short) r11
            int r12 = java.lang.Float.floatToRawIntBits(r8)
            int r8 = r12 >>> 31
            int r0 = r12 >>> 23
            r0 = r0 & r6
            r12 = r12 & r15
            if (r0 != r6) goto L_0x0144
            r11 = 0
            if (r12 == 0) goto L_0x00c8
            r11 = 512(0x200, float:7.175E-43)
        L_0x00c8:
            r10 = 31
        L_0x00ca:
            int r8 = r8 << 15
            int r0 = r10 << 10
            r8 = r8 | r0
        L_0x00cf:
            r11 = r11 | r8
            short r8 = (short) r11
            int r11 = java.lang.Float.floatToRawIntBits(r19)
            int r10 = r11 >>> 31
            int r0 = r11 >>> 23
            r0 = r0 & r6
            r11 = r11 & r15
            if (r0 != r6) goto L_0x011b
            if (r11 == 0) goto L_0x00e1
            r9 = 512(0x200, float:7.175E-43)
        L_0x00e1:
            r13 = 31
        L_0x00e3:
            int r4 = r10 << 15
            int r0 = r13 << 10
            r4 = r4 | r0
            r4 = r4 | r9
        L_0x00e9:
            short r12 = (short) r4
            r4 = 0
            float r0 = java.lang.Math.min(r1, r2)
            float r1 = java.lang.Math.max(r4, r0)
            r0 = 1149222912(0x447fc000, float:1023.0)
            float r1 = r1 * r0
            float r1 = r1 + r16
            int r11 = (int) r1
            int r6 = r3.A00
            long r9 = (long) r7
            r2 = 65535(0xffff, double:3.23786E-319)
            long r9 = r9 & r2
            r0 = 48
            long r9 = r9 << r0
            long r4 = (long) r8
            long r4 = r4 & r2
            long r4 = r4 << r18
            long r4 = r4 | r9
            long r0 = (long) r12
            long r0 = r0 & r2
            long r0 = r0 << r17
            long r4 = r4 | r0
            long r2 = (long) r11
            r0 = 1023(0x3ff, double:5.054E-321)
            long r2 = r2 & r0
            r0 = 6
            long r2 = r2 << r0
            long r4 = r4 | r2
            long r2 = (long) r6
            r0 = 63
            long r2 = r2 & r0
            long r4 = r4 | r2
            return r4
        L_0x011b:
            int r0 = r0 + -127
            int r6 = r0 + 15
            if (r6 >= r4) goto L_0x00e3
            if (r6 > 0) goto L_0x0133
            if (r6 < r5) goto L_0x0131
            r11 = r11 | r14
            int r0 = 1 - r6
            int r11 = r11 >> r0
            r0 = r11 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x012f
            int r11 = r11 + 8192
        L_0x012f:
            int r9 = r11 >> 13
        L_0x0131:
            r13 = 0
            goto L_0x00e3
        L_0x0133:
            int r9 = r11 >> 13
            r0 = r11 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0142
            int r0 = r6 << 10
            r0 = r0 | r9
            int r4 = r0 + 1
            int r0 = r10 << 15
            r4 = r4 | r0
            goto L_0x00e9
        L_0x0142:
            r13 = r6
            goto L_0x00e3
        L_0x0144:
            int r0 = r0 + -127
            int r10 = r0 + 15
            if (r10 < r4) goto L_0x014f
            r11 = 0
            r10 = 49
            goto L_0x00ca
        L_0x014f:
            if (r10 > 0) goto L_0x0164
            if (r10 < r5) goto L_0x0162
            r12 = r12 | r14
            int r0 = 1 - r10
            int r12 = r12 >> r0
            r0 = r12 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x015d
            int r12 = r12 + 8192
        L_0x015d:
            int r11 = r12 >> 13
        L_0x015f:
            r10 = 0
            goto L_0x00ca
        L_0x0162:
            r11 = 0
            goto L_0x015f
        L_0x0164:
            int r11 = r12 >> 13
            r0 = r12 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00ca
            int r0 = r10 << 10
            r0 = r0 | r11
            int r11 = r0 + 1
            int r8 = r8 << 15
            goto L_0x00cf
        L_0x0173:
            int r0 = r0 + -127
            int r10 = r0 + 15
            if (r10 < r4) goto L_0x017e
            r11 = 0
            r10 = 49
            goto L_0x00b0
        L_0x017e:
            if (r10 > 0) goto L_0x0193
            if (r10 < r5) goto L_0x0191
            r7 = r7 | r14
            int r0 = 1 - r10
            int r7 = r7 >> r0
            r0 = r7 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x018c
            int r7 = r7 + 8192
        L_0x018c:
            int r11 = r7 >> 13
        L_0x018e:
            r10 = 0
            goto L_0x00b0
        L_0x0191:
            r11 = 0
            goto L_0x018e
        L_0x0193:
            int r11 = r7 >> 13
            r0 = r7 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00b0
            int r0 = r10 << 10
            r0 = r0 | r11
            int r11 = r0 + 1
            int r7 = r12 << 15
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C285595Rx.A01(long, long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r20 > 1.0f) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0100, code lost:
        if (r10 == 0) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0112, code lost:
        if (r21 > 1.0f) goto L_0x0114;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A02(X.C285385Rc r17, float r18, float r19, float r20, float r21) {
        /*
            r3 = r17
            boolean r0 = r3 instanceof X.C285375Rb
            if (r0 == 0) goto L_0x01c8
            r0 = r3
            X.5Rb r0 = (X.C285375Rb) r0
            boolean r0 = r0.A0A
        L_0x000b:
            r17 = 16
            r16 = 1056964608(0x3f000000, float:0.5)
            r2 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            if (r0 == 0) goto L_0x0069
            int r0 = (r21 > r15 ? 1 : (r21 == r15 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L_0x0021
            r1 = r21
            int r0 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0021
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0021:
            r4 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r4
            float r1 = r1 + r16
            int r0 = (int) r1
            int r3 = r0 << 24
            int r0 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L_0x0036
            r1 = r18
            int r0 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0036
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0036:
            float r1 = r1 * r4
            float r1 = r1 + r16
            int r0 = (int) r1
            int r0 = r0 << 16
            r3 = r3 | r0
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L_0x004a
            r1 = r19
            int r0 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x004a
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x004a:
            float r1 = r1 * r4
            float r1 = r1 + r16
            int r0 = (int) r1
            int r0 = r0 << 8
            r3 = r3 | r0
            int r0 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0067
            r15 = r20
            int r0 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
        L_0x005b:
            float r2 = r2 * r4
            float r2 = r2 + r16
            int r0 = (int) r2
            r3 = r3 | r0
            long r2 = (long) r3
            r0 = 32
            long r2 = r2 << r0
        L_0x0064:
            long r0 = X.AnonymousClass5RW.A01
            return r2
        L_0x0067:
            r2 = r15
            goto L_0x005b
        L_0x0069:
            long r0 = r3.A01
            r14 = 32
            long r0 = r0 >> r14
            int r4 = (int) r0
            r0 = 3
            r7 = 1
            r1 = 0
            if (r4 != r0) goto L_0x01cb
            int r5 = r3.A00
            r0 = -1
            if (r5 == r0) goto L_0x01ce
            float r4 = r3.A01(r1)
            float r1 = r3.A00(r1)
            int r0 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0087
            r4 = r18
        L_0x0087:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x008c
            r1 = r4
        L_0x008c:
            int r8 = java.lang.Float.floatToRawIntBits(r1)
            int r11 = r8 >>> 31
            int r0 = r8 >>> 23
            r6 = 255(0xff, float:3.57E-43)
            r0 = r0 & r6
            r13 = 8388607(0x7fffff, float:1.1754942E-38)
            r8 = r8 & r13
            r12 = 8388608(0x800000, float:1.17549435E-38)
            r4 = -10
            r1 = 31
            if (r0 != r6) goto L_0x0199
            r10 = 0
            if (r8 == 0) goto L_0x00a8
            r10 = 512(0x200, float:7.175E-43)
        L_0x00a8:
            r9 = 31
        L_0x00aa:
            int r8 = r11 << 15
            int r0 = r9 << 10
            r8 = r8 | r0
        L_0x00af:
            r10 = r10 | r8
            short r8 = (short) r10
            float r9 = r3.A01(r7)
            float r7 = r3.A00(r7)
            int r0 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x00bf
            r9 = r19
        L_0x00bf:
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x00c4
            r7 = r9
        L_0x00c4:
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            int r11 = r7 >>> 31
            int r0 = r7 >>> 23
            r0 = r0 & r6
            r7 = r7 & r13
            if (r0 != r6) goto L_0x016a
            r10 = 0
            if (r7 == 0) goto L_0x00d5
            r10 = 512(0x200, float:7.175E-43)
        L_0x00d5:
            r9 = 31
        L_0x00d7:
            int r7 = r11 << 15
            int r0 = r9 << 10
            r7 = r7 | r0
        L_0x00dc:
            r10 = r10 | r7
            short r7 = (short) r10
            r0 = 2
            float r9 = r3.A01(r0)
            float r3 = r3.A00(r0)
            int r0 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x00ed
            r9 = r20
        L_0x00ed:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00f2
            r3 = r9
        L_0x00f2:
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            int r9 = r10 >>> 31
            int r0 = r10 >>> 23
            r0 = r0 & r6
            r10 = r10 & r13
            if (r0 != r6) goto L_0x013c
            r3 = 512(0x200, float:7.175E-43)
            if (r10 != 0) goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            int r4 = r9 << 15
            int r0 = r1 << 10
            r4 = r4 | r0
            r4 = r4 | r3
        L_0x0109:
            short r6 = (short) r4
            int r0 = (r21 > r15 ? 1 : (r21 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x013a
            r15 = r21
            int r0 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x013a
        L_0x0114:
            r0 = 1149222912(0x447fc000, float:1023.0)
            float r2 = r2 * r0
            float r2 = r2 + r16
            int r4 = (int) r2
            long r2 = (long) r8
            r8 = 65535(0xffff, double:3.23786E-319)
            long r2 = r2 & r8
            r0 = 48
            long r2 = r2 << r0
            long r0 = (long) r7
            long r0 = r0 & r8
            long r0 = r0 << r14
            long r2 = r2 | r0
            long r0 = (long) r6
            long r8 = r8 & r0
            long r8 = r8 << r17
            long r2 = r2 | r8
            long r6 = (long) r4
            r0 = 1023(0x3ff, double:5.054E-321)
            long r6 = r6 & r0
            r0 = 6
            long r6 = r6 << r0
            long r6 = r6 | r2
            long r2 = (long) r5
            r0 = 63
            long r2 = r2 & r0
            long r2 = r2 | r6
            goto L_0x0064
        L_0x013a:
            r2 = r15
            goto L_0x0114
        L_0x013c:
            int r0 = r0 + -127
            int r6 = r0 + 15
            if (r6 < r1) goto L_0x0145
            r1 = 49
            goto L_0x0102
        L_0x0145:
            if (r6 > 0) goto L_0x0159
            if (r6 < r4) goto L_0x0157
            r10 = r10 | r12
            int r0 = 1 - r6
            int r10 = r10 >> r0
            r0 = r10 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0153
            int r10 = r10 + 8192
        L_0x0153:
            int r3 = r10 >> 13
            r1 = 0
            goto L_0x0103
        L_0x0157:
            r1 = 0
            goto L_0x0102
        L_0x0159:
            int r3 = r10 >> 13
            r0 = r10 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0168
            int r0 = r6 << 10
            r0 = r0 | r3
            int r4 = r0 + 1
            int r0 = r9 << 15
            r4 = r4 | r0
            goto L_0x0109
        L_0x0168:
            r1 = r6
            goto L_0x0103
        L_0x016a:
            int r0 = r0 + -127
            int r9 = r0 + 15
            if (r9 < r1) goto L_0x0175
            r10 = 0
            r9 = 49
            goto L_0x00d7
        L_0x0175:
            if (r9 > 0) goto L_0x018a
            if (r9 < r4) goto L_0x0188
            r7 = r7 | r12
            int r0 = 1 - r9
            int r7 = r7 >> r0
            r0 = r7 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0183
            int r7 = r7 + 8192
        L_0x0183:
            int r10 = r7 >> 13
        L_0x0185:
            r9 = 0
            goto L_0x00d7
        L_0x0188:
            r10 = 0
            goto L_0x0185
        L_0x018a:
            int r10 = r7 >> 13
            r0 = r7 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00d7
            int r0 = r9 << 10
            r0 = r0 | r10
            int r10 = r0 + 1
            int r7 = r11 << 15
            goto L_0x00dc
        L_0x0199:
            int r0 = r0 + -127
            int r9 = r0 + 15
            if (r9 < r1) goto L_0x01a4
            r10 = 0
            r9 = 49
            goto L_0x00aa
        L_0x01a4:
            if (r9 > 0) goto L_0x01b9
            if (r9 < r4) goto L_0x01b7
            r8 = r8 | r12
            int r0 = 1 - r9
            int r8 = r8 >> r0
            r0 = r8 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01b2
            int r8 = r8 + 8192
        L_0x01b2:
            int r10 = r8 >> 13
        L_0x01b4:
            r9 = 0
            goto L_0x00aa
        L_0x01b7:
            r10 = 0
            goto L_0x01b4
        L_0x01b9:
            int r10 = r8 >> 13
            r0 = r8 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00aa
            int r0 = r9 << 10
            r0 = r0 | r10
            int r10 = r0 + 1
            int r8 = r11 << 15
            goto L_0x00af
        L_0x01c8:
            r0 = 0
            goto L_0x000b
        L_0x01cb:
            java.lang.String r1 = "Color only works with ColorSpaces with 3 components"
            goto L_0x01d0
        L_0x01ce:
            java.lang.String r1 = "Unknown color space, please use a color space in ColorSpaces"
        L_0x01d0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C285595Rx.A02(X.5Rc, float, float, float, float):long");
    }
}
