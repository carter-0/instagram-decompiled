package X;

import android.util.Pair;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.SwS  reason: case insensitive filesystem */
public final class C12531SwS implements C13953TmG {
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static Pair A00(long[] jArr, long[] jArr2, long j) {
        double d;
        Long valueOf;
        Long valueOf2;
        int A04 = Util.A04(jArr, j, true);
        long j2 = jArr[A04];
        long j3 = jArr2[A04];
        int i = A04 + 1;
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

    public final long AvI() {
        return -1;
    }

    public final boolean CbO() {
        return true;
    }

    public final long AzU() {
        return this.A00;
    }

    public final C21498Xcy BrA(long j) {
        Pair A002 = A00(this.A02, this.A01, Util.A08(Math.max(0, Math.min(j, this.A00))));
        SJ7 sj7 = new SJ7(Util.A07(AnonymousClass7TE.A0R(A002.first)), AnonymousClass7TE.A0R(A002.second));
        return new C21498Xcy(sj7, sj7);
    }

    public final long C7P(long j) {
        return Util.A07(AnonymousClass7TE.A0R(A00(this.A01, this.A02, j).second));
    }

    public final /* synthetic */ long C9E(int i) {
        return this.A00;
    }

    public C12531SwS(long[] jArr, long[] jArr2, long j) {
        this.A01 = jArr;
        this.A02 = jArr2;
        this.A00 = j == -9223372036854775807L ? Util.A07(jArr2[jArr2.length - 1]) : j;
    }
}
