package X;

public final class S4N {
    public final String A00;
    public final String A01;

    public S4N(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S4N) {
                S4N s4n = (S4N) obj;
                if (!0qQ.A0K(this.A00, s4n.A00) || !0qQ.A0K(this.A01, s4n.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C11367SPk.A01(this.A00) * 31) + C51971G9r.A0E(this.A01);
    }
}
