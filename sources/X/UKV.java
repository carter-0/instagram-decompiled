package X;

public final class UKV extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKV) {
                UKV ukv = (UKV) obj;
                if (!(this.A05 == ukv.A05 && this.A03 == ukv.A03 && this.A02 == ukv.A02 && this.A01 == ukv.A01 && this.A00 == ukv.A00 && this.A04 == ukv.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A03, C51965G9l.A05(this.A05));
        return DbS.A06(this.A04, (((AnonymousClass7TF.A09(this.A02, A09) + this.A01) * 31) + this.A00) * 31);
    }

    public UKV(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = z;
        this.A03 = z2;
        this.A02 = z3;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = z4;
    }
}
