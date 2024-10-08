package X;

import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.4YN  reason: invalid class name */
public final class AnonymousClass4YN implements AnonymousClass4YO {
    public final int A00;
    public final long A01;
    public final int[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long[] A05;

    public final boolean CbO() {
        return true;
    }

    public final long AzU() {
        return this.A01;
    }

    public final C21498Xcy BrA(long j) {
        long[] jArr = this.A05;
        int A042 = Util.A04(jArr, j, true);
        long j2 = jArr[A042];
        long[] jArr2 = this.A04;
        SJ7 sj7 = new SJ7(j2, jArr2[A042]);
        if (sj7.A01 >= j || A042 == this.A00 - 1) {
            return new C21498Xcy(sj7, sj7);
        }
        int i = A042 + 1;
        return new C21498Xcy(sj7, new SJ7(jArr[i], jArr2[i]));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pxd.A00(457));
        sb.append(this.A00);
        sb.append(", sizes=");
        sb.append(Arrays.toString(this.A02));
        sb.append(", offsets=");
        sb.append(Arrays.toString(this.A04));
        sb.append(", timeUs=");
        sb.append(Arrays.toString(this.A05));
        sb.append(Pxd.A00(315));
        sb.append(Arrays.toString(this.A03));
        sb.append(")");
        return sb.toString();
    }

    public AnonymousClass4YN(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A02 = iArr;
        this.A04 = jArr;
        this.A03 = jArr2;
        this.A05 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            int i = length - 1;
            this.A01 = jArr2[i] + jArr3[i];
        }
    }

    public final /* synthetic */ long C9E(int i) {
        return this.A01;
    }
}
