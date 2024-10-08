package X;

/* renamed from: X.9IB  reason: invalid class name */
public final class AnonymousClass9IB extends AnonymousClass0T0 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass9IB(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        if (i != 0) {
            this.A04 = z;
            this.A01 = z2;
        } else {
            this.A01 = z;
            this.A04 = z2;
        }
        this.A03 = z3;
        this.A02 = z4;
    }

    public final boolean equals(Object obj) {
        AnonymousClass9IB r3;
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass9IB)) {
                return false;
            }
            r3 = (AnonymousClass9IB) obj;
            if (r3.A00 != 1 || this.A04 != r3.A04) {
                return false;
            }
            z = this.A01;
            z2 = r3.A01;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof AnonymousClass9IB)) {
                return false;
            }
            r3 = (AnonymousClass9IB) obj;
            if (r3.A00 != 0 || this.A01 != r3.A01) {
                return false;
            }
            z = this.A04;
            z2 = r3.A04;
        }
        if (z == z2 && this.A03 == r3.A03 && this.A02 == r3.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        boolean z;
        if (this.A00 != 0) {
            int i2 = 1237;
            if (this.A04) {
                i2 = 1231;
            }
            i = i2 * 31;
            z = this.A01;
        } else {
            int i3 = 1237;
            if (this.A01) {
                i3 = 1231;
            }
            i = i3 * 31;
            z = this.A04;
        }
        int i4 = 1237;
        if (z) {
            i4 = 1231;
        }
        int i5 = (i + i4) * 31;
        int i6 = 1237;
        if (this.A03) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A02) {
            i8 = 1231;
        }
        return i7 + i8;
    }
}
