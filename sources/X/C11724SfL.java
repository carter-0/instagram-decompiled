package X;

import android.util.Pair;
import androidx.media3.common.util.Util;

/* renamed from: X.SfL  reason: case insensitive filesystem */
public final class C11724SfL implements C13911TlB {
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static Pair A00(long[] jArr, long[] jArr2, long j) {
        double d;
        Long valueOf;
        Long valueOf2;
        int A022 = Util.A02(jArr, j, true);
        long j2 = jArr[A022];
        long j3 = jArr2[A022];
        int i = A022 + 1;
        if (i == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            if (j4 == j2) {
                d = 0.0d;
            } else {
                d = (((double) j) - ((double) j2)) / ((double) (j4 - j2));
            }
            valueOf = Long.valueOf(j);
            valueOf2 = Long.valueOf(((long) (d * ((double) (j5 - j3)))) + j3);
        }
        return Pair.create(valueOf, valueOf2);
    }

    public final int Aea() {
        return -2147483647;
    }

    public final long AvI() {
        return -1;
    }

    public final S5O Br9(long j) {
        Pair A002 = A00(this.A02, this.A01, Util.A04(Math.max(0, Math.min(j, this.A00))));
        SJ4 sj4 = new SJ4(Util.A03(AnonymousClass7TE.A0R(A002.first)), AnonymousClass7TE.A0R(A002.second));
        return new S5O(sj4, sj4);
    }

    public final long C7P(long j) {
        return Util.A03(AnonymousClass7TE.A0R(A00(this.A01, this.A02, j).second));
    }

    public C11724SfL(long[] jArr, long[] jArr2, long j) {
        this.A01 = jArr;
        this.A02 = jArr2;
        this.A00 = j == -9223372036854775807L ? Util.A03(jArr2[jArr2.length - 1]) : j;
    }
}
