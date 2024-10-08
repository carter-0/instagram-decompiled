package X;

/* renamed from: X.7pL  reason: invalid class name and case insensitive filesystem */
public final class C342897pL implements C3502283u {
    public boolean A00;
    public final B1Q A01;

    public final void DHa(float f, float f2) {
        boolean z = true;
        if ((f == 1.0f && !this.A00) || (f == 0.0f && this.A00)) {
            if (f != 1.0f) {
                z = false;
            }
            this.A00 = z;
            this.A01.DHb(z);
        }
    }

    public C342897pL(B1Q b1q) {
        this.A01 = b1q;
    }
}
