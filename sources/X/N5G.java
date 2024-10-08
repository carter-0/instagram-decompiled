package X;

public final class N5G extends AnonymousClass0T0 implements C21019X9x {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public N5G(Boolean bool, Long l, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str3, 5);
        this.A00 = l;
        this.A03 = bool;
        this.A01 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N5G) {
                N5G n5g = (N5G) obj;
                if (!0qQ.A0K(this.A00, n5g.A00) || !0qQ.A0K(this.A03, n5g.A03) || !0qQ.A0K(this.A01, n5g.A01) || !0qQ.A0K(this.A04, n5g.A04) || !0qQ.A0K(this.A02, n5g.A02) || !0qQ.A0K(this.A05, n5g.A05) || !0qQ.A0K(this.A06, n5g.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A02, ((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A06);
    }
}
