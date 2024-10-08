package X;

public abstract class SUP {
    public static int A04(SFE sfe, C13845TiL tiL, Object obj, byte[] bArr, int i, int i2, int i3) {
        Object obj2 = obj;
        int A0U = ((C12589Syo) tiL).A0U(sfe, obj2, bArr, i, i2, i3);
        sfe.A02 = obj2;
        return A0U;
    }

    public static int A05(SFE sfe, C13845TiL tiL, byte[] bArr, int i, int i2) {
        C13845TiL tiL2 = tiL;
        C8563Qx1 FPb = tiL.FPb();
        SFE sfe2 = sfe;
        int A03 = A03(sfe2, tiL2, FPb, bArr, i, i2);
        tiL2.FPl(FPb);
        sfe2.A02 = FPb;
        return A03;
    }

    public static int A06(SFE sfe, C13845TiL tiL, byte[] bArr, int i, int i2, int i3) {
        C13845TiL tiL2 = tiL;
        C8563Qx1 FPb = tiL.FPb();
        SFE sfe2 = sfe;
        int A04 = A04(sfe2, tiL2, FPb, bArr, i, i2, i3);
        tiL2.FPl(FPb);
        sfe2.A02 = FPb;
        return A04;
    }

    public static int A07(SFE sfe, STV stv, byte[] bArr, int i, int i2, int i3) {
        Object A01;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            SFE sfe2 = sfe;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A0A = A0A(sfe, bArr, i2);
                stv.A08(i, Long.valueOf(sfe.A01));
                return A0A;
            } else if (i5 == 1) {
                stv.A08(i, Long.valueOf(A0D(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A09 = A09(sfe, bArr, i2);
                int i6 = sfe.A00;
                if (i6 < 0) {
                    throw C8842RCi.A03();
                } else if (i6 <= bArr.length - A09) {
                    if (i6 == 0) {
                        A01 = TAQ.A01;
                    } else {
                        A01 = TAQ.A01(bArr, A09, i6);
                    }
                    stv.A08(i, A01);
                    return A09 + i6;
                } else {
                    throw C8842RCi.A05();
                }
            } else if (i5 == 3) {
                int i7 = (i & -8) | 4;
                STV A012 = STV.A01();
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A09(sfe2, bArr, i4);
                    i8 = sfe2.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A07(sfe2, A012, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw C8842RCi.A04();
                }
                stv.A08(i, A012);
                return i4;
            } else if (i5 == 5) {
                stv.A08(i, Integer.valueOf(A0C(bArr, i2)));
                return i2 + 4;
            }
        }
        throw C8842RCi.A01();
    }

    public static int A01(SFE sfe, C13984Tna tna, byte[] bArr, int i) {
        C8564Qx2 qx2 = (C8564Qx2) tna;
        int A09 = A09(sfe, bArr, i);
        int i2 = sfe.A00 + A09;
        while (A09 < i2) {
            A09 = A09(sfe, bArr, A09);
            qx2.FPw(sfe.A00);
        }
        if (A09 == i2) {
            return A09;
        }
        throw C8842RCi.A05();
    }

    public static int A02(SFE sfe, C13984Tna tna, byte[] bArr, int i, int i2, int i3) {
        int A09;
        C8564Qx2 qx2 = (C8564Qx2) tna;
        do {
            A09 = A09(sfe, bArr, i2);
            qx2.FPw(sfe.A00);
            if (A09 >= i3) {
                break;
            }
            i2 = A09(sfe, bArr, A09);
        } while (i == sfe.A00);
        return A09;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A03(X.SFE r6, X.C13845TiL r7, java.lang.Object r8, byte[] r9, int r10, int r11) {
        /*
            int r4 = r10 + 1
            r3 = r9
            byte r5 = r9[r10]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = A0B(r6, r9, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x001c
        L_0x0010:
            int r11 = r11 - r4
            if (r5 > r11) goto L_0x001c
            int r5 = r5 + r4
            r0 = r7
            r2 = r8
            r0.FPz(r1, r2, r3, r4, r5)
            r6.A02 = r8
            return r5
        L_0x001c:
            X.RCi r0 = X.C8842RCi.A05()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUP.A03(X.SFE, X.TiL, java.lang.Object, byte[], int, int):int");
    }

    public static int A09(SFE sfe, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A0B(sfe, bArr, b, i2);
        }
        sfe.A00 = b;
        return i2;
    }

    public static int A0A(SFE sfe, byte[] bArr, int i) {
        long j = (long) bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            sfe.A01 = j;
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
        sfe.A01 = j2;
        return i3;
    }

    public static int A0B(SFE sfe, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        byte b = bArr[i2];
        int i6 = i2 + 1;
        int i7 = i & 127;
        if (b >= 0) {
            i3 = b << 7;
        } else {
            int i8 = i7 | ((b & Byte.MAX_VALUE) << 7);
            int i9 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i7 = i8 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i9 + 1;
                byte b3 = bArr[i9];
                i3 = b3 << 21;
                if (b3 < 0) {
                    i8 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
                    i9 = i6 + 1;
                    byte b4 = bArr[i6];
                    i4 = b4 << 28;
                    if (b4 < 0) {
                        i5 = i8 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            i6 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                break;
                            }
                            i9 = i6;
                        }
                        sfe.A00 = i5;
                        return i6;
                    }
                }
            }
            sfe.A00 = i8 | i4;
            return i9;
        }
        i5 = i7 | i3;
        sfe.A00 = i5;
        return i6;
    }

    public static int A0C(byte[] bArr, int i) {
        byte b = bArr[i] & 255;
        byte b2 = bArr[i + 1] & 255;
        byte b3 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (b2 << 8) | b | (b3 << 16);
    }

    public static int A00(SFE sfe, C13984Tna tna, C13845TiL tiL, byte[] bArr, int i, int i2, int i3) {
        int A05;
        do {
            A05 = A05(sfe, tiL, bArr, i2, i3);
            tna.add(sfe.A02);
            if (A05 >= i3) {
                break;
            }
            i2 = A09(sfe, bArr, A05);
        } while (i == sfe.A00);
        return A05;
    }

    public static int A08(SFE sfe, byte[] bArr, int i) {
        int A09 = A09(sfe, bArr, i);
        int i2 = sfe.A00;
        if (i2 < 0) {
            throw C8842RCi.A03();
        } else if (i2 > bArr.length - A09) {
            throw C8842RCi.A05();
        } else if (i2 == 0) {
            sfe.A02 = TAQ.A01;
            return A09;
        } else {
            sfe.A02 = TAQ.A01(bArr, A09, i2);
            return A09 + i2;
        }
    }

    public static long A0D(byte[] bArr, int i) {
        return Pxk.A07(bArr, i);
    }
}
