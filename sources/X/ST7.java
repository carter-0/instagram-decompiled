package X;

import androidx.media3.common.util.Util;

public final class ST7 {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public ST7(byte[] bArr) {
        int length = bArr.length;
        this.A03 = bArr;
        this.A01 = length;
    }

    public final int A06(int i) {
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
        A01(this);
        return i6;
    }

    public final void A0D(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.A03;
            int i4 = this.A02;
            int i5 = i4 + 1;
            this.A02 = i5;
            byte b = bArr2[i4];
            int i6 = this.A00;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i2] & (255 >> i7));
            bArr[i2] = b3;
            int i8 = this.A00;
            if (i8 + i7 > 8) {
                byte[] bArr3 = this.A03;
                int i9 = this.A02;
                this.A02 = i9 + 1;
                b3 = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                bArr[i2] = b3;
                i8 -= 8;
                this.A00 = i8;
            }
            int i10 = i8 + i7;
            this.A00 = i10;
            byte[] bArr4 = this.A03;
            int i11 = this.A02;
            bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | b3);
            if (i10 == 8) {
                this.A00 = 0;
                this.A02 = i11 + 1;
            }
            A01(this);
        }
    }

    public final void A0E(byte[] bArr, int i) {
        C11366SPh.A02(AnonymousClass7TF.A1Q(this.A00));
        System.arraycopy(this.A03, this.A02, bArr, 0, i);
        this.A02 += i;
        A01(this);
    }

    public static void A01(ST7 st7) {
        boolean z;
        int i;
        int i2 = st7.A02;
        if (i2 < 0 || (i2 >= (i = st7.A01) && !(i2 == i && st7.A00 == 0))) {
            z = false;
        } else {
            z = true;
        }
        C11366SPh.A02(z);
    }

    public final int A04() {
        return ((this.A01 - this.A02) * 8) - this.A00;
    }

    public final int A05() {
        C11366SPh.A02(AnonymousClass7TF.A1Q(this.A00));
        return this.A02;
    }

    public final void A07() {
        if (this.A00 != 0) {
            this.A00 = 0;
            this.A02++;
            A01(this);
        }
    }

    public final void A08() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            this.A02++;
        }
        A01(this);
    }

    public final void A09(int i) {
        int i2 = i / 8;
        this.A02 = i2;
        this.A00 = i - (i2 * 8);
        A01(this);
    }

    public final void A0A(int i) {
        int i2 = i / 8;
        int i3 = this.A02 + i2;
        this.A02 = i3;
        int i4 = this.A00 + (i - (i2 * 8));
        this.A00 = i4;
        if (i4 > 7) {
            this.A02 = i3 + 1;
            this.A00 = i4 - 8;
        }
        A01(this);
    }

    public final void A0B(int i) {
        C11366SPh.A02(AnonymousClass7TF.A1Q(this.A00));
        this.A02 += i;
        A01(this);
    }

    public final void A0C(C11389SRd sRd) {
        byte[] bArr = sRd.A02;
        int i = sRd.A00;
        this.A03 = bArr;
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = i;
        A09(sRd.A01 * 8);
    }

    public final boolean A0F() {
        boolean A1P = AnonymousClass7TF.A1P(this.A03[this.A02] & (128 >> this.A00));
        A08();
        return A1P;
    }

    public static int A00(ST7 st7, int i, int i2) {
        st7.A0A(i);
        return st7.A06(i2);
    }

    public static void A02(ST7 st7, int i) {
        if (st7.A0F()) {
            st7.A0A(i);
        }
    }

    public static boolean A03(ST7 st7, int i) {
        st7.A0A(i);
        return st7.A0F();
    }

    public ST7() {
        this.A03 = Util.A07;
    }
}
