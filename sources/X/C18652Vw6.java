package X;

/* renamed from: X.Vw6  reason: case insensitive filesystem */
public final class C18652Vw6 {
    public static final C18652Vw6 A06 = new C18652Vw6(1033, 1024);
    public static final C18652Vw6 A07 = new C18652Vw6(4201, 4096);
    public static final C18652Vw6 A08;
    public static final C18652Vw6 A09;
    public static final C18652Vw6 A0A = new C18652Vw6(19, 16);
    public static final C18652Vw6 A0B;
    public static final C18652Vw6 A0C;
    public static final C18652Vw6 A0D = new C18652Vw6(285, 256);
    public final int A00;
    public final C18074Vl2 A01;
    public final C18074Vl2 A02;
    public final int[] A03;
    public final int[] A04;
    public final int A05;

    static {
        C18652Vw6 vw6 = new C18652Vw6(67, 64);
        A08 = vw6;
        C18652Vw6 vw62 = new C18652Vw6(301, 256);
        A0B = vw62;
        A09 = vw62;
        A0C = vw6;
    }

    public final int A00(int i) {
        if (i != 0) {
            return this.A03[(this.A00 - this.A04[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public final int A01(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.A03;
        int[] iArr2 = this.A04;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.A00 - 1)];
    }

    public final C18074Vl2 A02(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.A02;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C18074Vl2(this, iArr);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GF(0x");
        sb.append(Integer.toHexString(this.A05));
        sb.append(',');
        return C51975G9x.A0j(sb, this.A00);
    }

    public C18652Vw6(int i, int i2) {
        this.A05 = i;
        this.A00 = i2;
        int[] iArr = new int[i2];
        this.A03 = iArr;
        int[] iArr2 = new int[i2];
        this.A04 = iArr2;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3;
            i3 *= 2;
            if (i3 >= i2) {
                i3 = (i3 ^ i) & (i2 - 1);
            }
        }
        for (int i5 = 0; i5 < i2 - 1; i5++) {
            iArr2[iArr[i5]] = i5;
        }
        this.A02 = new C18074Vl2(this, new int[]{0});
        this.A01 = new C18074Vl2(this, new int[]{1});
    }
}
