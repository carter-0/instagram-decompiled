package X;

public final class GO6 extends AnonymousClass0T0 {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final int A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GO6) {
                GO6 go6 = (GO6) obj;
                if (!(Double.compare(this.A04, go6.A04) == 0 && this.A05 == go6.A05 && Double.compare(this.A03, go6.A03) == 0 && Double.compare(this.A01, go6.A01) == 0 && Double.compare(this.A00, go6.A00) == 0 && Double.compare(this.A02, go6.A02) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((C51968G9o.A03(Double.doubleToLongBits(this.A04)) * 31) + this.A05) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A03))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A01))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A02));
    }

    public GO6(double d, double d2, double d3, double d4, double d5, int i) {
        this.A04 = d;
        this.A05 = i;
        this.A03 = d2;
        this.A01 = d3;
        this.A00 = d4;
        this.A02 = d5;
    }
}
