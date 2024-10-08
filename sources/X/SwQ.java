package X;

import com.google.android.exoplayer2.util.Util;

public final class SwQ implements C13953TmG {
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    public final boolean CbO() {
        return true;
    }

    public final long AvI() {
        return this.A01;
    }

    public final long AzU() {
        return this.A00;
    }

    public final C21498Xcy BrA(long j) {
        long[] jArr = this.A03;
        int A04 = Util.A04(jArr, j, true);
        long j2 = jArr[A04];
        long[] jArr2 = this.A02;
        SJ7 sj7 = new SJ7(j2, jArr2[A04]);
        if (sj7.A01 >= j || A04 == jArr.length - 1) {
            return new C21498Xcy(sj7, sj7);
        }
        int i = A04 + 1;
        return new C21498Xcy(sj7, new SJ7(jArr[i], jArr2[i]));
    }

    public final long C7P(long j) {
        return this.A03[Util.A04(this.A02, j, true)];
    }

    public final /* synthetic */ long C9E(int i) {
        return this.A00;
    }

    public SwQ(long[] jArr, long[] jArr2, long j, long j2) {
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A00 = j;
        this.A01 = j2;
    }
}
