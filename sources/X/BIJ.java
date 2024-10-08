package X;

public final class BIJ extends AnonymousClass0T0 implements C281925Ac {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public BIJ(String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str5, 5);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIJ) {
                BIJ bij = (BIJ) obj;
                if (!0qQ.A0K(this.A00, bij.A00) || !0qQ.A0K(this.A01, bij.A01) || !0qQ.A0K(this.A02, bij.A02) || !0qQ.A0K(this.A03, bij.A03) || !0qQ.A0K(this.A04, bij.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A04, ((((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03)) * 31);
    }
}
