package X;

/* renamed from: X.64r  reason: invalid class name and case insensitive filesystem */
public final class C3026464r {
    public double A00;
    public double A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3026464r) {
                C3026464r r7 = (C3026464r) obj;
                if (!(Double.compare(this.A01, r7.A01) == 0 && Double.compare(this.A00, r7.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C51968G9o.A03(Double.doubleToLongBits(this.A01)) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComplexDouble(_real=");
        sb.append(this.A01);
        sb.append(", _imaginary=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
