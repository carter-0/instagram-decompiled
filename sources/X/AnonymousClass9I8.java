package X;

/* renamed from: X.9I8  reason: invalid class name */
public final class AnonymousClass9I8 extends AnonymousClass0T0 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public AnonymousClass9I8(boolean z, boolean z2, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = z;
                this.A02 = z2;
                return;
            default:
                this.A02 = z;
                this.A01 = z2;
                return;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9I8) {
                    AnonymousClass9I8 r3 = (AnonymousClass9I8) obj;
                    if (r3.A00 == 2 && this.A02 == r3.A02) {
                        z = this.A01;
                        z2 = r3.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!(obj instanceof AnonymousClass9I8)) {
            return false;
        }
        AnonymousClass9I8 r32 = (AnonymousClass9I8) obj;
        if (r32.A00 != i || this.A01 != r32.A01) {
            return false;
        }
        z = this.A02;
        z2 = r32.A02;
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        boolean z;
        if (2 - this.A00 != 0) {
            int i2 = 1237;
            if (this.A01) {
                i2 = 1231;
            }
            i = i2 * 31;
            z = this.A02;
        } else {
            int i3 = 1237;
            if (this.A02) {
                i3 = 1231;
            }
            i = i3 * 31;
            z = this.A01;
        }
        int i4 = 1237;
        if (z) {
            i4 = 1231;
        }
        return i + i4;
    }
}
