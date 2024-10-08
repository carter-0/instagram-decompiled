package X;

/* renamed from: X.UKa  reason: case insensitive filesystem */
public final class C15021UKa extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15021UKa) {
                C15021UKa uKa = (C15021UKa) obj;
                if (!(this.A03 == uKa.A03 && this.A04 == uKa.A04 && this.A05 == uKa.A05 && this.A01 == uKa.A01 && Float.compare(this.A00, uKa.A00) == 0 && this.A06 == uKa.A06 && this.A02 == uKa.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A00(((((((this.A03 * 31) + this.A04) * 31) + this.A05) * 31) + this.A01) * 31, this.A00)) + this.A02;
    }

    public C15021UKa(float f, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A03 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A01 = i4;
        this.A00 = f;
        this.A06 = z;
        this.A02 = i5;
    }
}
