package X;

/* renamed from: X.4nb  reason: invalid class name and case insensitive filesystem */
public final class C274034nb extends C253133qG {
    public final int A02(CharSequence charSequence, int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = -1;
        while (i3 < i4) {
            int codePointAt = Character.codePointAt(charSequence, i3);
            int A00 = A00(iArr, i5, i2, codePointAt);
            if (A00 >= 0) {
                i3 += Character.charCount(codePointAt);
                i5 = A00 >>> 16;
                i2 = A00 & 65535;
                if (iArr[i5] == 0 && i3 <= i4) {
                    i6 = i3;
                }
            } else if (codePointAt != 65038) {
                return i6;
            } else {
                return -1;
            }
        }
        return i6;
    }

    public final int A03(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
        while (i6 < i4) {
            int i8 = i6 + 1;
            int i9 = iArr2[i6];
            int A00 = A00(iArr, i5, i2, i9);
            if (A00 >= 0) {
                i5 = A00 >>> 16;
                i2 = A00 & 65535;
                if (iArr[i5] == 0 && i8 <= i4) {
                    i7 = i8;
                }
                i6 = i8;
            } else if (i9 != 65038) {
                return i7;
            } else {
                return -1;
            }
        }
        return i7;
    }

    public static int A00(int[] iArr, int i, int i2, int i3) {
        int i4;
        if (i3 > 8264) {
            int i5 = i2 - 1;
            while (i <= i5) {
                int i6 = ((i + i5) >>> 2) << 1;
                int i7 = iArr[i6];
                if (i7 >= i3) {
                    if (i7 <= i3) {
                        i4 = i6 + 1;
                        break;
                    }
                    i5 = i6 - 2;
                } else {
                    i = i6 + 2;
                }
            }
            if (i >= i2) {
                return -2;
            }
        } else {
            while (i < i2) {
                if (i3 > iArr[i]) {
                    i += 2;
                }
            }
            return -2;
        }
        i4 = i + 1;
        return iArr[i4];
    }

    public C274034nb(int[] iArr, int i) {
        super(iArr, i);
    }
}
