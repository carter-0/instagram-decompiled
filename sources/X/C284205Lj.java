package X;

/* renamed from: X.5Lj  reason: invalid class name and case insensitive filesystem */
public abstract class C284205Lj {
    public int A01(byte[] bArr, int i, int i2, int i3) {
        int i4;
        byte b;
        while (r12 < i3 && bArr[r12] >= 0) {
            i2 = r12 + 1;
        }
        if (r12 >= i3) {
            return 0;
        }
        while (r12 < i3) {
            int i5 = r12 + 1;
            byte b2 = bArr[r12];
            if (b2 < 0) {
                if (b2 >= -32) {
                    if (b2 < -16) {
                        if (i5 < i3 - 1) {
                            int i6 = i5 + 1;
                            byte b3 = bArr[i5];
                            if (b3 > -65) {
                                return -1;
                            }
                            if (b2 == -32) {
                                if (b3 < -96) {
                                    return -1;
                                }
                            } else if (b2 == -19 && b3 >= -96) {
                                return -1;
                            }
                            r12 = i6 + 1;
                            b = bArr[i6];
                        }
                    } else if (i5 < i3 - 2) {
                        int i7 = i5 + 1;
                        byte b4 = bArr[i5];
                        if (b4 > -65 || (((b2 << 28) + (b4 + 112)) >> 30) != 0) {
                            return -1;
                        }
                        int i8 = i7 + 1;
                        if (bArr[i7] > -65) {
                            return -1;
                        }
                        i5 = i8 + 1;
                        if (bArr[i8] > -65) {
                            return -1;
                        }
                    }
                    C284205Lj r0 = C284185Lh.A00;
                    byte b5 = bArr[i5 - 1];
                    int i9 = i3 - i5;
                    if (i9 != 0) {
                        if (i9 == 1) {
                            byte b6 = bArr[i5];
                            if (b5 > -12 || b6 > -65) {
                                return -1;
                            }
                            i4 = b6 << 8;
                        } else if (i9 == 2) {
                            byte b7 = bArr[i5];
                            byte b8 = bArr[i5 + 1];
                            if (b5 > -12 || b7 > -65 || b8 > -65) {
                                return -1;
                            }
                            b5 ^= b7 << 8;
                            i4 = b8 << 16;
                        } else {
                            throw new AssertionError();
                        }
                        return b5 ^ i4;
                    } else if (b5 > -12) {
                        return -1;
                    } else {
                        return b5;
                    }
                } else if (i5 >= i3) {
                    return b2;
                } else {
                    if (b2 < -62) {
                        return -1;
                    }
                    r12 = i5 + 1;
                    b = bArr[i5];
                }
                if (b > -65) {
                    return -1;
                }
            }
            r12 = i5;
        }
        return 0;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 148 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r11 = r11 + 1;
        r6[r5] = (char) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r4 >= r3) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r0 = r13[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r0 < 0) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        r4 = r4 + 1;
        r6[r11] = (char) r0;
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r14 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r4 >= r3) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r14 = r4 + 1;
        r4 = r13[r4];
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r7 < -62) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (r4 > -65) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        r6[r5] = (char) (((r7 & 31) << 6) | (r4 & 63));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r4 >= (r3 - 2)) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        r1 = r4 + 1;
        r0 = r1 + 1;
        r14 = r0 + 1;
        X.C11050S7v.A00(r6, r7, r13[r4], r13[r1], r13[r0], r11);
        r11 = (r11 + 1) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        throw new X.C289845eJ(X.Pxd.A00(164));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            r3 = r14 | r15
            int r1 = r13.length
            int r0 = r1 - r14
            int r0 = r0 - r15
            r3 = r3 | r0
            r2 = 0
            if (r3 < 0) goto L_0x00a7
            int r3 = r14 + r15
            char[] r6 = new char[r15]
            r11 = 0
        L_0x000f:
            if (r14 >= r3) goto L_0x0033
            byte r0 = r13[r14]
            if (r0 < 0) goto L_0x0033
            int r14 = r14 + 1
            int r1 = r11 + 1
            char r0 = (char) r0
            r6[r11] = r0
            r11 = r1
            goto L_0x000f
        L_0x001e:
            r0 = -16
            if (r7 >= r0) goto L_0x0071
            int r0 = r3 + -1
            if (r4 >= r0) goto L_0x009b
            int r0 = r4 + 1
            byte r1 = r13[r4]
            int r14 = r0 + 1
            byte r0 = r13[r0]
            int r11 = r11 + 1
            X.C11050S7v.A01(r6, r7, r1, r0, r5)
        L_0x0033:
            r5 = r11
            if (r14 >= r3) goto L_0x0095
            int r4 = r14 + 1
            byte r7 = r13[r14]
            if (r7 < 0) goto L_0x0052
            int r11 = r11 + 1
            char r0 = (char) r7
            r6[r5] = r0
        L_0x0041:
            if (r4 >= r3) goto L_0x0050
            byte r0 = r13[r4]
            if (r0 < 0) goto L_0x0050
            int r4 = r4 + 1
            int r1 = r11 + 1
            char r0 = (char) r0
            r6[r11] = r0
            r11 = r1
            goto L_0x0041
        L_0x0050:
            r14 = r4
            goto L_0x0033
        L_0x0052:
            r0 = -32
            if (r7 >= r0) goto L_0x001e
            if (r4 >= r3) goto L_0x009b
            int r14 = r4 + 1
            byte r4 = r13[r4]
            int r11 = r11 + 1
            r0 = -62
            if (r7 < r0) goto L_0x0089
            r0 = -65
            if (r4 > r0) goto L_0x0089
            r0 = r7 & 31
            int r1 = r0 << 6
            r0 = r4 & 63
            r1 = r1 | r0
            char r0 = (char) r1
            r6[r5] = r0
            goto L_0x0033
        L_0x0071:
            int r0 = r3 + -2
            if (r4 >= r0) goto L_0x009b
            int r1 = r4 + 1
            byte r8 = r13[r4]
            int r0 = r1 + 1
            byte r9 = r13[r1]
            int r14 = r0 + 1
            byte r10 = r13[r0]
            int r0 = r11 + 1
            X.C11050S7v.A00(r6, r7, r8, r9, r10, r11)
            int r11 = r0 + 1
            goto L_0x0033
        L_0x0089:
            r0 = 164(0xa4, float:2.3E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.5eJ r1 = new X.5eJ
            r1.<init>(r0)
            throw r1
        L_0x0095:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r2, r11)
            return r0
        L_0x009b:
            r0 = 164(0xa4, float:2.3E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.5eJ r1 = new X.5eJ
            r1.<init>(r0)
            throw r1
        L_0x00a7:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            r0 = 192(0xc0, float:2.69E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284205Lj.A02(byte[], int, int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r6 < 2048) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(java.lang.CharSequence r9, byte[] r10, int r11, int r12) {
        /*
            r8 = this;
            int r2 = r9.length()
            int r12 = r12 + r11
            r7 = 0
        L_0x0006:
            r4 = 128(0x80, float:1.794E-43)
            if (r7 >= r2) goto L_0x001a
            int r1 = r7 + r11
            if (r1 >= r12) goto L_0x001a
            char r0 = r9.charAt(r7)
            if (r0 >= r4) goto L_0x001a
            byte r0 = (byte) r0
            r10[r1] = r0
            int r7 = r7 + 1
            goto L_0x0006
        L_0x001a:
            int r3 = r11 + r7
            if (r7 != r2) goto L_0x0021
            int r3 = r11 + r2
        L_0x0020:
            return r3
        L_0x0021:
            if (r7 >= r2) goto L_0x0020
            char r6 = r9.charAt(r7)
            if (r6 >= r4) goto L_0x0034
            if (r3 >= r12) goto L_0x0038
            int r1 = r3 + 1
        L_0x002d:
            byte r0 = (byte) r6
            r10[r3] = r0
            r3 = r1
        L_0x0031:
            int r7 = r7 + 1
            goto L_0x0021
        L_0x0034:
            r0 = 2048(0x800, float:2.87E-42)
            if (r6 >= r0) goto L_0x004e
        L_0x0038:
            int r0 = r12 + -2
            if (r3 > r0) goto L_0x004e
            int r1 = r3 + 1
            int r0 = r6 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            byte r0 = (byte) r0
            r10[r3] = r0
            int r3 = r1 + 1
            r0 = r6 & 63
            r0 = r0 | r4
            byte r0 = (byte) r0
            r10[r1] = r0
            goto L_0x0031
        L_0x004e:
            r5 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r1) goto L_0x0058
            if (r5 >= r6) goto L_0x0075
        L_0x0058:
            int r0 = r12 + -3
            if (r3 > r0) goto L_0x0075
            int r1 = r3 + 1
            int r0 = r6 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            r10[r3] = r0
            int r3 = r1 + 1
            int r0 = r6 >>> 6
            r0 = r0 & 63
            r0 = r0 | r4
            byte r0 = (byte) r0
            r10[r1] = r0
            int r1 = r3 + 1
            r6 = r6 & 63
            r6 = r6 | r4
            goto L_0x002d
        L_0x0075:
            int r0 = r12 + -4
            if (r3 > r0) goto L_0x00c0
            int r5 = r7 + 1
            int r0 = r9.length()
            if (r5 == r0) goto L_0x00b8
            char r1 = r9.charAt(r5)
            boolean r0 = java.lang.Character.isSurrogatePair(r6, r1)
            if (r0 == 0) goto L_0x00b7
            int r6 = java.lang.Character.toCodePoint(r6, r1)
            int r1 = r3 + 1
            int r0 = r6 >>> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            byte r0 = (byte) r0
            r10[r3] = r0
            int r3 = r1 + 1
            int r0 = r6 >>> 12
            r0 = r0 & 63
            r0 = r0 | r4
            byte r0 = (byte) r0
            r10[r1] = r0
            int r1 = r3 + 1
            int r0 = r6 >>> 6
            r0 = r0 & 63
            r0 = r0 | r4
            byte r0 = (byte) r0
            r10[r3] = r0
            int r3 = r1 + 1
            r0 = r6 & 63
            r0 = r0 | r4
            byte r0 = (byte) r0
            r10[r1] = r0
            r7 = r5
            goto L_0x0031
        L_0x00b7:
            r7 = r5
        L_0x00b8:
            int r0 = r7 + -1
            X.RKp r1 = new X.RKp
            r1.<init>(r0, r2)
            throw r1
        L_0x00c0:
            if (r1 > r6) goto L_0x00dc
            if (r6 > r5) goto L_0x00dc
            int r1 = r7 + 1
            int r0 = r9.length()
            if (r1 == r0) goto L_0x00d6
            char r0 = r9.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r6, r0)
            if (r0 != 0) goto L_0x00dc
        L_0x00d6:
            X.RKp r1 = new X.RKp
            r1.<init>(r7, r2)
            throw r1
        L_0x00dc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 496(0x1f0, float:6.95E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " at index "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284205Lj.A00(java.lang.CharSequence, byte[], int, int):int");
    }
}
