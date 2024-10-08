package X;

public final class N30 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C266444Yx A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public N30(C266444Yx r2, String str, String str2, String str3, int i, int i2, long j) {
        0qQ.A0B(str, 1);
        this.A06 = str;
        this.A01 = i;
        this.A03 = r2;
        this.A00 = i2;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N30) {
                N30 n30 = (N30) obj;
                if (!0qQ.A0K(this.A06, n30.A06) || this.A01 != n30.A01 || !0qQ.A0K(this.A03, n30.A03) || this.A00 != n30.A00 || !0qQ.A0K(this.A04, n30.A04) || !0qQ.A0K(this.A05, n30.A05) || this.A02 != n30.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C266444Yx r0 = this.A03;
        return AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A04, (AnonymousClass7TF.A07(r0, (AnonymousClass7TE.A0O(this.A06) + this.A01) * 31) + this.A00) * 31)) + C51968G9o.A03(this.A02);
    }
}
