package X;

/* renamed from: X.52c  reason: invalid class name and case insensitive filesystem */
public final class C2805052c {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2805052c) {
                C2805052c r5 = (C2805052c) obj;
                if (!(this.A00 == r5.A00 && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A00;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.A03;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A01;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        if (!this.A02) {
            i = 0;
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NetworkState(isConnected=");
        sb.append(this.A00);
        sb.append(", isValidated=");
        sb.append(this.A03);
        sb.append(", isMetered=");
        sb.append(this.A01);
        sb.append(", isNotRoaming=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C2805052c(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }
}
