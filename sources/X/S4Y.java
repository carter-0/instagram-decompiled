package X;

public final class S4Y {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public S4Y(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S4Y) {
                S4Y s4y = (S4Y) obj;
                if (!(this.A00 == s4y.A00 && this.A01 == s4y.A01 && this.A02 == s4y.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return C11367SPk.A00(C11367SPk.A00(i + 31, this.A01), this.A02);
    }
}
