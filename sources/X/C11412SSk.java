package X;

/* renamed from: X.SSk  reason: case insensitive filesystem */
public abstract class C11412SSk {
    public static final SI4 A00 = new SI4();

    public static /* bridge */ /* synthetic */ int A02(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 != 0) {
            if (i3 == 1) {
                byte b2 = bArr[i];
                if (b > -12 || b2 > -65) {
                    return -1;
                }
                return (b2 << 8) ^ b;
            } else if (i3 == 2) {
                byte b3 = bArr[i];
                byte b4 = bArr[i + 1];
                if (b > -12 || b3 > -65 || b4 > -65) {
                    return -1;
                }
                return (b4 << 16) ^ ((b3 << 8) ^ b);
            } else {
                throw Pxe.A0d();
            }
        } else if (b <= -12) {
            return b;
        } else {
            return -1;
        }
    }

    public static boolean A03(byte[] bArr) {
        return A00.A01(bArr, 0, bArr.length);
    }

    public static boolean A04(byte[] bArr, int i, int i2) {
        return A00.A01(bArr, i, i2);
    }

    static {
        SUg.A0P();
    }

    public static int A00(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                while (i2 < length) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C8997RKq(i2, length);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw Pxg.A0b("UTF-8 length does not fit in int: ", ((long) i3) + 4294967296L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r10 < 2048) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(java.lang.String r11, byte[] r12, int r13, int r14) {
        /*
            int r2 = r11.length()
            r3 = 0
        L_0x0005:
            int r7 = r13 + r14
            r6 = 128(0x80, float:1.794E-43)
            if (r3 >= r2) goto L_0x001b
            int r1 = r3 + r13
            if (r1 >= r7) goto L_0x001b
            char r0 = r11.charAt(r3)
            if (r0 >= r6) goto L_0x001b
            byte r0 = (byte) r0
            r12[r1] = r0
            int r3 = r3 + 1
            goto L_0x0005
        L_0x001b:
            int r4 = r13 + r3
            if (r3 != r2) goto L_0x0022
            int r4 = r13 + r2
        L_0x0021:
            return r4
        L_0x0022:
            if (r3 >= r2) goto L_0x0021
            char r10 = r11.charAt(r3)
            if (r10 >= r6) goto L_0x0035
            if (r4 >= r7) goto L_0x0039
            int r8 = r4 + 1
            byte r0 = (byte) r10
            r12[r4] = r0
        L_0x0031:
            r4 = r8
        L_0x0032:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0035:
            r0 = 2048(0x800, float:2.87E-42)
            if (r10 >= r0) goto L_0x004c
        L_0x0039:
            int r0 = r7 + -2
            if (r4 > r0) goto L_0x004c
            int r5 = r4 + 1
            int r8 = r5 + 1
            int r0 = r10 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            byte r0 = (byte) r0
            r12[r4] = r0
        L_0x0048:
            X.Pxe.A1I(r10, r12, r5)
            goto L_0x0031
        L_0x004c:
            r5 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r10 < r1) goto L_0x0056
            if (r10 <= r5) goto L_0x006d
        L_0x0056:
            int r0 = r7 + -3
            if (r4 > r0) goto L_0x006d
            int r1 = r4 + 1
            int r5 = r1 + 1
            int r8 = r5 + 1
            int r0 = r10 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            r12[r4] = r0
            int r0 = r10 >>> 6
            X.Pxe.A1I(r0, r12, r1)
            goto L_0x0048
        L_0x006d:
            int r0 = r7 + -4
            if (r4 > r0) goto L_0x00aa
            int r9 = r3 + 1
            if (r9 == r2) goto L_0x00a2
            char r1 = r11.charAt(r9)
            boolean r0 = java.lang.Character.isSurrogatePair(r10, r1)
            if (r0 == 0) goto L_0x00a1
            int r8 = r4 + 1
            int r5 = r8 + 1
            int r3 = r5 + 1
            int r1 = java.lang.Character.toCodePoint(r10, r1)
            int r0 = r1 >>> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            byte r0 = (byte) r0
            r12[r4] = r0
            int r0 = r1 >>> 12
            X.Pxe.A1I(r0, r12, r8)
            int r0 = r1 >>> 6
            X.Pxe.A1I(r0, r12, r5)
            int r4 = r3 + 1
            X.Pxe.A1I(r1, r12, r3)
            r3 = r9
            goto L_0x0032
        L_0x00a1:
            r3 = r9
        L_0x00a2:
            int r0 = r3 + -1
            X.RKq r1 = new X.RKq
            r1.<init>(r0, r2)
            throw r1
        L_0x00aa:
            if (r10 < r1) goto L_0x00c2
            if (r10 > r5) goto L_0x00c2
            int r0 = r3 + 1
            if (r0 == r2) goto L_0x00bc
            char r0 = r11.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r10, r0)
            if (r0 != 0) goto L_0x00c2
        L_0x00bc:
            X.RKq r1 = new X.RKq
            r1.<init>(r3, r2)
            throw r1
        L_0x00c2:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed writing "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " at index "
            java.lang.String r0 = X.Pxg.A0t(r0, r1, r4)
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11412SSk.A01(java.lang.String, byte[], int, int):int");
    }
}
