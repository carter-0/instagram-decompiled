package X;

/* renamed from: X.3Dw  reason: invalid class name and case insensitive filesystem */
public final class C238903Dw extends AnonymousClass0T0 {
    public final double A00;
    public final double A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C238903Dw) {
                C238903Dw r7 = (C238903Dw) obj;
                if (!(Double.compare(this.A01, r7.A01) == 0 && Double.compare(this.A00, r7.A00) == 0 && this.A02 == r7.A02 && this.A03 == r7.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((C51968G9o.A03(Double.doubleToLongBits(this.A01)) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31) + this.A02) * 31) + this.A03;
    }

    public C238903Dw(double d, double d2, int i, int i2) {
        this.A01 = d;
        this.A00 = d2;
        this.A02 = i;
        this.A03 = i2;
    }
}
