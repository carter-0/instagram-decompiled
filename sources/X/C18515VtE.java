package X;

/* renamed from: X.VtE  reason: case insensitive filesystem */
public final class C18515VtE {
    public static final C18515VtE A0A;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float[] A09;

    static {
        float f;
        float f2;
        float f3;
        float[] fArr = C18408VrA.A00;
        float pow = ((float) Math.pow((50.0d + 16.0d) / 116.0d, 3.0d)) * 100.0f;
        float f4 = (float) ((((double) pow) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C18408VrA.A03;
        float f5 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f6 = fArr[1];
        float f7 = fArr[2];
        float f8 = (fArr3[0] * f5) + (fArr3[1] * f6) + (fArr3[2] * f7);
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[0] * f5) + (fArr4[1] * f6) + (fArr4[2] * f7);
        float[] fArr5 = fArr2[2];
        float f10 = (f5 * fArr5[0]) + (f6 * fArr5[1]) + (f7 * fArr5[2]);
        float f11 = (2.0f / 10.0f) + 0.8f;
        if (((double) f11) >= 0.9d) {
            f = (f11 - 0.9f) * 10.0f;
            f2 = 0.59f;
            f3 = 0.69f;
        } else {
            f = (f11 - 0.8f) * 10.0f;
            f2 = 0.525f;
            f3 = 0.59f;
        }
        float f12 = f2 + ((f3 - f2) * f);
        float exp = (1.0f - (((float) Math.exp((double) (((-f4) - 42.0f) / 92.0f))) * 0.2777778f)) * f11;
        double d = (double) exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp};
        float f13 = 1.0f / ((5.0f * f4) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float cbrt = (f14 * f4) + (0.1f * f15 * f15 * ((float) Math.cbrt(((double) f4) * 5.0d)));
        float f16 = pow / fArr[1];
        double d2 = (double) f16;
        float pow2 = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow3 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f10)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f8)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f9)) / 100.0d, 0.42d), pow3};
        float f17 = fArr7[0];
        float f18 = (f17 * 400.0f) / (f17 + 27.13f);
        float f19 = fArr7[1];
        float[] fArr8 = fArr6;
        float f20 = f16;
        A0A = new C18515VtE(fArr8, f20, ((f18 * 2.0f) + ((f19 * 400.0f) / (f19 + 27.13f)) + (((400.0f * pow3) / (pow3 + 27.13f)) * 0.05f)) * pow2, pow2, pow2, f12, f11, cbrt, (float) Math.pow((double) cbrt, 0.25d), ((float) Math.sqrt(d2)) + 1.48f);
    }

    public C18515VtE(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.A04 = f;
        this.A00 = f2;
        this.A05 = f3;
        this.A07 = f4;
        this.A01 = f5;
        this.A06 = f6;
        this.A09 = fArr;
        this.A02 = f7;
        this.A03 = f8;
        this.A08 = f9;
    }
}
