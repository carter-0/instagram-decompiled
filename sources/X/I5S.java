package X;

public abstract class I5S {
    public static final int[] A00;

    public static final int A00(String str, I0g i0g) {
        int i;
        AnonymousClass7TF.A1H(str, i0g);
        int length = str.length();
        int i2 = 0;
        C60370gV.A01(length, length);
        C56544I0y i0y = i0g.A00;
        if (i0y.A02) {
            A01(str, 0, length);
        } else {
            String str2 = i0y.A00;
            boolean z = i0y.A01;
            int i3 = 0;
            i2 = str2.length();
            int i4 = length - i2;
            int length2 = "".length();
            if (i4 <= length2) {
                throw new NumberFormatException(002.A13("Expected a hexadecimal number with prefix \"", str2, "\" and suffix \"", "", "\", but was ", C51967G9n.A0q(str, 0, length)));
            }
            if (i2 != 0) {
                for (int i5 = 0; i5 < i2; i5++) {
                    if (!C300995yI.A02(str2.charAt(i5), str.charAt(i5), z)) {
                        A02(str, str2, "prefix", 0, length);
                        break;
                    }
                }
                i3 = i2;
            }
            int i6 = length - length2;
            if (length2 != 0) {
                for (int i7 = 0; i7 < length2; i7++) {
                    if (!C300995yI.A02("".charAt(i7), str.charAt(i6 + i7), z)) {
                        A02(str, "", "suffix", i6, length);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            A01(str, i3, i6);
            length = i6;
        }
        int i8 = 0;
        while (i2 < length) {
            int i9 = i8 << 4;
            char charAt = str.charAt(i2);
            if ((charAt >>> 8) != 0 || (i = A00[charAt]) < 0) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Expected a hexadecimal digit at index ");
                A1A.append(i2);
                A1A.append(", but was ");
                throw new NumberFormatException(C51967G9n.A0r(A1A, str.charAt(i2)));
            }
            i8 = i9 | i;
            i2++;
        }
        return i8;
    }

    static {
        int length;
        int length2;
        for (int i = 0; i < 256; i++) {
            "0123456789abcdef".charAt(i >> 4);
            "0123456789abcdef".charAt(i & 15);
        }
        for (int i2 = 0; i2 < 256; i2++) {
            "0123456789ABCDEF".charAt(i2 >> 4);
            "0123456789ABCDEF".charAt(i2 & 15);
        }
        int[] iArr = new int[256];
        int i3 = 0;
        do {
            iArr[i3] = -1;
            i3++;
        } while (i3 < 256);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = "0123456789abcdef".length();
            if (i4 >= length) {
                break;
            }
            iArr["0123456789abcdef".charAt(i4)] = i5;
            i4++;
            i5++;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            length2 = "0123456789ABCDEF".length();
            if (i6 >= length2) {
                break;
            }
            iArr["0123456789ABCDEF".charAt(i6)] = i7;
            i6++;
            i7++;
        }
        A00 = iArr;
        int i8 = 0;
        do {
            i8++;
        } while (i8 < 256);
        for (int i9 = 0; i9 < length; i9++) {
            "0123456789abcdef".charAt(i9);
        }
        for (int i10 = 0; i10 < length2; i10++) {
            "0123456789ABCDEF".charAt(i10);
        }
    }

    public static final void A01(String str, int i, int i2) {
        if (i >= i2 || i2 - i > 8) {
            String A0q = C51967G9n.A0q(str, i, i2);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Expected ");
            A1A.append("at most");
            A1A.append(' ');
            A1A.append(8);
            A1A.append(" hexadecimal digits at index ");
            A1A.append(i);
            A1A.append(", but was ");
            A1A.append(A0q);
            A1A.append(" of length ");
            A1A.append(i2 - i);
            throw new NumberFormatException(A1A.toString());
        }
    }

    public static final void A02(String str, String str2, String str3, int i, int i2) {
        int A05 = C51966G9m.A05(str2, i);
        if (A05 > i2) {
            A05 = i2;
        }
        String A0q = C51967G9n.A0q(str, i, A05);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Expected ");
        A1A.append(str3);
        A1A.append(" \"");
        A1A.append(str2);
        A1A.append("\" at index ");
        A1A.append(i);
        A1A.append(", but was ");
        throw new NumberFormatException(AnonymousClass7TF.A0l(A0q, A1A));
    }
}
