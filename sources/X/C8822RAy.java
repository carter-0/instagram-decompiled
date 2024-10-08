package X;

/* renamed from: X.RAy  reason: case insensitive filesystem */
public final class C8822RAy extends V4Q {
    public final C12614Szy A00 = C8637Qya.A00();
    public final C12614Szy A01 = C12614Szy.A01("Kk");

    public final Integer A00(String str) {
        char c;
        0qQ.A0B(str, 0);
        if (str.equals(A01(str))) {
            String A08 = this.A00.A07(this.A01).A06().A08(str);
            0qQ.A0A(A08);
            String A0k = AnonymousClass7TF.A0k(A08);
            int A0C = Pxj.A0C(A0k);
            if (A0C != 8 && A0C != 9) {
                return AnonymousClass05K.A01;
            }
            int A04 = 00l.A04(A0k, 'K', 0);
            if (A04 == -1 || A04 == A0C - 1) {
                int i = A0C - 1;
                int[] A002 = Ri4.A00(C51967G9n.A0q(A0k, 0, i));
                char charAt = A0k.charAt(i);
                int length = A002.length - 1;
                int i2 = 0;
                if (length >= 0) {
                    int i3 = 2;
                    while (true) {
                        int i4 = length - 1;
                        i2 += A002[length] * i3;
                        i3++;
                        if (i3 == 8) {
                            i3 = 2;
                        }
                        if (i4 < 0) {
                            break;
                        }
                        length = i4;
                    }
                }
                int i5 = 11 - (i2 % 11);
                if (i5 == 10) {
                    c = 'K';
                } else if (i5 != 11) {
                    c = (char) String.valueOf(i5).codePointAt(0);
                } else {
                    c = '0';
                }
                if (charAt == c) {
                    return AnonymousClass05K.A00;
                }
                return AnonymousClass05K.A0j;
            }
        }
        return AnonymousClass05K.A15;
    }

    public final String A01(String str) {
        0qQ.A0B(str, 0);
        String A08 = this.A00.A07(this.A01).A06().A08(str);
        0qQ.A0A(A08);
        String A0k = AnonymousClass7TF.A0k(A08);
        int A0C = Pxj.A0C(A0k);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int max = Math.max(0, A0C - 9);
        for (int i = max; i < A0C; i++) {
            char c = '-';
            if (i != max + 1) {
                c = '.';
                if (!(i == max + 4 || i == max + 7)) {
                    A1A.append(A0k.charAt((A0C - 1) - i));
                }
            }
            A1A.append(c);
            A1A.append(A0k.charAt((A0C - 1) - i));
        }
        A1A.reverse();
        return DbT.A10(A1A);
    }
}
