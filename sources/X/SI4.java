package X;

public final class SI4 {
    public SI4() {
        this(0);
    }

    public SI4(int i) {
    }

    public final boolean A01(byte[] bArr, int i, int i2) {
        return A00(bArr, i, i2) == 0;
    }

    public final int A00(byte[] bArr, int i, int i2) {
        byte b;
        while (r11 < i2 && bArr[r11] >= 0) {
            i = r11 + 1;
        }
        if (r11 < i2) {
            while (r11 < i2) {
                int i3 = r11 + 1;
                byte b2 = bArr[r11];
                if (b2 < 0) {
                    if (b2 >= -32) {
                        if (b2 < -16) {
                            if (i3 < i2 - 1) {
                                int i4 = i3 + 1;
                                byte b3 = bArr[i3];
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
                                r11 = i4 + 1;
                                b = bArr[i4];
                            }
                        } else if (i3 < i2 - 2) {
                            int i5 = i3 + 1;
                            byte b4 = bArr[i3];
                            if (b4 > -65 || Pxi.A04(b2, b4) != 0) {
                                return -1;
                            }
                            int i6 = i5 + 1;
                            if (bArr[i5] > -65) {
                                return -1;
                            }
                            i3 = i6 + 1;
                            if (bArr[i6] > -65) {
                                return -1;
                            }
                        }
                        return C11412SSk.A02(bArr, i3, i2);
                    } else if (i3 >= i2) {
                        return b2;
                    } else {
                        if (b2 < -62) {
                            return -1;
                        }
                        r11 = i3 + 1;
                        b = bArr[i3];
                    }
                    if (b > -65) {
                        return -1;
                    }
                }
                r11 = i3;
            }
        }
        return 0;
    }
}
