package X;

import androidx.media3.common.util.Util;

/* renamed from: X.Sf4  reason: case insensitive filesystem */
public final class C11707Sf4 implements C13511Tbc {
    public final long A00;
    public final boolean A01;
    public final long[] A02;
    public final long[] A03;

    public final S5O Br9(long j) {
        SJ4 sj4;
        if (!this.A01) {
            sj4 = SJ4.A02;
        } else {
            long[] jArr = this.A03;
            int A022 = Util.A02(jArr, j, true);
            long j2 = jArr[A022];
            long[] jArr2 = this.A02;
            sj4 = new SJ4(j2, jArr2[A022]);
            if (!(sj4.A01 == j || A022 == jArr.length - 1)) {
                int i = A022 + 1;
                return new S5O(sj4, new SJ4(jArr[i], jArr2[i]));
            }
        }
        return new S5O(sj4, sj4);
    }

    public C11707Sf4(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        C11366SPh.A01(AnonymousClass7TF.A1S(length, length2));
        boolean A1R = AnonymousClass7TF.A1R(length2);
        this.A01 = A1R;
        if (!A1R || jArr2[0] <= 0) {
            this.A02 = jArr;
            this.A03 = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.A02 = jArr3;
            long[] jArr4 = new long[i];
            this.A03 = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.A00 = j;
    }
}
