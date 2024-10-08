package X;

/* renamed from: X.5Ob  reason: invalid class name and case insensitive filesystem */
public final class C284825Ob {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public final int A01(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = this.A00 + i;
        this.A00 = i2;
        int i3 = 0;
        while (i2 > 8) {
            i2 -= 8;
            this.A00 = i2;
            byte[] bArr = this.A03;
            int i4 = this.A02;
            this.A02 = i4 + 1;
            i3 |= (bArr[i4] & 255) << i2;
        }
        byte[] bArr2 = this.A03;
        int i5 = this.A02;
        int i6 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.A00 = 0;
            this.A02 = i5 + 1;
        }
        A00(this);
        return i6;
    }

    public static void A00(C284825Ob r2) {
        boolean z;
        int i;
        int i2 = r2.A02;
        if (i2 < 0 || (i2 >= (i = r2.A01) && !(i2 == i && r2.A00 == 0))) {
            z = false;
        } else {
            z = true;
        }
        C256703wD.A04(z);
    }

    public final void A02() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            this.A02++;
        }
        A00(this);
    }

    public final void A03(int i) {
        int i2 = i / 8;
        int i3 = this.A02 + i2;
        this.A02 = i3;
        int i4 = this.A00 + (i - (i2 * 8));
        this.A00 = i4;
        if (i4 > 7) {
            this.A02 = i3 + 1;
            this.A00 = i4 - 8;
        }
        A00(this);
    }

    public final void A04(AnonymousClass4XV r3) {
        byte[] bArr = r3.A02;
        int i = r3.A00;
        this.A03 = bArr;
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = i;
        int i2 = r3.A01 * 8;
        int i3 = i2 / 8;
        this.A02 = i3;
        this.A00 = i2 - (i3 * 8);
        A00(this);
    }

    public final boolean A05() {
        boolean z = false;
        if ((this.A03[this.A02] & (128 >> this.A00)) != 0) {
            z = true;
        }
        A02();
        return z;
    }
}
