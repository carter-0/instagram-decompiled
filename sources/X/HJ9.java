package X;

public final class HJ9 extends HQB {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HJ9) {
                HJ9 hj9 = (HJ9) obj;
                if (!0qQ.A0K(this.A00, hj9.A00) || !0qQ.A0K(this.A01, hj9.A01) || !0qQ.A0K(this.A03, hj9.A03) || !0qQ.A0K(this.A02, hj9.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00)) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A02);
    }

    public HJ9(String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }
}
