package X;

public final class OMM {
    public final double A00;
    public final double A01;

    public final double A00() {
        return this.A00;
    }

    public final double A01() {
        return this.A01;
    }

    public OMM(double d, double d2) {
        this.A01 = d;
        this.A00 = d2;
    }
}
