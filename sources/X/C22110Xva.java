package X;

import androidx.media3.common.util.Util;

/* renamed from: X.Xva  reason: case insensitive filesystem */
public final class C22110Xva implements C13511Tbc {
    public final long A00;
    public final C22017XrB A01;

    public final S5O Br9(long j) {
        long j2;
        C22017XrB xrB = this.A01;
        C21376XZj xZj = xrB.A0B;
        C11366SPh.A00(xZj);
        long[] jArr = xZj.A01;
        long[] jArr2 = xZj.A00;
        long j3 = (long) xrB.A07;
        int A02 = Util.A02(jArr, Math.max(0, Math.min((j * j3) / 1000000, xrB.A09 - 1)), false);
        long j4 = 0;
        if (A02 == -1) {
            j2 = 0;
        } else {
            j2 = jArr[A02];
            j4 = jArr2[A02];
        }
        long j5 = this.A00;
        SJ4 sj4 = new SJ4((j2 * 1000000) / j3, j5 + j4);
        if (sj4.A01 == j || A02 == jArr.length - 1) {
            return new S5O(sj4, sj4);
        }
        int i = A02 + 1;
        return new S5O(sj4, new SJ4((jArr[i] * 1000000) / j3, j5 + jArr2[i]));
    }

    public C22110Xva(C22017XrB xrB, long j) {
        this.A01 = xrB;
        this.A00 = j;
    }
}
