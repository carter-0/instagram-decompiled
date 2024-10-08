package X;

public abstract class STo {
    public static int A01(SFD sfd, C13829Ti0 ti0, Object obj, byte[] bArr, int i, int i2, int i3) {
        Object obj2 = obj;
        int A09 = ((Sy4) ti0).A09(sfd, obj2, bArr, i, i2, i3);
        sfd.A02 = obj2;
        return A09;
    }

    public static int A02(SFD sfd, C13829Ti0 ti0, byte[] bArr, int i, int i2, int i3) {
        C13829Ti0 ti02 = ti0;
        C8424QuF FPU = ti0.FPU();
        SFD sfd2 = sfd;
        int A01 = A01(sfd2, ti02, FPU, bArr, i, i2, i3);
        ti02.FPf(FPU);
        sfd2.A02 = FPU;
        return A01;
    }

    public static int A03(SFD sfd, SRM srm, byte[] bArr, int i, int i2, int i3) {
        Object quH;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            SFD sfd2 = sfd;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A06 = A06(sfd, bArr, i2);
                srm.A02(i, Long.valueOf(sfd.A01));
                return A06;
            } else if (i5 == 1) {
                srm.A02(i, Long.valueOf(Pxk.A07(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A05 = A05(sfd, bArr, i2);
                int i6 = sfd.A00;
                if (i6 >= 0) {
                    int length = bArr.length;
                    if (i6 <= length - A05) {
                        if (i6 == 0) {
                            quH = TAN.A01;
                        } else {
                            TAN.A00(A05, A05 + i6, length);
                            byte[] bArr3 = new byte[i6];
                            System.arraycopy(bArr, A05, bArr3, 0, i6);
                            quH = new C8426QuH(bArr3);
                        }
                        srm.A02(i, quH);
                        return A05 + i6;
                    }
                    throw RCZ.A00(C273654mx.A00(13));
                }
                throw RCZ.A00(C273654mx.A00(6));
            } else if (i5 == 3) {
                int i7 = (i & -8) | 4;
                SRM A00 = SRM.A00();
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A05(sfd2, bArr, i4);
                    i8 = sfd2.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A03(sfd2, A00, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw RCZ.A00("Failed to parse the message.");
                }
                srm.A02(i, A00);
                return i4;
            } else if (i5 == 5) {
                srm.A02(i, Integer.valueOf(A08(bArr, i2)));
                return i2 + 4;
            }
        }
        throw RCZ.A00("Protocol message contained an invalid tag (zero).");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.SFD r6, X.C13829Ti0 r7, java.lang.Object r8, byte[] r9, int r10, int r11) {
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
            r0.FPs(r1, r2, r3, r4, r5)
            r6.A02 = r8
            return r5
        L_0x001c:
            r0 = 13
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.RCZ r0 = X.RCZ.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STo.A00(X.SFD, X.Ti0, java.lang.Object, byte[], int, int):int");
    }

    public static int A05(SFD sfd, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A07(sfd, bArr, b, i2);
        }
        sfd.A00 = b;
        return i2;
    }

    public static int A06(SFD sfd, byte[] bArr, int i) {
        long j = (long) bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            sfd.A01 = j;
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
        sfd.A01 = j2;
        return i3;
    }

    public static int A07(SFD sfd, byte[] bArr, int i, int i2) {
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
                        sfd.A00 = i5;
                        return i6;
                    }
                }
            }
            sfd.A00 = i8 | i4;
            return i9;
        }
        i5 = i7 | i3;
        sfd.A00 = i5;
        return i6;
    }

    public static int A08(byte[] bArr, int i) {
        byte b = bArr[i] & 255;
        byte b2 = bArr[i + 1] & 255;
        byte b3 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (b2 << 8) | b | (b3 << 16);
    }

    public static int A04(SFD sfd, byte[] bArr, int i) {
        int A05 = A05(sfd, bArr, i);
        int i2 = sfd.A00;
        if (i2 >= 0) {
            int length = bArr.length;
            if (i2 > length - A05) {
                throw RCZ.A00(C273654mx.A00(13));
            } else if (i2 == 0) {
                sfd.A02 = TAN.A01;
                return A05;
            } else {
                TAN.A00(A05, A05 + i2, length);
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, A05, bArr2, 0, i2);
                sfd.A02 = new C8426QuH(bArr2);
                return A05 + i2;
            }
        } else {
            throw RCZ.A00(C273654mx.A00(6));
        }
    }
}
