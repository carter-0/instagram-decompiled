package X;

/* renamed from: X.Glc  reason: case insensitive filesystem */
public final class C53290Glc extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;

    public C53290Glc(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A00 = i7;
        switch (i7) {
            case 0:
                this.A02 = i;
                this.A05 = i2;
                this.A06 = i3;
                this.A01 = i4;
                this.A03 = i5;
                this.A04 = i6;
                return;
            case 1:
                this.A06 = i;
                this.A04 = i2;
                this.A02 = i3;
                this.A05 = i4;
                this.A03 = i5;
                break;
            default:
                this.A06 = i;
                this.A02 = i2;
                this.A04 = i3;
                this.A03 = i4;
                this.A05 = i5;
                break;
        }
        this.A01 = i6;
    }

    public final boolean equals(Object obj) {
        if (1 - this.A00 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53290Glc)) {
            return false;
        }
        C53290Glc glc = (C53290Glc) obj;
        if (glc.A00 == 1 && this.A06 == glc.A06 && this.A04 == glc.A04 && this.A02 == glc.A02 && this.A05 == glc.A05 && this.A03 == glc.A03 && this.A01 == glc.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (1 - this.A00 != 0) {
            return super.hashCode();
        }
        return (((((((((this.A06 * 31) + this.A04) * 31) + this.A02) * 31) + this.A05) * 31) + this.A03) * 31) + this.A01;
    }
}
