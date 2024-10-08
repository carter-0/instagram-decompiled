package X;

import java.util.Arrays;

/* renamed from: X.Wgz  reason: case insensitive filesystem */
public final class C19872Wgz implements Cloneable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;

    public final void A00(int i, int i2) {
        int i3 = (i2 * this.A01) + (i / 32);
        int[] iArr = this.A03;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public final void A01(int i, int i2) {
        int i3 = (i2 * this.A01) + (i / 32);
        int[] iArr = this.A03;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public final void A02(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 < 1 || i3 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.A00 || i5 > this.A02) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.A01 * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.A03;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public final boolean A03(int i, int i2) {
        if (((this.A03[(i2 * this.A01) + (i / 32)] >>> (i & 31)) & 1) == 0) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new C19872Wgz((int[]) this.A03.clone(), this.A02, this.A00, this.A01);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19872Wgz)) {
            return false;
        }
        C19872Wgz wgz = (C19872Wgz) obj;
        if (this.A02 == wgz.A02 && this.A00 == wgz.A00 && this.A01 == wgz.A01 && Arrays.equals(this.A03, wgz.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.A02;
        return (((((((i * 31) + i) * 31) + this.A00) * 31) + this.A01) * 31) + Arrays.hashCode(this.A03);
    }

    public final String toString() {
        int i = this.A00;
        int i2 = this.A02;
        StringBuilder sb = new StringBuilder((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                String str = "  ";
                if (A03(i4, i3)) {
                    str = "X ";
                }
                sb.append(str);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public C19872Wgz(int[] iArr, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = iArr;
    }

    public C19872Wgz(int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.A02 = i;
        this.A00 = i2;
        int i3 = (i + 31) / 32;
        this.A01 = i3;
        this.A03 = new int[(i3 * i2)];
    }
}
