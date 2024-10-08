package X;

/* renamed from: X.6M2  reason: invalid class name */
public final class AnonymousClass6M2 extends C253133qG {
    public final int A02(CharSequence charSequence, int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = -1;
        loop0:
        while (i3 < i4) {
            int codePointAt = Character.codePointAt(charSequence, i3);
            if (i2 - i5 < 22) {
                while (true) {
                    if (i5 < i2) {
                        if (codePointAt == iArr[i5]) {
                            break;
                        }
                        i5 += 2;
                    } else {
                        break loop0;
                    }
                }
            } else {
                int i7 = i5;
                int i8 = i2 - 1;
                while (true) {
                    if (i7 <= i8) {
                        i5 = ((i7 + i8) >>> 2) << 1;
                        int i9 = iArr[i5];
                        if (i9 >= codePointAt) {
                            if (i9 <= codePointAt) {
                                break;
                            }
                            i8 = i5 - 2;
                        } else {
                            i7 = i5 + 2;
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            int i10 = iArr[i5 + 1];
            if (i10 < 0) {
                break;
            }
            i3 += Character.charCount(codePointAt);
            i5 = i10 >>> 16;
            i2 = i10 & 65535;
            if (iArr[i5] == 0 && i3 <= i4) {
                i6 = i3;
            }
        }
        return i6;
    }

    public final int A03(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
        loop0:
        while (i6 < i4) {
            int i8 = i6 + 1;
            int i9 = iArr2[i6];
            if (i2 - i5 < 22) {
                while (true) {
                    if (i5 < i2) {
                        if (i9 == iArr[i5]) {
                            break;
                        }
                        i5 += 2;
                    } else {
                        break loop0;
                    }
                }
            } else {
                int i10 = i5;
                int i11 = i2 - 1;
                while (true) {
                    if (i10 <= i11) {
                        i5 = ((i10 + i11) >>> 2) << 1;
                        int i12 = iArr[i5];
                        if (i12 >= i9) {
                            if (i12 <= i9) {
                                break;
                            }
                            i11 = i5 - 2;
                        } else {
                            i10 = i5 + 2;
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            int i13 = iArr[i5 + 1];
            if (i13 < 0) {
                break;
            }
            i5 = i13 >>> 16;
            i2 = i13 & 65535;
            if (iArr[i5] == 0 && i8 <= i4) {
                i7 = i8;
            }
            i6 = i8;
        }
        return i7;
    }
}
