package X;

import java.io.IOException;

/* renamed from: X.9CN  reason: invalid class name */
public abstract class AnonymousClass9CN {
    public static int A01(AnonymousClass9CM r1, C374899Bg r2, Object obj, byte[] bArr, int i, int i2, int i3) {
        Object obj2 = obj;
        int A0G = ((AnonymousClass9C9) r2).A0G(r1, obj2, bArr, i, i2, i3);
        r1.A02 = obj2;
        return A0G;
    }

    public static int A02(AnonymousClass9CM r4, C374899Bg r5, byte[] bArr, int i, int i2, int i3) {
        C374899Bg r2 = r5;
        AnonymousClass972 Cr8 = r5.Cr8();
        AnonymousClass9CM r1 = r4;
        int A01 = A01(r1, r2, Cr8, bArr, i, i2, i3);
        r2.ClW(Cr8);
        r1.A02 = Cr8;
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public static int A03(AnonymousClass9CM r8, AnonymousClass975 r9, byte[] bArr, int i, int i2, int i3) {
        Object A01;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            AnonymousClass9CM r3 = r8;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A06 = A06(r8, bArr, i2);
                r9.A02(i, Long.valueOf(r8.A01));
                return A06;
            } else if (i5 == 1) {
                r9.A02(i, Long.valueOf(A09(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A05 = A05(r8, bArr, i2);
                int i6 = r8.A00;
                if (i6 < 0) {
                    ? iOException = new IOException(C273654mx.A00(6));
                    iOException.A00 = null;
                    throw iOException;
                } else if (i6 <= bArr.length - A05) {
                    if (i6 == 0) {
                        A01 = AnonymousClass97R.A01;
                    } else {
                        A01 = AnonymousClass97R.A01(bArr, A05, i6);
                    }
                    r9.A02(i, A01);
                    return A05 + i6;
                } else {
                    throw AnonymousClass9GO.A01();
                }
            } else if (i5 == 3) {
                AnonymousClass975 r4 = new AnonymousClass975();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A05(r3, bArr, i4);
                    i8 = r3.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A03(r3, r4, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    ? iOException2 = new IOException("Failed to parse the message.");
                    iOException2.A00 = null;
                    throw iOException2;
                }
                r9.A02(i, r4);
                return i4;
            } else if (i5 == 5) {
                r9.A02(i, Integer.valueOf(A08(bArr, i2)));
                return i2 + 4;
            }
        }
        ? iOException3 = new IOException(Pxd.A00(16));
        iOException3.A00 = null;
        throw iOException3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.AnonymousClass9CM r6, X.C374899Bg r7, java.lang.Object r8, byte[] r9, int r10, int r11) {
        /*
            int r4 = r10 + 1
            r3 = r9
            byte r5 = r9[r10]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = A07(r6, r9, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x001c
        L_0x0010:
            int r11 = r11 - r4
            if (r5 > r11) goto L_0x001c
            int r5 = r5 + r4
            r0 = r7
            r2 = r8
            r0.Co8(r1, r2, r3, r4, r5)
            r6.A02 = r8
            return r5
        L_0x001c:
            X.9GO r0 = X.AnonymousClass9GO.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9CN.A00(X.9CM, X.9Bg, java.lang.Object, byte[], int, int):int");
    }

    public static int A05(AnonymousClass9CM r2, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A07(r2, bArr, b, i2);
        }
        r2.A00 = b;
        return i2;
    }

    public static int A06(AnonymousClass9CM r7, byte[] bArr, int i) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            r7.A01 = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b & Byte.MAX_VALUE)) << i4;
            i3++;
        }
        r7.A01 = j2;
        return i3;
    }

    public static int A07(AnonymousClass9CM r5, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i & 127;
        int i7 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i3 = b << 7;
        } else {
            int i8 = i6 | ((b & Byte.MAX_VALUE) << 7);
            int i9 = i7 + 1;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i6 = i8 | ((b2 & Byte.MAX_VALUE) << 14);
                i7 = i9 + 1;
                byte b3 = bArr[i9];
                i3 = b3 << 21;
                if (b3 < 0) {
                    i8 = i6 | ((b3 & Byte.MAX_VALUE) << 21);
                    i9 = i7 + 1;
                    byte b4 = bArr[i7];
                    i4 = b4 << 28;
                    if (b4 < 0) {
                        i5 = i8 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            i7 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                break;
                            }
                            i9 = i7;
                        }
                        r5.A00 = i5;
                        return i7;
                    }
                }
            }
            r5.A00 = i8 | i4;
            return i9;
        }
        i5 = i6 | i3;
        r5.A00 = i5;
        return i7;
    }

    public static int A08(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long A09(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public static int A04(AnonymousClass9CM r3, byte[] bArr, int i) {
        int A05 = A05(r3, bArr, i);
        int i2 = r3.A00;
        if (i2 < 0) {
            ? iOException = new IOException(C273654mx.A00(6));
            iOException.A00 = null;
            throw iOException;
        } else if (i2 > bArr.length - A05) {
            throw AnonymousClass9GO.A01();
        } else if (i2 == 0) {
            r3.A02 = AnonymousClass97R.A01;
            return A05;
        } else {
            r3.A02 = AnonymousClass97R.A01(bArr, A05, i2);
            return A05 + i2;
        }
    }
}
