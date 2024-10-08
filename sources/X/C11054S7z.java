package X;

/* renamed from: X.S7z  reason: case insensitive filesystem */
public abstract class C11054S7z {
    public static void A01(ST7 st7) {
        int i;
        int A06 = st7.A06(2);
        if (A06 == 0) {
            i = 6;
        } else {
            int A00 = A00(st7, 5, 8, 16) + 1;
            if (A06 == 1) {
                i = A00 * 7;
            } else if (A06 == 2) {
                boolean A0F = st7.A0F();
                int i2 = 5;
                int i3 = 5;
                if (A0F) {
                    i3 = 1;
                }
                int i4 = 6;
                if (A0F) {
                    i2 = 7;
                    i4 = 8;
                }
                int i5 = 0;
                while (i5 < A00) {
                    if (st7.A0F()) {
                        st7.A0A(7);
                    } else {
                        if (st7.A06(2) == 3 && st7.A06(i2) * i3 != 0) {
                            st7.A08();
                        }
                        int A062 = st7.A06(i4) * i3;
                        if (!(A062 == 0 || A062 == 180)) {
                            st7.A08();
                        }
                        st7.A08();
                        if (!(A062 == 0 || A062 == 180 || !st7.A0F())) {
                            i5++;
                        }
                    }
                    i5++;
                }
                return;
            } else {
                return;
            }
        }
        st7.A0A(i);
    }

    public static int A00(ST7 st7, int i, int i2, int i3) {
        C11366SPh.A01(Pxg.A1T(Math.max(Math.max(i, i2), i3), 31));
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        SN3.A00(SN3.A00(i4, i5), 1 << i3);
        if (st7.A04() >= i) {
            int A06 = st7.A06(i);
            if (A06 != i4) {
                return A06;
            }
            if (st7.A04() >= i2) {
                int A062 = st7.A06(i2);
                int i6 = A06 + A062;
                if (A062 != i5) {
                    return i6;
                }
                if (st7.A04() >= i3) {
                    return i6 + st7.A06(i3);
                }
            }
        }
        return -1;
    }
}
