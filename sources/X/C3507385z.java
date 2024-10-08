package X;

/* renamed from: X.85z  reason: invalid class name and case insensitive filesystem */
public final class C3507385z extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3507385z) {
                C3507385z r5 = (C3507385z) obj;
                if (!(Float.compare(this.A03, r5.A03) == 0 && Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A04, r5.A04) == 0 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A02, r5.A02) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.A03) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A04)) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02);
    }

    public C3507385z(float f, float f2, float f3, float f4, float f5) {
        this.A03 = f;
        this.A00 = f2;
        this.A04 = f3;
        this.A01 = f4;
        this.A02 = f5;
    }
}
