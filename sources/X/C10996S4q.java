package X;

/* renamed from: X.S4q  reason: case insensitive filesystem */
public final class C10996S4q {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C10996S4q(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10996S4q) {
                C10996S4q s4q = (C10996S4q) obj;
                if (!(this.A00 == s4q.A00 && this.A01 == s4q.A01 && this.A02 == s4q.A02 && this.A03 == s4q.A03 && this.A04 == s4q.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return C11367SPk.A00(C11367SPk.A00(C11367SPk.A00(C11367SPk.A00(i + 31, this.A01), this.A02), this.A03), this.A04);
    }
}
