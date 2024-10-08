package X;

public final class GOD extends AnonymousClass0T0 {
    public final double A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GOD) {
                GOD god = (GOD) obj;
                if (!(Double.compare(this.A00, god.A00) == 0 && this.A01 == god.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, C51968G9o.A03(Double.doubleToLongBits(this.A00)) * 31);
    }

    public GOD(double d, boolean z) {
        this.A00 = d;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FanOutMenuButtonLayout(centerAngle=");
        A1A.append(this.A00);
        A1A.append(", shouldFlipButtons=");
        return G9t.A1C(A1A, this.A01);
    }
}
