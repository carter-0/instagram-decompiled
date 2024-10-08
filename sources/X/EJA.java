package X;

public final class EJA extends ExY {
    public final C51151FpN A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJA) {
                EJA eja = (EJA) obj;
                if (!0qQ.A0K(this.A01, eja.A01) || !0qQ.A0K(this.A00, eja.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJA(C51151FpN fpN, String str) {
        super(2FW.A0w, str);
        this.A01 = str;
        this.A00 = fpN;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
