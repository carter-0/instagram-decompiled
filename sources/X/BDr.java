package X;

public final class BDr extends AnonymousClass0T0 implements C46226DRh {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final BDr F0Z() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BDr) {
                BDr bDr = (BDr) obj;
                if (!0qQ.A0K(this.A01, bDr.A01) || !0qQ.A0K(this.A02, bDr.A02) || !0qQ.A0K(this.A03, bDr.A03) || !0qQ.A0K(this.A04, bDr.A04) || !0qQ.A0K(this.A05, bDr.A05) || !0qQ.A0K(this.A06, bDr.A06) || !0qQ.A0K(this.A07, bDr.A07) || !0qQ.A0K(this.A00, bDr.A00) || !0qQ.A0K(this.A08, bDr.A08) || !0qQ.A0K(this.A09, bDr.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + C41845B3m.A00(this.A09);
    }

    public BDr(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A00 = l;
        this.A08 = str8;
        this.A09 = str9;
    }
}
