package X;

public abstract class SU4 {
    public static int A01(SFF sff, C13903TjQ tjQ, byte[] bArr, int i, int i2, int i3) {
        T5N t5n = (T5N) tjQ;
        Object Cr9 = t5n.Cr9();
        int A0Q = t5n.A0Q(sff, Cr9, bArr, i, i2, i3);
        t5n.ClW(Cr9);
        sff.A02 = Cr9;
        return A0Q;
    }

    public static int A02(SFF sff, C11289SJn sJn, byte[] bArr, int i, int i2, int i3) {
        Object A01;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            SFF sff2 = sff;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A06 = A06(sff, bArr, i2);
                sJn.A01(i, Long.valueOf(sff.A01));
                return A06;
            } else if (i5 == 1) {
                sJn.A01(i, Long.valueOf(A09(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A05 = A05(sff, bArr, i2);
                int i6 = sff.A00;
                if (i6 < 0) {
                    throw AnonymousClass5I7.A01();
                } else if (i6 <= bArr.length - A05) {
                    if (i6 == 0) {
                        A01 = TAP.A01;
                    } else {
                        A01 = TAP.A01(bArr, A05, i6);
                    }
                    sJn.A01(i, A01);
                    return A05 + i6;
                } else {
                    throw AnonymousClass5I7.A02();
                }
            } else if (i5 == 3) {
                C11289SJn sJn2 = new C11289SJn();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A05(sff2, bArr, i4);
                    i8 = sff2.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A02(sff2, sJn2, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw Pxg.A0T("Failed to parse the message.");
                }
                sJn.A01(i, sJn2);
                return i4;
            } else if (i5 == 5) {
                sJn.A01(i, Integer.valueOf(Pxk.A02(bArr, i2)));
                return i2 + 4;
            }
        }
        throw Pxg.A0T("Protocol message contained an invalid tag (zero).");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.SFF r6, X.C13903TjQ r7, byte[] r8, int r9, int r10) {
        /*
            int r4 = r9 + 1
            r3 = r8
            byte r5 = r8[r9]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = A07(r6, r8, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x0022
        L_0x0010:
            int r10 = r10 - r4
            if (r5 > r10) goto L_0x0022
            r0 = r7
            java.lang.Object r2 = r7.Cr9()
            int r5 = r5 + r4
            r0.CoA(r1, r2, r3, r4, r5)
            r7.ClW(r2)
            r6.A02 = r2
            return r5
        L_0x0022:
            X.5I7 r0 = X.AnonymousClass5I7.A02()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SU4.A00(X.SFF, X.TjQ, byte[], int, int):int");
    }

    public static int A05(SFF sff, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A07(sff, bArr, b, i2);
        }
        sff.A00 = b;
        return i2;
    }

    public static int A06(SFF sff, byte[] bArr, int i) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            sff.A01 = j;
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
        sff.A01 = j2;
        return i3;
    }

    public static int A07(SFF sff, byte[] bArr, int i, int i2) {
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
                        sff.A00 = i5;
                        return i7;
                    }
                }
            }
            sff.A00 = i8 | i4;
            return i9;
        }
        i5 = i6 | i3;
        sff.A00 = i5;
        return i7;
    }

    public static int A08(SFF sff, byte[] bArr, int i, int i2, int i3) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return A06(sff, bArr, i2);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return A05(sff, bArr, i2) + sff.A00;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = A05(sff, bArr, i2);
                    i6 = sff.A00;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = A08(sff, bArr, i6, i2, i3);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw Pxg.A0T("Failed to parse the message.");
            } else if (i4 == 5) {
                return i2 + 4;
            }
        }
        throw Pxg.A0T("Protocol message contained an invalid tag (zero).");
    }

    public static long A09(byte[] bArr, int i) {
        return (Pxe.A0D(bArr, i + 7) << 56) | Pxg.A0C(bArr[i + 2], (((long) bArr[i]) & 255) | (Pxe.A0D(bArr, i + 1) << 8)) | (Pxe.A0D(bArr, i + 3) << 24) | (Pxe.A0D(bArr, i + 4) << 32) | (Pxe.A0D(bArr, i + 5) << 40) | (Pxe.A0D(bArr, i + 6) << 48);
    }

    public static int A03(SFF sff, byte[] bArr, int i) {
        int A05 = A05(sff, bArr, i);
        int i2 = sff.A00;
        if (i2 < 0) {
            throw AnonymousClass5I7.A01();
        } else if (i2 > bArr.length - A05) {
            throw AnonymousClass5I7.A02();
        } else if (i2 == 0) {
            sff.A02 = TAP.A01;
            return A05;
        } else {
            sff.A02 = TAP.A01(bArr, A05, i2);
            return A05 + i2;
        }
    }

    public static int A04(SFF sff, byte[] bArr, int i) {
        int A05 = A05(sff, bArr, i);
        int i2 = sff.A00;
        if (i2 < 0) {
            throw AnonymousClass5I7.A01();
        } else if (i2 == 0) {
            sff.A02 = "";
            return A05;
        } else {
            sff.A02 = SC5.A00.A04(bArr, A05, i2);
            return A05 + i2;
        }
    }
}
