package X;

/* renamed from: X.HQk  reason: case insensitive filesystem */
public final class C54730HQk {
    public int A00;
    public int A01;
    public C54723HQc A02;
    public String A03;

    public final int A00() {
        C54723HQc hQc = this.A02;
        int length = this.A03.length();
        if (hQc != null) {
            return (length - (this.A00 - this.A01)) + (hQc.A00 - (hQc.A01 - hQc.A02));
        }
        return length;
    }

    /* JADX WARNING: type inference failed for: r0v26, types: [java.lang.Object, X.HQc] */
    public final void A01(int i, int i2, String str) {
        int i3;
        if (i > i2) {
            throw C51971G9r.A0l("start index must be less than or equal to end index: ", " > ", i, i2);
        } else if (i >= 0) {
            C54723HQc hQc = this.A02;
            if (hQc == null) {
                int length = str.length();
                int max = Math.max(255, length + 128);
                char[] cArr = new char[max];
                int min = Math.min(i, 64);
                String str2 = this.A03;
                int min2 = Math.min(str2.length() - i2, 64);
                int i4 = i - min;
                String A002 = AnonymousClass000.A00(336);
                0qQ.A0C(str2, A002);
                str2.getChars(i4, i, cArr, 0);
                String str3 = this.A03;
                int i5 = max - min2;
                int i6 = min2 + i2;
                0qQ.A0C(str3, A002);
                str3.getChars(i2, i6, cArr, i5);
                0qQ.A0C(str, A002);
                str.getChars(0, length, cArr, min);
                ? obj = new Object();
                obj.A00 = max;
                obj.A03 = cArr;
                obj.A02 = min + length;
                obj.A01 = i5;
                this.A02 = obj;
                this.A01 = i4;
                this.A00 = i6;
                return;
            }
            int i7 = this.A01;
            int i8 = i - i7;
            int i9 = i2 - i7;
            if (i8 >= 0) {
                int i10 = hQc.A00;
                int i11 = hQc.A01;
                int i12 = hQc.A02;
                int i13 = i11 - i12;
                if (i9 <= i10 - i13) {
                    int length2 = str.length();
                    int i14 = length2 - (i9 - i8);
                    if (i14 > i13) {
                        int i15 = i10;
                        do {
                            i15 *= 2;
                        } while (i15 - i10 < i14 - i13);
                        char[] cArr2 = new char[i15];
                        char[] cArr3 = hQc.A03;
                        0qQ.A0B(cArr3, 0);
                        System.arraycopy(cArr3, 0, cArr2, 0, i12);
                        int i16 = hQc.A00;
                        int i17 = hQc.A01;
                        int i18 = i16 - i17;
                        i11 = i15 - i18;
                        char[] cArr4 = hQc.A03;
                        0qQ.A0B(cArr4, 0);
                        System.arraycopy(cArr4, i17, cArr2, i11, (i18 + i17) - i17);
                        hQc.A03 = cArr2;
                        hQc.A00 = i15;
                        hQc.A01 = i11;
                    }
                    int i19 = hQc.A02;
                    if (i8 < i19 && i9 <= i19) {
                        int i20 = i19 - i9;
                        char[] cArr5 = hQc.A03;
                        0qQ.A0B(cArr5, 0);
                        System.arraycopy(cArr5, i9, cArr5, i11 - i20, i19 - i9);
                        hQc.A02 = i8;
                        i3 = hQc.A01 - i20;
                    } else if (i8 >= i19 || i9 < i19) {
                        int i21 = i11 - i19;
                        int i22 = i8 + i21;
                        i3 = i9 + i21;
                        char[] cArr6 = hQc.A03;
                        0qQ.A0B(cArr6, 0);
                        System.arraycopy(cArr6, i11, cArr6, i19, i22 - i11);
                        i8 = hQc.A02 + (i22 - i11);
                        hQc.A02 = i8;
                    } else {
                        hQc.A01 = i9 + (i11 - i19);
                        hQc.A02 = i8;
                        char[] cArr7 = hQc.A03;
                        0qQ.A0C(str, AnonymousClass000.A00(336));
                        str.getChars(0, length2, cArr7, i8);
                        hQc.A02 += length2;
                        return;
                    }
                    hQc.A01 = i3;
                    char[] cArr72 = hQc.A03;
                    0qQ.A0C(str, AnonymousClass000.A00(336));
                    str.getChars(0, length2, cArr72, i8);
                    hQc.A02 += length2;
                    return;
                }
            }
            this.A03 = toString();
            this.A02 = null;
            this.A01 = -1;
            this.A00 = -1;
            A01(i, i2, str);
        } else {
            throw DbW.A0a("start must be non-negative, but was ", i);
        }
    }

    public final String toString() {
        C54723HQc hQc = this.A02;
        if (hQc == null) {
            return this.A03;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A03, 0, this.A01);
        A1A.append(hQc.A03, 0, hQc.A02);
        char[] cArr = hQc.A03;
        int i = hQc.A01;
        A1A.append(cArr, i, hQc.A00 - i);
        String str = this.A03;
        A1A.append(str, this.A00, str.length());
        return A1A.toString();
    }
}
