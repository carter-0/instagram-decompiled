package X;

/* renamed from: X.Rzr  reason: case insensitive filesystem */
public final class C10891Rzr {
    public final boolean A00(byte[] bArr, int i, int i2) {
        int i3;
        byte b;
        byte b2;
        while (r11 < i2 && bArr[r11] >= 0) {
            i = r11 + 1;
        }
        if (r11 < i2) {
            while (true) {
                if (r11 >= i2) {
                    break;
                }
                i3 = r11 + 1;
                byte b3 = bArr[r11];
                if (b3 < 0) {
                    if (b3 >= -32) {
                        if (b3 >= -16) {
                            if (i3 >= i2 - 2) {
                                break;
                            }
                            int i4 = i3 + 1;
                            byte b4 = bArr[i3];
                            if (b4 > -65 || Pxi.A04(b3, b4) != 0) {
                                return false;
                            }
                            int i5 = i4 + 1;
                            if (bArr[i4] > -65) {
                                return false;
                            }
                            i3 = i5 + 1;
                            if (bArr[i5] > -65) {
                                return false;
                            }
                        } else if (i3 >= i2 - 1) {
                            break;
                        } else {
                            int i6 = i3 + 1;
                            byte b5 = bArr[i3];
                            if (b5 > -65) {
                                return false;
                            }
                            if (b3 == -32) {
                                if (b5 < -96) {
                                    return false;
                                }
                            } else if (b3 == -19 && b5 >= -96) {
                                return false;
                            }
                            r11 = i6 + 1;
                            b2 = bArr[i6];
                        }
                    } else if (i3 >= i2 || b3 < -62) {
                        return false;
                    } else {
                        r11 = i3 + 1;
                        b2 = bArr[i3];
                    }
                    if (b2 > -65) {
                        return false;
                    }
                }
                r11 = i3;
            }
            C10891Rzr rzr = C9991Rkl.A00;
            int i7 = i2 - i3;
            byte b6 = bArr[i3 - 1];
            if (i7 == 0) {
                return false;
            }
            if (i7 == 1) {
                byte b7 = bArr[i3];
                if (b6 > -12 || b7 > -65) {
                    return false;
                }
                b = (b7 << 8) ^ b6;
            } else if (i7 == 2) {
                byte b8 = bArr[i3];
                byte b9 = bArr[i3 + 1];
                if (b6 > -12 || b8 > -65 || b9 > -65) {
                    return false;
                }
                b = (b9 << 16) ^ ((b8 << 8) ^ b6);
            } else {
                throw Pxe.A0d();
            }
            return b == 0;
        }
    }
}
