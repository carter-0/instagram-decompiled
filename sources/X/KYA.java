package X;

public final class KYA extends C64185LSs {
    public final C61079JwH A00;
    public final C62230ry A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KYA) {
                KYA kya = (KYA) obj;
                if (!0qQ.A0K(this.A00, kya.A00) || !0qQ.A0K(this.A01, kya.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + this.A01.hashCode();
    }

    public KYA(C61079JwH jwH, C62230ry r2) {
        this.A00 = jwH;
        this.A01 = r2;
    }

    public final String toString() {
        return 002.A0u(super.toString(), ": { ", this.A00.A02, " }");
    }
}
