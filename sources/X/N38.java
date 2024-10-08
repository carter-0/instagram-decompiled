package X;

public final class N38 extends AnonymousClass0T0 {
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N38) {
                N38 n38 = (N38) obj;
                if (!0qQ.A0K(this.A05, n38.A05) || !0qQ.A0K(this.A04, n38.A04) || !0qQ.A0K(this.A03, n38.A03) || !0qQ.A0K(this.A06, n38.A06) || !0qQ.A0K(this.A01, n38.A01) || !0qQ.A0K(this.A02, n38.A02) || !0qQ.A0K(this.A07, n38.A07) || !0qQ.A0K(this.A00, n38.A00) || !0qQ.A0K(this.A08, n38.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((AnonymousClass7TE.A0O(this.A05) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A08);
    }

    public N38(Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A06 = str4;
        this.A01 = num;
        this.A02 = num2;
        this.A07 = str5;
        this.A00 = bool;
        this.A08 = str6;
    }
}
