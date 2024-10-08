package X;

/* renamed from: X.SwM  reason: case insensitive filesystem */
public final class C12526SwM implements AnonymousClass4YO, C13953TmG {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final boolean A06;

    public final long AvI() {
        return -1;
    }

    public C12526SwM(S38 s38, long j, long j2, boolean z) {
        long A0D;
        int i = s38.A00;
        int i2 = s38.A02;
        this.A05 = j;
        this.A04 = j2;
        this.A01 = i2 == -1 ? 1 : i2;
        this.A00 = i;
        this.A06 = z;
        if (j == -1) {
            this.A02 = -1;
            A0D = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.A02 = j3;
            A0D = Pxj.A0D(j3) / ((long) i);
        }
        this.A03 = A0D;
    }

    public final long AzU() {
        return this.A03;
    }

    public final C21498Xcy BrA(long j) {
        SJ7 sj7;
        long j2 = this.A02;
        if (j2 != -1 || this.A06) {
            long j3 = (long) this.A00;
            long j4 = (long) this.A01;
            long j5 = (((j * j3) / 8000000) / j4) * j4;
            if (j2 != -1) {
                j5 = Math.min(j5, j2 - j4);
            }
            long max = Math.max(j5, 0);
            long j6 = this.A04;
            long j7 = j6 + max;
            long A0D = Pxj.A0D(j7 - j6) / j3;
            sj7 = new SJ7(A0D, j7);
            if (j2 != -1 && A0D < j) {
                long j8 = j4 + j7;
                if (j8 < this.A05) {
                    return new C21498Xcy(sj7, new SJ7(Pxj.A0D(j8 - j6) / j3, j8));
                }
            }
        } else {
            sj7 = new SJ7(0, this.A04);
        }
        return new C21498Xcy(sj7, sj7);
    }

    public final long C7P(long j) {
        return Pxj.A0D(j - this.A04) / ((long) this.A00);
    }

    public final /* synthetic */ long C9E(int i) {
        return this.A03;
    }

    public final boolean CbO() {
        if (this.A02 != -1 || this.A06) {
            return true;
        }
        return false;
    }
}
