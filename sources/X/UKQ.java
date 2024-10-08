package X;

public final class UKQ extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public UKQ(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A00 = i6;
        this.A04 = i;
        if (i6 != 0) {
            this.A02 = i2;
            this.A03 = i3;
            this.A05 = i4;
            this.A01 = i5;
            return;
        }
        this.A03 = i2;
        this.A05 = i3;
        this.A01 = i4;
        this.A02 = i5;
    }

    public final boolean equals(Object obj) {
        if (1 - this.A00 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UKQ)) {
            return false;
        }
        UKQ ukq = (UKQ) obj;
        if (ukq.A00 == 1 && this.A04 == ukq.A04 && this.A02 == ukq.A02 && this.A03 == ukq.A03 && this.A05 == ukq.A05 && this.A01 == ukq.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (1 - this.A00 != 0) {
            return super.hashCode();
        }
        return (((((((this.A04 * 31) + this.A02) * 31) + this.A03) * 31) + this.A05) * 31) + this.A01;
    }
}
