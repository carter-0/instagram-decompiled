package X;

public final class AD5 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public AD5(float f, float f2, float f3, float f4) {
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
    }

    public AD5() {
        this(0.0f, 0.0f, 1.0f, 0.0f);
    }
}
