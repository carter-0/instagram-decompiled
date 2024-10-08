package X;

/* renamed from: X.592  reason: invalid class name */
public final class AnonymousClass592 {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;

    public final C292615jF A00() {
        int i = this.A00;
        if (i <= 0) {
            return null;
        }
        long j = (long) i;
        long j2 = this.A09 / j;
        long j3 = this.A07 / j;
        long j4 = this.A02 / j;
        long j5 = this.A05 / j;
        long j6 = this.A03 / j;
        return new C292615jF(j2, this.A04 / j, this.A01 / j, j5, j6, j3, j4, this.A06 / j, this.A08 / j);
    }

    public final void A01(C292615jF r5) {
        this.A00++;
        this.A08 += r5.A0B;
        this.A09 += r5.A0C;
        this.A04 += r5.A03;
        this.A01 += r5.A00;
        this.A05 += r5.A04;
        this.A03 += r5.A02;
        this.A07 += r5.A0A;
        this.A02 += r5.A01;
        this.A06 += r5.A08;
    }
}
