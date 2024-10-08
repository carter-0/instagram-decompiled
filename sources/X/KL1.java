package X;

public final class KL1 extends C62754Kls {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KL1) {
                KL1 kl1 = (KL1) obj;
                if (!(this.A00 == kl1.A00 && this.A01 == kl1.A01 && this.A02 == kl1.A02 && this.A03 == kl1.A03 && this.A07 == kl1.A07 && this.A05 == kl1.A05 && this.A04 == kl1.A04 && this.A06 == kl1.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A06, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A07, ((((((this.A00 * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31))));
    }

    public KL1(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A07 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A06 = z4;
    }
}
