package X;

public final class N2V extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N2V) {
                N2V n2v = (N2V) obj;
                if (!(this.A00 == n2v.A00 && this.A01 == n2v.A01 && this.A02 == n2v.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + C51968G9o.A03(this.A02);
    }

    public N2V(int i, int i2, long j) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }
}
