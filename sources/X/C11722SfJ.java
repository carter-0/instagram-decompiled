package X;

import androidx.media3.common.util.Util;

/* renamed from: X.SfJ  reason: case insensitive filesystem */
public final class C11722SfJ implements C13911TlB {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long[] A03;
    public final long[] A04;

    public final int Aea() {
        return this.A00;
    }

    public final long AvI() {
        return this.A01;
    }

    public final S5O Br9(long j) {
        long[] jArr = this.A04;
        int A022 = Util.A02(jArr, j, true);
        long j2 = jArr[A022];
        long[] jArr2 = this.A03;
        SJ4 sj4 = new SJ4(j2, jArr2[A022]);
        if (sj4.A01 >= j || A022 == jArr.length - 1) {
            return new S5O(sj4, sj4);
        }
        int i = A022 + 1;
        return new S5O(sj4, new SJ4(jArr[i], jArr2[i]));
    }

    public final long C7P(long j) {
        return this.A04[Util.A02(this.A03, j, true)];
    }

    public C11722SfJ(long[] jArr, long[] jArr2, int i, long j, long j2) {
        this.A04 = jArr;
        this.A03 = jArr2;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
    }
}
