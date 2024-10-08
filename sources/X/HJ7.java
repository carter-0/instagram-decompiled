package X;

public final class HJ7 extends HQB {
    public final String A00;
    public final String A01;
    public final String A02;

    public HJ7(String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HJ7) {
                HJ7 hj7 = (HJ7) obj;
                if (!0qQ.A0K(this.A01, hj7.A01) || !0qQ.A0K(this.A02, hj7.A02) || !0qQ.A0K(this.A00, hj7.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A00);
    }
}
