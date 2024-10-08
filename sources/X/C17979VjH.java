package X;

/* renamed from: X.VjH  reason: case insensitive filesystem */
public final class C17979VjH {
    public int A00;
    public int A01;
    public final byte[] A02;

    public final int A01(int i) {
        if (i < 1 || i > 32 || i > A00()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.A00;
        byte b = 0;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int min = Math.min(i, i3);
            int i4 = i3 - min;
            byte[] bArr = this.A02;
            int i5 = this.A01;
            int i6 = (((255 >> (8 - min)) << i4) & bArr[i5]) >> i4;
            i -= min;
            i2 += min;
            this.A00 = i2;
            if (i2 == 8) {
                this.A00 = 0;
                i2 = 0;
                this.A01 = i5 + 1;
            }
            b = i6;
            if (i <= 0) {
                return b;
            }
        }
        while (i >= 8) {
            byte[] bArr2 = this.A02;
            int i7 = this.A01;
            b = (bArr2[i7] & 255) | (b << 8);
            this.A01 = i7 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i8 = 8 - i;
        int i9 = (b << i) | ((((255 >> i8) << i8) & this.A02[this.A01]) >> i8);
        this.A00 = i2 + i;
        return i9;
    }

    public final int A00() {
        return ((this.A02.length - this.A01) * 8) - this.A00;
    }

    public C17979VjH(byte[] bArr) {
        this.A02 = bArr;
    }
}
