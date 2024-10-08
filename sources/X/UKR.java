package X;

public final class UKR extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKR) {
                UKR ukr = (UKR) obj;
                if (!(this.A05 == ukr.A05 && this.A04 == ukr.A04 && Float.compare(this.A01, ukr.A01) == 0 && Float.compare(this.A02, ukr.A02) == 0 && Float.compare(this.A03, ukr.A03) == 0 && Float.compare(this.A00, ukr.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(((this.A05 * 31) + this.A04) * 31, this.A01), this.A02), this.A03) + Float.floatToIntBits(this.A00);
    }

    public UKR(float f, float f2, int i, float f3, int i2, float f4) {
        this.A05 = i;
        this.A04 = i2;
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A00 = f4;
    }
}
