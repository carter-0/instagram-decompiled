package X;

public final class N2U extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N2U) {
                N2U n2u = (N2U) obj;
                if (!(this.A01 == n2u.A01 && this.A00 == n2u.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51975G9x.A03(this.A01) + this.A00;
    }

    public N2U(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }
}
