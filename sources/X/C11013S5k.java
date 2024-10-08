package X;

/* renamed from: X.S5k  reason: case insensitive filesystem */
public abstract class C11013S5k {
    public final int A00;
    public final int A01;

    public final byte[] A00() {
        if (this instanceof R7C) {
            R7C r7c = (R7C) this;
            int i = r7c.A01;
            int i2 = r7c.A00;
            int i3 = r7c.A01;
            if (i == i3 && i2 == r7c.A00) {
                return r7c.A02;
            }
            int i4 = i * i2;
            byte[] bArr = new byte[i4];
            int i5 = 0;
            if (i == i3) {
                System.arraycopy(r7c.A02, 0, bArr, 0, i4);
                return bArr;
            }
            for (int i6 = 0; i6 < i2; i6++) {
                System.arraycopy(r7c.A02, i5, bArr, i6 * i, i);
                i5 += i3;
            }
            return bArr;
        } else if (this instanceof R7B) {
            R7B r7b = (R7B) this;
            int i7 = r7b.A01;
            int i8 = r7b.A00;
            int i9 = r7b.A01;
            if (i7 == i9 && i8 == r7b.A00) {
                return r7b.A02;
            }
            int i10 = i7 * i8;
            byte[] bArr2 = new byte[i10];
            int i11 = 0;
            if (i7 == i9) {
                System.arraycopy(r7b.A02, 0, bArr2, 0, i10);
                return bArr2;
            }
            for (int i12 = 0; i12 < i8; i12++) {
                System.arraycopy(r7b.A02, i11, bArr2, i12 * i7, i7);
                i11 += i9;
            }
            return bArr2;
        } else {
            R7A r7a = (R7A) this;
            byte[] A002 = r7a.A00.A00();
            int i13 = r7a.A01 * r7a.A00;
            byte[] bArr3 = new byte[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                bArr3[i14] = (byte) (255 - (A002[i14] & 255));
            }
            return bArr3;
        }
    }

    public final byte[] A01(byte[] bArr, int i) {
        int i2;
        int i3;
        byte[] bArr2;
        if (this instanceof R7C) {
            R7C r7c = (R7C) this;
            if (i < 0 || i >= r7c.A00) {
                throw DbW.A0a("Requested row is outside the image: ", i);
            }
            i2 = r7c.A01;
            if (bArr == null || bArr.length < i2) {
                bArr = new byte[i2];
            }
            i3 = i * r7c.A01;
            bArr2 = r7c.A02;
        } else if (this instanceof R7B) {
            R7B r7b = (R7B) this;
            if (i < 0 || i >= r7b.A00) {
                throw DbW.A0a("Requested row is outside the image: ", i);
            }
            i2 = r7b.A01;
            if (bArr == null || bArr.length < i2) {
                bArr = new byte[i2];
            }
            i3 = i * r7b.A01;
            bArr2 = r7b.A02;
        } else {
            R7A r7a = (R7A) this;
            byte[] A012 = r7a.A00.A01(bArr, i);
            int i4 = r7a.A01;
            for (int i5 = 0; i5 < i4; i5++) {
                A012[i5] = (byte) (255 - (A012[i5] & 255));
            }
            return A012;
        }
        System.arraycopy(bArr2, i3, bArr, 0, i2);
        return bArr;
    }

    public final String toString() {
        char c;
        int i = this.A01;
        byte[] bArr = new byte[i];
        int i2 = this.A00;
        StringBuilder A14 = Pxe.A14((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            bArr = A01(bArr, i3);
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4] & 255;
                if (b < 64) {
                    c = '#';
                } else if (b < 128) {
                    c = '+';
                } else {
                    c = ' ';
                    if (b < 192) {
                        c = '.';
                    }
                }
                A14.append(c);
            }
            A14.append(10);
        }
        return A14.toString();
    }

    public C11013S5k(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
