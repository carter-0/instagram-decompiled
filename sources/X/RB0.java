package X;

public final class RB0 extends V4Q {
    public static final int[] A01 = {10, 9, 8, 7, 6, 5, 4, 3, 2};
    public static final int[] A02 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    public final C12614Szy A00 = C8637Qya.A00();

    public final Integer A00(String str) {
        0qQ.A0B(str, 0);
        String A03 = C12614Szy.A03(this.A00, str);
        if (Pxj.A0C(A03) != 11) {
            return AnonymousClass05K.A01;
        }
        int[] A002 = Ri4.A00(A03);
        int i = 0;
        while (i < A002.length - 1) {
            int i2 = i + 1;
            if (A002[i] != A002[i2]) {
                break;
            }
            i = i2;
        }
        if (i == 10) {
            return AnonymousClass05K.A0C;
        }
        int[] iArr = A01;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        do {
            i5 += iArr[i4] * A002[i4];
            i4++;
        } while (i4 < 9);
        int i6 = (i5 * 10) % 11;
        if (i6 != 10) {
            i3 = i6;
        }
        if (i3 != A002[9]) {
            return AnonymousClass05K.A0N;
        }
        int[] iArr2 = A02;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        do {
            i9 += iArr2[i8] * A002[i8];
            i8++;
        } while (i8 < 10);
        int i10 = (i9 * 10) % 11;
        if (i10 != 10) {
            i7 = i10;
        }
        if (i7 != A002[10]) {
            return AnonymousClass05K.A0Y;
        }
        return AnonymousClass05K.A00;
    }

    public final String A01(String str) {
        char c;
        0qQ.A0B(str, 0);
        String A03 = C12614Szy.A03(this.A00, str);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        for (int i = 0; i < Pxj.A0C(A03) && A1A.length() < 14; i++) {
            if (i == 3 || i == 6) {
                c = '.';
            } else if (i == 9) {
                c = '-';
            } else {
                A1A.append(A03.charAt(i));
            }
            A1A.append(c);
            A1A.append(A03.charAt(i));
        }
        return DbT.A10(A1A);
    }
}
