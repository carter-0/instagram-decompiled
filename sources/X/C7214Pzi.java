package X;

import java.util.Arrays;

/* renamed from: X.Pzi  reason: case insensitive filesystem */
public final class C7214Pzi {
    public int A00;
    public long[] A01 = new long[2];

    public final void A00(long j) {
        int i = this.A00;
        int i2 = 0;
        while (i2 < i) {
            if (this.A01[i2] != j) {
                i2++;
            } else {
                return;
            }
        }
        long[] jArr = this.A01;
        int length = jArr.length;
        if (i >= length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, length * 2));
            0qQ.A07(jArr);
            this.A01 = jArr;
        }
        jArr[i] = j;
        if (i >= this.A00) {
            this.A00 = i + 1;
        }
    }

    public final void A01(long j) {
        int i = this.A00;
        int i2 = 0;
        while (i2 < i) {
            long[] jArr = this.A01;
            if (j != jArr[i2]) {
                i2++;
            } else if (i2 < i) {
                int i3 = i - 1;
                while (i2 < i3) {
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.A00 = i - 1;
                return;
            } else {
                return;
            }
        }
    }
}
