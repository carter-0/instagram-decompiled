package X;

/* renamed from: X.8Pp  reason: invalid class name and case insensitive filesystem */
public final class C355338Pp extends C14001To3 {
    public final C355348Pq A00;

    public final void A03(float f) {
        this.A00.A01 = f * 62.5f;
    }

    public final boolean A07(long j) {
        C355348Pq r4 = this.A00;
        float f = this.A03;
        float f2 = this.A04;
        VQR vqr = r4.A02;
        float f3 = (float) j;
        float f4 = r4.A00;
        float exp = (float) (((double) f2) * Math.exp((double) ((f3 / 1000.0f) * f4)));
        vqr.A01 = exp;
        float f5 = f2 / f4;
        float exp2 = (float) (((double) (f - f5)) + (((double) f5) * Math.exp((double) ((f4 * f3) / 1000.0f))));
        vqr.A00 = exp2;
        float abs = Math.abs(exp);
        float f6 = r4.A01;
        if (abs < f6) {
            vqr.A01 = 0.0f;
            exp = 0.0f;
        }
        this.A03 = exp2;
        this.A04 = exp;
        float f7 = this.A01;
        float f8 = f7;
        if (exp2 >= f7) {
            f7 = this.A00;
            if (exp2 <= f7) {
                if (exp2 >= f7 || exp2 <= f8 || Math.abs(exp) < f6) {
                    return true;
                }
                return false;
            }
        }
        this.A03 = f7;
        return true;
    }

    public C355338Pp(V4M v4m, Object obj) {
        super(v4m, obj);
        C355348Pq r2 = new C355348Pq();
        this.A00 = r2;
        r2.A01 = this.A02 * 0.75f * 62.5f;
    }
}
