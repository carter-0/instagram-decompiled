package X;

public final class BDt extends AnonymousClass0T0 implements JRV {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BDt) {
                BDt bDt = (BDt) obj;
                if (!0qQ.A0K(this.A00, bDt.A00) || !0qQ.A0K(this.A01, bDt.A01) || !0qQ.A0K(this.A02, bDt.A02) || !0qQ.A0K(this.A03, bDt.A03) || !0qQ.A0K(this.A04, bDt.A04) || !0qQ.A0K(this.A05, bDt.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A05);
    }

    public BDt(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.A00 = bool;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }
}
