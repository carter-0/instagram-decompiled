package X;

public final class AgC implements C315616kD {
    public final int A00;
    public final Object A01;

    public AgC(AnonymousClass8WJ r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void DaF(C294975nL r15, float f) {
        float f2;
        int i = this.A00;
        AnonymousClass8WJ r3 = (AnonymousClass8WJ) this.A01;
        float f3 = f;
        if (i != 0) {
            f2 = 1.0f - f;
        } else {
            double d = (double) f3;
            if (d >= 0.25d) {
                f2 = (float) AnonymousClass37Q.A04(d - 0.25d, 0.0d, 1.0d - 0.25d, 0.0d, 1.0d);
            } else {
                f2 = 0.0f;
            }
        }
        r3.Cxf(f2, -16777216);
    }
}
