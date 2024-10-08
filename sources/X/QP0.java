package X;

public final class QP0 extends AnonymousClass0T0 {
    public final double A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QP0) {
                QP0 qp0 = (QP0) obj;
                if (!(this.A02 == qp0.A02 && Double.compare(this.A00, qp0.A00) == 0 && this.A01 == qp0.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02 * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31) + this.A01;
    }

    public QP0(double d, int i, int i2) {
        this.A02 = i;
        this.A00 = d;
        this.A01 = i2;
    }

    public QP0() {
        this(0.0d, 10, 0);
    }
}
