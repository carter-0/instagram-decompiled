package X;

import java.util.Arrays;

/* renamed from: X.5zw  reason: invalid class name and case insensitive filesystem */
public final class C301755zw {
    public int A00;
    public long[] A01 = new long[32];

    public final long A00(int i) {
        if (i >= 0 && i < this.A00) {
            return this.A01[i];
        }
        throw new IndexOutOfBoundsException(002.A02(i, this.A00, Pxd.A00(63), Pxd.A00(118)));
    }

    public final void A01(long j) {
        int i = this.A00;
        long[] jArr = this.A01;
        if (i == jArr.length) {
            jArr = Arrays.copyOf(jArr, i * 2);
            this.A01 = jArr;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        jArr[i2] = j;
    }
}
