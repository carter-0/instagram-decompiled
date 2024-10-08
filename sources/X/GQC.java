package X;

public final class GQC implements JSe {
    public final int A00;
    public final int A01;
    public final JNL A02;

    public static GQC A00(int i, int i2) {
        return new GQC(C52518GVv.A01, i, i2);
    }

    public static GQC A01(JNL jnl, int i, int i2) {
        return new GQC(jnl, i, i2);
    }

    public final /* bridge */ /* synthetic */ C3026164i FMw(C287805an r5) {
        return new C21077XDq(this.A02, this.A01, this.A00);
    }

    public final /* bridge */ /* synthetic */ C59660JSf FMx(C287805an r5) {
        return new C21077XDq(this.A02, this.A01, this.A00);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GQC)) {
            return false;
        }
        GQC gqc = (GQC) obj;
        if (gqc.A01 == this.A01 && gqc.A00 == this.A00) {
            return C51971G9r.A1Z(gqc.A02, this.A02, false);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, this.A01 * 31) + this.A00;
    }

    public GQC(JNL jnl, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = jnl;
    }

    public GQC() {
        this(C52518GVv.A01, 300, 0);
    }
}
