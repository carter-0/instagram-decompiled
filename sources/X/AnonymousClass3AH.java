package X;

/* renamed from: X.3AH  reason: invalid class name */
public final class AnonymousClass3AH {
    public double A00;
    public boolean A01;
    public boolean A02;
    public final String A03;

    public final void A00(double d, boolean z) {
        boolean z2 = true;
        if (!this.A02) {
            if (d >= 1.0d) {
                1Jk.A08.A0K(this.A03, 1Jk.A00().A01);
            }
            if (!this.A01 && z) {
                1Jk.A09(this.A03);
            }
            this.A00 = d;
            this.A01 = z;
        }
        z2 = false;
        if (d == 0.0d) {
            1Jk.A08(this.A03);
        }
        1Jk.A09(this.A03);
        this.A00 = d;
        this.A01 = z;
        this.A02 = z2;
        1Jk.A09(this.A03);
        this.A00 = d;
        this.A01 = z;
    }

    public AnonymousClass3AH(String str) {
        this.A03 = str;
    }
}
