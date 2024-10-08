package X;

public final class KK5 extends HPK {
    public final C8917RFk A00;
    public final String A01;

    public KK5(C8917RFk rFk, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = rFk;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KK5) {
                KK5 kk5 = (KK5) obj;
                if (!0qQ.A0K(this.A01, kk5.A01) || this.A00 != kk5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }
}
