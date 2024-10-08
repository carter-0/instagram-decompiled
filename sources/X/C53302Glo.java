package X;

/* renamed from: X.Glo  reason: case insensitive filesystem */
public final class C53302Glo extends AnonymousClass0T0 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53302Glo) {
                C53302Glo glo = (C53302Glo) obj;
                long j = this.A00;
                long j2 = glo.A00;
                long j3 = AnonymousClass5RW.A01;
                if (!(j == j2 && this.A01 == glo.A01 && this.A06 == glo.A06 && this.A07 == glo.A07 && this.A03 == glo.A03 && this.A04 == glo.A04 && this.A05 == glo.A05 && this.A02 == glo.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = AnonymousClass5RW.A01;
        int A012 = AnonymousClass7TF.A01(this.A05, AnonymousClass7TF.A01(this.A04, AnonymousClass7TF.A01(this.A03, AnonymousClass7TF.A01(this.A07, AnonymousClass7TF.A01(this.A06, AnonymousClass7TF.A01(this.A01, C51967G9n.A02(j)))))));
        long j3 = this.A02;
        return A012 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public C53302Glo(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.A00 = j;
        this.A01 = j2;
        this.A06 = j3;
        this.A07 = j4;
        this.A03 = j5;
        this.A04 = j6;
        this.A05 = j7;
        this.A02 = j8;
    }
}
