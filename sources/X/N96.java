package X;

public final class N96 extends AnonymousClass0T0 implements C74269Prx {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public String A05;
    public String A06;
    public boolean A07;
    public final Boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N96) {
                N96 n96 = (N96) obj;
                if (!(this.A07 == n96.A07 && this.A00 == n96.A00 && this.A02 == n96.A02 && this.A01 == n96.A01 && this.A04 == n96.A04 && this.A03 == n96.A03 && 0qQ.A0K(this.A06, n96.A06) && 0qQ.A0K(this.A05, n96.A05) && 0qQ.A0K(this.A08, n96.A08))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A01(this.A03, AnonymousClass7TF.A01(this.A04, AnonymousClass7TF.A01(this.A01, AnonymousClass7TF.A01(this.A02, (C51965G9l.A05(this.A07) + this.A00) * 31)))) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A08);
    }

    public N96(Boolean bool, String str, String str2, int i, long j, long j2, long j3, long j4, boolean z) {
        this.A07 = z;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
        this.A04 = j3;
        this.A03 = j4;
        this.A06 = str;
        this.A05 = str2;
        this.A08 = bool;
    }
}
