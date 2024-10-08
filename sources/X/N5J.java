package X;

public final class N5J extends AnonymousClass0T0 implements C74531PwQ {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N5J) {
                N5J n5j = (N5J) obj;
                if (!0qQ.A0K(this.A01, n5j.A01) || !0qQ.A0K(this.A00, n5j.A00) || !0qQ.A0K(this.A02, n5j.A02) || !0qQ.A0K(this.A04, n5j.A04) || !0qQ.A0K(this.A03, n5j.A03) || !0qQ.A0K(this.A05, n5j.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A05);
    }

    public N5J(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A05 = str5;
    }
}
