package X;

/* renamed from: X.Glb  reason: case insensitive filesystem */
public final class C53289Glb extends AnonymousClass0T0 {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final int A04;
    public final int A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53289Glb) {
                C53289Glb glb = (C53289Glb) obj;
                if (!(this.A05 == glb.A05 && this.A04 == glb.A04 && Double.compare(this.A00, glb.A00) == 0 && Double.compare(this.A02, glb.A02) == 0 && Double.compare(this.A03, glb.A03) == 0 && Double.compare(this.A01, glb.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((this.A05 * 31) + this.A04) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A02))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A03))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A01));
    }

    public C53289Glb(double d, double d2, double d3, double d4, int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
        this.A00 = d;
        this.A02 = d2;
        this.A03 = d3;
        this.A01 = d4;
    }
}
