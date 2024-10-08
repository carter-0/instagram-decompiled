package X;

import java.util.Arrays;

public final class R16 extends SK2 {
    public transient int A00;
    public transient int A01;
    public transient long[] links;

    public R16() {
        A09(3, 1.0f);
    }

    private void A00(int i, int i2) {
        if (i == -2) {
            this.A00 = i2;
        } else {
            long[] jArr = this.links;
            SK2.A01(jArr, i2, i, jArr[i]);
        }
        if (i2 == -2) {
            this.A01 = i;
            return;
        }
        long[] jArr2 = this.links;
        jArr2[i2] = (jArr2[i2] & 4294967295L) | (((long) i) << 32);
    }

    public final void A07(int i) {
        int i2 = this.A02 - 1;
        long[] jArr = this.links;
        long j = jArr[i];
        A00((int) (j >>> 32), (int) j);
        if (i < i2) {
            A00((int) (jArr[i2] >>> 32), i);
            A00(i, (int) jArr[i2]);
        }
        super.A07(i);
    }

    public final void A09(int i, float f) {
        super.A09(i, 1.0f);
        this.A00 = -2;
        this.A01 = -2;
        long[] jArr = new long[i];
        this.links = jArr;
        Arrays.fill(jArr, -1);
    }

    public final void A06() {
        super.A06();
        this.A00 = -2;
        this.A01 = -2;
    }

    public final void A08(int i) {
        super.A08(i);
        long[] jArr = this.links;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.links = copyOf;
        Arrays.fill(copyOf, length, i, -1);
    }

    public final void A0B(Object obj, int i, int i2, int i3) {
        super.A0B(obj, i, i2, i3);
        A00(this.A01, i);
        A00(i, -2);
    }
}
