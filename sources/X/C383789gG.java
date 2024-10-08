package X;

/* renamed from: X.9gG  reason: invalid class name and case insensitive filesystem */
public final class C383789gG extends C282615Dy {
    public final double A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C383789gG)) {
            return false;
        }
        return Double.compare(this.A00, ((C383789gG) obj).A00) == 0;
    }

    public final String A06() {
        double d = this.A00;
        String[] strArr = 17g.A04;
        return Double.toString(d);
    }

    public final 16L A0B() {
        return 16L.A0H;
    }

    public final int A0C() {
        return (int) this.A00;
    }

    public final void EN9(17Z r3, C269504fE r4) {
        r3.A0e(this.A00);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A00);
        return ((int) doubleToLongBits) ^ ((int) (doubleToLongBits >> 32));
    }

    public C383789gG(double d) {
        this.A00 = d;
    }
}
