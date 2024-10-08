package X;

public final class N2d extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N2d) {
                N2d n2d = (N2d) obj;
                if (!(this.A00 == n2d.A00 && this.A01 == n2d.A01 && this.A02 == n2d.A02 && this.A03 == n2d.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A00 * 31) + this.A01) * 31) + this.A02) * 31) + this.A03;
    }

    public N2d(int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }
}
