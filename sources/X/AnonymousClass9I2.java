package X;

/* renamed from: X.9I2  reason: invalid class name */
public final class AnonymousClass9I2 extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public final int A07;

    public AnonymousClass9I2(int i) {
        int i2;
        this.A07 = i;
        if (i != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.A07 = i2;
        if (i2 != 0) {
            this.A04 = 0;
            this.A01 = 0;
            this.A03 = 0;
            this.A02 = 0;
            this.A06 = 0;
            this.A05 = 0;
        } else {
            this.A06 = 0;
            this.A03 = 0;
            this.A02 = 0;
            this.A05 = 0;
            this.A04 = 0;
            this.A01 = 0;
        }
        this.A00 = 0;
    }

    public final boolean equals(Object obj) {
        if (this.A07 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9I2)) {
            return false;
        }
        AnonymousClass9I2 r3 = (AnonymousClass9I2) obj;
        if (r3.A07 == 0 && this.A06 == r3.A06 && this.A03 == r3.A03 && this.A02 == r3.A02 && this.A05 == r3.A05 && this.A04 == r3.A04 && this.A01 == r3.A01 && this.A00 == r3.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A07 != 0) {
            return super.hashCode();
        }
        return (((((((((((this.A06 * 31) + this.A03) * 31) + this.A02) * 31) + this.A05) * 31) + this.A04) * 31) + this.A01) * 31) + this.A00;
    }
}
