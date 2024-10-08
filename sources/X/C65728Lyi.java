package X;

/* renamed from: X.Lyi  reason: case insensitive filesystem */
public final class C65728Lyi implements C315616kD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C256003v4 A02;

    public C65728Lyi(C256003v4 r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void DaF(C294975nL r8, float f) {
        C256003v4 r6 = this.A02;
        float f2 = (float) this.A00;
        float f3 = 1.0f - 0.0f;
        float f4 = ((float) this.A01) - f2;
        float f5 = 0.0f;
        if (f3 != 0.0f) {
            f5 = (f - 0.0f) / f3;
        }
        r6.A00((int) ((f5 * f4) + f2));
    }
}
