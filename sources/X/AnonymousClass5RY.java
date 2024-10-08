package X;

/* renamed from: X.5RY  reason: invalid class name */
public final class AnonymousClass5RY {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5RY) {
                AnonymousClass5RY r7 = (AnonymousClass5RY) obj;
                if (!(Double.compare(this.A04, r7.A04) == 0 && Double.compare(this.A00, r7.A00) == 0 && Double.compare(this.A01, r7.A01) == 0 && Double.compare(this.A02, r7.A02) == 0 && Double.compare(this.A03, r7.A03) == 0 && Double.compare(0.0d, 0.0d) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A002 = C51968G9o.A03(Double.doubleToLongBits(0.0d));
        return (((((((((((C51968G9o.A03(Double.doubleToLongBits(this.A04)) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A01))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A02))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A03))) * 31) + A002) * 31) + A002;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransferParameters(gamma=");
        sb.append(this.A04);
        sb.append(", a=");
        sb.append(this.A00);
        sb.append(", b=");
        sb.append(this.A01);
        sb.append(", c=");
        sb.append(this.A02);
        sb.append(", d=");
        sb.append(this.A03);
        sb.append(", e=");
        sb.append(0.0d);
        sb.append(", f=");
        sb.append(0.0d);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass5RY(double d, double d2, double d3, double d4, double d5) {
        this.A04 = d;
        this.A00 = d2;
        this.A01 = d3;
        this.A02 = d4;
        this.A03 = d5;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(0.0d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        } else if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException(002.A0M("Parameter d must be in the range [0..1], was ", d5));
        } else if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        } else if (d5 >= 1.0d && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        } else if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        } else if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        } else if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
