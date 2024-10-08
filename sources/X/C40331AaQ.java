package X;

/* renamed from: X.AaQ  reason: case insensitive filesystem */
public final class C40331AaQ implements B2Z {
    public final float A00;
    public final float A01;

    public C40331AaQ(int i, int i2) {
        float f = ((((float) i) * 0.5f) / 0.5625f) / ((float) i2);
        this.A00 = f;
        this.A01 = (1.0f - f) / 2.0f;
    }

    public final float BpX() {
        return 0.5f;
    }

    public final float BpY() {
        return this.A00;
    }

    public final float C9d() {
        return this.A01;
    }
}
