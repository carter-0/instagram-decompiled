package X;

public final class N5I extends AnonymousClass0T0 implements C74530PwP {
    public final int A00;
    public final Boolean A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Boolean A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N5I) {
                N5I n5i = (N5I) obj;
                if (!0qQ.A0K(this.A0A, n5i.A0A) || !0qQ.A0K(this.A0B, n5i.A0B) || !0qQ.A0K(this.A03, n5i.A03) || !0qQ.A0K(this.A04, n5i.A04) || !0qQ.A0K(this.A01, n5i.A01) || !0qQ.A0K(this.A02, n5i.A02) || !0qQ.A0K(this.A08, n5i.A08) || this.A00 != n5i.A00 || !0qQ.A0K(this.A05, n5i.A05) || !0qQ.A0K(this.A06, n5i.A06) || !0qQ.A0K(this.A09, n5i.A09) || !0qQ.A0K(this.A07, n5i.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public N5I(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        DbW.A1P(str6, 10, str7);
        this.A0A = str;
        this.A0B = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A01 = bool;
        this.A02 = bool2;
        this.A08 = bool3;
        this.A00 = i;
        this.A05 = str5;
        this.A06 = str6;
        this.A09 = num;
        this.A07 = str7;
    }

    public final int hashCode() {
        String str = this.A06;
        return C41845B3m.A01(this.A07, (AnonymousClass7TF.A08(str, ((((((((((((((((AnonymousClass7TG.A0E(this.A0A) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A09)) * 31);
    }
}
