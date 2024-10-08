package X;

public final class N36 extends AnonymousClass0T0 {
    public final C74438Put A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (obj instanceof N36) {
            N36 n36 = (N36) obj;
            if (this.A01 == n36.A01 && 0qQ.A0K(this.A03, n36.A03)) {
                C74438Put put = this.A00;
                String Aqe = put.Aqe();
                C74438Put put2 = n36.A00;
                if (!0qQ.A0K(Aqe, put2.Aqe()) || put.Aqk() != put2.Aqk() || !0qQ.A0K(this.A04, n36.A04) || !0qQ.A0K(this.A05, n36.A05) || this.A06 != n36.A06 || !0qQ.A0K(this.A07, n36.A07) || !0qQ.A0K(this.A08, n36.A08)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "PAUSE";
                break;
            case 2:
                str = "STOP";
                break;
            default:
                str = "PLAY";
                break;
        }
        int A0F = C51968G9o.A0F(str, intValue);
        C74438Put put = this.A00;
        int i = 0;
        int A09 = ((AnonymousClass7TF.A09(this.A06, (((((((AnonymousClass7TF.A08(put.Aqe(), A0F) + C69730NrF.A00(put.Aqk())) * 31) + C51971G9r.A0E(this.A03)) * 31) + JTR.A0G(this.A04)) * 31) + JTR.A0G(this.A05)) * 31) * 31) + JTR.A0G(this.A07)) * 31;
        String str2 = this.A08;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return A09 + i;
    }

    public N36(C74438Put put, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass7TG.A1O(num, put);
        this.A01 = num;
        this.A00 = put;
        this.A03 = l;
        this.A05 = str;
        this.A04 = str2;
        this.A07 = str3;
        this.A06 = z;
        this.A02 = num2;
        this.A08 = str4;
    }
}
