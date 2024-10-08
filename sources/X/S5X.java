package X;

public final class S5X {
    public double A00 = 0.0d;
    public double A01 = 0.0d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S5X) {
                S5X s5x = (S5X) obj;
                if (!(Double.compare(this.A00, s5x.A00) == 0 && Double.compare(this.A01, s5x.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C51968G9o.A03(Double.doubleToLongBits(this.A00)) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A01));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PhysicsState(position=");
        A1A.append(this.A00);
        A1A.append(C273654mx.A00(456));
        A1A.append(this.A01);
        return AnonymousClass7TG.A0p(A1A);
    }
}
