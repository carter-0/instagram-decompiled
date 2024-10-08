package X;

public final class N3E extends AnonymousClass0T0 {
    public final long A00;
    public final long A01;
    public final Integer A02;
    public final Long A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3E) {
                N3E n3e = (N3E) obj;
                if (this.A01 != n3e.A01 || this.A00 != n3e.A00 || !0qQ.A0K(this.A07, n3e.A07) || !0qQ.A0K(this.A04, n3e.A04) || !0qQ.A0K(this.A06, n3e.A06) || !0qQ.A0K(this.A02, n3e.A02) || !0qQ.A0K(this.A03, n3e.A03) || !0qQ.A0K(this.A05, n3e.A05) || !0qQ.A0K(this.A08, n3e.A08) || !0qQ.A0K(this.A0A, n3e.A0A) || !0qQ.A0K(this.A09, n3e.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        return ((((((((((((((AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A01(this.A00, ((int) (j ^ (j >>> 32))) * 31)) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + C41845B3m.A00(this.A09);
    }

    public N3E(Integer num, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
        this.A07 = str;
        this.A04 = l;
        this.A06 = str2;
        this.A02 = num;
        this.A03 = l2;
        this.A05 = l3;
        this.A08 = str3;
        this.A0A = str4;
        this.A09 = str5;
    }
}
