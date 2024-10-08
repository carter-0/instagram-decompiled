package X;

import android.util.Log;

/* renamed from: X.8kv  reason: invalid class name and case insensitive filesystem */
public abstract class C364138kv {
    public static int A00(byte[] bArr) {
        String str;
        String str2;
        if (bArr != null) {
            int i = 0;
            while (true) {
                int i2 = i + 3;
                int length = bArr.length;
                boolean z = true;
                if (i2 >= length) {
                    break;
                }
                int i3 = i + 1;
                if ((bArr[i] & 255) != 255) {
                    break;
                }
                byte b = bArr[i3] & 255;
                if (b != 255) {
                    i3++;
                    if (!(b == 216 || b == 1)) {
                        if (b == 217 || b == 218) {
                            break;
                        }
                        int A01 = A01(bArr, i3, 2, false);
                        if (A01 < 2 || (i = i3 + A01) > length) {
                            str = "ExifUtil";
                            str2 = "Invalid length";
                        } else if (b == 225 && A01 >= 8 && A01(bArr, i3 + 2, 4, false) == 1165519206 && A01(bArr, i3 + 6, 2, false) == 0) {
                            int i4 = i3 + 8;
                            int i5 = A01 - 8;
                            if (i5 > 8) {
                                int A012 = A01(bArr, i4, 4, false);
                                if (A012 != 1229531648) {
                                    if (A012 != 1296891946) {
                                        str = "ExifUtil";
                                        str2 = "Invalid byte order";
                                    } else {
                                        z = false;
                                    }
                                }
                                int A013 = A01(bArr, i4 + 4, 4, z) + 2;
                                if (A013 >= 10 && A013 <= i5) {
                                    int i6 = i4 + A013;
                                    int i7 = i5 - A013;
                                    int A014 = A01(bArr, i6 - 2, 2, z);
                                    while (true) {
                                        int i8 = A014 - 1;
                                        if (A014 <= 0 || i7 < 12) {
                                            break;
                                        } else if (A01(bArr, i6, 2, z) == 274) {
                                            switch (A01(bArr, i6 + 8, 2, z)) {
                                                case 3:
                                                case 4:
                                                    return 180;
                                                case 5:
                                                case 8:
                                                    return 270;
                                                case 6:
                                                case 7:
                                                    return 90;
                                                default:
                                                    return 0;
                                            }
                                        } else {
                                            i6 += 12;
                                            i7 -= 12;
                                            A014 = i8;
                                        }
                                    }
                                } else {
                                    str = "ExifUtil";
                                    str2 = "Invalid offset";
                                }
                            }
                        }
                    }
                }
                i = i3;
            }
            str = "ExifUtil";
            str2 = "Invalid length";
            Log.e(str, str2);
        }
        return 0;
    }

    public static int A01(byte[] bArr, int i, int i2, boolean z) {
        int i3 = 1;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        }
        byte b = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return b;
            }
            b = (bArr[i] & 255) | (b << 8);
            i += i3;
            i2 = i4;
        }
    }
}
