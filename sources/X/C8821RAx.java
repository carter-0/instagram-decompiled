package X;

/* renamed from: X.RAx  reason: case insensitive filesystem */
public final class C8821RAx extends V4Q {
    public final C12614Szy A00 = C8637Qya.A00();

    public final Integer A00(String str) {
        0qQ.A0B(str, 0);
        String A03 = C12614Szy.A03(this.A00, str);
        if (Pxj.A0C(A03) != 10) {
            return AnonymousClass05K.A01;
        }
        int[] A002 = Ri4.A00(A03);
        int i = A002[9];
        int i2 = 0;
        int i3 = (A002[0] * 10) + A002[1];
        if (i3 < 1 || (i3 > 24 && i3 != 30)) {
            return AnonymousClass05K.A0u;
        }
        if (A002[2] > 6) {
            return AnonymousClass05K.A0N;
        }
        int length = A002.length - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = 1;
            if (i5 % 2 == 0) {
                i6 = 2;
            }
            int i7 = A002[i5] * i6;
            if (i7 > 9) {
                i7 -= 9;
            }
            i4 += i7;
        }
        int i8 = i4 % 10;
        if (i8 != 0) {
            i2 = 10 - i8;
        }
        if (i == i2) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A0Y;
    }

    public final String A01(String str) {
        0qQ.A0B(str, 0);
        String A03 = C12614Szy.A03(this.A00, str);
        if (Pxj.A0C(A03) >= 10) {
            return 002.A0T(C51967G9n.A0q(A03, 0, 9), C51967G9n.A0q(A03, 9, 10), '-');
        }
        return A03;
    }
}
