package X;

public final class ADA {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final boolean A05;
    public final boolean A06;

    public ADA() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255, false, false);
    }

    public /* synthetic */ ADA(float f, float f2, float f3, float f4, float f5, int i, boolean z, boolean z2) {
        f = (i & 1) != 0 ? 0.0f : f;
        f2 = (i & 2) != 0 ? 0.0f : f2;
        float f6 = 1.0f;
        f3 = (i & 4) != 0 ? 1.0f : f3;
        f4 = (i & 8) != 0 ? 1.0f : f4;
        boolean z3 = false;
        z = (i & 16) != 0 ? false : z;
        z3 = (i & 32) == 0 ? z2 : z3;
        f6 = (i & 128) == 0 ? f5 : f6;
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A04 = f4;
        this.A05 = z;
        this.A06 = z3;
        this.A00 = f6;
    }
}
