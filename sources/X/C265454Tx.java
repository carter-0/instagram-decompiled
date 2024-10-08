package X;

/* renamed from: X.4Tx  reason: invalid class name and case insensitive filesystem */
public final class C265454Tx {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;

    public final String toString() {
        return 002.A0t("{avg=", AnonymousClass000.A00(405), "%}", Math.round(this.A03), Math.round(this.A02 * 100.0d));
    }

    public C265454Tx(double d, double d2, double d3) {
        double d4;
        this.A03 = d;
        this.A00 = d2;
        this.A01 = d3;
        if (d > 0.0d) {
            d4 = d2 / d;
        } else {
            d4 = -1.0d;
        }
        this.A02 = d4;
    }
}
