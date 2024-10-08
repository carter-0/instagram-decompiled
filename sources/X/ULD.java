package X;

public final class ULD extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final int A05;

    public ULD(int i) {
        int i2;
        this.A05 = i;
        if (i != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.A05 = i2;
        if (i2 != 0) {
            this.A02 = 0;
            this.A00 = 0;
            this.A03 = 0;
            this.A01 = 0;
        } else {
            this.A03 = 0;
            this.A00 = 0;
            this.A01 = 0;
            this.A02 = 0;
        }
        this.A04 = false;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        switch (this.A05) {
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ULD) {
                    ULD uld = (ULD) obj;
                    if (uld.A05 == 1 && this.A02 == uld.A02 && this.A00 == uld.A00 && this.A03 == uld.A03 && this.A01 == uld.A01) {
                        i = this.A04;
                        i2 = uld.A04;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ULD) {
                    ULD uld2 = (ULD) obj;
                    if (uld2.A05 == 2 && this.A00 == uld2.A00 && this.A01 == uld2.A01 && this.A04 == uld2.A04 && this.A02 == uld2.A02) {
                        i = this.A03;
                        i2 = uld2.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                return super.equals(obj);
        }
        if (i != i2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        switch (this.A05) {
            case 1:
                i = ((((((this.A02 * 31) + this.A00) * 31) + this.A03) * 31) + this.A01) * 31;
                i2 = 1237;
                if (this.A04) {
                    i2 = 1231;
                    break;
                }
                break;
            case 2:
                i = (AnonymousClass7TF.A09(this.A04, ((this.A00 * 31) + this.A01) * 31) + this.A02) * 31;
                i2 = this.A03;
                break;
            default:
                return super.hashCode();
        }
        return i + i2;
    }

    public ULD(boolean z, int i, int i2, int i3, int i4) {
        this.A05 = 2;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
        this.A02 = i3;
        this.A03 = i4;
    }
}
