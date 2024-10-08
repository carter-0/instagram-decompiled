package X;

public final class ARJ implements B3M {
    public final C39649A3p A00;
    public final A58 A01;
    public final float[] A02;
    public final float[] A03;

    public final float[] C5o() {
        return this.A02;
    }

    public final float[] CDl() {
        return this.A03;
    }

    public ARJ(Integer num, float f, int i, int i2) {
        A58 a58 = new A58(num, i, i2);
        this.A01 = a58;
        B2Z b2z = a58.A01;
        float f2 = f;
        C39649A3p a3p = new C39649A3p(f2, b2z.BpX(), b2z.BpY(), i, i2);
        this.A00 = a3p;
        this.A03 = a58.A00.A01;
        this.A02 = a3p.A00.A01;
    }
}
