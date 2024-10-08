package X;

/* renamed from: X.9Ia  reason: invalid class name and case insensitive filesystem */
public final class C376449Ia extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;

    public C376449Ia(AnonymousClass9IE r1, C262744Fv r2, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = r2;
        this.A01 = r1;
    }

    public final boolean equals(Object obj) {
        int i;
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
                if (!(obj instanceof C376449Ia)) {
                    return false;
                }
                C376449Ia r3 = (C376449Ia) obj;
                if (r3.A00 == 2 && this.A03 == r3.A03 && this.A02 == r3.A02 && this.A01 == r3.A01 && this.A04 == r3.A04) {
                    return true;
                }
                return false;
        }
        if (!(obj instanceof C376449Ia)) {
            return false;
        }
        C376449Ia r32 = (C376449Ia) obj;
        if (r32.A00 == i && this.A04 == r32.A04 && this.A03 == r32.A03 && 0qQ.A0K(this.A02, r32.A02) && 0qQ.A0K(this.A01, r32.A01)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        if (2 - this.A00 != 0) {
            int i2 = 1237;
            if (this.A04) {
                i2 = 1231;
            }
            int i3 = i2 * 31;
            int i4 = 1237;
            if (this.A03) {
                i4 = 1231;
            }
            int i5 = (i3 + i4) * 31;
            Object obj = this.A02;
            if (obj == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj.hashCode();
            }
            hashCode = (i5 + hashCode2) * 31;
            i = this.A01.hashCode();
        } else {
            int i6 = 1237;
            if (this.A03) {
                i6 = 1231;
            }
            hashCode = ((((i6 * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31;
            i = 1237;
            if (this.A04) {
                i = 1231;
            }
        }
        return hashCode + i;
    }

    public C376449Ia(C257183wz r2, C257183wz r3, boolean z, boolean z2) {
        this.A00 = 2;
        this.A03 = z;
        this.A02 = r2;
        this.A01 = r3;
        this.A04 = z2;
    }
}
