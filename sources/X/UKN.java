package X;

public final class UKN extends AnonymousClass0T0 {
    public final double A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKN) {
                UKN ukn = (UKN) obj;
                if (!0qQ.A0K(this.A04, ukn.A04) || !0qQ.A0K(this.A03, ukn.A03) || Double.compare(this.A00, ukn.A00) != 0 || !0qQ.A0K(this.A02, ukn.A02) || !0qQ.A0K(this.A01, ukn.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A01);
    }

    public UKN(String str, String str2, String str3, String str4, double d) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = d;
        this.A02 = str3;
        this.A01 = str4;
    }
}
