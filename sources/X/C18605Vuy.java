package X;

/* renamed from: X.Vuy  reason: case insensitive filesystem */
public final class C18605Vuy {
    public C18763Vzy A00;
    public C18811W3o A01;
    public boolean A02;
    public final C19872Wgz A03;

    public static int A00(C18605Vuy vuy, int i, int i2, int i3) {
        boolean A032;
        boolean z = vuy.A02;
        C19872Wgz wgz = vuy.A03;
        if (z) {
            A032 = wgz.A03(i2, i);
        } else {
            A032 = wgz.A03(i, i2);
        }
        int i4 = i3 << 1;
        if (A032) {
            return i4 | 1;
        }
        return i4;
    }

    public final C18763Vzy A01() {
        C18763Vzy vzy = this.A00;
        if (vzy == null) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 6; i3++) {
                i2 = A00(this, i3, 8, i2);
            }
            int A002 = A00(this, 8, 7, A00(this, 8, 8, A00(this, 7, 8, i2)));
            int i4 = 5;
            do {
                A002 = A00(this, 8, i4, A002);
                i4--;
            } while (i4 >= 0);
            int i5 = this.A03.A00;
            int i6 = i5 - 7;
            for (int i7 = i5 - 1; i7 >= i6; i7--) {
                i = A00(this, 8, i7, i);
            }
            for (int i8 = i5 - 8; i8 < i5; i8++) {
                i = A00(this, i8, 8, i);
            }
            vzy = C18763Vzy.A00(A002, i);
            if (vzy == null) {
                vzy = C18763Vzy.A00(A002 ^ 21522, i ^ 21522);
            }
            this.A00 = vzy;
            if (vzy == null) {
                throw R7F.A00();
            }
        }
        return vzy;
    }

    public final C18811W3o A02() {
        int i;
        C18811W3o w3o = this.A01;
        if (w3o != null) {
            return w3o;
        }
        int i2 = this.A03.A00;
        int i3 = (i2 - 17) / 4;
        if (i3 <= 6) {
            return C18811W3o.A09(i3);
        }
        int i4 = i2 - 11;
        int i5 = 5;
        int i6 = 0;
        int i7 = 5;
        int i8 = 0;
        do {
            int i9 = i2 - 9;
            i = i9;
            while (i9 >= i4) {
                i8 = A00(this, i9, i7, i8);
                i9--;
            }
            i7--;
        } while (i7 >= 0);
        C18811W3o A08 = C18811W3o.A08(i8);
        if (A08 == null || (A08.A01 * 4) + 17 != i2) {
            do {
                for (int i10 = i; i10 >= i4; i10--) {
                    i6 = A00(this, i5, i10, i6);
                }
                i5--;
            } while (i5 >= 0);
            A08 = C18811W3o.A08(i6);
            if (A08 == null || (A08.A01 * 4) + 17 != i2) {
                throw R7F.A00();
            }
        }
        this.A01 = A08;
        return A08;
    }

    public C18605Vuy(C19872Wgz wgz) {
        int i = wgz.A00;
        if (i < 21 || (i & 3) != 1) {
            throw R7F.A00();
        }
        this.A03 = wgz;
    }
}
